package com.taobao.android.turbo.subpage.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import tb.a07;
import tb.at4;
import tb.ckf;
import tb.cpt;
import tb.dps;
import tb.hk8;
import tb.mqu;
import tb.nuo;
import tb.r2c;
import tb.r69;
import tb.r6o;
import tb.t2o;
import tb.tot;
import tb.tpu;
import tb.ud0;
import tb.z78;
import tb.zrt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 _2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001`BA\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u001a2\u0010\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\t2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\u001a2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0016¢\u0006\u0004\b&\u0010\u001cJ\u000f\u0010'\u001a\u00020\u0003H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010,J\u0017\u0010/\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b/\u0010,J\u0017\u00102\u001a\u00020\u001a2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u001a2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b8\u0010,J\u0017\u0010;\u001a\u00020\u001a2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001aH\u0016¢\u0006\u0004\b=\u0010>J[\u0010E\u001a\u00020 2\b\u0010?\u001a\u0004\u0018\u0001092\b\u0010@\u001a\u0004\u0018\u0001092\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010A\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010B2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020 H\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u001aH\u0016¢\u0006\u0004\bU\u0010>R\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR4\u0010]\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\u00180\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006a"}, d2 = {"Lcom/taobao/android/turbo/subpage/component/TNodeSubPageComponent;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "Landroid/widget/FrameLayout;", "Lcom/taobao/tao/flexbox/layoutmanager/core/TNodeView$l;", "Lcom/taobao/tao/flexbox/layoutmanager/core/j;", "Ltb/r2c;", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;", OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE, "", "componentId", "Landroid/content/Context;", "context", "", "host", "pageURL", "engineId", "Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;", "serviceDelegate", "<init>", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;)V", "Landroid/view/View;", "createTaoBaoThemeView", "()Landroid/view/View;", "", "args", "Ltb/xhv;", "sendOuterMessage", "(Ljava/util/Map;)V", "name", "sendTNodeMessage", "(Ljava/lang/String;Ljava/util/Map;)V", "", "isEnablePendingTNodeMessage", "()Z", "rootView", "attachThemeView", "(Landroid/widget/FrameLayout;)V", "onRefresh", "createViewImpl", "()Landroid/widget/FrameLayout;", "Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;", "triggerType", "onStart", "(Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;)V", "onResume", "onPause", "onStop", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$b;", "message", "handleOuterMessage", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$b;)V", "", "state", "onMultiTabScrollStateChanged", "(I)V", "onDestroy", "Lcom/taobao/tao/flexbox/layoutmanager/core/n;", "root", "onLayoutCompleted", "(Lcom/taobao/tao/flexbox/layoutmanager/core/n;)V", "onLayoutError", "()V", "sender", "node", "value", "", "Ltb/hk8;", "callback", "onHandleTNodeMessage", "(Lcom/taobao/tao/flexbox/layoutmanager/core/n;Lcom/taobao/tao/flexbox/layoutmanager/core/n;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ltb/hk8;)Z", "Lcom/taobao/tao/flexbox/layoutmanager/core/n$g;", "onHandleMessage", "(Lcom/taobao/tao/flexbox/layoutmanager/core/n$g;)Z", "Ltb/r69;", "festivalInfo", "onFestivalChanged", "(Ltb/r69;)V", "isElderVersion", "onElderVersionChanged", "(Z)V", "Ltb/z78;", "editionVersionInfo", "onEditionVersionInfoChanged", "(Ltb/z78;)V", "onTabHostStatusChanged", "Lcom/taobao/tao/flexbox/layoutmanager/core/TNodeView;", "tnodeView", "Lcom/taobao/tao/flexbox/layoutmanager/core/TNodeView;", "themeView", "Landroid/view/View;", "", "Lkotlin/Pair;", "pendingTNodeMessageList", "Ljava/util/List;", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TNodeSubPageComponent extends BaseSubPageComponent<BaseSubPageComponent.SubPageModel, FrameLayout> implements TNodeView.l, j, r2c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String MSG_GG = "gg.msg";
    private static final String TAG = "TNodeSubPageComponent";
    private final List<Pair<String, Map<String, Object>>> pendingTNodeMessageList = new ArrayList();
    private View themeView;
    private TNodeView tnodeView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455714);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ IComponentLifecycle$TriggerType b;

        public b(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
            this.b = iComponentLifecycle$TriggerType;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TNodeSubPageComponent.access$onResume$s152786276(TNodeSubPageComponent.this, this.b);
            TNodeView access$getTnodeView$p = TNodeSubPageComponent.access$getTnodeView$p(TNodeSubPageComponent.this);
            if (access$getTnodeView$p != null) {
                access$getTnodeView$p.onResume();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ IComponentLifecycle$TriggerType b;

        public c(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
            this.b = iComponentLifecycle$TriggerType;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TNodeSubPageComponent.access$onStart$s152786276(TNodeSubPageComponent.this, this.b);
            TNodeView access$getTnodeView$p = TNodeSubPageComponent.access$getTnodeView$p(TNodeSubPageComponent.this);
            if (access$getTnodeView$p != null) {
                access$getTnodeView$p.onStart();
            }
        }
    }

    static {
        t2o.a(916455713);
        t2o.a(503317196);
        t2o.a(503317092);
        t2o.a(919601280);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TNodeSubPageComponent(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        super(outerComponentType, str, context, obj, str2, str3, baseServiceDelegate);
        ckf.g(outerComponentType, OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE);
        ckf.g(str, "componentId");
        ckf.g(context, "context");
        ckf.g(str2, "pageURL");
        ckf.g(str3, "engineId");
        ckf.g(baseServiceDelegate, "serviceDelegate");
    }

    public static final /* synthetic */ TNodeView access$getTnodeView$p(TNodeSubPageComponent tNodeSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("60a05cb6", new Object[]{tNodeSubPageComponent});
        }
        return tNodeSubPageComponent.tnodeView;
    }

    public static final /* synthetic */ void access$onResume$s152786276(TNodeSubPageComponent tNodeSubPageComponent, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd35a324", new Object[]{tNodeSubPageComponent, iComponentLifecycle$TriggerType});
        } else {
            super.onResume(iComponentLifecycle$TriggerType);
        }
    }

    public static final /* synthetic */ void access$onStart$s152786276(TNodeSubPageComponent tNodeSubPageComponent, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c15f88bb", new Object[]{tNodeSubPageComponent, iComponentLifecycle$TriggerType});
        } else {
            super.onStart(iComponentLifecycle$TriggerType);
        }
    }

    public static final /* synthetic */ void access$setTnodeView$p(TNodeSubPageComponent tNodeSubPageComponent, TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ca0040", new Object[]{tNodeSubPageComponent, tNodeView});
        } else {
            tNodeSubPageComponent.tnodeView = tNodeView;
        }
    }

    private final void attachThemeView(FrameLayout frameLayout) {
        View createTaoBaoThemeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4862cad3", new Object[]{this, frameLayout});
        } else if (this.themeView == null && (createTaoBaoThemeView = createTaoBaoThemeView()) != null) {
            if (frameLayout != null) {
                frameLayout.addView(createTaoBaoThemeView, 0, new FrameLayout.LayoutParams(-1, -1));
            }
            this.themeView = createTaoBaoThemeView;
        }
    }

    private final View createTaoBaoThemeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d1e60c0d", new Object[]{this});
        }
        if (!getServiceDelegate().a0()) {
            return null;
        }
        r6o.a aVar = r6o.Companion;
        int a2 = aVar.a(getContext()) + aVar.g(getContext());
        ThemeFrameLayout b2 = cpt.c().b(getContext(), new tot("guangguang", 1, a2));
        ckf.f(b2, "ThemeManager.getInstance…ext, actionbarSkinConfig)");
        at4.a aVar2 = at4.Companion;
        tot totVar = new tot("guangguang", 0, at4.a.e(aVar2, getContext(), 750, false, 4, null));
        totVar.d = at4.a.e(aVar2, getContext(), 210, false, 4, null);
        totVar.j = true;
        totVar.k = at4.a.e(aVar2, getContext(), 30, false, 4, null);
        ThemeFrameLayout b3 = cpt.c().b(getContext(), totVar);
        ckf.f(b3, "ThemeManager.getInstance…iew(context, themeConfig)");
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(b3, new FrameLayout.LayoutParams(-1, -1));
        b2.setAlpha(0.0f);
        frameLayout.addView(b2, new FrameLayout.LayoutParams(-1, a2));
        return frameLayout;
    }

    public static /* synthetic */ Object ipc$super(TNodeSubPageComponent tNodeSubPageComponent, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/TNodeSubPageComponent");
        }
    }

    private final boolean isEnablePendingTNodeMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdc8846", new Object[]{this})).booleanValue();
        }
        return ((Boolean) ud0.Companion.b().c("weitao_switch.isEnablePendingTNodeMessage", Boolean.TRUE)).booleanValue();
    }

    private final void sendOuterMessage(Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5eb4ea", new Object[]{this, map});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "发送外部消息，args=" + map, null, 4, null);
        if (map != null) {
            try {
                JSONObject jSONObject = new JSONObject((Map<String, Object>) map);
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
            } catch (Exception e) {
                tpu.Companion.a(TAG, "发送外部消息，args转JSONObject异常", e);
            }
        }
    }

    private final void sendTNodeMessage(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67cfa3b", new Object[]{this, str, map});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "发送TNode消息，name=" + str + "，args=" + map, null, 4, null);
        TNodeView tNodeView = this.tnodeView;
        n rootNode = tNodeView != null ? tNodeView.getRootNode() : null;
        if (rootNode == null || rootNode.w0() == null) {
            tpu.a.b(aVar, TAG, "发送TNode消息，root为空或view为空", null, 4, null);
            if (isEnablePendingTNodeMessage()) {
                this.pendingTNodeMessageList.add(new Pair<>(str, map));
                return;
            }
            return;
        }
        rootNode.P().o1(2, rootNode, str, null, map, null);
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
        sendTNodeMessage("onTurboMessage", BaseOuterComponent.b.Companion.b(bVar));
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
        TNodeView tNodeView = this.tnodeView;
        if (tNodeView != null) {
            tNodeView.onDestroy();
        }
        getServiceDelegate().c0(this);
    }

    @Override // tb.r2c
    public void onEditionVersionInfoChanged(z78 z78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58f2b33", new Object[]{this, z78Var});
        } else {
            ckf.g(z78Var, "editionVersionInfo");
        }
    }

    @Override // tb.r2c
    public void onElderVersionChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b92486", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.r2c
    public void onFestivalChanged(r69 r69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87102e45", new Object[]{this, r69Var});
            return;
        }
        ckf.g(r69Var, "festivalInfo");
        attachThemeView((FrameLayout) getView());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map<Object, Object> map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
    public void onLayoutError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834776a6", new Object[]{this});
        }
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public void onMultiTabScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b067dbf1", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        sendTNodeMessage("onpagescrollstatechanged", hashMap);
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
        TNodeView tNodeView = this.tnodeView;
        if (tNodeView != null) {
            tNodeView.onPause();
        }
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public void onRefresh(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ff6aa2", new Object[]{this, map});
        } else if (map == null) {
            sendTNodeMessage("onforcerefresh", null);
        } else {
            sendTNodeMessage("onschedule", map);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        if (getServiceDelegate().getScrollState() == 0 && iComponentLifecycle$TriggerType == IComponentLifecycle$TriggerType.TAB_SELECT) {
            zrt.Companion.b(new b(iComponentLifecycle$TriggerType));
            return;
        }
        super.onResume(iComponentLifecycle$TriggerType);
        TNodeView tNodeView = this.tnodeView;
        if (tNodeView != null) {
            tNodeView.onResume();
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
        if (getServiceDelegate().getScrollState() == 0 && iComponentLifecycle$TriggerType == IComponentLifecycle$TriggerType.TAB_SELECT) {
            zrt.Companion.b(new c(iComponentLifecycle$TriggerType));
            return;
        }
        super.onStart(iComponentLifecycle$TriggerType);
        TNodeView tNodeView = this.tnodeView;
        if (tNodeView != null) {
            tNodeView.onStart();
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
        TNodeView tNodeView = this.tnodeView;
        if (tNodeView != null) {
            tNodeView.onStop();
        }
    }

    @Override // tb.r2c
    public void onTabHostStatusChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc05d8b", new Object[]{this});
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        HashMap hashMap;
        int i;
        Map<String, Object> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        BaseSubPageComponent.SubPageModel subPageModel = (BaseSubPageComponent.SubPageModel) getData();
        Object obj = null;
        String url = subPageModel != null ? subPageModel.getUrl() : null;
        boolean z = subPageModel instanceof TabModel;
        if (z) {
            Object json = JSON.toJSON(subPageModel);
            if (json != null) {
                HashMap hashMap2 = (HashMap) ((JSONObject) json).getInnerMap();
                nuo initSchedulerMessage = getInitSchedulerMessage(subPageModel.getId());
                if (!(initSchedulerMessage == null || (a2 = initSchedulerMessage.a()) == null || hashMap2 == null)) {
                    hashMap2.put("schedulerMessageArgs", a2);
                }
                TabModel.StyleModel style = ((TabModel) subPageModel).getStyle();
                i = style != null ? style.getPaddingTop() : 0;
                hashMap = hashMap2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        } else {
            if (subPageModel instanceof DrawerModel) {
                Map<String, String> extendParams = ((DrawerModel) subPageModel).getExtendParams();
                if (extendParams != null) {
                    hashMap = (HashMap) extendParams;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
                }
            } else {
                hashMap = null;
            }
            i = 0;
        }
        if (getHost() instanceof Fragment) {
            obj = getHost();
        }
        TNodeView create = TNodeView.create(getContext(), obj, null, url, null, hashMap, this);
        create.setPaddingRelative(0, i, 0, 0);
        create.setMessageHandler(this);
        this.tnodeView = create;
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (i > 0 && z) {
            getServiceDelegate().I(this);
            attachThemeView(frameLayout);
        }
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(create);
        return frameLayout;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        if (gVar == null) {
            return false;
        }
        if (TextUtils.equals(gVar.d, "postTurboMessage")) {
            sendOuterMessage(gVar.e);
            return true;
        } else if (!TextUtils.equals(gVar.d, MSG_GG)) {
            return false;
        } else {
            mqu.a aVar = mqu.Companion;
            Map map = gVar.e;
            HashMap hashMap = null;
            String i = aVar.i(map != null ? map.get("tabid") : null, null);
            Map map2 = gVar.e;
            Map<String, Object> h = aVar.h(map2 != null ? map2.get("extParams") : null, null);
            if (h != null) {
                hashMap = new HashMap(h);
            }
            getServiceDelegate().d0(new nuo(nuo.MSG_URL_REFRESH, i, hashMap, 0, null, 24, null));
            return true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
    public void onLayoutCompleted(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e800489", new Object[]{this, nVar});
            return;
        }
        ckf.g(nVar, "root");
        tpu.a.b(tpu.Companion, TAG, "tnodeView布局完成的时机", null, 4, null);
        if (isEnablePendingTNodeMessage()) {
            Iterator<T> it = this.pendingTNodeMessageList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                nVar.P().o1(2, nVar, (String) pair.getFirst(), null, (Map) pair.getSecond(), null);
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, TAG, "tnodeView布局完成的时机，向TNode引擎发送消息，first=" + ((String) pair.getFirst()) + "，second=" + ((Map) pair.getSecond()), null, 4, null);
            }
            this.pendingTNodeMessageList.clear();
        }
    }
}
