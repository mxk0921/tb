package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o77 implements qqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f25183a;

    static {
        t2o.a(1029701642);
        t2o.a(972029960);
    }

    @Override // tb.qqt
    public String newThreadName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
        }
        this.f25183a++;
        return "Thread-" + this.f25183a;
    }
}
