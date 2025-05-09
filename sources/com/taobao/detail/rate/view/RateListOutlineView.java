package com.taobao.detail.rate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.a07;
import tb.ckf;
import tb.d1g;
import tb.gbv;
import tb.iwb;
import tb.k66;
import tb.n9l;
import tb.v7t;
import tb.vwo;
import tb.xhv;
import tb.xz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u0010.\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/taobao/detail/rate/view/RateListOutlineView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "width", "height", "Ltb/xhv;", "renderTemplate", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lcom/taobao/android/dinamicx/DinamicXEngine;", gbv.PARAM_KEY_DX_ENGINE, "Lcom/alibaba/fastjson/JSONObject;", "renderData", "setRenderData", "(Lcom/taobao/android/dinamicx/DinamicXEngine;Lcom/alibaba/fastjson/JSONObject;)Z", "Lcom/taobao/android/dinamicx/DXResult;", "Lcom/taobao/android/dinamicx/DXRootView;", "dxResult", "Lcom/taobao/android/dinamicx/DXResult;", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "Lcom/alibaba/fastjson/JSONObject;", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "templateItem", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "defaultWidthSpec", TLogTracker.LEVEL_INFO, "defaultHeightSpec", "Lcom/taobao/android/dinamicx/DXRenderOptions$b;", "renderOptions", "Lcom/taobao/android/dinamicx/DXRenderOptions$b;", "mWidth", "mHeight", "hasRender", "Z", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RateListOutlineView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int defaultHeightSpec;
    private int defaultWidthSpec;
    private DinamicXEngine dxEngine;
    private DXResult<DXRootView> dxResult;
    private boolean hasRender;
    private int mHeight;
    private int mWidth;
    private JSONObject renderData;
    private DXRenderOptions.b renderOptions;
    private DXTemplateItem templateItem;

    public RateListOutlineView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static final /* synthetic */ DXResult access$getDxResult$p(RateListOutlineView rateListOutlineView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("e050df1d", new Object[]{rateListOutlineView});
        }
        return rateListOutlineView.dxResult;
    }

    public static final /* synthetic */ void access$setDxResult$p(RateListOutlineView rateListOutlineView, DXResult dXResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae29fb03", new Object[]{rateListOutlineView, dXResult});
        } else {
            rateListOutlineView.dxResult = dXResult;
        }
    }

    public static /* synthetic */ Object ipc$super(RateListOutlineView rateListOutlineView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/view/RateListOutlineView");
    }

    public static /* synthetic */ void renderTemplate$default(RateListOutlineView rateListOutlineView, int i, int i2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c00d35", new Object[]{rateListOutlineView, new Integer(i), new Integer(i2), new Integer(i3), obj});
            return;
        }
        if ((i3 & 1) != 0) {
            i = vwo.f(rateListOutlineView.getContext());
        }
        if ((i3 & 2) != 0) {
            i2 = vwo.e(rateListOutlineView.getContext());
        }
        rateListOutlineView.renderTemplate(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight > 0 && measuredWidth > 0) {
            if (this.mHeight != measuredHeight || this.mWidth != measuredWidth) {
                this.mHeight = measuredHeight;
                this.mWidth = measuredWidth;
                renderTemplate(measuredWidth, measuredHeight);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$BooleanRef b;
        public final /* synthetic */ DinamicXEngine c;

        public a(Ref$BooleanRef ref$BooleanRef, DinamicXEngine dinamicXEngine) {
            this.b = ref$BooleanRef;
            this.c = dinamicXEngine;
        }

        @Override // tb.iwb
        public final void onNotificationListener(k66 k66Var) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            List<DXTemplateItem> list = k66Var.f22428a;
            if (list != null && !list.isEmpty()) {
                List<DXTemplateItem> list2 = k66Var.f22428a;
                ckf.f(list2, "result.finishedTemplateItems");
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((DXTemplateItem) obj).f7343a.equals("tb_rate_list_layout_outline")) {
                        break;
                    }
                }
                DXTemplateItem dXTemplateItem = (DXTemplateItem) obj;
                if (dXTemplateItem != null && !this.b.element) {
                    RateListOutlineView rateListOutlineView = RateListOutlineView.this;
                    RateListOutlineView.access$setDxResult$p(rateListOutlineView, this.c.z0(rateListOutlineView.getContext(), this.c.u(dXTemplateItem)));
                    RateListOutlineView rateListOutlineView2 = RateListOutlineView.this;
                    DXResult access$getDxResult$p = RateListOutlineView.access$getDxResult$p(rateListOutlineView2);
                    rateListOutlineView2.addView(access$getDxResult$p != null ? (DXRootView) access$getDxResult$p.f7291a : null);
                    this.b.element = true;
                    RateListOutlineView.renderTemplate$default(RateListOutlineView.this, 0, 0, 3, null);
                }
            }
        }
    }

    public RateListOutlineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void renderTemplate(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655b7757", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        d1g d1gVar = d1g.INSTANCE;
        v7t.d(d1gVar.a(), "outline.renderTemplate.Start");
        if (!this.hasRender) {
            this.hasRender = true;
            DXResult<DXRootView> dXResult = this.dxResult;
            if (dXResult != null) {
                this.defaultWidthSpec = DXWidgetNode.DXMeasureSpec.c(i, 1073741824);
                this.defaultHeightSpec = DXWidgetNode.DXMeasureSpec.c(i2, 1073741824);
                DXRenderOptions.b bVar = this.renderOptions;
                if (bVar != null) {
                    bVar.G(this.defaultWidthSpec).t(this.defaultHeightSpec);
                }
                DinamicXEngine dinamicXEngine = this.dxEngine;
                if (dinamicXEngine != null) {
                    Context context = getContext();
                    DXRootView dXRootView = dXResult.f7291a;
                    DXRootView dXRootView2 = dXRootView;
                    ckf.f(dXRootView, "it.result");
                    DXTemplateItem dxTemplateItem = dXRootView.getDxTemplateItem();
                    JSONObject jSONObject = this.renderData;
                    DXRenderOptions.b bVar2 = this.renderOptions;
                    dinamicXEngine.i1(context, dXRootView2, dxTemplateItem, jSONObject, 0, bVar2 != null ? bVar2.q() : null);
                }
            }
            v7t.d(d1gVar.a(), "outline.renderTemplate.End");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateListOutlineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Long l;
        ckf.g(context, "context");
        this.renderData = new JSONObject();
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        JSONObject s = n9l.INSTANCE.s();
        dXTemplateItem.b = (s == null || (l = s.getLong("version")) == null) ? 0L : l.longValue();
        String str = null;
        dXTemplateItem.f7343a = s != null ? s.getString("name") : null;
        dXTemplateItem.c = s != null ? s.getString("url") : str;
        xhv xhvVar = xhv.INSTANCE;
        this.templateItem = dXTemplateItem;
        this.defaultWidthSpec = -1;
        this.defaultHeightSpec = -1;
        this.renderOptions = new DXRenderOptions.b();
    }

    public final boolean setRenderData(DinamicXEngine dinamicXEngine, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf5eee9a", new Object[]{this, dinamicXEngine, jSONObject})).booleanValue();
        }
        ckf.g(dinamicXEngine, gbv.PARAM_KEY_DX_ENGINE);
        ckf.g(jSONObject, "renderData");
        this.dxEngine = dinamicXEngine;
        this.renderData = jSONObject;
        DXTemplateItem u = dinamicXEngine.u(this.templateItem);
        if (u == null || u.b < this.templateItem.b) {
            z = false;
        }
        if (z) {
            DXResult<DXRootView> z0 = dinamicXEngine.z0(getContext(), u);
            this.dxResult = z0;
            addView(z0 != null ? z0.f7291a : null);
            renderTemplate$default(this, 0, 0, 3, null);
            v7t.d(d1g.INSTANCE.a(), "outline.有历史，直接渲染");
        } else {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = false;
            dinamicXEngine.p(xz3.e(this.templateItem));
            dinamicXEngine.a1(new a(ref$BooleanRef, dinamicXEngine));
        }
        return z;
    }

    public /* synthetic */ RateListOutlineView(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
