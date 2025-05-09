package com.taobao.message.lab.comfrm.aura;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.provider.IErrorReportProvider;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.core.WrapperEvent;
import com.taobao.message.lab.comfrm.event.DisposeService;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventManager;
import com.taobao.message.lab.comfrm.inner2.LayoutProtocol;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.config.EventHandlerItem;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.event.EventHandleRuntime;
import com.taobao.message.lab.comfrm.inner2.lazy.LazyInitObjectRef;
import com.taobao.message.lab.comfrm.support.list.ListActions;
import com.taobao.message.lab.comfrm.support.ut.UserTrack;
import com.taobao.message.lab.comfrm.support.ut.UserTrackService;
import com.taobao.message.lab.comfrm.support.ut.UserTrackServiceImpl;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DojoEventService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ActionDispatcher mActionDispatcher;
    private final CommandHandler mCommandHandler;
    private volatile DisposeServiceImpl mDisposeService;
    private final DojoContext mDojoContext;
    private final LazyInitObjectRef<DojoPageContext> mDojoPageContextRef;
    private volatile EventManager mEventManager;
    private boolean mIsEnableSnapshotEventDataMakeup;

    static {
        t2o.a(537919521);
    }

    public DojoEventService(DojoContext dojoContext, LazyInitObjectRef<DojoPageContext> lazyInitObjectRef, ActionDispatcher actionDispatcher, CommandHandler commandHandler) {
        this.mDojoContext = dojoContext;
        this.mDojoPageContextRef = lazyInitObjectRef;
        this.mActionDispatcher = actionDispatcher;
        this.mCommandHandler = commandHandler;
        boolean equals = TextUtils.equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "isEnableNoTreeSnapshotSupport", "true"), "true");
        this.mIsEnableSnapshotEventDataMakeup = equals;
        LayoutProtocol.isEnableNoTreeSnapshot = equals;
    }

    public static /* synthetic */ void access$000(DojoEventService dojoEventService, WrapperEvent wrapperEvent, SharedState sharedState, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52df70ea", new Object[]{dojoEventService, wrapperEvent, sharedState, map});
        } else {
            dojoEventService.executeImpl(wrapperEvent, sharedState, map);
        }
    }

    private void executeWithInit(final WrapperEvent wrapperEvent, final SharedState sharedState, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab156e17", new Object[]{this, wrapperEvent, sharedState, map});
            return;
        }
        if (this.mEventManager == null) {
            initEventManager();
        }
        this.mDojoContext.plugin.onEventReceived(wrapperEvent);
        if (wrapperEvent.getContext().containsKey(StdActions.ACTION_OPT_IMMEDIATE)) {
            Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.DojoEventService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DojoEventService.access$000(DojoEventService.this, wrapperEvent, sharedState, map);
                    }
                }
            });
        } else {
            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.DojoEventService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DojoEventService.access$000(DojoEventService.this, wrapperEvent, sharedState, map);
                    }
                }
            });
        }
    }

    private void handleAura(JSONArray jSONArray, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ea7fad", new Object[]{this, jSONArray, event});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                try {
                    EventHandleRuntime eventHandleRuntime = (EventHandleRuntime) jSONObject.toJavaObject(EventHandleRuntime.class);
                    if (eventHandleRuntime != null) {
                        this.mEventManager.handle(event, eventHandleRuntime);
                    }
                } catch (RuntimeException e) {
                    throw new RuntimeException(jSONObject.toJSONString(), e);
                }
            }
        }
    }

    private void initEventManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd3efea", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                DojoPageContext dojoPageContext = this.mDojoPageContextRef.get();
                this.mEventManager = dojoPageContext.eventManager;
                Map<Class, Object> map = dojoPageContext.injectServicePool;
                this.mEventManager.registerService(PageService.class, new PageService(dojoPageContext.activity));
                this.mEventManager.registerService(UserTrackService.class, new UserTrackServiceImpl(dojoPageContext.activity, this.mDojoContext.identifier));
                this.mDisposeService = new DisposeServiceImpl();
                this.mEventManager.registerService(DisposeService.class, this.mDisposeService);
                if (map != null) {
                    for (Map.Entry<Class, Object> entry : map.entrySet()) {
                        this.mEventManager.registerService(entry.getKey(), entry.getValue());
                    }
                }
                this.mEventManager.init(this.mActionDispatcher, this.mCommandHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void executeSnapshotEvent(WrapperEvent wrapperEvent, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140d9031", new Object[]{this, wrapperEvent, map});
        } else {
            executeWithInit(wrapperEvent, null, map);
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                if (this.mDisposeService != null) {
                    Logger.e("EventManager", "dispose mDisposeService");
                    this.mDisposeService.dispose();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onExecute(SharedState sharedState, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652d32d4", new Object[]{this, sharedState, event});
        } else if (event instanceof WrapperEvent) {
            executeWithInit((WrapperEvent) event, sharedState, null);
        } else {
            throw new IllegalArgumentException(JSON.toJSONString(event));
        }
    }

    private void executeImpl(WrapperEvent wrapperEvent, SharedState sharedState, Map<String, Object> map) {
        ArrayList arrayList;
        EventHandleRuntime eventHandleRuntime;
        LayoutInfo layoutInfo;
        Map<String, List<EventHandlerItem>> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("565d3841", new Object[]{this, wrapperEvent, sharedState, map});
        } else if (wrapperEvent.getAuraEventHandler() != null) {
            try {
                handleAura(wrapperEvent.getAuraEventHandler(), wrapperEvent);
            } catch (JSONException | ConcurrentModificationException e) {
                if (!ApplicationUtil.isDebug()) {
                    IErrorReportProvider iErrorReportProvider = (IErrorReportProvider) GlobalContainer.getInstance().get(IErrorReportProvider.class);
                    if (iErrorReportProvider != null) {
                        iErrorReportProvider.report("Aura", "handleAuraEvent", "-1", Log.getStackTraceString(e), null);
                        return;
                    }
                    return;
                }
                throw e;
            }
        } else {
            ViewObject viewObject = wrapperEvent.getViewObject();
            List<EventHandlerItem> list = (viewObject == null || (layoutInfo = viewObject.info) == null || (map2 = layoutInfo.eventHandler) == null) ? null : map2.get(wrapperEvent.getName());
            if (list != null) {
                for (EventHandlerItem eventHandlerItem : list) {
                    if (sharedState != null) {
                        eventHandleRuntime = LayoutProtocol.buildEventRuntime(eventHandlerItem, sharedState, viewObject.indexs, viewObject.bindData);
                    } else {
                        eventHandleRuntime = map != null ? LayoutProtocol.buildEventRuntimeWithExpressionMap(eventHandlerItem, map, viewObject.indexs, this.mIsEnableSnapshotEventDataMakeup) : null;
                    }
                    if (eventHandleRuntime != null) {
                        this.mEventManager.handle(wrapperEvent, eventHandleRuntime);
                    }
                }
            }
            if (ListActions.EVENT_EXPOSED.equals(wrapperEvent.getName())) {
                arrayList = new ArrayList();
                if (wrapperEvent.getData() instanceof Map) {
                    for (ViewObject viewObject2 : (List) ((Map) wrapperEvent.getData()).get("viewObjects")) {
                        UserTrack bindUserTrack = LayoutProtocol.bindUserTrack(viewObject2, wrapperEvent, sharedState, this.mDojoContext.configInfo.layout, false);
                        if (bindUserTrack != null) {
                            arrayList.add(bindUserTrack);
                        }
                    }
                }
            } else {
                arrayList = new ArrayList(1);
                UserTrack bindUserTrack2 = LayoutProtocol.bindUserTrack(viewObject, wrapperEvent, sharedState, this.mDojoContext.configInfo.layout, false);
                if (bindUserTrack2 != null) {
                    arrayList.add(bindUserTrack2);
                }
            }
            if (!(this.mEventManager.getServicePool() == null || this.mEventManager.getServicePool().service(UserTrackService.class) == null)) {
                ((UserTrackService) this.mEventManager.getServicePool().service(UserTrackService.class)).userTrack(arrayList);
            }
        }
    }
}
