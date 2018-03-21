package com.sj.test.behavior;

import com.sj.dp.behavior.state.impl.Context;
import com.sj.dp.behavior.state.impl.StartState;
import com.sj.dp.behavior.state.impl.StopState;

/**
 *  状态模式测试
 */
public class StateTest {

   public static void main(String[] args) {
      // 创建上下文
      Context context = new Context();

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
   }
}