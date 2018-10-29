package com.syuka.vhr.service;

import com.syuka.vhr.api.dao.HrDao;
import com.syuka.vhr.api.model.Hr;
import com.syuka.vhr.api.service.IHrService;
import com.syuka.vhr.service.util.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
@Service
@Transactional
public class HrService implements IHrService {

    @Autowired
    private HrDao hrDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = hrDao.loadUserByUsername(s);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不对");
        }
        return hr;
    }

    public int hrReg(String username, String password) {
        //如果用户名存在，返回错误
        if (hrDao.loadUserByUsername(username) != null) {
            return -1;
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode(password);
        return hrDao.hrReg(username, encode);
    }

    public List<Hr> getHrsByKeywords(String keywords) {
        return hrDao.getHrsByKeywords(keywords);
    }

    public int updateHr(Hr hr) {
        return hrDao.updateHr(hr);
    }

    public int updateHrRoles(Long hrId, Long[] rids) {
        int i = hrDao.deleteRoleByHrId(hrId);
        return hrDao.addRolesForHr(hrId, rids);
    }

    public Hr getHrById(Long hrId) {
        return hrDao.getHrById(hrId);
    }

    public int deleteHr(Long hrId) {
        return hrDao.deleteHr(hrId);
    }

    public List<Hr> getAllHrExceptAdmin() {
        return hrDao.getAllHr(HrUtils.getCurrentHr().getId());
    }
    public List<Hr> getAllHr() {
        return hrDao.getAllHr(null);
    }
}
