package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s6o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ResUtil";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Integer> f27826a = new HashMap<>();
    public static final Pattern b = Pattern.compile("^([-]?[\\d]+[\\.]?[\\d]*).*");
    public static DisplayMetrics c;
    public static final float d;

    static {
        int i;
        t2o.a(503317423);
        d = 0.0f;
        if (Build.VERSION.SDK_INT >= 24 && akt.p2("enableStableDensity", true)) {
            i = DisplayMetrics.DENSITY_DEVICE_STABLE;
            d = (i * 1.0f) / 160.0f;
        }
    }

    public static TBErrorView A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("7240c031", new Object[]{context});
        }
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tBErrorView.setBackgroundColor(Color.parseColor("#eeeeee"));
        return tBErrorView;
    }

    public static int B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7dc9d357", new Object[]{context})).intValue();
        }
        Context f = f(context);
        IDeviceInfo i = od0.D().i();
        if (i == null || !i.i() || !(f instanceof Activity)) {
            return f.getResources().getDisplayMetrics().widthPixels;
        }
        return i.j((Activity) f).width();
    }

    public static boolean C() {
        try {
            return ((Boolean) Class.forName("android.os.Build").getMethod("hasSmartBar", new Class[0]).invoke(null, new Object[0])).booleanValue();
        } catch (Exception unused) {
            String str = Build.DEVICE;
            if (str.equals("mx2")) {
                return true;
            }
            if (!str.equals("mx")) {
                str.equals("m9");
            }
            return false;
        }
    }

    public static boolean E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7d0f064", new Object[]{new Integer(i)})).booleanValue();
        }
        IDeviceInfo i2 = od0.D().i();
        if (i < 3 || i2 == null || !i2.i()) {
            return false;
        }
        return true;
    }

    public static boolean F(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3883e5f4", new Object[]{context})).booleanValue();
        }
        if ((context instanceof Application) || (od0.D().f() != null && od0.D().f().a() == context)) {
            return true;
        }
        return false;
    }

    public static int H(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d56dd42", new Object[]{context, new Integer(i)})).intValue();
        }
        return (int) ((i / l(context)) + 0.5f);
    }

    public static int I(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fb4f483", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (((f * 2.0f) / (od0.D().i().p(context) * l(context))) + 0.5f);
    }

    @Deprecated
    public static int J(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e13b2e76", new Object[]{context, new Float(f)})).intValue();
        }
        if (E(3)) {
            return I(context, f);
        }
        int B = (int) (((750.0f / B(context)) * f) + 0.5d);
        if (B != 0 || f <= 0.0f) {
            return B;
        }
        return 1;
    }

    public static int K(n nVar, Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("816e7b92", new Object[]{nVar, context, new Float(f)})).intValue();
        }
        if (E(q.n(nVar))) {
            return I(context, f);
        }
        int B = (int) (((750.0f / B(context)) * f) + 0.5d);
        if (B != 0 || f <= 0.0f) {
            return B;
        }
        return 1;
    }

    public static void L(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4ec884", new Object[]{activity, new Integer(i)});
        } else if (activity != null) {
            activity.getWindow().setNavigationBarColor(i);
        }
    }

    public static void M(Activity activity, int i, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9b07fc", new Object[]{activity, new Integer(i), new Boolean(z)});
        } else if (activity != null) {
            View decorView = activity.getWindow().getDecorView();
            if (Build.VERSION.SDK_INT >= 23) {
                if (z) {
                    i2 = 8192;
                }
                decorView.setSystemUiVisibility(i2 | 1280);
            }
            activity.getWindow().setStatusBarColor(i);
        }
    }

    public static int N(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b38b5523", new Object[]{context, new Integer(i)})).intValue();
        }
        return (int) ((i * x(context)) + 0.5d);
    }

    public static int O(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd35b13f", new Object[]{context, new Float(f)})).intValue();
        }
        float B = ((B(context) / 750.0f) * f) + 0.5f;
        if (B != 0.0f || f <= 0.0f) {
            return (int) B;
        }
        return 1;
    }

    public static int P(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b58e2c53", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((((f * l(context)) * od0.D().i().p(context)) / 2.0f) + 0.5d);
    }

    public static int Q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4fe20fb", new Object[]{context, str})).intValue();
        }
        return O(context, Integer.parseInt(str.substring(0, str.length() - 3)));
    }

    @Deprecated
    public static int R(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("845e8f5c", new Object[]{context, new Float(f)})).intValue();
        }
        if (E(3)) {
            return P(context, f);
        }
        return O(context, f);
    }

    @Deprecated
    public static int S(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("845e9a9f", new Object[]{context, new Integer(i)})).intValue();
        }
        if (E(3)) {
            return P(context, i);
        }
        return O(context, i);
    }

    @Deprecated
    public static int T(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83e82934", new Object[]{context, str})).intValue();
        }
        return X(null, context, str, false);
    }

    public static int U(n nVar, Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1625b6c", new Object[]{nVar, context, new Float(f)})).intValue();
        }
        if (E(q.n(nVar))) {
            return P(context, f);
        }
        return O(context, f);
    }

    public static int V(n nVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2693ff24", new Object[]{nVar, context, str})).intValue();
        }
        return X(nVar, context, str, false);
    }

    public static int W(n nVar, Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abec99b6", new Object[]{nVar, context, str, new Boolean(z)})).intValue();
        }
        return X(nVar, context, str, z);
    }

    public static Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("578c0a8", new Object[]{str});
        }
        try {
            byte[] decode = Base64.decode(str.split(",")[1], 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError e2) {
            tfs.d(e2.getMessage());
            return null;
        }
    }

    public static void b(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778512bf", new Object[]{activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            window.setStatusBarColor(i);
        }
    }

    public static int c(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec7cd854", new Object[]{context, new Integer(i)})).intValue();
        }
        return (int) ((i * l(context)) + 0.5d);
    }

    public static int d(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc244de2", new Object[]{context, new Integer(i)})).intValue();
        }
        return (int) (i * l(context));
    }

    public static int e(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9f2811d", new Object[]{context, new Integer(i)})).intValue();
        }
        return (int) ((i * y(context)) + 0.5d);
    }

    public static Context f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("cf8a3228", new Object[]{context});
        }
        if (context == null) {
            context = o.J();
        }
        if (context == null) {
            return ig8.b();
        }
        return context;
    }

    public static int g(Context context) {
        View findViewById;
        ActionBar supportActionBar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be5e9886", new Object[]{context})).intValue();
        }
        Context f = f(context);
        if (F(f)) {
            return c(f, 48);
        }
        if (f instanceof Activity) {
            if ((f instanceof AppCompatActivity) && (supportActionBar = ((AppCompatActivity) f).getSupportActionBar()) != null) {
                i = supportActionBar.getHeight();
            }
            if (i <= 0 && (findViewById = ((Activity) f).findViewById(R.id.action_bar)) != null) {
                i = findViewById.getMeasuredHeight();
            }
        }
        if (i <= 0) {
            return c(f, 48);
        }
        return i;
    }

    public static int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16a44c3a", new Object[]{context})).intValue();
        }
        int t = t(context);
        int k = k();
        tfs.e(TAG, "tab2直播测量组件宽高时适配底部虚拟导航栏，tabBarParentHeight：" + k);
        return k > 0 ? k : t;
    }

    public static int i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e438928", new Object[]{activity})).intValue();
        }
        Resources resources = activity.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static ViewGroup j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("83c171c5", new Object[0]);
        }
        ViewGroup Q = od0.D().f().Q();
        if (Q != null && (Q.getParent() instanceof ViewGroup)) {
            return (ViewGroup) Q.getParent();
        }
        return null;
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be89d54a", new Object[0])).intValue();
        }
        try {
            ViewGroup j = j();
            if (j == null) {
                return 0;
            }
            return j.getHeight();
        } catch (Throwable th) {
            tfs.e(TAG, "获取底部TabBar父节点的高度，" + th.getMessage());
            return 0;
        }
    }

    public static float l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7077e19f", new Object[]{context})).floatValue();
        }
        return f(context).getResources().getDisplayMetrics().density;
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6743b4a4", new Object[0])).intValue();
        }
        return n(o.J());
    }

    public static int n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d27fd02a", new Object[]{context})).intValue();
        }
        Context f = f(context);
        IDeviceInfo i = od0.D().i();
        if (i == null || !i.i() || !(f instanceof Activity)) {
            return f.getResources().getDisplayMetrics().heightPixels;
        }
        return i.j((Activity) f).height();
    }

    public static int o(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5e4b441", new Object[]{context, str})).intValue();
        }
        return w(context, "@string/uik_icon_" + str.substring(6));
    }

    public static int p(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("638386b4", new Object[]{new Integer(i), new Integer(i2), new Float(f)})).intValue();
        }
        int red = Color.red(i);
        int blue = Color.blue(i);
        int green = Color.green(i);
        int red2 = Color.red(i2);
        int blue2 = Color.blue(i2);
        int green2 = Color.green(i2);
        int alpha = Color.alpha(i);
        return Color.argb((int) (alpha + ((Color.alpha(i2) - alpha) * f) + 0.5d), (int) (red + ((red2 - red) * f) + 0.5d), (int) (green + ((green2 - green) * f) + 0.5d), (int) (blue + ((blue2 - blue) * f) + 0.5d));
    }

    public static int r(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5906ab46", new Object[]{activity})).intValue();
        }
        if (activity != null) {
            return activity.getWindow().getNavigationBarColor();
        }
        return 1;
    }

    public static DisplayMetrics s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("2cd11f8f", new Object[]{context});
        }
        DisplayMetrics displayMetrics = c;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        try {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            try {
                ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealMetrics(displayMetrics2);
                if (!od0.D().i().i()) {
                    c = displayMetrics2;
                }
            } catch (Exception unused) {
            }
            return displayMetrics2;
        } catch (Exception unused2) {
            return displayMetrics;
        }
    }

    public static int t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7da4b2c", new Object[]{context})).intValue();
        }
        DisplayMetrics s = s(f(context));
        if (s != null) {
            return s.heightPixels;
        }
        return 2340;
    }

    public static float u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edca493b", new Object[]{context})).floatValue();
        }
        return 750.0f / B(context);
    }

    public static int v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2192f015", new Object[]{context})).intValue();
        }
        DisplayMetrics s = s(f(context));
        if (s != null) {
            return s.widthPixels;
        }
        return 1080;
    }

    public static int w(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be2c85d9", new Object[]{context, str})).intValue();
        }
        Context f = f(context);
        HashMap<String, Integer> hashMap = f27826a;
        Integer num = hashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        String[] G = nwv.G(str, wh6.DIR);
        int identifier = f.getResources().getIdentifier(G[1], G[0].substring(1), f.getPackageName());
        Integer valueOf = Integer.valueOf(identifier);
        if (identifier != 0) {
            hashMap.put(str, valueOf);
        }
        return identifier;
    }

    public static float x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf2c3add", new Object[]{context})).floatValue();
        }
        return f(context).getResources().getDisplayMetrics().scaledDensity;
    }

    public static float y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2635eefa", new Object[]{context})).floatValue();
        }
        float l = l(context);
        float f = d;
        return f > 0.0f ? akt.p2("useMinDensity", true) ? Math.min(f, l) : f : l;
    }

    public static int z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cc15122", new Object[]{context})).intValue();
        }
        Context f = f(context);
        int identifier = f.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return f.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void D(View view) {
        if (C()) {
            try {
                Method method = View.class.getMethod("setSystemUiVisibility", Integer.TYPE);
                Object[] objArr = new Object[1];
                try {
                    objArr[0] = View.class.getField("SYSTEM_UI_FLAG_HIDE_NAVIGATION").get(null);
                } catch (Exception unused) {
                }
                method.invoke(view, objArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean G(Activity activity) {
        WindowManager windowManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bf7e70f", new Object[]{activity})).booleanValue();
        }
        View findViewById = activity.getWindow().getDecorView().findViewById(16908290);
        if (findViewById == null || (windowManager = (WindowManager) activity.getSystemService(pg1.ATOM_EXT_window)) == null) {
            return false;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int bottom = findViewById.getBottom();
        int i = point.y;
        return (bottom == i || i - bottom == z(activity)) ? false : true;
    }

    public static int q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68926b29", new Object[]{context, str})).intValue();
        }
        String[] G = nwv.G(str, wh6.DIR);
        String str2 = G[G.length - 1];
        if (str2.startsWith("res_id_")) {
            return nwv.t(nwv.G(str2.substring(7), '.')[0], 0);
        }
        int w = w(context, lra.DRAWABLE_RESOURCE + nwv.G(str2, '.')[0]);
        if (w != 0) {
            return w;
        }
        return w(context, "@mipmap/" + nwv.G(str2, '.')[0]);
    }

    public static int X(n nVar, Context context, String str, boolean z) {
        int i;
        String trim;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1edef079", new Object[]{nVar, context, str, new Boolean(z)})).intValue();
        }
        if (str == null) {
            return 0;
        }
        int n = q.n(nVar);
        try {
            i = (int) (Float.parseFloat(str) + 0.5d);
        } catch (Throwable unused) {
            i = 0;
        }
        try {
            if (E(n)) {
                return P(context, i);
            }
        } catch (Throwable unused2) {
            try {
                trim = str.trim();
            } catch (Throwable unused3) {
            }
            if (trim.endsWith("rpx")) {
                if (E(n)) {
                    return Q(context, trim);
                }
                i = nwv.t(trim.substring(0, trim.length() - 3), 0);
            } else if (trim.endsWith("px") && !trim.endsWith("rpx")) {
                return nwv.t(trim.substring(0, trim.length() - 2), i);
            } else {
                if (trim.endsWith("wx")) {
                    i = (int) (Float.parseFloat(trim.substring(0, trim.length() - 2)) + 0.5d);
                    try {
                        if (z) {
                            return N(context, i);
                        }
                        return e(context, i);
                    } catch (Throwable unused4) {
                        return O(context, i);
                    }
                } else {
                    if (akt.A()) {
                        Matcher matcher = b.matcher(trim);
                        if (matcher.matches()) {
                            i = (int) (Float.parseFloat(matcher.group(1)) + 0.5d);
                        }
                    }
                    return O(context, i);
                }
            }
            return O(context, i);
        }
        return O(context, i);
    }
}
