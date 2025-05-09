package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IHostConfigInvokeService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.uikit.feature.features.RoundRectShapeFeature;
import java.util.Map;
import tb.t56;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ypa extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DRESS_UP_BIZ_NAME = "dressup";
    public static final long DXHIMAGEVIEW_FILTERTYPE = -7195088064603432654L;
    public static final long DXHIMAGEVIEW_FINALHEIGHT = 971203372675343982L;
    public static final long DXHIMAGEVIEW_FINALWIDTH = -4925026324290810604L;
    public static final long DXHIMAGEVIEW_IMAGEQUALITY = -5438432912811787528L;
    public static final long H_IMAGE_VIEW = 1202423593942681808L;
    public static final long H_IMAGE_VIEW_AUTO_RELEASE = -2989625047271068027L;

    /* renamed from: a  reason: collision with root package name */
    public int f32258a;
    public int b;
    public int c;
    public int e;
    public boolean d = false;
    public IContainerDataService<?> v0 = null;
    public IHostConfigInvokeService w0 = null;
    public String x0 = null;
    public String y0 = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements HImageView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView.a
        public void a(Map<String, String> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("161c040", new Object[]{this, map});
                return;
            }
            DXRuntimeContext dXRuntimeContext = ypa.this.getDXRuntimeContext();
            if (dXRuntimeContext != null) {
                DXTemplateItem p = dXRuntimeContext.p();
                if (!(p == null || (str = p.f7343a) == null)) {
                    map.put("template", str);
                }
                cfc c = j18.c(dXRuntimeContext);
                if (c != null) {
                    map.put("pageName", c.getContainerType().a());
                }
                ypa.b(ypa.this, map, dXRuntimeContext);
            }
            String str2 = map.get("errorCode");
            hve.a("Page_Home", "HomeItemLoad", map.toString(), TextUtils.isEmpty(str2) ? "61000" : str2, "首页图片加载失败");
            tve.b("HomeItemLoad", "", "1.0", "Page_Home_Pic", null, map, str2, "首页图片加载失败");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(486539482);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ypa();
        }
    }

    static {
        t2o.a(486539480);
    }

    public static /* synthetic */ void b(ypa ypaVar, Map map, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6fc3dc", new Object[]{ypaVar, map, dXRuntimeContext});
        } else {
            ypaVar.c(map, dXRuntimeContext);
        }
    }

    public static /* synthetic */ Object ipc$super(ypa ypaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 214595118) {
            super.bindRenderOptions((DXRenderOptions) objArr[0]);
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/HImageWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRenderOptions(DXRenderOptions dXRenderOptions) {
        t56.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca762e", new Object[]{this, dXRenderOptions});
            return;
        }
        super.bindRenderOptions(dXRenderOptions);
        if (dXRenderOptions != null && dXRenderOptions.c() != null && (a2 = dXRenderOptions.c().a()) != null) {
            this.d = a2.a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ypa();
    }

    public final void c(Map<String, String> map, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d8d0f7", new Object[]{this, map, dXRuntimeContext});
            return;
        }
        JSONObject i = dXRuntimeContext.i();
        if (i instanceof BaseSectionModel) {
            BaseSectionModel baseSectionModel = (BaseSectionModel) i;
            String c = wsn.c(baseSectionModel);
            if (!TextUtils.isEmpty(c)) {
                map.put(yj4.PARAM_PVID, c);
            }
            String b2 = wsn.b(baseSectionModel);
            if (!TextUtils.isEmpty(b2)) {
                map.put("cardFeatureId", b2);
            }
        }
    }

    public final ImageStrategyConfig l() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("c4756894", new Object[]{this});
        }
        o();
        ImageStrategyConfig.b v = ImageStrategyConfig.v("guess", 53);
        String str2 = this.x0;
        if (!(str2 == null || (str = this.y0) == null)) {
            v = ImageStrategyConfig.w(str2, str);
        }
        int i = this.c;
        if (i == 100 || (i == 0 && a())) {
            v.o(true);
            z = true;
        }
        TaobaoImageUrlStrategy.ImageQuality u = u(this.c);
        if (u != null) {
            v.i(u);
        }
        if (this.f32258a > 0 && this.b > 0 && (!bve.t() || !z)) {
            v.j(this.b).h(this.f32258a);
        }
        if (v != null) {
            return v.a();
        }
        return dje.GUESS_IMAGE_STRATEGY_CONFIG;
    }

    public final void o() {
        JSONObject hostConfig;
        cfc c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5d01bc", new Object[]{this});
            return;
        }
        if (this.w0 == null) {
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext != null && (c = j18.c(dXRuntimeContext)) != null) {
                this.w0 = (IHostConfigInvokeService) c.a(IHostConfigInvokeService.class);
            } else {
                return;
            }
        }
        IHostConfigInvokeService iHostConfigInvokeService = this.w0;
        if (iHostConfigInvokeService != null && (hostConfig = iHostConfigInvokeService.getHostConfig()) != null) {
            this.x0 = hostConfig.getString(IHostConfigInvokeService.KEY_IMAGE_BIZ_TYPE);
            this.y0 = hostConfig.getString(IHostConfigInvokeService.KEY_IMAGE_BIZ_ID);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof ypa) {
            ypa ypaVar = (ypa) dXWidgetNode;
            this.e = ypaVar.e;
            this.d = ypaVar.d;
            this.b = ypaVar.b;
            this.f32258a = ypaVar.f32258a;
            this.c = ypaVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        HImageView hImageView = new HImageView(context);
        hImageView.setFailListener(t());
        return hImageView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof HImageView) {
            HImageView hImageView = (HImageView) view;
            setImageScaleType(hImageView, getScaleType());
            hImageView.setAutoRelease(this.d);
            if (isNeedSetBackground()) {
                int cornerRadius = getCornerRadius();
                x(hImageView, getCornerRadius() > 0 ? new int[]{cornerRadius, cornerRadius, cornerRadius, cornerRadius} : new int[]{getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusRightBottom(), getCornerRadiusLeftBottom()});
            }
            try {
                int drawableId = DXImageWidgetNode.getDrawableId(context, getPlaceHolderName());
                if (drawableId != 0) {
                    hImageView.setPlaceHoldForeground(ContextCompat.getDrawable(context, drawableId));
                } else {
                    hImageView.setPlaceHoldForeground(null);
                }
            } catch (Throwable unused) {
                hImageView.setPlaceHoldForeground(null);
            }
            p2b.v(this, hImageView, getImageUrl());
            v(hImageView);
            lle.b(hImageView, this.e);
            p2b.u(this, hImageView);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (-2989625047271068027L == j) {
            if (i != 1) {
                z = false;
            }
            this.d = z;
        } else if (-7195088064603432654L == j) {
            this.e = i;
        } else if (j == DXHIMAGEVIEW_FINALHEIGHT) {
            this.f32258a = i;
        } else if (j == DXHIMAGEVIEW_FINALWIDTH) {
            this.b = i;
        } else if (j == DXHIMAGEVIEW_IMAGEQUALITY) {
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public final HImageView.a t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView.a) ipChange.ipc$dispatch("d963e16", new Object[]{this});
        }
        return new a();
    }

    public final TaobaoImageUrlStrategy.ImageQuality u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageQuality) ipChange.ipc$dispatch("3644763", new Object[]{this, new Integer(i)});
        }
        if (i == 30) {
            return TaobaoImageUrlStrategy.ImageQuality.q30;
        }
        if (i == 50) {
            return TaobaoImageUrlStrategy.ImageQuality.q50;
        }
        if (i == 60) {
            return TaobaoImageUrlStrategy.ImageQuality.q60;
        }
        if (i == 75) {
            return TaobaoImageUrlStrategy.ImageQuality.q75;
        }
        if (i == 90) {
            return TaobaoImageUrlStrategy.ImageQuality.q90;
        }
        if (i != 100) {
            return null;
        }
        return TaobaoImageUrlStrategy.ImageQuality.q99;
    }

    public void v(HImageView hImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83316a51", new Object[]{this, hImageView});
        } else if (!TextUtils.isEmpty(getImageUrl())) {
            if (!p2b.k()) {
                hImageView.preRender(true);
            }
            p2b.r(hImageView, getImageUrl(), null, l(), getDXRuntimeContext().p());
            if (!bve.m()) {
                hImageView.setImageUrl(getImageUrl());
            } else if (p2b.g(getImageUrl(), dje.GUESS_IMAGE_STRATEGY_CONFIG) == p2b.IMAGE_STRATEGY_CONFIG) {
                hImageView.asyncSetImageUrl(getImageUrl());
            } else {
                hImageView.setImageUrl(getImageUrl());
            }
        } else if (getLocalImageDrawable() != null) {
            setLocalImage(hImageView, getLocalImageDrawable());
        } else if (!TextUtils.isEmpty(getImageName())) {
            setLocalRes(hImageView, getImageName());
        } else {
            hImageView.setImageUrl(null);
        }
    }

    public final void x(HImageView hImageView, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a79618", new Object[]{this, hImageView, iArr});
            return;
        }
        RoundRectShapeFeature roundRectShapeFeature = (RoundRectShapeFeature) hImageView.findFeature(RoundRectShapeFeature.class);
        if (iArr[0] > 0 || iArr[1] > 0 || iArr[2] > 0 || iArr[3] > 0) {
            if (roundRectShapeFeature == null) {
                roundRectShapeFeature = new RoundRectShapeFeature();
                hImageView.addFeature(roundRectShapeFeature);
            }
            roundRectShapeFeature.setCornerRadius(iArr[0], iArr[1], iArr[2], iArr[3]);
        } else if (roundRectShapeFeature != null) {
            hImageView.removeFeature(RoundRectShapeFeature.class);
        }
    }

    public final boolean a() {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        JSONObject ext;
        cfc c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("346c5e14", new Object[]{this})).booleanValue();
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return false;
        }
        if (this.v0 == null && (c = j18.c(dXRuntimeContext)) != null) {
            this.v0 = (IContainerDataService) c.a(IContainerDataService.class);
        }
        IContainerDataService<?> iContainerDataService = this.v0;
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || (base = containerData.getBase()) == null || (ext = base.getExt()) == null) {
            return false;
        }
        return TextUtils.equals("true", ext.getString("enableImageHeightScale"));
    }
}
