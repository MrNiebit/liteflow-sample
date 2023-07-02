package cn.lacknb.liteflow.liteflowhello.controller;

import cn.lacknb.liteflow.liteflowhello.model.ContextRequest;
import com.alibaba.fastjson2.JSON;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private FlowExecutor flowExecutor;

    @RequestMapping("/a")
    public String a(String chainName) {
        ContextRequest request = new ContextRequest();
        request.setCode(200);
        request.setMsg("test");
        request.setNow(new Date());
        LiteflowResponse resp = flowExecutor.execute2Resp(chainName, request, ContextRequest.class);
        return JSON.toJSONString(resp);
    }

}
