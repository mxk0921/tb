package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class zd3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151048);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d9b046", new Object[]{this});
            return;
        }
        eiv.a().c(Globals.getApplication());
        eiv.a().d();
    }

    public final void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283ad2c8", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        eiv.a().c(activity);
        boolean d = eiv.a().d();
        try {
            SystemBarDecorator systemBarDecorator = new SystemBarDecorator(activity);
            FestivalMgr i = FestivalMgr.i();
            ckf.f(i, "FestivalMgr.getInstance()");
            Map<String, String> g = i.g();
            String str = g.get("navStyle");
            if (TextUtils.equals(g.get("isFestivalOn"), "1")) {
                if (!TextUtils.equals(str, "0") && !TextUtils.equals(str, "1")) {
                    if (TextUtils.equals(str, "2")) {
                        systemBarDecorator.enableImmersiveStatusBar(true);
                    }
                }
                systemBarDecorator.enableImmersiveStatusBar(false);
            } else if (d) {
                systemBarDecorator.enableImmersiveStatusBar(true);
            }
        } catch (Throwable unused) {
        }
    }
}
