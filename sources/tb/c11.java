package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16765a;
    public String b;
    public String c;

    static {
        t2o.a(815793387);
    }

    public static c11 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c11) ipChange.ipc$dispatch("5357b4d7", new Object[0]);
        }
        c11 c11Var = new c11();
        c11Var.f16765a = "mtop.taobao.wsearch.appsearch";
        c11Var.b = "1.0";
        c11Var.c = "wsearch";
        return c11Var;
    }
}
