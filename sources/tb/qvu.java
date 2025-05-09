package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710103);
    }

    public static bjd a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjd) ipChange.ipc$dispatch("3711a9f0", new Object[]{uINode});
        }
        if (uINode.getNodeType() == UINodeType.VIEW) {
            return null;
        }
        return new pvu(uINode);
    }
}
