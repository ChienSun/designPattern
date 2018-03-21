package com.sj.dp.behavior.state;

import com.sj.dp.behavior.state.impl.Context;

/**
 *  状态接口
 */
public interface State {

   public void doAction(Context context);

}