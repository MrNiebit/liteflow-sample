package cn.lacknb.liteflow.liteflowhello.flow;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

/**
 * <h2>  </h2>
 *
 * @description: 根据tag实现动态传值
 * @menu
 * @author: nbh
 * @description:
 * @date: 2024/11/13 14:01
 **/
@Component("tagSelect")
public class TagSelectCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        String tag = this.getTag();
        // 获取传进来的tag值
        System.out.println("tag: " + tag);
    }
}
