package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jp3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698665);
    }

    public static hp3 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hp3) ipChange.ipc$dispatch("de5849ed", new Object[0]);
        }
        hp3 hp3Var = new hp3();
        hp3Var.f20797a = true;
        hp3Var.g = true;
        hp3Var.h = true;
        hp3Var.f = true;
        hp3Var.c = true;
        hp3Var.d = true;
        hp3Var.e = true;
        hp3Var.b = true;
        return hp3Var;
    }

    public static hp3 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hp3) ipChange.ipc$dispatch("15935a71", new Object[0]);
        }
        return new hp3();
    }
}
