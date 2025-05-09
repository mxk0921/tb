package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699043);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f8c0f", new Object[0]);
        } else {
            uvg.g().d("tbl_gl_scroll2_p");
        }
    }

    public static void b(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88763fa", new Object[]{xeaVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("gl_opt", "" + wda.E());
        hashMap.put("deviceLevel", "" + ekr.i());
        String str = "1";
        hashMap.put("glNewPage", str);
        if (!wda.d()) {
            str = "0";
        }
        hashMap.put("cdnCache", str);
        uvg.g().k("tbl_gl_scroll2_p", hashMap);
    }
}
