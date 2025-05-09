package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kaa implements t9c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public nk2 f22512a;

    static {
        t2o.a(486539319);
        t2o.a(488636437);
    }

    @Override // tb.t9c
    public dkb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkb) ipChange.ipc$dispatch("afd79bab", new Object[]{this});
        }
        if (this.f22512a == null) {
            this.f22512a = new nk2();
        }
        return this.f22512a;
    }
}
