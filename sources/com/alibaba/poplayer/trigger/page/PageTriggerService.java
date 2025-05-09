package com.alibaba.poplayer.trigger.page;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.BaseTriggerService;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import tb.abd;
import tb.d0j;
import tb.hst;
import tb.lgu;
import tb.nsu;
import tb.pf4;
import tb.qtv;
import tb.t2o;
import tb.t4f;
import tb.wdm;

/* compiled from: Taobao */
@Monitor.TargetClass
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PageTriggerService extends BaseTriggerService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_SCHEME = "poplayer://";
    private static final String TAG = PageTriggerService.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final PageTriggerService f2536a = new PageTriggerService();

        static {
            t2o.a(626000032);
        }

        public static /* synthetic */ PageTriggerService a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageTriggerService) ipChange.ipc$dispatch("d8e68587", new Object[0]);
            }
            return f2536a;
        }
    }

    static {
        t2o.a(626000031);
    }

    private Event createPopHubEvent(BaseConfigItem baseConfigItem, String str, JSONObject jSONObject, String str2, String str3, String str4, String str5, abd abdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("9f35926f", new Object[]{this, baseConfigItem, str, jSONObject, str2, str3, str4, str5, abdVar});
        }
        Event event = new Event("PopHubUniUri", baseConfigItem, str2, "", str3, str4, str5, 5);
        event.setAugeCode(str);
        event.setUcpBackFlowTrackInfo(jSONObject);
        event.setProcessCallBack(abdVar);
        return event;
    }

    public static PageTriggerService instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageTriggerService) ipChange.ipc$dispatch("c0997382", new Object[0]);
        }
        return a.a();
    }

    public static /* synthetic */ Object ipc$super(PageTriggerService pageTriggerService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 686773262) {
            super.pageDestroy((Activity) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1612673119) {
            super.pageClean((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/poplayer/trigger/page/PageTriggerService");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadLocalFiles$9(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309ccb25", new Object[]{this, event});
            return;
        }
        try {
            t4f.a().e();
            accept(event);
        } catch (Throwable th) {
            wdm.h("PopLayer.setup.newReadAndSetup.error.", th);
        }
    }

    private boolean loadLocalFiles(final Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56af81d7", new Object[]{this, event})).booleanValue();
        }
        try {
            if (!t4f.a().c()) {
                hst.b(new Runnable() { // from class: tb.tol
                    @Override // java.lang.Runnable
                    public final void run() {
                        PageTriggerService.this.lambda$loadLocalFiles$9(event);
                    }
                });
                return true;
            }
        } catch (Throwable th) {
            wdm.h("PageTriggerService.loadLocalFiles.error.", th);
        }
        return false;
    }

    private void trackOnEventAccept(Event event) {
        PreDealCustomEventParams preDealCustomEventParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f325d9", new Object[]{this, event});
        } else if (event.source == 4 && (preDealCustomEventParams = event.getPreDealCustomEventParams()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewCreated", (Object) "false");
            jSONObject.put("displayed", (Object) "false");
            nsu.k(0, "debug", event, preDealCustomEventParams.getIndexIds(), jSONObject, "PopEventAccept", "");
        }
    }

    @Override // com.alibaba.poplayer.trigger.BaseTriggerService
    public void initService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ee618c", new Object[]{this});
        } else {
            this.mTimerMgr = new lgu(this);
        }
    }

    @Override // com.alibaba.poplayer.trigger.BaseTriggerService
    public void pageClean(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601f705f", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        try {
            super.pageClean(str, str2, z);
            this.mTimerMgr.b(str, false);
            clean(str, str2, z, false);
        } catch (Throwable th) {
            wdm.h("PageTriggerService.pageClean.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.trigger.BaseTriggerService
    public void pageDestroy(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ef540e", new Object[]{this, activity, str});
            return;
        }
        try {
            super.pageDestroy(activity, str);
            this.mTimerMgr.b(str, false);
            clean(str, InternalTriggerController.getActivityKeyCode(activity), true, false);
        } catch (Throwable th) {
            wdm.h("PageTriggerService.pageDestroy.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.trigger.BaseTriggerService
    public void passiveAccept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2403c16", new Object[]{this});
        } else {
            activeAccept(InternalTriggerController.getCurUri(), InternalTriggerController.getCurActivityInfo());
        }
    }

    @Override // com.alibaba.poplayer.trigger.BaseTriggerService
    public void restartTimer(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c868f7", new Object[]{this, event});
            return;
        }
        String curKeyCode = InternalTriggerController.getCurKeyCode();
        if (2 != event.source || TextUtils.isEmpty(curKeyCode) || TextUtils.isEmpty(event.attachKeyCode) || !event.attachKeyCode.equals(curKeyCode)) {
            wdm.d("%s activeAccept Useless event,eventKeyCode:%s,curKeyCode:%s.", TAG, event.attachKeyCode, curKeyCode);
            return;
        }
        pf4 findConfigs = PopLayer.getReference().getConfigMgr().findConfigs(event, getPageSwitchOriginRequestConfigs(event), false);
        if (findConfigs != null) {
            wdm.d("PageTriggerService.findValidConfigs:started Count:{%s},unstarted Count:{%s}.", Integer.valueOf(findConfigs.f26058a.size()), Integer.valueOf(findConfigs.e.size()));
            if (!findConfigs.e.isEmpty()) {
                this.mTimerMgr.c(event, findConfigs.e);
            }
        }
    }

    public void triggerAccept(String str, String str2, String str3, abd abdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aef18d", new Object[]{this, str, str2, str3, abdVar});
            return;
        }
        Event createEvent = createEvent(str, str2, str3, InternalTriggerController.getCurKeyCode(), InternalTriggerController.getCurUri(), InternalTriggerController.getCurActivityInfo(), abdVar);
        wdm.d("PageTriggerService.triggerAccept.create Event=" + createEvent, new Object[0]);
        accept(createEvent);
    }

    public Event preDealCustomAccept(PreDealCustomEventParams preDealCustomEventParams) {
        String str;
        Set<String> uriSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("d5e37cb7", new Object[]{this, preDealCustomEventParams});
        }
        if (preDealCustomEventParams == null || (uriSet = preDealCustomEventParams.getUriSet()) == null || uriSet.isEmpty()) {
            str = "";
        } else {
            str = (String) new ArrayList(uriSet).get(0);
        }
        Event event = new Event(str, InternalTriggerController.getCurKeyCode(), InternalTriggerController.getCurUri(), InternalTriggerController.getCurActivityInfo(), preDealCustomEventParams);
        wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "preDealCustomAccept.event=" + event);
        accept(event);
        return event;
    }

    @Override // com.alibaba.poplayer.trigger.BaseTriggerService
    public void accept(Event event) {
        abd processCallBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8144b989", new Object[]{this, event});
        } else if (loadLocalFiles(event)) {
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "PageTriggerService.accept.loadLocalFiles.return.");
        } else {
            trackOnEventAccept(event);
            long currentTimeMillis = System.currentTimeMillis();
            String curKeyCode = InternalTriggerController.getCurKeyCode();
            if (TextUtils.isEmpty(event.attachKeyCode) || TextUtils.isEmpty(curKeyCode) || !event.attachKeyCode.equals(curKeyCode)) {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "PageTriggerService.accept.activeAccept Useless event,eventKeyCode=" + event.attachKeyCode + ",curKeyCode=" + curKeyCode);
                return;
            }
            pf4 findConfigs = PopLayer.getReference().getConfigMgr().findConfigs(event, getPageSwitchOriginRequestConfigs(event), true);
            if (findConfigs == null) {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "PageTriggerService.accept.findConfigs=null");
                abd processCallBack2 = event.getProcessCallBack();
                if (processCallBack2 != null) {
                    processCallBack2.c("catchError");
                    return;
                }
                return;
            }
            if (!findConfigs.f26058a.isEmpty() || !findConfigs.e.isEmpty()) {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "PageTriggerService.findAllValidConfigs:started Count=" + findConfigs.f26058a.size() + ",unstarted Count=" + findConfigs.e.size());
            }
            nsu.h(0, "debug", event, findConfigs.f26058a, "PopConfigCheckSuccess", "");
            trackOnConfigIsExist(event, findConfigs);
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "PageTriggerService.accept.tryOpenRequest.cos time ::: " + (System.currentTimeMillis() - currentTimeMillis));
            tryOpenRequest(event.attachKeyCode, event, findConfigs);
            if (2 == event.source && !findConfigs.e.isEmpty()) {
                this.mTimerMgr.c(event, findConfigs.e);
            }
            if (findConfigs.a() && (processCallBack = event.getProcessCallBack()) != null) {
                processCallBack.c("configNotExist");
            }
        }
    }

    @Override // com.alibaba.poplayer.trigger.BaseTriggerService
    public void activeAccept(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebbfc9", new Object[]{this, str, str2});
            return;
        }
        Event createEvent = createEvent(str, str2, "", InternalTriggerController.getCurKeyCode(), InternalTriggerController.getCurUri(), InternalTriggerController.getCurActivityInfo(), null);
        wdm.d("PageTriggerService.create Event:{%s}.", createEvent);
        if (handleEventHanging(createEvent)) {
            wdm.g("pageLifeCycle", "", "PageTriggerService.hangingEvent.");
            return;
        }
        if (Event.b.a(createEvent.source)) {
            this.mTriggerService.a(createEvent);
        } else {
            this.mTriggerService.c();
            this.mTriggerService.a(createEvent);
        }
        accept(createEvent);
    }

    public void popHubAccept(BaseConfigItem baseConfigItem, String str, String str2, JSONObject jSONObject, abd abdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7b17a1", new Object[]{this, baseConfigItem, str, str2, jSONObject, abdVar});
            return;
        }
        Event createPopHubEvent = createPopHubEvent(baseConfigItem, str2, jSONObject, str, InternalTriggerController.getCurKeyCode(), InternalTriggerController.getCurUri(), InternalTriggerController.getCurActivityInfo(), abdVar);
        wdm.g(wdm.CATEGORY_TRIGGER_EVENT, baseConfigItem.indexID, "popHubAccept.event");
        accept(createPopHubEvent);
    }

    private void trackOnConfigIsExist(Event event, pf4 pf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8df233", new Object[]{this, event, pf4Var});
        } else if (2 != event.source) {
            if (pf4Var.a()) {
                if (event.source == 4) {
                    Iterator it = ((ArrayList) pf4Var.f).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        try {
                            com.alibaba.poplayer.trigger.a aVar = new com.alibaba.poplayer.trigger.a(event, str, PopLayer.getReference().internalGetCurrentActivity(), this);
                            OnePopModule k = aVar.k();
                            k.l0 = PopLayer.getReference().getCurrentTimeStamp(false);
                            k.c0 = OnePopModule.OnePopLoseReasonCode.ConfigCheckFail;
                            k.d0 = "configNotExist";
                            d0j.h(aVar);
                            qtv.g(event, str, false);
                        } catch (Throwable th) {
                            wdm.h("PageTriggerService.trackConfigNotExist.error", th);
                        }
                    }
                    return;
                }
                qtv.g(event, "", false);
            } else if (event.source == 4) {
                Iterator it2 = ((ArrayList) pf4Var.g).iterator();
                while (it2.hasNext()) {
                    qtv.g(event, (String) it2.next(), true);
                }
            } else {
                qtv.g(event, "", true);
            }
        }
    }

    private Event createEvent(String str, String str2, String str3, String str4, String str5, String str6, abd abdVar) {
        String str7;
        int i = 3;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("2e9bbe27", new Object[]{this, str, str2, str3, str4, str5, str6, abdVar});
        }
        Event event = new Event(str, null, str2, str3, str4, str5, str6, 2);
        int indexOf = event.uri.indexOf(63);
        boolean z2 = -1 == indexOf;
        if (z2) {
            str7 = event.uri;
        } else {
            str7 = event.uri.substring(0, indexOf);
        }
        if (!event.uri.startsWith(PAGE_SCHEME)) {
            i = 2;
        } else if (!Event.isDirectlyOpen(event.uri)) {
            i = 1;
        }
        if (i != event.source) {
            z = false;
        }
        if (!z2 || !z) {
            if (z) {
                str7 = event.uri;
            }
            event = new Event(str7, null, event.param, str3, str4, str5, str6, i);
        }
        event.originUri = str;
        event.setProcessCallBack(abdVar);
        return event;
    }
}
