package com.syuka.impl.mapper;

import com.syuka.vhr.api.dao.SysMsgDao;
import com.syuka.vhr.api.model.Hr;
import com.syuka.vhr.api.model.MsgContent;
import com.syuka.vhr.api.model.SysMsg;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sang on 2018/2/2.
 */
@Repository
public interface SysMsgMapper extends SysMsgDao {

    int sendMsg(MsgContent msg);

    int addMsg2AllHr(@Param("hrs") List<Hr> hrs, @Param("mid") Long mid);

    List<SysMsg> getSysMsg(@Param("start") int start, @Param("size") Integer size, @Param("hrid") Long hrid);

    int markRead(@Param("flag") Long flag, @Param("hrid") Long hrid);
}
