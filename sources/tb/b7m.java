package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321657);
    }

    public static faw a(cxj cxjVar, dh7 dh7Var, ViewGroup viewGroup, faw fawVar, String str, j83 j83Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (faw) ipChange.ipc$dispatch("fd7f1a36", new Object[]{cxjVar, dh7Var, viewGroup, fawVar, str, j83Var, new Boolean(z), new Boolean(z2)});
        }
        if (fawVar == null) {
            if (cw6.b()) {
                Activity i = cxjVar.i();
                Toast.makeText(i, "kirinvideo,surfaceView: " + z + ", tbplayer: " + z2, 0).show();
            }
            txj.e(txj.TAG_RENDER, "createOrUpdateMediaPlayer 创建kirinvideo player");
            return new l5g(cxjVar, dh7Var, viewGroup, j83Var);
        } else if (str.equals(fawVar.l())) {
            return fawVar;
        } else {
            return null;
        }
    }
}
