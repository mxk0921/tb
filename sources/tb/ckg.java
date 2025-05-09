package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ckg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME_DUP_IMAGE = "dup_image_detector";
    public static final String MODULE_NAME_FRAME_SCORE = "guangguang_frame_score";
    public static final String MODULE_NAME_FRAME_SCORE_INFERIOR = "guangguang_frame_inferior";

    static {
        t2o.a(511705201);
    }

    public static void d(toc tocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cc5e35", new Object[]{tocVar});
        } else {
            dkg.b(tocVar);
        }
    }

    public List<Integer> a(List<Bitmap> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c36875bc", new Object[]{this, list});
        }
        List<Integer> arrayList = new ArrayList<>();
        r08 r08Var = new r08();
        if (r08Var.e(Globals.getApplication())) {
            arrayList = r08Var.j(list);
            odg.d("LcMNN", "execDetector: " + arrayList);
        }
        r08Var.b();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        return MNNCV.isAvailable();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        if (!eag.M() || !b()) {
            return false;
        }
        return true;
    }
}
