package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import java.lang.ref.WeakReference;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zz5 extends DXWidgetNode implements s2e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHTBLIMAGEVIEW_MINPLAYEXPOSERATIO = 3649100718983479135L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTART = -1305328253755158825L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTOP = -88908847944554642L;
    public static final long DXHTBLIMAGEVIEW_PLAYCONTROLLERENABLE = -8795905679455764171L;
    public static final long DXHTBLIMAGEVIEW_PLAYDURATION = -7241847713988459768L;
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

    /* renamed from: a  reason: collision with root package name */
    public final xwg f33117a = new xwg();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782215);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new zz5();
        }
    }

    static {
        t2o.a(491782214);
        t2o.a(486539759);
    }

    public zz5() {
        setUserId("simpleNode");
    }

    public static /* synthetic */ Object ipc$super(zz5 zz5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/widget/livecardwidgetnode/DXHTBLImageViewWidgetNodeByImage");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new zz5();
    }

    @Override // tb.s2e
    public Bitmap g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("dccb9a44", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == 3649100718983479135L) {
            return 0.6000000238418579d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 9122203915275105128L || j == -8795905679455764171L) {
            return 1;
        }
        if (j == 850419666986385006L) {
            return 0;
        }
        if (j == -7241847713988459768L) {
            return -1;
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

    @Override // tb.s2e
    public Drawable j() {
        HImageView hImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("979a9ea9", new Object[]{this});
        }
        WeakReference<View> wRView = getWRView();
        if (wRView == null || (hImageView = (HImageView) wRView.get().findViewById(10)) == null) {
            return null;
        }
        return hImageView.getDrawable();
    }

    @Override // tb.s2e
    public View n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bfa13fd4", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof zz5) {
            super.onClone(dXWidgetNode, z);
            this.f33117a.a(((zz5) dXWidgetNode).f33117a);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        HImageView hImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if ((view instanceof FrameLayout) && (hImageView = (HImageView) view.findViewById(10)) != null) {
            hImageView.setAutoRelease(true);
            hImageView.setWhenNullClearImg(true);
            hImageView.setScaleType(xm7.e(this.f33117a.s()));
            p2b.q(hImageView, this.f33117a.j(), null, dje.GUESS_IMAGE_STRATEGY_CONFIG);
            hImageView.setImageUrl(this.f33117a.j());
            t(hImageView);
            u(hImageView);
            if (this.f33117a.f() != null) {
                hImageView.setTag(this.f33117a.f());
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 3649100718983479135L) {
            this.f33117a.A(d);
        } else if (j == -9012118380120751455L) {
            this.f33117a.I(d);
        } else if (j == 3898487036836366973L) {
            this.f33117a.Z(d);
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -7241847713988459768L) {
            this.f33117a.C(i);
        } else if (j == 9122203915275105128L) {
            xwg xwgVar = this.f33117a;
            if (i == 0) {
                z = false;
            }
            xwgVar.N(z);
        } else if (j == 850419666986385006L) {
            xwg xwgVar2 = this.f33117a;
            if (i == 0) {
                z = false;
            }
            xwgVar2.R(z);
        } else if (j == 311349093421208690L) {
            xwg xwgVar3 = this.f33117a;
            if (i == 0) {
                z = false;
            }
            xwgVar3.X(z);
        } else if (j == -8795905679455764171L) {
            xwg xwgVar4 = this.f33117a;
            if (i == 0) {
                z = false;
            }
            xwgVar4.B(z);
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
            this.f33117a.S(jSONObject);
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
            this.f33117a.F(obj);
        } else if (j == 38174466807L) {
            this.f33117a.G(obj);
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
            this.f33117a.D(str);
        } else if (j == -5287008133921364644L) {
            this.f33117a.E(str);
        } else if (j == 8499485291207392157L) {
            this.f33117a.H(str);
        } else if (j == -1666749237118992970L) {
            this.f33117a.J(str);
        } else if (j == -7963020384368345866L) {
            this.f33117a.K(str);
        } else if (j == 8472049768233163199L) {
            this.f33117a.L(str);
        } else if (j == 1805057142456087674L) {
            this.f33117a.M(str);
        } else if (j == 10220202113345640L) {
            this.f33117a.O(str);
        } else if (j == 800013180966223437L) {
            this.f33117a.P(str);
        } else if (j == 3882830683672803752L) {
            this.f33117a.Q(str);
        } else if (j == 5615326228419484723L) {
            this.f33117a.T(str);
        } else if (j == 7638094872275769326L) {
            this.f33117a.U(str);
        } else if (j == 526508988394598507L) {
            this.f33117a.V(str);
        } else if (j == 19617083574627L) {
            this.f33117a.W(str);
        } else if (j == 5637158515563704755L) {
            this.f33117a.Y(str);
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // tb.s2e
    public boolean p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90e256cf", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // tb.s2e
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5433d07", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void t(HImageView hImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9ca41f", new Object[]{this, hImageView});
            return;
        }
        String t = this.f33117a.t();
        if (!TextUtils.isEmpty(t) && hImageView != null) {
            int d = xm7.d(t);
            if (d != -1) {
                hImageView.setImageResource(xm7.d(t));
                return;
            }
            Resources resources = hImageView.getContext().getResources();
            if (resources != null) {
                d = resources.getIdentifier(t, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, hImageView.getContext().getPackageName());
            }
            if (d > 0) {
                hImageView.setImageResource(d);
            }
        }
    }

    public final void u(HImageView hImageView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc559725", new Object[]{this, hImageView});
            return;
        }
        double v = this.f33117a.v();
        if (v > vu3.b.GEO_NOT_SUPPORT) {
            AbsFeature<? super ImageView> findFeature = hImageView.findFeature(RatioFeature.class);
            if (findFeature != null) {
                ratioFeature = (RatioFeature) findFeature;
            } else {
                ratioFeature = new RatioFeature();
                ratioFeature.setHost(hImageView);
                hImageView.addFeature(ratioFeature);
            }
            ratioFeature.setRatio((float) v);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        HImageView hImageView = new HImageView(context);
        hImageView.setId(10);
        frameLayout.addView(hImageView, 0, new FrameLayout.LayoutParams(-1, -1));
        if (cw6.b()) {
            TextView textView = new TextView(context);
            textView.setText("直播降级组件");
            textView.setTextColor(Color.parseColor("#ff0000"));
            textView.setTextSize(12.0f);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2));
        }
        return frameLayout;
    }
}
