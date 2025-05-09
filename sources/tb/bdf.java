package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bdf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAGMENT = "fragment";
    public static final String INITIAL = "Initial";
    public static final String SERVICE = "service";
    public static final String VIEW = "view";

    static {
        t2o.a(676331615);
    }

    public static adf a(b02 b02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (adf) ipChange.ipc$dispatch("f839b7b9", new Object[]{b02Var});
        }
        if (b02Var.f().equals("fragment")) {
            return new sw9((ix9) b02Var);
        }
        if (b02Var.f().equals("view")) {
            return new vew((sfw) b02Var);
        }
        if (b02Var.f().equals("service")) {
            return new mdp((xdp) b02Var);
        }
        if (b02Var.f().equals(INITIAL)) {
            return new u8f((v8f) b02Var);
        }
        return null;
    }
}
