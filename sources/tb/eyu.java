package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class eyu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY = "gateway";
    public static final String OFF = "off";
    public static final String ORANGE = "orange";

    static {
        t2o.a(404750768);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a54443f7", new Object[0]);
        }
        return v82.l("uppMode", "gateway");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6790ea1", new Object[0])).booleanValue();
        }
        return !TextUtils.equals("off", a()) && f82.j();
    }
}
