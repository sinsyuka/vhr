package com.syuka.impl.mapper;

import com.syuka.vhr.api.dao.PositionDao;
import com.syuka.vhr.api.model.Position;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sang on 2018/1/10.
 */
@Repository
public interface PositionMapper extends PositionDao {

    int addPos(@Param("pos") Position pos);

    Position getPosByName(String name);

    List<Position> getAllPos();

    int deletePosById(@Param("pids") String[] pids);

    int updatePosById(@Param("pos") Position position);
}
