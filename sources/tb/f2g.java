package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.h2g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class f2g<C extends h2g<C>> implements jic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438664);
        t2o.a(1002438663);
    }

    public f2g(C c) {
    }

    public abstract void a(C c);

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
        }
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
        } else {
            a(null);
        }
    }
}
