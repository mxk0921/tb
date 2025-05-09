package tb;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLiveMediaCardView;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLiveOpenCardView;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fe6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLHOMEIMAGEVIEW_ATMOSPHEREDATA = 513030300974103744L;
    public static final long DXTBLHOMEIMAGEVIEW_AUTOPLAY = 1174195036188518487L;
    public static final long DXTBLHOMEIMAGEVIEW_CHATLISTDATA = 2072487133191711170L;
    public static final long DXTBLHOMEIMAGEVIEW_IMAGEBIZID = 2897469727848826591L;
    public static final long DXTBLHOMEIMAGEVIEW_IMAGEBIZTYPE = -5713278466016543530L;
    public static final long DXTBLHOMEIMAGEVIEW_ISCACHE = 4954174782170669367L;
    public static final long DXTBLHOMEIMAGEVIEW_ISNEWVERSION = 4881218296263318520L;
    public static final long DXTBLHOMEIMAGEVIEW_ISOPENCARD = 3517744115322646514L;
    public static final long DXTBLHOMEIMAGEVIEW_LIFECYCLESYNCVIEWUSERIDS = -9130050081556616801L;
    public static final long DXTBLHOMEIMAGEVIEW_NEEDSHOWNODEWHENLIVESTART = 6133935841553798924L;
    public static final long DXTBLHOMEIMAGEVIEW_OPENCHAT = 5291123061236748602L;
    public static final long DXTBLHOMEIMAGEVIEW_PLAYDURATION = -7241847713988459768L;
    public static final long DXTBLHOMEIMAGEVIEW_PLAYNETWORK = 7153269919816174219L;
    public static final int DXTBLHOMEIMAGEVIEW_PLAYNETWORK_NONE = 2;
    public static final int DXTBLHOMEIMAGEVIEW_PLAYNETWORK_SYSTEM = 1;
    public static final int DXTBLHOMEIMAGEVIEW_PLAYNETWORK_WIFI = 0;
    public static final long DXTBLHOMEIMAGEVIEW_TBBACKGROUND = -6737373688188729886L;
    public static final long DXTBLHOMEIMAGEVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXTBLHOMEIMAGEVIEW_TBGONEIFNULL = 1035483994773344437L;
    public static final long DXTBLHOMEIMAGEVIEW_TBID = 38174466807L;
    public static final long DXTBLHOMEIMAGEVIEW_TBIMAGECORNERRADIUS = 8499485291207392157L;
    public static final long DXTBLHOMEIMAGEVIEW_TBIMAGECORNERRADIUSRATIO = -9012118380120751455L;
    public static final long DXTBLHOMEIMAGEVIEW_TBIMAGESHAPE = -1666749237118992970L;
    public static final long DXTBLHOMEIMAGEVIEW_TBIMAGEURL = -7963020384368345866L;
    public static final long DXTBLHOMEIMAGEVIEW_TBINDEXOFSOURCE = 5266419815834493443L;
    public static final long DXTBLHOMEIMAGEVIEW_TBLEFTBOTTOMCORNERRADIUS = 8472049768233163199L;
    public static final long DXTBLHOMEIMAGEVIEW_TBLEFTTOPCORNERRADIUS = 1805057142456087674L;
    public static final long DXTBLHOMEIMAGEVIEW_TBLHOMEIMAGEVIEW = 2479158269305075449L;
    public static final long DXTBLHOMEIMAGEVIEW_TBLIVEVIDEO = 9122203915275105128L;
    public static final long DXTBLHOMEIMAGEVIEW_TBMASK = 10220202113345640L;
    public static final long DXTBLHOMEIMAGEVIEW_TBPARENTNODERECYCLERUSERID = -644055374885305243L;
    public static final long DXTBLHOMEIMAGEVIEW_TBPLACEHOLD = 800013180966223437L;
    public static final long DXTBLHOMEIMAGEVIEW_TBPLAYERDATA = -8136938095111281463L;
    public static final long DXTBLHOMEIMAGEVIEW_TBPLAYURL = 3882830683672803752L;
    public static final long DXTBLHOMEIMAGEVIEW_TBPLAYVIDEO = 850419666986385006L;
    public static final long DXTBLHOMEIMAGEVIEW_TBRIGHTBOTTOMCORNERRADIUS = 5615326228419484723L;
    public static final long DXTBLHOMEIMAGEVIEW_TBRIGHTTOPCORNERRADIUS = 7638094872275769326L;
    public static final long DXTBLHOMEIMAGEVIEW_TBSCALETYPE = 526508988394598507L;
    public static final long DXTBLHOMEIMAGEVIEW_TBSRC = 19617083574627L;
    public static final long DXTBLHOMEIMAGEVIEW_TBVIDEOLOOP = 311349093421208690L;
    public static final long DXTBLHOMEIMAGEVIEW_TBVISIBLESTATE = 5637158515563704755L;
    public static final long DXTBLHOMEIMAGEVIEW_TBWHRATIO = 3898487036836366973L;
    public myb A;

    /* renamed from: a  reason: collision with root package name */
    public Object f19230a;
    public Object b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public int i;
    public String j;
    public String k;
    public Object l;
    public Object m;
    public String n;
    public String p;
    public String q;
    public String r;
    public JSONObject t;
    public String v;
    public boolean w;
    public String x;
    public double y;
    public boolean o = false;
    public boolean s = false;
    public String u = "centerCrop";
    public TBLiveOpenCardView z = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TBLiveMediaCardView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLiveMediaCardView.d
        public void onSuccess() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (fe6.t(fe6.this)) {
                str = "homeMain_cache_feedArea_render_end";
            } else {
                str = "homeMain_mtop_feedArea_render_end";
            }
            jSONObject.put("action", (Object) str);
            jSONObject.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
            qyg.c().e("com.taobao.taolive.performance_tracker", jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378544);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new fe6();
        }
    }

    static {
        t2o.a(310378542);
    }

    public static /* synthetic */ Object ipc$super(fe6 fe6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXTBLHomeImageViewWidgetNode");
        }
    }

    public static /* synthetic */ boolean t(fe6 fe6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86ab54d8", new Object[]{fe6Var})).booleanValue();
        }
        return fe6Var.e;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new fe6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 9122203915275105128L || j == 850419666986385006L) {
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof fe6)) {
            super.onClone(dXWidgetNode, z);
            fe6 fe6Var = (fe6) dXWidgetNode;
            this.f19230a = fe6Var.f19230a;
            this.b = fe6Var.b;
            this.c = fe6Var.c;
            this.d = fe6Var.d;
            this.e = fe6Var.e;
            this.f = fe6Var.f;
            this.g = fe6Var.g;
            this.h = fe6Var.h;
            this.i = fe6Var.i;
            this.j = fe6Var.j;
            this.k = fe6Var.k;
            this.l = fe6Var.l;
            this.m = fe6Var.m;
            this.n = fe6Var.n;
            this.o = fe6Var.o;
            this.p = fe6Var.p;
            this.q = fe6Var.q;
            this.r = fe6Var.r;
            this.s = fe6Var.s;
            this.t = fe6Var.t;
            this.u = fe6Var.u;
            this.v = fe6Var.v;
            this.w = fe6Var.w;
            this.x = fe6Var.x;
            this.y = fe6Var.y;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new FrameLayout(context);
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
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j != -9012118380120751455L) {
            if (j == 3898487036836366973L) {
                this.y = d;
            } else {
                super.onSetDoubleAttribute(j, d);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j != 1174195036188518487L) {
            if (j == 4954174782170669367L) {
                if (i == 0) {
                    z = false;
                }
                this.e = z;
            } else if (j != 4881218296263318520L && j != 3517744115322646514L) {
                if (j == 5291123061236748602L) {
                    if (i == 0) {
                        z = false;
                    }
                    this.h = z;
                } else if (j == -7241847713988459768L) {
                    this.i = i;
                } else if (j != 7153269919816174219L && j != 5266419815834493443L) {
                    if (j == 9122203915275105128L) {
                        if (i == 0) {
                            z = false;
                        }
                        this.o = z;
                    } else if (j == 850419666986385006L) {
                        if (i == 0) {
                            z = false;
                        }
                        this.s = z;
                    } else if (j == 311349093421208690L) {
                        if (i == 0) {
                            z = false;
                        }
                        this.w = z;
                    } else {
                        super.onSetIntAttribute(j, i);
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == -8136938095111281463L) {
            this.t = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == DXTBLHOMEIMAGEVIEW_ATMOSPHEREDATA) {
            this.f19230a = obj;
        } else if (j == 2072487133191711170L) {
            this.b = obj;
        } else if (j == 1035483994773344437L) {
            this.l = obj;
        } else if (j == 38174466807L) {
            this.m = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 2897469727848826591L) {
            this.c = str;
        } else if (j == -5713278466016543530L) {
            this.d = str;
        } else if (j == -9130050081556616801L) {
            this.f = str;
        } else if (j == DXTBLHOMEIMAGEVIEW_NEEDSHOWNODEWHENLIVESTART) {
            this.g = str;
        } else if (j == -6737373688188729886L) {
            this.j = str;
        } else if (j == -5287008133921364644L) {
            this.k = str;
        } else if (j != 8499485291207392157L && j != -1666749237118992970L) {
            if (j == -7963020384368345866L) {
                this.n = str;
            } else if (j != 8472049768233163199L && j != 1805057142456087674L) {
                if (j == 10220202113345640L) {
                    this.p = str;
                } else if (j != -644055374885305243L) {
                    if (j == 800013180966223437L) {
                        this.q = str;
                    } else if (j == 3882830683672803752L) {
                        this.r = str;
                    } else if (j != 5615326228419484723L && j != 7638094872275769326L) {
                        if (j == 526508988394598507L) {
                            this.u = str;
                        } else if (j == 19617083574627L) {
                            this.v = str;
                        } else if (j == 5637158515563704755L) {
                            this.x = str;
                        } else {
                            super.onSetStringAttribute(j, str);
                        }
                    }
                }
            }
        }
    }

    public final boolean u() {
        int P;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceb9e065", new Object[]{this})).booleanValue();
        }
        if (e3s.b() && (P = getDXRuntimeContext().P()) >= 0 && P <= 5) {
            return true;
        }
        return false;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e8c7f61", new Object[]{this});
        }
        return this.n;
    }

    public final void w(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120534e4", new Object[]{this, tBLiveOpenCardView});
        } else if (!TextUtils.isEmpty(this.v) && tBLiveOpenCardView != null) {
            int d = xm7.d(this.v);
            if (d != -1) {
                tBLiveOpenCardView.setImageResource(xm7.d(this.v));
                return;
            }
            Resources resources = tBLiveOpenCardView.getContext().getResources();
            if (resources != null) {
                d = resources.getIdentifier(this.v, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, tBLiveOpenCardView.getContext().getPackageName());
            }
            if (d != -1 && d != 0) {
                tBLiveOpenCardView.setImageResource(d);
            }
        }
    }

    public final void x(TBLiveOpenCardView tBLiveOpenCardView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72be27ea", new Object[]{this, tBLiveOpenCardView});
        } else if (this.y > vu3.b.GEO_NOT_SUPPORT) {
            AbsFeature<? super ImageView> findFeature = tBLiveOpenCardView.findFeature(RatioFeature.class);
            if (findFeature != null) {
                ratioFeature = (RatioFeature) findFeature;
            } else {
                ratioFeature = new RatioFeature();
                ratioFeature.setHost(tBLiveOpenCardView);
                tBLiveOpenCardView.addFeature(ratioFeature);
            }
            ratioFeature.setRatio((float) this.y);
        }
    }

    public final void y(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128fd36e", new Object[]{this, tBLiveOpenCardView});
        } else if (!TextUtils.isEmpty(this.x) && !TextUtils.isEmpty(this.k)) {
            if (this.x.equals(this.k)) {
                tBLiveOpenCardView.setVisibility(0);
            } else {
                tBLiveOpenCardView.setVisibility(8);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 1 && (frameLayout.getChildAt(1) instanceof myb)) {
                frameLayout.removeViewAt(1);
            }
            TBLiveOpenCardView tBLiveOpenCardView = (TBLiveOpenCardView) frameLayout.findViewById(10);
            this.z = tBLiveOpenCardView;
            if (tBLiveOpenCardView == null) {
                TBLiveOpenCardView tBLiveOpenCardView2 = new TBLiveOpenCardView(context);
                this.z = tBLiveOpenCardView2;
                tBLiveOpenCardView2.setId(10);
                this.z.setEnableConsumePlayer(false);
                frameLayout.addView(this.z, 0, new FrameLayout.LayoutParams(-1, -1));
            }
            z(frameLayout);
            if (iw0.j(context)) {
                d9m.j().destroyDisplayView(context, this.A);
                myb createDisplayView = d9m.j().createDisplayView(context, frameLayout, false);
                this.A = createDisplayView;
                JSONObject jSONObject = this.t;
                if (jSONObject != null && createDisplayView != null) {
                    this.A.refreshData((Map) JSON.toJavaObject(jSONObject.getJSONObject("modelDebugInfo"), Map.class), (Map) JSON.toJavaObject(this.t.getJSONObject("explainDebugInfo"), Map.class));
                }
            }
        }
    }

    public final void z(FrameLayout frameLayout) {
        int d;
        int d2;
        int d3;
        int i = 0;
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48aa76ab", new Object[]{this, frameLayout});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView = (TBLiveOpenCardView) frameLayout.findViewById(10);
        boolean u = u();
        tBLiveOpenCardView.getCover().setWhenNullClearImg(true);
        if (!(!u || tBLiveOpenCardView.getCover() == null || tBLiveOpenCardView.getCover().getDrawable() == null)) {
            tBLiveOpenCardView.getCover().setWhenNullClearImg(false);
        }
        if (!this.e) {
            tBLiveOpenCardView.setPlayVideo(this.s);
            tBLiveOpenCardView.setLiveVideo(this.o);
            tBLiveOpenCardView.setEnableConsumePlayer(false);
            tBLiveOpenCardView.setPlayUrl(this.r);
            tBLiveOpenCardView.setVideoLoop(this.w);
            int i3 = this.i;
            if (i3 > 0) {
                tBLiveOpenCardView.setPlayDuration(i3);
            }
            JSONObject jSONObject = this.t;
            if (jSONObject != null) {
                tBLiveOpenCardView.setPlayerData(jSONObject);
            }
            if (frr.c() && this.h) {
                Object obj = this.b;
                if (obj instanceof JSONObject) {
                    tBLiveOpenCardView.setChatData((JSONObject) obj);
                }
            }
            if (nvs.j()) {
                tBLiveOpenCardView.setAtmosphereBenefitData(this.f19230a);
            }
            if (frr.d() && !TextUtils.isEmpty(this.f)) {
                tBLiveOpenCardView.setViewInfoLifeCycleSyncOpenCard(getEngine(), getParentWidget(), this.f);
            }
            if (nvs.I() && !TextUtils.isEmpty(this.g)) {
                tBLiveOpenCardView.setNeedShowNodeWhenLiveStart(getEngine(), getParentWidget(), this.g);
            }
        }
        if (!arq.a(this.c) && !arq.a(this.d) && tBLiveOpenCardView.getCover() != null) {
            tBLiveOpenCardView.getCover().setStrategyConfig(ImageStrategyConfig.w(this.d, this.c));
        }
        tBLiveOpenCardView.setScaleType(xm7.e(this.u));
        tBLiveOpenCardView.setImageUrl(this.n);
        if (getDXRuntimeContext() != null && (getDXRuntimeContext().S() instanceof p0b)) {
            p0b p0bVar = (p0b) getDXRuntimeContext().S();
            String f = p0bVar.f();
            String g = p0bVar.g();
            JSONObject i4 = getDXRuntimeContext().i();
            getDXRuntimeContext().P();
            if (i4 != null && (i4.get("realPos") instanceof String)) {
                i = Integer.parseInt(i4.getString("realPos"));
            }
            if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(g) && g.equals("all")) {
                if (!p0.i("", f, g)) {
                    i2 = 4;
                }
                if (i == i2) {
                    tBLiveOpenCardView.setCoverImageSuccessCallBack(new a());
                }
            }
        }
        w(tBLiveOpenCardView);
        y(tBLiveOpenCardView);
        x(tBLiveOpenCardView);
        Object obj2 = this.m;
        if (obj2 != null) {
            tBLiveOpenCardView.setTag(obj2);
        }
        if (!TextUtils.isEmpty(this.j) && -1 != (d3 = xm7.d(this.j))) {
            tBLiveOpenCardView.setBackgroundResource(d3);
        }
        if (!TextUtils.isEmpty(this.q) && -1 != (d2 = xm7.d(this.q))) {
            tBLiveOpenCardView.setPlaceHoldImageResId(d2);
        }
        if (!TextUtils.isEmpty(this.p) && -1 != (d = xm7.d(this.p))) {
            tBLiveOpenCardView.setColorFilter(d);
        }
    }
}
