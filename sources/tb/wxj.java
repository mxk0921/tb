package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321869);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e86abfe", new Object[]{str});
        } else if (nyj.z().B(str) == null) {
            nyj.z().Q(str, nyj.z().e(str, "weexDataRender"));
        }
    }

    public static void b(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd479a60", new Object[]{cxjVar});
        } else if (cxjVar != null && !TextUtils.isEmpty(cxjVar.o())) {
            nyj.z().u(cxjVar.j().G(), cxjVar.o(), "firstVideoPlay", true);
            nyj.z().w(cxjVar.j().G(), "start_play", true);
            cxjVar.a();
        }
    }
}
