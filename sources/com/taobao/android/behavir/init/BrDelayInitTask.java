package com.taobao.android.behavir.init;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.bridge.UCPJSBridge;
import com.taobao.android.behavir.util.c;
import com.taobao.android.behavix.BehaviRWVPlugin;
import com.taobao.android.ucp.algo.NativeAlgo;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.android.ucp.util.UCPTrackBroadCastReceiver;
import com.taobao.android.ucp.view.UCPViewManager;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.Serializable;
import java.util.HashMap;
import tb.a3w;
import tb.bwt;
import tb.c2v;
import tb.dm1;
import tb.f82;
import tb.fm1;
import tb.fsw;
import tb.gwv;
import tb.n78;
import tb.o0r;
import tb.om8;
import tb.p3v;
import tb.s1c;
import tb.t1c;
import tb.t2o;
import tb.v82;
import tb.zau;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BrDelayInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int[] LISTEN_UT_IDS = {2201, 2101};

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6438a = false;
    public static final BroadcastReceiver b = new BroadcastReceiver() { // from class: com.taobao.android.behavir.init.BrDelayInitTask.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/init/BrDelayInitTask$4");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            BHREvent bHREvent = new BHREvent();
            bHREvent.scene = c2v.getInstance().getCurrentPageName();
            bHREvent.actionType = "internal";
            bHREvent.actionName = "android_walle_Started";
            JSONObject jSONObject = new JSONObject();
            BHREvent e = fm1.f().e();
            if (e != null) {
                jSONObject.put("br_scene", (Object) e.scene);
            }
            bHREvent.bizArgKVMapObject = jSONObject;
            fm1.f().a(bHREvent);
            UtUtils.f("UPP", "walle_start_interval", String.valueOf(System.nanoTime() - f82.h), null);
            TLog.loge("", "walle started.");
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements s1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f6439a = new a();

        static {
            t2o.a(404750388);
            t2o.a(456130607);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4c798838", new Object[0]);
            }
            return f6439a;
        }

        @Override // tb.s1c
        public void onSuccess(a3w a3wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a126ba", new Object[]{this, a3wVar});
                return;
            }
            NativeDelegate.triggerServiceRequest("appVersionChange");
            BrDelayInitTask.b(a3wVar, "changed");
        }
    }

    static {
        t2o.a(404750383);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (gwv.x()) {
            try {
                t1c t1cVar = (t1c) n78.a(t1c.class);
                t1cVar.addChangeVersionListener(a.a());
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
                f82.d().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.init.BrDelayInitTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/init/BrDelayInitTask$1");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else {
                            NativeDelegate.triggerServiceRequest("appVersionChange");
                        }
                    }
                }, intentFilter);
                a3w queryCurrentVersionInfo = t1cVar.queryCurrentVersionInfo();
                if (queryCurrentVersionInfo != null) {
                    d(queryCurrentVersionInfo, "init");
                }
            } catch (Throwable th) {
                TLog.loge("addEditionManagerListener", th.getMessage());
            }
        }
    }

    public static /* synthetic */ void b(a3w a3wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3f0b81", new Object[]{a3wVar, str});
        } else {
            d(a3wVar, str);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (v82.h("enableUtPlugin", true)) {
            p3v.getInstance().registerListener(new c());
        }
    }

    public static void d(a3w a3wVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716abec2", new Object[]{a3wVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dataVersion", a3wVar.f15531a);
        hashMap.put("groupCode", a3wVar.b);
        hashMap.put("activeType", a3wVar.d);
        JSONObject jSONObject = a3wVar.e;
        if (jSONObject != null) {
            str2 = jSONObject.toJSONString();
        } else {
            str2 = "";
        }
        hashMap.put("bizParams", str2);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("BehaviX", 19999, "versionCode", a3wVar.c, str, hashMap).build());
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            LocalBroadcastManager.getInstance(f82.d()).registerReceiver(new UCPViewManager.PopCenterShowReceiver(), new IntentFilter("popcenter.popShow"));
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            LocalBroadcastManager.getInstance(f82.d()).registerReceiver(new UCPTrackBroadCastReceiver(), new IntentFilter("UCPTracker"));
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        try {
            fsw.i("TBBehaviR", BehaviRWVPlugin.class, true);
            fsw.h("UCP", UCPJSBridge.class);
        } catch (Throwable th) {
            om8.e("initJSBridge_fail", th);
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        LocalBroadcastManager.getInstance(f82.d()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.init.BrDelayInitTask.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/init/BrDelayInitTask$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String stringExtra = intent.getStringExtra("schemeId");
                String stringExtra2 = intent.getStringExtra("bizId");
                JSONObject jSONObject = (JSONObject) intent.getSerializableExtra("ext");
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                    BHREvent buildInternalEvent = BHREvent.buildInternalEvent(stringExtra, stringExtra2, String.valueOf(bwt.b()), true);
                    JSONObject jSONObject2 = new JSONObject(4);
                    jSONObject2.put("source", (Object) "Notification");
                    if (jSONObject != null) {
                        jSONObject2.putAll(jSONObject);
                    }
                    buildInternalEvent.bizArgKVMapObject = jSONObject2;
                    fm1.f().a(buildInternalEvent);
                }
            }
        }, new IntentFilter("UCPTryDecision"));
        LocalBroadcastManager.getInstance(f82.d()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.init.BrDelayInitTask.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/init/BrDelayInitTask$3");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String stringExtra = intent.getStringExtra("scene");
                String stringExtra2 = intent.getStringExtra("actionName");
                Serializable serializableExtra = intent.getSerializableExtra("bizArgs");
                if (serializableExtra instanceof JSONObject) {
                    UppProtocolImpl.getInstance().sendUCPEventWithScene(stringExtra, stringExtra2, (JSONObject) serializableExtra);
                }
            }
        }, new IntentFilter("SendEventForUCP"));
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        IntentFilter intentFilter = new IntentFilter(LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS);
        intentFilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGOUT);
        f82.d().registerReceiver(new LoginBroadcastReceiver(), intentFilter);
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!f6438a) {
            f6438a = true;
            c();
            g();
            f();
            zau.a("BXInitStart");
            if (gwv.x()) {
                ((UppProtocolImpl) UppProtocolImpl.getInstance()).init();
            }
            dm1.c().f();
            h();
            e();
            NativeAlgo.initializeNativeAlgo();
            try {
                k();
            } catch (Throwable th) {
                TLog.loge("", "registerWalleListener error.", th);
            }
            i();
            a();
            zau.a("BXInitEnd");
        }
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ffa653", new Object[0]);
        } else if (v82.n(o0r.c.K_ENABLE_MIDDLEWARE_EVENT, true)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE");
            f82.d().registerReceiver(b, intentFilter);
        }
    }
}
