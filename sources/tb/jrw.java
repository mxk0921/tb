package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class jrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856314);
    }

    public static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d221a439", new Object[]{str});
        }
        wmc wmcVar = (wmc) jpw.c().a(wmc.class);
        if (wmcVar == null) {
            return str;
        }
        try {
            str2 = wmcVar.a(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? str : str2;
    }
}
