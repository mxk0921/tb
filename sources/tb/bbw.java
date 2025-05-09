package tb;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.taobao.R;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bbw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TABLET_BOTTOM_LABEL_HEIGHT = 114;

    static {
        t2o.a(468714100);
    }

    public static void a(r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd56712", new Object[]{r8eVar});
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
            return;
        }
        r8eVar.g = i;
        r8eVar.h = (int) (i4 * f);
    }

    public static int b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12bb3347", new Object[]{new Boolean(z)})).intValue();
        }
        if (z) {
            return 0;
        }
        return 112;
    }

    public static int c(FluidContext fluidContext, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff6f92c5", new Object[]{fluidContext, context, new Boolean(z)})).intValue();
        }
        if (f2k.d(fluidContext)) {
            return pr9.q(b(z));
        }
        return s6o.S(context, b(z));
    }

    public static int d(FluidContext fluidContext) {
        int n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44b785bb", new Object[]{fluidContext})).intValue();
        }
        if (f2k.d(fluidContext)) {
            return 0;
        }
        if (pr9.j()) {
            Application a2 = p91.a();
            return s6o.P(a2, pr9.n(a2, 114));
        }
        boolean isHighActionbar = ((IContainerService) fluidContext.getService(IContainerService.class)).isHighActionbar();
        int oldActionBarHeight = ((IContainerService) fluidContext.getService(IContainerService.class)).getOldActionBarHeight();
        if (oldActionBarHeight == 0) {
            return oldActionBarHeight;
        }
        if (isHighActionbar) {
            n = pcw.k(fluidContext);
        } else {
            n = pcw.n(fluidContext);
        }
        return n;
    }

    public static int e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99d34110", new Object[]{fluidContext})).intValue();
        }
        if (f2k.d(fluidContext)) {
            return 0;
        }
        if (!pr9.j()) {
            return b(pto.q(fluidContext));
        }
        if (b93.n(fluidContext) && pto.q(fluidContext)) {
            return 0;
        }
        Application a2 = p91.a();
        return s6o.P(a2, pr9.n(a2, 114));
    }

    public static DWAspectRatio f(boolean z, r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWAspectRatio) ipChange.ipc$dispatch("23243082", new Object[]{new Boolean(z), r8eVar});
        }
        DWAspectRatio dWAspectRatio = DWAspectRatio.DW_CENTER_CROP;
        if (!pr9.m() || r8eVar == null) {
            if (z) {
                return DWAspectRatio.DW_FIT_CENTER;
            }
            return dWAspectRatio;
        } else if (r8eVar.f == ImageView.ScaleType.CENTER_CROP) {
            return dWAspectRatio;
        } else {
            return DWAspectRatio.DW_FIT_CENTER;
        }
    }

    @Deprecated
    public static int g(FluidContext fluidContext, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa02bd13", new Object[]{fluidContext, context, new Boolean(z)})).intValue();
        }
        if (!z) {
            return 92;
        }
        if (hrm.a().b().b()) {
            return 120;
        }
        int c = pr9.c(context, 48);
        if (f2k.d(fluidContext)) {
            return pr9.o(c);
        }
        return s6o.J(context, c);
    }

    @Deprecated
    public static int h(FluidContext fluidContext, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb048d47", new Object[]{fluidContext, context, new Boolean(z)})).intValue();
        }
        if (f2k.d(fluidContext)) {
            return pr9.q(g(fluidContext, context, z));
        }
        return s6o.S(context, g(fluidContext, context, z));
    }

    public static Pair<r8e, FrameLayout.LayoutParams> i(FluidContext fluidContext, boolean z) {
        r8e r8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("88729c34", new Object[]{fluidContext, new Boolean(z)});
        }
        boolean f = f4h.f(z);
        if (pr9.j()) {
            int windowWidth = ((IContainerService) fluidContext.getService(IContainerService.class)).getWindowWidth();
            int windowHeight = ((IContainerService) fluidContext.getService(IContainerService.class)).getWindowHeight();
            if (windowWidth > windowHeight) {
                r8eVar = new r8e(fluidContext, 1080, 1920);
            } else {
                r8eVar = new r8e(fluidContext, windowWidth, windowHeight);
            }
            j(fluidContext, windowWidth, windowHeight, false, 0, r8eVar, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r8eVar.g, r8eVar.h);
            layoutParams.topMargin = r8eVar.e;
            return new Pair<>(r8eVar, layoutParams);
        } else if (!f) {
            return null;
        } else {
            r8e r8eVar2 = new r8e(fluidContext, ((IContainerService) fluidContext.getService(IContainerService.class)).getWindowWidth(), ((IContainerService) fluidContext.getService(IContainerService.class)).getWindowHeight());
            r8eVar2.f = ImageView.ScaleType.CENTER_CROP;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(s6o.v(FluidSDK.getContext()), s6o.t(FluidSDK.getContext()));
            layoutParams2.topMargin = -s6o.z(FluidSDK.getContext());
            return new Pair<>(r8eVar2, layoutParams2);
        }
    }

    public static void j(FluidContext fluidContext, int i, int i2, boolean z, int i3, r8e r8eVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355e5f24", new Object[]{fluidContext, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), r8eVar, new Boolean(z2)});
            return;
        }
        q8e a2 = pcw.a(fluidContext, z, i3, z2);
        ir9.b("VideoSizeUtil", "全屏页内部画幅计算大屏，wndW：" + i + ",wndH:" + i2 + ",\nIVideoCommentSizeObject:" + r8eVar.toString() + ",\nconfig:" + a2);
        if (hn4.f(fluidContext)) {
            pcw.w(fluidContext, i, i2, r8eVar, a2);
        } else if (pr9.j()) {
            k(i, i2, r8eVar, a2);
        } else {
            pcw.w(fluidContext, i, i2, r8eVar, a2);
        }
    }

    public static void k(int i, int i2, r8e r8eVar, q8e q8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1077c606", new Object[]{new Integer(i), new Integer(i2), r8eVar, q8eVar});
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
                ir9.b("VideoSizeUtil", "[画幅]画幅计算内部逻辑大屏，wndW：" + i + ",wndH:" + i2 + ",IVideoCommentSizeObject:" + r8eVar + ",config:" + q8eVar);
                r8eVar.c = i2 - q8eVar.e;
                a(r8eVar);
                ir9.b("VideoSizeUtil", "[画幅]画幅计算内部逻辑计算完成大屏，wndW：" + i + ",wndH:" + i2 + ",IVideoCommentSizeObject:" + r8eVar + ",config:" + q8eVar);
            }
        }
    }

    public static r8e l(Context context, View view, boolean z, boolean z2, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8e) ipChange.ipc$dispatch("bad38aff", new Object[]{context, view, new Boolean(z), new Boolean(z2), fluidContext});
        }
        if (view == null) {
            return null;
        }
        int i = R.id.fluid_sdk_tag_prerender_videosize_object;
        r8e r8eVar = (r8e) view.getTag(i);
        if (pr9.j()) {
            return r8eVar;
        }
        int b = p91.b(context, z, fluidContext);
        int v = s6o.v(context);
        ir9.b("VideoSizeUtil", "[画幅]setTab3QuickRenderPreCreateDWVideoSize:,availableHeight:" + b + ",wndWidth:" + v + ",wndHeight:" + b + "getRealWidthPixels:" + s6o.v(context) + ",getRealHeightPixels:" + s6o.t(context) + "，isTab3GuideShoppingVersion：" + z2);
        if (r8eVar == null) {
            r8eVar = new r8e(fluidContext, v, b);
        }
        q8e q8eVar = new q8e();
        q8eVar.f26579a = z;
        q8eVar.c = pcw.e(z2, v, b);
        if (f2k.d(fluidContext)) {
            q8eVar.e = 0;
        } else if (b93.n(fluidContext)) {
            q8eVar.e = c(fluidContext, context, pto.p(context, z));
        } else {
            q8eVar.e = h(fluidContext, context, q8eVar.c);
        }
        if (pr9.j()) {
            k(v, b, r8eVar, q8eVar);
        } else {
            pcw.w(fluidContext, v, b, r8eVar, q8eVar);
        }
        view.setTag(i, r8eVar);
        return r8eVar;
    }
}
