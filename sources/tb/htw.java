package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class htw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767262);
    }

    public static nsw a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("18b4f327", new Object[]{str, str2});
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_FAILED");
        nswVar.b("errorCode", str);
        nswVar.b("errorMsg", str2);
        return nswVar;
    }
}
