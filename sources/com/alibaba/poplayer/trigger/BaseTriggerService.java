package com.alibaba.poplayer.trigger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.info.mock.PopLayerMockManager;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.d;
import com.alibaba.poplayer.norm.IUserCheckRequestListener;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseTriggerService;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.utils.Monitor;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.auv;
import tb.d0j;
import tb.fig;
import tb.kgu;
import tb.lgu;
import tb.lto;
import tb.nsu;
import tb.rjl;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
@Monitor.TargetClass
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BaseTriggerService implements PopRequest.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIFE_CYCLE_PAUSE = "pause";
    public static final String LIFE_CYCLE_RESUME = "resume";
    public static final String LIFE_CYCLE_START = "start";
    public static final String LIFE_CYCLE_STOP = "stop";
    public lgu mTimerMgr;
    public kgu mTriggerService = kgu.f();
    private final Map<String, List<a>> mRequestMap = new ConcurrentHashMap();
    private final List<a> mAppHangingRequests = new CopyOnWriteArrayList();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    static {
        t2o.a(626000005);
        t2o.a(625999956);
    }

    public BaseTriggerService() {
        initService();
    }

    private void destroyPopLayerView(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f04bf2", new Object[]{this, popRequest});
        } else if (popRequest != null && popRequest.i() != null && (popRequest.i() instanceof PopLayerBaseView)) {
            ((PopLayerBaseView) popRequest.i()).destroyView();
        }
    }

    private void doLoadView(a aVar, Context context, PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad85a10c", new Object[]{this, aVar, context, popLayerBaseView});
            return;
        }
        OnePopModule k = aVar.k();
        if (k.p0 > 0) {
            k.J = (SystemClock.elapsedRealtime() - k.p0) + "";
        }
        try {
            popLayerBaseView.init(context, aVar);
        } catch (Throwable th) {
            wdm.h("PopLayerView init fail.", th);
        }
        d.t().e(aVar);
        try {
            popLayerBaseView.onViewAdded(context);
        } catch (Throwable th2) {
            wdm.h("PopLayerView onViewAdded fail.", th2);
        }
        View i = aVar.i();
        if (rjl.a(aVar.K()) && i != null) {
            ((PopLayerBaseView) i).displayMe();
        }
    }

    private ArrayList<a> getAllRequestsByActivity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("63d98ee0", new Object[]{this, str});
        }
        ArrayList<a> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : this.mRequestMap.keySet()) {
            if (str2.equals(str)) {
                arrayList.addAll(this.mRequestMap.get(str2));
            } else if (str2.startsWith(str) && InternalTriggerController.isFragmentKeyCode(str2)) {
                arrayList.addAll(this.mRequestMap.get(str2));
            }
        }
        return arrayList;
    }

    private a getCurRequestedObject(List<a> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6d6e668f", new Object[]{this, list, aVar});
        }
        if (!(list == null || list.isEmpty() || aVar == null)) {
            for (a aVar2 : list) {
                BaseConfigItem K = aVar2.K();
                if (!TextUtils.isEmpty(K.indexID)) {
                    if (K.indexID.equals(aVar.K().indexID)) {
                        return aVar2;
                    }
                } else if (K.uuid.equals(aVar.K().uuid)) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    private a getOriginEmbedRequest(ArrayList<a> arrayList, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("860b8019", new Object[]{this, arrayList, aVar});
        }
        if (arrayList != null && !arrayList.isEmpty() && aVar != null && aVar.s()) {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.z()) {
                    BaseConfigItem K = next.K();
                    if (!TextUtils.isEmpty(K.indexID)) {
                        if (K.indexID.equals(aVar.K().indexID)) {
                            return next;
                        }
                    } else if (K.uuid.equals(aVar.K().uuid)) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    private a getOriginRequest(ArrayList<a> arrayList, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ca02b47a", new Object[]{this, arrayList, aVar});
        }
        if (!(arrayList == null || arrayList.isEmpty() || aVar == null)) {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                a next = it.next();
                BaseConfigItem K = next.K();
                if (!TextUtils.isEmpty(K.indexID)) {
                    if (K.indexID.equals(aVar.K().indexID)) {
                        return next;
                    }
                } else if (K.uuid.equals(aVar.K().uuid)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createLayerAndAddRequest$6(a aVar, Context context, PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a955f943", new Object[]{this, aVar, context, popLayerBaseView});
        } else {
            doLoadView(aVar, context, popLayerBaseView);
        }
    }

    public abstract void accept(Event event);

    public abstract void activeAccept(String str, String str2);

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
        if (3 == r13.L().source) goto L_0x0112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void clean(java.lang.String r17, java.lang.String r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.trigger.BaseTriggerService.clean(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        for (String str : this.mRequestMap.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                d.t().B(new ArrayList<>(this.mRequestMap.get(str)));
            }
        }
        this.mRequestMap.clear();
        d.t().B(new ArrayList<>(this.mAppHangingRequests));
        this.mAppHangingRequests.clear();
    }

    public List<a> getCurPagePopedRequest() {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("697196c8", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            String curKeyCode = InternalTriggerController.getCurKeyCode();
            if (!TextUtils.isEmpty(curKeyCode) && (list = this.mRequestMap.get(curKeyCode)) != null) {
                for (a aVar : list) {
                    if (aVar != null && aVar.z()) {
                        arrayList.add(aVar);
                    }
                }
            }
        } catch (Throwable th) {
            wdm.h("getCurPagePopedRequest", th);
        }
        return arrayList;
    }

    public synchronized List<a> getCurPageRequestingRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aaee059d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String curKeyCode = InternalTriggerController.getCurKeyCode();
        if (TextUtils.isEmpty(curKeyCode)) {
            return arrayList;
        }
        List<a> list = this.mRequestMap.get(curKeyCode);
        if (list != null) {
            for (a aVar : list) {
                if (aVar != null && !aVar.z()) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    public synchronized a getCurRequestingRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1d076200", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            String curKeyCode = InternalTriggerController.getCurKeyCode();
            if (TextUtils.isEmpty(curKeyCode)) {
                return null;
            }
            List<a> list = this.mRequestMap.get(curKeyCode);
            if (list == null) {
                return null;
            }
            for (a aVar : list) {
                BaseConfigItem K = aVar.K();
                if (!(TextUtils.isEmpty(K.indexID) || !K.indexID.equals(str) || aVar.z())) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public List<String> getPagePreCheckGroupIndexIds(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627b9271", new Object[]{this, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                List<a> list = this.mRequestMap.get(str);
                if (list != null) {
                    for (a aVar : list) {
                        if (aVar != null && str2.equals(aVar.K().preCheckGroupId) && !aVar.z()) {
                            arrayList.add(aVar.K().indexID);
                        }
                    }
                }
            } catch (Throwable th) {
                wdm.h("getPagePreCheckGroupRequest.error.", th);
            }
        }
        return arrayList;
    }

    public List<a> getPagePreCheckGroupRequests(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cf335173", new Object[]{this, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                List<a> list = this.mRequestMap.get(str);
                if (list != null) {
                    for (a aVar : list) {
                        if (aVar != null && str2.equals(aVar.K().preCheckGroupId) && !aVar.z()) {
                            arrayList.add(aVar);
                        }
                    }
                }
            } catch (Throwable th) {
                wdm.h("getPagePreCheckGroupRequests.error.", th);
            }
        }
        return arrayList;
    }

    public long getPageSwitchTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af736c58", new Object[]{this})).longValue();
        }
        long j = 0;
        for (Event event : this.mTriggerService.d()) {
            if (event.source == 2) {
                j = event.getCreateTimeStamp();
            }
        }
        return j;
    }

    public abstract void initService();

    @Override // com.alibaba.poplayer.layermanager.PopRequest.c
    public void onEnqueue(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3785b3c", new Object[]{this, popRequest});
        } else if (popRequest != null) {
            try {
                OnePopModule k = popRequest.k();
                k.c0 = OnePopModule.OnePopLoseReasonCode.LMLifeCycleEnqueue;
                if (k.n0 > 0) {
                    k.H = String.valueOf(SystemClock.elapsedRealtime() - k.n0);
                }
                k.o0 = SystemClock.elapsedRealtime();
                String P = a.P(popRequest);
                wdm.f("pageLifeCycle", P, "onReady.enqueue. In Layer:" + popRequest.j());
                HashMap hashMap = new HashMap();
                hashMap.put("pageOpenEvent", "onReady.enqueue");
                hashMap.put("uuid", a.R(popRequest));
                auv.a().d("pageLifeCycle", InternalTriggerController.getCurUri(), a.J(popRequest), hashMap);
            } catch (Throwable th) {
                wdm.h("BaseTriggerService.onEnqueue.error.", th);
            }
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.b
    public void onForceRemoved(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59265c7", new Object[]{this, popRequest});
            return;
        }
        try {
            PopLayer.getReference().getFaceAdapter().cancelPopCheckRequest(popRequest);
        } catch (Throwable th) {
            wdm.h("onForceRemoved.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.b
    public void onRecovered(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398fb537", new Object[]{this, popRequest});
        } else if (popRequest != null) {
            try {
                if (PopLayerMockManager.instance().isConstraintMocking()) {
                    PopLayerMockManager.instance().addMockCheckedIndexID(((a) popRequest).K().indexID);
                    if (PopLayerMockManager.instance().isConstraintMockingDone()) {
                        PopLayer.getReference().getFaceAdapter().doneConstraintMockRequest();
                        PopLayerMockManager.instance().clearMockCheckInfo();
                    }
                }
            } catch (Throwable th) {
                wdm.h("onRecovered.check.isConstraintMocking.error.{uuid:" + a.R(popRequest) + "}", th);
            }
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.c
    public void onRemoved(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deee9f94", new Object[]{this, popRequest});
        } else if (popRequest instanceof a) {
            try {
                OnePopModule k = popRequest.k();
                if (PopLayer.getReference().getFaceAdapter().cancelPopCheckRequest(popRequest) && !k.B.equals("true") && !k.C.equals("true")) {
                    k.K = (SystemClock.elapsedRealtime() - k.q0) + "";
                    k.c0 = OnePopModule.OnePopLoseReasonCode.MtopPreCheckCancel;
                    d0j.h((a) popRequest);
                }
                if (k.B.equals("false") && k.A.equals("true") && k.p0 > 0) {
                    k.J = (SystemClock.elapsedRealtime() - k.p0) + "";
                }
            } catch (Throwable th) {
                wdm.h("onRemoved.error.", th);
            }
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.b
    public void onSuspended(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b5ec0f", new Object[]{this, popRequest});
        }
    }

    public void pageClean(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601f705f", new Object[]{this, str, str2, new Boolean(z)});
        }
    }

    public void pageDestroy(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ef540e", new Object[]{this, activity, str});
        }
    }

    public abstract void passiveAccept();

    public void reStartCurPageTimerEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ced225", new Object[]{this});
            return;
        }
        wdm.d("%s: restart current page switch event.", getClass().getSimpleName());
        for (Event event : this.mTriggerService.d()) {
            if (event.source == 2) {
                restartTimer(event);
            }
        }
    }

    public void removeRequest(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed71acfe", new Object[]{this, popRequest});
            return;
        }
        d.t().A(popRequest);
        destroyPopLayerView(popRequest);
        popRequest.E(null);
    }

    public abstract void restartTimer(Event event);

    public void stopAllTimerEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7bb206", new Object[]{this});
            return;
        }
        this.mTimerMgr.b(InternalTriggerController.getCurKeyCode(), true);
        wdm.d("%s: activity pause,stop all timer.", getClass().getSimpleName());
    }

    public void updateWhenConfigChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f82336", new Object[]{this});
            return;
        }
        clean(InternalTriggerController.getCurKeyCode(), InternalTriggerController.getCurActivityKeyCode(), false, true);
        List<Event> d = this.mTriggerService.d();
        if (!d.isEmpty()) {
            for (Event event : d) {
                if (event.source == 2) {
                    accept(event);
                }
            }
        }
    }

    private void createLayerAndAddRequest(PopRequest popRequest) {
        final PopLayerBaseView popLayerBaseView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54afb883", new Object[]{this, popRequest});
        } else if (popRequest instanceof a) {
            final a aVar = (a) popRequest;
            final Activity c = popRequest.c();
            if (c == null) {
                popRequest.k().c0 = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
                popRequest.k().d0 = "initErrorContextNull";
                removeRequest(popRequest);
                wdm.d("createLayerAndAddRequest fail.Removed.", new Object[0]);
                return;
            }
            if (aVar.i() == null) {
                popLayerBaseView = fig.c().a(c, aVar.K().type, aVar);
                if (popLayerBaseView == null) {
                    popRequest.k().c0 = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
                    popRequest.k().d0 = "initError";
                    removeRequest(popRequest);
                    wdm.d("createLayerAndAddRequest fail.Create layer Fail.Removed.", new Object[0]);
                    return;
                }
                aVar.E(popLayerBaseView);
                popLayerBaseView.setPopRequest(aVar);
            } else {
                popLayerBaseView = (PopLayerBaseView) aVar.i();
            }
            if (aVar.K().viewLoadDelayTime > 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.m22
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseTriggerService.this.lambda$createLayerAndAddRequest$6(aVar, c, popLayerBaseView);
                    }
                }, aVar.K().viewLoadDelayTime * 1000);
                aVar.k().p0 = SystemClock.elapsedRealtime();
                return;
            }
            doLoadView(aVar, c, popLayerBaseView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$7(a aVar, Map map, boolean z, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42cb48a", new Object[]{this, aVar, map, new Boolean(z), onePopLoseReasonCode, str, str2});
            return;
        }
        try {
            wdm.d("startPopCheckRequest.FaceAdapter.sendUserCheckRequest.handler.UiThread.", new Object[0]);
            if (aVar.k().r0) {
                OnePopModule k = aVar.k();
                k.K = (SystemClock.elapsedRealtime() - aVar.k().q0) + "";
            }
            aVar.F(map);
            if (z) {
                aVar.k().A = "true";
                createLayerAndAddRequest(aVar);
                return;
            }
            aVar.k().A = "false";
            aVar.k().c0 = onePopLoseReasonCode;
            aVar.k().d0 = str;
            aVar.k().e0 = str2;
            if (onePopLoseReasonCode == OnePopModule.OnePopLoseReasonCode.MtopPreCheckNoPop) {
                d0j.h(aVar);
            }
            if (onePopLoseReasonCode == OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail) {
                d0j.h(aVar);
                d0j.j(aVar);
            }
            removeRequest(aVar);
        } catch (Throwable th) {
            wdm.h("startPopCheckRequest.onFinished.postMainThread.run.error", th);
        }
    }

    private void startPopCheckRequest(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b615cb90", new Object[]{this, aVar});
            return;
        }
        try {
            PopLayer.getReference().getFaceAdapter().preparePopCheckRequest(aVar);
        } catch (Throwable th) {
            wdm.h("startPopCheckRequest.preparePopCheckRequest.error", th);
        }
        if (TextUtils.isEmpty(aVar.K().popPreCheckParams)) {
            aVar.k().E = "skip";
            aVar.k().A = "true";
            createLayerAndAddRequest(aVar);
            return;
        }
        aVar.k().q0 = SystemClock.elapsedRealtime();
        aVar.k().r0 = true;
        final PopRequest.Status o = aVar.o();
        if (!PopLayer.getReference().getFaceAdapter().startPopCheckRequest(aVar, new IUserCheckRequestListener() { // from class: tb.l22
            @Override // com.alibaba.poplayer.norm.IUserCheckRequestListener
            public final void onFinished(boolean z, String str, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str2, String str3, Map map) {
                BaseTriggerService.this.lambda$startPopCheckRequest$8(aVar, o, z, str, onePopLoseReasonCode, str2, str3, map);
            }
        })) {
            aVar.k().A = "true";
            createLayerAndAddRequest(aVar);
        }
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest.b
    public void onReady(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b12e57", new Object[]{this, popRequest});
        } else if (popRequest instanceof a) {
            try {
                if (PopLayerMockManager.instance().isConstraintMocking() && !PopLayerMockManager.instance().isConstraintMockingForceCheck()) {
                    PopLayerMockManager.instance().addMockCheckedIndexID(((a) popRequest).K().indexID);
                    if (PopLayerMockManager.instance().isConstraintMockingDone()) {
                        PopLayer.getReference().getFaceAdapter().doneConstraintMockRequest();
                        PopLayerMockManager.instance().clearMockCheckInfo();
                    }
                }
            } catch (Throwable th) {
                wdm.h("onReady.check.isConstraintMocking.error.{uuid:" + a.R(popRequest) + "}", th);
            }
            try {
                OnePopModule k = popRequest.k();
                k.y = "true";
                if (k.n0 > 0 && TextUtils.isEmpty(k.H)) {
                    k.H = String.valueOf(SystemClock.elapsedRealtime() - k.n0);
                }
                k.c0 = null;
                if (k.o0 == 0) {
                    k.I = "0";
                }
            } catch (Throwable th2) {
                wdm.h("BaseTriggerService.onReady.track.error.", th2);
            }
            a aVar = (a) popRequest;
            nsu.i(0, "debug", aVar, "PopLMCheckSuccess", "");
            startPopCheckRequest(aVar);
        }
    }

    private void removeRequestsByActivity(String str, String str2, boolean z, List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfda83bc", new Object[]{this, str, str2, new Boolean(z), list});
        } else if (list != null) {
            try {
                if (!list.isEmpty()) {
                    if (z) {
                        if (!TextUtils.isEmpty(str)) {
                            for (String str3 : this.mRequestMap.keySet()) {
                                if (!TextUtils.isEmpty(str3)) {
                                    List<a> list2 = this.mRequestMap.get(str3);
                                    if (str3.equals(str)) {
                                        if (list2 != null) {
                                            list2.removeAll(list);
                                        }
                                    } else if (str3.startsWith(str) && InternalTriggerController.isFragmentKeyCode(str3) && list2 != null) {
                                        list2.removeAll(list);
                                    }
                                    if (list2 != null && list2.isEmpty()) {
                                        this.mRequestMap.remove(str3);
                                    }
                                }
                            }
                        } else {
                            for (String str4 : this.mRequestMap.keySet()) {
                                if (!TextUtils.isEmpty(str4)) {
                                    List<a> list3 = this.mRequestMap.get(str4);
                                    if (list3 != null) {
                                        list3.removeAll(list);
                                    }
                                    if (list3 != null && list3.isEmpty()) {
                                        this.mRequestMap.remove(str4);
                                    }
                                }
                            }
                        }
                    } else if (!TextUtils.isEmpty(str2)) {
                        List<a> list4 = this.mRequestMap.get(str2);
                        if (list4 != null) {
                            list4.removeAll(list);
                        }
                        if (list4 != null && list4.isEmpty()) {
                            this.mRequestMap.remove(str2);
                        }
                    }
                    for (a aVar : list) {
                        if (aVar != null && (aVar.x() || aVar.v())) {
                            for (String str5 : this.mRequestMap.keySet()) {
                                if (!TextUtils.isEmpty(str5)) {
                                    this.mRequestMap.get(str5).remove(aVar);
                                }
                            }
                        }
                    }
                    wdm.d("removeRequestsByActivity requestMap:%s", this.mRequestMap);
                }
            } catch (Throwable th) {
                wdm.h("removeRequestsByActivity.error.", th);
            }
        }
    }

    private void trackConfigCheckSuccess(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30056e60", new Object[]{this, list});
        } else if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                a aVar = list.get(i);
                if (aVar != null) {
                    aVar.k().x = "true";
                }
            }
        }
    }

    public JSONObject getCurPageRequestInfo() {
        List<a> list;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8b92930b", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String curKeyCode = InternalTriggerController.getCurKeyCode();
            if (!TextUtils.isEmpty(curKeyCode) && (list = this.mRequestMap.get(curKeyCode)) != null) {
                for (a aVar : list) {
                    if (aVar != null && aVar.o() == PopRequest.Status.SHOWING) {
                        i++;
                        jSONObject2.put(aVar.j(), (Object) Integer.valueOf(jSONObject2.getIntValue(aVar.j()) + 1));
                    }
                }
            }
            jSONObject.put("completeCount", (Object) Integer.valueOf(i));
            jSONObject.put("completeLayerType", (Object) jSONObject2);
            jSONObject.put("nativeUri", (Object) InternalTriggerController.getCurUri());
            jSONObject.put("nativeUrl", (Object) InternalTriggerController.getCurActivityInfo());
        } catch (Throwable th) {
            wdm.h("getCurPageRequestInfo.error", th);
        }
        return jSONObject;
    }

    public boolean handleEventHanging(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54272b03", new Object[]{this, event})).booleanValue();
        }
        if (event != null && !TextUtils.isEmpty(event.originUri) && Event.b.a(event.source) && event.originUri.contains("__popPageUris") && event.originUri.contains("__popEndTime")) {
            try {
                Uri parse = Uri.parse(event.originUri);
                String queryParameter = parse.getQueryParameter("__popPageUris");
                String queryParameter2 = parse.getQueryParameter("__popPageParamContains");
                String queryParameter3 = parse.getQueryParameter("__popEndTime");
                if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter3)) {
                    try {
                        long parseLong = Long.parseLong(queryParameter3) * 1000;
                        if (PopLayer.getReference().getCurrentTimeStamp() > parseLong) {
                            return true;
                        }
                        try {
                            String[] split = URLDecoder.decode(queryParameter, "utf-8").split(",");
                            if (split.length == 0) {
                                return false;
                            }
                            for (String str : split) {
                                if (str.equals(event.curPage) && lto.a(event.curPageUrl, queryParameter2)) {
                                    return false;
                                }
                            }
                            this.mTriggerService.b(new FutureEvent(event.originUri, event.param, split, queryParameter2, parseLong));
                            return true;
                        } catch (Throwable unused) {
                            wdm.d("isEventShouldHanging.decode uri failed.", new Object[0]);
                            return false;
                        }
                    } catch (Throwable unused2) {
                        wdm.d("isEventShouldHanging.parse popEndTime failed.", new Object[0]);
                    }
                }
                return false;
            } catch (Throwable th) {
                wdm.h("isEventShouldHanging.parseUri.error.", th);
            }
        }
        return false;
    }

    public void reTriggerFutureBroadcastEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2084cea8", new Object[]{this});
            return;
        }
        try {
            for (FutureEvent futureEvent : this.mTriggerService.e()) {
                if (futureEvent != null) {
                    if (PopLayer.getReference().getCurrentTimeStamp() > futureEvent.getPopEndTimeStamp()) {
                        this.mTriggerService.g(futureEvent);
                    } else {
                        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                        String[] popPageUris = futureEvent.getPopPageUris();
                        int length = popPageUris.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                String str = popPageUris[i];
                                if (!TextUtils.isEmpty(str) && str.equals(InternalTriggerController.getCurUri()) && lto.a(futureEvent.getParam(), futureEvent.getPopPageParamContains())) {
                                    intent.removeExtra("event");
                                    intent.removeExtra("param");
                                    intent.removeExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE);
                                    intent.putExtra("event", futureEvent.getUri());
                                    intent.putExtra("param", futureEvent.getParam());
                                    intent.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "reTrigger");
                                    LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
                                    this.mTriggerService.g(futureEvent);
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            wdm.d("reTriggerFutureBroadcastEvent.error.", new Object[0]);
        }
    }

    public List<BaseConfigItem> getPageSwitchOriginRequestConfigs(Event event) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("703ca9a5", new Object[]{this, event});
        }
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Throwable th) {
            wdm.h("getPageSwitchOriginRequestConfigs.fail.", th);
        }
        if (event.source != 2 || TextUtils.isEmpty(event.attachKeyCode) || (list = this.mRequestMap.get(event.attachKeyCode)) == null) {
            return arrayList;
        }
        for (a aVar : list) {
            if (!aVar.z()) {
                arrayList.add(aVar.K());
                wdm.d("getPageSwitchOriginRequestConfigs.originRequestList.add origin config{%s}", a.P(aVar));
            } else {
                wdm.d("getPageSwitchOriginRequestConfigs.originRequestList.add origin config{%s}.isRemoved.", a.P(aVar));
            }
        }
        for (a aVar2 : this.mAppHangingRequests) {
            if (!aVar2.z()) {
                arrayList.add(aVar2.K());
                wdm.d("getPageSwitchOriginRequestConfigs.add appHangingRequest config{%s}", a.P(aVar2));
            } else {
                wdm.d("getPageSwitchOriginRequestConfigs.add appHangingRequest config{%s}.isRemoved", a.P(aVar2));
            }
        }
        return arrayList;
    }

    public void notifyShowingViewsOnActivityLifeCycle(Activity activity, String str) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2924c30d", new Object[]{this, activity, str});
            return;
        }
        ArrayList<a> allRequestsByActivity = getAllRequestsByActivity(InternalTriggerController.getActivityKeyCode(activity));
        if (!allRequestsByActivity.isEmpty()) {
            for (a aVar : allRequestsByActivity) {
                if (aVar != null) {
                    try {
                        if (aVar.o() == PopRequest.Status.SHOWING && aVar.i() != null && (aVar.i() instanceof PopLayerBaseView)) {
                            PopLayerBaseView popLayerBaseView = (PopLayerBaseView) aVar.i();
                            switch (str.hashCode()) {
                                case -934426579:
                                    if (str.equals("resume")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3540994:
                                    if (str.equals("stop")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 106440182:
                                    if (str.equals("pause")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109757538:
                                    if (str.equals("start")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                popLayerBaseView.onActivityStart();
                            } else if (c == 1) {
                                popLayerBaseView.onActivityResumed();
                            } else if (c == 2) {
                                popLayerBaseView.onActivityPaused();
                            } else if (c == 3) {
                                popLayerBaseView.onActivityStop();
                            }
                        }
                    } catch (Throwable th) {
                        wdm.h("notifyShowingViewsOnActivityResumed error", th);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List, com.alibaba.poplayer.trigger.a] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.List, com.alibaba.poplayer.trigger.a] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unknown variable types count: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void tryOpenRequest(java.lang.String r18, com.alibaba.poplayer.trigger.Event r19, tb.pf4 r20) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.trigger.BaseTriggerService.tryOpenRequest(java.lang.String, com.alibaba.poplayer.trigger.Event, tb.pf4):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPopCheckRequest$8(final a aVar, PopRequest.Status status, boolean z, String str, final OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, final String str2, final String str3, final Map map) {
        final boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb6d74c", new Object[]{this, aVar, status, new Boolean(z), str, onePopLoseReasonCode, str2, str3, map});
            return;
        }
        try {
            wdm.d("startPopCheckRequest.FaceAdapter.sendUserCheckRequest.onFinished.shouldPop=%s uuid=%s", Boolean.valueOf(z), a.R(aVar));
            if (!z) {
                aVar.k().c0 = onePopLoseReasonCode;
                aVar.k().d0 = str2;
                aVar.k().e0 = str3;
            }
            if ((!z || aVar.o() == status) && aVar.h().equals(InternalTriggerController.getCurKeyCode())) {
                z2 = z;
            } else {
                wdm.d("startPopCheckRequest.FaceAdapter.sendUserCheckRequest.onFinished.keyCode check failed!!shouldPop=%s uuid=%s", Boolean.valueOf(z), a.R(aVar));
                aVar.k().c0 = OnePopModule.OnePopLoseReasonCode.MtopPreCheckFail;
                aVar.k().d0 = LogContext.CLIENT_ENVENT_SWITCHPAGE;
                aVar.k().e0 = null;
                z2 = false;
            }
            Runnable k22Var = new Runnable() { // from class: tb.k22
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTriggerService.this.lambda$null$7(aVar, map, z2, onePopLoseReasonCode, str2, str3);
                }
            };
            if (Looper.getMainLooper() != Looper.myLooper()) {
                this.mHandler.post(k22Var);
            } else {
                k22Var.run();
            }
        } catch (Throwable th) {
            wdm.h("startPopCheckRequest.onFinished.error", th);
        }
    }
}
