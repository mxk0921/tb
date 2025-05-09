package com.taobao.android.ucp.bridge;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfig;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.event.BHRScrollEvent;
import com.taobao.android.behavir.fatigue.FatigueManager;
import com.taobao.android.behavir.util.ActivityMonitor;
import com.taobao.android.behavir.util.PopStateMonitor;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.b;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.external.UCPManager;
import com.taobao.android.external.UCPReachViewOpenState;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.ucp.UcpResponse;
import com.taobao.android.ucp.algo.NativeAlgo;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.android.ucp.view.UCPViewManager;
import com.taobao.android.upp.d;
import com.taobao.tao.Globals;
import com.taobao.tao.common.ucp.UcpManager;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tinct.ITinctOperater;
import com.tmall.android.dai.DAIKVStoreage;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import org.android.agoo.common.AgooConstants;
import tb.dm1;
import tb.dsu;
import tb.esu;
import tb.f82;
import tb.gwv;
import tb.hqv;
import tb.iaa;
import tb.j9t;
import tb.jem;
import tb.ke4;
import tb.km1;
import tb.kxw;
import tb.l3e;
import tb.l81;
import tb.n78;
import tb.o81;
import tb.om8;
import tb.p6n;
import tb.r4p;
import tb.t1c;
import tb.t2o;
import tb.u82;
import tb.uct;
import tb.ufu;
import tb.v82;
import tb.wv7;
import tb.y78;
import tb.yl2;
import tb.zmv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NativeDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SETTING_ACTION = "UCPTabBarShouldRemove";
    public static final String SETTING_BIZ = "bx";
    public static final String SETTING_KEY = "tab2remind";
    private static final Map<String, NativeBroadcast.Callback> schemeCallbackMap = new HashMap();
    private static final Map<String, NativeBroadcast.Callback> sceneCallbackMap = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum StaticVariableName {
        SERVER_TIME,
        CUR_PAGE_INFO,
        USER_ID,
        EDITION_CODE,
        IS_TAO_LINK_SHOW,
        IS_POP_FIRST_PAGE_READY,
        AFC_ID,
        CPP_INIT_END,
        CPP_LAUNCH_END,
        BX_LAUNCH_OPT,
        LOAD_MNN,
        LAUNCH_TYPE,
        APP_VERSION_CODE,
        TAO_SETTING_TAB2_BAR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(StaticVariableName staticVariableName, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$StaticVariableName");
        }

        public static StaticVariableName valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StaticVariableName) ipChange.ipc$dispatch("8251e613", new Object[]{str});
            }
            return (StaticVariableName) Enum.valueOf(StaticVariableName.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9827a;

        static {
            int[] iArr = new int[StaticVariableName.values().length];
            f9827a = iArr;
            try {
                iArr[StaticVariableName.SERVER_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9827a[StaticVariableName.CUR_PAGE_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9827a[StaticVariableName.USER_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9827a[StaticVariableName.EDITION_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9827a[StaticVariableName.IS_TAO_LINK_SHOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9827a[StaticVariableName.IS_POP_FIRST_PAGE_READY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9827a[StaticVariableName.AFC_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9827a[StaticVariableName.BX_LAUNCH_OPT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9827a[StaticVariableName.LAUNCH_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9827a[StaticVariableName.APP_VERSION_CODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9827a[StaticVariableName.TAO_SETTING_TAB2_BAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements l81 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.l81
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb67a1", new Object[]{this, obj});
            } else if ((obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
                Intent intent = new Intent("UCPTabBarShouldRemove");
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("bizCode", (Object) "tab2");
                jSONArray.add(jSONObject2);
                jSONObject.put("removeList", (Object) jSONArray);
                intent.putExtra("data", jSONObject);
                LocalBroadcastManager.getInstance(f82.d()).sendBroadcast(intent);
            }
        }
    }

    static {
        t2o.a(404750717);
    }

    public static void AddUserFeature(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdd2dd5", new Object[]{str, jSONObject});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.ADD_USER_FEATURE, com.taobao.android.behavir.util.a.c("channel", str, "userFeatureJson", jSONObject), null);
        }
    }

    public static /* synthetic */ void access$000(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75554d8f", new Object[]{str, jSONObject});
        } else {
            doDyeInner(str, jSONObject);
        }
    }

    public static /* synthetic */ Map access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return schemeCallbackMap;
    }

    public static /* synthetic */ Map access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e220286e", new Object[0]);
        }
        return sceneCallbackMap;
    }

    public static /* synthetic */ Intent access$300(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("8d0ba0a7", new Object[]{str, jSONObject});
        }
        return buildIntent(str, jSONObject);
    }

    public static void addSceneCallback(String str, Object obj, d.b bVar, d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cbb61d", new Object[]{str, obj, bVar, cVar});
        } else if (bVar != null || cVar != null) {
            sceneCallbackMap.put(getUCPCallbackKey(str, obj), new NativeBroadcast.Callback(cVar) { // from class: com.taobao.android.ucp.bridge.NativeDelegate.20
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ d.c val$callback2;

                public static /* synthetic */ Object ipc$super(AnonymousClass20 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$20");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    d.b bVar2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null && (bVar2 = d.b.this) != null) {
                        ((UcpManager.b) bVar2).a(jSONObject);
                    }
                }
            });
            NativeBroadcast.register(NativeBroadcast.CALLBACK_TO_SCENE, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.21
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass21 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$21");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        String string = jSONObject.getString("scene");
                        String string2 = jSONObject.getString("sceneHash");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        Map access$200 = NativeDelegate.access$200();
                        NativeBroadcast.Callback callback2 = (NativeBroadcast.Callback) access$200.get(string2 + string);
                        if (callback2 != null) {
                            callback2.callback(jSONObject2, null);
                        }
                    }
                }
            });
        }
    }

    private static Intent buildIntent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("c4ae24de", new Object[]{str, jSONObject});
        }
        Intent intent = new Intent(str);
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Serializable) {
                intent.putExtra(key, (Serializable) value);
            }
        }
        return intent;
    }

    private static String checkPopFatigue(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cd8ae11", new Object[]{str});
        }
        if (gwv.k("ucpCheckPopFatigueOpt")) {
            return "";
        }
        try {
            map = PopLayer.getReference().filterFatigue(Collections.singletonList(str));
        } catch (Throwable th) {
            th.printStackTrace();
            map = null;
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        String str2 = map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return "PopLayer_" + str2;
    }

    private static boolean checkSolution(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fc82a76", new Object[]{str})).booleanValue();
        }
        if (dm1.b(str) != null) {
            return true;
        }
        return false;
    }

    public static void cppMakeDecision(BHREvent bHREvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10dfc08b", new Object[]{bHREvent});
        } else if (bHREvent != null) {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.MAKE_DECISION, bHREvent.toJsonObject(), null);
        }
    }

    public static void fetchColdStartData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac94d95", new Object[0]);
        } else if (BHXCXXBaseBridge.LoadCXXLib()) {
            innerFetchColdStartData();
        } else {
            TLog.loge("UCP", "ColdStartData", "loadCXXLib failed");
        }
    }

    private static boolean getABSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78d6f860", new Object[]{str})).booleanValue();
        }
        return gwv.k(str);
    }

    public static String getCppStaticVariable(StaticVariableName staticVariableName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cf42a94", new Object[]{staticVariableName});
        }
        if (staticVariableName == null) {
            return "";
        }
        if (BHXCXXBaseBridge.checkCXXLib()) {
            return innerGetCppStaticVariable(staticVariableName.ordinal());
        }
        TLog.loge("UCP", "getCppStaticVariable", "loadCXXLib failed: " + staticVariableName.ordinal());
        return "";
    }

    private static String getUCPCallbackKey(String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7109c805", new Object[]{str, obj});
        }
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = String.valueOf(obj.hashCode());
        }
        return str2 + str;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        registerDoService();
        registerRunModel();
        registerSwitchThread();
        registerNotifyPop();
        registerDoDye();
        registerCommitUMError();
        registerNonUCPTask();
        registerWaitForFragment();
        registerUpdateNextPageUtparam();
        registerBHXBroadcast();
        registerNotifyFatigueSummaryChanged();
        registerNotifyPush();
        registerUpdatePushStatus();
        registerNotifyReachView();
        registerChangeToBXDBStatus();
        registerUCPControlCenterUpdatePolicies();
        registerUpdateTabBarNotification();
        registerSimpleNet();
        LocalBroadcastManager.getInstance(f82.d()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String stringExtra = intent.getStringExtra("data");
                if (stringExtra != null) {
                    NativeBroadcast.sendMessageFromJava(NativeBroadcast.UPDATE_TAB_BAR_STATE, com.taobao.android.behavir.util.a.b("data", stringExtra), null);
                }
            }
        }, new IntentFilter(yl2.ACTION_TAB_BAR_ITEM_STATE_CHANGED));
        o81.d(SETTING_KEY, new b());
    }

    private static native String innerCheckDisplaySyncWithCode(String str);

    private static native String[] innerCheckFatigue(String str);

    private static native void innerFetchColdStartData();

    private static native String innerGetCppStaticVariable(int i);

    private static native void innerOccupyForDuration(int i, long j, long j2, long j3);

    private static native void innerRecordMemoryCancel(boolean z, long j, long j2, long j3);

    private static native void innerRecordMemoryClick(boolean z, long j, long j2, long j3);

    private static native void innerRecordMemoryExpose(long j, long j2, long j3);

    private static native String[] innerTryTriggerUCPEvent(String str);

    public static void nativeCheckDisplaySyncWithCode(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6405120", new Object[]{str, jSONObject});
            return;
        }
        String innerCheckDisplaySyncWithCode = innerCheckDisplaySyncWithCode(str);
        if (!TextUtils.isEmpty(innerCheckDisplaySyncWithCode)) {
            jSONObject.putAll(JSON.parseObject(innerCheckDisplaySyncWithCode));
        }
    }

    public static void nativeOccupyForDuration(int i, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e65773f", new Object[]{new Integer(i), new Long(j), new Long(j2), new Long(j3)});
        } else {
            innerOccupyForDuration(i, j, j2, j3);
        }
    }

    public static void nativeRecordMemoryCancel(boolean z, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c138073a", new Object[]{new Boolean(z), new Long(j), new Long(j2), new Long(j3)});
        } else {
            innerRecordMemoryCancel(z, j, j2, j3);
        }
    }

    public static void nativeRecordMemoryClick(boolean z, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2415596", new Object[]{new Boolean(z), new Long(j), new Long(j2), new Long(j3)});
        } else {
            innerRecordMemoryClick(z, j, j2, j3);
        }
    }

    public static void nativeRecordMemoryExpose(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce48430", new Object[]{new Long(j), new Long(j2), new Long(j3)});
        } else {
            innerRecordMemoryExpose(j, j2, j3);
        }
    }

    private static native void nativeRefreshGlobalControl(String str);

    public static void refreshGlobalControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ad8e70", new Object[]{str});
        } else if (BHXCXXBaseBridge.LoadCXXLib()) {
            nativeRefreshGlobalControl(str);
        } else {
            TLog.loge("UCP", "refreshGlobalControl", "loadCXXLib failed");
        }
    }

    private static void registerBHXBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891941b9", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.BHX_BROADCAST, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass22 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$22");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        String string = jSONObject.getString("broadcastName");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                        if (!TextUtils.isEmpty(string) && jSONObject2 != null) {
                            Intent access$300 = NativeDelegate.access$300(string, jSONObject2);
                            access$300.setPackage(f82.d().getPackageName());
                            LocalBroadcastManager.getInstance(f82.d()).sendBroadcast(access$300);
                        }
                    }
                }
            });
        }
    }

    private static void registerChangeToBXDBStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b742a37b", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.CHANGE_TO_BX_STATUS, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$5");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        String string = jSONObject.getString("status");
                        String string2 = jSONObject.getString("dbPath");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            DAIKVStoreage.put("BehaviX", "BXDBMoveStatus", string);
                            DAIKVStoreage.put("BehaviX", "BXDBPath", string2);
                        }
                    }
                }
            });
        }
    }

    private static void registerCommitUMError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ff1cdd", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.COMMIT_UM_ERROR, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass14 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$14");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        om8.f(jSONObject.getString("errorCode"), jSONObject.getString("errorMsg"), jSONObject.getJSONObject("errorData"));
                    }
                }
            });
        }
    }

    private static void registerDoDye() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd17489", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.DO_DYE, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$13");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                        return;
                    }
                    JSONObject f = Utils.f(jSONObject);
                    if (f.containsKey("bizName") && f.containsKey("grayConfig")) {
                        NativeDelegate.access$000(f.getString("bizName"), f.getJSONObject("grayConfig"));
                    }
                }
            });
        }
    }

    private static void registerDoService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a50f14e", new Object[0]);
        } else {
            NativeBroadcast.register("request", new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$8");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, final NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(AgooConstants.MESSAGE_BODY);
                            final String string = jSONObject2.getString("apiName");
                            JSONObject jSONObject3 = jSONObject.getJSONObject("header");
                            RemoteBusiness build = RemoteBusiness.build((MtopRequest) jSONObject2.toJavaObject(MtopRequest.class), f82.g());
                            build.headers((Map<String, String>) jSONObject3);
                            build.reqMethod(MethodEnum.POST);
                            if (jSONObject.getBooleanValue("needWua")) {
                                build.useWua();
                            }
                            build.setUnitStrategy(zmv.b(jSONObject.getBooleanValue("isTradeUnit")));
                            zmv.a(build);
                            Looper myLooper = Looper.myLooper();
                            if (myLooper != null) {
                                build.handler(new Handler(myLooper));
                            }
                            if ("1".equals(v82.l("inSubThread", "1"))) {
                                build.handler(u82.c());
                            }
                            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.8.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;
                                private volatile boolean d = false;

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                        return;
                                    }
                                    TLog.loge("UCP", string, "error");
                                    NativeBroadcast.Callback callback2 = callback;
                                    if (callback2 != null) {
                                        callback2.callback(com.taobao.android.behavir.util.a.c("data", new String(mtopResponse.getBytedata()), "headerFields", mtopResponse.getHeaderFields()), null);
                                        callback.close();
                                    }
                                    this.d = true;
                                    TLog.loge("UCP", string, "error end");
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                        return;
                                    }
                                    NativeBroadcast.Callback callback2 = callback;
                                    if (callback2 != null) {
                                        callback2.callback(null, null);
                                        callback.close();
                                    }
                                    this.d = true;
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                        return;
                                    }
                                    TLog.loge("UCP", string, "success");
                                    if (callback != null) {
                                        JSONObject jSONObject4 = new JSONObject();
                                        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
                                        if (headerFields != null) {
                                            jSONObject4.putAll(headerFields);
                                            jSONObject4.remove(null);
                                        }
                                        callback.callback(com.taobao.android.behavir.util.a.c("data", new String(mtopResponse.getBytedata()), "headerFields", jSONObject4), null);
                                        callback.close();
                                    }
                                    this.d = true;
                                    TLog.loge("UCP", string, "success end");
                                }

                                public void finalize() throws Throwable {
                                    boolean z = false;
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("a35321a5", new Object[]{this});
                                        return;
                                    }
                                    super.finalize();
                                    if (!this.d) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(string);
                                        sb.append("notCallback");
                                        if (callback == null) {
                                            z = true;
                                        }
                                        sb.append(z);
                                        UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "registerDoService", null, "registerDoServiceError", sb.toString());
                                        TLog.loge("UCP", string, "not callback");
                                        NativeBroadcast.Callback callback2 = callback;
                                        if (callback2 != null) {
                                            callback2.callback(null, null);
                                            callback.close();
                                        }
                                    }
                                }
                            }).startRequest();
                        } catch (Exception e) {
                            UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "registerDoService", null, "registerDoServiceError", e.getMessage());
                            if (callback != null) {
                                callback.callback(null, null);
                                callback.close();
                            }
                        }
                    }
                }
            });
        }
    }

    private static void registerNonUCPTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74411dc4", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NON_UCP_TASK, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass15 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$15");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    BHREvent bHREvent;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        BHRTaskConfig bHRTaskConfig = new BHRTaskConfig(jSONObject.getJSONObject("taskConfig"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
                        if ("scroll".equals(jSONObject2.getString("actionType"))) {
                            bHREvent = (BHREvent) jSONObject2.toJavaObject(BHRScrollEvent.class);
                        } else {
                            bHREvent = (BHREvent) jSONObject2.toJavaObject(BHREvent.class);
                        }
                        try {
                            bHREvent.actionArgsJSON = JSON.parseObject(bHREvent.actionArgs);
                        } catch (Exception unused) {
                            bHREvent = null;
                        }
                        if (bHREvent != null) {
                            bHREvent.addBrMark();
                            uct task = getTask(bHRTaskConfig, bHREvent);
                            if (task != null) {
                                task.h();
                            }
                        }
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
                    if (r6.equals(tb.s6n.TYPE) == false) goto L_0x003f;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private tb.uct getTask(com.taobao.android.behavir.config.BHRTaskConfigBase r10, com.taobao.android.behavir.event.BHREvent r11) {
                    /*
                        r9 = this;
                        r0 = 2
                        r1 = 1
                        r2 = 0
                        r3 = 3
                        com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.ucp.bridge.NativeDelegate.AnonymousClass15.$ipChange
                        boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
                        if (r5 == 0) goto L_0x001b
                        java.lang.String r5 = "eac9361f"
                        java.lang.Object[] r3 = new java.lang.Object[r3]
                        r3[r2] = r9
                        r3[r1] = r10
                        r3[r0] = r11
                        java.lang.Object r10 = r4.ipc$dispatch(r5, r3)
                        tb.uct r10 = (tb.uct) r10
                        return r10
                    L_0x001b:
                        r4 = 0
                        if (r10 == 0) goto L_0x008d
                        if (r11 != 0) goto L_0x0022
                        goto L_0x008d
                    L_0x0022:
                        com.alibaba.fastjson.JSONObject r5 = r10.getTaskInfo()
                        java.lang.String r6 = "taskType"
                        java.lang.String r6 = r5.getString(r6)
                        boolean r7 = android.text.TextUtils.isEmpty(r6)
                        if (r7 == 0) goto L_0x0034
                        return r4
                    L_0x0034:
                        r6.hashCode()
                        r7 = -1
                        int r8 = r6.hashCode()
                        switch(r8) {
                            case -1422950858: goto L_0x0062;
                            case -973197092: goto L_0x0056;
                            case 711427452: goto L_0x004c;
                            case 1449359373: goto L_0x0041;
                            default: goto L_0x003f;
                        }
                    L_0x003f:
                        r0 = -1
                        goto L_0x006c
                    L_0x0041:
                        java.lang.String r0 = "bx_feature"
                        boolean r0 = r6.equals(r0)
                        if (r0 != 0) goto L_0x004a
                        goto L_0x003f
                    L_0x004a:
                        r0 = 3
                        goto L_0x006c
                    L_0x004c:
                        java.lang.String r1 = "python_solution"
                        boolean r1 = r6.equals(r1)
                        if (r1 != 0) goto L_0x006c
                        goto L_0x003f
                    L_0x0056:
                        java.lang.String r0 = "python"
                        boolean r0 = r6.equals(r0)
                        if (r0 != 0) goto L_0x0060
                        goto L_0x003f
                    L_0x0060:
                        r0 = 1
                        goto L_0x006c
                    L_0x0062:
                        java.lang.String r0 = "action"
                        boolean r0 = r6.equals(r0)
                        if (r0 != 0) goto L_0x006b
                        goto L_0x003f
                    L_0x006b:
                        r0 = 0
                    L_0x006c:
                        switch(r0) {
                            case 0: goto L_0x0088;
                            case 1: goto L_0x0082;
                            case 2: goto L_0x0076;
                            case 3: goto L_0x0070;
                            default: goto L_0x006f;
                        }
                    L_0x006f:
                        goto L_0x008d
                    L_0x0070:
                        tb.jm1 r4 = new tb.jm1
                        r4.<init>(r10, r11)
                        goto L_0x008d
                    L_0x0076:
                        com.taobao.android.behavir.solution.BHRSolution r0 = tb.dm1.a(r5)
                        if (r0 == 0) goto L_0x008d
                        tb.s6n r4 = new tb.s6n
                        r4.<init>(r0, r10, r11)
                        goto L_0x008d
                    L_0x0082:
                        tb.t6n r4 = new tb.t6n
                        r4.<init>(r10, r11)
                        goto L_0x008d
                    L_0x0088:
                        tb.p90 r4 = new tb.p90
                        r4.<init>(r10, r11)
                    L_0x008d:
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ucp.bridge.NativeDelegate.AnonymousClass15.getTask(com.taobao.android.behavir.config.BHRTaskConfigBase, com.taobao.android.behavir.event.BHREvent):tb.uct");
                }
            });
        }
    }

    private static void registerNotifyFatigueSummaryChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63323670", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NOTIFY_FATIGUE_SUMMARY_CHANGED, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.24
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass24 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$24");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        FatigueManager.NotifyFatigueSummaryChanged(jSONObject.getString("identifier"));
                    }
                }
            });
        }
    }

    private static void registerNotifyPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd17b4ec", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NOTIFY_POP, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass12 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$12");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                        return;
                    }
                    TLog.loge("UCPLOG registerNotifyPop", String.valueOf(jSONObject));
                    if (callback == null || jSONObject == null) {
                        TLog.loge("UCPLOG registerNotifyPop", "callback is null");
                    } else if (gwv.k("ucpNotifyPopOpt")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(ufu.KEY_TRACK_MAP);
                        if (jSONObject2 == null) {
                            TLog.loge("registerNotifyPop", "trackMap is null");
                            callback.close();
                            return;
                        }
                        jSONObject.put(ufu.KEY_URI_SET, (Object) TextUtils.join(",", jSONObject.getJSONArray(ufu.KEY_URI_SET)));
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("nativeCallback", (Object) callback);
                        jSONObject3.put("fromNative", (Object) Boolean.TRUE);
                        for (String str : jSONObject2.keySet()) {
                            jSONObject2.getJSONObject(str).put("nonSerializableData", (Object) new Utils.b(jSONObject3));
                        }
                        TLog.loge("registerNotifyPop", "sendBroadcast begin");
                        jem.d().j(jSONObject);
                        TLog.loge("registerNotifyPop", "sendBroadcast end");
                    } else {
                        Intent intent = new Intent(PopLayer.ACTION_PRE_DEAL_CUSTOM_TRIGGER);
                        intent.putExtra(ufu.KEY_URI_SET, TextUtils.join(",", jSONObject.getJSONArray(ufu.KEY_URI_SET)));
                        intent.putExtra(ufu.KEY_INDEX_MAP, jSONObject.getString(ufu.KEY_INDEX_MAP));
                        intent.putExtra(ufu.KEY_NO_ALG_FILTER_MAP, jSONObject.getString(ufu.KEY_NO_ALG_FILTER_MAP));
                        intent.putExtra("traceId", jSONObject.getString("traceId"));
                        JSONObject jSONObject4 = jSONObject.getJSONObject(ufu.KEY_TRACK_MAP);
                        if (jSONObject4 == null) {
                            TLog.loge("registerNotifyPop", "trackMap is null");
                            return;
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("nativeCallback", (Object) callback);
                        jSONObject5.put("fromNative", (Object) Boolean.TRUE);
                        for (String str2 : jSONObject4.keySet()) {
                            jSONObject4.getJSONObject(str2).put("nonSerializableData", (Object) new Utils.b(jSONObject5));
                        }
                        intent.putExtra(ufu.KEY_TRACK_MAP, jSONObject4);
                        TLog.loge("registerNotifyPop", "sendBroadcast begin");
                        km1.a(intent);
                        TLog.loge("registerNotifyPop", "sendBroadcast end");
                    }
                }
            });
        }
    }

    private static void registerNotifyPush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb96da8d", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NOTIFY_PUSH, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.ucp.bridge.NativeDelegate$7$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public class a extends b.a {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ NativeBroadcast.Callback b;

                    public a(NativeBroadcast.Callback callback) {
                        this.b = callback;
                    }

                    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$7$1");
                    }

                    @Override // tb.m02
                    public void e() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("4134b145", new Object[]{this});
                        } else {
                            this.b.close();
                        }
                    }
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$7");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null && callback != null) {
                        if (jSONObject.isEmpty()) {
                            callback.close();
                            return;
                        }
                        jSONObject.put(UCPManager.UCP_CALLBACK_ID, (Object) String.valueOf(callback.cache()));
                        if (UCPManager.j(jSONObject)) {
                            com.taobao.android.behavir.util.b.a(new a(callback), 10000L);
                        } else {
                            callback.close();
                        }
                    }
                }
            });
        }
    }

    private static void registerNotifyReachView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9365ced3", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NOTIFY_REACH_VIEW, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass11 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$11");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (callback == null) {
                        TLog.loge("UCPLOG registerNotifyReachView", "callback is null");
                    } else {
                        TLog.loge("UCP", "registerNotifyReachView", String.valueOf(jSONObject));
                        if (jSONObject == null) {
                            backflowException("ReachView", "InnerError", "reach view's param is empty", callback);
                            return;
                        }
                        String string = jSONObject.getString("reachViewKey");
                        if (TextUtils.isEmpty(string)) {
                            backflowException("ReachView", "InnerError", "reach view's key is empty", callback);
                            return;
                        }
                        dsu i = UCPManager.i(string);
                        if (i == null) {
                            backflowException("ReachView", "InnerError", "unregister reach view:" + string, callback);
                        } else if (!i.isEnabled()) {
                            backflowException("ReachView", "InnerError", "biz downgrade" + string, callback);
                        } else {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("trackInfo");
                            jSONObject2.put("callback", (Object) callback);
                            if (i.openReachView(jSONObject, jSONObject2) == UCPReachViewOpenState.TERMINATION) {
                                backflowException("ReachView", esu.KEY_TERMINAL, "biz terminal early", callback);
                            }
                        }
                    }
                }

                private void backflowException(String str, String str2, String str3, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38037f49", new Object[]{this, str, str2, str3, callback});
                        return;
                    }
                    TLog.loge("UCP", "registerNotifyReachView", str, str2, str3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("group", (Object) str);
                    jSONObject.put("key", (Object) str2);
                    jSONObject.put("errorCode", (Object) 3);
                    jSONObject.put("errorMessage", (Object) str3);
                    callback.callback(jSONObject, null);
                    callback.close();
                }
            });
        }
    }

    public static String registerResourceSchemeToCpp(String str, Object obj, String str2, JSONObject jSONObject, final com.taobao.android.upp.a aVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f07d8dff", new Object[]{str, obj, str2, jSONObject, aVar});
        }
        if (obj != null) {
            str3 = String.valueOf(obj.hashCode());
        } else {
            str3 = "kUCPCommonInstanceId";
        }
        Log.e("sijian", "registerResourceSchemeToCpp");
        NativeBroadcast.Callback callback = new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass18 r2, String str4, Object... objArr) {
                str4.hashCode();
                int hashCode = str4.hashCode();
                throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$18");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback2) {
                com.taobao.android.upp.a aVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback2});
                } else if (jSONObject2 != null && (aVar2 = com.taobao.android.upp.a.this) != null && aVar2.get() != null) {
                    UcpResponse ucpResponse = new UcpResponse();
                    ucpResponse.setModelData(jSONObject2);
                    com.taobao.android.upp.a.this.get().a(ucpResponse);
                }
            }
        };
        Map<String, NativeBroadcast.Callback> map = schemeCallbackMap;
        map.put(str2 + str3, callback);
        NativeBroadcast.register(NativeBroadcast.CALLBACK_TO_SCHEME, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass19 r2, String str4, Object... objArr) {
                str4.hashCode();
                int hashCode = str4.hashCode();
                throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$19");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback2});
                } else if (jSONObject2 != null) {
                    String string = jSONObject2.getString("schemeId");
                    String string2 = jSONObject2.getString("instanceId");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                    Map access$100 = NativeDelegate.access$100();
                    NativeBroadcast.Callback callback3 = (NativeBroadcast.Callback) access$100.get(string + string2);
                    if (callback3 != null) {
                        callback3.callback(jSONObject3, null);
                    }
                }
            }
        });
        return str2 + str3;
    }

    private static void registerRunModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff77b28", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.RUN_MODEL, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.ucp.bridge.NativeDelegate$9$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public class a implements ke4 {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ boolean f9826a;
                    public final /* synthetic */ NativeBroadcast.Callback b;

                    public a(AnonymousClass9 r1, boolean z, NativeBroadcast.Callback callback) {
                        this.f9826a = z;
                        this.b = callback;
                    }

                    @Override // tb.ke4
                    public void a(String str, String str2, String str3, JSONObject jSONObject) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("f84e7f62", new Object[]{this, str, str2, str3, jSONObject});
                            return;
                        }
                        this.b.callback(jSONObject, null);
                        this.b.close();
                    }

                    @Override // tb.ke4
                    public void b(String str, JSONObject jSONObject) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7c939cdb", new Object[]{this, str, jSONObject});
                            return;
                        }
                        if (this.f9826a) {
                            kxw.a(jSONObject);
                        }
                        this.b.callback(jSONObject, null);
                        this.b.close();
                    }
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$9");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null && callback != null) {
                        String string = jSONObject.getString(r4p.KEY_MODEL_NAME);
                        if (TextUtils.isEmpty(string)) {
                            string = jSONObject.getString("pythonName");
                        }
                        boolean booleanValue = jSONObject.getBooleanValue("isAlias");
                        JSONObject j = Utils.j(jSONObject.getJSONObject("input"));
                        Object obj = new Object();
                        Log.e("sijian", "run model：" + System.identityHashCode(obj) + "," + System.currentTimeMillis());
                        p6n.c(string, j.getInnerMap(), booleanValue, new a(this, booleanValue, callback), 0);
                    }
                }
            });
        }
    }

    private static void registerSimpleNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49cb3af", new Object[0]);
            return;
        }
        TLog.logd("BX", "SimpleNet", "registerSimpleNet listener");
        NativeBroadcast.register(NativeBroadcast.SIMPLE_NET_MODEL_DOWNLOAD, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.ucp.bridge.NativeDelegate$23$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public class a implements wv7.b {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ NativeBroadcast.Callback f9824a;

                public a(AnonymousClass23 r1, NativeBroadcast.Callback callback) {
                    this.f9824a = callback;
                }

                public void a(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("2b538f3f", new Object[]{this, str, str2});
                    } else if (this.f9824a != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("modelData", (Object) str2);
                        this.f9824a.callback(jSONObject, null);
                    }
                }
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass23 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$23");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    return;
                }
                TLog.logd("BX", "SimpleNet", "download");
                if (jSONObject != null) {
                    if (jSONObject.containsKey("url")) {
                        str = jSONObject.getString("url");
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        TLog.logd("BX", "SimpleNet", "download model: " + str);
                        wv7.e().d(str, new a(this, callback));
                    }
                }
            }
        });
    }

    private static void registerSwitchThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6426ca8", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.SWITCH_THREAD, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.10
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final int DEFAULT = 0;
                public final int MAIN_THREAD = 1;
                public final int BX_THREAD = 2;
                public final int NATIVEALGO_EXEC = 3;
                public final int UCP_THREAD = 4;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.ucp.bridge.NativeDelegate$10$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public class a extends b.a {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ NativeBroadcast.Callback b;

                    public a(NativeBroadcast.Callback callback) {
                        this.b = callback;
                    }

                    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$10$1");
                    }

                    @Override // tb.m02
                    public void e() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("4134b145", new Object[]{this});
                            return;
                        }
                        this.b.callback(null, null);
                        this.b.close();
                    }
                }

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.ucp.bridge.NativeDelegate$10$b */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public class b extends b.a {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ NativeBroadcast.Callback b;

                    public b(NativeBroadcast.Callback callback) {
                        this.b = callback;
                    }

                    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$10$2");
                    }

                    @Override // tb.m02
                    public void e() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("4134b145", new Object[]{this});
                            return;
                        }
                        this.b.callback(null, null);
                        this.b.close();
                    }
                }

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.ucp.bridge.NativeDelegate$10$c */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public class c extends b.a {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ NativeBroadcast.Callback b;

                    public c(NativeBroadcast.Callback callback) {
                        this.b = callback;
                    }

                    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$10$3");
                    }

                    @Override // tb.m02
                    public void e() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("4134b145", new Object[]{this});
                            return;
                        }
                        this.b.callback(null, null);
                        this.b.close();
                    }
                }

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.ucp.bridge.NativeDelegate$10$d */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public class d extends b.a {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ NativeBroadcast.Callback b;

                    public d(NativeBroadcast.Callback callback) {
                        this.b = callback;
                    }

                    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$10$4");
                    }

                    @Override // tb.m02
                    public void e() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("4134b145", new Object[]{this});
                            return;
                        }
                        this.b.callback(null, null);
                        this.b.close();
                    }
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$10");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null && callback != null) {
                        int intValue = jSONObject.getIntValue("type");
                        int intValue2 = jSONObject.getIntValue("delay");
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue != 4) {
                                        callback.callback(null, null);
                                        callback.close();
                                        return;
                                    }
                                } else if (intValue2 <= 0) {
                                    NativeAlgo.getExecuteHandler().post(new c(callback));
                                    return;
                                } else {
                                    NativeAlgo.getExecuteHandler().postDelayed(new d(callback), intValue2);
                                    return;
                                }
                            }
                            com.taobao.android.behavir.util.b.a(new b(callback), intValue2);
                            return;
                        }
                        com.taobao.android.behavir.util.b.f(new a(callback), intValue2);
                    }
                }
            });
        }
    }

    private static void registerUCPControlCenterUpdatePolicies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597d7af3", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.UPDATE_TAB_BAR_POLICIES, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$3");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        com.taobao.android.ucp.bridge.a.c(jSONObject.getString("policies"));
                    }
                }
            });
        }
    }

    public static void registerUCPPlansToCpp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1a8d2c", new Object[]{jSONObject});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.REGISTER_PLANS, jSONObject, null);
        }
    }

    private static void registerUpdateNextPageUtparam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40143067", new Object[0]);
        } else {
            NativeBroadcast.register("updateNextPageUtparam", new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass16 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$16");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        String string = jSONObject.getString("data");
                        if (!TextUtils.isEmpty(string)) {
                            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(string);
                        }
                    }
                }
            });
        }
    }

    private static void registerUpdatePushStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4716229f", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.UPDATE_PUSH_STATUS, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$6");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (callback != null) {
                        callback.callback(com.taobao.android.behavir.util.a.c("inAppPushStatus", Boolean.valueOf(Utils.b()), "systemPushStatus", Boolean.valueOf(Utils.e())), null);
                    }
                }
            });
        }
    }

    private static void registerUpdateTabBarNotification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8340bc", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.UPDATE_TAB_BAR, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$4");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    JSONObject jSONObject2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("updateInfo")) != null) {
                        TLog.loge("UCP", yl2.ACTION_UCP_TAB_CONFIG_CHANGE);
                        Intent intent = new Intent(yl2.ACTION_UCP_TAB_CONFIG_CHANGE);
                        intent.putExtra("data", jSONObject2);
                        km1.a(intent);
                    }
                }
            });
        }
    }

    private static void registerWaitForFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13538068", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.WAIT_FOR_FRAGMENT, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.ucp.bridge.NativeDelegate$17$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ NativeBroadcast.Callback f9823a;

                    public a(NativeBroadcast.Callback callback) {
                        this.f9823a = callback;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        TLog.loge(ActivityMonitor.TAG_DEBUG, "tryWaitForFragment");
                        this.f9823a.callback(null, null);
                        this.f9823a.close();
                    }
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass17 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeDelegate$17");
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (callback != null) {
                        ActivityMonitor.t(new a(callback));
                    }
                }
            });
        }
    }

    public static void removeSceneCallback(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e43e70", new Object[]{str, activity});
        } else {
            sceneCallbackMap.remove(getUCPCallbackKey(str, activity));
        }
    }

    public static void triggerServiceRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f5d703", new Object[]{str});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.TRIGGER_SERVICE, str != null ? com.taobao.android.behavir.util.a.b("fetchType", str) : null, null);
        }
    }

    public static String getJavaVariable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64522af8", new Object[]{new Integer(i)});
        }
        StaticVariableName[] values = StaticVariableName.values();
        if (i >= 0 && i < values.length) {
            switch (a.f9827a[values[i].ordinal()]) {
                case 1:
                    return String.valueOf((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis());
                case 2:
                    return hqv.q(ActivityMonitor.p()) + "," + hqv.q(ActivityMonitor.q());
                case 3:
                    return iaa.f21189a;
                case 4:
                    return y78.a();
                case 5:
                    l3e d = UCPViewManager.d("", "");
                    if (d != null) {
                        return d.getBizId();
                    }
                    return "";
                case 6:
                    return String.valueOf(PopStateMonitor.a().c());
                case 7:
                    String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                    return globalProperty == null ? "" : globalProperty;
                case 8:
                    return String.valueOf(gwv.v());
                case 9:
                    return gwv.p();
                case 10:
                    if (Utils.h()) {
                        try {
                            return ((t1c) n78.a(t1c.class)).queryCurrentVersionInfo().c;
                        } catch (Throwable unused) {
                        }
                    }
                    return "";
                case 11:
                    try {
                        if (((Boolean) j9t.e(Globals.getApplication(), SETTING_BIZ).b().d(SETTING_BIZ, SETTING_KEY, Boolean.TRUE, null)).booleanValue()) {
                            return "1";
                        }
                        return "0";
                    } catch (Throwable th) {
                        LogUtils.f(LogUtils.BX_BIZ_NAME, th.toString(), new Object[0]);
                        return "1";
                    }
            }
        }
        return "";
    }

    private static void doDyeInner(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403177ee", new Object[]{str, jSONObject});
            return;
        }
        for (String str2 : jSONObject.keySet()) {
            JSONArray jSONArray = jSONObject.getJSONArray(str2);
            if (jSONArray != null) {
                String str3 = str + "-" + str2;
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject f = Utils.f(jSONArray.getJSONObject(i));
                    ITinctOperater.getInstance().markUsed(str3, f.getString("id"), f.getString("v"), str, true);
                }
            }
        }
    }

    public static boolean nativeCheckFatigue(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc5cf2a1", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        String[] innerCheckFatigue = innerCheckFatigue(jSONObject.toString());
        if (innerCheckFatigue == null || innerCheckFatigue.length == 0) {
            return false;
        }
        String str = innerCheckFatigue[0];
        jSONObject2.put("msg", innerCheckFatigue.length >= 2 ? innerCheckFatigue[1] : null);
        return TextUtils.equals(str, "true");
    }

    public static boolean nativeTryTriggerUCPEvent(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e48eaf7", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        String[] innerTryTriggerUCPEvent = innerTryTriggerUCPEvent(jSONObject.toString());
        if (innerTryTriggerUCPEvent == null || innerTryTriggerUCPEvent.length == 0) {
            return false;
        }
        String str = innerTryTriggerUCPEvent[0];
        String str2 = innerTryTriggerUCPEvent.length >= 2 ? innerTryTriggerUCPEvent[1] : null;
        jSONObject2.put("popIndexId", (Object) str);
        jSONObject2.put("msg", (Object) str2);
        return TextUtils.isEmpty(str2);
    }
}
