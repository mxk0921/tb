package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o2r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321714);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
            return;
        }
        String str2 = "NewDetail_" + str;
        w35.a(str2);
        txj.e(txj.TAG_SECTION, "[beginSection] : " + str2);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[0]);
        } else {
            w35.c();
        }
    }
}
