package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.home.component.view.live.HTBLiveImageView;
import com.taobao.homepage.view.widgets.RecyclerViewScrollEventPost;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yz5 extends DXWidgetNode implements exb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int C = View.generateViewId();
    public static final long DXHTBLIMAGEVIEW_HTBLIMAGEVIEW = -5996311416603680075L;
    public static final long DXHTBLIMAGEVIEW_MINPLAYEXPOSERATIO = 3649100718983479135L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTART = -1305328253755158825L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTOP = -88908847944554642L;
    public static final long DXHTBLIMAGEVIEW_TBBACKGROUND = -6737373688188729886L;
    public static final long DXHTBLIMAGEVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXHTBLIMAGEVIEW_TBGONEIFNULL = 1035483994773344437L;
    public static final long DXHTBLIMAGEVIEW_TBID = 38174466807L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGECORNERRADIUS = 8499485291207392157L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGECORNERRADIUSRATIO = -9012118380120751455L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGESHAPE = -1666749237118992970L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGEURL = -7963020384368345866L;
    public static final long DXHTBLIMAGEVIEW_TBLEFTBOTTOMCORNERRADIUS = 8472049768233163199L;
    public static final long DXHTBLIMAGEVIEW_TBLEFTTOPCORNERRADIUS = 1805057142456087674L;
    public static final long DXHTBLIMAGEVIEW_TBLIVEVIDEO = 9122203915275105128L;
    public static final long DXHTBLIMAGEVIEW_TBMASK = 10220202113345640L;
    public static final long DXHTBLIMAGEVIEW_TBPLACEHOLD = 800013180966223437L;
    public static final long DXHTBLIMAGEVIEW_TBPLAYERDATA = -8136938095111281463L;
    public static final long DXHTBLIMAGEVIEW_TBPLAYURL = 3882830683672803752L;
    public static final long DXHTBLIMAGEVIEW_TBPLAYVIDEO = 850419666986385006L;
    public static final long DXHTBLIMAGEVIEW_TBRIGHTBOTTOMCORNERRADIUS = 5615326228419484723L;
    public static final long DXHTBLIMAGEVIEW_TBRIGHTTOPCORNERRADIUS = 7638094872275769326L;
    public static final long DXHTBLIMAGEVIEW_TBSCALETYPE = 526508988394598507L;
    public static final long DXHTBLIMAGEVIEW_TBSRC = 19617083574627L;
    public static final long DXHTBLIMAGEVIEW_TBVIDEOLOOP = 311349093421208690L;
    public static final long DXHTBLIMAGEVIEW_TBVISIBLESTATE = 5637158515563704755L;
    public static final long DXHTBLIMAGEVIEW_TBWHRATIO = 3898487036836366973L;
    public Handler A;
    public btk B;
    public String b;
    public String c;
    public Object d;
    public Object e;
    public double g;
    public String h;
    public String i;
    public String m;
    public String n;
    public String o;
    public JSONObject q;
    public String u;
    public boolean v;
    public String w;
    public double x;

    /* renamed from: a  reason: collision with root package name */
    public double f32426a = 0.6d;
    public String f = "0";
    public String j = "0";
    public String k = "0";
    public boolean l = true;
    public boolean p = false;
    public String r = "0";
    public String s = "0";
    public String t = "centerCrop";
    public boolean y = false;
    public boolean z = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements btk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cxb f32427a;
        public final /* synthetic */ String b;

        public a(cxb cxbVar, String str) {
            this.f32427a = cxbVar;
            this.b = str;
        }

        @Override // tb.btk
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5c86d3f", new Object[]{this, new Integer(i)});
            } else if (i == 1 || i == 2 || i == 3) {
                yz5.t(yz5.this);
                yz5.u(yz5.this, this.f32427a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (yz5.v(yz5.this) && !yz5.w(yz5.this)) {
                yz5.x(yz5.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements jsk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.jsk
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7700218f", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                yz5.y(yz5.this, 2);
            } else if (i == 2) {
                yz5.y(yz5.this, 3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809092);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new yz5();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809093);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static boolean a() {
            char c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f5af0e64", new Object[0])).booleanValue();
            }
            String h = f4b.h("DX3LiveEnableLevel", "LevelHighMid");
            if (TextUtils.isEmpty(h)) {
                return false;
            }
            String d = m0b.d();
            sfh.d("HLiveOrange", "orange live enableLevel = " + h + ";deviceLevel = " + d);
            switch (h.hashCode()) {
                case -2067010659:
                    if (h.equals("LevelAll")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1936070334:
                    if (h.equals("LevelHighMid")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 347384614:
                    if (h.equals("LevelHigh")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 347569340:
                    if (h.equals("LevelNone")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return true;
            }
            if (c == 1) {
                return TextUtils.equals("h", d) || TextUtils.equals("m", d);
            }
            if (c != 2) {
                return false;
            }
            return TextUtils.equals("h", d);
        }
    }

    static {
        t2o.a(729809088);
        t2o.a(444597112);
    }

    public static int E(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static Context H(Context context) {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("240efdad", new Object[]{context});
        }
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof bew) {
            context2 = ((bew) context).b();
        } else if (context instanceof cew) {
            context2 = ((cew) context).a();
        } else {
            context2 = null;
        }
        if (context2 instanceof Activity) {
            return context2;
        }
        return null;
    }

    public static float K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646a52a", new Object[]{str})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static /* synthetic */ Object ipc$super(yz5 yz5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/widgetnode/htblimageview/DXHTBLImageViewWidgetNode");
        }
    }

    public static /* synthetic */ void t(yz5 yz5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b800cdf", new Object[]{yz5Var});
        } else {
            yz5Var.U();
        }
    }

    public static /* synthetic */ void u(yz5 yz5Var, cxb cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2699e1", new Object[]{yz5Var, cxbVar, str});
        } else {
            yz5Var.J(cxbVar, str);
        }
    }

    public static /* synthetic */ boolean v(yz5 yz5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("363aa1", new Object[]{yz5Var})).booleanValue();
        }
        return yz5Var.y;
    }

    public static /* synthetic */ boolean w(yz5 yz5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62915180", new Object[]{yz5Var})).booleanValue();
        }
        return yz5Var.z;
    }

    public static /* synthetic */ boolean x(yz5 yz5Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8a155dd", new Object[]{yz5Var, new Boolean(z)})).booleanValue();
        }
        return yz5Var.L(z);
    }

    public static /* synthetic */ void y(yz5 yz5Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a8db09", new Object[]{yz5Var, new Integer(i)});
        } else {
            yz5Var.I(i);
        }
    }

    public final jsk C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jsk) ipChange.ipc$dispatch("3204af04", new Object[]{this});
        }
        return new c();
    }

    public final btk D(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btk) ipChange.ipc$dispatch("dd8eb9d3", new Object[]{this, cxbVar, str});
        }
        return new a(cxbVar, str);
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115a4391", new Object[]{this})).booleanValue();
        }
        hm6 F = knn.g().h().F();
        if (F == null || !F.h()) {
            return false;
        }
        return true;
    }

    public final HTBLiveImageView G() {
        View D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HTBLiveImageView) ipChange.ipc$dispatch("b06853e1", new Object[]{this});
        }
        if (getDXRuntimeContext() == null || (D = getDXRuntimeContext().D()) == null) {
            return null;
        }
        return (HTBLiveImageView) D.findViewById(C);
    }

    public final void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c86d3f", new Object[]{this, new Integer(i)});
            return;
        }
        btk btkVar = this.B;
        if (btkVar != null) {
            btkVar.a(i);
        }
    }

    public final void J(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf8efbf", new Object[]{this, cxbVar, str});
            return;
        }
        cxbVar.g(this, str);
        fve.e("DXHTBLImageViewWidgetNode", "播放器出现错误");
    }

    public final void M(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678ff12b", new Object[]{this, cxbVar, str});
        } else {
            this.B = D(cxbVar, str);
        }
    }

    public final void N(HTBLiveImageView hTBLiveImageView) {
        ImageShapeFeature imageShapeFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6003e", new Object[]{this, hTBLiveImageView});
        } else if (!TextUtils.isEmpty(this.k) || !TextUtils.isEmpty(this.j) || !TextUtils.isEmpty(this.s) || !TextUtils.isEmpty(this.r)) {
            float a2 = xm7.a(hTBLiveImageView.getContext(), this.k);
            float a3 = xm7.a(hTBLiveImageView.getContext(), this.j);
            float a4 = xm7.a(hTBLiveImageView.getContext(), this.s);
            float a5 = xm7.a(hTBLiveImageView.getContext(), this.r);
            AbsFeature<? super ImageView> findFeature = hTBLiveImageView.findFeature(ImageShapeFeature.class);
            if (findFeature != null) {
                imageShapeFeature = (ImageShapeFeature) findFeature;
            } else {
                imageShapeFeature = new ImageShapeFeature();
                imageShapeFeature.setHost((ImageView) hTBLiveImageView);
                hTBLiveImageView.addFeature(imageShapeFeature);
            }
            imageShapeFeature.setCornerRadius(a2, a4, a3, a5);
            hTBLiveImageView.setCornerRadius((int) a2, (int) a4, (int) a3, (int) a5);
        }
    }

    public final void P(HTBLiveImageView hTBLiveImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816ae05b", new Object[]{this, hTBLiveImageView});
        } else if (!TextUtils.isEmpty(this.u) && hTBLiveImageView != null) {
            int d2 = xm7.d(this.u);
            if (d2 != -1) {
                hTBLiveImageView.setImageResource(xm7.d(this.u));
                return;
            }
            Resources resources = hTBLiveImageView.getContext().getResources();
            if (resources != null) {
                d2 = resources.getIdentifier(this.u, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, hTBLiveImageView.getContext().getPackageName());
            }
            if (d2 != -1 && d2 != 0) {
                hTBLiveImageView.setImageResource(d2);
            }
        }
    }

    public final void Q(HTBLiveImageView hTBLiveImageView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb90295", new Object[]{this, hTBLiveImageView});
        } else if (this.x > vu3.b.GEO_NOT_SUPPORT) {
            AbsFeature<? super ImageView> findFeature = hTBLiveImageView.findFeature(RatioFeature.class);
            if (findFeature != null) {
                ratioFeature = (RatioFeature) findFeature;
            } else {
                ratioFeature = new RatioFeature();
                ratioFeature.setHost(hTBLiveImageView);
                hTBLiveImageView.addFeature(ratioFeature);
            }
            ratioFeature.setRatio((float) this.x);
        }
    }

    public final void R(HTBLiveImageView hTBLiveImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5b0a91", new Object[]{this, hTBLiveImageView});
        } else if (!TextUtils.isEmpty(this.w) && !TextUtils.isEmpty(this.c)) {
            if (this.w.equals(this.c)) {
                hTBLiveImageView.setVisibility(0);
            } else {
                hTBLiveImageView.setVisibility(8);
            }
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b927b60b", new Object[]{this});
            return;
        }
        HTBLiveImageView G = G();
        if (G != null) {
            iqa.f(H(G.getContext())).l(C());
        }
        L(true);
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b564b4", new Object[]{this});
            return;
        }
        try {
            sfh.d("DXHTBLImageViewWidgetNode", "stopVideo invoke");
            HTBLiveImageView G = G();
            if (G != null && H(G.getContext()) != null) {
                G.destroy();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            sfh.e("DXHTBLImageViewWidgetNode", "stopVideo exception", e2);
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21bc9901", new Object[]{this});
        } else {
            this.B = null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new yz5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == 3649100718983479135L) {
            return 0.6d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 9122203915275105128L) {
            return 1;
        }
        if (j == 850419666986385006L) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == 8499485291207392157L || j == 8472049768233163199L || j == 1805057142456087674L || j == 5615326228419484723L || j == 7638094872275769326L) {
            return "0";
        }
        if (j == 526508988394598507L) {
            return "centerCrop";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // tb.exb
    public void onCanPlay(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c767ef", new Object[]{this, cxbVar, str});
        } else if (F()) {
            M(cxbVar, str);
            S();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof yz5)) {
            super.onClone(dXWidgetNode, z);
            yz5 yz5Var = (yz5) dXWidgetNode;
            this.f32426a = yz5Var.f32426a;
            this.b = yz5Var.b;
            this.c = yz5Var.c;
            this.d = yz5Var.d;
            this.e = yz5Var.e;
            this.f = yz5Var.f;
            this.g = yz5Var.g;
            this.h = yz5Var.h;
            this.i = yz5Var.i;
            this.j = yz5Var.j;
            this.k = yz5Var.k;
            this.l = yz5Var.l;
            this.m = yz5Var.m;
            this.n = yz5Var.n;
            this.o = yz5Var.o;
            this.p = yz5Var.p;
            this.q = yz5Var.q;
            this.r = yz5Var.r;
            this.s = yz5Var.s;
            this.t = yz5Var.t;
            this.u = yz5Var.u;
            this.v = yz5Var.v;
            this.w = yz5Var.w;
            this.x = yz5Var.x;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        HTBLiveImageView hTBLiveImageView = new HTBLiveImageView(context);
        hTBLiveImageView.setId(C);
        frameLayout.addView(hTBLiveImageView, 0, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        HTBLiveImageView hTBLiveImageView;
        int d2;
        int d3;
        int d4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if ((view instanceof FrameLayout) && (hTBLiveImageView = (HTBLiveImageView) view.findViewById(C)) != null) {
            hTBLiveImageView.setPlayVideo(this.p);
            hTBLiveImageView.setLiveVideo(this.l);
            hTBLiveImageView.setPlayUrl(this.o);
            p2b.q(hTBLiveImageView, this.i, null, null);
            hTBLiveImageView.setImageUrl(this.i);
            hTBLiveImageView.setVideoLoop(this.v);
            hTBLiveImageView.setScaleType(xm7.e(this.t));
            P(hTBLiveImageView);
            R(hTBLiveImageView);
            O(hTBLiveImageView);
            Q(hTBLiveImageView);
            N(hTBLiveImageView);
            Object obj = this.e;
            if (obj != null) {
                hTBLiveImageView.setTag(obj);
            }
            if (!TextUtils.isEmpty(this.b) && -1 != (d4 = xm7.d(this.b))) {
                hTBLiveImageView.setBackgroundResource(d4);
            }
            if (!TextUtils.isEmpty(this.n) && -1 != (d3 = xm7.d(this.n))) {
                hTBLiveImageView.setPlaceHoldImageResId(d3);
            }
            if (!TextUtils.isEmpty(this.m) && -1 != (d2 = xm7.d(this.m))) {
                hTBLiveImageView.setColorFilter(d2);
            }
            JSONObject jSONObject = this.q;
            if (jSONObject != null) {
                hTBLiveImageView.setPlayerData(jSONObject);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
        } else if (j == 3649100718983479135L) {
            this.f32426a = d2;
        } else if (j == -9012118380120751455L) {
            this.g = d2;
        } else if (j == 3898487036836366973L) {
            this.x = d2;
        } else {
            super.onSetDoubleAttribute(j, d2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 9122203915275105128L) {
            if (i == 0) {
                z = false;
            }
            this.l = z;
        } else if (j == 850419666986385006L) {
            if (i == 0) {
                z = false;
            }
            this.p = z;
        } else if (j == 311349093421208690L) {
            if (i == 0) {
                z = false;
            }
            this.v = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == -8136938095111281463L) {
            this.q = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 1035483994773344437L) {
            this.d = obj;
        } else if (j == 38174466807L) {
            this.e = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == -6737373688188729886L) {
            this.b = str;
        } else if (j == -5287008133921364644L) {
            this.c = str;
        } else if (j == 8499485291207392157L) {
            this.f = str;
        } else if (j == -1666749237118992970L) {
            this.h = str;
        } else if (j == -7963020384368345866L) {
            this.i = str;
        } else if (j == 8472049768233163199L) {
            this.j = str;
        } else if (j == 1805057142456087674L) {
            this.k = str;
        } else if (j == 10220202113345640L) {
            this.m = str;
        } else if (j == 800013180966223437L) {
            this.n = str;
        } else if (j == 3882830683672803752L) {
            this.o = str;
        } else if (j == 5615326228419484723L) {
            this.r = str;
        } else if (j == 7638094872275769326L) {
            this.s = str;
        } else if (j == 526508988394598507L) {
            this.t = str;
        } else if (j == 19617083574627L) {
            this.u = str;
        } else if (j == 5637158515563704755L) {
            this.w = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // tb.exb
    public void onShouldStop(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c812a17e", new Object[]{this, cxbVar, str});
        } else if (F()) {
            T();
            U();
        }
    }

    public final boolean A() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b477cce7", new Object[]{this})).booleanValue();
        }
        HTBLiveImageView G = G();
        if (G == null) {
            sfh.d("DXHTBLImageViewWidgetNode", "can not find live image view");
            return false;
        } else if (G.getVisibility() != 0) {
            sfh.d("DXHTBLImageViewWidgetNode", "live image view is not visible");
            return false;
        } else if (H(G.getContext()) != null) {
            return true;
        } else {
            if (G.getContext() == null) {
                str = "null";
            } else {
                str = G.getContext().getClass().getSimpleName();
            }
            sfh.d("DXHTBLImageViewWidgetNode", "can not find activity context。current context = ".concat(str));
            return false;
        }
    }

    public final boolean B(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6c28f59", new Object[]{this, context, new Boolean(z)})).booleanValue();
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        j9t e2 = j9t.e(context, "homepage");
        if (!(e2 != null ? e2.b().isAutoPlayVideoUnderCurrentNetwork(context) : false)) {
            sfh.d("DXHTBLImageViewWidgetNode", "can not play under current network");
            return false;
        } else if (z) {
            return true;
        } else {
            if (iqa.f(context).h()) {
                sfh.d("DXHTBLImageViewWidgetNode", "yourself or another live video is playing");
                return false;
            } else if (getDXRuntimeContext().L() == null) {
                sfh.d("DXHTBLImageViewWidgetNode", "dx rootView is null");
                return false;
            } else {
                float a2 = RecyclerViewScrollEventPost.o().b().a(G());
                if (a2 < 0.0f || a2 >= this.f32426a) {
                    return true;
                }
                sfh.d("DXHTBLImageViewWidgetNode", "dx rootView expose ratio too few. exposeRatio = " + a2 + ";minPlayExposeRatio = " + this.f32426a);
                return false;
            }
        }
    }

    public final boolean L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9329386", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        try {
            sfh.d("DXHTBLImageViewWidgetNode", "playVideoIfNecessary invoke");
            if (!z()) {
                I(1);
                return false;
            } else if (!A()) {
                I(1);
                return false;
            } else {
                HTBLiveImageView G = G();
                if (G == null) {
                    return false;
                }
                Context H = H(G.getContext());
                G.setActivityContext(H);
                if (!B(H, z)) {
                    I(1);
                    return false;
                }
                boolean playVideoIfNecessary = G.playVideoIfNecessary(null, "", 1, false);
                sfh.d("DXHTBLImageViewWidgetNode", "start play live video result = " + playVideoIfNecessary);
                if (!playVideoIfNecessary) {
                    I(1);
                }
                return playVideoIfNecessary;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            sfh.e("DXHTBLImageViewWidgetNode", "play Live video exception", e2);
            return false;
        }
    }

    public final void O(HTBLiveImageView hTBLiveImageView) {
        ImageShapeFeature imageShapeFeature;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689ed118", new Object[]{this, hTBLiveImageView});
        } else if (!TextUtils.isEmpty(this.h)) {
            AbsFeature<? super ImageView> findFeature = hTBLiveImageView.findFeature(ImageShapeFeature.class);
            if (findFeature != null) {
                imageShapeFeature = (ImageShapeFeature) findFeature;
            } else {
                imageShapeFeature = new ImageShapeFeature();
                imageShapeFeature.setHost((ImageView) hTBLiveImageView);
                hTBLiveImageView.addFeature(imageShapeFeature);
            }
            int b2 = xm7.b(this.h);
            imageShapeFeature.setShape(b2);
            if (b2 == 1 && !TextUtils.isEmpty(this.f)) {
                if (this.f.endsWith("ap") || this.f.endsWith("np")) {
                    float e2 = owo.e(hTBLiveImageView.getContext(), this.f, 0);
                    imageShapeFeature.setCornerRadius(e2, e2, e2, e2);
                    int i = (int) e2;
                    hTBLiveImageView.setCornerRadius(i, i, i, i);
                    return;
                }
                if (this.g != vu3.b.GEO_NOT_SUPPORT) {
                    f = K(this.f) * ((float) this.g);
                } else {
                    f = K(this.f);
                }
                float E = E(hTBLiveImageView.getContext(), f / 2.0f);
                imageShapeFeature.setCornerRadius(E, E, E, E);
                int i2 = (int) E;
                hTBLiveImageView.setCornerRadius(i2, i2, i2, i2);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        boolean onEvent = super.onEvent(dXEvent);
        if (onEvent) {
            return true;
        }
        if (F()) {
            return false;
        }
        long eventId = dXEvent.getEventId();
        if (eventId == 7952648158329995189L) {
            sfh.d("DXHTBLImageViewWidgetNode", "receive on scroll start event");
            this.z = true;
            postEvent(new DXEvent(-1305328253755158825L));
        } else if (eventId == -7968002352509477560L) {
            sfh.d("DXHTBLImageViewWidgetNode", "receive on scroll stop event");
            this.z = false;
            postEvent(new DXEvent(-88908847944554642L));
        } else if (eventId == 5288671110273408574L) {
            sfh.d("DXHTBLImageViewWidgetNode", "receive on appear event");
            this.y = true;
        } else if (eventId != 5388973340095122049L) {
            return onEvent;
        } else {
            sfh.d("DXHTBLImageViewWidgetNode", "receive on disappear event");
            this.y = false;
            T();
            return true;
        }
        if (this.A == null) {
            this.A = new Handler(Looper.getMainLooper());
        }
        this.A.removeCallbacksAndMessages(null);
        this.A.post(new b());
        return true;
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b93dff3d", new Object[]{this})).booleanValue();
        }
        if (!this.p) {
            sfh.d("DXHTBLImageViewWidgetNode", "tbPlayVideo attr is false");
            return false;
        } else if (this.q != null || !TextUtils.isEmpty(this.o)) {
            return e.a();
        } else {
            sfh.d("DXHTBLImageViewWidgetNode", "tbPlayerData and tbPlayUrl is both empty");
            return false;
        }
    }
}
