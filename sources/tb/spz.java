package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.utils.Global;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class spz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322023);
    }

    public static rpz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpz) ipChange.ipc$dispatch("416cfcb3", new Object[0]);
        }
        return new rpz();
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96f0a036", new Object[]{str})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(Global.getApplication(), str);
    }

    public static rpz c(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpz) ipChange.ipc$dispatch("192e9aee", new Object[]{aqzVar});
        }
        rpz rpzVar = aqzVar.n;
        if (rpzVar == null) {
            return a().b();
        }
        return rpzVar;
    }

    public static void d(rpz rpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f6b1a0", new Object[]{rpzVar});
        } else {
            rpzVar.c(b("scale_image_view_keep_visible"));
        }
    }
}
