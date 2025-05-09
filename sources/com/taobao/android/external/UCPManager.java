package com.taobao.android.external;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.ActivityMonitor;
import com.taobao.android.behavir.util.PopStateMonitor;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.b;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.arp;
import tb.bsu;
import tb.dsu;
import tb.f82;
import tb.fm1;
import tb.fsu;
import tb.t2o;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCPManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_STATUS = "appStatus";
    public static final String CAN_BE_CONTROLLED_BY_UCP = "canBeControlledByUcp";
    public static final String DATA = "data";
    public static final String IN_APP_PUSH_STATUS_OFF = "inAppPushStatusOff";
    public static final String IN_APP_PUSH_STATUS_OPEN = "inAppPushStatusOpen";
    public static final String MSG = "msg";
    public static final String OFF = "off";
    public static final String SYSTEM_PUSH_STATUS_OFF = "systemPushStatusOff";
    public static final String SYSTEM_PUSH_STATUS_OPEN = "systemPushStatusOpen";
    public static final String UCPCHECK_FATIGUE_FAILED = "UCPCheckFatigueFailed";
    public static final String UCPCHECK_INIT_FAILED = "UCPCheckInitFailed";
    public static final String UCPCHECK_MUTEX_FAILED = "UCPCheckMutexFailed";
    public static final String UCP_CALLBACK_ID = "ucpCallbackId";
    public static final String UCP_CHECK_PARAMS_FAILED = "UCPCheckParamsFailed";
    public static final String UCP_CHECK_PLAN_FAILED = "UCPCheckPlanFailed";
    public static final String UCP_TRACK_INFO = "ucpTrackInfo";
    public static final String UCP_TRACK_PARAMS = "ucpParams";

    /* renamed from: a  reason: collision with root package name */
    public static volatile e f7640a;
    public static final Map<String, dsu> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ JSONObject d;

        public a(String str, String str2, JSONObject jSONObject) {
            this.b = str;
            this.c = str2;
            this.d = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/external/UCPManager$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                ActivityMonitor.j(this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f7641a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;

        public b(c cVar, long j, String str) {
            this.f7641a = cVar;
            this.b = j;
            this.c = str;
        }

        @Override // com.taobao.android.external.UCPManager.c
        public void a(boolean z, String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d8a835e", new Object[]{this, new Boolean(z), str, jSONObject});
                return;
            }
            this.f7641a.a(z, str, jSONObject);
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) this.c);
            jSONObject2.put("checkResult", (Object) Boolean.valueOf(z));
            jSONObject2.put("reason", (Object) str);
            jSONObject2.put("cost", (Object) Long.valueOf(currentTimeMillis));
            UtUtils.d("UCP", UtUtils.CHANGED_UPP_EVENT_ID, "checkDisplayWithCode", "", "", jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(boolean z, String str, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void callback(boolean z, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        void notify(JSONObject jSONObject);
    }

    static {
        t2o.a(404750676);
    }

    public static void b(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5b50b9", new Object[]{map, str});
        } else if (str != null) {
            if (map == null) {
                map = new HashMap<>();
            }
            NativeDelegate.AddUserFeature(str, new JSONObject(map));
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79648813", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            ActivityMonitor.f(str);
        }
    }

    private static native String checkAnyTrackerInProcess();

    private static native boolean checkPushCanBeControlled(String str);

    public static void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282ac237", new Object[]{str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        NativeDelegate.nativeCheckDisplaySyncWithCode(str, jSONObject);
    }

    public static boolean e(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70bf9320", new Object[]{str, str2, str3, str4, jSONObject, jSONObject2})).booleanValue();
        }
        if ("bottomBar".equals(str)) {
            return com.taobao.android.ucp.bridge.a.b(str2, str3, str4, jSONObject, jSONObject2);
        }
        return true;
    }

    public static void g(JSONObject jSONObject, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb94c60b", new Object[]{jSONObject, dVar});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.CHECK_FATIGUE, jSONObject, new NativeBroadcast.Callback() { // from class: com.taobao.android.external.UCPManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/external/UCPManager$4");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback});
                    } else if (jSONObject2 == null) {
                        LogUtils.f("GlobalControl", NativeBroadcast.CHECK_FATIGUE, "json is invalid");
                        d.this.callback(true, com.taobao.android.behavir.util.a.b("msg", "UCPException"));
                    } else {
                        boolean booleanValue = jSONObject2.getBooleanValue("result");
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("outInfo");
                        d.this.callback(booleanValue, jSONObject3);
                        if (booleanValue) {
                            str = "true";
                        } else {
                            str = "false";
                        }
                        LogUtils.f("GlobalControl", NativeBroadcast.CHECK_FATIGUE, "checkResult:%s|outInfo:%s", str, Utils.j(jSONObject3).toJSONString());
                    }
                }
            });
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9287f224", new Object[]{str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        String h = bsu.i().h(str);
        if (currentTimeMillis % 10 == 0) {
            UtUtils.d("UCP", UtUtils.g(), "fetchFatiguePerf", "", "", com.taobao.android.behavir.util.a.c("cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "result", h));
        }
        return h;
    }

    public static dsu i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsu) ipChange.ipc$dispatch("40a5c653", new Object[]{str});
        }
        return (dsu) ((ConcurrentHashMap) b).get(str);
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd81a3c", new Object[0]);
        } else {
            PopStateMonitor.a().d();
        }
    }

    public static void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c977222", new Object[]{jSONObject});
        } else {
            NativeDelegate.registerUCPPlansToCpp(jSONObject);
        }
    }

    public static void m(dsu dsuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6178d7d6", new Object[]{dsuVar, str});
        } else if (!TextUtils.isEmpty(str) && dsuVar != null) {
            ((ConcurrentHashMap) b).put(str, dsuVar);
            dsuVar.registerStateSynchronizer(new fsu());
        }
    }

    public static void n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d608ff", new Object[]{jSONObject});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.REPORT_ACTION, com.taobao.android.behavir.util.a.b("data", jSONObject), null);
        }
    }

    public static void o(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582c8e51", new Object[]{str, str2, jSONObject});
        } else {
            com.taobao.android.behavir.util.b.e(new a(str, str2, jSONObject));
        }
    }

    public static void q(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b255a9c", new Object[]{eVar});
            return;
        }
        LogUtils.i("UCP", "UCPManager", eVar);
        f7640a = eVar;
    }

    public static void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa536d", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) b).remove(str);
        }
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (BHXCXXBaseBridge.checkCXXLib()) {
            return NativeDelegate.nativeTryTriggerUCPEvent(jSONObject, jSONObject2);
        }
        jSONObject2.put("msg", UCPCHECK_INIT_FAILED);
        return false;
    }

    public static void p(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337ffcab", new Object[]{str, str2, str3, jSONObject});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            if (!f82.j()) {
                UtUtils.e("UCP", 19999, "behavixNull", "sendUCPEventWithScene", "", "");
            }
            BHREvent buildInternalEvent = BHREvent.buildInternalEvent(str, str3, "", true);
            buildInternalEvent.actionType = str2;
            buildInternalEvent.bizArgKVMapObject = jSONObject;
            fm1.f().a(buildInternalEvent);
        }
    }

    public static boolean r(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c126c3c0", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        TLog.loge("UCP:", "tryTriggerUCPEvent", JSON.toJSONString(jSONObject));
        String l = v82.l("splashADDowngradeUrl", "");
        String l2 = v82.l("splashADDowngradeIndexId", "");
        if (TextUtils.isEmpty(l) || TextUtils.isEmpty(l2)) {
            boolean a2 = a(jSONObject, jSONObject2);
            if (!a2) {
                UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "UCPManager", null, "UCPManager", jSONObject2.getString("msg"));
            }
            return a2;
        }
        jSONObject2.put("popIndexId", (Object) l2);
        jSONObject2.put("msg", (Object) "UCPDowngrade");
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", l);
        LocalBroadcastManager.getInstance(f82.d()).sendBroadcast(intent);
        return true;
    }

    public static void f(final String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe27845c", new Object[]{str, cVar});
        } else if (TextUtils.isEmpty(str) || cVar == null) {
            if (cVar != null) {
                cVar.a(false, UCP_CHECK_PARAMS_FAILED, new JSONObject());
            }
            LogUtils.f("GlobalControl", "checkDisplayWithCode", "code or callback is invalid");
        } else {
            final b bVar = new b(cVar, System.currentTimeMillis(), str);
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.CHECK_DISPLAY, com.taobao.android.behavir.util.a.b("data", str), new NativeBroadcast.Callback() { // from class: com.taobao.android.external.UCPManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/external/UCPManager$3");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                        String[] split = str.split("#");
                        if (split == null || split.length < 5) {
                            bVar.a(false, UCPManager.UCP_CHECK_PARAMS_FAILED, new JSONObject());
                            LogUtils.f("GlobalControl", "checkDisplayWithCode", "json and code is invalid");
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("schemeId", (Object) split[0]);
                        jSONObject2.put("schemeNumId", (Object) split[1]);
                        jSONObject2.put("bizId", (Object) split[2]);
                        jSONObject2.put("bizNum", (Object) split[3]);
                        jSONObject2.put(arp.MATERIAL_ID_KEY, (Object) split[4]);
                        bVar.a(true, "UCPException", jSONObject2);
                        LogUtils.f("GlobalControl", "checkDisplayWithCode", "json is invalid");
                    } else {
                        boolean booleanValue = jSONObject.getBooleanValue("checkResult");
                        String string = jSONObject.getString("reason");
                        bVar.a(booleanValue, string, jSONObject.getJSONObject("trackInfo"));
                        if (booleanValue) {
                            str2 = "true";
                        } else {
                            str2 = "false";
                        }
                        LogUtils.f("GlobalControl", "checkDisplayWithCode", "checkResult:%s|reason:%s", str2, string);
                    }
                }
            });
        }
    }

    public static boolean j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79df4b2a", new Object[]{jSONObject})).booleanValue();
        }
        e eVar = f7640a;
        if (eVar != null) {
            eVar.notify(jSONObject);
            LogUtils.i("UCP", "UCPManager", "push回调成功");
            return true;
        }
        LogUtils.i("UCP", "UCPManager", "push回调未初始化");
        return false;
    }
}
