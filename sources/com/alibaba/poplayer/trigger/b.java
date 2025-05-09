package com.alibaba.poplayer.trigger;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.a;
import com.alibaba.poplayer.trigger.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.hst;
import tb.jd0;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(626000015);
    }

    public static void f(final String str, final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1186d395", new Object[]{str, list});
            return;
        }
        try {
            hst.b(new Runnable() { // from class: tb.yjj
                @Override // java.lang.Runnable
                public final void run() {
                    b.k(str, list);
                }
            });
        } catch (Throwable th) {
            wdm.h("NativeEventDispatcher.internalNotifyConfigUpdated.AsyncTask.fail.", th);
        }
    }

    public static void g(final a aVar, PopLayerBaseView popLayerBaseView) {
        final boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba426923", new Object[]{aVar, popLayerBaseView});
        } else if (popLayerBaseView != null) {
            try {
                final String nativeNotifyInfo = popLayerBaseView.getNativeNotifyInfo();
                if (popLayerBaseView.getVisibility() != 0) {
                    z = false;
                }
                final String str = "";
                if (popLayerBaseView.getPopRequest() != null && (popLayerBaseView.getPopRequest() instanceof a)) {
                    str = ((a) popLayerBaseView.getPopRequest()).K().json;
                }
                hst.b(new Runnable() { // from class: tb.xjj
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.l(nativeNotifyInfo, z, str, aVar);
                    }
                });
            } catch (Throwable th) {
                wdm.h("NativeEventDispatcher.internalNotifyDismissedIfPopLayerView.fail.", th);
            }
        }
    }

    public static void h(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227fbac9", new Object[]{aVar});
            return;
        }
        try {
            hst.b(new Runnable() { // from class: tb.wjj
                @Override // java.lang.Runnable
                public final void run() {
                    b.m(a.this);
                }
            });
        } catch (Throwable th) {
            wdm.h("NativeEventDispatcher.internalNotifyDisplayedIfPopLayerView.AsyncTask.fail.", th);
        }
    }

    public static void i(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cc018f", new Object[]{aVar});
            return;
        }
        try {
            hst.b(new Runnable() { // from class: tb.ujj
                @Override // java.lang.Runnable
                public final void run() {
                    b.n(a.this);
                }
            });
        } catch (Throwable th) {
            wdm.h("NativeEventDispatcher.internalNotifyViewAddedIfPopLayerView.AsyncTask.fail.", th);
        }
    }

    public static void j(final a aVar, PopLayerBaseView popLayerBaseView) {
        final boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c488575", new Object[]{aVar, popLayerBaseView});
        } else if (popLayerBaseView != null) {
            try {
                final String nativeNotifyInfo = popLayerBaseView.getNativeNotifyInfo();
                if (popLayerBaseView.getVisibility() != 0) {
                    z = false;
                }
                final String str = "";
                if (popLayerBaseView.getPopRequest() != null && (popLayerBaseView.getPopRequest() instanceof a)) {
                    str = ((a) popLayerBaseView.getPopRequest()).K().json;
                }
                hst.b(new Runnable() { // from class: tb.vjj
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.o(nativeNotifyInfo, z, str, aVar);
                    }
                });
            } catch (Throwable th) {
                wdm.h("NativeEventDispatcher.internalNotifyViewRemovedIfPopLayerView.fail.", th);
            }
        }
    }

    public static /* synthetic */ void l(String str, boolean z, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ea8cff", new Object[]{str, new Boolean(z), str2, aVar});
            return;
        }
        try {
            Intent intent = new Intent(PopLayer.ACTION_OUT_DISMISS);
            intent.putExtra("event", str);
            intent.putExtra("isVisible", z);
            intent.putExtra("config", str2);
            p(aVar, intent);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            wdm.d("NativeEventDispatcher.NativeNotify.dismiss.", new Object[0]);
        } catch (Throwable th) {
            wdm.h("NativeEventDispatcher.InThread.internalNotifyDismissedIfPopLayerView.fail.", th);
        }
    }

    public static /* synthetic */ void m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33574d41", new Object[]{aVar});
            return;
        }
        try {
            PopLayerBaseView popLayerBaseView = (PopLayerBaseView) aVar.i();
            if (popLayerBaseView != null) {
                Intent intent = new Intent(PopLayer.ACTION_OUT_DISPLAY);
                intent.putExtra("event", popLayerBaseView.getNativeNotifyInfo());
                if (popLayerBaseView.getPopRequest() == null || !(popLayerBaseView.getPopRequest() instanceof a)) {
                    intent.putExtra("config", "");
                } else {
                    intent.putExtra("config", ((a) popLayerBaseView.getPopRequest()).K().json);
                }
                p(aVar, intent);
                LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
                wdm.d("NativeEventDispatcher.NativeNotify.display.", new Object[0]);
            }
        } catch (Throwable th) {
            wdm.h("NativeEventDispatcher.internalNotifyDisplayedIfPopLayerView.fail.", th);
        }
    }

    public static /* synthetic */ void n(a aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6edeae5c", new Object[]{aVar});
            return;
        }
        try {
            PopLayerBaseView popLayerBaseView = (PopLayerBaseView) aVar.i();
            if (popLayerBaseView != null) {
                Intent intent = new Intent(PopLayer.ACTION_OUT_VIEW_ADDED);
                intent.putExtra("event", popLayerBaseView.getNativeNotifyInfo());
                if (popLayerBaseView.getVisibility() != 0) {
                    z = false;
                }
                intent.putExtra("isVisible", z);
                if (popLayerBaseView.getPopRequest() == null || !(popLayerBaseView.getPopRequest() instanceof a)) {
                    intent.putExtra("config", "");
                } else {
                    intent.putExtra("config", ((a) popLayerBaseView.getPopRequest()).K().json);
                }
                p(aVar, intent);
                LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
                wdm.d("NativeEventDispatcher.NativeNotify.onViewAdded.", new Object[0]);
            }
        } catch (Throwable th) {
            wdm.h("NativeEventDispatcher.internalNotifyViewAddedIfPopLayerView.fail.", th);
        }
    }

    public static /* synthetic */ void o(String str, boolean z, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59b1a2c", new Object[]{str, new Boolean(z), str2, aVar});
            return;
        }
        try {
            Intent intent = new Intent(PopLayer.ACTION_OUT_VIEW_REMOVED);
            intent.putExtra("event", str);
            intent.putExtra("isVisible", z);
            intent.putExtra("config", str2);
            p(aVar, intent);
            LocalBroadcastManager.getInstance(PopLayer.getReference().getApp()).sendBroadcast(intent);
            wdm.d("NativeEventDispatcher.NativeNotify.onViewRemoved.", new Object[0]);
        } catch (Throwable th) {
            wdm.h("NativeEventDispatcher.InThread.internalNotifyViewRemovedIfPopLayerView.fail.", th);
        }
    }

    public static void p(a aVar, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eeee12c", new Object[]{aVar, intent});
        } else if (aVar != null && jd0.c().a() != null && jd0.c().a().isNewNativeEventNotificationEnable()) {
            Event L = aVar.L();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", (Object) L.uri);
            jSONObject.put("param", (Object) L.param);
            jSONObject.put("source", (Object) Event.b.b(L.source));
            intent.putExtra(wdm.CATEGORY_TRIGGER_EVENT, jSONObject.toJSONString());
            intent.putExtra("config", aVar.K().json);
            intent.putExtra("indexId", aVar.K().indexID);
            if (!TextUtils.isEmpty(aVar.K().layerType)) {
                str = aVar.K().layerType;
            } else {
                str = "default";
            }
            intent.putExtra("layerType", str);
            intent.putExtra("nativeUri", L.curPage);
            intent.putExtra("nativeUrl", L.curPageUrl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.localbroadcastmanager.content.LocalBroadcastManager] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void k(java.lang.String r4, java.util.List r5) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.poplayer.trigger.b.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "dd6530b4"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r4 = 1
            r3[r4] = r5
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            android.content.Intent r1 = new android.content.Intent     // Catch: all -> 0x0037
            java.lang.String r2 = "com.alibaba.poplayer.PopLayer.action.out.CONFIG_UPDATED"
            r1.<init>(r2)     // Catch: all -> 0x0037
            java.lang.String r2 = "domain"
            java.lang.String r3 = "Page"
            r1.putExtra(r2, r3)     // Catch: all -> 0x0037
            java.lang.String r2 = "sourceType"
            r1.putExtra(r2, r0)     // Catch: all -> 0x0037
            java.lang.String r2 = "configVersion"
            r1.putExtra(r2, r4)     // Catch: all -> 0x0037
            java.lang.String r4 = "configIndexIds"
            if (r5 == 0) goto L_0x0039
            java.lang.Object[] r5 = r5.toArray()     // Catch: all -> 0x0037
            goto L_0x003a
        L_0x0037:
            r4 = move-exception
            goto L_0x0054
        L_0x0039:
            r5 = 0
        L_0x003a:
            r1.putExtra(r4, r5)     // Catch: all -> 0x0037
            com.alibaba.poplayer.PopLayer r4 = com.alibaba.poplayer.PopLayer.getReference()     // Catch: all -> 0x0037
            android.app.Application r4 = r4.getApp()     // Catch: all -> 0x0037
            androidx.localbroadcastmanager.content.LocalBroadcastManager r4 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r4)     // Catch: all -> 0x0037
            r4.sendBroadcast(r1)     // Catch: all -> 0x0037
            java.lang.String r4 = "NativeEventDispatcher.NativeNotify.ConfigUpdated."
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: all -> 0x0037
            tb.wdm.d(r4, r5)     // Catch: all -> 0x0037
            goto L_0x0059
        L_0x0054:
            java.lang.String r5 = "NativeEventDispatcher.internalNotifyConfigUpdated.fail."
            tb.wdm.h(r5, r4)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.trigger.b.k(java.lang.String, java.util.List):void");
    }
}
