package com.ballfuns.service;

import com.ballfuns.entity.Board_manager;

/**
 * Created by Revol on 2016/1/17.
 */
public interface Board_managerService {
    public Board_manager getManagerByBoardId(Board_manager board_manager,int board_id);
    public Board_manager getManagerByUserId(int user_id);

}
