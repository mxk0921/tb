package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bsr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714597);
    }

    public static int a(lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("661bd38a", new Object[]{lr9Var})).intValue();
        }
        if (lr9Var instanceof rba) {
            return az9.n(300);
        }
        return az9.n(180);
    }

    public static int b(lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("deff18f2", new Object[]{lr9Var})).intValue();
        }
        boolean z = lr9Var instanceof rba;
        return 3002;
    }

    public static String c(lr9 lr9Var, vrp vrpVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af1f474a", new Object[]{lr9Var, vrpVar});
        }
        if (lr9Var == null || vrpVar == null) {
            return "defaultMessageTag";
        }
        if (lr9Var instanceof rba) {
            str = "GlobalH5MessageHandler";
        } else if (lr9Var instanceof k93) {
            str = "CardWeeXV2MessageHandler";
        } else {
            str = "MessageHandler";
        }
        return str + "/" + vrpVar.c;
    }
}
