package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256204);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c923e481", new Object[0]);
        }
        String str = (String) gno.b(ae7.c().b()).a("search_data", "");
        ggh.d("searchDataLoad: " + str);
        return str;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b89760", new Object[]{str});
        } else {
            gno.b(ae7.c().b()).e("search_data", str);
        }
    }
}
