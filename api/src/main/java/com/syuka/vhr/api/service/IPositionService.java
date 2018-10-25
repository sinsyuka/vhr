package com.syuka.vhr.api.service;


import com.syuka.vhr.api.model.Position;

import java.util.List;

/**
 * Created by sang on 2018/1/10.
 */
public interface IPositionService {

    public int addPos(Position pos);

    public List<Position> getAllPos();

    public boolean deletePosById(String pids);

    public int updatePosById(Position position);

}
