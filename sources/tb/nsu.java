package tb;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nsu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRACK_TYPE_BACK_FLOW = "backflow";
    public static final String TRACK_TYPE_DEBUG = "debug";
    public static final String TRACK_TYPE_TRACK = "track";
    public static final String UCP_ACTION_CANCEL = "Cancel";
    public static final String UCP_ACTION_CLICK = "Click";
    public static final String UCP_ACTION_EXPOSE = "Expose";
    public static final int UCP_PROCESS_FINISH_FAIL = 3;
    public static final int UCP_PROCESS_FINISH_SUCCESS = 2;
    public static final int UCP_PROCESS_STEP_FAIL = 1;
    public static final int UCP_PROCESS_STEP_SUCCESS = 0;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f24931a = new AtomicBoolean(false);

    static {
        t2o.a(625999984);
    }

    public static void h(final int i, final String str, final Event event, final List<a> list, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d4f7a7", new Object[]{new Integer(i), str, event, list, str2, str3});
        } else if (list != null && !list.isEmpty() && event != null && event.source == 4) {
            wdm.d("UCPTracker.UCPProcessTrack.ucpProcess=%s.beforeRunInGlobalThread", Integer.valueOf(i));
            hst.b(new Runnable() { // from class: tb.lsu
                @Override // java.lang.Runnable
                public final void run() {
                    nsu.p(list, i, str, event, str2, str3);
                }
            });
        }
    }

    public static void i(int i, String str, a aVar, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de6a939", new Object[]{new Integer(i), str, aVar, str2, str3});
            return;
        }
        wdm.d("UCPTracker.UCPProcessTrack.ucpProcess=%s", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        h(i, str, aVar.L(), arrayList, str2, str3);
    }

    public static void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aced6555", new Object[]{aVar});
            return;
        }
        OnePopModule k = aVar.k();
        i("true".equals(k.C) ? 2 : 3, "track", aVar, k.c0.name(), String.valueOf(k.d0));
    }

    public static void k(final int i, final String str, final Event event, final Set<String> set, final JSONObject jSONObject, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b67c37b", new Object[]{new Integer(i), str, event, set, jSONObject, str2, str3});
        } else if (event != null && event.source == 4 && set != null && !set.isEmpty()) {
            hst.b(new Runnable() { // from class: tb.jsu
                @Override // java.lang.Runnable
                public final void run() {
                    nsu.q(i, set, event, str, str2, str3, jSONObject);
                }
            });
        }
    }

    public static void l(final PreDealCustomEventParams preDealCustomEventParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc1bf4b", new Object[]{preDealCustomEventParams});
        } else {
            hst.b(new Runnable() { // from class: tb.msu
                @Override // java.lang.Runnable
                public final void run() {
                    nsu.r(PreDealCustomEventParams.this);
                }
            });
        }
    }

    public static /* synthetic */ void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6a398d", new Object[0]);
            return;
        }
        try {
            UCPManager.k();
        } catch (Throwable th) {
            wdm.h("UCPTracker.popFirstPageReady.error.", th);
        }
    }

    public static /* synthetic */ void s(a aVar, String str, JSONObject jSONObject) {
        Event L;
        JSONObject trackMap;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b646a7a", new Object[]{aVar, str, jSONObject});
        } else if (aVar != null) {
            try {
                if (aVar.L() != null && !TextUtils.isEmpty(str) && (L = aVar.L()) != null && L.source == 4) {
                    BaseConfigItem K = aVar.K();
                    PreDealCustomEventParams preDealCustomEventParams = L.getPreDealCustomEventParams();
                    if (preDealCustomEventParams != null && preDealCustomEventParams.needTrack() && (trackMap = preDealCustomEventParams.getTrackMap()) != null) {
                        if (aVar.S()) {
                            str2 = aVar.O();
                        } else if (K != null) {
                            str2 = K.indexID;
                        } else {
                            str2 = "";
                        }
                        m(str2, str, preDealCustomEventParams.getTraceId(), trackMap.getJSONObject(str2), jSONObject);
                    }
                }
            } catch (Throwable th) {
                wdm.h("UCPTracker.UCPActionTrack.error.", th);
            }
        }
    }

    public static void u(final a aVar, final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7c076a", new Object[]{aVar, str, jSONObject});
        } else {
            hst.b(new Runnable() { // from class: tb.ksu
                @Override // java.lang.Runnable
                public final void run() {
                    nsu.s(a.this, str, jSONObject);
                }
            });
        }
    }

    public static void m(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3e8803", new Object[]{str, str2, str3, jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject.size() > 0) {
            Intent intent = new Intent("UCPTracker");
            intent.putExtra("type", TRACK_TYPE_BACK_FLOW);
            intent.putExtra("group", "PopLayer");
            intent.putExtra("key", str2);
            intent.putExtra("errorCode", 2);
            intent.putExtra("trackInfo", jSONObject);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            intent.putExtra("bizTrackInfo", jSONObject2);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            wdm.f("pageLifeCycle", str, "UCPActionTrack.UCPActionTrack.PreDealBroadcast.ucpAction=" + str2 + ",traceId=" + str3);
        }
    }

    public static /* synthetic */ void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7c9358", new Object[]{str});
            return;
        }
        try {
            Intent intent = new Intent(PopLayer.ACTION_BROADCAST_ACTION_FIRST_PAGE_READY);
            intent.putExtra("pageUri", str);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            wdm.d("UCPActionTrack.UCPActionTrack.UCPFragmentPageSwitchTrack.pageUri=" + str, new Object[0]);
            wdm.f(wdm.CATEGORY_LIFE_CYCLE, "", "UCPActionTrack.UCPFragmentPageSwitchTrack.sendBroadcast.pageUri=" + str);
        } catch (Throwable th) {
            wdm.h("UCPTracker.UCPFragmentPageSwitchTrack.error.", th);
        }
    }

    public static /* synthetic */ void r(PreDealCustomEventParams preDealCustomEventParams) {
        Set<String> indexIds;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb7a1a3", new Object[]{preDealCustomEventParams});
        } else if (preDealCustomEventParams != null) {
            try {
                if (preDealCustomEventParams.needTrack() && (indexIds = preDealCustomEventParams.getIndexIds()) != null) {
                    for (String str : indexIds) {
                        JSONObject trackMap = preDealCustomEventParams.getTrackMap();
                        if (trackMap != null && trackMap.containsKey(str)) {
                            JSONObject jSONObject = trackMap.getJSONObject(str);
                            if (jSONObject != null && jSONObject.size() > 0) {
                                Intent intent = new Intent("UCPTracker");
                                intent.putExtra("type", "track");
                                intent.putExtra("group", "PopLayer");
                                intent.putExtra("key", "PopReceiver");
                                intent.putExtra("errorCode", 0);
                                intent.putExtra("trackInfo", jSONObject);
                                LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
                                qtv.s("callback", preDealCustomEventParams.getTraceId(), new HashMap());
                                wdm.g("pageLifeCycle", "", "UCPTracker.sendUCPTrackerBroadcast.uriset=" + preDealCustomEventParams.getUriSet() + ".indexmap=" + preDealCustomEventParams.getIndexMap() + ".traceId=" + preDealCustomEventParams.getTraceId());
                            }
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                wdm.h("UCPTracker.UCPReceiverTrack.fail.", th);
            }
        }
    }

    public static void t(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40607b45", new Object[]{str, str2, obj});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) TRACK_TYPE_BACK_FLOW);
            jSONObject.put("group", (Object) "PopLayerHub");
            jSONObject.put("key", (Object) str);
            jSONObject.put("trackInfo", obj);
            jSONObject.put("errorCode", (Object) 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) str2);
            jSONObject.put("bizTrackInfo", (Object) jSONObject2);
            UCPManager.n(jSONObject);
        } catch (Throwable th) {
            wdm.h("UCPTracker.reportAction.error.", th);
        }
    }

    public static void g(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642e594b", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            wdm.f(wdm.CATEGORY_LIFE_CYCLE, "", "UCPActionTrack.UCPFragmentPageSwitchTrack.pageUri=" + str);
            if (!f24931a.compareAndSet(false, true)) {
                return;
            }
            if (jd0.c().a().usePopReadyApi()) {
                hst.c(new Runnable() { // from class: tb.hsu
                    @Override // java.lang.Runnable
                    public final void run() {
                        nsu.n();
                    }
                });
            } else {
                hst.b(new Runnable() { // from class: tb.isu
                    @Override // java.lang.Runnable
                    public final void run() {
                        nsu.o(str);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void p(List list, int i, String str, Event event, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3fa71a", new Object[]{list, new Integer(i), str, event, str2, str3});
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            try {
                if (aVar.S()) {
                    str4 = aVar.O();
                } else {
                    BaseConfigItem K = aVar.K();
                    if (K != null) {
                        str4 = K.indexID;
                    } else {
                        str4 = "";
                    }
                }
                HashSet hashSet = new HashSet();
                hashSet.add(str4);
                wdm.d("UCPTracker.UCPProcessTrack.ucpProcess=%s.indexId=%s.runInGlobalThread", Integer.valueOf(i), str4);
                OnePopModule k = aVar.k();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("renderType", (Object) String.valueOf(k.k0));
                jSONObject.put("viewCreated", (Object) Boolean.valueOf("true".equals(k.B)));
                jSONObject.put("displayed", (Object) Boolean.valueOf("true".equals(k.C)));
                k(i, str, event, hashSet, jSONObject, str2, str3);
            } catch (Throwable th) {
                wdm.h("UCPTracker.UCPProcessTrack.error.", th);
            }
        }
    }

    public static /* synthetic */ void q(int i, Set set, Event event, String str, String str2, String str3, JSONObject jSONObject) {
        JSONObject trackMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39735851", new Object[]{new Integer(i), set, event, str, str2, str3, jSONObject});
            return;
        }
        try {
            wdm.d("UCPTracker.UCPProcessTrackRaw.ucpProcess=%s.indexIds=%s.runInGlobalThread", Integer.valueOf(i), set);
            PreDealCustomEventParams preDealCustomEventParams = event.getPreDealCustomEventParams();
            if (preDealCustomEventParams != null && preDealCustomEventParams.needTrack() && (trackMap = preDealCustomEventParams.getTrackMap()) != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    JSONObject jSONObject2 = trackMap.getJSONObject(str4);
                    if (jSONObject2 != null && jSONObject2.size() > 0) {
                        Intent intent = new Intent("UCPTracker");
                        intent.putExtra("type", str);
                        intent.putExtra("group", "PopLayer");
                        intent.putExtra("key", str2);
                        intent.putExtra("errorCode", i);
                        intent.putExtra("errorMessage", str3);
                        intent.putExtra("bizTrackInfo", jSONObject);
                        intent.putExtra("trackInfo", jSONObject2);
                        LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
                        wdm.g("pageLifeCycle", str4, "UCPActionTrack.UCPProcessTrack.PreDealBroadcast.traceId=%s.trackIntent=" + preDealCustomEventParams.getTraceId());
                    }
                }
            }
        } catch (Throwable th) {
            wdm.h("UCPTracker.UCPProcessTrackRaw.error.", th);
        }
    }
}
