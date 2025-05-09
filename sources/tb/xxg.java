package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xxg implements ilc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public wpf f31659a;

    static {
        t2o.a(779092317);
        t2o.a(806355912);
    }

    @Override // tb.ilc
    public wpf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wpf) ipChange.ipc$dispatch("12b3f1", new Object[]{this});
        }
        return this.f31659a;
    }

    @Override // tb.ilc
    public void b(wpf wpfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d211b9", new Object[]{this, wpfVar});
        } else {
            this.f31659a = wpfVar;
        }
    }
}
