package cn.lacknb.liteflow.liteflowhello.flow;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;

import java.util.Random;

/**
 * @author gitsilence
 * @date 2023-07-02
 */
@LiteflowComponent(value = "if1", name = "判断条件")
public class If1SwitchCmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws Exception {
        //模拟业务耗时
        int time = new Random().nextInt(1000);
        Thread.sleep(time);

        //这里写死跳到并行获取剩余量那条分支，你可以改成其他分支测试
        return "b";
    }
}
