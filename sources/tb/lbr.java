package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.alibaba.security.realidentity.f2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.component.TIconFontViewConstructor;
import com.taobao.android.dinamicx.component.TImageViewConstructor;
import com.taobao.android.dinamicx.elder.DXElderImpl;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode;
import com.taobao.android.dinamicx.widget.DXOCRImageViewWidgetNode;
import com.taobao.android.dinamicx.widget.DXWebViewWidgetNode;
import com.taobao.android.dinamicx.widget.a0;
import com.taobao.android.dinamicx.widget.b0;
import com.taobao.android.dinamicx.widget.e;
import com.taobao.android.dinamicx.widget.l;
import com.taobao.android.dinamicx.widget.r;
import com.taobao.android.dinamicx.widget.u;
import com.taobao.android.dinamicx.widget.video.DXProgressBarWidgetNode;
import com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode;
import com.taobao.android.dinamicx.widget.w;
import com.taobao.android.dinamicx.widget.x;
import com.taobao.android.dinamicx.widget.z;
import com.taobao.android.weex_framework.module.builtin.WXLocalStorageModule;
import com.taobao.schedule.ElasticTriggerCenter;
import com.taobao.taolive.dinamicext.homepage.TLiveViewConstructor;
import java.util.HashMap;
import tb.iy5;
import tb.rl6;
import tb.rn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lbr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23239a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements owb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.owb
        public void a(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd405a7", new Object[]{this, dXTemplateItem});
                return;
            }
            d2c c = pa8.c();
            if (c != null) {
                ((ElasticTriggerCenter) c.e()).c(dXTemplateItem.f7343a, dXTemplateItem.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements dvb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dvb
        public /* synthetic */ boolean a() {
            return false;
        }

        @Override // tb.dvb
        public boolean b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a0472965", new Object[]{this, context})).booleanValue();
            }
            return war.b(context);
        }

        @Override // tb.dvb
        public int c(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b7653c70", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            if (i == 0) {
                return war.c(0, i2);
            }
            if (i != 1) {
                return war.c(3, i2);
            }
            return war.c(2, i2);
        }

        @Override // tb.dvb
        public void disableForceDark(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecef35d2", new Object[]{this, view});
            } else {
                war.a(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements rn7.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rn7.a
        public ywb init(Application application, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ywb) ipChange.ipc$dispatch("7ce024a1", new Object[]{this, application, hashMap});
            }
            return lbr.a();
        }
    }

    public static /* synthetic */ ywb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywb) ipChange.ipc$dispatch("7b643735", new Object[0]);
        }
        return d();
    }

    public static iy5.b b(Context context, DXLongSparseArray<qub> dXLongSparseArray, DXLongSparseArray<evb> dXLongSparseArray2, DXLongSparseArray<mvb> dXLongSparseArray3) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iy5.b) ipChange.ipc$dispatch("36dc902d", new Object[]{context, dXLongSparseArray, dXLongSparseArray2, dXLongSparseArray3});
        }
        iy5.b bVar = new iy5.b();
        if (eb5.E()) {
            bVar.U(new rar());
            bVar.W(new x());
            bVar.P(new w());
        } else {
            DXLongSparseArray<evb> dXLongSparseArray4 = new DXLongSparseArray<>(30);
            dXLongSparseArray4.put(w46.DX_PARSER_MTOPTIMESTAMP, new w46());
            dXLongSparseArray4.put(-3536948596548552968L, new d36());
            dXLongSparseArray4.put(fn5.DX_PARSER_ISI18NEDITION, new fn5());
            dXLongSparseArray4.put(pi5.DX_PARSER_CLDRFORMAT, new pi5());
            dXLongSparseArray4.put(nr5.DX_PARSER_TAOBAO_THEME_GET_CURRENT, new nr5());
            dXLongSparseArray4.put(or5.DX_PARSER_TAOBAO_THEME_VALID, new or5());
            dXLongSparseArray4.put(ll5.DX_PARSER_GETTHEMETYPE, new ll5());
            bVar.a0(dXLongSparseArray4);
            if (!(dXLongSparseArray2 == null || dXLongSparseArray2.size() == 0)) {
                dXLongSparseArray4.a(dXLongSparseArray2);
            }
            DXLongSparseArray<qub> dXLongSparseArray5 = new DXLongSparseArray<>(30);
            dXLongSparseArray5.put(-4224482009255257824L, new u.a());
            dXLongSparseArray5.put(l.DXLOOPVIEWLAYOUT_LOOPVIEWLAYOUT, new l.c());
            dXLongSparseArray5.put(DXHorizontalAutoScrollLayoutWidgetNode.DXHORIZONTALAUTOSCROLLLAYOUT_HORIZONTALAUTOSCROLLLAYOUT, new DXHorizontalAutoScrollLayoutWidgetNode.b());
            dXLongSparseArray5.put(z.DX_WIDGET_ID, new z.c());
            dXLongSparseArray5.put(DXOCRImageViewWidgetNode.DXOCRIMAGEVIEW_OCRIMAGEVIEW, new DXOCRImageViewWidgetNode.a());
            dXLongSparseArray5.put(DXWebViewWidgetNode.DXWEBVIEW, new DXWebViewWidgetNode.a());
            dXLongSparseArray5.put(DXVideoViewWidgetNode.DXVIDEOVIEW_VIDEOVIEW, new DXVideoViewWidgetNode.d());
            dXLongSparseArray5.put(DXProgressBarWidgetNode.DXVIDEOPROGRESSBAR_VIDEOPROGRESSBAR, new DXProgressBarWidgetNode.a());
            dXLongSparseArray5.put(b0.DXMEGAPRICEVIEW_MEGAPRICEVIEW, new b0.a());
            dXLongSparseArray5.put(-7827222248633552986L, new a0.a());
            bVar.d0(dXLongSparseArray5);
            DXLongSparseArray<qub> dXLongSparseArray6 = new DXLongSparseArray<>(5);
            dXLongSparseArray6.put(-4224482009255257824L, new e.a());
            dXLongSparseArray6.put(u28.DXMEGAFLOWLAYOUT_MEGAFLOWLAYOUT, new r.a(new u28()));
            dXLongSparseArray6.put(b0.DXMEGAPRICEVIEW_MEGAPRICEVIEW, new rl6.a(new v5z()));
            bVar.Z(dXLongSparseArray6);
            if (!(dXLongSparseArray == null || dXLongSparseArray.size() == 0)) {
                dXLongSparseArray5.a(dXLongSparseArray);
            }
            if (!(dXLongSparseArray3 == null || dXLongSparseArray3.size() == 0)) {
                bVar.c0(dXLongSparseArray3);
            }
        }
        bVar.Q(new DXElderImpl(context.getApplicationContext()));
        bVar.R(new yu5());
        bVar.q0(new a());
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        bVar.e0(z);
        bVar.X(new b());
        bVar.s0(1);
        bVar.S(x46.class);
        bVar.L(new b76());
        bVar.n0(new com.taobao.android.dinamicx.widget.b());
        bVar.M(new gb5());
        bVar.V(new com.taobao.android.dinamicx.widget.a());
        bVar.T(new h46());
        bVar.k0(new yc5());
        if (eb5.E()) {
            bVar.u0(new c());
        } else {
            bVar.l0(d());
        }
        bVar.O(new com.taobao.android.dinamicx.b());
        bVar.g0(new db5());
        bVar.o0(new bp0());
        bVar.i0(new u76());
        bVar.j0(new s86());
        bVar.m0(new i26());
        bVar.h0(new qx5());
        return bVar;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c0cfbb", new Object[0]);
            return;
        }
        try {
            f65.n().m("TImageView", new TImageViewConstructor());
            f65.n().m("XIconFontView", new TIconFontViewConstructor());
            f65.n().m("TLiveView", new TLiveViewConstructor());
            f65.n().f(f2.g, new i8h());
            f65.n().k(new cxl());
        } catch (Throwable th) {
            Log.e("DinamicException", "TBDinamicX registerView failed", th);
        }
    }

    public static ywb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywb) ipChange.ipc$dispatch("f6ca37b7", new Object[0]);
        }
        ywb ywbVar = new ywb();
        ywbVar.g(new id5());
        ywbVar.h(new ow5());
        ywbVar.f(lih.class);
        ywbVar.i(new d66());
        ywbVar.j(new cm6());
        return ywbVar;
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6842465", new Object[]{context});
            return;
        }
        DXTraceUtil.b("DXSDKV2#Init");
        gp0.d(context, cw6.b());
        c();
        DXTraceUtil.c();
    }

    public static void f(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730d004", new Object[]{context});
        } else if (!f23239a) {
            int b2 = h2z.b(context);
            if (2 == b2 || 4 == b2 || 5 == b2) {
                z = true;
            }
            eb5.I(z);
            eb5.F(ABGlobal.isFeatureOpened(context, "dx_performace_open_v3_init_opt2"));
            boolean b3 = cw6.b();
            eb5.f(b3);
            DXTraceUtil.b("DXSDKV3#preInit");
            iy5.b b4 = b(context, null, null, null);
            DXTraceUtil.c();
            DXTraceUtil.b("DXSDKV3#Init");
            gp0.e(context, b4, b3);
            DXTraceUtil.c();
            DXTraceUtil.b("DXSDKV3#afterInit");
            g();
            String str = "DXABGlobalManage init  isOpenV3InitOpt " + eb5.H;
            la6.b(str);
            Log.e("DXABGlobalManager", str);
            DXTraceUtil.c();
            f23239a = true;
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d0042", new Object[0]);
            return;
        }
        dw5.f(WXLocalStorageModule.NAME, "getItem", new r9h());
        dw5.f(WXLocalStorageModule.NAME, "setItem", new t9h());
        dw5.f(WXLocalStorageModule.NAME, "removeItem", new s9h());
    }
}
