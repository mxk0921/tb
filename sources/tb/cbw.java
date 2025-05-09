package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.media.frame.DimensionEnum;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cbw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VALUE_BLUR_RPX = 100;
    public static final int VALUE_BOTTOM_SAFEAREA_MARGIN = 18;
    public static final int VALUE_BOTTOM_SAFEAREA_MARGIN_NO_HALF_SCREEN = 30;
    public static final int VALUE_COMMON_DEFAULT_HEIGHT = 98;
    public static final int VALUE_NAV_HEIGHT = 44;
    public static final String VALUE_NINE_SIXTEEN_RATIO = "9:16";
    public static final String VALUE_SIXTEEN_NINE_RATIO = "16:9";
    public static final String VALUE_THREE_FOUR_RATIO = "3:4";

    /* renamed from: a  reason: collision with root package name */
    public static int f16965a;
    public static int b;
    public static float c = 0.0f;
    public static Double d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType;

        static {
            int[] iArr = new int[NewDetailScreenConfig.ScreenType.values().length];
            $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType = iArr;
            try {
                iArr[NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(352321645);
    }

    public static qrc a(cxj cxjVar, ue7 ue7Var, g9e g9eVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrc) ipChange.ipc$dispatch("13a98239", new Object[]{cxjVar, ue7Var, g9eVar, new Integer(i), new Boolean(z)});
        }
        int i2 = a.$SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[m(cxjVar).a().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            if (ue7Var.p0 != null) {
                return b(cxjVar, ue7Var, i, z);
            }
            if (ue7Var.w0 != null) {
                return c(cxjVar, ue7Var, g9eVar, i, z);
            }
            return new qrc(-1, -1);
        } else if (ue7Var.p0 != null) {
            return d(cxjVar, ue7Var, i, z);
        } else {
            if (ue7Var.w0 != null) {
                return e(cxjVar, ue7Var, g9eVar, i, z);
            }
            return new qrc(-1, -1);
        }
    }

    public static qrc b(cxj cxjVar, ue7 ue7Var, int i, boolean z) {
        g9e g9eVar;
        boolean z2;
        int i2;
        int i3;
        int i4;
        char c2 = 65535;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrc) ipChange.ipc$dispatch("fbcea103", new Object[]{cxjVar, ue7Var, new Integer(i), new Boolean(z)});
        }
        qrc qrcVar = new qrc(-1, -1);
        Activity i5 = cxjVar.i();
        if (!(i5 == null || ue7Var == null || (g9eVar = ue7Var.p0) == null || !((g5g) g9eVar).isDataValid() || ((g5g) ue7Var.p0).b() == null)) {
            p(i5);
            int b2 = m(cxjVar).b();
            int o = o(i5, i, z);
            AtmosParams o2 = cxjVar.j().o();
            if (!cxjVar.j().k0() || ue7Var.f31127a != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                o -= i(cxjVar, o2);
            }
            String b3 = ((g5g) ue7Var.p0).b();
            b3.hashCode();
            switch (b3.hashCode()) {
                case 50861:
                    if (b3.equals(VALUE_THREE_FOUR_RATIO)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1513508:
                    if (b3.equals(VALUE_SIXTEEN_NINE_RATIO)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1755398:
                    if (b3.equals("9:16")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    qrcVar.c = o;
                    qrcVar.d = (int) (o * 0.75f);
                    qrcVar.h = ImageView.ScaleType.FIT_CENTER;
                    if (z2) {
                        i2 = i(cxjVar, o2);
                    } else {
                        i2 = 0;
                    }
                    qrcVar.e = i2;
                    break;
                case 1:
                    int i6 = (int) (b2 * 0.5625f);
                    qrcVar.c = i6;
                    qrcVar.d = b2;
                    qrcVar.h = ImageView.ScaleType.FIT_CENTER;
                    qrcVar.e = (o - i6) / 2;
                    break;
                case 2:
                    qrcVar.c = o;
                    qrcVar.d = (int) (o * 0.5625f);
                    qrcVar.h = ImageView.ScaleType.CENTER_CROP;
                    if (z2) {
                        i3 = i(cxjVar, o2);
                    } else {
                        i3 = 0;
                    }
                    qrcVar.e = i3;
                    break;
                default:
                    if (m(cxjVar).a() == NewDetailScreenConfig.ScreenType.PAD_PORTRAIT) {
                        qrcVar.c = b2;
                        qrcVar.d = b2;
                        qrcVar.e = (o - b2) / 2;
                    } else {
                        qrcVar.c = o;
                        qrcVar.d = o;
                        if (z2) {
                            i4 = i(cxjVar, o2);
                        } else {
                            i4 = 0;
                        }
                        qrcVar.e = i4;
                    }
                    qrcVar.h = ImageView.ScaleType.FIT_CENTER;
                    break;
            }
            if (ue7Var.f31127a != 0 || qrcVar.c < o || !z2) {
                qrcVar.i = null;
            } else {
                float j = m(cxjVar).j(o2.layoutInfo.borderRadius);
                qrcVar.i = new float[]{j, j, j, j, 0.0f, 0.0f, 0.0f, 0.0f};
            }
            if (qrcVar.c < 0) {
                qrcVar.c = 0;
            }
        }
        return qrcVar;
    }

    public static qrc c(cxj cxjVar, ue7 ue7Var, g9e g9eVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrc) ipChange.ipc$dispatch("4cf1c03f", new Object[]{cxjVar, ue7Var, g9eVar, new Integer(i), new Boolean(z)});
        }
        if (g9eVar == null || !g9eVar.isDataValid()) {
            return new qrc(-1, -1);
        }
        return q0i.b(cxjVar, ue7Var, g9eVar.b(), i, z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static qrc d(cxj cxjVar, ue7 ue7Var, int i, boolean z) {
        g9e g9eVar;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrc) ipChange.ipc$dispatch("16288236", new Object[]{cxjVar, ue7Var, new Integer(i), new Boolean(z)});
        }
        qrc qrcVar = new qrc(-1, -1);
        Activity i2 = cxjVar.i();
        if (!(i2 == null || ue7Var == null || (g9eVar = ue7Var.p0) == null || !((g5g) g9eVar).isDataValid() || ((g5g) ue7Var.p0).b() == null)) {
            p(i2);
            int f = oj7.f(i2);
            int b2 = m(cxjVar).b();
            int n = n(cxjVar, ue7Var.p0, i, z);
            String str = cxjVar.j().R().m;
            String b3 = ((g5g) ue7Var.p0).b();
            b3.hashCode();
            switch (b3.hashCode()) {
                case 50861:
                    if (b3.equals(VALUE_THREE_FOUR_RATIO)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1513508:
                    if (b3.equals(VALUE_SIXTEEN_NINE_RATIO)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1755398:
                    if (b3.equals("9:16")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    qrcVar.c = (int) (b2 * 1.3333334f);
                    qrcVar.d = b2;
                    qrcVar.h = ImageView.ScaleType.FIT_CENTER;
                    if (cxjVar.m().r0() && ((!cxjVar.j().k0() || ue7Var.f31127a != 0) && gxq.EXP_ITEM_ARTICLE.equals(str))) {
                        qrcVar.e = (n - qrcVar.c) / 2;
                        break;
                    } else {
                        qrcVar.e = oj7.c(i2) + f;
                        break;
                    }
                    break;
                case 1:
                    qrcVar.c = (int) (b2 * 0.5625f);
                    qrcVar.d = b2;
                    qrcVar.h = ImageView.ScaleType.FIT_CENTER;
                    qrcVar.e = ((i - j(cxjVar, ue7Var.p0, z)) - m(cxjVar).j((int) Math.ceil(DimensionEnum.SIXTEEN_NINE.getHeight()))) / 2;
                    break;
                case 2:
                    qrcVar.c = n;
                    int i3 = (int) (n * 0.5625f);
                    qrcVar.d = i3;
                    if (i3 < b2) {
                        qrcVar.c = n * (b2 / i3);
                        qrcVar.d = b2;
                    }
                    qrcVar.h = ImageView.ScaleType.CENTER_CROP;
                    qrcVar.e = 0;
                    break;
                default:
                    qrcVar.c = b2;
                    qrcVar.d = b2;
                    qrcVar.h = ImageView.ScaleType.FIT_CENTER;
                    if (cxjVar.m().q0() && ((!cxjVar.j().k0() || ue7Var.f31127a != 0) && gxq.EXP_ITEM_ARTICLE.equals(str))) {
                        qrcVar.e = (n - qrcVar.c) / 2;
                        break;
                    } else {
                        qrcVar.e = m(cxjVar).j(100) + oj7.c(i2) + f;
                        break;
                    }
                    break;
            }
            AtmosParams o = cxjVar.j().o();
            if (cxjVar.j().k0() && ue7Var.f31127a == 0) {
                if (VALUE_SIXTEEN_NINE_RATIO.equals(((g5g) ue7Var.p0).b())) {
                    qrcVar.e = m(cxjVar).j(216) + h(cxjVar, o);
                } else {
                    qrcVar.e = h(cxjVar, o);
                }
                if (h(cxjVar, o) == qrcVar.e) {
                    float j = m(cxjVar).j(o.layoutInfo.borderRadius);
                    qrcVar.i = new float[]{j, j, j, j, 0.0f, 0.0f, 0.0f, 0.0f};
                } else {
                    qrcVar.i = null;
                }
            }
        }
        return qrcVar;
    }

    public static qrc e(cxj cxjVar, ue7 ue7Var, g9e g9eVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrc) ipChange.ipc$dispatch("ed3b8ef2", new Object[]{cxjVar, ue7Var, g9eVar, new Integer(i), new Boolean(z)});
        }
        if (g9eVar == null || !g9eVar.isDataValid()) {
            return new qrc(-1, -1);
        }
        return q0i.b(cxjVar, ue7Var, g9eVar.b(), i, z);
    }

    public static double f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e74552be", new Object[0])).doubleValue();
        }
        return Math.floor(75000.0d / g((int) Math.ceil(b / c))) / 100.0d;
    }

    public static double g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86cf1f92", new Object[]{new Integer(i)})).doubleValue();
        }
        return d.doubleValue() * i;
    }

    public static int h(cxj cxjVar, AtmosParams atmosParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("833a11f9", new Object[]{cxjVar, atmosParams})).intValue();
        }
        return m(cxjVar).j(atmosParams.layoutInfo.height) + oj7.c(cxjVar.i()) + oj7.f(cxjVar.i());
    }

    public static int i(cxj cxjVar, AtmosParams atmosParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a07454eb", new Object[]{cxjVar, atmosParams})).intValue();
        }
        return ec7.a(cxjVar.i(), atmosParams.layoutInfo.height / 2) + oj7.c(cxjVar.i()) + oj7.f(cxjVar.i());
    }

    public static int j(cxj cxjVar, g9e g9eVar, boolean z) {
        int l;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe0a9604", new Object[]{cxjVar, g9eVar, new Boolean(z)})).intValue();
        }
        NewDetailScreenConfig m = m(cxjVar);
        if (z) {
            l = 18;
        } else {
            l = l();
        }
        int j = m.j(l);
        int j2 = m(cxjVar).j(98) + j;
        if (g9eVar.j() == null) {
            return j2;
        }
        try {
            int parseInt = Integer.parseInt(g9eVar.j());
            if (parseInt > 0 && "9:16".equals(g9eVar.b()) && (!q() || z)) {
                parseInt = 0;
            }
            if (parseInt != 0) {
                if (parseInt > 0) {
                    i = m(cxjVar).j(parseInt) + j;
                } else {
                    i = j2;
                }
            }
            return i;
        } catch (Exception e) {
            txj.f(txj.TAG_MEDIA_CONTROLLER, "bottomAreaHeight 解析出错", e);
            return j2;
        }
    }

    public static int k(Context context, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e612769", new Object[]{context, new Boolean(z)})).intValue();
        }
        if (z) {
            i = 18;
        } else {
            i = 30;
        }
        return ec7.a(context, (i + 98) / 2);
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab52777a", new Object[0])).intValue();
        }
        if (q()) {
            return 30;
        }
        return 18;
    }

    public static NewDetailScreenConfig m(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailScreenConfig) ipChange.ipc$dispatch("77933f3a", new Object[]{cxjVar});
        }
        return cxjVar.j().K();
    }

    public static int n(cxj cxjVar, g9e g9eVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9585192e", new Object[]{cxjVar, g9eVar, new Integer(i), new Boolean(z)})).intValue();
        }
        return i - j(cxjVar, g9eVar, z);
    }

    public static int o(Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3edf11a9", new Object[]{context, new Integer(i), new Boolean(z)})).intValue();
        }
        return i - k(context, z);
    }

    public static void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314c480c", new Object[]{context});
            return;
        }
        if (c <= 0.1d) {
            c = context.getResources().getDisplayMetrics().density;
        }
        if (b == 0 || f16965a == 0) {
            Point point = new Point();
            ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealSize(point);
            b = point.y;
            f16965a = point.x;
        }
        if (d == null) {
            d = Double.valueOf(750.0d / ((f16965a * 1.0d) / c));
        }
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("511654c8", new Object[0])).booleanValue();
        }
        if (f() <= 0.5d) {
            return true;
        }
        return false;
    }
}
