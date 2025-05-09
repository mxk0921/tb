package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ali.user.open.core.model.SystemMessageConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.ImgChannelDetectManager;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.pipline.node.ImageCodeDetectNode;
import com.etao.feimagesearch.pipline.node.ImageDetectNode;
import com.etao.feimagesearch.pipline.node.ImageTranslateNode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a8m INSTANCE = new a8m();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Long, v7m> f15598a = new LinkedHashMap();
    public static final Map<Long, IrpDatasource> b = new LinkedHashMap();

    static {
        t2o.a(481297333);
    }

    @JvmStatic
    public static final void e(Bitmap bitmap, PhotoFrom photoFrom, List<RectF> list, jl0 jl0Var, yr3 yr3Var, long j, Map<String, String> map, Map<String, String> map2, Integer num, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c8af82", new Object[]{bitmap, photoFrom, list, jl0Var, yr3Var, new Long(j), map, map2, num, new Integer(i)});
            return;
        }
        ckf.g(bitmap, "sourceBitmap");
        ckf.g(photoFrom, "photoFrom");
        ckf.g(jl0Var, "algoInfo");
        ckf.g(yr3Var, "cameraPageModel");
        IrpDatasource c = IrpDatasource.Companion.c(bitmap, list, photoFrom, yr3Var, map, map2);
        RectF rectF = (list == null || list.size() <= 0) ? null : list.get(0);
        if (cnu.b(jl0Var)) {
            c.A().put("hasCropedImage", "true");
        }
        c.q0(j);
        Boolean S2 = lg4.S2();
        if (S2 != null) {
            c.m().put("isNewCapture", String.valueOf(S2.booleanValue()));
        }
        v7m v7mVar = new v7m(w7m.Companion.a(c));
        v7mVar.i(INSTANCE.k(c, rectF, jl0Var, num, Integer.valueOf(i), photoFrom), true);
        v(v7mVar, c, Long.valueOf(j));
    }

    @JvmStatic
    public static final void f(Bitmap bitmap, String str, String str2, yr3 yr3Var, long j, Map<String, String> map, Map<String, String> map2, boolean z, Integer num, int i, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28eaccd8", new Object[]{bitmap, str, str2, yr3Var, new Long(j), map, map2, new Boolean(z), num, new Integer(i), photoFrom});
            return;
        }
        ckf.g(bitmap, "sourceBitmap");
        ckf.g(yr3Var, "cameraPageModel");
        ckf.g(map, "extraParams");
        IrpDatasource d = IrpDatasource.Companion.d(bitmap, str, str2, yr3Var, map, map2, photoFrom);
        d.q0(j);
        Boolean S2 = lg4.S2();
        if (S2 != null) {
            d.m().put("isNewCapture", String.valueOf(S2.booleanValue()));
        }
        v7m v7mVar = new v7m(w7m.Companion.a(d));
        if (z) {
            v7mVar.i(INSTANCE.r(), true);
        } else {
            v7mVar.i(INSTANCE.m(d, false, null, num, Integer.valueOf(i)), true);
        }
        v(v7mVar, d, Long.valueOf(j));
    }

    public static /* synthetic */ yy1 n(a8m a8mVar, IrpDatasource irpDatasource, boolean z, RectF rectF, Integer num, Integer num2, int i, Object obj) {
        RectF rectF2;
        Integer num3;
        Integer num4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("2b5da93a", new Object[]{a8mVar, irpDatasource, new Boolean(z), rectF, num, num2, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            rectF2 = null;
        } else {
            rectF2 = rectF;
        }
        if ((i & 8) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 16) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        return a8mVar.m(irpDatasource, z, rectF2, num3, num4);
    }

    @JvmStatic
    public static final yy1 o(v3o v3oVar) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("611929ae", new Object[]{v3oVar});
        }
        bme bmeVar = new bme(true);
        bmeVar.l(new wne(false, false, null, 0, 1200, null, 43, null));
        yy1 g = bmeVar.g();
        ckf.d(g);
        String str4 = null;
        if (v3oVar == null) {
            str = null;
        } else {
            str = v3oVar.c();
        }
        if (v3oVar == null) {
            str2 = null;
        } else {
            str2 = v3oVar.a();
        }
        if (v3oVar == null) {
            str3 = null;
        } else {
            str3 = v3oVar.b();
        }
        if (v3oVar != null) {
            str4 = v3oVar.d();
        }
        g.l(new foe(str, str2, str3, null, null, false, true, null, str4, false, 184, null));
        return bmeVar;
    }

    @JvmStatic
    public static final IrpDatasource p(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpDatasource) ipChange.ipc$dispatch("4e25253e", new Object[]{l});
        }
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        return b.remove(l);
    }

    @JvmStatic
    public static final v7m q(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v7m) ipChange.ipc$dispatch("52c04b4b", new Object[]{l});
        }
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        return f15598a.remove(l);
    }

    @JvmStatic
    public static final yy1 u(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("f106a114", new Object[]{num});
        }
        bme bmeVar = new bme(true);
        bmeVar.l(new wne(false, false, null, 0, 1200, null, 43, null));
        yy1 g = bmeVar.g();
        ckf.d(g);
        g.l(new ImageTranslateNode(null, null, false, 7, null));
        yy1 g2 = g.g();
        ckf.d(g2);
        g2.l(new foe(lg4.K3(), lg4.F1(), lg4.G1(), null, null, false, true, null, null, false, SystemMessageConstants.JS_BRIDGE_ANNOTATION_NOT_PRESENT, null));
        return bmeVar;
    }

    @JvmStatic
    public static final void v(v7m v7mVar, IrpDatasource irpDatasource, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e2b505", new Object[]{v7mVar, irpDatasource, l});
        } else if (v7mVar != null && irpDatasource != null && l != null && l.longValue() > 0) {
            f15598a.put(l, v7mVar);
            b.put(l, irpDatasource);
        }
    }

    public final yy1 k(IrpDatasource irpDatasource, RectF rectF, jl0 jl0Var, Integer num, Integer num2, PhotoFrom photoFrom) {
        yy1 yy1Var;
        RectF rectF2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("fad2508b", new Object[]{this, irpDatasource, rectF, jl0Var, num, num2, photoFrom});
        }
        if (cnu.a(jl0Var)) {
            bme bmeVar = new bme(true);
            if (cnu.b(jl0Var)) {
                bmeVar.l(new fke(rectF));
                yy1Var = bmeVar.g();
                ckf.d(yy1Var);
            } else {
                yy1Var = bmeVar;
            }
            if (zmf.e(num2)) {
                yy1Var.l(new ImageCodeDetectNode(num, null, 2, null));
                yy1Var = yy1Var.g();
                ckf.d(yy1Var);
            }
            yy1Var.l(new ImageDetectNode(false, false, 3, null));
            yy1 g = yy1Var.g();
            ckf.d(g);
            if (cnu.c(jl0Var)) {
                rectF2 = rectF;
            } else {
                rectF2 = null;
            }
            g.l(new wne(false, false, rectF2, 0, 0, null, 59, null));
            yy1 g2 = g.g();
            ckf.d(g2);
            g2.l(new foe(lg4.H1(irpDatasource.y()), lg4.F1(), lg4.G1(), null, null, false, true, null, null, false, 944, null));
            return bmeVar;
        } else if (PhotoFrom.Values.META_SIGHT == photoFrom) {
            return n(this, irpDatasource, false, rectF, null, null, 24, null);
        } else {
            return n(this, irpDatasource, false, null, num, num2, 4, null);
        }
    }

    public final yy1 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("83ccf09d", new Object[]{this});
        }
        bme bmeVar = new bme(false);
        bmeVar.l(new foe("29111", lg4.K1(), lg4.L1(), null, null, false, true, null, null, false, 944, null));
        return bmeVar;
    }

    public final yy1 m(IrpDatasource irpDatasource, boolean z, RectF rectF, Integer num, Integer num2) {
        yy1 yy1Var;
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("451708c0", new Object[]{this, irpDatasource, new Boolean(z), rectF, num, num2});
        }
        bme bmeVar = new bme(true);
        if (hx8.Companion.a().h(num2)) {
            yy1Var = new ile(num);
            bmeVar.l(yy1Var);
        } else {
            yy1Var = bmeVar;
        }
        if (zmf.e(num2)) {
            ImageCodeDetectNode imageCodeDetectNode = new ImageCodeDetectNode(num, null, 2, null);
            yy1Var.l(imageCodeDetectNode);
            yy1Var = imageCodeDetectNode;
        }
        if (num2 == null && lg4.p0()) {
            yy1Var.l(new kle(num, null, 2, null));
            yy1Var = yy1Var.g();
            ckf.d(yy1Var);
        }
        boolean f4 = lg4.f4(irpDatasource.y());
        if (z || f4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !f4) {
            z3 = false;
        }
        yy1Var.l(new ImageDetectNode(z2, z3));
        yy1 g = yy1Var.g();
        ckf.d(g);
        if (z && ImgChannelDetectManager.Companion.a(num2)) {
            g.l(new yie(num));
            g = g.g();
            ckf.d(g);
        }
        g.l(new wne(false, false, rectF, 0, 0, null, 59, null));
        yy1 g2 = g.g();
        ckf.d(g2);
        if (num2 != null && hre.e(num2)) {
            g2.l(new kle(num, null, 2, null));
            g2 = g2.g();
            ckf.d(g2);
        }
        g2.l(new foe(lg4.H1(irpDatasource.y()), lg4.F1(), lg4.G1(), null, null, false, true, null, null, false, 944, null));
        return bmeVar;
    }

    public final yy1 r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("75db41b3", new Object[]{this});
        }
        bme bmeVar = new bme(true);
        bmeVar.l(new mme());
        return bmeVar;
    }

    public final yy1 s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("c176f10", new Object[]{this, str});
        }
        foe foeVar = new foe(lg4.H1(str), lg4.F1(), lg4.G1(), null, null, false, true, null, null, false, 944, null);
        foeVar.l(new bme(false, 1, null));
        return foeVar;
    }

    public final yy1 t(smf smfVar) {
        ImageCodeDetectNode imageCodeDetectNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("c6b43eb8", new Object[]{this, smfVar});
        }
        yy1 bmeVar = new bme(false);
        Map<String, String> g = smfVar.g();
        if (g == null) {
            imageCodeDetectNode = bmeVar;
        } else {
            imageCodeDetectNode = new kle(null, g);
            bmeVar.l(imageCodeDetectNode);
        }
        List<zmf.a> f = smfVar.f();
        if (f != null) {
            ImageCodeDetectNode imageCodeDetectNode2 = new ImageCodeDetectNode(null, f);
            imageCodeDetectNode.l(imageCodeDetectNode2);
            imageCodeDetectNode = imageCodeDetectNode2;
        }
        Integer[] d = smfVar.d();
        if (d != null) {
            wne wneVar = new wne(false, false, null, 0, 0, d, 31, null);
            imageCodeDetectNode.l(wneVar);
            imageCodeDetectNode = wneVar;
        }
        imageCodeDetectNode.l(new foe(null, null, null, null, null, false, false, smfVar.e(), null, false, 895, null));
        return bmeVar;
    }

    @JvmStatic
    public static final void a(Uri uri, Bitmap bitmap, int i, PhotoFrom photoFrom, yr3 yr3Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b6e22b", new Object[]{uri, bitmap, new Integer(i), photoFrom, yr3Var, new Long(j)});
            return;
        }
        ckf.g(uri, "imgUri");
        ckf.g(photoFrom, "photoFrom");
        ckf.g(yr3Var, "cameraPageModel");
        IrpDatasource a2 = IrpDatasource.Companion.a(uri, bitmap, i, photoFrom, yr3Var);
        a2.q0(j);
        v7m v7mVar = new v7m(w7m.Companion.a(a2));
        v7mVar.i(o(yr3Var.getAssignRequestConfig()), true);
        v(v7mVar, a2, Long.valueOf(j));
    }

    @JvmStatic
    public static final void d(Bitmap bitmap, String str, IrpParamModel irpParamModel, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc4b21c", new Object[]{bitmap, str, irpParamModel, new Long(j), map});
            return;
        }
        ckf.g(bitmap, "sourceBitmap");
        ckf.g(irpParamModel, "irpParamModel");
        ckf.g(map, "extraParams");
        IrpDatasource b2 = IrpDatasource.Companion.b(bitmap, str, irpParamModel, map);
        b2.q0(j);
        v7m v7mVar = new v7m(w7m.Companion.a(b2));
        v7mVar.i(n(INSTANCE, b2, false, b2.h(), null, null, 24, null), true);
        v(v7mVar, b2, Long.valueOf(j));
    }

    @JvmStatic
    public static final void g(Bitmap bitmap, IrpParamModel irpParamModel, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44ff55f", new Object[]{bitmap, irpParamModel, photoFrom});
            return;
        }
        ckf.g(bitmap, "sourceBitmap");
        ckf.g(irpParamModel, "pageModel");
        ckf.g(photoFrom, "photoFrom");
        IrpDatasource e = IrpDatasource.Companion.e(bitmap, photoFrom, irpParamModel);
        e.q0(irpParamModel.getSessionId());
        v7m v7mVar = new v7m(w7m.Companion.a(e));
        v7mVar.i(n(INSTANCE, e, false, null, null, null, 28, null), true);
        v(v7mVar, e, Long.valueOf(irpParamModel.getSessionId()));
    }

    @JvmStatic
    public static final long h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d439c3db", new Object[]{map})).longValue();
        }
        ckf.g(map, "intentParams");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        IrpDatasource f = IrpDatasource.Companion.f(map);
        f.q0(elapsedRealtime);
        v7m v7mVar = new v7m(w7m.Companion.a(f));
        if (f.Z()) {
            v7mVar.i(new jkf(), true);
        } else if (f.c0()) {
            v7mVar.i(INSTANCE.l(), true);
        } else if (f.a0()) {
            v7mVar.i(INSTANCE.s(f.y()), true);
        } else {
            v7mVar.i(n(INSTANCE, f, false, f.h(), null, null, 24, null), true);
        }
        v(v7mVar, f, Long.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }

    @JvmStatic
    public static final long i(smf smfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64299661", new Object[]{smfVar})).longValue();
        }
        ckf.g(smfVar, "rebuildCache");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        IrpDatasource g = IrpDatasource.Companion.g(smfVar);
        g.q0(elapsedRealtime);
        v7m v7mVar = new v7m(w7m.Companion.a(g));
        v7mVar.i(INSTANCE.t(smfVar), true);
        v(v7mVar, g, Long.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }

    @JvmStatic
    public static final void j(Bitmap bitmap, String str, String str2, yr3 yr3Var, long j, Map<String, String> map, Map<String, String> map2, Integer num, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e460b7b", new Object[]{bitmap, str, str2, yr3Var, new Long(j), map, map2, num, photoFrom});
            return;
        }
        ckf.g(bitmap, "sourceBitmap");
        ckf.g(yr3Var, "cameraPageModel");
        ckf.g(map, "extraParams");
        IrpDatasource d = IrpDatasource.Companion.d(bitmap, str, str2, yr3Var, map, map2, photoFrom);
        d.q0(j);
        v7m v7mVar = new v7m(w7m.Companion.a(d));
        v7mVar.i(u(num), true);
        v(v7mVar, d, Long.valueOf(j));
    }

    @JvmStatic
    public static final void b(Bitmap bitmap, String str, String str2, yr3 yr3Var, long j, Map<String, String> map, Map<String, String> map2, PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d532ae07", new Object[]{bitmap, str, str2, yr3Var, new Long(j), map, map2, photoFrom});
            return;
        }
        ckf.g(bitmap, "sourceBitmap");
        ckf.g(yr3Var, "cameraPageModel");
        ckf.g(map, "extraParams");
        IrpDatasource d = IrpDatasource.Companion.d(bitmap, str, str2, yr3Var, map, map2, photoFrom);
        d.q0(j);
        v7m v7mVar = new v7m(w7m.Companion.a(d));
        v7mVar.i(o(yr3Var.getAssignRequestConfig()), true);
        v(v7mVar, d, Long.valueOf(j));
    }

    @JvmStatic
    public static final void c(Uri uri, Bitmap bitmap, int i, PhotoFrom photoFrom, yr3 yr3Var, long j, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fd95a9", new Object[]{uri, bitmap, new Integer(i), photoFrom, yr3Var, new Long(j), new Integer(i2), new Integer(i3), str});
            return;
        }
        ckf.g(uri, "imgUri");
        ckf.g(photoFrom, "photoFrom");
        ckf.g(yr3Var, "cameraPageModel");
        IrpDatasource a2 = IrpDatasource.Companion.a(uri, bitmap, i, photoFrom, yr3Var);
        a2.q0(j);
        if (!TextUtils.isEmpty(str)) {
            a2.A().put(qu3.KEY, str);
        }
        Boolean S2 = lg4.S2();
        if (S2 != null) {
            a2.m().put("isNewCapture", String.valueOf(S2.booleanValue()));
        }
        v7m v7mVar = new v7m(w7m.Companion.a(a2));
        v7mVar.i(INSTANCE.m(a2, true, null, Integer.valueOf(i2), Integer.valueOf(i3)), true);
        v(v7mVar, a2, Long.valueOf(j));
    }
}
