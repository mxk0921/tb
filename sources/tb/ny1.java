package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class ny1<T extends UINode> implements jpc<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710037);
        t2o.a(982516220);
    }

    @Override // tb.jpc
    public cwh<T> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cwh) ipChange.ipc$dispatch("96ffd7cf", new Object[]{this, str});
        }
        return null;
    }

    @Override // tb.jpc
    public cwh<T> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cwh) ipChange.ipc$dispatch("832a6d1", new Object[]{this, str});
        }
        return null;
    }

    @Override // tb.vtf
    public cwh<T> getMethodInvoker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cwh) ipChange.ipc$dispatch("e339d05f", new Object[]{this, str});
        }
        return null;
    }
}
