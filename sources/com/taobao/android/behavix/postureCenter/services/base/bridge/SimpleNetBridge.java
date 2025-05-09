package com.taobao.android.behavix.postureCenter.services.base.bridge;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.b;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.uc.webview.export.extension.UCClient;
import java.util.HashMap;
import java.util.Map;
import tb.bjj;
import tb.cet;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SimpleNetBridge extends BHXCXXBaseBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODEL_ORANGE_NAMESPACE = "bx_simple_net";
    private static final String TAG = "SimpleNetBridge";
    private static boolean cModuleHasInit = false;
    private static SimpleNetBridge instance = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ModelBooleanCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ModelBooleanCallBack f6457a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0337a extends b.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ boolean b;

            public C0337a(boolean z) {
                this.b = z;
            }

            public static /* synthetic */ Object ipc$super(C0337a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge$1$1");
            }

            @Override // tb.m02
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                TLog.logd("BX", SimpleNetBridge.TAG, "createSimpleNetModel callback: " + this.b);
                a.this.f6457a.onSuccess(this.b);
            }
        }

        public a(ModelBooleanCallBack modelBooleanCallBack) {
            this.f6457a = modelBooleanCallBack;
        }

        @Override // com.taobao.android.behavix.postureCenter.services.base.bridge.ModelBooleanCallBack
        public void onSuccess(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
            } else {
                com.taobao.android.behavir.util.b.e(new C0337a(z));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6458a;
        public final /* synthetic */ ModelBooleanCallBack b;

        public b(String str, ModelBooleanCallBack modelBooleanCallBack) {
            this.f6458a = str;
            this.b = modelBooleanCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SimpleNetBridge.access$000(this.f6458a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements bjj<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bjj f6459a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a extends b.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Float[] b;

            public a(Float[] fArr) {
                this.b = fArr;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge$3$1");
            }

            @Override // tb.m02
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                } else {
                    c.this.f6459a.onSuccess(this.b);
                }
            }
        }

        public c(bjj bjjVar) {
            this.f6459a = bjjVar;
        }

        public void a(Float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99534c4c", new Object[]{this, fArr});
            } else {
                com.taobao.android.behavir.util.b.e(new a(fArr));
            }
        }

        @Override // tb.bjj
        public /* synthetic */ void onSuccess(Float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, fArr});
            } else {
                a(fArr);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6460a;
        public final /* synthetic */ float[] b;
        public final /* synthetic */ bjj c;

        public d(String str, float[] fArr, bjj bjjVar) {
            this.f6460a = str;
            this.b = fArr;
            this.c = bjjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SimpleNetBridge.access$100(this.f6460a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge$5");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (BHXCXXBaseBridge.checkCXXLib()) {
                SimpleNetBridge.access$200();
                TLog.logd("BX", SimpleNetBridge.TAG, "init cModule success");
            } else {
                TLog.logd("BX", SimpleNetBridge.TAG, "init cModule error: so load error");
            }
        }
    }

    static {
        t2o.a(404750571);
    }

    public static /* synthetic */ void access$000(String str, ModelBooleanCallBack modelBooleanCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3349b3de", new Object[]{str, modelBooleanCallBack});
        } else {
            createSimpleNetModel(str, modelBooleanCallBack);
        }
    }

    public static /* synthetic */ void access$100(String str, float[] fArr, bjj bjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f5117b", new Object[]{str, fArr, bjjVar});
        } else {
            modelInference(str, fArr, bjjVar);
        }
    }

    public static /* synthetic */ void access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            initOrangeConfig();
        }
    }

    public static void classifyGestures(float[] fArr, final bjj<Integer> bjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c847968", new Object[]{fArr, bjjVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(UCClient.UI_PARAMS_KEY_GESTURE, (Object) fArr);
        NativeBroadcast.sendMessageFromJava(NativeBroadcast.PREDICT_GESTURE_POSTURE, jSONObject, new NativeBroadcast.Callback() { // from class: com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge$10");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback});
                } else if (bjj.this != null && jSONObject2 != null && jSONObject2.containsKey("result")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("result");
                    Integer[] numArr = new Integer[jSONArray.size()];
                    for (int i = 0; i < jSONArray.size(); i++) {
                        numArr[i] = jSONArray.getInteger(i);
                    }
                    bjj.this.onSuccess(numArr);
                }
            }
        });
    }

    public static final void createModelWithCheck(String str, ModelBooleanCallBack modelBooleanCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac45983", new Object[]{str, modelBooleanCallBack});
            return;
        }
        initWithCheck();
        if (BHXCXXBaseBridge.checkCXXLib()) {
            if (Utils.c()) {
                modelBooleanCallBack = new a(modelBooleanCallBack);
            }
            cet.d().g(new b(str, modelBooleanCallBack));
            return;
        }
        if (modelBooleanCallBack != null) {
            modelBooleanCallBack.onSuccess(false);
        }
        TLog.logd("BX", TAG, "createSimpleNetModel error: so load error");
    }

    private static void createSimpleNetModel(String str, final ModelBooleanCallBack modelBooleanCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a523fe8", new Object[]{str, modelBooleanCallBack});
            return;
        }
        TLog.logd("BX", TAG, "createSimpleNetModel");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r4p.KEY_MODEL_NAME, (Object) str);
        NativeBroadcast.sendMessageFromJava(NativeBroadcast.SIMPLE_NET_MODEL_CREATE, jSONObject, new NativeBroadcast.Callback() { // from class: com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge$6");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback});
                } else if (ModelBooleanCallBack.this == null) {
                } else {
                    if (jSONObject2 == null || !jSONObject2.containsKey("createResult")) {
                        ModelBooleanCallBack.this.onSuccess(false);
                    } else {
                        ModelBooleanCallBack.this.onSuccess(jSONObject2.getBooleanValue("createResult"));
                    }
                }
            }
        });
    }

    public static SimpleNetBridge getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleNetBridge) ipChange.ipc$dispatch("403b79d", new Object[0]);
        }
        if (instance == null) {
            synchronized (SimpleNetBridge.class) {
                try {
                    if (instance == null) {
                        instance = new SimpleNetBridge();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private static void initOrangeConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd77c0c7", new Object[0]);
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(MODEL_ORANGE_NAMESPACE);
        if (configs == null) {
            configs = new HashMap<>();
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(configs);
        jSONObject.put("config", (Object) jSONObject2);
        NativeBroadcast.sendMessageFromJava(NativeBroadcast.SIMPLE_NET_ORANGE_UPDATE, jSONObject, null);
    }

    public static void initWithCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d41839", new Object[0]);
        } else {
            com.taobao.android.behavir.util.b.a(new e(), 5000L);
        }
    }

    public static /* synthetic */ Object ipc$super(SimpleNetBridge simpleNetBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge");
    }

    private static void modelInference(String str, float[] fArr, final bjj bjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774367dc", new Object[]{str, fArr, bjjVar});
            return;
        }
        TLog.logd("BX", TAG, "ModelInference");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r4p.KEY_MODEL_NAME, (Object) str);
        jSONObject.put("input", (Object) fArr);
        jSONObject.put("size", (Object) Integer.valueOf(fArr.length));
        NativeBroadcast.sendMessageFromJava(NativeBroadcast.SIMPLE_NET_MODEL_INFERENCE, jSONObject, new NativeBroadcast.Callback() { // from class: com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge$7");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback});
                } else if (bjj.this != null && jSONObject2 != null && jSONObject2.containsKey("result")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("result");
                    Float[] fArr2 = new Float[jSONArray.size()];
                    for (int i = 0; i < jSONArray.size(); i++) {
                        fArr2[i] = Float.valueOf(Float.parseFloat(jSONArray.getString(i)));
                    }
                    bjj.this.onSuccess(fArr2);
                }
            }
        });
    }

    public static void modelInferenceWithCheck(String str, float[] fArr, bjj<Float> bjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2357eba", new Object[]{str, fArr, bjjVar});
            return;
        }
        initWithCheck();
        if (BHXCXXBaseBridge.checkCXXLib()) {
            if (Utils.c()) {
                bjjVar = new c(bjjVar);
            }
            cet.d().g(new d(str, fArr, bjjVar));
            return;
        }
        if (bjjVar != null) {
            bjjVar.onSuccess(new Float[0]);
        }
        TLog.logd("BX", TAG, "createSimpleNetModel error: so load error");
    }

    public static void predictDeviceStatusAsync(float[][] fArr, final bjj<Integer> bjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc71e6a", new Object[]{fArr, bjjVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gravity", (Object) fArr);
        NativeBroadcast.sendMessageFromJava(NativeBroadcast.PREDICT_DEVICE_POSTURE, jSONObject, new NativeBroadcast.Callback() { // from class: com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge$9");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback});
                } else if (bjj.this != null && jSONObject2 != null && jSONObject2.containsKey("result")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("result");
                    Integer[] numArr = new Integer[jSONArray.size()];
                    for (int i = 0; i < jSONArray.size(); i++) {
                        numArr[i] = jSONArray.getInteger(i);
                    }
                    bjj.this.onSuccess(numArr);
                }
            }
        });
    }

    public static void predictMoveStatusAsync(float[][] fArr, final bjj<Integer> bjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde2e78f", new Object[]{fArr, bjjVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("acc", (Object) fArr);
        NativeBroadcast.sendMessageFromJava(NativeBroadcast.PREDICT_MOVE_POSTURE, jSONObject, new NativeBroadcast.Callback() { // from class: com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass11 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge$11");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback});
                } else if (bjj.this != null && jSONObject2 != null && jSONObject2.containsKey("result")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("result");
                    Integer[] numArr = new Integer[jSONArray.size()];
                    for (int i = 0; i < jSONArray.size(); i++) {
                        numArr[i] = jSONArray.getInteger(i);
                    }
                    bjj.this.onSuccess(numArr);
                }
            }
        });
    }

    public static final void releaseModelWithCheck(String str, ModelBooleanCallBack modelBooleanCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48656b8e", new Object[]{str, modelBooleanCallBack});
        } else if (BHXCXXBaseBridge.checkCXXLib()) {
            releaseSimpleModel(str, modelBooleanCallBack);
        } else {
            TLog.logd("BX", TAG, "createSimpleNetModel error: so load error");
        }
    }

    private static void releaseSimpleModel(String str, final ModelBooleanCallBack modelBooleanCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a646efe", new Object[]{str, modelBooleanCallBack});
            return;
        }
        TLog.logd("BX", TAG, "createSimpleNetModel");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r4p.KEY_MODEL_NAME, (Object) str);
        NativeBroadcast.sendMessageFromJava(NativeBroadcast.SIMPLE_NET_MODEL_RELEASE, jSONObject, new NativeBroadcast.Callback() { // from class: com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/base/bridge/SimpleNetBridge$8");
            }

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback});
                } else if (ModelBooleanCallBack.this == null) {
                } else {
                    if (jSONObject2 == null || !jSONObject2.containsKey("releaseResult")) {
                        ModelBooleanCallBack.this.onSuccess(false);
                    } else {
                        ModelBooleanCallBack.this.onSuccess(jSONObject2.getBooleanValue("releaseResult"));
                    }
                }
            }
        });
    }
}
