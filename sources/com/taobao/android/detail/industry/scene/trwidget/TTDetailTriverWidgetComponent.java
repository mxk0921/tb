package com.taobao.android.detail.industry.scene.trwidget;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.widget.ScrollFrameLayout;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.taobao.R;
import java.util.Map;
import tb.fks;
import tb.mte;
import tb.nb4;
import tb.pb6;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailTriverWidgetComponent extends mte {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_FIELDS_WIDGET_DATA = "widgetData";
    private volatile boolean mHasRender;
    private TRWidgetInstance mTRWidgetInstance;
    private View mTRWidgetView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TTDetailTriverWidgetComponent f6599a;

        public a(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent) {
            super(null);
            this.f6599a = tTDetailTriverWidgetComponent;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1181921475) {
                super.onRenderSuccess((View) objArr[0]);
                return null;
            } else if (hashCode == 1637948257) {
                super.f((MotionEvent) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/industry/scene/trwidget/TTDetailTriverWidgetComponent$1");
            }
        }

        @Override // com.taobao.android.detail.industry.scene.trwidget.TTDetailTriverWidgetComponent.b, com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void f(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61a11b61", new Object[]{this, motionEvent});
                return;
            }
            super.f(motionEvent);
            TTDetailTriverWidgetComponent.access$400(this.f6599a, new RuntimeAbilityParam[0]);
        }

        @Override // com.taobao.android.detail.industry.scene.trwidget.TTDetailTriverWidgetComponent.b, com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void onRenderSuccess(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
                return;
            }
            super.onRenderSuccess(view);
            TTDetailTriverWidgetComponent.access$102(this.f6599a, view);
            if (TTDetailTriverWidgetComponent.access$200(this.f6599a) != null) {
                TTDetailTriverWidgetComponent.access$300(this.f6599a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements TRWidgetInstance.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(440401992);
        }

        public b() {
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c48665a", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26d671a6", new Object[]{this, str, jSONObject});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("795348cd", new Object[]{this, jSONObject});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c64d12", new Object[]{this, str});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void e(fks fksVar, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3608db", new Object[]{this, fksVar, map});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void f(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61a11b61", new Object[]{this, motionEvent});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8bf4211", new Object[]{this, str});
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void onRenderSuccess(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        t2o.a(440401990);
    }

    public TTDetailTriverWidgetComponent(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        this.mTRWidgetInstance = new TRWidgetInstance((FragmentActivity) context);
    }

    public static /* synthetic */ View access$102(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("31f84e99", new Object[]{tTDetailTriverWidgetComponent, view});
        }
        tTDetailTriverWidgetComponent.mTRWidgetView = view;
        return view;
    }

    public static /* synthetic */ ScrollFrameLayout access$200(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollFrameLayout) ipChange.ipc$dispatch("712282e8", new Object[]{tTDetailTriverWidgetComponent});
        }
        return tTDetailTriverWidgetComponent.mContentContainer;
    }

    public static /* synthetic */ void access$300(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad67975b", new Object[]{tTDetailTriverWidgetComponent});
        } else {
            tTDetailTriverWidgetComponent.addContentView();
        }
    }

    public static /* synthetic */ void access$400(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c3e3dc", new Object[]{tTDetailTriverWidgetComponent, runtimeAbilityParamArr});
        } else {
            tTDetailTriverWidgetComponent.triggerClickEvent(runtimeAbilityParamArr);
        }
    }

    private void addContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d9bd64", new Object[]{this});
        } else if (this.mContentContainer.getChildAt(0) != this.mTRWidgetView) {
            this.mContentContainer.removeAllViews();
            this.mContentContainer.addView(this.mTRWidgetView, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    private WidgetStartParams getRenderData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetStartParams) ipChange.ipc$dispatch("1b661b4", new Object[]{this});
        }
        try {
            return (WidgetStartParams) this.mComponentData.f().getJSONObject(KEY_FIELDS_WIDGET_DATA).toJavaObject(WidgetStartParams.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(TTDetailTriverWidgetComponent tTDetailTriverWidgetComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1978560141:
                super.onActivityPageResumed((Activity) objArr[0]);
                return null;
            case -1898152289:
                super.onComponentExpand();
                return null;
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1634521564:
                super.onActivityPagePaused((Activity) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -72375978:
                super.onComponentViewDetachedFromWindow();
                return null;
            case 502306446:
                super.onComponentShrink();
                return null;
            case 665468393:
                super.onActivityPageStopped((Activity) objArr[0]);
                return null;
            case 1252518699:
                super.onDisAppear();
                return null;
            case 1683070809:
                super.onComponentViewAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/scene/trwidget/TTDetailTriverWidgetComponent");
        }
    }

    private void renderTRiverWidget() {
        WidgetStartParams renderData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5310ae99", new Object[]{this});
        } else if (!this.mHasRender && (renderData = getRenderData()) != null) {
            this.mTRWidgetInstance.render(renderData, new a(this));
            this.mTRWidgetInstance.getRootView().setTag(R.id.industry_triver_widget_tt_detail_component_instance, this);
            this.mHasRender = true;
        }
    }

    private void updateTRiverSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4410b49", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view != null) {
            float width = view.getWidth();
            this.mTRWidgetInstance.updateSize(pb6.z(this.mContext, width) * 2, pb6.z(this.mContext, width / getFrameDimensionRatio()) * 2);
        }
    }

    @Override // tb.mte
    public void onActivityPagePaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e932e24", new Object[]{this, activity});
            return;
        }
        super.onActivityPagePaused(activity);
        if (activity == this.mContext) {
            this.mTRWidgetInstance.pause();
        }
    }

    @Override // tb.mte
    public void onActivityPageResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a119173", new Object[]{this, activity});
            return;
        }
        super.onActivityPageResumed(activity);
        if (activity == this.mContext) {
            this.mTRWidgetInstance.resume();
        }
    }

    @Override // tb.mte
    public void onActivityPageStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27aa3de9", new Object[]{this, activity});
            return;
        }
        super.onActivityPageStopped(activity);
        if (activity == this.mContext) {
            this.mTRWidgetInstance.stop();
        }
    }

    @Override // tb.mte
    public void onComponentExpand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edc7e9f", new Object[]{this});
            return;
        }
        super.onComponentExpand();
        updateTRiverSize();
    }

    @Override // tb.mte
    public void onComponentShrink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df0968e", new Object[]{this});
            return;
        }
        super.onComponentShrink();
        updateTRiverSize();
    }

    @Override // tb.mte
    public void onComponentViewAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64519f59", new Object[]{this});
            return;
        }
        super.onComponentViewAttachedToWindow();
        this.mTRWidgetInstance.onAttach(null);
    }

    @Override // tb.mte
    public void onComponentViewDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbafa156", new Object[]{this});
            return;
        }
        super.onComponentViewDetachedFromWindow();
        this.mTRWidgetInstance.onDetach(null);
    }

    @Override // tb.mte, tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mTRWidgetInstance.destroy();
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        renderTRiverWidget();
        this.mTRWidgetInstance.onAttach(null);
    }

    @Override // tb.mte, tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        super.onDisAppear();
        this.mTRWidgetInstance.onDetach(null);
    }

    @Override // tb.mte
    public void onViewUpdate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e7b33e", new Object[]{this, view});
        } else if (this.mTRWidgetView != null) {
            addContentView();
        }
    }
}
