package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pcw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final int BOTTOM_BAR_HEIGHT = 112;
    public static final int DEFAULT_WND_HEIGHT = 1920;
    public static final int DEFAULT_WND_WIDTH = 1080;
    @Deprecated
    public static final int GUIDE_SHOPPING_BOTTOM_BAR_HEIGHT = 120;
    public static final float HIGH_ACTION_BAR_RATIO = 1.9444444f;
    @Deprecated
    public static final int LOW_BOTTOM_BAR_HEIGHT = 92;
    public static final int NEW_VERTICAL_BAR_HEIGHT = 112;
    @Deprecated
    public static final int TB_BOTTOM_BAR_HEIGHT = 48;
    public static final int TOPBAR_HEIGHT = 88;
    public static final int TOPBAR_TOP_Y = 71;

    static {
        t2o.a(468714559);
    }

    public static q8e a(FluidContext fluidContext, boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q8e) ipChange.ipc$dispatch("800baf88", new Object[]{fluidContext, new Boolean(z), new Integer(i), new Boolean(z2)});
        }
        q8e q8eVar = new q8e();
        q8eVar.f26579a = pto.g(fluidContext);
        q8eVar.b = pto.i(fluidContext);
        FluidInstanceConfig instanceConfig = fluidContext.getInstanceConfig();
        q8eVar.f = instanceConfig.getTopBarHeight();
        q8eVar.g = instanceConfig.getTopBarY();
        q8eVar.c = z;
        q8eVar.d = z2;
        q8eVar.e = i;
        return q8eVar;
    }

    public static String b(r8e r8eVar, ViewGroup viewGroup) {
        TextureView b;
        Bitmap bitmap;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78540951", new Object[]{r8eVar, viewGroup});
        }
        if (viewGroup == null || (b = hg2.b(viewGroup)) == null || (bitmap = b.getBitmap()) == null) {
            return null;
        }
        Component.k kVar = new Component.k();
        kVar.c = bitmap;
        kVar.b = nwv.x(b);
        kVar.d = "#000000";
        if (r8eVar != null) {
            if (r8eVar.f == ImageView.ScaleType.CENTER_CROP) {
                str = "cover";
            } else {
                str = "contain";
            }
            kVar.f = str;
        }
        String str2 = "videobitmap_" + kVar;
        ut2.q(str2, kVar);
        return str2;
    }

    public static void c(r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbdfd9f3", new Object[]{r8eVar});
            return;
        }
        r8eVar.f = ImageView.ScaleType.CENTER_CROP;
        int i = r8eVar.d;
        int i2 = r8eVar.b;
        float f = (i * 1.0f) / i2;
        int i3 = r8eVar.c;
        int i4 = r8eVar.f27190a;
        float f2 = (i3 * 1.0f) / i4;
        if (f < f2) {
            r8eVar.g = (int) (i2 * f2);
            r8eVar.h = i3;
            return;
        }
        r8eVar.g = i;
        r8eVar.h = (int) (i4 * f);
    }

    public static boolean d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2240bce", new Object[]{fluidContext})).booleanValue();
        }
        if (!ws6.c() || !s(fluidContext)) {
            return false;
        }
        return true;
    }

    public static boolean e(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94b2b6d7", new Object[]{new Boolean(z), new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!z && (i2 * 1.0f) / i < 1.9444444f) {
            return false;
        }
        return true;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25c0733c", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableActionBarHeight48Dp", true);
    }

    public static void g(r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd56712", new Object[]{r8eVar});
            return;
        }
        r8eVar.f = ImageView.ScaleType.FIT_CENTER;
        ir9.b("VideoUtils", "[画幅]计算内部逻辑计算完成，fitCenter start ,IVideoCommentSizeObject:" + r8eVar);
        int i = r8eVar.d;
        int i2 = r8eVar.b;
        float f = (i * 1.0f) / i2;
        int i3 = r8eVar.c;
        int i4 = r8eVar.f27190a;
        float f2 = (i3 * 1.0f) / i4;
        if (f > f2) {
            r8eVar.g = (int) (i2 * f2);
            r8eVar.h = i3;
        } else {
            r8eVar.g = i;
            int i5 = (int) (i4 * f);
            r8eVar.h = i5;
            int i6 = (i3 - i5) / 2;
            r8eVar.e = i6;
            r8eVar.c = i5;
            ir9.b("VideoUtils", "[画幅] 修改showHeight为视频真实高度 " + r8eVar.c + " showMarginTop=" + i6);
        }
        ir9.b("VideoUtils", "[画幅]计算内部逻辑计算完成，fitCenter end,IVideoCommentSizeObject:" + r8eVar);
    }

    public static void h(r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f090e", new Object[]{r8eVar});
            return;
        }
        r8eVar.f = ImageView.ScaleType.FIT_CENTER;
        int i = r8eVar.d;
        int i2 = r8eVar.b;
        float f = (i * 1.0f) / i2;
        int i3 = r8eVar.c;
        int i4 = r8eVar.f27190a;
        float f2 = (i3 * 1.0f) / i4;
        if (f > f2) {
            r8eVar.g = (int) (i2 * f2);
            r8eVar.h = i3;
        } else {
            r8eVar.g = i;
            r8eVar.h = (int) (i4 * f);
        }
        int i5 = r8eVar.h;
        r8eVar.k = i5;
        r8eVar.e = (i3 - i5) / 2;
    }

    public static String i(FluidContext fluidContext) {
        a activeCardMediaSetData;
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94ef99f9", new Object[]{fluidContext});
        }
        if (fluidContext == null || (activeCardMediaSetData = ((ICardService) fluidContext.getService(ICardService.class)).getActiveCardMediaSetData()) == null || (e = activeCardMediaSetData.e()) == null) {
            return "";
        }
        return e.c;
    }

    public static float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6a772a", new Object[0])).floatValue();
        }
        return nwv.q(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("cutMaxRatio", "0.2"), 0.2f);
    }

    public static int k(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98a21404", new Object[]{fluidContext})).intValue();
        }
        if (hn4.o(fluidContext)) {
            return 120;
        }
        if (!pto.g(fluidContext) || !f()) {
            return 112;
        }
        int c = pr9.c(p91.a(), 48);
        if (f2k.d(fluidContext)) {
            return pr9.o(c);
        }
        return s6o.J(p91.a(), c);
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ead2177", new Object[0])).intValue();
        }
        return 84;
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76b46ab", new Object[0])).intValue();
        }
        return (int) ((pr9.f() / 750.0f) * 0.0f);
    }

    public static int n(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7628f6be", new Object[]{fluidContext})).intValue();
        }
        return 92;
    }

    public static int o(FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d66910b", new Object[]{fluidInstance})).intValue();
        }
        return fluidInstance.getInstanceConfig().getTopBarHeight();
    }

    public static int p(FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ca1df2a", new Object[]{fluidInstance})).intValue();
        }
        return q(fluidInstance) + o(fluidInstance);
    }

    public static int q(FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1df1f230", new Object[]{fluidInstance})).intValue();
        }
        return fluidInstance.getInstanceConfig().getTopBarY();
    }

    public static boolean s(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("163e2e7c", new Object[]{fluidContext})).booleanValue();
        }
        return ((IDataService) fluidContext.getService(IDataService.class)).isHasPageErrorShow();
    }

    public static void u(FluidContext fluidContext, q8e q8eVar, int i, int i2, r8e r8eVar) {
        float R;
        int R2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7f62c1", new Object[]{fluidContext, q8eVar, new Integer(i), new Integer(i2), r8eVar});
            return;
        }
        g(r8eVar);
        if (q8eVar != null) {
            int i3 = q8eVar.f;
            int i4 = q8eVar.g;
            Integer valueOf = Integer.valueOf(i4);
            int i5 = i3 + i4;
            Integer valueOf2 = Integer.valueOf(i5);
            if (f2k.d(fluidContext)) {
                R = pr9.q(i5);
                R2 = pr9.q(i4);
            } else {
                R = s6o.R(p91.a(), valueOf2.floatValue());
                R2 = s6o.R(p91.a(), valueOf.floatValue());
            }
            float f = R2;
            float f2 = ((i2 - r8eVar.h) * 1.0f) / 2.0f;
            if (f2 <= R && f2 >= f) {
                int z = s6o.z(p91.a());
                r8eVar.e = z;
                r8eVar.c = i2 - z;
                c(r8eVar);
            }
        }
    }

    public static <T> void v(List<WeakReference<T>> list, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec84b3b", new Object[]{list, t});
            return;
        }
        Iterator<WeakReference<T>> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().get() == t) {
                it.remove();
            }
        }
    }

    public static void w(FluidContext fluidContext, int i, int i2, r8e r8eVar, q8e q8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacb36da", new Object[]{fluidContext, new Integer(i), new Integer(i2), r8eVar, q8eVar});
        } else if (r8eVar != null) {
            int i3 = r8eVar.b;
            int i4 = r8eVar.f27190a;
            if (i3 == 0 || i4 == 0) {
                r8eVar.d = i;
                r8eVar.c = i2;
                return;
            }
            r8eVar.d = i;
            if (q8eVar != null) {
                ir9.b("VideoUtils", "画幅计算内部逻辑，wndW：" + i + ",wndH:" + i2 + ",IVideoCommentSizeObject:" + r8eVar + ",config:" + q8eVar);
                if (f2k.d(fluidContext)) {
                    x(fluidContext, i, i2, r8eVar, q8eVar);
                    return;
                }
                boolean z = q8eVar.c;
                float f = z ? 0.065f : 0.05f;
                if (i2 > i) {
                    float f2 = i3 / i4;
                    int i5 = i2 - q8eVar.e;
                    float f3 = i / i5;
                    if (f3 + f < f2) {
                        r8eVar.c = i5;
                        if (q8eVar.f26579a) {
                            u(fluidContext, q8eVar, i, i2, r8eVar);
                        } else if (q8eVar.d) {
                            h(r8eVar);
                        } else {
                            g(r8eVar);
                        }
                    } else if (f3 - f <= f2) {
                        r8eVar.c = i5;
                        c(r8eVar);
                    } else {
                        r8eVar.c = i2;
                        if (q8eVar.b) {
                            r8eVar.c = i5;
                        }
                        c(r8eVar);
                    }
                } else {
                    float f4 = i4 / i3;
                    int i6 = z ? i2 - q8eVar.e : i2;
                    r8eVar.c = i6;
                    if (Math.abs((i6 / i) - f4) >= 0.16666667f) {
                        g(r8eVar);
                    } else {
                        c(r8eVar);
                    }
                }
                r8eVar.j = i2;
                ir9.b("VideoUtils", "[画幅]计算内部逻辑计算完成，wndW：" + i + ",wndH:" + i2 + ",IVideoCommentSizeObject:" + r8eVar + ",config:" + q8eVar);
            }
        }
    }

    public static void x(FluidContext fluidContext, int i, int i2, r8e r8eVar, q8e q8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("decbd1d2", new Object[]{fluidContext, new Integer(i), new Integer(i2), r8eVar, q8eVar});
            return;
        }
        int i3 = r8eVar.b;
        int i4 = r8eVar.f27190a;
        int i5 = i2 - q8eVar.e;
        float f = i4 / i3;
        float f2 = i;
        float f3 = i5 / f2;
        if (pr9.k()) {
            r8eVar.c = i5;
            g(r8eVar);
        } else if (i2 > i) {
            float f4 = f3 > f ? (f3 - f) / f3 : (f - f3) / f;
            r8eVar.c = i5;
            if (f4 <= j()) {
                c(r8eVar);
            } else if (q8eVar.d) {
                h(r8eVar);
            } else {
                g(r8eVar);
            }
            ir9.b("VideoUtils", "resizeVideoInternalNew:videoR:" + f + ", winR:" + f3 + " ,cutMaxRatio: " + j() + "result:" + r8eVar);
        } else {
            int i6 = q8eVar.c ? i2 - q8eVar.e : i2;
            r8eVar.c = i6;
            if (Math.abs((i6 / f2) - f) >= 0.16666667f) {
                g(r8eVar);
            } else {
                c(r8eVar);
            }
        }
        r8eVar.j = i2;
        ir9.b("VideoUtils", "[画幅]计算内部逻辑计算完成，wndW：" + i + ",wndH:" + i2 + ",IVideoCommentSizeObject:" + r8eVar + ",config:" + q8eVar);
    }

    public static FrameLayout.LayoutParams y(Context context, r8e r8eVar, boolean z, FluidContext fluidContext) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("4dc05862", new Object[]{context, r8eVar, new Boolean(z), fluidContext});
        }
        if (b93.n(fluidContext)) {
            z = true;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r8eVar.d, r8eVar.c);
        if (z) {
            i = r8eVar.e;
        } else {
            i = s6o.z(context);
        }
        layoutParams.topMargin = i;
        layoutParams.width = r8eVar.d;
        layoutParams.height = r8eVar.c;
        return layoutParams;
    }

    public static Pair<Integer, Integer> r(Uri uri) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("33118a86", new Object[]{uri});
        }
        rv4 b = qv4.c().b(uri.getQueryParameter(FullPage.PRE_PLAYER_MAP_KEY));
        if (b != null ? b.q() : false) {
            i = b.g();
            i2 = b.m();
        } else {
            try {
                i = !TextUtils.isEmpty(uri.getQueryParameter("videoHeight")) ? Integer.parseInt(uri.getQueryParameter("videoHeight")) : 0;
                try {
                    if (!TextUtils.isEmpty(uri.getQueryParameter("videoWidth"))) {
                        i2 = Integer.parseInt(uri.getQueryParameter("videoWidth"));
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                i = 0;
            }
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static boolean t(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("385c237d", new Object[]{uri})).booleanValue();
        }
        rv4 b = qv4.c().b(uri.getQueryParameter(FullPage.PRE_PLAYER_MAP_KEY));
        if (b != null) {
            return b.q();
        }
        return false;
    }

    public static void z(atb atbVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969584b3", new Object[]{atbVar, map});
        } else if (map != null && atbVar != null) {
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : entrySet) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                }
            }
            String sb2 = sb.toString();
            ir9.b("dWInstance", "updatePlayExtParams， finalParam：" + sb2);
            HashMap hashMap = new HashMap(1);
            hashMap.put(sj4.KEY_VIDEO_UPDATE_PARAMS, sb2);
            atbVar.v(hashMap);
        }
    }
}
