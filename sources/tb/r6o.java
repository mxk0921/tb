package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.utils.DeviceUtil;
import java.util.HashMap;
import java.util.List;
import tb.at4;
import tb.mqu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class r6o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Integer> f27152a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601433);
        }

        public a() {
        }

        public final int a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("be5e9886", new Object[]{this, context})).intValue();
            }
            ckf.g(context, "context");
            return at4.a.e(at4.Companion, context, 48, false, 4, null);
        }

        public final float b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7077e19f", new Object[]{this, context})).floatValue();
            }
            ckf.g(context, "context");
            Resources resources = context.getResources();
            ckf.f(resources, "context.resources");
            return resources.getDisplayMetrics().density;
        }

        public final DisplayMetrics d(Context context) {
            DisplayMetrics displayMetrics;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DisplayMetrics) ipChange.ipc$dispatch("2cd11f8f", new Object[]{this, context});
            }
            DisplayMetrics displayMetrics2 = null;
            try {
                displayMetrics = new DisplayMetrics();
            } catch (Exception unused) {
            }
            try {
                Object systemService = context.getSystemService(pg1.ATOM_EXT_window);
                if (systemService != null) {
                    ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
                    return displayMetrics;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            } catch (Exception unused2) {
                displayMetrics2 = displayMetrics;
                return displayMetrics2;
            }
        }

        public final int e(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a7da4b2c", new Object[]{this, context})).intValue();
            }
            ckf.g(context, "context");
            DisplayMetrics d = d(context);
            if (d != null) {
                return d.heightPixels;
            }
            return 2340;
        }

        public final int h(Context context) {
            Rect c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7dc9d357", new Object[]{this, context})).intValue();
            }
            ckf.g(context, "context");
            Resources resources = context.getResources();
            ckf.f(resources, "context.resources");
            int i = resources.getDisplayMetrics().widthPixels;
            DeviceUtil.Companion companion = DeviceUtil.Companion;
            if (!companion.g() || !(context instanceof Activity) || (c = companion.c((Activity) context)) == null) {
                return i;
            }
            return c.width();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int g(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{this, context})).intValue();
            }
            ckf.g(context, "context");
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        }

        public final void i(Activity activity, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ceb14b7", new Object[]{this, activity, new Boolean(z)});
                return;
            }
            ckf.g(activity, "activity");
            Window window = activity.getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                int i = z ? 0 : 8192;
                ckf.f(window, pg1.ATOM_EXT_window);
                View decorView = window.getDecorView();
                ckf.f(decorView, "decorView");
                decorView.setSystemUiVisibility(i | 1280);
            }
            ckf.f(window, pg1.ATOM_EXT_window);
            window.setStatusBarColor(0);
        }

        public final int f(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("be2c85d9", new Object[]{this, context, str})).intValue();
            }
            ckf.g(context, "context");
            ckf.g(str, "resName");
            Integer num = (Integer) r6o.a().get(str);
            if (num != null) {
                return num.intValue();
            }
            List z0 = wsq.z0(str, new String[]{"/"}, false, 0, 6, null);
            Resources resources = context.getResources();
            String str2 = (String) z0.get(1);
            String str3 = (String) z0.get(0);
            if (str3 != null) {
                String substring = str3.substring(1);
                ckf.f(substring, "(this as java.lang.String).substring(startIndex)");
                int identifier = resources.getIdentifier(str2, substring, context.getPackageName());
                Integer valueOf = Integer.valueOf(identifier);
                if (identifier != 0) {
                    r6o.a().put(str, valueOf);
                }
                return identifier;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        public final int c(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("68926b29", new Object[]{this, context, str})).intValue();
            }
            ckf.g(context, "context");
            ckf.g(str, "imageName");
            List y0 = wsq.y0(str, new char[]{wh6.DIR}, false, 0, 6, null);
            String str2 = (String) y0.get(y0.size() - 1);
            if (tsq.I(str2, "res_id_", false, 2, null)) {
                mqu.a aVar = mqu.Companion;
                String substring = str2.substring(7);
                ckf.f(substring, "(this as java.lang.String).substring(startIndex)");
                return aVar.d(wsq.z0(substring, new String[]{"."}, false, 0, 6, null).get(0), 0);
            }
            int f = f(context, lra.DRAWABLE_RESOURCE + ((String) wsq.z0(str2, new String[]{"."}, false, 0, 6, null).get(0)));
            if (f != 0) {
                return f;
            }
            return f(context, "@mipmap/" + ((String) wsq.z0(str2, new String[]{"."}, false, 0, 6, null).get(0)));
        }
    }

    static {
        t2o.a(919601432);
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2f4b02e9", new Object[0]);
        }
        return f27152a;
    }
}
