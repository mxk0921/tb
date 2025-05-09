package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.message.SimpleFrameworkModule;
import com.taobao.message.chatv2.viewcenter.IViewCenterProvider;
import com.taobao.message.chatv2.viewcenter.IViewCenterService;
import com.taobao.message.chatv2.viewcenter.ViewCenterPreloadCache;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import com.taobao.message.lab.comfrm.render.WidgetInterface;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.support.dinamic.DxCustemDataEvent;
import com.taobao.message.lab.comfrm.support.list.LongClickListenFrameLayout;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXMsgDXWrapperWidgetNodeV2 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMSGDXWRAPPER_DATA = 33556442494L;
    public static final long DXMSGDXWRAPPER_JSRUNTIMEDATA = 1150689195281789256L;
    public static final long DXMSGDXWRAPPER_LAYOUTINFO = 2441585390341008180L;
    public static final long DXMSGDXWRAPPER_MSGDXWRAPPER = -7589736022598687312L;
    public static final long DXMSGDXWRAPPER_ONCHANGE = 5288679823228297259L;
    public static final long DXMSGDXWRAPPER_RUNTIMEDATA = -4616099342033412215L;
    public static final long DXMSGDXWRAPPER_TEMPLATEID = -912316463184242157L;
    public static final String EVENT_INNER_FRAME_SIZE_CHANGED = "InnerFrameSizeChanged";
    private ActionDispatcher actionDispatcher;
    private String auraContainerKey;
    private JSONObject jsRuntimeData;
    private JSONObject mData;
    private LayoutInfo mLayoutInfo;
    private JSONObject runtimeData;
    private String templateId;
    private IViewCenterService viewCenterService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599764);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXMsgDXWrapperWidgetNodeV2();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MyActionDispatcher implements ActionDispatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<DXMsgDXWrapperWidgetNodeV2> wrapperWidgetNodeV2WeakReference;

        static {
            t2o.a(552599765);
            t2o.a(537919547);
        }

        public MyActionDispatcher(DXMsgDXWrapperWidgetNodeV2 dXMsgDXWrapperWidgetNodeV2) {
            this.wrapperWidgetNodeV2WeakReference = new WeakReference<>(dXMsgDXWrapperWidgetNodeV2);
        }

        @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
        public void dispatch(Action action) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                return;
            }
            DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(5288679823228297259L);
            if (action.getData() != null) {
                dxCustemDataEvent.getContext().putAll((Map) action.getData());
            }
            dxCustemDataEvent.setName(action.getName());
            DXMsgDXWrapperWidgetNodeV2 dXMsgDXWrapperWidgetNodeV2 = this.wrapperWidgetNodeV2WeakReference.get();
            if (dXMsgDXWrapperWidgetNodeV2 != null) {
                if (DXMsgDXWrapperWidgetNodeV2.EVENT_INNER_FRAME_SIZE_CHANGED.equals(action.getName())) {
                    if (dxCustemDataEvent.getContext().containsKey("isAI")) {
                        z = ((Boolean) dxCustemDataEvent.getContext().get("isAI")).booleanValue();
                    }
                    if (!z || !SimpleFrameworkModule.noActionPostEvent) {
                        dXMsgDXWrapperWidgetNodeV2.requestLayout(true);
                        dXMsgDXWrapperWidgetNodeV2.postEvent(dxCustemDataEvent);
                        return;
                    }
                    DXMsgDXWrapperWidgetNodeV2.access$100(dXMsgDXWrapperWidgetNodeV2);
                    return;
                }
                dXMsgDXWrapperWidgetNodeV2.postEvent(dxCustemDataEvent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class OldActionDispatcher implements ActionDispatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599766);
            t2o.a(537919547);
        }

        private OldActionDispatcher() {
        }

        @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
        public void dispatch(Action action) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                return;
            }
            DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(5288679823228297259L);
            if (action.getData() != null) {
                dxCustemDataEvent.getContext().putAll((Map) action.getData());
            }
            dxCustemDataEvent.setName(action.getName());
            if (dxCustemDataEvent.getContext().containsKey("isAI")) {
                z = ((Boolean) dxCustemDataEvent.getContext().get("isAI")).booleanValue();
            }
            if (!DXMsgDXWrapperWidgetNodeV2.EVENT_INNER_FRAME_SIZE_CHANGED.equals(action.getName())) {
                DXMsgDXWrapperWidgetNodeV2.this.postEvent(dxCustemDataEvent);
            } else if (!z || !SimpleFrameworkModule.noActionPostEvent) {
                DXMsgDXWrapperWidgetNodeV2.this.requestLayout(true);
                DXMsgDXWrapperWidgetNodeV2.this.postEvent(dxCustemDataEvent);
            } else {
                DXMsgDXWrapperWidgetNodeV2.access$100(DXMsgDXWrapperWidgetNodeV2.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class WidgetInstanceHolder implements Disposable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<WidgetInterface> ref;

        static {
            t2o.a(552599767);
            t2o.a(537919598);
        }

        public WidgetInstanceHolder(WidgetInterface widgetInterface) {
            this.ref = new WeakReference<>(widgetInterface);
        }

        public static /* synthetic */ WeakReference access$000(WidgetInstanceHolder widgetInstanceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("6e77d869", new Object[]{widgetInstanceHolder});
            }
            return widgetInstanceHolder.ref;
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Disposable
        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(552599761);
    }

    public static /* synthetic */ void access$100(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eaec777", new Object[]{dXWidgetNode});
        } else {
            refresh(dXWidgetNode);
        }
    }

    private ActionDispatcher createActionDispatcher(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionDispatcher) ipChange.ipc$dispatch("8faf6626", new Object[]{this, jSONObject});
        }
        if (!isAI(jSONObject) || !SimpleFrameworkModule.useNewActionDispatcher) {
            return new OldActionDispatcher();
        }
        return new MyActionDispatcher(this);
    }

    private IViewCenterService getViewCenterService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IViewCenterService) ipChange.ipc$dispatch("6b9d86f6", new Object[]{this});
        }
        if (this.viewCenterService == null) {
            if (getDXRuntimeContext().S() instanceof DXWidgetInstance.MPUserContext) {
                DXWidgetInstance.MPUserContext mPUserContext = (DXWidgetInstance.MPUserContext) getDXRuntimeContext().S();
                if (mPUserContext.getRenderContext() != null) {
                    this.viewCenterService = (IViewCenterService) mPUserContext.getRenderContext().get("viewCenterService");
                    this.auraContainerKey = (String) mPUserContext.getRenderContext().get("auraContainerKey");
                }
            }
            if (getDXRuntimeContext().h() instanceof IViewCenterProvider) {
                this.viewCenterService = ((IViewCenterProvider) getDXRuntimeContext().h()).getViewCenterService();
            }
        }
        return this.viewCenterService;
    }

    private String getWidgetId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eec0a24", new Object[]{this});
        }
        LayoutInfo layoutInfo = this.mLayoutInfo;
        if (layoutInfo != null) {
            return layoutInfo.layoutId;
        }
        if (TextUtils.isEmpty(this.templateId) || !TextUtils.isDigitsOnly(this.templateId)) {
            return "";
        }
        return String.valueOf(this.templateId);
    }

    private WidgetInterface getWidgetInstance(boolean z) {
        WidgetInterface<?> widgetInterface;
        WidgetInterface<?> createView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInterface) ipChange.ipc$dispatch("af426019", new Object[]{this, new Boolean(z)});
        }
        IViewCenterService viewCenterService = getViewCenterService();
        WidgetInterface<?> widgetInterface2 = null;
        if (!(viewCenterService == null || getUserId() == null)) {
            String str = "DXWrapperCache." + getUserId() + getWidgetId();
            DXWidgetInstance.MPUserContext mPUserContext = (DXWidgetInstance.MPUserContext) getDXRuntimeContext().S();
            WidgetInstanceHolder widgetInstanceHolder = (WidgetInstanceHolder) mPUserContext.getDisposable(str);
            if (widgetInstanceHolder != null) {
                widgetInterface = (WidgetInterface) WidgetInstanceHolder.access$000(widgetInstanceHolder).get();
            } else {
                widgetInterface = null;
            }
            JSONObject jSONObject = this.mData;
            if (jSONObject == null || !jSONObject.containsKey("expandStatus") || !this.mData.getBoolean("expandStatus").booleanValue()) {
                widgetInterface2 = widgetInterface;
            } else {
                TLog.loge("DXWrapper", "expandStatus true");
                ViewCenterPreloadCache.removeWidgetInterface(this.auraContainerKey, this.mData.getString("VC_UNI_ID"));
            }
            if (widgetInterface2 == null || !(!z || widgetInterface2.getView() == null || widgetInterface2.getView().getParent() == null)) {
                JSONObject jSONObject2 = this.mData;
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("VC_UNI_ID");
                    if (!TextUtils.isEmpty(string)) {
                        widgetInterface2 = ViewCenterPreloadCache.getWidgetInterface(this.auraContainerKey, string);
                    }
                }
                if (widgetInterface2 == null) {
                    LayoutInfo layoutInfo = this.mLayoutInfo;
                    if (layoutInfo != null) {
                        createView = viewCenterService.createView(layoutInfo);
                    } else if (!TextUtils.isEmpty(this.templateId) && TextUtils.isDigitsOnly(this.templateId)) {
                        createView = viewCenterService.createView(Integer.parseInt(this.templateId));
                    }
                    widgetInterface2 = createView;
                }
                if (widgetInterface2 != null) {
                    mPUserContext.addDisposable(str, new WidgetInstanceHolder(widgetInterface2));
                }
            }
        }
        return widgetInterface2;
    }

    public static /* synthetic */ Object ipc$super(DXMsgDXWrapperWidgetNodeV2 dXMsgDXWrapperWidgetNodeV2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMsgDXWrapperWidgetNodeV2");
        }
    }

    private static void refresh(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1af98d", new Object[]{dXWidgetNode});
        } else {
            dXWidgetNode.setNeedLayout(new DXWidgetRefreshOption.a().c(3).d(true).g(true).a());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXMsgDXWrapperWidgetNodeV2();
    }

    public ActionDispatcher getActionDispatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionDispatcher) ipChange.ipc$dispatch("2390c0d0", new Object[]{this});
        }
        return this.actionDispatcher;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        if (view instanceof LongClickListenFrameLayout) {
            LongClickListenFrameLayout longClickListenFrameLayout = (LongClickListenFrameLayout) view;
            if (j == -6544685697300501093L) {
                longClickListenFrameLayout.setOnLongClickListener(null);
                longClickListenFrameLayout.setOnLongPressListener(new LongClickListenFrameLayout.OnLongPressListener() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.list.LongClickListenFrameLayout.OnLongPressListener
                    public void onLongPress(View view2, MotionEvent motionEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9a2ff438", new Object[]{this, view2, motionEvent});
                        } else {
                            DXMsgDXWrapperWidgetNodeV2.this.postEvent(new DXEvent(-6544685697300501093L));
                        }
                    }
                });
            } else if (j == 18903999933159L) {
                longClickListenFrameLayout.setOnClickListener(null);
                longClickListenFrameLayout.setOnWrapClickListener(new LongClickListenFrameLayout.OnWrapClickListener() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.list.LongClickListenFrameLayout.OnWrapClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            DXMsgDXWrapperWidgetNodeV2.this.postEvent(new DXEvent(18903999933159L));
                        }
                    }
                });
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXMsgDXWrapperWidgetNodeV2)) {
            super.onClone(dXWidgetNode, z);
            DXMsgDXWrapperWidgetNodeV2 dXMsgDXWrapperWidgetNodeV2 = (DXMsgDXWrapperWidgetNodeV2) dXWidgetNode;
            this.mData = dXMsgDXWrapperWidgetNodeV2.mData;
            this.mLayoutInfo = dXMsgDXWrapperWidgetNodeV2.mLayoutInfo;
            this.jsRuntimeData = dXMsgDXWrapperWidgetNodeV2.jsRuntimeData;
            this.runtimeData = dXMsgDXWrapperWidgetNodeV2.runtimeData;
            this.templateId = dXMsgDXWrapperWidgetNodeV2.templateId;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == 33556442494L) {
            this.mData = jSONObject;
        } else if (j == DXMSGDXWRAPPER_LAYOUTINFO && jSONObject != null) {
            this.mLayoutInfo = (LayoutInfo) jSONObject.toJavaObject(LayoutInfo.class);
        } else if (j == DXMSGDXWRAPPER_JSRUNTIMEDATA) {
            this.jsRuntimeData = jSONObject;
        } else if (j == DXMSGDXWRAPPER_RUNTIMEDATA) {
            this.runtimeData = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXMSGDXWRAPPER_TEMPLATEID) {
            this.templateId = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    private void renderWidgetInstance(WidgetInterface widgetInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f15b997", new Object[]{this, widgetInterface});
            return;
        }
        IViewCenterService viewCenterService = getViewCenterService();
        if (viewCenterService == null) {
            TLog.loge("DXWrapper", "viewCenterService is null");
            return;
        }
        widgetInterface.getView().setVisibility(0);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.mData;
        if (jSONObject2 != null) {
            jSONObject.putAll(jSONObject2);
        }
        JSONObject jSONObject3 = this.runtimeData;
        if (jSONObject3 != null) {
            jSONObject.putAll(jSONObject3);
        }
        JSONObject jSONObject4 = this.jsRuntimeData;
        if (jSONObject4 != null) {
            jSONObject.putAll(jSONObject4);
        }
        if (this.actionDispatcher == null) {
            this.actionDispatcher = createActionDispatcher(this.mData);
        }
        if (getUserId() != null) {
            ((DXWidgetInstance.MPUserContext) getDXRuntimeContext().S()).addDisposable("DXWrapperCache." + getUserId() + getWidgetId(), new WidgetInstanceHolder(widgetInterface));
        }
        String string = jSONObject.getString("VC_UNI_ID");
        if (TextUtils.isEmpty(string)) {
            viewCenterService.renderView(widgetInterface, jSONObject, this.actionDispatcher);
        } else if (ViewCenterPreloadCache.getWidgetInterface(this.auraContainerKey, string) != null) {
            ViewCenterPreloadCache.removeWidgetInterface(this.auraContainerKey, string);
        } else {
            viewCenterService.renderView(widgetInterface, jSONObject, this.actionDispatcher);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isAI(com.alibaba.fastjson.JSONObject r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "bc0bebbb"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            if (r6 == 0) goto L_0x0039
            java.lang.String r2 = "bizType"
            boolean r3 = r6.containsKey(r2)
            if (r3 == 0) goto L_0x002b
            java.lang.String r6 = r6.getString(r2)
            goto L_0x003b
        L_0x002b:
            java.lang.String r3 = "props"
            com.alibaba.fastjson.JSONObject r6 = r6.getJSONObject(r3)
            if (r6 == 0) goto L_0x0039
            java.lang.String r6 = r6.getString(r2)
            goto L_0x003b
        L_0x0039:
            java.lang.String r6 = ""
        L_0x003b:
            java.lang.String r2 = "10022"
            boolean r6 = android.text.TextUtils.equals(r6, r2)
            if (r6 == 0) goto L_0x0044
            return r0
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.isAI(com.alibaba.fastjson.JSONObject):boolean");
    }

    private boolean optRecycler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc55bb9d", new Object[]{this})).booleanValue();
        }
        if ("1".equals(SimpleFrameworkModule.optDXMsgDXWrapper)) {
            return true;
        }
        return SimpleFrameworkModule.OPT_DX_MSG_WRAPPER_ONLY_AI.equals(SimpleFrameworkModule.optDXMsgDXWrapper) && isAI(this.mData);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        try {
            LongClickListenFrameLayout longClickListenFrameLayout = new LongClickListenFrameLayout(context);
            longClickListenFrameLayout.setSelector(0);
            if (!optRecycler()) {
                WidgetInterface widgetInstance = getWidgetInstance(true);
                if (widgetInstance != null) {
                    longClickListenFrameLayout.addView(widgetInstance.getView(), new FrameLayout.LayoutParams(-2, -2));
                    longClickListenFrameLayout.setTag(R.id.dx_wrapper_widget_instance_ref, widgetInstance);
                } else {
                    TLog.loge("DXWrapper", "onCreateView|widgetInstace is null" + this.mLayoutInfo);
                }
            }
            return longClickListenFrameLayout;
        } catch (Throwable th) {
            if (ApplicationUtil.isDebug()) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:6:0x0022, B:9:0x002b, B:19:0x0046, B:22:0x0051, B:23:0x0078, B:25:0x0084, B:26:0x0087, B:27:0x0089, B:28:0x008d, B:30:0x0096, B:31:0x0099, B:32:0x009b), top: B:38:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:6:0x0022, B:9:0x002b, B:19:0x0046, B:22:0x0051, B:23:0x0078, B:25:0x0084, B:26:0x0087, B:27:0x0089, B:28:0x008d, B:30:0x0096, B:31:0x0099, B:32:0x009b), top: B:38:0x0022 }] */
    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0022
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r8)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r9)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r1] = r7
            r9[r0] = r3
            r0 = 2
            r9[r0] = r8
            java.lang.String r8 = "26cb6a66"
            r2.ipc$dispatch(r8, r9)
            return
        L_0x0022:
            com.taobao.message.lab.comfrm.render.WidgetInterface r2 = r7.getWidgetInstance(r1)     // Catch: all -> 0x004f
            java.lang.String r3 = "layoutId"
            if (r2 == 0) goto L_0x008d
            r7.renderWidgetInstance(r2)     // Catch: all -> 0x004f
            int r4 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.a(r8)     // Catch: all -> 0x004f
            int r5 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.a(r9)     // Catch: all -> 0x004f
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x003c
            r4 = 1
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            if (r5 == r6) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r4 != 0) goto L_0x0051
            if (r0 == 0) goto L_0x0046
            goto L_0x0051
        L_0x0046:
            int r8 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.b(r8)     // Catch: all -> 0x004f
            int r9 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.b(r9)     // Catch: all -> 0x004f
            goto L_0x0078
        L_0x004f:
            r8 = move-exception
            goto L_0x00a9
        L_0x0051:
            android.view.View r0 = r2.getView()     // Catch: all -> 0x004f
            r0.measure(r8, r9)     // Catch: all -> 0x004f
            android.view.View r8 = r2.getView()     // Catch: all -> 0x004f
            int r8 = r8.getMeasuredWidth()     // Catch: all -> 0x004f
            android.view.View r9 = r2.getView()     // Catch: all -> 0x004f
            int r9 = r9.getMeasuredHeight()     // Catch: all -> 0x004f
            int r0 = r7.getSuggestedMinimumWidth()     // Catch: all -> 0x004f
            int r8 = java.lang.Math.max(r8, r0)     // Catch: all -> 0x004f
            int r0 = r7.getSuggestedMinimumHeight()     // Catch: all -> 0x004f
            int r9 = java.lang.Math.max(r9, r0)     // Catch: all -> 0x004f
        L_0x0078:
            r7.setMeasuredDimension(r8, r9)     // Catch: all -> 0x004f
            com.alibaba.fastjson.JSONObject r8 = new com.alibaba.fastjson.JSONObject     // Catch: all -> 0x004f
            r8.<init>()     // Catch: all -> 0x004f
            com.taobao.message.chatv2.viewcenter.config.LayoutInfo r9 = r7.mLayoutInfo     // Catch: all -> 0x004f
            if (r9 == 0) goto L_0x0087
            java.lang.String r9 = r9.layoutId     // Catch: all -> 0x004f
            goto L_0x0089
        L_0x0087:
            java.lang.String r9 = r7.templateId     // Catch: all -> 0x004f
        L_0x0089:
            r8.put(r3, r9)     // Catch: all -> 0x004f
            goto L_0x00a8
        L_0x008d:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject     // Catch: all -> 0x004f
            r0.<init>()     // Catch: all -> 0x004f
            com.taobao.message.chatv2.viewcenter.config.LayoutInfo r1 = r7.mLayoutInfo     // Catch: all -> 0x004f
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = r1.layoutId     // Catch: all -> 0x004f
            goto L_0x009b
        L_0x0099:
            java.lang.String r1 = r7.templateId     // Catch: all -> 0x004f
        L_0x009b:
            r0.put(r3, r1)     // Catch: all -> 0x004f
            java.lang.String r1 = "data"
            com.alibaba.fastjson.JSONObject r2 = r7.mData     // Catch: all -> 0x004f
            r0.put(r1, r2)     // Catch: all -> 0x004f
            super.onMeasure(r8, r9)     // Catch: all -> 0x004f
        L_0x00a8:
            return
        L_0x00a9:
            boolean r9 = com.taobao.message.uikit.util.ApplicationUtil.isDebug()
            if (r9 == 0) goto L_0x00ba
            java.lang.Thread$UncaughtExceptionHandler r9 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r9.uncaughtException(r0, r8)
        L_0x00ba:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.onMeasure(int, int):void");
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        WidgetInterface widgetInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        try {
            super.onRenderView(context, view);
            if (view != null) {
                LongClickListenFrameLayout longClickListenFrameLayout = (LongClickListenFrameLayout) view;
                if (optRecycler()) {
                    if (longClickListenFrameLayout.getChildCount() > 0) {
                        longClickListenFrameLayout.removeAllViews();
                    }
                    widgetInterface = getWidgetInstance(false);
                    if (widgetInterface != null) {
                        ViewGroup viewGroup = (ViewGroup) widgetInterface.getView().getParent();
                        if (viewGroup != null) {
                            viewGroup.removeViewAt(viewGroup.indexOfChild(widgetInterface.getView()));
                        }
                        longClickListenFrameLayout.addView(widgetInterface.getView(), new FrameLayout.LayoutParams(-2, -2));
                        longClickListenFrameLayout.setTag(R.id.dx_wrapper_widget_instance_ref, widgetInterface);
                    }
                } else {
                    widgetInterface = (WidgetInterface) longClickListenFrameLayout.getTag(R.id.dx_wrapper_widget_instance_ref);
                    int childCount = longClickListenFrameLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        longClickListenFrameLayout.getChildAt(i).setVisibility(8);
                    }
                }
                if (widgetInterface == null) {
                    TLog.loge("DXWrapper", "onRenderView|widgetInstace is null" + this.mLayoutInfo);
                    if (ApplicationUtil.isDebug() && this.mLayoutInfo != null) {
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        Thread currentThread = Thread.currentThread();
                        defaultUncaughtExceptionHandler.uncaughtException(currentThread, new IllegalStateException("获取不到widgetInterface，刷新失败" + this.mLayoutInfo));
                        return;
                    }
                    return;
                }
                renderWidgetInstance(widgetInterface);
            }
        } catch (Throwable th) {
            if (ApplicationUtil.isDebug()) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
