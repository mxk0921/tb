package tb;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class rc0 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601398);
        }

        public a() {
        }

        public final void a(Activity activity, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d4ec884", new Object[]{this, activity, new Integer(i)});
            } else if (activity != null) {
                Window window = activity.getWindow();
                ckf.f(window, "activity.window");
                window.setNavigationBarColor(i);
            }
        }

        public final void c(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0641772", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            activity.setTheme(R.style.Theme_TurboFlow_Transparent);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void b(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("874f2513", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            Window window = activity.getWindow();
            ckf.f(window, pg1.ATOM_EXT_window);
            View decorView = window.getDecorView();
            ckf.f(decorView, "decorView");
            decorView.setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    static {
        t2o.a(919601397);
    }
}
