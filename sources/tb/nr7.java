package tb;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class nr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701645);
    }

    public static final ar7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar7) ipChange.ipc$dispatch("f3afc0b5", new Object[0]);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Application application = Globals.getApplication();
        ckf.d(application);
        Context baseContext = application.getBaseContext();
        ckf.d(baseContext);
        Object systemService = baseContext.getSystemService(pg1.ATOM_EXT_window);
        ckf.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return new ar7(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels), Double.valueOf(displayMetrics.densityDpi), Double.valueOf(displayMetrics.density), Double.valueOf(displayMetrics.xdpi), Double.valueOf(displayMetrics.ydpi));
    }
}
