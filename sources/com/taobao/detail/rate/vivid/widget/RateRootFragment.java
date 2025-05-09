package com.taobao.detail.rate.vivid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.a07;
import tb.ckf;
import tb.d1g;
import tb.dx1;
import tb.gbv;
import tb.iwb;
import tb.k66;
import tb.mv5;
import tb.mvb;
import tb.n0u;
import tb.n9l;
import tb.odg;
import tb.onm;
import tb.pb6;
import tb.u38;
import tb.v7t;
import tb.vgn;
import tb.y46;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u0016\u0010:\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00102R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00102R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/taobao/detail/rate/vivid/widget/RateRootFragment;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "Ltb/xhv;", "onLayout", "(ZIIII)V", "renderTemplate", "()V", "Lcom/taobao/android/dinamicx/DinamicXEngine;", gbv.PARAM_KEY_DX_ENGINE, "Lcom/alibaba/fastjson/JSONObject;", "dxInfo", "paramsInfo", "Lcom/taobao/android/dinamicx/DXRenderOptions$b;", "dxRender", "initDinamicX", "(Lcom/taobao/android/dinamicx/DinamicXEngine;Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/fastjson/JSONObject;Lcom/taobao/android/dinamicx/DXRenderOptions$b;)V", "enable", "setAdaptByViewSize", "(Z)V", "Lcom/taobao/android/dinamicx/DXResult;", "Lcom/taobao/android/dinamicx/DXRootView;", "dxResult", "Lcom/taobao/android/dinamicx/DXResult;", "mDxEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "getMDxEngine", "()Lcom/taobao/android/dinamicx/DinamicXEngine;", "setMDxEngine", "(Lcom/taobao/android/dinamicx/DinamicXEngine;)V", "templeFieldsData", "Lcom/alibaba/fastjson/JSONObject;", "getTempleFieldsData", "()Lcom/alibaba/fastjson/JSONObject;", "setTempleFieldsData", "(Lcom/alibaba/fastjson/JSONObject;)V", "defaultWidthSpec", TLogTracker.LEVEL_INFO, "getDefaultWidthSpec", "()I", "setDefaultWidthSpec", "(I)V", "defaultHeightSpec", "getDefaultHeightSpec", "setDefaultHeightSpec", "mWidth", "mHeight", "mIsAdaptByViewSize", "Z", "renderOptions", "Lcom/taobao/android/dinamicx/DXRenderOptions$b;", "getRenderOptions", "()Lcom/taobao/android/dinamicx/DXRenderOptions$b;", "setRenderOptions", "(Lcom/taobao/android/dinamicx/DXRenderOptions$b;)V", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RateRootFragment extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int defaultHeightSpec;
    private int defaultWidthSpec;
    private DXResult<DXRootView> dxResult;
    private DinamicXEngine mDxEngine;
    private int mHeight;
    private boolean mIsAdaptByViewSize;
    private int mWidth;
    private DXRenderOptions.b renderOptions;
    private JSONObject templeFieldsData;

    public RateRootFragment(Context context) {
        this(context, null, 0, 6, null);
    }

    public static final /* synthetic */ DXResult access$getDxResult$p(RateRootFragment rateRootFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("cef67c80", new Object[]{rateRootFragment});
        }
        return rateRootFragment.dxResult;
    }

    public static final /* synthetic */ void access$setDxResult$p(RateRootFragment rateRootFragment, DXResult dXResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff11d98", new Object[]{rateRootFragment, dXResult});
        } else {
            rateRootFragment.dxResult = dXResult;
        }
    }

    public static /* synthetic */ Object ipc$super(RateRootFragment rateRootFragment, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/widget/RateRootFragment");
    }

    public final int getDefaultHeightSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("276ff3e7", new Object[]{this})).intValue();
        }
        return this.defaultHeightSpec;
    }

    public final int getDefaultWidthSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59df9a50", new Object[]{this})).intValue();
        }
        return this.defaultWidthSpec;
    }

    public final DinamicXEngine getMDxEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("ff60e0b3", new Object[]{this});
        }
        return this.mDxEngine;
    }

    public final DXRenderOptions.b getRenderOptions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRenderOptions.b) ipChange.ipc$dispatch("7fe56812", new Object[]{this});
        }
        return this.renderOptions;
    }

    public final JSONObject getTempleFieldsData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b1ce8a4d", new Object[]{this});
        }
        return this.templeFieldsData;
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
                renderTemplate();
            }
        }
    }

    public final void renderTemplate() {
        DXRootView dXRootView;
        DXWidgetNode expandWidgetNode;
        d1g d1gVar = d1g.INSTANCE;
        v7t.d(d1gVar.a(), "renderTemplate.Start");
        DXResult<DXRootView> dXResult = this.dxResult;
        mvb mvbVar = null;
        if (dXResult != null) {
            this.defaultWidthSpec = DXWidgetNode.DXMeasureSpec.c(getMeasuredWidth(), 1073741824);
            this.defaultHeightSpec = DXWidgetNode.DXMeasureSpec.c(getMeasuredHeight(), 1073741824);
            DXRenderOptions.b bVar = this.renderOptions;
            if (bVar != null) {
                bVar.G(this.defaultWidthSpec).t(this.defaultHeightSpec);
            }
            DinamicXEngine dinamicXEngine = this.mDxEngine;
            if (dinamicXEngine != null) {
                if (this.mIsAdaptByViewSize) {
                    DXEngineConfig d = dinamicXEngine.d();
                    ckf.f(d, "engine.config");
                    d.J(getMeasuredWidth());
                }
                Context context = getContext();
                DXRootView dXRootView2 = dXResult.f7291a;
                DXRootView dXRootView3 = dXRootView2;
                ckf.f(dXRootView2, "it.result");
                DXTemplateItem dxTemplateItem = dXRootView2.getDxTemplateItem();
                JSONObject jSONObject = this.templeFieldsData;
                DXRenderOptions.b bVar2 = this.renderOptions;
                dinamicXEngine.i1(context, dXRootView3, dxTemplateItem, jSONObject, 0, bVar2 != null ? bVar2.q() : null);
            }
        }
        v7t.d(d1gVar.a(), "renderTemplate.End");
        n9l n9lVar = n9l.INSTANCE;
        if (n9lVar.U()) {
            DXResult<DXRootView> dXResult2 = this.dxResult;
            DXWidgetNode queryWTByUserId = (dXResult2 == null || (dXRootView = dXResult2.f7291a) == null || (expandWidgetNode = dXRootView.getExpandWidgetNode()) == null) ? null : expandWidgetNode.queryWTByUserId(WXBasicComponentType.RECYCLER);
            if (queryWTByUserId instanceof DXRecyclerLayout) {
                try {
                    DXRuntimeContext dXRuntimeContext = ((DXRecyclerLayout) queryWTByUserId).getDXRuntimeContext();
                    if (dXRuntimeContext != null) {
                        mvbVar = dXRuntimeContext.w(mv5.DX_EVENT_EVENTCHAIN);
                    }
                    if (mvbVar instanceof y46) {
                        WaterfallLayout q0 = ((DXRecyclerLayout) queryWTByUserId).q0();
                        ckf.f(q0, "recycler.waterfallLayout");
                        ((y46) mvbVar).k(q0.k());
                    }
                    Field declaredField = RecyclerView.class.getDeclaredField("mMaxFlingVelocity");
                    ckf.f(declaredField, "field");
                    declaredField.setAccessible(true);
                    WaterfallLayout q02 = ((DXRecyclerLayout) queryWTByUserId).q0();
                    ckf.f(q02, "recycler.waterfallLayout");
                    declaredField.set(q02.k(), Integer.valueOf(pb6.f(getContext(), n9lVar.n())));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        v7t.d(d1g.INSTANCE.a(), "renderTemplate.End1");
    }

    public final void setAdaptByViewSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518d5390", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsAdaptByViewSize = z;
        }
    }

    public final void setDefaultHeightSpec(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d2999b", new Object[]{this, new Integer(i)});
        } else {
            this.defaultHeightSpec = i;
        }
    }

    public final void setDefaultWidthSpec(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b226d6ba", new Object[]{this, new Integer(i)});
        } else {
            this.defaultWidthSpec = i;
        }
    }

    public final void setMDxEngine(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11946a79", new Object[]{this, dinamicXEngine});
        } else {
            this.mDxEngine = dinamicXEngine;
        }
    }

    public final void setRenderOptions(DXRenderOptions.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2361565c", new Object[]{this, bVar});
        } else {
            this.renderOptions = bVar;
        }
    }

    public final void setTempleFieldsData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a623d7", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "<set-?>");
        this.templeFieldsData = jSONObject;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f10379a;
        public final /* synthetic */ long b;
        public final /* synthetic */ RateRootFragment c;
        public final /* synthetic */ DinamicXEngine d;

        public a(Ref$BooleanRef ref$BooleanRef, long j, RateRootFragment rateRootFragment, JSONObject jSONObject, DinamicXEngine dinamicXEngine) {
            this.f10379a = ref$BooleanRef;
            this.b = j;
            this.c = rateRootFragment;
            this.d = dinamicXEngine;
        }

        @Override // tb.iwb
        public final void onNotificationListener(k66 k66Var) {
            DXRootView dXRootView;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            List<DXTemplateItem> list = k66Var.f22428a;
            if (list == null || list.isEmpty()) {
                n0u.d(dx1.Companion.b(R.string.rate_load_failed_retry_later));
                return;
            }
            List<DXTemplateItem> list2 = k66Var.f22428a;
            ckf.f(list2, "result.finishedTemplateItems");
            Iterator<T> it = list2.iterator();
            while (true) {
                dXRootView = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((DXTemplateItem) obj).f7343a.equals(n9l.INSTANCE.m())) {
                    break;
                }
            }
            DXTemplateItem dXTemplateItem = (DXTemplateItem) obj;
            if (dXTemplateItem != null && !this.f10379a.element) {
                long currentTimeMillis = System.currentTimeMillis() - this.b;
                JSONObject jSONObject = this.c.getTempleFieldsData().getJSONObject("params");
                if (jSONObject != null) {
                    jSONObject.put("dxDownloadTime", (Object) Long.valueOf(currentTimeMillis));
                }
                DXTemplateItem u = this.d.u(dXTemplateItem);
                if (onm.INSTANCE.b()) {
                    RateRootFragment rateRootFragment = this.c;
                    RateRootFragment.access$setDxResult$p(rateRootFragment, this.d.z0(rateRootFragment.getContext(), u));
                } else {
                    RateRootFragment rateRootFragment2 = this.c;
                    RateRootFragment.access$setDxResult$p(rateRootFragment2, this.d.o(rateRootFragment2.getContext(), u));
                }
                DXResult access$getDxResult$p = RateRootFragment.access$getDxResult$p(this.c);
                if (access$getDxResult$p != null) {
                    dXRootView = (DXRootView) access$getDxResult$p.f7291a;
                }
                if (dXRootView != null) {
                    this.c.addView(dXRootView);
                } else {
                    vgn.b();
                    odg.c(RateFeedsFragment.TAG, "dx root view is null");
                }
                this.f10379a.element = true;
                this.c.renderTemplate();
                v7t.d(d1g.INSTANCE.a(), dx1.Companion.b(R.string.rate_no_history_refresh_template));
            }
            u38.INSTANCE.d(k66Var);
        }
    }

    public RateRootFragment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RateRootFragment(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateRootFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        this.templeFieldsData = new JSONObject();
        this.defaultWidthSpec = -1;
        this.defaultHeightSpec = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initDinamicX(com.taobao.android.dinamicx.DinamicXEngine r18, com.alibaba.fastjson.JSONObject r19, com.alibaba.fastjson.JSONObject r20, com.taobao.android.dinamicx.DXRenderOptions.b r21) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.vivid.widget.RateRootFragment.initDinamicX(com.taobao.android.dinamicx.DinamicXEngine, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, com.taobao.android.dinamicx.DXRenderOptions$b):void");
    }
}
