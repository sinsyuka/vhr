package com.syuka.vhr.api.service;


import com.syuka.vhr.api.model.Hr;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
public interface IHrService extends UserDetailsService {


    public UserDetails loadUserByUsername(String s);

    public int hrReg(String username, String password);

    public List<Hr> getHrsByKeywords(String keywords);

    public int updateHr(Hr hr);

    public int updateHrRoles(Long hrId, Long[] rids);

    public Hr getHrById(Long hrId);

    public int deleteHr(Long hrId);

    public List<Hr> getAllHrExceptAdmin();

    public List<Hr> getAllHr();
}
