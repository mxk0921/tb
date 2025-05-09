package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ec4 implements bc4<Integer, zb4> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317218);
        t2o.a(503317215);
    }

    /* renamed from: a */
    public Integer b(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("78e70cae", new Object[]{this, component});
        }
        return Integer.valueOf(component.getLayoutHeight());
    }
}
