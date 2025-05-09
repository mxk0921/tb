package com.taobao.android.turbo.subpage.component;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.utils.DeviceUtil;
import com.taobao.android.turbo.view.WeexFrameLayout;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.at4;
import tb.ckf;
import tb.dde;
import tb.dps;
import tb.gde;
import tb.kpc;
import tb.mqu;
import tb.ni8;
import tb.npc;
import tb.nuo;
import tb.r6o;
import tb.t2o;
import tb.tfs;
import tb.tpu;
import tb.w6a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000 J2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001KBA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010 J%\u0010+\u001a\u00020\u00152\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0003H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u00020\u00152\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00102J\u0017\u00105\u001a\u00020\u00152\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b5\u00102J\u0017\u00107\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00152\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b9\u00102J\u0017\u0010:\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b:\u0010 R\u0018\u0010;\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/taobao/android/turbo/subpage/component/WeexSubPageComponent;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "Lcom/taobao/android/turbo/view/WeexFrameLayout;", "Ltb/gde;", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;", OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE, "", "componentId", "Landroid/content/Context;", "context", "", "host", "pageURL", "engineId", "Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;", "serviceDelegate", "<init>", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;)V", "rootView", "url", "Ltb/xhv;", "initWeexInstance", "(Lcom/taobao/android/turbo/view/WeexFrameLayout;Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/view/ViewParent;", "findViewParentIfNeeds", "(Landroid/view/View;)Landroid/view/ViewParent;", "Lcom/alibaba/fastjson/JSONObject;", "message", "sendWeexMessage", "(Lcom/alibaba/fastjson/JSONObject;)V", "", "errorCode", "errorMsg", "showDefaultErrorView", "(ILjava/lang/String;)V", "hideDefaultErrorView", "()V", "args", "sendOuterMessage", "", "onRefresh", "(Ljava/util/Map;)V", "createViewImpl", "()Lcom/taobao/android/turbo/view/WeexFrameLayout;", "Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;", "triggerType", "onResume", "(Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;)V", "onStart", "onPause", "onStop", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$b;", "handleOuterMessage", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$b;)V", "onDestroy", "onWeexMessage", "errorView", "Landroid/view/View;", "weexUrl", "Ljava/lang/String;", "Lcom/taobao/android/weex_framework/a;", "musInstance", "Lcom/taobao/android/weex_framework/a;", "", "scrollNeedConsume", "Z", "weexData", "Lcom/alibaba/fastjson/JSONObject;", "", "weexOptions", "Ljava/util/Map;", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WeexSubPageComponent extends BaseSubPageComponent<BaseSubPageComponent.SubPageModel, WeexFrameLayout> implements gde {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "WeexSubPageComponent";
    private View errorView;
    private com.taobao.android.weex_framework.a musInstance;
    private boolean scrollNeedConsume;
    private JSONObject weexData = new JSONObject();
    private final Map<String, Object> weexOptions = new HashMap();
    private String weexUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455718);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexFrameLayout b;

        public b(WeexFrameLayout weexFrameLayout) {
            this.b = weexFrameLayout;
        }

        @Override // tb.kpc
        public final void a(View view) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, WeexSubPageComponent.TAG, "onCreateView, weexView=" + view + ", this=" + WeexSubPageComponent.this, null, 4, null);
            if (view != null) {
                BaseSubPageComponent.SubPageModel subPageModel = (BaseSubPageComponent.SubPageModel) WeexSubPageComponent.this.getData();
                if (!DeviceUtil.Companion.g() || !(subPageModel instanceof DrawerModel)) {
                    i = r6o.Companion.h(WeexSubPageComponent.access$getContext$p(WeexSubPageComponent.this));
                } else {
                    DrawerModel drawerModel = (DrawerModel) subPageModel;
                    i = (at4.a.c(at4.Companion, WeexSubPageComponent.access$getContext$p(WeexSubPageComponent.this), Integer.valueOf(drawerModel.getWidth()), false, 4, null) * 750) / drawerModel.getWidth();
                }
                tpu.a.b(aVar, WeexSubPageComponent.TAG, "onCreateView, layoutWidth=" + i, null, 4, null);
                view.setLayoutParams(new FrameLayout.LayoutParams(i, -1));
                this.b.addView(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            } else {
                ckf.g(mUSDKInstance, "musdkInstance");
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            ckf.g(aVar, "musInstance");
            ckf.g(str, "s");
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, "musInstance");
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, WeexSubPageComponent.TAG, "weex onPrepareSuccess url: " + this.b, null, 4, null);
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            ckf.g(aVar, "musInstance");
            ckf.g(str, "s");
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            } else {
                ckf.g(aVar, "musInstance");
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            ckf.g(aVar, "musInstance");
            ckf.g(str, "s");
            tpu.a.b(tpu.Companion, WeexSubPageComponent.TAG, "weex onRenderFailed error: ".concat(str), null, 4, null);
            WeexSubPageComponent.access$showDefaultErrorView(WeexSubPageComponent.this, i, str);
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, "musInstance");
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, WeexSubPageComponent.TAG, "weex onRenderSuccess url: " + this.b, null, 4, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements w6a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexFrameLayout b;

        public d(WeexFrameLayout weexFrameLayout) {
            this.b = weexFrameLayout;
        }

        @Override // tb.w6a
        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4aeceb46", new Object[]{this, new Boolean(z)});
                return;
            }
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, WeexSubPageComponent.TAG, "onGestureState beeConsume:" + z, null, 4, null);
            if (z) {
                WeexSubPageComponent.access$setScrollNeedConsume$p(WeexSubPageComponent.this, true);
                this.b.setWeexConsume(WeexFrameLayout.Companion.a());
                return;
            }
            tfs.c(WeexSubPageComponent.TAG, "onGestureState setWeexConsume WEEX_STATE_NOT_CONSUME");
            this.b.setWeexConsume(WeexFrameLayout.Companion.b());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e implements dde {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexFrameLayout b;

        public e(WeexFrameLayout weexFrameLayout) {
            this.b = weexFrameLayout;
        }

        @Override // tb.dde
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
            } else if (WeexSubPageComponent.access$getScrollNeedConsume$p(WeexSubPageComponent.this)) {
                WeexSubPageComponent.access$setScrollNeedConsume$p(WeexSubPageComponent.this, false);
                ViewParent access$findViewParentIfNeeds = WeexSubPageComponent.access$findViewParentIfNeeds(WeexSubPageComponent.this, this.b);
                if (access$findViewParentIfNeeds instanceof ViewPager) {
                    access$findViewParentIfNeeds.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class f implements ni8.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.ni8.c
        public final void onRetry() {
            WeexFrameLayout weexFrameLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2145010", new Object[]{this});
                return;
            }
            if (WeexSubPageComponent.access$getMusInstance$p(WeexSubPageComponent.this) != null) {
                com.taobao.android.weex_framework.a access$getMusInstance$p = WeexSubPageComponent.access$getMusInstance$p(WeexSubPageComponent.this);
                if (!((access$getMusInstance$p != null ? access$getMusInstance$p.getRenderRoot() : null) == null || (weexFrameLayout = (WeexFrameLayout) WeexSubPageComponent.this.getView()) == null)) {
                    com.taobao.android.weex_framework.a access$getMusInstance$p2 = WeexSubPageComponent.access$getMusInstance$p(WeexSubPageComponent.this);
                    ckf.d(access$getMusInstance$p2);
                    weexFrameLayout.removeView(access$getMusInstance$p2.getRenderRoot());
                }
                com.taobao.android.weex_framework.a access$getMusInstance$p3 = WeexSubPageComponent.access$getMusInstance$p(WeexSubPageComponent.this);
                if (access$getMusInstance$p3 != null) {
                    access$getMusInstance$p3.destroy();
                }
            }
            WeexSubPageComponent.access$hideDefaultErrorView(WeexSubPageComponent.this);
            WeexSubPageComponent weexSubPageComponent = WeexSubPageComponent.this;
            VIEW view = weexSubPageComponent.getView();
            ckf.d(view);
            String access$getWeexUrl$p = WeexSubPageComponent.access$getWeexUrl$p(WeexSubPageComponent.this);
            ckf.d(access$getWeexUrl$p);
            WeexSubPageComponent.access$initWeexInstance(weexSubPageComponent, (WeexFrameLayout) view, access$getWeexUrl$p);
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, WeexSubPageComponent.TAG, "onClick errorView refresh load url: " + WeexSubPageComponent.access$getWeexUrl$p(WeexSubPageComponent.this), null, 4, null);
        }
    }

    static {
        t2o.a(916455717);
        t2o.a(916455465);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexSubPageComponent(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        super(outerComponentType, str, context, obj, str2, str3, baseServiceDelegate);
        ckf.g(outerComponentType, OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE);
        ckf.g(str, "componentId");
        ckf.g(context, "context");
        ckf.g(str2, "pageURL");
        ckf.g(str3, "engineId");
        ckf.g(baseServiceDelegate, "serviceDelegate");
    }

    public static final /* synthetic */ ViewParent access$findViewParentIfNeeds(WeexSubPageComponent weexSubPageComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("7a515b8d", new Object[]{weexSubPageComponent, view});
        }
        return weexSubPageComponent.findViewParentIfNeeds(view);
    }

    public static final /* synthetic */ Context access$getContext$p(WeexSubPageComponent weexSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("975da348", new Object[]{weexSubPageComponent});
        }
        return weexSubPageComponent.getContext();
    }

    public static final /* synthetic */ com.taobao.android.weex_framework.a access$getMusInstance$p(WeexSubPageComponent weexSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("152ce22c", new Object[]{weexSubPageComponent});
        }
        return weexSubPageComponent.musInstance;
    }

    public static final /* synthetic */ boolean access$getScrollNeedConsume$p(WeexSubPageComponent weexSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f1651ca", new Object[]{weexSubPageComponent})).booleanValue();
        }
        return weexSubPageComponent.scrollNeedConsume;
    }

    public static final /* synthetic */ String access$getWeexUrl$p(WeexSubPageComponent weexSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cd114f", new Object[]{weexSubPageComponent});
        }
        return weexSubPageComponent.weexUrl;
    }

    public static final /* synthetic */ void access$hideDefaultErrorView(WeexSubPageComponent weexSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b05a0507", new Object[]{weexSubPageComponent});
        } else {
            weexSubPageComponent.hideDefaultErrorView();
        }
    }

    public static final /* synthetic */ void access$initWeexInstance(WeexSubPageComponent weexSubPageComponent, WeexFrameLayout weexFrameLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb2564c", new Object[]{weexSubPageComponent, weexFrameLayout, str});
        } else {
            weexSubPageComponent.initWeexInstance(weexFrameLayout, str);
        }
    }

    public static final /* synthetic */ void access$setMusInstance$p(WeexSubPageComponent weexSubPageComponent, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3752d592", new Object[]{weexSubPageComponent, aVar});
        } else {
            weexSubPageComponent.musInstance = aVar;
        }
    }

    public static final /* synthetic */ void access$setScrollNeedConsume$p(WeexSubPageComponent weexSubPageComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99835242", new Object[]{weexSubPageComponent, new Boolean(z)});
        } else {
            weexSubPageComponent.scrollNeedConsume = z;
        }
    }

    public static final /* synthetic */ void access$setWeexUrl$p(WeexSubPageComponent weexSubPageComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa504007", new Object[]{weexSubPageComponent, str});
        } else {
            weexSubPageComponent.weexUrl = str;
        }
    }

    public static final /* synthetic */ void access$showDefaultErrorView(WeexSubPageComponent weexSubPageComponent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde0c861", new Object[]{weexSubPageComponent, new Integer(i), str});
        } else {
            weexSubPageComponent.showDefaultErrorView(i, str);
        }
    }

    private final ViewParent findViewParentIfNeeds(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("307f684b", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewPager) {
            return parent;
        }
        if (parent instanceof View) {
            return findViewParentIfNeeds((View) parent);
        }
        return parent;
    }

    private final void hideDefaultErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba1ba75", new Object[]{this});
            return;
        }
        View view = this.errorView;
        if (view != null) {
            ckf.d(view);
            if (view.getVisibility() == 0) {
                View view2 = this.errorView;
                ckf.d(view2);
                view2.setVisibility(8);
            }
        }
    }

    private final void initWeexInstance(WeexFrameLayout weexFrameLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2a5bae", new Object[]{this, weexFrameLayout, str});
            return;
        }
        this.weexOptions.put("bundleUrl", str);
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.p(str);
        mUSInstanceConfig.B(true);
        mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.u(new b(weexFrameLayout));
        mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
        com.taobao.android.weex_framework.a c2 = com.taobao.android.weex_framework.b.f().c(getContext(), mUSInstanceConfig);
        this.musInstance = c2;
        c2.registerRenderListener(new c(str));
        c2.initWithURL(Uri.parse(str));
        c2.setTag(TAG, this);
        c2.render(this.weexData, this.weexOptions);
        c2.setGestureStateListener(new d(weexFrameLayout));
        c2.setWeexScrollListener(new e(weexFrameLayout));
    }

    public static /* synthetic */ Object ipc$super(WeexSubPageComponent weexSubPageComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1502133455:
                super.onStart((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -1098451737:
                super.handleOuterMessage((BaseOuterComponent.b) objArr[0]);
                return null;
            case -560092455:
                super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 316403507:
                super.onStop((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/WeexSubPageComponent");
        }
    }

    private final void sendOuterMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cf6515", new Object[]{this, jSONObject});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "发送外部消息，args=" + jSONObject, null, 4, null);
        jSONObject.put((JSONObject) "sourceType", getComponentType().toString());
        jSONObject.put((JSONObject) BaseOuterComponent.b.SOURCE_COMPONENT_ID, getComponentId());
        BaseOuterComponent.b a2 = BaseOuterComponent.b.Companion.a(jSONObject);
        if (a2 != null) {
            BaseServiceDelegate serviceDelegate = getServiceDelegate();
            if (serviceDelegate != null) {
                ((dps) serviceDelegate).u(a2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.Tab2ServiceDelegate");
        }
    }

    private final void sendWeexMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872d85eb", new Object[]{this, jSONObject});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "sendWeexMessage, message=" + jSONObject, null, 4, null);
        com.taobao.android.weex_framework.a aVar2 = this.musInstance;
        if (aVar2 != null) {
            aVar2.dispatchEvent(MUSEventTarget.MUS_BODY_TARGET, "onturbomessage", jSONObject);
        }
    }

    private final void showDefaultErrorView(int i, String str) {
        WeexFrameLayout weexFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8c575d", new Object[]{this, new Integer(i), str});
        } else if (this.musInstance != null) {
            if (!(this.errorView == null || (weexFrameLayout = (WeexFrameLayout) getView()) == null)) {
                weexFrameLayout.removeView(this.errorView);
            }
            this.errorView = ni8.b(getContext(), this.weexUrl, String.valueOf(i), str, null, new f());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            WeexFrameLayout weexFrameLayout2 = (WeexFrameLayout) getView();
            if (weexFrameLayout2 != null) {
                weexFrameLayout2.addView(this.errorView, layoutParams);
            }
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseOuterComponent
    public void handleOuterMessage(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        super.handleOuterMessage(bVar);
        sendWeexMessage(BaseOuterComponent.b.Companion.b(bVar));
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onDestroy(iComponentLifecycle$TriggerType);
        com.taobao.android.weex_framework.a aVar = this.musInstance;
        if (aVar != null) {
            aVar.destroy();
        }
        this.musInstance = null;
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        com.taobao.android.weex_framework.a aVar = this.musInstance;
        if (aVar != null) {
            aVar.onActivityPause();
        }
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public void onRefresh(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ff6aa2", new Object[]{this, map});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            jSONObject.put((JSONObject) BaseOuterComponent.b.NAME, "onforcerefresh");
        } else {
            jSONObject.put((JSONObject) BaseOuterComponent.b.NAME, "onschedule");
            jSONObject.put((JSONObject) BaseOuterComponent.b.ARGS, (String) map);
        }
        sendWeexMessage(jSONObject);
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onResume(iComponentLifecycle$TriggerType);
        com.taobao.android.weex_framework.a aVar = this.musInstance;
        if (aVar != null) {
            aVar.onActivityResume();
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStart(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6774331", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStart(iComponentLifecycle$TriggerType);
        com.taobao.android.weex_framework.a aVar = this.musInstance;
        if (aVar != null) {
            aVar.onActivityStart();
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStop(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dbef33", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStop(iComponentLifecycle$TriggerType);
        com.taobao.android.weex_framework.a aVar = this.musInstance;
        if (aVar != null) {
            aVar.onActivityStop();
        }
    }

    @Override // tb.gde
    public void onWeexMessage(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36071a42", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "message");
        if (TextUtils.equals(jSONObject.getString(BaseOuterComponent.b.NAME), "putSchedulerMessage")) {
            HashMap hashMap = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(BaseOuterComponent.b.ARGS);
            } catch (Exception e2) {
                tpu.Companion.a(TAG, "onWeexMessage, get messageArgs exception", e2);
                jSONObject2 = null;
            }
            mqu.a aVar = mqu.Companion;
            String i = aVar.i(jSONObject2 != null ? jSONObject2.get("tabid") : null, null);
            Map<String, Object> h = aVar.h(jSONObject2 != null ? jSONObject2.get("extParams") : null, null);
            if (h != null) {
                hashMap = new HashMap(h);
            }
            getServiceDelegate().d0(new nuo(nuo.MSG_URL_REFRESH, i, hashMap, 0, null, 24, null));
            return;
        }
        sendOuterMessage(jSONObject);
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public WeexFrameLayout createViewImpl() {
        int i;
        String str;
        Map<String, Object> a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexFrameLayout) ipChange.ipc$dispatch("2b761c29", new Object[]{this});
        }
        WeexFrameLayout weexFrameLayout = new WeexFrameLayout(getContext());
        BaseSubPageComponent.SubPageModel subPageModel = (BaseSubPageComponent.SubPageModel) getData();
        this.weexUrl = subPageModel != null ? subPageModel.getUrl() : null;
        if (subPageModel instanceof TabModel) {
            Object json = JSON.toJSON(subPageModel);
            if (json != null) {
                this.weexData = (JSONObject) json;
                nuo initSchedulerMessage = getInitSchedulerMessage(subPageModel.getId());
                if (!(initSchedulerMessage == null || (a2 = initSchedulerMessage.a()) == null || (jSONObject = this.weexData) == null)) {
                    jSONObject.put("schedulerMessageArgs", (Object) a2);
                }
                TabModel.StyleModel style = ((TabModel) subPageModel).getStyle();
                if (style != null) {
                    i = style.getPaddingTop();
                    weexFrameLayout.setPaddingRelative(0, i, 0, 0);
                    str = this.weexUrl;
                    if (str != null && str.length() > 0) {
                        String str2 = this.weexUrl;
                        ckf.d(str2);
                        initWeexInstance(weexFrameLayout, str2);
                    }
                    return weexFrameLayout;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        } else if (subPageModel instanceof DrawerModel) {
            Map<String, String> extendParams = ((DrawerModel) subPageModel).getExtendParams();
            if (extendParams != null) {
                this.weexData = new JSONObject((HashMap) extendParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
            }
        }
        i = 0;
        weexFrameLayout.setPaddingRelative(0, i, 0, 0);
        str = this.weexUrl;
        if (str != null) {
            String str22 = this.weexUrl;
            ckf.d(str22);
            initWeexInstance(weexFrameLayout, str22);
        }
        return weexFrameLayout;
    }
}
