package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class bsp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lr9 f16605a;
    public final String b;

    static {
        t2o.a(689963255);
    }

    public bsp(String str) {
        ckf.g(str, "fluidInstanceId");
        this.b = str;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81d9f1b5", new Object[]{this});
        }
        return this.b;
    }

    public final lr9 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lr9) ipChange.ipc$dispatch("5360569a", new Object[]{this});
        }
        return this.f16605a;
    }

    public final void c(lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edef4374", new Object[]{this, lr9Var});
        } else {
            this.f16605a = lr9Var;
        }
    }
}
