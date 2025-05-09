package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class o83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714125);
    }

    public static String a(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed9f8673", new Object[]{uq9Var});
        }
        if (uq9Var.Y() == null || !uq9Var.Y().w()) {
            return "";
        }
        return "1";
    }

    public static String b(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("874c51a3", new Object[]{uq9Var});
        }
        if (uq9Var.Y() == null || uq9Var.Y().e() == null) {
            return "";
        }
        return uq9Var.Y().e().title;
    }
}
