package com.syuka.vhr.service;

import com.syuka.vhr.api.dao.SysMsgDao;
import com.syuka.vhr.api.model.Hr;
import com.syuka.vhr.api.model.MsgContent;
import com.syuka.vhr.api.model.SysMsg;
import com.syuka.vhr.service.util.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sang on 2018/2/2.
 */
@Service
@Transactional
public class SysMsgService {
    @Autowired
    SysMsgDao sysMsgDao;
    @Autowired
    HrService hrService;

    @PreAuthorize("hasRole('ROLE_admin')")//只有管理员可以发送系统消息
    public boolean sendMsg(MsgContent msg) {
        int result = sysMsgDao.sendMsg(msg);
        List<Hr> allHr = hrService.getAllHr();
        int result2 = sysMsgDao.addMsg2AllHr(allHr, msg.getId());
        return result2==allHr.size();
    }

    public List<SysMsg> getSysMsgByPage(Integer page, Integer size) {
        int start = (page - 1) * size;
        return sysMsgDao.getSysMsg(start,size, HrUtils.getCurrentHr().getId());
    }

    public boolean markRead(Long flag) {
        if (flag != -1) {
            return sysMsgDao.markRead(flag,HrUtils.getCurrentHr().getId())==1;
        }
        sysMsgDao.markRead(flag,HrUtils.getCurrentHr().getId());
        return true;
    }
}
