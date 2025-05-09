package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.immerse.IrpManager;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.struct.ViewWidget;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import com.etao.feimagesearch.util.keyboard.KeyboardPopupWindow;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.y7m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class imf extends ViewWidget<FrameLayout, IrpManager, imf> implements y7m.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile IrpManager l;
    public final g1a<imf, xhv> m;
    public final SparseArray<ah1> n = new SparseArray<>();
    public int o;
    public boolean p;
    public final bmf q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                imf.this.G();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout X = imf.this.X();
            if (X != null) {
                X.removeView(view);
            }
            return imf.this.X();
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            imf imfVar = imf.this;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            xhv xhvVar = xhv.INSTANCE;
            imf.i0(imfVar, 1, view, layoutParams);
            return imf.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout X = imf.this.X();
            if (X != null) {
                X.removeView(view);
            }
            return imf.this.X();
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            imf imfVar = imf.this;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            xhv xhvVar = xhv.INSTANCE;
            imf.i0(imfVar, 0, view, layoutParams);
            return imf.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            imf imfVar = imf.this;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            xhv xhvVar = xhv.INSTANCE;
            imf.i0(imfVar, 3, view, layoutParams);
            return imf.this.X();
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout X = imf.this.X();
            if (X != null) {
                X.removeView(view);
            }
            return imf.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements urk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.urk
        public void i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39b01934", new Object[]{this, new Integer(i)});
            } else {
                imf.this.W().c().b(gnf.EVENT_KEYBOARD_HEIGHT_CHANGE, Integer.valueOf(i));
            }
        }

        @Override // tb.urk
        public void v(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("926cb575", new Object[]{this, new Integer(i)});
            } else {
                imf.this.W().c().b(gnf.EVENT_KEYBOARD_HEIGHT_CHANGE, Integer.valueOf(i));
            }
        }

        @Override // tb.urk
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c622f32", new Object[]{this});
            } else {
                imf.this.W().c().b(gnf.EVENT_KEYBOARD_HEIGHT_CHANGE, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                imf.this.W().c().b(gnf.EVENT_LOADING_STATE_OPERATE, Boolean.TRUE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements ImageSearchMtopUtil.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ Map<String, String> c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ imf f21420a;
            public final /* synthetic */ JSONObject b;
            public final /* synthetic */ JSONObject c;
            public final /* synthetic */ Map<String, String> d;

            public a(imf imfVar, JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map) {
                this.f21420a = imfVar;
                this.b = jSONObject;
                this.c = jSONObject2;
                this.d = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                imf.k0(this.f21420a, 1);
                imf imfVar = this.f21420a;
                nmf o = imfVar.W().b().o();
                imf.j0(imfVar, o == null ? null : o.g());
                this.f21420a.W().c().b(gnf.EVENT_IDENTIFY_PROBLEM_UPDATE, imf.h0(this.f21420a, this.b, this.c, this.d));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ imf f21421a;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ imf f21422a;
                public final /* synthetic */ String b;

                public a(imf imfVar, String str) {
                    this.f21422a = imfVar;
                    this.b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.etao.feimagesearch.history.a.j().o(this.f21422a.W().b().B().getValue(), this.b, null);
                    }
                }
            }

            public b(imf imfVar) {
                this.f21421a = imfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String k = mld.k(this.f21421a.E(), this.f21421a.W().b().I(), 90);
                if (!TextUtils.isEmpty(k)) {
                    imf imfVar = this.f21421a;
                    imfVar.e0(new a(imfVar, k));
                }
            }
        }

        public g(JSONObject jSONObject, Map<String, String> map) {
            this.b = jSONObject;
            this.c = map;
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5be81ac", new Object[]{this, mtopResponse, str, str2, jSONObject});
            } else if (jSONObject != null) {
                JSONObject d = h19.d(h19.d(h19.d(jSONObject, "data"), "recommendPrompt"), "prompt");
                imf imfVar = imf.this;
                imfVar.e0(new a(imfVar, d, this.b, this.c));
                if (!imf.this.W().b().U()) {
                    z7m.c(new b(imf.this));
                }
            }
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void b(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ac2ca7b", new Object[]{this, str, str2, num, str3});
            } else {
                imf.l0(imf.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List<ivn> b;

        public h(List<ivn> list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                imf.this.W().c().b(gnf.EVENT_IDENTIFY_REGION_UPDATE, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface instanceof AlertDialog) {
                if (((AlertDialog) dialogInterface).isShowing()) {
                    dialogInterface.cancel();
                }
            } else if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            if (!imf.this.E().isFinishing()) {
                imf.this.E().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout X = imf.this.X();
            if (X != null) {
                X.removeView(view);
            }
            return imf.this.X();
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            imf.i0(imf.this, 2, view, new FrameLayout.LayoutParams(-1, -2));
            return imf.this.X();
        }
    }

    static {
        t2o.a(481296969);
        t2o.a(481297329);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public imf(Activity activity, Object obj, IrpManager irpManager, xfw xfwVar, g1a<? super imf, xhv> g1aVar) {
        super(activity, obj, irpManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(irpManager, ThemisConfig.SCENE_MANAGER);
        ckf.g(xfwVar, "viewSetter");
        ckf.g(g1aVar, "onWidgetInitEndListener");
        this.l = irpManager;
        this.m = g1aVar;
        this.q = new bmf(activity);
        new vre(activity, this, this.l, new c());
        new ghe(activity, this, this.l, new b());
        new wre(activity, this, this.l, new j());
        new tre(activity, this, this.l, new d());
        z7m.c(new a());
    }

    public static final /* synthetic */ JSONObject h0(imf imfVar, JSONObject jSONObject, JSONObject jSONObject2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b213eb93", new Object[]{imfVar, jSONObject, jSONObject2, map});
        }
        return imfVar.m0(jSONObject, jSONObject2, map);
    }

    public static final /* synthetic */ void i0(imf imfVar, int i2, View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a0e989", new Object[]{imfVar, new Integer(i2), view, layoutParams});
        } else {
            imfVar.n0(i2, view, layoutParams);
        }
    }

    public static /* synthetic */ Object ipc$super(imf imfVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1794064906:
                super.M();
                return null;
            case 153113035:
                super.c0(objArr[0]);
                return null;
            case 731174045:
                super.L();
                return null;
            case 1083424568:
                super.K();
                return null;
            case 1250151579:
                super.G();
                return null;
            case 1585798659:
                super.q((String) objArr[0], objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/immerse/IrpImmerseRootWidget");
        }
    }

    public static final /* synthetic */ void j0(imf imfVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51479eb4", new Object[]{imfVar, jSONArray});
        } else {
            imfVar.v0(jSONArray);
        }
    }

    public static final /* synthetic */ void k0(imf imfVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b840362c", new Object[]{imfVar, new Integer(i2)});
        } else {
            imfVar.getClass();
        }
    }

    public static final /* synthetic */ void l0(imf imfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc15b37", new Object[]{imfVar});
        } else {
            imfVar.y0();
        }
    }

    public static /* synthetic */ void x0(imf imfVar, int i2, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, String str2, String str3, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d7a9eb", new Object[]{imfVar, new Integer(i2), str, onClickListener, onClickListener2, str2, str3, new Integer(i3), obj});
            return;
        }
        if ((i3 & 16) != 0) {
            str2 = Localization.q(R.string.irp_error_message_retry_text);
        }
        if ((i3 & 32) != 0) {
            str3 = Localization.q(R.string.irp_error_message_cancel_text);
        }
        imfVar.w0(i2, str, onClickListener, onClickListener2, str2, str3);
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        super.G();
        W().c().c(gnf.EVENT_UI_CONTAINER_LOADED, this);
    }

    @Override // tb.vz
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        super.K();
        this.l.a();
    }

    @Override // tb.vz
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
            return;
        }
        super.L();
        this.p = false;
    }

    @Override // tb.vz
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
            return;
        }
        super.M();
        this.p = true;
    }

    public final JSONObject m0(JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8d9f6ed3", new Object[]{this, jSONObject, jSONObject2, map});
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "prompt", (String) jSONObject);
        jSONObject3.put((JSONObject) "universalParams", (String) jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "sversion", caa.i());
        jSONObject4.put((JSONObject) "pssource", W().b().y());
        jSONObject4.put((JSONObject) wxi.KEY_PHOTO_FROM, W().b().B().getValue());
        nmf o = W().b().o();
        jSONObject4.put((JSONObject) "boxList", (String) (o == null ? null : o.g()));
        jSONObject3.put((JSONObject) "pageParams", (String) jSONObject4);
        jSONObject3.put((JSONObject) "requestParams", (String) map);
        return jSONObject3;
    }

    public final void n0(int i2, View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9701b307", new Object[]{this, new Integer(i2), view, layoutParams});
        } else if (this.o == i2) {
            FrameLayout X = X();
            if (X != null) {
                X.addView(view, layoutParams);
            }
            this.o++;
        } else {
            this.n.put(i2, new ah1(view, layoutParams));
            while (true) {
                ah1 ah1Var = this.n.get(this.o);
                if (ah1Var != null) {
                    FrameLayout X2 = X();
                    if (X2 != null) {
                        X2.addView(ah1Var.b(), ah1Var.a());
                    }
                    this.n.remove(this.o);
                    this.o++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // tb.y7m.a
    public void o(x7m x7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d240027", new Object[]{this, x7mVar});
            return;
        }
        ckf.g(x7mVar, "event");
        String b2 = x7mVar.b();
        if (b2 != null) {
            int hashCode = b2.hashCode();
            if (hashCode != -466095421) {
                if (hashCode != 453063860) {
                    if (hashCode == 1125571777 && b2.equals("ImageLoad")) {
                        o0(x7mVar);
                    }
                } else if (b2.equals(av6.IMAGE_PROCESS_TAG)) {
                    p0(x7mVar);
                }
            } else if (b2.equals("ImageSearch")) {
                q0(x7mVar);
            }
        }
    }

    public final void o0(x7m x7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce09438", new Object[]{this, x7mVar});
        } else if (x7mVar.d() && (x7mVar.a() instanceof Bitmap)) {
            IrpDatasource b2 = W().b();
            Object a2 = x7mVar.a();
            if (a2 != null) {
                b2.s0((Bitmap) a2);
                e0(new jmf(this));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Bitmap");
        }
    }

    public final void p0(x7m x7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed96c95", new Object[]{this, x7mVar});
        } else if (x7mVar.d() && (x7mVar.a() instanceof lre)) {
            IrpDatasource b2 = W().b();
            Object a2 = x7mVar.a();
            if (a2 != null) {
                b2.g0(((lre) a2).b());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.pipline.model.ImgProcessResult");
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.v9e
    public void q(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e855e03", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "action");
        super.q(str, obj);
        if (ckf.b(str, gnf.EVENT_UI_CONTAINER_LOADED) && (obj instanceof Boolean)) {
            W().c().b(gnf.EVENT_LOADING_STATE_OPERATE, Boolean.FALSE);
            if (!((Boolean) obj).booleanValue()) {
                y0();
            }
        }
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3774a834", new Object[]{this});
            return;
        }
        nmf o = W().b().o();
        JSONObject x = o == null ? null : o.x();
        if (x == null) {
            y0();
            return;
        }
        JSONObject d2 = h19.d(x, "recommendTextReq");
        String i2 = h19.i(d2, "component", "");
        String i3 = h19.i(d2, "appId", "");
        JSONObject d3 = h19.d(x, "universalParams");
        if (i3 == null || i3.length() == 0 || i2 == null || i2.length() == 0) {
            y0();
        } else {
            u0(i2, i3, d3, d2);
        }
    }

    /* renamed from: s0 */
    public FrameLayout b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(E());
        frameLayout.setBackgroundColor(Color.parseColor("#000000"));
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setClipChildren(false);
        new KeyboardPopupWindow(E(), frameLayout, new e());
        return frameLayout;
    }

    /* renamed from: t0 */
    public void c0(imf imfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f1495", new Object[]{this, imfVar});
            return;
        }
        ckf.g(imfVar, "widget");
        super.c0(imfVar);
        g1a<imf, xhv> g1aVar = this.m;
        if (g1aVar != null) {
            g1aVar.invoke(imfVar);
        }
        e0(new f());
    }

    public final void w0(int i2, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cd1107", new Object[]{this, new Integer(i2), str, onClickListener, onClickListener2, str2, str3});
        } else if (!this.p && !this.q.b()) {
            this.q.c(str, onClickListener, str2, onClickListener2, str3);
        }
    }

    public final void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67502f0d", new Object[]{this});
        } else {
            x0(this, -999, "活动太火爆了，请再试一试~", null, new i(), null, null, 48, null);
        }
    }

    public final void q0(x7m x7mVar) {
        String str;
        int i2;
        nmf o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208fb2b", new Object[]{this, x7mVar});
        } else if (x7mVar.d()) {
            if (x7mVar.a() instanceof nmf) {
                IrpDatasource b2 = W().b();
                Object a2 = x7mVar.a();
                if (a2 != null) {
                    b2.w0((nmf) a2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.newresult.base.IrpNetResultModel");
                }
            }
            if (!lg4.M0() || (o = W().b().o()) == null || !o.i()) {
                r0();
                return;
            }
            String x2 = lg4.x2();
            ckf.f(x2, "getIrpNotSafeDialogTip()");
            w0(-8, x2, null, new kmf(this), "", Localization.q(R.string.irp_error_message_finish_text));
        } else {
            int i3 = -3;
            if (x7mVar instanceof gy8) {
                gy8 gy8Var = (gy8) x7mVar;
                Integer g2 = gy8Var.g();
                if (g2 != null && g2.intValue() == -10) {
                    str = ckf.p(pv8.TIP_NETWORK_OFFLINE, "(30013)");
                    i3 = -4;
                } else {
                    if (gy8Var.g() == null) {
                        i2 = -6;
                    } else {
                        Integer g3 = gy8Var.g();
                        ckf.d(g3);
                        i2 = g3.intValue();
                    }
                    if (i2 == -17) {
                        str = Localization.q(R.string.taobao_app_1007_1_19002);
                        ckf.f(str, "{\n            errCode = …1007_1_19002)\n          }");
                        i3 = -6;
                    } else if (i2 != -16) {
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) pv8.TIP_IMAGE_UPLOAD_ERROR);
                        sb.append('(');
                        sb.append(i2);
                        sb.append(')');
                        str = sb.toString();
                    } else {
                        str = Localization.q(R.string.taobao_app_1007_1_19021);
                        ckf.f(str, "{\n            errCode = …1007_1_19021)\n          }");
                        i3 = -7;
                    }
                    p7m.a("irpIdentifyTimeout", "tm_tpp_fail ");
                }
            } else {
                String str2 = pv8.TIP_ERROR;
                ckf.f(str2, "TIP_ERROR");
                str = str2;
                i3 = -3;
            }
            x0(this, i3, str, null, new lmf(this), null, null, 48, null);
        }
    }

    public final void v0(JSONArray jSONArray) {
        String i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4b2ec0", new Object[]{this, jSONArray});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int[] x = W().b().x();
            int size = jSONArray.size();
            int i3 = 0;
            while (i3 < size) {
                i3++;
                if (i3 > 3) {
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                if (!(jSONObject == null || (i2 = h19.i(jSONObject, "region", null)) == null || i2.length() == 0)) {
                    String f2 = trl.f(trl.g(i2, x[0], x[1]));
                    ckf.f(f2, "boxRegionRectF");
                    jSONObject.put((JSONObject) "pssource", W().b().y());
                    jSONObject.put((JSONObject) wxi.KEY_PHOTO_FROM, W().b().B().getValue());
                    jSONObject.put((JSONObject) "regionKey", f2);
                    xhv xhvVar = xhv.INSTANCE;
                    arrayList.add(new ivn(f2, "nt_identify_region_card", jSONObject, false));
                }
            }
            e0(new h(arrayList));
        }
    }

    public final void u0(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        Map<String, String> q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9b01c", new Object[]{this, str, str2, jSONObject, jSONObject2});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("component", str);
        linkedHashMap.put("sversion", caa.i());
        JSONObject d2 = h19.d(jSONObject2, "passThroughParams");
        JSONArray jSONArray = null;
        if (d2 != null) {
            for (Map.Entry<String, Object> entry : d2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!(key == null || key.length() == 0 || !(value instanceof String))) {
                    if (tsq.I(key, r4p.GLOBAL_PARAM_PREFIX, false, 2, null)) {
                        key = key.substring(2);
                        ckf.f(key, "this as java.lang.String).substring(startIndex)");
                    }
                    linkedHashMap.put(key, value);
                }
            }
        }
        JSONArray c2 = h19.c(jSONObject2, "clientParamConfig");
        if (c2 != null) {
            int size = c2.size();
            int i2 = 0;
            while (i2 < size) {
                i2++;
                Object obj = c2.get(i2);
                if (obj instanceof String) {
                    nmf o = W().b().o();
                    String str3 = (o == null || (q = o.q()) == null) ? null : q.get(obj);
                    if (!(str3 == null || str3.length() == 0)) {
                        linkedHashMap.put(obj, str3);
                    }
                }
            }
        }
        nmf o2 = W().b().o();
        if (o2 != null) {
            jSONArray = o2.g();
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(0);
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                String key2 = entry2.getKey();
                String i3 = h19.i(jSONObject3, key2, "");
                if (!(key2 == null || key2.length() == 0 || i3 == null || i3.length() == 0)) {
                    linkedHashMap.put(key2, i3);
                }
            }
        }
        linkedHashMap.put("appId", str2);
        ImageSearchMtopUtil.p("mtop.relationrecommend.mtoprecommend.recommendstream", "1.0", linkedHashMap, new g(jSONObject, linkedHashMap));
    }
}
