package cn.lacknb.liteflow.liteflowhello.flow;

import cn.lacknb.liteflow.liteflowhello.model.ContextRequest;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeIfComponent;

/**
 * @author gitsilence
 * @date 2023-07-02
 */
@LiteflowComponent(value = "if3", name = "if判断")
public class If3Cmp extends NodeIfComponent {
    @Override
    public boolean processIf() throws Exception {
        ContextRequest request = this.getRequestData();
        return "test".equals(request.getMsg());
    }
}
