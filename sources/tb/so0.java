package tb;

import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class so0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989911);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7252d67a", new Object[]{this});
        }
        return null;
    }

    public AURAPluginContainerNodeModel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("e71b8fb8", new Object[]{this});
        }
        return null;
    }

    public HashMap<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e0df74e7", new Object[]{this});
        }
        return null;
    }

    public IAURAPluginCenter[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAPluginCenter[]) ipChange.ipc$dispatch("2b8bc667", new Object[]{this});
        }
        return null;
    }
}
