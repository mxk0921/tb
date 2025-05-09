package com.taobao.message.lab.comfrm.support.dinamic;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.expression.event.DXSwitchEvent;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import com.taobao.android.dinamicx.expression.event.tab.TabEvent;
import com.taobao.android.dinamicx.model.DXJSONObjectForVM;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnExposeEvent;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnStayEvent;
import com.taobao.message.kit.util.BizTagUtil;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.MonitorUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.WrapperEvent;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import com.taobao.message.lab.comfrm.render.RenderError;
import com.taobao.message.lab.comfrm.render.RenderResult;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.lab.comfrm.support.Monitor;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier;
import com.taobao.message.lab.comfrm.util.KeyboardStateHelper;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.message.uikit.util.ViewTraversalHelper;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.unit.center.mdc.MsgDinamicxEngine;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMPRecyclerCompanionWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXPageLifecyclerWidgetNode;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.br3;
import tb.fl6;
import tb.h9z;
import tb.iwb;
import tb.k06;
import tb.k66;
import tb.ob5;
import tb.pb6;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXWidgetInstance extends WidgetInstance implements UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CAHCE_KEY = "auraPageBindingDefaultHeight";
    private static final long DXMPRECYCLERCOMPANION_ONSHIMMERANIMATION = -3156252362327331484L;
    private static final String TAG = "DXWidgetInstance";
    private boolean convertJSON;
    public boolean demoteDiffRefreshOpt;
    private EventDispatcher dispatcher;
    private DinamicXEngine dxEngine;
    private DXRootView dxRootView;
    private DXTemplateItem dxTemplateItem;
    private FrameLayout frameLayout;
    private String identifier;
    private Map<String, Object> lastRenderData;
    private RenderResult mRenderResult;
    private MPUserContext mpUserContext;
    private Serializable pauseBindDataObject;
    private boolean pauseBindDataPause;
    private EventDispatcher pauseBindEventDispatch;
    private JSONArray recyclerHoldLastBottomArray;
    private RecyclerHoldLastBottomExtension recyclerHoldLastBottomExtension;
    private RenderTemplate renderTemplate;
    private String usePartRefreshConfig;
    public static final Map<Object, DXEngineRefInfo> sCacheDXEngine = new HashMap();
    public static boolean isLoadMoreOpenOpt = ABGlobal.isFeatureOpened(Globals.getApplication(), "msgLoadMoreOpt");
    private JSONObject uiData = new JSONObject();
    private int lastRealHeight = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class DXEngineRefInfo {
        public Map<DXWidgetInstance, MPUserContext> cacheInstanceMap;
        public DinamicXEngine dinamicXEngine;

        static {
            t2o.a(537919792);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface DXPartRefreshHanlder {
        boolean partRefresh(DinamicXEngine dinamicXEngine, DXRootView dXRootView, DXWidgetNode dXWidgetNode, Map<String, Object> map, Map<String, Object> map2, Diff diff);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class EmptyNotificationListener implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(537919794);
            t2o.a(444596939);
        }

        private EmptyNotificationListener() {
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class EmptyTapHandler extends ob5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(537919795);
        }

        public static /* synthetic */ Object ipc$super(EmptyTapHandler emptyTapHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/DXWidgetInstance$EmptyTapHandler");
        }

        @Override // tb.ob5, tb.mvb
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class MPUserContext extends fl6 implements Disposable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String identifier;
        private WidgetRenderImpl.RenderConfig renderConfig;
        private Map<String, Object> renderContext;
        private volatile boolean isDisposed = false;
        private Map<String, Disposable> disposableMap = new HashMap();

        static {
            t2o.a(537919796);
            t2o.a(537919598);
        }

        public MPUserContext(Map<String, Object> map) {
            this.renderContext = map;
        }

        public static /* synthetic */ Object ipc$super(MPUserContext mPUserContext, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/DXWidgetInstance$MPUserContext");
        }

        public void addDisposable(String str, Disposable disposable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1839572e", new Object[]{this, str, disposable});
            } else if (this.isDisposed) {
                disposable.dispose();
            } else {
                this.disposableMap.put(str, disposable);
            }
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Disposable
        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
                return;
            }
            for (Disposable disposable : this.disposableMap.values()) {
                if (disposable != null) {
                    disposable.dispose();
                }
            }
            this.disposableMap.clear();
            this.renderContext = null;
            this.isDisposed = true;
        }

        public Disposable getDisposable(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Disposable) ipChange.ipc$dispatch("210d2137", new Object[]{this, str});
            }
            return this.disposableMap.get(str);
        }

        public String getIdentifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
            }
            return this.identifier;
        }

        public WidgetRenderImpl.RenderConfig getRenderConfig() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetRenderImpl.RenderConfig) ipChange.ipc$dispatch("e26145d5", new Object[]{this});
            }
            return this.renderConfig;
        }

        public Map<String, Object> getRenderContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4f58573f", new Object[]{this});
            }
            return this.renderContext;
        }

        public boolean isDisposed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
            }
            return this.isDisposed;
        }

        public void setIdentifier(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3eb8cafc", new Object[]{this, str});
            } else {
                this.identifier = str;
            }
        }

        public void setRenderConfig(WidgetRenderImpl.RenderConfig renderConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e835cd5", new Object[]{this, renderConfig});
            } else {
                this.renderConfig = renderConfig;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class PartRefresh {
        public Map<String, Object> refreshConfig;
        public String refreshType;
        public String widgetId;

        static {
            t2o.a(537919797);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class ResizeFrameLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Activity activity;
        private boolean isKeybaordOn = false;
        private final KeyboardStateHelper keyboardStateHelper = new KeyboardStateHelper();

        static {
            t2o.a(537919798);
        }

        public ResizeFrameLayout(Activity activity) {
            super(activity);
            this.activity = activity;
        }

        public static /* synthetic */ Object ipc$super(ResizeFrameLayout resizeFrameLayout, String str, Object... objArr) {
            if (str.hashCode() == 650865254) {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/DXWidgetInstance$ResizeFrameLayout");
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            boolean isKeyboardShow = this.keyboardStateHelper.isKeyboardShow(this.activity);
            if (ApplicationUtil.isDebug()) {
                if (isKeyboardShow) {
                    Logger.e("ResizeFrameLayout", "FANYETEST|isKeyboardShow");
                } else {
                    Logger.e("ResizeFrameLayout", "FANYETEST|isKeyboardHide");
                }
            }
            if (isKeyboardShow != this.isKeybaordOn) {
                this.isKeybaordOn = isKeyboardShow;
                DXWidgetInstance.this.refreshView();
            }
            super.onMeasure(i, i2);
        }
    }

    public static /* synthetic */ Map access$000(DXWidgetInstance dXWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78df067c", new Object[]{dXWidgetInstance});
        }
        return dXWidgetInstance.lastRenderData;
    }

    public static /* synthetic */ EventDispatcher access$100(DXWidgetInstance dXWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventDispatcher) ipChange.ipc$dispatch("4f0ef83a", new Object[]{dXWidgetInstance});
        }
        return dXWidgetInstance.dispatcher;
    }

    public static /* synthetic */ JSONObject access$200(DXWidgetInstance dXWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fea49a29", new Object[]{dXWidgetInstance});
        }
        return dXWidgetInstance.uiData;
    }

    public static /* synthetic */ JSONObject access$202(DXWidgetInstance dXWidgetInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91cecd65", new Object[]{dXWidgetInstance, jSONObject});
        }
        dXWidgetInstance.uiData = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ DXRootView access$300(DXWidgetInstance dXWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("b06f404d", new Object[]{dXWidgetInstance});
        }
        return dXWidgetInstance.dxRootView;
    }

    public static /* synthetic */ void access$400(DXWidgetInstance dXWidgetInstance, RecyclerView recyclerView, int i, String str, String str2, int i2, AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3740bc0", new Object[]{dXWidgetInstance, recyclerView, new Integer(i), str, str2, new Integer(i2), animatorListenerAdapter});
        } else {
            dXWidgetInstance.shimmerItemByPosition(recyclerView, i, str, str2, i2, animatorListenerAdapter);
        }
    }

    public static DXMsgCenterEvent buildMsg(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXMsgCenterEvent) ipChange.ipc$dispatch("9bf3444c", new Object[]{str, jSONObject});
        }
        DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
        dXMsgCenterEvent.setMethod(str);
        dXMsgCenterEvent.setParams(jSONObject);
        dXMsgCenterEvent.setType("General");
        return dXMsgCenterEvent;
    }

    private void checkTemplate(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7eeb3b", new Object[]{this, dXTemplateItem, dXTemplateItem2});
        } else if (dXTemplateItem == null && dXTemplateItem2 != null) {
            download(dXTemplateItem2);
        } else if (dXTemplateItem != null && dXTemplateItem2 != null) {
            long j = dXTemplateItem.b;
            long j2 = dXTemplateItem2.b;
            if (j != j2 && j2 > j) {
                download(dXTemplateItem2);
            }
        }
    }

    private void download(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c6c878", new Object[]{this, dXTemplateItem});
        } else {
            this.dxEngine.p(Collections.singletonList(dXTemplateItem));
        }
    }

    private JSONObject dxDataAdapter(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e977c8d", new Object[]{this, map});
        }
        if ("alimp_page_goods_select".equals(this.renderTemplate.name)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(map);
            jSONObject.put("UIData", (Object) this.uiData);
            if (ApplicationUtil.isDebug()) {
                Logger.e(TAG, "UIDATA|" + JSON.toJSONString(this.uiData));
            }
            return jSONObject;
        } else if (map instanceof JSONObject) {
            return (JSONObject) map;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(map);
            return jSONObject2;
        }
    }

    private DXTemplateItem fetchTemplate(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("f20a9f2", new Object[]{this, dXTemplateItem, dXTemplateItem2});
        }
        DXTemplateItem u = this.dxEngine.u(dXTemplateItem);
        if (u != null || !ComponentFrmModule.sDXTemplateSnapshot) {
            return u;
        }
        Logger.e(TAG, "dinamicx buildInnerDXView fetchTemplate again ");
        DXTemplateItem dXTemplateItem3 = new DXTemplateItem();
        dXTemplateItem3.f7343a = dXTemplateItem2.f7343a;
        dXTemplateItem3.b = dXTemplateItem2.b + 100;
        dXTemplateItem3.c = dXTemplateItem2.c;
        DXTemplateItem u2 = this.dxEngine.u(dXTemplateItem3);
        if (u2 == null || !u2.f) {
            return u;
        }
        return u2;
    }

    private Context getDxRootViewContext(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b7d5dc1e", new Object[]{this, dXRootView});
        }
        return DXAsyncCacheManager.getDxRootViewContext(dXRootView);
    }

    private Object getReUseKey(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cc4b20ee", new Object[]{this, obj});
        }
        if (getRenderConfig() == null || TextUtils.isEmpty(getRenderConfig().reUseKey)) {
            return obj;
        }
        return getRenderConfig().reUseKey;
    }

    public static /* synthetic */ Object ipc$super(DXWidgetInstance dXWidgetInstance, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1283962764) {
            super.postEvent((Event) objArr[0]);
            return null;
        } else if (hashCode == 577536806) {
            super.dispose();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/message/lab/comfrm/support/dinamic/DXWidgetInstance");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindData$0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d157f9", new Object[]{this, jSONObject});
        } else {
            handleScrollOffset(jSONObject);
        }
    }

    public static void setupFullPageEngine(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3a16b5", new Object[]{dinamicXEngine});
            return;
        }
        ob5 ob5Var = new ob5() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/DXWidgetInstance$2");
            }

            @Override // tb.ob5, tb.mvb
            public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
                Editable text;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                    return;
                }
                TraceUtil.beginSection(dXEvent.getClass().getName());
                if (br3.a(dXRuntimeContext)) {
                    DXWidgetInstance dXWidgetInstance = (DXWidgetInstance) dXRuntimeContext.L().getTag(R.id.messageDX);
                    if (DXWidgetInstance.access$100(dXWidgetInstance) != null) {
                        HashMap hashMap = new HashMap();
                        if ((dXEvent instanceof DXTextInputEvent) && (text = ((DXTextInputEvent) dXEvent).getText()) != null) {
                            hashMap.put("text", text.toString());
                        }
                        Event build = new Event.Build((String) objArr[0]).data(hashMap).build();
                        build.getContext().put("args", objArr);
                        DXWidgetInstance.access$100(dXWidgetInstance).dispatch(build);
                    }
                    TraceUtil.endTrace();
                }
            }
        };
        dinamicXEngine.W0(k06.a("mpTap"), ob5Var);
        dinamicXEngine.W0(k06.a("mpLTap"), ob5Var);
        dinamicXEngine.W0(k06.a("mpAppear"), ob5Var);
        dinamicXEngine.W0(k06.a("mpDisappear"), ob5Var);
        dinamicXEngine.W0(k06.a("aura"), new ob5() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/DXWidgetInstance$3");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tb.ob5, tb.mvb
            public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
                JSONObject parseObject;
                JSONObject jSONObject;
                Map<String, Object> map;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                    return;
                }
                TraceUtil.beginSection(dXEvent.getClass().getName());
                if (br3.a(dXRuntimeContext)) {
                    DXWidgetInstance dXWidgetInstance = (DXWidgetInstance) dXRuntimeContext.L().getTag(R.id.messageDX);
                    if (DXWidgetInstance.access$100(dXWidgetInstance) != null) {
                        Object obj = objArr[0];
                        if (obj instanceof String) {
                            try {
                                parseObject = JSON.parseObject((String) obj);
                            } catch (Exception e) {
                                Logger.e(DXWidgetInstance.TAG, e);
                            }
                        } else {
                            if (obj instanceof JSONObject) {
                                parseObject = (JSONObject) obj;
                            }
                            parseObject = null;
                        }
                        if (dXEvent instanceof DXRecyclerLayoutOnExposeEvent) {
                            HashMap hashMap = new HashMap();
                            DXRecyclerLayoutOnExposeEvent dXRecyclerLayoutOnExposeEvent = (DXRecyclerLayoutOnExposeEvent) dXEvent;
                            hashMap.put("index", Integer.valueOf(dXRecyclerLayoutOnExposeEvent.getIndex()));
                            hashMap.put("data", dXRecyclerLayoutOnExposeEvent.getData());
                            hashMap.put("duration", Long.valueOf(dXRecyclerLayoutOnExposeEvent.getDuration()));
                            jSONObject = hashMap;
                        } else {
                            jSONObject = null;
                        }
                        String str = "unknow";
                        if (dXEvent instanceof DxCustemDataEvent) {
                            DxCustemDataEvent dxCustemDataEvent = (DxCustemDataEvent) dXEvent;
                            if (dxCustemDataEvent.getName() != null) {
                                str = dxCustemDataEvent.getName();
                            }
                            map = dxCustemDataEvent.getContext();
                        } else if (dXEvent instanceof TabEvent) {
                            HashMap hashMap2 = new HashMap();
                            TabEvent tabEvent = (TabEvent) dXEvent;
                            int index = tabEvent.getIndex();
                            boolean isFirstSelected = tabEvent.isFirstSelected();
                            hashMap2.put("index", Integer.valueOf(index));
                            hashMap2.put("isFirstSelected", Boolean.valueOf(isFirstSelected));
                            map = hashMap2;
                        } else if (dXEvent instanceof DXSwitchEvent) {
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("isOn", Boolean.valueOf(((DXSwitchEvent) dXEvent).isOn()));
                            map = hashMap3;
                        } else {
                            map = jSONObject;
                            if (dXEvent instanceof DXRecyclerLayoutOnStayEvent) {
                                HashMap hashMap4 = new HashMap();
                                DXRecyclerLayoutOnStayEvent dXRecyclerLayoutOnStayEvent = (DXRecyclerLayoutOnStayEvent) dXEvent;
                                hashMap4.put("index", Integer.valueOf(dXRecyclerLayoutOnStayEvent.getIndex()));
                                hashMap4.put("duration", Long.valueOf(dXRecyclerLayoutOnStayEvent.getDuration()));
                                hashMap4.put("data", dXRecyclerLayoutOnStayEvent.getData());
                                map = hashMap4;
                            }
                        }
                        if (parseObject != null) {
                            String string = ValueUtil.getString(parseObject, "name", str);
                            JSONObject jSONObject2 = parseObject.getJSONObject("eventData");
                            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                                if (map == null) {
                                    map = jSONObject2;
                                } else {
                                    map.putAll(jSONObject2);
                                    if (ApplicationUtil.isDebug()) {
                                        for (String str2 : jSONObject2.keySet()) {
                                            if (map.containsKey(str2)) {
                                                throw new IllegalStateException("error|keyConflict|" + str2);
                                            }
                                        }
                                    }
                                }
                            }
                            String string2 = ValueUtil.getString(parseObject, StdActions.ACTION_OPT_IMMEDIATE, null);
                            String string3 = ValueUtil.getString(parseObject, "stateKey", null);
                            if (string3 != null && (dXEvent instanceof TabEvent)) {
                                JSONObject jSONObject3 = new JSONObject();
                                TabEvent tabEvent2 = (TabEvent) dXEvent;
                                int index2 = tabEvent2.getIndex();
                                boolean isFirstSelected2 = tabEvent2.isFirstSelected();
                                jSONObject3.put("index", (Object) Integer.valueOf(index2));
                                jSONObject3.put("isFirstSelected", (Object) Boolean.valueOf(isFirstSelected2));
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.putAll(DXWidgetInstance.access$200(dXWidgetInstance));
                                jSONObject4.put(string3, (Object) jSONObject3);
                                DXWidgetInstance.access$202(dXWidgetInstance, jSONObject4);
                            }
                            HashMap hashMap5 = new HashMap();
                            if (string2 != null) {
                                hashMap5.put(StdActions.ACTION_OPT_IMMEDIATE, string2);
                            }
                            WrapperEvent build = new WrapperEvent.Build(string).data(map).context(hashMap5).auraEventHandler(parseObject.getJSONArray("eventHandler")).build();
                            ObjectVerifier.addCheckObject(build, string);
                            DXWidgetInstance.access$100(dXWidgetInstance).dispatch(build);
                        }
                    }
                    TraceUtil.endTrace();
                }
            }
        });
        dinamicXEngine.R0(new DXDataProxy());
    }

    private void shimmerCell(final String str, JSONArray jSONArray, final String str2, final String str3) {
        final RecyclerView j0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3144090", new Object[]{this, str, jSONArray, str2, str3});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            DXWidgetNode queryWTByUserId = this.dxRootView.getExpandWidgetNode().queryWTByUserId(str);
            if ((queryWTByUserId instanceof DXRecyclerLayout) && (j0 = ((DXRecyclerLayout) queryWTByUserId).j0()) != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    final int intValue = jSONArray.getInteger(i).intValue();
                    j0.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            final AtomicInteger atomicInteger = new AtomicInteger(0);
                            DXWidgetInstance.access$400(DXWidgetInstance.this, j0, intValue, str3, str2, Color.parseColor("#27FFC300"), new AnimatorListenerAdapter() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.5.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str4, Object... objArr) {
                                    if (str4.hashCode() == 1133046404) {
                                        super.onAnimationRepeat((Animator) objArr[0]);
                                        return null;
                                    }
                                    int hashCode = str4.hashCode();
                                    throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/DXWidgetInstance$5$1");
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationRepeat(Animator animator) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator});
                                        return;
                                    }
                                    super.onAnimationRepeat(animator);
                                    if (atomicInteger.getAndAdd(1) == 0) {
                                        DXWidgetNode expandWidgetNode = DXWidgetInstance.access$300(DXWidgetInstance.this).getExpandWidgetNode();
                                        DXWidgetNode queryWTByUserId2 = expandWidgetNode.queryWTByUserId(str + "_companion");
                                        if (queryWTByUserId2 != null) {
                                            queryWTByUserId2.postEvent(new DXEvent(DXWidgetInstance.DXMPRECYCLERCOMPANION_ONSHIMMERANIMATION));
                                        }
                                    }
                                }
                            });
                        }
                    }, 350L);
                }
            }
        }
    }

    private void shimmerItem(final View view, String str, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        final int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bd1f76", new Object[]{this, view, str, new Integer(i), animatorListenerAdapter});
        } else if ("background".equals(str)) {
            if (view.getBackground() instanceof ColorDrawable) {
                i2 = ((ColorDrawable) view.getBackground()).getColor();
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "backgroundColor", i, i2);
            ofInt.setDuration(600L);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.addListener(animatorListenerAdapter);
            ofInt.start();
            view.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        view.setBackgroundColor(i2);
                    }
                }
            }, 650L);
        } else {
            ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[0]);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(i, 0);
            ofInt2.setDuration(750L);
            ofInt2.setEvaluator(new ArgbEvaluator());
            ofInt2.setRepeatCount(1);
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        view.setForeground(new ColorDrawable(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                    }
                }
            });
            ofInt2.addListener(animatorListenerAdapter);
            ofInt2.start();
        }
    }

    private void shimmerItemByPosition(RecyclerView recyclerView, int i, String str, String str2, int i2, AnimatorListenerAdapter animatorListenerAdapter) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        View view;
        DXWidgetNode dXWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        View D;
        View findDeepestChildOfSameSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35463e30", new Object[]{this, recyclerView, new Integer(i), str, str2, new Integer(i2), animatorListenerAdapter});
        } else if (recyclerView != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
            if ((view instanceof ViewGroup) && (findDeepestChildOfSameSize = new ViewTraversalHelper((ViewGroup) findViewHolderForAdapterPosition.itemView).findDeepestChildOfSameSize()) != null) {
                view = findDeepestChildOfSameSize;
            }
            if (!(TextUtils.isEmpty(str) || (dXWidgetNode = (DXWidgetNode) view.getTag(DXWidgetNode.TAG_WIDGET_NODE)) == null || (queryWidgetNodeByUserId = dXWidgetNode.queryWidgetNodeByUserId(str)) == null || !TextUtils.equals(queryWidgetNodeByUserId.getUserId(), str) || (D = queryWidgetNodeByUserId.getDXRuntimeContext().D()) == null)) {
                view = D;
            }
            shimmerItem(view, str2, i2, animatorListenerAdapter);
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance, com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        MPUserContext remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        super.dispose();
        RecyclerHoldLastBottomExtension recyclerHoldLastBottomExtension = this.recyclerHoldLastBottomExtension;
        if (recyclerHoldLastBottomExtension != null) {
            recyclerHoldLastBottomExtension.destory();
        }
        Object reUseKey = getReUseKey(getView().getContext());
        Map<Object, DXEngineRefInfo> map = sCacheDXEngine;
        DXEngineRefInfo dXEngineRefInfo = map.get(reUseKey);
        if (dXEngineRefInfo != null) {
            if (dXEngineRefInfo.cacheInstanceMap.containsKey(this) && (remove = dXEngineRefInfo.cacheInstanceMap.remove(this)) != null) {
                remove.dispose();
            }
            if (dXEngineRefInfo.cacheInstanceMap.isEmpty()) {
                Logger.ftl(new Logger.FormatLog.Builder().type(2).module(16).point(2002).build());
                dXEngineRefInfo.dinamicXEngine.a1(new EmptyNotificationListener());
                dXEngineRefInfo.dinamicXEngine.W0(k06.a("mpTap"), new EmptyTapHandler());
                dXEngineRefInfo.dinamicXEngine.W0(k06.a("mpLTap"), new EmptyTapHandler());
                dXEngineRefInfo.dinamicXEngine.W0(k06.a("mpAppear"), new EmptyTapHandler());
                dXEngineRefInfo.dinamicXEngine.W0(k06.a("mpDisappear"), new EmptyTapHandler());
                dXEngineRefInfo.dinamicXEngine.q0();
                map.remove(reUseKey);
            }
        }
    }

    public DXRootView getDxRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f4259b7f", new Object[]{this});
        }
        return this.dxRootView;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public RenderResult getRenderResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderResult) ipChange.ipc$dispatch("26051047", new Object[]{this});
        }
        return this.mRenderResult;
    }

    public RenderTemplate getRenderTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderTemplate) ipChange.ipc$dispatch("a90ba7a7", new Object[]{this});
        }
        return this.renderTemplate;
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, str});
        } else {
            this.identifier = str;
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void onDryRun(Context context, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76212876", new Object[]{this, context, serializable});
            return;
        }
        DXEngineRefInfo dXEngineRefInfo = sCacheDXEngine.get(getReUseKey(context));
        if (dXEngineRefInfo != null) {
            RenderTemplate renderTemplate = getViewObject().info.renderTemplate;
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = (String) renderTemplate.renderData.get("name");
            dXTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
            dXTemplateItem.c = (String) renderTemplate.renderData.get("url");
            if (!DXAsyncCacheManager.isOpen) {
                dXEngineRefInfo.dinamicXEngine.E0(context, (JSONObject) serializable, dXTemplateItem, -1, new DXRenderOptions.b().q());
            } else if (isSnapshot()) {
                DXAsyncCacheManager.asyncRender(context, dXEngineRefInfo.dinamicXEngine, dXTemplateItem, serializable);
            } else {
                dXEngineRefInfo.dinamicXEngine.E0(context, (JSONObject) serializable, dXTemplateItem, -1, new DXRenderOptions.b().q());
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void onRefresh(Serializable serializable, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87d3b43", new Object[]{this, serializable, eventDispatcher});
            return;
        }
        Map<? extends String, ? extends Object> map = (Map) serializable;
        if (this.dxRootView != null) {
            if (this.convertJSON) {
                map = dxDataAdapter(map);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(map);
            jSONObject.put("__refreshTime", (Object) Long.valueOf(System.currentTimeMillis()));
            Logger.e(TAG, "dinamicx  refresh for item: " + this.dxTemplateItem.f7343a + ", version:" + this.dxTemplateItem.b);
            if ("1".equals(ValueUtil.getString(this.renderTemplate.renderData, "enableRefresh", "1"))) {
                renderDXTemplate(this.dxRootView, jSONObject, true);
            }
            if (ApplicationUtil.isDebug()) {
                Logger.d(TAG, "id: " + getId() + " | onRefresh");
            }
        }
    }

    public void pauseBindData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27fc3a4", new Object[]{this});
        } else {
            this.pauseBindDataPause = true;
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance, com.taobao.message.lab.comfrm.render.WidgetInterface
    public void postEvent(Event event) {
        DXRootView dXRootView;
        DXWidgetNode expandWidgetNode;
        DXRootView dXRootView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        super.postEvent(event);
        if (h9z.EVENT_ON_APPEAR.equals(event.getName())) {
            this.dxEngine.t0(this.dxRootView);
        } else if ("onDisappear".equals(event.getName())) {
            this.dxEngine.u0(this.dxRootView);
        } else if ("onSystemConfigurationsChanged".equals(event.getName())) {
            refreshView();
        } else if ("onScreenChanged".equals(event.getName())) {
            refreshView();
        }
        if ("onReAppear".equals(event.getName()) && (dXRootView2 = this.dxRootView) != null && dXRootView2.getExpandWidgetNode() != null) {
            DXWidgetNode expandWidgetNode2 = this.dxRootView.getExpandWidgetNode();
            if (expandWidgetNode2 != null) {
                expandWidgetNode2.sendBroadcastEvent(new DXEvent(DXPageLifecyclerWidgetNode.DXPAGELIFECYCLER_ONREAPPEAR));
            }
        } else if ("onDestroy".equals(event.getName()) && (dXRootView = this.dxRootView) != null && dXRootView.getExpandWidgetNode() != null && (expandWidgetNode = this.dxRootView.getExpandWidgetNode()) != null) {
            expandWidgetNode.sendBroadcastEvent(new DXEvent(DXPageLifecyclerWidgetNode.DXPAGELIFECYCLER_ONDESTROY));
        }
    }

    public void resumeBindData() {
        EventDispatcher eventDispatcher;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6538cb5b", new Object[]{this});
            return;
        }
        this.pauseBindDataPause = false;
        Serializable serializable = this.pauseBindDataObject;
        if (serializable != null && (eventDispatcher = this.pauseBindEventDispatch) != null) {
            bindData(serializable, eventDispatcher);
        }
    }

    private void handleScrollOffset(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7979841", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("widgetNodeId");
        int intValue = jSONObject.getInteger(yj4.PARAM_SEARCH_KEYWORD_POS).intValue();
        DXWidgetNode queryWTByUserId = this.dxRootView.getExpandWidgetNode().queryWTByUserId(string);
        if (!(queryWTByUserId instanceof DXRecyclerLayout)) {
            return;
        }
        if (jSONObject.getBooleanValue("animation")) {
            RecyclerView j0 = ((DXRecyclerLayout) queryWTByUserId).j0();
            if (j0 != null) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(j0.getContext()) { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/DXWidgetInstance$4");
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public int getVerticalSnapPreference() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Number) ipChange2.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
                        }
                        return -1;
                    }
                };
                linearSmoothScroller.setTargetPosition(intValue);
                j0.getLayoutManager().startSmoothScroll(linearSmoothScroller);
                return;
            }
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWTByUserId;
        dXRecyclerLayout.c1(false, intValue);
        RecyclerView j02 = dXRecyclerLayout.j0();
        if (j02 != null) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) j02.getLayoutManager();
            if (j02.findViewHolderForAdapterPosition(intValue) == null) {
                staggeredGridLayoutManager.scrollToPositionWithOffset(intValue, 0);
                j02.scrollBy(0, -200);
                return;
            }
            staggeredGridLayoutManager.scrollToPositionWithOffset(intValue, 200);
        }
    }

    private DXResult<DXRootView> renderDXTemplate(DXRootView dXRootView, JSONObject jSONObject, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("6f877eb1", new Object[]{this, dXRootView, jSONObject, new Boolean(z)});
        }
        Context dxRootViewContext = getDxRootViewContext(dXRootView);
        DXRenderOptions.b E = new DXRenderOptions.b().G(pb6.j()).E(this.mpUserContext);
        if (!(dxRootViewContext == null || !DisplayUtil.isLargeScreen(dxRootViewContext) || DisplayUtil.getActivityFromContext(dxRootViewContext) == null)) {
            E.G(pb6.w(DisplayUtil.getActivityFromContext(dxRootViewContext)));
        }
        String string = ValueUtil.getString(this.renderTemplate.renderData, "heightMode", null);
        String string2 = ValueUtil.getString(this.renderTemplate.renderData, "widthMode", null);
        boolean equals = "fullScreen".equals(string);
        if (equals || "matchParent".equals(string)) {
            i = dXRootView.getParent() instanceof View ? ((View) dXRootView.getParent()).getHeight() : 0;
            if (i <= 0) {
                int statusBarHeight = "1".equals(ValueUtil.getString(this.renderTemplate.renderData, "immersiveStatusBar", null)) ? 0 : DisplayUtil.getStatusBarHeight(dxRootViewContext);
                if (dxRootViewContext instanceof Activity) {
                    Activity activity = (Activity) dxRootViewContext;
                    if (activity.findViewById(16908290) != null) {
                        i = activity.findViewById(16908290).getHeight() - statusBarHeight;
                    }
                }
                if (i <= 0) {
                    i = DisplayUtil.getScreenHeight() - statusBarHeight;
                }
                if (getRenderConfig() != null) {
                    i -= getRenderConfig().matchParentPaddingTop;
                }
            }
            if (this.lastRealHeight == 0) {
                this.lastRealHeight = SharedPreferencesUtil.getIntSharedPreference(ApplicationUtil.getApplication(), DEFAULT_CAHCE_KEY, 0);
            }
            if (this.lastRealHeight != i) {
                this.lastRealHeight = i;
                SharedPreferencesUtil.addIntSharedPreference(DEFAULT_CAHCE_KEY, i);
            }
            E.t(DXWidgetNode.DXMeasureSpec.c(i, 1073741824));
        } else {
            E.t(pb6.i());
            i = 0;
        }
        if ("matchParent".equals(string2)) {
            int width = dXRootView.getParent() instanceof View ? ((View) dXRootView.getParent()).getWidth() : 0;
            if (width <= 0 && dXRootView.getParent() != null) {
                ((View) dXRootView.getParent()).measure(0, 0);
                width = ((View) dXRootView.getParent()).getMeasuredWidth();
            }
            E.G(DXWidgetNode.DXMeasureSpec.c(width, 1073741824));
        }
        if (!this.convertJSON) {
            return this.dxEngine.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, E.q());
        }
        if (!equals || i != dXRootView.getHeight() || "0".equals(this.usePartRefreshConfig)) {
            return this.dxEngine.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, E.q());
        }
        return refreshWithNode(dXRootView, jSONObject, E, z);
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(final Context context, RenderTemplate renderTemplate) {
        int i;
        BizTagUtil.BizTag bizTag;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        this.demoteDiffRefreshOpt = false;
        this.convertJSON = "1".equals(ValueUtil.getString(renderTemplate.renderData, "convertJSON", "0"));
        this.usePartRefreshConfig = ValueUtil.getString(renderTemplate.renderData, "usePartRefresh", "0");
        JSONArray jSONArray = (JSONArray) ValueUtil.getValue(renderTemplate.renderData, "recyclerHoldLastBottomArray", JSONArray.class, null);
        this.recyclerHoldLastBottomArray = jSONArray;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            this.recyclerHoldLastBottomExtension = new RecyclerHoldLastBottomExtension();
        }
        this.renderTemplate = renderTemplate;
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        this.dxTemplateItem = dXTemplateItem;
        dXTemplateItem.f7343a = (String) renderTemplate.renderData.get("name");
        this.dxTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
        this.dxTemplateItem.c = (String) renderTemplate.renderData.get("url");
        final Object reUseKey = getReUseKey(context);
        Map<Object, DXEngineRefInfo> map = sCacheDXEngine;
        DXEngineRefInfo dXEngineRefInfo = map.get(reUseKey);
        if (dXEngineRefInfo == null) {
            TraceUtil.beginSection("msgTabDxEngine");
            if (getRenderContext() != null) {
                String string = ValueUtil.getString(getRenderContext(), MsgDinamicxEngine.KEY_DX_SUB_BIZTYPE);
                i = ValueUtil.getInteger(getRenderContext(), "dxPipelineCacheMaxCount", 0);
                str = string;
                bizTag = (BizTagUtil.BizTag) ValueUtil.getValue(getRenderContext(), "dxBizTag", BizTagUtil.BizTag.class, null);
            } else {
                str = null;
                bizTag = null;
                i = -1;
            }
            dXEngineRefInfo = new DXEngineRefInfo();
            WidgetRenderImpl.RenderConfig renderConfig = getRenderConfig();
            if (renderConfig == null || TextUtils.isEmpty(renderConfig.dxEngineBizType)) {
                dXEngineRefInfo.dinamicXEngine = MsgDinamicxEngine.createNewEngine(context, str);
            } else {
                dXEngineRefInfo.dinamicXEngine = MsgDinamicxEngine.createNewEngine(context, str, renderConfig.dxEngineBizType, bizTag, i, renderConfig.ap2dp);
            }
            dXEngineRefInfo.dinamicXEngine.a1(new iwb() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iwb
                public void onNotificationListener(final k66 k66Var) {
                    List<DXTemplateItem> list;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                    } else if (k66Var != null && (list = k66Var.f22428a) != null && list.size() > 0) {
                        Logger.e(DXWidgetInstance.TAG, "dinamicx DXNotificationResult finishedTemplateItems come back ");
                        UIHandler.post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                TraceUtil.beginSection("DXNotificationResultRefresh");
                                for (DXTemplateItem dXTemplateItem2 : k66Var.f22428a) {
                                    DXEngineRefInfo dXEngineRefInfo2 = DXWidgetInstance.sCacheDXEngine.get(reUseKey);
                                    if (dXEngineRefInfo2 != null) {
                                        for (DXWidgetInstance dXWidgetInstance : dXEngineRefInfo2.cacheInstanceMap.keySet()) {
                                            if (dXWidgetInstance != null) {
                                                DXTemplateItem dXTemplateItem3 = new DXTemplateItem();
                                                dXTemplateItem3.f7343a = (String) dXWidgetInstance.getRenderTemplate().renderData.get("name");
                                                dXTemplateItem3.b = Long.parseLong((String) dXWidgetInstance.getRenderTemplate().renderData.get("version"));
                                                dXTemplateItem3.c = (String) dXWidgetInstance.getRenderTemplate().renderData.get("url");
                                                if (dXTemplateItem2.f7343a.equals(dXTemplateItem3.f7343a)) {
                                                    Logger.e(DXWidgetInstance.TAG, "dinamicx DXNotificationResult rebuildAndBindData for item: " + dXTemplateItem3.f7343a + ", version:" + dXTemplateItem3.b);
                                                    if (DXWidgetInstance.access$000(dXWidgetInstance) != null) {
                                                        dXWidgetInstance.buildInnerDXView(context, dXWidgetInstance.getRenderTemplate(), DXWidgetInstance.access$000(dXWidgetInstance));
                                                        dXWidgetInstance.bindData((Serializable) DXWidgetInstance.access$000(dXWidgetInstance), DXWidgetInstance.access$100(dXWidgetInstance));
                                                    } else {
                                                        Logger.e(DXWidgetInstance.TAG, "lastRenderData is null, template:" + dXTemplateItem3.f7343a);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                TraceUtil.endTrace();
                            }
                        });
                    }
                }
            });
            setupFullPageEngine(dXEngineRefInfo.dinamicXEngine);
            dXEngineRefInfo.cacheInstanceMap = new ConcurrentHashMap();
            map.put(reUseKey, dXEngineRefInfo);
            TraceUtil.endTrace();
        }
        if (this.frameLayout == null) {
            boolean equals = TextUtils.equals(ValueUtil.getString(renderTemplate.renderData, "resizeFrame"), "1");
            if (!equals || !(context instanceof Activity)) {
                this.frameLayout = new FrameLayout(context);
            } else {
                this.frameLayout = new ResizeFrameLayout((Activity) context);
            }
            if (equals) {
                this.frameLayout.setId(R.id.auraRootDX);
            }
        }
        this.dxEngine = dXEngineRefInfo.dinamicXEngine;
        MPUserContext mPUserContext = new MPUserContext(getRenderContext());
        this.mpUserContext = mPUserContext;
        mPUserContext.setIdentifier(this.identifier);
        this.mpUserContext.setRenderConfig(getRenderConfig());
        dXEngineRefInfo.cacheInstanceMap.put(this, this.mpUserContext);
        return this.frameLayout;
    }

    public boolean buildInnerDXView(Context context, RenderTemplate renderTemplate, Object obj) {
        DXRootView dXRootView;
        DXResult<DXRootView> dXResult;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9567bfca", new Object[]{this, context, renderTemplate, obj})).booleanValue();
        }
        if (this.frameLayout != null && this.dxRootView == null) {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = (String) renderTemplate.renderData.get("name");
            dXTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
            dXTemplateItem.c = (String) renderTemplate.renderData.get("url");
            Logger.e(TAG, "dinamicx build for item: " + dXTemplateItem.f7343a + ", version:" + dXTemplateItem.b);
            if (DXAsyncCacheManager.isOpen) {
                dXRootView = DXAsyncCacheManager.dxCache.remove(String.valueOf(obj.hashCode()));
                if (dXRootView != null) {
                    this.dxRootView = dXRootView;
                } else if (obj instanceof JSONObject) {
                    String string = ((JSONObject) obj).getString("VC_UNI_ID");
                    if (!TextUtils.isEmpty(string) && (dXRootView = DXAsyncCacheManager.dxCache.remove(string)) != null) {
                        this.dxRootView = dXRootView;
                    }
                }
            } else {
                dXRootView = null;
            }
            if (this.dxRootView == null) {
                DXTemplateItem fetchTemplate = fetchTemplate(dXTemplateItem, dXTemplateItem);
                checkTemplate(fetchTemplate, dXTemplateItem);
                if (fetchTemplate != null) {
                    if (ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "enableDXPreRender")) {
                        dXResult = this.dxEngine.z0(context, fetchTemplate);
                    } else {
                        dXResult = this.dxEngine.o(context, fetchTemplate);
                    }
                    if (dXResult != null && !dXResult.d()) {
                        this.dxRootView = dXResult.f7291a;
                    }
                    if (dXResult != null && dXResult.d()) {
                        Logger.e(TAG, "dinamicx onCreateContentHolder dinamicXView is null error:" + dXResult.a().toString());
                    }
                }
            }
            DXRootView dXRootView2 = this.dxRootView;
            if (dXRootView2 == null) {
                Logger.e(TAG, "dinamicx onCreateContentHolder dinamicXView is null ");
                return false;
            }
            dXRootView2.setTag(R.id.messageDX, this);
            this.frameLayout.removeAllViews();
            if (TextUtils.equals(ValueUtil.getString(renderTemplate.renderData, "heightMode"), "fullScreen") || TextUtils.equals(ValueUtil.getString(renderTemplate.renderData, "heightMode"), "matchParent")) {
                z = true;
            }
            if (renderTemplate.renderData != null && z) {
                this.frameLayout.addView(this.dxRootView, -1, -1);
            } else if (dXRootView != null) {
                this.frameLayout.addView(this.dxRootView, dXRootView.getLayoutParams().width, dXRootView.getLayoutParams().height);
            } else {
                this.frameLayout.addView(this.dxRootView, -1, -2);
            }
        }
        return true;
    }

    static {
        t2o.a(537919782);
        t2o.a(537919771);
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void bindData(Serializable serializable, EventDispatcher eventDispatcher) {
        JSONObject jSONObject;
        boolean z;
        long j;
        boolean z2;
        RecyclerHoldLastBottomExtension recyclerHoldLastBottomExtension;
        JSONArray jSONArray;
        Throwable th;
        Integer num;
        Integer num2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdace18e", new Object[]{this, serializable, eventDispatcher});
        } else if (this.pauseBindDataPause) {
            this.pauseBindDataObject = serializable;
            this.pauseBindEventDispatch = eventDispatcher;
        } else if (serializable != null) {
            boolean isDebug = ApplicationUtil.isDebug();
            long elapsedRealtime = isDebug ? SystemClock.elapsedRealtime() : 0L;
            Logger.e(TAG, "dinamicx  bindData for item: " + this.dxTemplateItem.f7343a + ", version:" + this.dxTemplateItem.b);
            if (this.convertJSON) {
                jSONObject = dxDataAdapter((Map) serializable);
            } else {
                jSONObject = (JSONObject) serializable;
            }
            DXAsyncCacheManager.ban(jSONObject);
            this.dispatcher = eventDispatcher;
            TraceUtil.beginSection((String) this.renderTemplate.renderData.get("name"), "buildInnerDXView");
            buildInnerDXView(this.frameLayout.getContext(), this.renderTemplate, jSONObject);
            TraceUtil.endTrace();
            DXRootView dXRootView = this.dxRootView;
            if (dXRootView != null) {
                if ((jSONObject == dXRootView.getData() ? false : !jSONObject.equals(this.dxRootView.getData())) || this.demoteDiffRefreshOpt) {
                    DXResult<DXRootView> renderDXTemplate = renderDXTemplate(this.dxRootView, jSONObject, false);
                    if (renderDXTemplate.d()) {
                        String fVar = renderDXTemplate.a().toString();
                        j = elapsedRealtime;
                        Logger.e(TAG, "dinamicx render failed: " + fVar);
                        z = isDebug;
                        this.mRenderResult = new RenderResult(new RenderError("10000", "dx 渲染失败", renderDXTemplate.a().toString()));
                        MonitorUtil.commitFail(Monitor.MODULE_COMFRM, Monitor.POINT_LOAD_DX_COMPONENT_RATE, "DX", "DX_FAIL", "renderTemplateFail:" + fVar);
                        z2 = true;
                        getView().setVisibility(0);
                    }
                } else if (ApplicationUtil.isDebug()) {
                    Logger.e(TAG, "dinamicX|BindData|needRefresh|false|" + this.renderTemplate.name);
                }
                z = isDebug;
                j = elapsedRealtime;
                z2 = false;
                getView().setVisibility(0);
            } else {
                z = isDebug;
                j = elapsedRealtime;
                getView().setVisibility(4);
                Logger.e(TAG, "dinamicx render failed: dxRootView null");
                this.mRenderResult = new RenderResult(new RenderError("202", "dxRootView null", null));
                MonitorUtil.commitFail(Monitor.MODULE_COMFRM, Monitor.POINT_LOAD_DX_COMPONENT_RATE, "DX", "DX_FAIL", "dxRootView null");
                z2 = true;
            }
            if (!z2) {
                MonitorUtil.commitSuccess(Monitor.MODULE_COMFRM, Monitor.POINT_LOAD_DX_COMPONENT_RATE, "DX");
                this.mRenderResult = new RenderResult();
            }
            TraceUtil.beginSection((String) this.renderTemplate.renderData.get("name"), "buildData-2");
            if (jSONObject.containsKey("__DXCMD") && (jSONArray = (JSONArray) jSONObject.get("__DXCMD")) != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    try {
                        final JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if ("updateLoadMoreStatus".equals(jSONObject2.getString("name"))) {
                            String string = jSONObject2.getString("widgetNodeId");
                            try {
                                num2 = jSONObject2.getInteger("status");
                            } catch (Exception unused) {
                                Logger.e(TAG, "status get err");
                                num2 = null;
                            }
                            if (num2 == null) {
                                String string2 = jSONObject2.getString("status");
                                if (DXRecyclerLayout.LOAD_MORE_STOPED.equals(string2)) {
                                    num2 = 4;
                                } else if (DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING.equals(string2)) {
                                    num2 = 5;
                                }
                            }
                            if (!(string == null || num2 == null)) {
                                DXWidgetNode queryWTByUserId = this.dxRootView.getExpandWidgetNode().queryWTByUserId(string);
                                if (queryWTByUserId instanceof DXRecyclerLayout) {
                                    ((DXRecyclerLayout) queryWTByUserId).t1(num2.intValue());
                                }
                            }
                            jSONObject = jSONObject;
                        } else {
                            jSONObject = jSONObject;
                            try {
                                if ("updatePullLoadMoreStatus".equals(jSONObject2.getString("name"))) {
                                    try {
                                        String string3 = jSONObject2.getString("widgetNodeId");
                                        try {
                                            num = jSONObject2.getInteger("status");
                                        } catch (Exception e) {
                                            Logger.e(TAG, "status get err" + e.getMessage() + ", op=" + JSON.toJSONString(jSONObject2));
                                            num = null;
                                        }
                                        if (num == null) {
                                            String string4 = jSONObject2.getString("status");
                                            if (DXRecyclerLayout.LOAD_MORE_STOPED.equals(string4)) {
                                                try {
                                                    num = 4;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    Logger.e(TAG, "dinamicx render cmd fail: " + i + "|" + jSONArray.toJSONString() + "|error=" + th.getMessage());
                                                }
                                            } else if (DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING.equals(string4)) {
                                                num = 5;
                                            }
                                        }
                                        if (!(string3 == null || num == null)) {
                                            DXWidgetNode queryWTByUserId2 = this.dxRootView.getExpandWidgetNode().queryWTByUserId(string3);
                                            if (queryWTByUserId2 instanceof DXRecyclerLayout) {
                                                ((DXRecyclerLayout) queryWTByUserId2).u1(num.intValue());
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } else if ("scrollBottom".equals(jSONObject2.getString("name"))) {
                                    Logger.e(TAG, "scrollBottom 111");
                                    DXWidgetNode queryWTByUserId3 = this.dxRootView.getExpandWidgetNode().queryWTByUserId(jSONObject2.getString("widgetNodeId"));
                                    if (queryWTByUserId3 instanceof DXRecyclerLayout) {
                                        Logger.e(TAG, "scrollBottom 222");
                                        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWTByUserId3;
                                        int itemCount = dXRecyclerLayout.j0().getAdapter().getItemCount();
                                        try {
                                            dXRecyclerLayout.c1(false, itemCount == 0 ? 0 : itemCount - 1);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            Logger.e(TAG, "dinamicx render cmd fail: " + i + "|" + jSONArray.toJSONString() + "|error=" + th.getMessage());
                                        }
                                    }
                                } else if ("scrollOffset".equals(jSONObject2.getString("name"))) {
                                    if (jSONObject2.getBooleanValue("delay")) {
                                        this.dxRootView.post(new Runnable() { // from class: tb.nn6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                DXWidgetInstance.this.lambda$bindData$0(jSONObject2);
                                            }
                                        });
                                    } else {
                                        handleScrollOffset(jSONObject2);
                                    }
                                } else if ("sendFirstPageEvent".equals(jSONObject2.getString("name"))) {
                                    DXWidgetNode queryWTByUserId4 = this.dxRootView.getExpandWidgetNode().queryWTByUserId(jSONObject2.getString("widgetNodeId"));
                                    if (queryWTByUserId4 != null) {
                                        queryWTByUserId4.postEvent(new DxCustemDataEvent(DXMPRecyclerCompanionWidgetNode.DXMPRECYCLERCOMPANION_FIRSTPAGELOADFINISH));
                                    }
                                } else if ("shimmerItem".equals(jSONObject2.getString("name"))) {
                                    shimmerCell(jSONObject2.getString("widgetNodeId"), jSONObject2.getJSONArray("list"), jSONObject2.getString("shimmerStyle"), TextUtils.equals("1", ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "shimmerPartItemV5", "1")) ? jSONObject2.getString("partShimmerNodeId") : null);
                                } else if ("moveRecyclerLayoutHeader".equals(jSONObject2.getString("name"))) {
                                    DXWidgetNode queryWTByUserId5 = this.dxRootView.getExpandWidgetNode().queryWTByUserId(jSONObject2.getString("widgetNodeId"));
                                    if (queryWTByUserId5 instanceof DXRecyclerLayout) {
                                        boolean S = ((DXRecyclerLayout) queryWTByUserId5).S();
                                        Logger.e(TAG, "recycleLayout move Result is " + S);
                                    }
                                } else if ("updateRecyclerLayoutHeader".equals(jSONObject2.getString("name"))) {
                                    DXWidgetNode queryWTByUserId6 = this.dxRootView.getExpandWidgetNode().queryWTByUserId(jSONObject2.getString("widgetNodeId"));
                                    if (queryWTByUserId6 instanceof DXRecyclerLayout) {
                                        DXRecyclerLayout dXRecyclerLayout2 = (DXRecyclerLayout) queryWTByUserId6;
                                        JSONObject jSONObject3 = jSONObject2.containsKey("data") ? jSONObject2.getJSONObject("data") : null;
                                        if (jSONObject3 != null) {
                                            boolean q1 = dXRecyclerLayout2.q1(jSONObject3);
                                            Logger.e(TAG, "recycleLayout update Result is " + q1);
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                Logger.e(TAG, "dinamicx render cmd fail: " + i + "|" + jSONArray.toJSONString() + "|error=" + th.getMessage());
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        jSONObject = jSONObject;
                        Logger.e(TAG, "dinamicx render cmd fail: " + i + "|" + jSONArray.toJSONString() + "|error=" + th.getMessage());
                    }
                }
            }
            TraceUtil.endTrace();
            TraceUtil.beginSection((String) this.renderTemplate.renderData.get("name"), "tryInit");
            Context dxRootViewContext = getDxRootViewContext(this.dxRootView);
            DXRootView dXRootView2 = this.dxRootView;
            if (!(dXRootView2 == null || (recyclerHoldLastBottomExtension = this.recyclerHoldLastBottomExtension) == null || !(dxRootViewContext instanceof Activity))) {
                recyclerHoldLastBottomExtension.tryInit((Activity) dxRootViewContext, dXRootView2, this.recyclerHoldLastBottomArray);
            }
            this.lastRenderData = jSONObject;
            TraceUtil.endTrace();
            if (z) {
                Logger.e(TAG, "dinamicX|BindData|" + this.renderTemplate.name + "|" + (SystemClock.elapsedRealtime() - j));
            }
        }
    }

    private DXResult<DXRootView> refreshWithNode(DXRootView dXRootView, Map<String, Object> map, DXRenderOptions.b bVar, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("d121697c", new Object[]{this, dXRootView, map, bVar, new Boolean(z)});
        }
        if (dXRootView.getData() == null || z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(map);
            return this.dxEngine.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, bVar.q());
        }
        JSONObject data = dXRootView.getData();
        if (data instanceof DXJSONObjectForVM) {
            ((DXJSONObjectForVM) data).setData(map);
        } else {
            data.clear();
            data.putAll(map);
        }
        JSONArray jSONArray = (JSONArray) this.renderTemplate.renderData.get("recyclerLayoutRefresh");
        Diff diff = getViewObject().diff;
        String str = TAG;
        if (!(jSONArray == null || diff == null)) {
            int i2 = 0;
            while (i2 < jSONArray.size()) {
                PartRefresh partRefresh = (PartRefresh) jSONArray.getObject(i2, PartRefresh.class);
                String str2 = partRefresh.widgetId;
                String str3 = partRefresh.refreshType;
                if (str2 != null) {
                    DXWidgetNode queryWTByUserId = dXRootView.getExpandWidgetNode().queryWTByUserId(str2);
                    if (queryWTByUserId instanceof DXRecyclerLayout) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        DXPartRefreshHanlder dXPartRefreshHanlder = (DXPartRefreshHanlder) ClassPool.instance().getInstance(str3, (Class<Object>) DXPartRefreshHanlder.class, this.identifier, true, this.classNamespace);
                        TraceUtil.beginSection("partRefresh");
                        i = i2;
                        str = str;
                        boolean partRefresh2 = dXPartRefreshHanlder.partRefresh(this.dxEngine, dXRootView, (DXRecyclerLayout) queryWTByUserId, partRefresh.refreshConfig, map, diff);
                        TraceUtil.endTrace();
                        if (ApplicationUtil.isDebug()) {
                            Logger.e(str, "dinamicX|BindData|" + this.renderTemplate.name + "|partRefresh|" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                        if (!partRefresh2) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.putAll(map);
                            return this.dxEngine.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject2, -1, bVar.q());
                        }
                    } else {
                        i = i2;
                        str = str;
                        if (queryWTByUserId == null) {
                            String concat = "局部刷新找不到DXRecyclerLayout: ".concat(str2);
                            if (ApplicationUtil.isDebug()) {
                                Logger.e(str, concat);
                            } else {
                                Logger.e(str, concat);
                            }
                        } else {
                            throw new RuntimeException("局部刷新指定节点不是dxRecyclerLayout: ".concat(str2));
                        }
                    }
                } else {
                    i = i2;
                    str = str;
                }
                i2 = i + 1;
            }
        }
        if (diff != null && diff.getOriginalDiffSize() == 0 && diff.getRuntimeDiffSize() == 1 && diff.getJsRuntimeDiffSize() == 0) {
            DeltaItem runtimeDiff = diff.getRuntimeDiff("inputViewObjects");
            if (runtimeDiff != null && ((Boolean) runtimeDiff.getDataChange()).booleanValue()) {
                Logger.e(str, "dinamicX|BindData|" + this.renderTemplate.name + "|onlyTextChanged");
                return new DXResult<>(dXRootView);
            } else if (diff.getRuntimeDiff("scrollBottomOut") != null) {
                Logger.e(str, "dinamicX|BindData|" + this.renderTemplate.name + "|onlyScrollBottomOut");
                return new DXResult<>(dXRootView);
            }
        }
        if (!isLoadMoreOpenOpt || diff == null || diff.getOriginalDiffSize() != 1 || diff.getOriginalDiff(SimpleMessageListData.SOURCE_NAME_MESSAGE) == null) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            TraceUtil.beginSection("refreshTemplateWithNode");
            if (TraceUtil.isEnableTrace() && diff != null) {
                JSONObject json = diff.toJSON();
                if (diff.getOriginalDiffSize() > 0) {
                    for (String str4 : json.getJSONObject("originalDiff").keySet()) {
                        TraceUtil.beginSection("originalDiff-", str4);
                        TraceUtil.endTrace();
                    }
                }
                if (diff.getRuntimeDiffSize() > 0) {
                    for (String str5 : json.getJSONObject("runtimeDiff").keySet()) {
                        TraceUtil.beginSection("runtimeDiff-", str5);
                        TraceUtil.endTrace();
                    }
                }
                if (diff.getJsRuntimeDiffSize() > 0) {
                    for (String str6 : json.getJSONObject("jsRuntimeDiff").keySet()) {
                        TraceUtil.beginSection("jsRuntimeDiff-", str6);
                        TraceUtil.endTrace();
                    }
                }
            }
            DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
            DXWidgetRefreshOption.a aVar = new DXWidgetRefreshOption.a();
            aVar.d(true).c("2".equals(this.usePartRefreshConfig) ? 3 : 0).g(true);
            this.dxEngine.I0(expandWidgetNode, 0, aVar.a());
            if (ApplicationUtil.isDebug()) {
                Logger.e(str, "dinamicX|BindData|" + this.renderTemplate.name + "|refreshTemplateWithNode|" + (SystemClock.elapsedRealtime() - elapsedRealtime2));
            }
            TraceUtil.endTrace();
            return new DXResult<>(dXRootView);
        }
        Logger.e(str, "dinamicX|BindData|" + this.renderTemplate.name + "|messageSource");
        return new DXResult<>(dXRootView);
    }
}
