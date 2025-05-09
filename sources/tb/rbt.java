package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rbt implements czd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jbt f27268a;

    static {
        t2o.a(779093046);
        t2o.a(806355756);
    }

    public rbt a(jbt jbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbt) ipChange.ipc$dispatch("b364bb30", new Object[]{this, jbtVar});
        }
        this.f27268a = jbtVar;
        return this;
    }

    public dzd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dzd) ipChange.ipc$dispatch("dde07628", new Object[]{this});
        }
        return this.f27268a.d;
    }
}
