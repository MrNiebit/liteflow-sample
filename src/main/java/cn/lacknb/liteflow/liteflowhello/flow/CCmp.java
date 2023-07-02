package cn.lacknb.liteflow.liteflowhello.flow;

import cn.lacknb.liteflow.liteflowhello.model.ContextRequest;
import com.alibaba.fastjson2.JSON;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.concurrent.TimeUnit;

/**
 * @author gitsilence
 * @date 2023-07-02
 */
@LiteflowComponent("c")
public class CCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        ContextRequest request = getRequestData();
        System.out.println(JSON.toJSONString(request));
        request.setCode(request.getCode() + 1);
        request.setMsg(request.getMsg() + "C");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("process C ~");
    }

}
