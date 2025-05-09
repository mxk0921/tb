package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IGreyFilterService;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import java.lang.ref.WeakReference;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a06 extends DXWidgetNode implements IVideoPlayControllerService.c, s2e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHTBLIMAGEVIEW_HTBLIMAGEVIEW = -5996311416603680075L;
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
    public static final String LIVE_COUNT_MAIN_BIZ = "Page_Home_VideoPlayer_Count";
    public static final String LIVE_FEATURE_TYPE = "live";
    public static final String LIVE_MAIN_BIZ = "Page_Home_VideoPlayer";

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<TBLiveOpenCardView> f15464a;
    public final xwg b;
    public final swg c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782220);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new a06();
        }
    }

    static {
        t2o.a(491782219);
        t2o.a(488636619);
        t2o.a(486539759);
    }

    public a06() {
        xwg xwgVar = new xwg();
        this.b = xwgVar;
        this.c = new swg(xwgVar, this);
    }

    public static /* synthetic */ Object ipc$super(a06 a06Var, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/widget/livecardwidgetnode/playbyservice/DXHTBLImageViewWidgetNodeByService");
        }
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67ec57cd", new Object[]{this})).booleanValue();
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return false;
        }
        JSONObject i = dXRuntimeContext.i();
        if (i.getJSONObject("args") == null || !TextUtils.equals(i.getJSONObject("args").getString(jtv.S_ARGS_IS_CLIENT_CACHE), "1")) {
            return false;
        }
        return true;
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bf570ea", new Object[]{this})).booleanValue();
        }
        IGreyFilterService iGreyFilterService = (IGreyFilterService) j18.c(getDXRuntimeContext()).a(IGreyFilterService.class);
        BaseSectionModel<?> e = j18.e(getDXRuntimeContext());
        if (iGreyFilterService == null || e == null) {
            return false;
        }
        return iGreyFilterService.isNeedGreyCard(e);
    }

    public final void C(HImageView hImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3136a93", new Object[]{this, hImageView});
            return;
        }
        hImageView.setAutoRelease(true);
        hImageView.setWhenNullClearImg(true);
        hImageView.setScaleType(xm7.e(this.b.s()));
        p2b.q(hImageView, this.b.j(), null, dje.GUESS_IMAGE_STRATEGY_CONFIG);
        hImageView.setImageUrl(this.b.j());
        H(hImageView);
        J(hImageView);
        if (this.b.f() != null) {
            hImageView.setTag(this.b.f());
        }
    }

    public final void D(TBLiveOpenCardView tBLiveOpenCardView) {
        int d;
        int d2;
        int d3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de13844", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        TUrlImageView cover = tBLiveOpenCardView.getCover();
        if (cover != null) {
            p2b.q(cover, cover.getImageUrl(), null, dje.GUESS_IMAGE_STRATEGY_CONFIG);
            String imageUrl = cover.getImageUrl();
            if (imageUrl != null && !TextUtils.equals(imageUrl, this.b.j()) && tBLiveOpenCardView.isPlaying()) {
                tBLiveOpenCardView.stopVideo();
            }
        }
        tBLiveOpenCardView.setPlayVideo(this.b.y());
        tBLiveOpenCardView.setLiveVideo(this.b.x());
        tBLiveOpenCardView.setPlayUrl(this.b.o());
        tBLiveOpenCardView.setImageUrl(this.b.j());
        tBLiveOpenCardView.setEnableCoverFade(true);
        tBLiveOpenCardView.setVideoLoop(this.b.z());
        tBLiveOpenCardView.setScaleType(xm7.e(this.b.s()));
        G(tBLiveOpenCardView);
        K(tBLiveOpenCardView);
        F(tBLiveOpenCardView);
        I(tBLiveOpenCardView);
        E(tBLiveOpenCardView);
        if (this.b.f() != null) {
            tBLiveOpenCardView.setTag(this.b.f());
        }
        if (this.b.c() > 0) {
            tBLiveOpenCardView.setPlayDuration(this.b.c());
        }
        if (!TextUtils.isEmpty(this.b.d()) && -1 != (d3 = xm7.d(this.b.d()))) {
            tBLiveOpenCardView.setBackgroundResource(d3);
        }
        if (!TextUtils.isEmpty(this.b.n()) && -1 != (d2 = xm7.d(this.b.n()))) {
            tBLiveOpenCardView.setPlaceHoldImageResId(d2);
        }
        if (!TextUtils.isEmpty(this.b.m()) && -1 != (d = xm7.d(this.b.m()))) {
            tBLiveOpenCardView.setColorFilter(d);
        }
        if (this.b.p() != null) {
            tBLiveOpenCardView.setPlayerData(this.b.p());
        }
    }

    public final void E(TBLiveOpenCardView tBLiveOpenCardView) {
        ImageShapeFeature imageShapeFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1150425d", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        String l = this.b.l();
        String k = this.b.k();
        String r = this.b.r();
        String q = this.b.q();
        if (!TextUtils.isEmpty(l) || !TextUtils.isEmpty(k) || !TextUtils.isEmpty(r) || !TextUtils.isEmpty(q)) {
            float a2 = xm7.a(tBLiveOpenCardView.getContext(), l);
            float a3 = xm7.a(tBLiveOpenCardView.getContext(), k);
            float a4 = xm7.a(tBLiveOpenCardView.getContext(), r);
            float a5 = xm7.a(tBLiveOpenCardView.getContext(), q);
            AbsFeature<? super ImageView> findFeature = tBLiveOpenCardView.findFeature(ImageShapeFeature.class);
            if (findFeature != null) {
                imageShapeFeature = (ImageShapeFeature) findFeature;
            } else {
                imageShapeFeature = new ImageShapeFeature();
                imageShapeFeature.setHost((ImageView) tBLiveOpenCardView.getCover());
                tBLiveOpenCardView.addFeature(imageShapeFeature);
            }
            imageShapeFeature.setCornerRadius(a2, a4, a3, a5);
            tBLiveOpenCardView.setCornerRadius((int) a2, (int) a4, (int) a3, (int) a5);
        }
    }

    public final void G(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a07720", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        String t = this.b.t();
        if (!TextUtils.isEmpty(t) && tBLiveOpenCardView != null) {
            int d = xm7.d(t);
            if (d != -1) {
                tBLiveOpenCardView.setImageResource(xm7.d(t));
                return;
            }
            Resources resources = tBLiveOpenCardView.getContext().getResources();
            if (resources != null) {
                d = resources.getIdentifier(t, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, tBLiveOpenCardView.getContext().getPackageName());
            }
            if (d > 0) {
                tBLiveOpenCardView.setImageResource(d);
            }
        }
    }

    public final void H(HImageView hImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9ca41f", new Object[]{this, hImageView});
            return;
        }
        String t = this.b.t();
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

    public final void I(TBLiveOpenCardView tBLiveOpenCardView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda53ea6", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        double v = this.b.v();
        if (v > vu3.b.GEO_NOT_SUPPORT) {
            AbsFeature<? super ImageView> findFeature = tBLiveOpenCardView.findFeature(RatioFeature.class);
            if (findFeature != null) {
                ratioFeature = (RatioFeature) findFeature;
            } else {
                ratioFeature = new RatioFeature();
                ratioFeature.setHost(tBLiveOpenCardView.getCover());
                tBLiveOpenCardView.addFeature(ratioFeature);
            }
            ratioFeature.setRatio((float) v);
        }
    }

    public final void J(HImageView hImageView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc559725", new Object[]{this, hImageView});
            return;
        }
        double v = this.b.v();
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

    public final void K(TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e9ed2a", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        String u = this.b.u();
        String e = this.b.e();
        if (!TextUtils.isEmpty(u) && !TextUtils.isEmpty(e)) {
            if (u.equals(e)) {
                tBLiveOpenCardView.setVisibility(0);
            } else {
                tBLiveOpenCardView.setVisibility(8);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new a06();
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
        if (j == -8795905679455764171L) {
            return 1;
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
        TUrlImageView cover;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("979a9ea9", new Object[]{this});
        }
        TBLiveOpenCardView z = z();
        if (z == null || (cover = z.getCover()) == null) {
            return null;
        }
        Drawable drawable = cover.getDrawable();
        if (drawable != null) {
            fve.e("DXHTBLImageViewWidgetNode", "find live cover view drawable.");
        }
        return drawable;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.c
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c12dcadd", new Object[]{this})).booleanValue();
        }
        return this.b.w();
    }

    @Override // tb.s2e
    public View n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bfa13fd4", new Object[]{this});
        }
        TBLiveOpenCardView z = z();
        if (z == null) {
            return null;
        }
        return z.getPlayerRootView();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.c
    public void o(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19b28e9", new Object[]{this, bVar});
        } else if (B()) {
            fve.e("DXHTBLImageViewWidgetNode", "置灰不播放直播");
            ((y9w) bVar).G(this);
        } else {
            this.c.p(bVar, getDXRuntimeContext());
        }
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
        } else if (dXWidgetNode instanceof a06) {
            super.onClone(dXWidgetNode, z);
            this.b.a(((a06) dXWidgetNode).b);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        x();
        FrameLayout frameLayout = new FrameLayout(context);
        if (!vxl.b().c()) {
            u(frameLayout);
        } else if (A()) {
            t(frameLayout);
        } else {
            u(frameLayout);
        }
        if (cw6.b()) {
            TextView textView = new TextView(frameLayout.getContext());
            textView.setText("新组件-服务化播控");
            textView.setTextColor(Color.parseColor("#ff0000"));
            textView.setTextSize(12.0f);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2));
        }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        x();
        if (!(view instanceof FrameLayout)) {
            return;
        }
        if (!vxl.b().c()) {
            View findViewById = view.findViewById(10);
            if (findViewById instanceof TBLiveOpenCardView) {
                D((TBLiveOpenCardView) findViewById);
            }
        } else if (A()) {
            v((FrameLayout) view);
        } else {
            w((FrameLayout) view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 3649100718983479135L) {
            this.b.A(d);
        } else if (j == -9012118380120751455L) {
            this.b.I(d);
        } else if (j == 3898487036836366973L) {
            this.b.Z(d);
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
            this.b.C(i);
        } else if (j == 9122203915275105128L) {
            xwg xwgVar = this.b;
            if (i == 0) {
                z = false;
            }
            xwgVar.N(z);
        } else if (j == 850419666986385006L) {
            xwg xwgVar2 = this.b;
            if (i == 0) {
                z = false;
            }
            xwgVar2.R(z);
        } else if (j == 311349093421208690L) {
            xwg xwgVar3 = this.b;
            if (i == 0) {
                z = false;
            }
            xwgVar3.X(z);
        } else if (j == -8795905679455764171L) {
            xwg xwgVar4 = this.b;
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
            this.b.S(jSONObject);
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
            this.b.F(obj);
        } else if (j == 38174466807L) {
            this.b.G(obj);
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
            this.b.D(str);
        } else if (j == -5287008133921364644L) {
            this.b.E(str);
        } else if (j == 8499485291207392157L) {
            this.b.H(str);
        } else if (j == -1666749237118992970L) {
            this.b.J(str);
        } else if (j == -7963020384368345866L) {
            this.b.K(str);
        } else if (j == 8472049768233163199L) {
            this.b.L(str);
        } else if (j == 1805057142456087674L) {
            this.b.M(str);
        } else if (j == 10220202113345640L) {
            this.b.O(str);
        } else if (j == 800013180966223437L) {
            this.b.P(str);
        } else if (j == 3882830683672803752L) {
            this.b.Q(str);
        } else if (j == 5615326228419484723L) {
            this.b.T(str);
        } else if (j == 7638094872275769326L) {
            this.b.U(str);
        } else if (j == 526508988394598507L) {
            this.b.V(str);
        } else if (j == 19617083574627L) {
            this.b.W(str);
        } else if (j == 5637158515563704755L) {
            this.b.Y(str);
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
        TBLiveOpenCardView z2 = z();
        if (z2 == null) {
            return false;
        }
        fve.e("DXHTBLImageViewWidgetNode", "hit transitionSetEnableKeepLastFrame .");
        z2.setEnableKeepLastFrame(z);
        return true;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.c
    public void s(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0376478", new Object[]{this, bVar});
        } else {
            this.c.s(bVar, getDXRuntimeContext());
        }
    }

    public final HImageView t(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("7b3d6e8d", new Object[]{this, frameLayout});
        }
        HImageView hImageView = new HImageView(frameLayout.getContext());
        hImageView.setId(10);
        frameLayout.addView(hImageView, 0, new FrameLayout.LayoutParams(-1, -1));
        return hImageView;
    }

    public final TBLiveOpenCardView u(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveOpenCardView) ipChange.ipc$dispatch("4d7b649e", new Object[]{this, frameLayout});
        }
        TBLiveOpenCardView tBLiveOpenCardView = new TBLiveOpenCardView(frameLayout.getContext());
        this.f15464a = new WeakReference<>(tBLiveOpenCardView);
        tBLiveOpenCardView.setId(10);
        frameLayout.addView(tBLiveOpenCardView, 0, new FrameLayout.LayoutParams(-1, -1));
        return tBLiveOpenCardView;
    }

    public final void v(FrameLayout frameLayout) {
        HImageView hImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461dd351", new Object[]{this, frameLayout});
            return;
        }
        View findViewById = frameLayout.findViewById(10);
        if (findViewById == null) {
            hImageView = t(frameLayout);
        } else if (findViewById instanceof TBLiveOpenCardView) {
            frameLayout.removeView(findViewById);
            hImageView = t(frameLayout);
        } else if (findViewById instanceof HImageView) {
            hImageView = (HImageView) findViewById;
        } else {
            hImageView = null;
        }
        if (hImageView != null) {
            C(hImageView);
        }
    }

    public final void w(FrameLayout frameLayout) {
        TBLiveOpenCardView tBLiveOpenCardView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8a5540", new Object[]{this, frameLayout});
            return;
        }
        View findViewById = frameLayout.findViewById(10);
        if (findViewById == null) {
            tBLiveOpenCardView = u(frameLayout);
        } else if (findViewById instanceof HImageView) {
            frameLayout.removeView(findViewById);
            tBLiveOpenCardView = u(frameLayout);
        } else if (findViewById instanceof TBLiveOpenCardView) {
            tBLiveOpenCardView = (TBLiveOpenCardView) findViewById;
        } else {
            tBLiveOpenCardView = null;
        }
        if (tBLiveOpenCardView != null) {
            D(tBLiveOpenCardView);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8081bb", new Object[]{this});
        } else if (B()) {
            this.b.B(true);
        }
    }

    public final TextureView y(ViewGroup viewGroup) {
        TextureView y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("4d19f8c2", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (y = y((ViewGroup) childAt)) != null) {
                return y;
            }
        }
        return null;
    }

    public final TBLiveOpenCardView z() {
        View view;
        TBLiveOpenCardView tBLiveOpenCardView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveOpenCardView) ipChange.ipc$dispatch("cb020285", new Object[]{this});
        }
        WeakReference<TBLiveOpenCardView> weakReference = this.f15464a;
        if (weakReference != null && (tBLiveOpenCardView = weakReference.get()) != null) {
            return tBLiveOpenCardView;
        }
        WeakReference<View> wRView = getWRView();
        if (wRView == null || (view = wRView.get()) == null) {
            return null;
        }
        return (TBLiveOpenCardView) view.findViewById(10);
    }

    @Override // tb.s2e
    public Bitmap g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("dccb9a44", new Object[]{this});
        }
        TBLiveOpenCardView z = z();
        if (z == null) {
            return null;
        }
        if (!mve.a("orange_key_get_current_frame_degrade", false)) {
            return z.getCurrentFrame();
        }
        TextureView y = y(z.getPlayerRootView());
        if (y != null) {
            return y.getBitmap();
        }
        fve.e("DXHTBLImageViewWidgetNode", "getTransitionCurrentFrame , degrade to TextureView . ");
        return null;
    }

    @Override // tb.s2e
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5433d07", new Object[]{this})).booleanValue();
        }
        TBLiveOpenCardView z = z();
        if (z == null) {
            return false;
        }
        TUrlImageView cover = z.getCover();
        if (cover == null || cover.getVisibility() != 0) {
            return z.isPlaying();
        }
        fve.e("DXHTBLImageViewWidgetNode", "transitionItemIsPlaying coverView on display.");
        return false;
    }

    public final void F(TBLiveOpenCardView tBLiveOpenCardView) {
        ImageShapeFeature imageShapeFeature;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8031743", new Object[]{this, tBLiveOpenCardView});
            return;
        }
        String i = this.b.i();
        if (!TextUtils.isEmpty(i)) {
            AbsFeature<? super ImageView> findFeature = tBLiveOpenCardView.findFeature(ImageShapeFeature.class);
            if (findFeature != null) {
                imageShapeFeature = (ImageShapeFeature) findFeature;
            } else {
                imageShapeFeature = new ImageShapeFeature();
                imageShapeFeature.setHost((ImageView) tBLiveOpenCardView.getCover());
                tBLiveOpenCardView.addFeature(imageShapeFeature);
            }
            int b = xm7.b(i);
            imageShapeFeature.setShape(b);
            String g = this.b.g();
            double h = this.b.h();
            if (b == 1 && !TextUtils.isEmpty(g)) {
                if (g.endsWith("ap") || g.endsWith("np")) {
                    float e = owo.e(tBLiveOpenCardView.getContext(), g, 0);
                    imageShapeFeature.setCornerRadius(e, e, e, e);
                    int i2 = (int) e;
                    tBLiveOpenCardView.setCornerRadius(i2, i2, i2, i2);
                    return;
                }
                if (h != vu3.b.GEO_NOT_SUPPORT) {
                    f = oak.a(g, 0.0f) * ((float) h);
                } else {
                    f = oak.a(g, 0.0f);
                }
                float b2 = owo.b(tBLiveOpenCardView.getContext(), f / 2.0f);
                imageShapeFeature.setCornerRadius(b2, b2, b2, b2);
                int i3 = (int) b2;
                tBLiveOpenCardView.setCornerRadius(i3, i3, i3, i3);
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
        this.c.q(dXEvent, getDXRuntimeContext());
        long eventId = dXEvent.getEventId();
        if (eventId == 7952648158329995189L) {
            fve.e("DXHTBLImageViewWidgetNode", "receive on scroll start event");
            postEvent(new DXEvent(-1305328253755158825L));
        } else if (eventId == -7968002352509477560L) {
            fve.e("DXHTBLImageViewWidgetNode", "receive on scroll stop event");
            postEvent(new DXEvent(-88908847944554642L));
        } else if (eventId != 5288671110273408574L) {
            return onEvent;
        } else {
            tve.c("live", "live_exposure", "", "Page_Home_VideoPlayer_Count", "", null);
        }
        return true;
    }
}
