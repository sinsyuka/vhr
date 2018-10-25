package com.syuka.vhr.api.service;


import com.syuka.vhr.api.model.MsgContent;
import com.syuka.vhr.api.model.SysMsg;

import java.util.List;

/**
 * Created by sang on 2018/2/2.
 */
public interface ISysMsgService {

    public boolean sendMsg(MsgContent msg);

    public List<SysMsg> getSysMsgByPage(Integer page, Integer size);

    public boolean markRead(Long flag);
}
