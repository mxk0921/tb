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
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class he6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLIMAGEVIEW_AUTOPLAY = 1174195036188518487L;
    public static final long DXTBLIMAGEVIEW_CHATLISTDATA = 2072487133191711170L;
    public static final long DXTBLIMAGEVIEW_ENABLEREUSE = -7596363831296915338L;
    public static final long DXTBLIMAGEVIEW_IMAGEBIZID = 2897469727848826591L;
    public static final long DXTBLIMAGEVIEW_IMAGEBIZTYPE = -5713278466016543530L;
    public static final long DXTBLIMAGEVIEW_ISCACHE = 4954174782170669367L;
    public static final long DXTBLIMAGEVIEW_ISNEWVERSION = 4881218296263318520L;
    public static final long DXTBLIMAGEVIEW_ISOPENCARD = 3517744115322646514L;
    public static final long DXTBLIMAGEVIEW_LIFECYCLESYNCVIEWUSERIDS = -9130050081556616801L;
    public static final long DXTBLIMAGEVIEW_OPENCHAT = 5291123061236748602L;
    public static final long DXTBLIMAGEVIEW_PLAYDURATION = -7241847713988459768L;
    public static final long DXTBLIMAGEVIEW_PLAYNETWORK = 7153269919816174219L;
    public static final int DXTBLIMAGEVIEW_PLAYNETWORK_NONE = 2;
    public static final int DXTBLIMAGEVIEW_PLAYNETWORK_SYSTEM = 1;
    public static final int DXTBLIMAGEVIEW_PLAYNETWORK_WIFI = 0;
    public static final long DXTBLIMAGEVIEW_TBBACKGROUND = -6737373688188729886L;
    public static final long DXTBLIMAGEVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXTBLIMAGEVIEW_TBGONEIFNULL = 1035483994773344437L;
    public static final long DXTBLIMAGEVIEW_TBID = 38174466807L;
    public static final long DXTBLIMAGEVIEW_TBIMAGECORNERRADIUS = 8499485291207392157L;
    public static final long DXTBLIMAGEVIEW_TBIMAGECORNERRADIUSRATIO = -9012118380120751455L;
    public static final long DXTBLIMAGEVIEW_TBIMAGESHAPE = -1666749237118992970L;
    public static final long DXTBLIMAGEVIEW_TBIMAGEURL = -7963020384368345866L;
    public static final long DXTBLIMAGEVIEW_TBINDEXOFSOURCE = 5266419815834493443L;
    public static final long DXTBLIMAGEVIEW_TBLEFTBOTTOMCORNERRADIUS = 8472049768233163199L;
    public static final long DXTBLIMAGEVIEW_TBLEFTTOPCORNERRADIUS = 1805057142456087674L;
    public static final long DXTBLIMAGEVIEW_TBLIMAGEVIEW = -7110052843691275924L;
    public static final long DXTBLIMAGEVIEW_TBLIVEVIDEO = 9122203915275105128L;
    public static final long DXTBLIMAGEVIEW_TBMASK = 10220202113345640L;
    public static final long DXTBLIMAGEVIEW_TBPARENTNODERECYCLERUSERID = -644055374885305243L;
    public static final long DXTBLIMAGEVIEW_TBPLACEHOLD = 800013180966223437L;
    public static final long DXTBLIMAGEVIEW_TBPLAYERDATA = -8136938095111281463L;
    public static final long DXTBLIMAGEVIEW_TBPLAYURL = 3882830683672803752L;
    public static final long DXTBLIMAGEVIEW_TBPLAYVIDEO = 850419666986385006L;
    public static final long DXTBLIMAGEVIEW_TBRIGHTBOTTOMCORNERRADIUS = 5615326228419484723L;
    public static final long DXTBLIMAGEVIEW_TBRIGHTTOPCORNERRADIUS = 7638094872275769326L;
    public static final long DXTBLIMAGEVIEW_TBSCALETYPE = 526508988394598507L;
    public static final long DXTBLIMAGEVIEW_TBSRC = 19617083574627L;
    public static final long DXTBLIMAGEVIEW_TBVIDEOLOOP = 311349093421208690L;
    public static final long DXTBLIMAGEVIEW_TBVISIBLESTATE = 5637158515563704755L;
    public static final long DXTBLIMAGEVIEW_TBWHRATIO = 3898487036836366973L;

    /* renamed from: a  reason: collision with root package name */
    public Object f20581a;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public Object k;
    public Object l;
    public String m;
    public String o;
    public String p;
    public String q;
    public JSONObject s;
    public String u;
    public boolean v;
    public String w;
    public double x;
    public myb z;
    public boolean b = true;
    public boolean n = true;
    public boolean r = false;
    public String t = "centerCrop";
    public TBLiveOpenCardView y = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092440);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new he6();
        }
    }

    static {
        t2o.a(779092439);
    }

    public static /* synthetic */ Object ipc$super(he6 he6Var, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/dinamicx/DXTBLImageViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new he6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 1174195036188518487L) {
            return 0;
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof he6)) {
            super.onClone(dXWidgetNode, z);
            he6 he6Var = (he6) dXWidgetNode;
            this.f20581a = he6Var.f20581a;
            this.b = he6Var.b;
            this.c = he6Var.c;
            this.d = he6Var.d;
            this.e = he6Var.e;
            this.f = he6Var.f;
            this.g = he6Var.g;
            this.h = he6Var.h;
            this.i = he6Var.i;
            this.j = he6Var.j;
            this.k = he6Var.k;
            this.l = he6Var.l;
            this.m = he6Var.m;
            this.n = he6Var.n;
            this.o = he6Var.o;
            this.p = he6Var.p;
            this.q = he6Var.q;
            this.r = he6Var.r;
            this.s = he6Var.s;
            this.t = he6Var.t;
            this.u = he6Var.u;
            this.v = he6Var.v;
            this.w = he6Var.w;
            this.x = he6Var.x;
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
            if (this.b || !frr.i()) {
                TBLiveOpenCardView tBLiveOpenCardView = (TBLiveOpenCardView) frameLayout.findViewById(10);
                this.y = tBLiveOpenCardView;
                if (tBLiveOpenCardView == null) {
                    TBLiveOpenCardView tBLiveOpenCardView2 = new TBLiveOpenCardView(context);
                    this.y = tBLiveOpenCardView2;
                    tBLiveOpenCardView2.setId(10);
                    this.y.setEnableConsumePlayer(false);
                    frameLayout.addView(this.y, 0, new FrameLayout.LayoutParams(-1, -1));
                }
            } else {
                TBLiveOpenCardView tBLiveOpenCardView3 = new TBLiveOpenCardView(context);
                this.y = tBLiveOpenCardView3;
                tBLiveOpenCardView3.setId(10);
                this.y.setEnableConsumePlayer(false);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                frameLayout.removeAllViews();
                frameLayout.addView(this.y, 0, layoutParams);
            }
            y(frameLayout);
            if (iw0.j(context)) {
                d9m.j().destroyDisplayView(context, this.z);
                myb createDisplayView = d9m.j().createDisplayView(context, frameLayout, false);
                this.z = createDisplayView;
                JSONObject jSONObject = this.s;
                if (jSONObject != null && createDisplayView != null) {
                    this.z.refreshData((Map) JSON.toJavaObject(jSONObject.getJSONObject("modelDebugInfo"), Map.class), (Map) JSON.toJavaObject(this.s.getJSONObject("explainDebugInfo"), Map.class));
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j != -9012118380120751455L) {
            if (j == 3898487036836366973L) {
                this.x = d;
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
            if (j == DXTBLIMAGEVIEW_ENABLEREUSE) {
                if (i == 0) {
                    z = false;
                }
                this.b = z;
            } else if (j == 4954174782170669367L) {
                if (i == 0) {
                    z = false;
                }
                this.e = z;
            } else if (j != 4881218296263318520L && j != 3517744115322646514L) {
                if (j == 5291123061236748602L) {
                    if (i == 0) {
                        z = false;
                    }
                    this.g = z;
                } else if (j == -7241847713988459768L) {
                    this.h = i;
                } else if (j != 7153269919816174219L && j != 5266419815834493443L) {
                    if (j == 9122203915275105128L) {
                        if (i == 0) {
                            z = false;
                        }
                        this.n = z;
                    } else if (j == 850419666986385006L) {
                        if (i == 0) {
                            z = false;
                        }
                        this.r = z;
                    } else if (j == 311349093421208690L) {
                        if (i == 0) {
                            z = false;
                        }
                        this.v = z;
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
            this.s = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 2072487133191711170L) {
            this.f20581a = obj;
        } else if (j == 1035483994773344437L) {
            this.k = obj;
        } else if (j == 38174466807L) {
            this.l = obj;
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
        } else if (j == -6737373688188729886L) {
            this.i = str;
        } else if (j == -5287008133921364644L) {
            this.j = str;
        } else if (j == -9130050081556616801L) {
            this.f = str;
        } else if (j != 8499485291207392157L && j != -1666749237118992970L) {
            if (j == -7963020384368345866L) {
                this.m = str;
            } else if (j != 8472049768233163199L && j != 1805057142456087674L) {
                if (j == 10220202113345640L) {
                    this.o = str;
                } else if (j == 800013180966223437L) {
                    this.p = str;
                } else if (j == 3882830683672803752L) {
                    this.q = str;
                } else if (j != 5615326228419484723L && j != 7638094872275769326L) {
                    if (j == 526508988394598507L) {
                        this.t = str;
                    } else if (j == 19617083574627L) {
                        this.u = str;
                    } else if (j == 5637158515563704755L) {
                        this.w = str;
                    } else {
                        super.onSetStringAttribute(j, str);
                    }
                }
            }
        }
    }

    public final boolean t() {
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

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e8c7f61", new Object[]{this});
        }
        return this.m;
    }

    public final void v(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a07720", new Object[]{this, tBLiveOpenCardView});
        } else if (!TextUtils.isEmpty(this.u) && tBLiveOpenCardView != null) {
            int d = xm7.d(this.u);
            if (d != -1) {
                tBLiveOpenCardView.setImageResource(xm7.d(this.u));
                return;
            }
            Resources resources = tBLiveOpenCardView.getContext().getResources();
            if (resources != null) {
                d = resources.getIdentifier(this.u, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, tBLiveOpenCardView.getContext().getPackageName());
            }
            if (d != -1 && d != 0) {
                tBLiveOpenCardView.setImageResource(d);
            }
        }
    }

    public final void w(TBLiveOpenCardView tBLiveOpenCardView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda53ea6", new Object[]{this, tBLiveOpenCardView});
        } else if (this.x > vu3.b.GEO_NOT_SUPPORT) {
            AbsFeature<? super ImageView> findFeature = tBLiveOpenCardView.findFeature(RatioFeature.class);
            if (findFeature != null) {
                ratioFeature = (RatioFeature) findFeature;
            } else {
                ratioFeature = new RatioFeature();
                ratioFeature.setHost(tBLiveOpenCardView);
                tBLiveOpenCardView.addFeature(ratioFeature);
            }
            ratioFeature.setRatio((float) this.x);
        }
    }

    public final void x(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e9ed2a", new Object[]{this, tBLiveOpenCardView});
        } else if (!TextUtils.isEmpty(this.w) && !TextUtils.isEmpty(this.j)) {
            if (this.w.equals(this.j)) {
                tBLiveOpenCardView.setVisibility(0);
            } else {
                tBLiveOpenCardView.setVisibility(8);
            }
        }
    }

    public final void y(FrameLayout frameLayout) {
        int d;
        int d2;
        int d3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48aa76ab", new Object[]{this, frameLayout});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView = (TBLiveOpenCardView) frameLayout.findViewById(10);
        boolean t = t();
        tBLiveOpenCardView.getCover().setWhenNullClearImg(true);
        if (!(!t || tBLiveOpenCardView.getCover() == null || tBLiveOpenCardView.getCover().getDrawable() == null)) {
            tBLiveOpenCardView.getCover().setWhenNullClearImg(false);
        }
        if (!this.e) {
            tBLiveOpenCardView.setPlayVideo(this.r);
            tBLiveOpenCardView.setLiveVideo(this.n);
            tBLiveOpenCardView.setEnableConsumePlayer(false);
            tBLiveOpenCardView.setPlayUrl(this.q);
            tBLiveOpenCardView.setVideoLoop(this.v);
            int i = this.h;
            if (i > 0) {
                tBLiveOpenCardView.setPlayDuration(i);
            }
            JSONObject jSONObject = this.s;
            if (jSONObject != null) {
                tBLiveOpenCardView.setPlayerData(jSONObject);
            }
            if (frr.c() && this.g) {
                Object obj = this.f20581a;
                if ((obj instanceof JSONObject) && ((JSONObject) obj).size() > 0) {
                    tBLiveOpenCardView.setChatData((JSONObject) this.f20581a);
                }
            }
            if (frr.d() && !arq.a(this.f)) {
                tBLiveOpenCardView.setViewInfoLifeCycleSyncOpenCard(getEngine(), getParentWidget(), this.f);
            }
        }
        if (!arq.a(this.c) && !arq.a(this.d) && tBLiveOpenCardView.getCover() != null) {
            tBLiveOpenCardView.getCover().setStrategyConfig(ImageStrategyConfig.w(this.d, this.c));
        }
        tBLiveOpenCardView.setScaleType(xm7.e(this.t));
        tBLiveOpenCardView.setImageUrl(this.m);
        v(tBLiveOpenCardView);
        x(tBLiveOpenCardView);
        w(tBLiveOpenCardView);
        Object obj2 = this.l;
        if (obj2 != null) {
            tBLiveOpenCardView.setTag(obj2);
        }
        if (!TextUtils.isEmpty(this.i) && -1 != (d3 = xm7.d(this.i))) {
            tBLiveOpenCardView.setBackgroundResource(d3);
        }
        if (!TextUtils.isEmpty(this.p) && -1 != (d2 = xm7.d(this.p))) {
            tBLiveOpenCardView.setPlaceHoldImageResId(d2);
        }
        if (!TextUtils.isEmpty(this.o) && -1 != (d = xm7.d(this.o))) {
            tBLiveOpenCardView.setColorFilter(d);
        }
    }
}
