package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.component.EmptyComponent;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465627);
    }

    public static boolean a(fsb fsbVar) {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b4d0836", new Object[]{fsbVar})).booleanValue();
        }
        if (fsbVar == null || (components = fsbVar.getComponents()) == null) {
            return false;
        }
        for (IDMComponent iDMComponent : components) {
            if (iDMComponent != null) {
                String h = ParseModule.h(iDMComponent);
                if (!"footer".equals(h) && !"header".equals(h)) {
                    return false;
                }
            }
        }
        components.add(new EmptyComponent());
        return true;
    }
}
