package com.taobao.android.ucp.bridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.b;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NativeBroadcast {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_SCENE_CALLBACK = "addSceneCallback";
    public static final String ADD_USER_FEATURE = "AddUserFeature";
    public static final String BHX_BROADCAST = "bhxBroadcast";
    public static final String CALLBACK = "callback";
    public static final String CALLBACK_ID = "_id";
    public static final String CALLBACK_TO_SCENE = "callbackToScene";
    public static final String CALLBACK_TO_SCHEME = "callbackToScheme";
    public static final String CHANGE_TO_BX_STATUS = "changeToBXDBStatus";
    public static final String CHECK_DISPLAY = "checkDisplay";
    public static final String CHECK_FATIGUE = "checkFatigue";
    private static final String CLOSE_CPP_HANDLER = "closeCppHandler";
    private static final String CLOSE_JAVA_HANDLER = "closeUpperHandler";
    public static final String COMMIT_UM_ERROR = "commitUMError";
    public static final String CXX_JS_BRIDGE = "CXXJSBridge";
    public static final String DO_DYE = "doDey";
    public static final String FORCE_SAVE_DATA_TO_DB = "forceSaveDataToDB";
    private static final String HANDLE_JAVA_CALLBACK = "handleUpperCallback";
    public static final String MAKE_DECISION = "makeDecision";
    public static final String NON_UCP_TASK = "nonUcpTask";
    public static final String NOTIFY_FATIGUE_SUMMARY_CHANGED = "notifyFatigueSummaryChanged";
    public static final String NOTIFY_POP = "notifyPop";
    public static final String NOTIFY_PUSH = "notifyPush";
    public static final String NOTIFY_REACH_VIEW = "notifyReachView";
    public static final String PREDICT_DEVICE_POSTURE = "predictDevicePosture";
    public static final String PREDICT_GESTURE_POSTURE = "predictGesturePosture";
    public static final String PREDICT_MOVE_POSTURE = "predictMovePosture";
    public static final String PREVIEW = "preview";
    public static final String REGISTER_EXTERNAL_CONFIG = "registerExternalConfig";
    public static final String REGISTER_PLANS = "registerPlans";
    public static final String REGISTER_RESOURCE_SCHEME = "RegisterResourceScheme";
    public static final String REPORT_ACTION = "reportAction";
    public static final String REQUEST = "request";
    public static final String RUN_MODEL = "runModel";
    public static final String SIMPLE_NET_MODEL_CREATE = "simpleNetModelCreate";
    public static final String SIMPLE_NET_MODEL_DOWNLOAD = "simpleNetModelDownload";
    public static final String SIMPLE_NET_MODEL_INFERENCE = "simpleNetModelInference";
    public static final String SIMPLE_NET_MODEL_RELEASE = "simpleNetModelRelease";
    public static final String SIMPLE_NET_ORANGE_UPDATE = "simpleNetOrangeUpdate";
    public static final String SWITCH_THREAD = "switchThread";
    public static final String TRIGGER_SERVICE = "triggerService";
    public static final String UPDATE_NEXT_PAGE_UTPARAM = "updateNextPageUtparam";
    public static final String UPDATE_PUSH_STATUS = "updatePushStatus";
    public static final String UPDATE_TAB_BAR = "updateTabBar";
    public static final String UPDATE_TAB_BAR_POLICIES = "updateTabBarPolicies";
    public static final String UPDATE_TAB_BAR_STATE = "updateTabBarState";
    public static final String USER_LOGIN_IN_CHANGE = "loginChange";
    public static final String WAIT_FOR_FRAGMENT = "waitForFragment";
    private static final Map<String, List<Callback>> mCacheMap = new ConcurrentHashMap();
    private static final Map<Integer, Callback> mCallbackMap = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class Callback implements Closeable, Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(404750715);
        }

        public static Callback recover(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Callback) ipChange.ipc$dispatch("2b7c7588", new Object[]{new Integer(i)});
            }
            return (Callback) NativeBroadcast.access$000().remove(Integer.valueOf(i));
        }

        public int cache() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("deeea2fc", new Object[]{this})).intValue();
            }
            int hashCode = hashCode();
            NativeBroadcast.access$000().put(Integer.valueOf(hashCode), this);
            return hashCode;
        }

        public abstract void callback(JSONObject jSONObject, Callback callback);

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CppCallback extends Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long mId;

        static {
            t2o.a(404750716);
        }

        private CppCallback(long j) {
            this.mId = j;
        }

        public static Callback buildCppCallback(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Callback) ipChange.ipc$dispatch("99462dfd", new Object[]{new Long(j)});
            }
            if (j != 0) {
                return new CppCallback(j);
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(CppCallback cppCallback, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeBroadcast$CppCallback");
        }

        @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
        public void callback(JSONObject jSONObject, Callback callback) {
            String str;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
            } else if (this.mId != 0) {
                if (callback != null) {
                    i = callback.hashCode();
                }
                if (i > 0) {
                    NativeBroadcast.access$000().put(Integer.valueOf(i), callback);
                }
                try {
                    long j = this.mId;
                    if (jSONObject == null) {
                        str = null;
                    } else {
                        str = jSONObject.toString();
                    }
                    NativeBroadcast.access$100(j, str, i);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            long j = this.mId;
            if (j != 0) {
                NativeBroadcast.sendMessageFromJava(NativeBroadcast.CLOSE_CPP_HANDLER, com.taobao.android.behavir.util.a.b("_id", Long.valueOf(j)), null);
                this.mId = 0L;
            }
        }

        public void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            long j = this.mId;
            if (j != 0) {
                Log.e("sijian", "finalize:  " + j);
            }
            close();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ Callback d;

        public a(String str, JSONObject jSONObject, Callback callback) {
            this.b = str;
            this.c = jSONObject;
            this.d = callback;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeBroadcast$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (BHXCXXBaseBridge.LoadCXXLib()) {
                NativeBroadcast.innerCallback(this.b, this.c, this.d);
            } else {
                UtUtils.e("UCP", UtUtils.g(), TLogTracker.SCENE_EXCEPTION, "sendMessageFromJavaLoadError", this.b, "");
                try {
                    Callback callback = this.d;
                    if (callback != null) {
                        callback.callback(null, null);
                    }
                } catch (Throwable unused) {
                    UtUtils.e("UCP", UtUtils.g(), TLogTracker.SCENE_EXCEPTION, "sendMessageFromJavaLoadErrorCatch", this.b, "");
                }
            }
        }
    }

    public static /* synthetic */ Map access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return mCallbackMap;
    }

    public static /* synthetic */ void access$100(long j, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9023ed", new Object[]{new Long(j), str, new Integer(i)});
        } else {
            handleNativeCallback(j, str, i);
        }
    }

    public static /* synthetic */ void access$200(int i, JSONObject jSONObject, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6628e670", new Object[]{new Integer(i), jSONObject, callback});
        } else {
            handleJavaCallback(i, jSONObject, callback);
        }
    }

    public static void cxxJSBridge(String str, String str2, String str3, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d949a2f7", new Object[]{str, str2, str3, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pluginName", (Object) str);
        jSONObject.put("bridgeName", (Object) str2);
        jSONObject.put("params", (Object) str3);
        sendMessageFromJava(CXX_JS_BRIDGE, jSONObject, new Callback() { // from class: com.taobao.android.ucp.bridge.NativeBroadcast.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str4, Object... objArr) {
                str4.hashCode();
                int hashCode = str4.hashCode();
                throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeBroadcast$2");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, Callback callback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback});
                } else if (jSONObject2 == null) {
                    WVCallBackContext.this.error();
                } else {
                    nsw nswVar = new nsw();
                    nswVar.b("data", jSONObject2.toJSONString());
                    WVCallBackContext.this.success(nswVar);
                }
            }
        });
    }

    private static void handleJavaCallback(int i, JSONObject jSONObject, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26496e0d", new Object[]{new Integer(i), jSONObject, callback});
            return;
        }
        Callback callback2 = mCallbackMap.get(Integer.valueOf(i));
        if (callback2 != null) {
            try {
                callback2.callback(jSONObject, callback);
            } catch (Throwable unused) {
            }
        }
    }

    private static void handleNativeCallback(long j, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bd7e00", new Object[]{new Long(j), str, new Integer(i)});
        } else if (BHXCXXBaseBridge.LoadCXXLib()) {
            nativeHandleNativeCallback(j, str, i);
        }
    }

    public static void innerCallback(String str, JSONObject jSONObject, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2c43ce", new Object[]{str, jSONObject, callback});
            return;
        }
        List<Callback> list = mCacheMap.get(str);
        if (list != null) {
            try {
                for (Callback callback2 : list) {
                    callback2.callback(jSONObject, callback);
                }
            } catch (Throwable unused) {
                if (callback != null) {
                    callback.close();
                }
            }
        } else {
            UtUtils.e("UCP", UtUtils.g(), TLogTracker.SCENE_EXCEPTION, "sendMessageFromJavaReceiversEmpty", str, "");
            if (callback != null) {
                try {
                    callback.callback(null, null);
                } catch (Throwable unused2) {
                    UtUtils.e("UCP", UtUtils.g(), TLogTracker.SCENE_EXCEPTION, "sendMessageFromJavaReceiversEmptyCatch", str, "");
                }
            }
        }
    }

    private static native void nativeHandleNativeCallback(long j, String str, int i);

    public static void register(String str, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90698d5e", new Object[]{str, callback});
        } else if (!TextUtils.isEmpty(str) && callback != null) {
            Map<String, List<Callback>> map = mCacheMap;
            List<Callback> list = map.get(str);
            if (list != null) {
                list.add(callback);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(callback);
            map.put(str, arrayList);
        }
    }

    public static void registerUCPNativeBroadcast(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708cfb88", new Object[]{str, new Long(j)});
        } else {
            register(str, CppCallback.buildCppCallback(j));
        }
    }

    private static void sendMessage(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1c4f8a", new Object[]{str, str2, new Long(j)});
            return;
        }
        List<Callback> list = mCacheMap.get(str);
        if (list != null) {
            try {
                JSONObject parseObject = TextUtils.isEmpty(str2) ? null : JSON.parseObject(str2);
                Callback buildCppCallback = CppCallback.buildCppCallback(j);
                for (Callback callback : list) {
                    callback.callback(parseObject, buildCppCallback);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void sendMessageFromJava(String str, JSONObject jSONObject, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf6851e", new Object[]{str, jSONObject, callback});
        } else if (!BHXCXXBaseBridge.checkCXXLib()) {
            UtUtils.e("UCP", UtUtils.g(), TLogTracker.SCENE_EXCEPTION, "sendMessageFromJava", str, "");
            b.b(new a(str, jSONObject, callback));
        } else {
            innerCallback(str, jSONObject, callback);
        }
    }

    static {
        t2o.a(404750710);
        register(CLOSE_JAVA_HANDLER, new Callback() { // from class: com.taobao.android.ucp.bridge.NativeBroadcast.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeBroadcast$3");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject, Callback callback) {
                int intValue;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                } else if (jSONObject != null && (intValue = jSONObject.getIntValue("_id")) != 0) {
                    NativeBroadcast.access$000().remove(Integer.valueOf(intValue));
                }
            }
        });
        register(HANDLE_JAVA_CALLBACK, new Callback() { // from class: com.taobao.android.ucp.bridge.NativeBroadcast.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/bridge/NativeBroadcast$4");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject, Callback callback) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                } else if (jSONObject != null) {
                    NativeBroadcast.access$200(jSONObject.getIntValue("_id"), jSONObject, callback);
                }
            }
        });
    }
}
