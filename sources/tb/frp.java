package tb;

import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class frp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412007);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * Globals.getApplication().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a649159f", new Object[0])).intValue();
        }
        return ((WindowManager) Globals.getApplication().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getHeight();
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f8f989d", new Object[0])).floatValue();
        }
        return Globals.getApplication().getResources().getDisplayMetrics().density;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[0])).intValue();
        }
        return ((WindowManager) Globals.getApplication().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    }
}
