package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import java.lang.ref.WeakReference;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class l53 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DARK_FRAME_THRESHOLD = 0.3f;
    public static final String IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT = "isPltScreenshotFloatBarOpenDefault";
    public static final String KEY_EXTRA_VERIFY = "extra_verify";
    public static final String PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE = "taoPai";
    public static final String PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID = "client";
    public static final String PsSourceSY_SYS = "sy_sys";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23115a;
    public static boolean b;
    public static String d;
    public static String e;
    public static final d Companion = new d(null);
    public static String c = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        /* renamed from: a  reason: collision with root package name */
        public static int f23116a = -1;
        public static WeakReference<Activity> b;

        static {
            t2o.a(481296496);
        }

        @JvmStatic
        public static final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("924e31ba", new Object[]{new Integer(i)});
            } else if (f23116a == i) {
                b = null;
                f23116a = -1;
            }
        }

        @JvmStatic
        public static final void b(int i) {
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("839705db", new Object[]{new Integer(i)});
            } else if (f23116a != i) {
                WeakReference<Activity> weakReference = b;
                if (weakReference == null) {
                    activity = null;
                } else {
                    activity = weakReference.get();
                }
                if (activity != null && !activity.isFinishing()) {
                    activity.finish();
                }
                b = null;
                f23116a = -1;
            }
        }

        @JvmStatic
        public static final void c(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c4bdf2", new Object[]{activity});
                return;
            }
            ckf.g(activity, "activity");
            f23116a = activity.hashCode();
            b = new WeakReference<>(activity);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final c INSTANCE = new c();
        public static final int TAB_IDENTIFY_ALL = 5;
        public static final int TAB_IMAGE_SEARCH = 1;
        public static final int TAB_MARKETING = 2;
        public static final int TAB_QUESTION = 4;
        public static final int TAB_SCAN = 0;
        public static final int TAB_TRANSLATE = 3;
        public static final int TAB_UNKNOWN = -1;

        static {
            t2o.a(481296498);
        }

        @JvmStatic
        public static final String a(Integer num) {
            int intValue;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("89bfa4b5", new Object[]{num});
            }
            if (num == null || (intValue = num.intValue()) == 0) {
                return "scan";
            }
            if (intValue == 1) {
                return b.SCENE_AUTO_DETECT;
            }
            if (intValue == 3) {
                return "translate";
            }
            if (intValue == 4) {
                return b.SCENE_QUESTION;
            }
            if (intValue == 5) {
                return b.SCENE_IDENTIFY_ALL;
            }
            return b.SCENE_MARKETING;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296499);
        }

        public /* synthetic */ d(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final xr1 a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xr1) ipChange.ipc$dispatch("bc1cd940", new Object[]{this, context});
            }
            ckf.g(context, "context");
            if (context instanceof rlb) {
                return ((rlb) context).w0();
            }
            ror a2 = TBMainHost.a(context);
            if (a2 == null) {
                return null;
            }
            Fragment currentFragment = a2.getCurrentFragment();
            if (currentFragment instanceof rlb) {
                return ((rlb) currentFragment).w0();
            }
            return null;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("da074042", new Object[]{this});
            }
            return l53.a();
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4d006db1", new Object[]{this});
            }
            return l53.b();
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("30d8489a", new Object[]{this});
            }
            return l53.c();
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b39186fd", new Object[]{this})).booleanValue();
            }
            return l53.d();
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7eeac159", new Object[]{this})).booleanValue();
            }
            return l53.e();
        }

        public final void g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("986c7e33", new Object[]{this, new Boolean(z)});
            } else {
                l53.f(z);
            }
        }

        public final void h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b24eb57", new Object[]{this, new Boolean(z)});
            } else {
                l53.g(z);
            }
        }

        public final void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b2a7074", new Object[]{this, str});
            } else {
                l53.h(str);
            }
        }

        public final void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("225337e5", new Object[]{this, str});
            } else {
                l53.i(str);
            }
        }

        public final void k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2064584", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            l53.j(str);
        }

        public final void l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93d045a0", new Object[]{this, new Boolean(z)});
            } else {
                l53.k(z);
            }
        }

        public d() {
        }
    }

    static {
        t2o.a(481296495);
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c1b4edf", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3adde710", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ecee07", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1072f2a", new Object[0])).booleanValue();
        }
        return b;
    }

    public static final /* synthetic */ boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1213274e", new Object[0])).booleanValue();
        }
        return f23115a;
    }

    public static final /* synthetic */ void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf940b6", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static final /* synthetic */ void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3373b112", new Object[]{new Boolean(z)});
        } else {
            f23115a = z;
        }
    }

    public static final /* synthetic */ void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18eaddf", new Object[]{str});
        } else {
            e = str;
        }
    }

    public static final /* synthetic */ void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee974ce", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static final /* synthetic */ void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2b284f", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static final /* synthetic */ void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a83fa9", new Object[]{new Boolean(z)});
        }
    }

    @JvmStatic
    public static final xr1 l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xr1) ipChange.ipc$dispatch("bc1cd940", new Object[]{context});
        }
        return Companion.a(context);
    }

    public static final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da074042", new Object[0]);
        }
        return Companion.b();
    }

    public static final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d006db1", new Object[0]);
        }
        return Companion.c();
    }

    public static final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2a7074", new Object[]{str});
        } else {
            Companion.i(str);
        }
    }

    public static final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225337e5", new Object[]{str});
        } else {
            Companion.j(str);
        }
    }

    public static final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d045a0", new Object[]{new Boolean(z)});
        } else {
            Companion.l(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final b INSTANCE = new b();
        public static final String SCENE_AUTO_DETECT = "autodetect";
        public static final String SCENE_CAPTURE_TOOL = "captureTool";
        public static final String SCENE_IDENTIFY_ALL = "identifyAll";
        public static final String SCENE_MARKETING = "ppl";
        public static final String SCENE_META_SIGHT = "metasight";
        public static final String SCENE_QUESTION = "photoQuestion";
        public static final String SCENE_SCAN = "scan";
        public static final String SCENE_TRANSLATE = "translate";
        public static final String SCENE_UNKNOWN = "unknown";

        static {
            t2o.a(481296497);
        }

        @JvmStatic
        public static final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2808a495", new Object[]{str});
            }
            if (str == null) {
                return "";
            }
            if (ckf.b(str, "scan")) {
                return "scan";
            }
            if (ckf.b(str, SCENE_AUTO_DETECT)) {
                return SCENE_AUTO_DETECT;
            }
            if (ckf.b(str, SCENE_META_SIGHT)) {
                return SCENE_META_SIGHT;
            }
            if (ckf.b(str, "translate")) {
                return "translate";
            }
            if (ckf.b(str, SCENE_QUESTION)) {
                return SCENE_QUESTION;
            }
            if (ckf.b(str, SCENE_IDENTIFY_ALL)) {
                return SCENE_IDENTIFY_ALL;
            }
            return SCENE_MARKETING;
        }

        @JvmStatic
        public static final int b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bd4a8677", new Object[]{str})).intValue();
            }
            ckf.g(str, "scene");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            if (ckf.b(str, "scan")) {
                return 0;
            }
            if (ckf.b(str, SCENE_AUTO_DETECT) ? true : ckf.b(str, SCENE_META_SIGHT)) {
                return 1;
            }
            if (ckf.b(str, "translate")) {
                return 3;
            }
            if (ckf.b(str, SCENE_QUESTION)) {
                return 4;
            }
            return ckf.b(str, SCENE_IDENTIFY_ALL) ? 5 : 2;
        }
    }
}
