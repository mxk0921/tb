package com.taobao.android.behavix.bhxbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.testutils.JsBridgeBehaviXConfig;
import java.util.ArrayList;
import java.util.Map;
import tb.eqv;
import tb.ly1;
import tb.m02;
import tb.o0r;
import tb.t2o;
import tb.u82;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BHXCXXInnerBridge extends BHXCXXBaseBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean sHasUpdateOrange = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends m02 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Map map) {
            super(str);
            this.b = map;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/bhxbridge/BHXCXXInnerBridge$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            BHXCXXBaseBridge.setupBHXCpp();
            if (BHXCXXBaseBridge.isNativeLibraryLoaded) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.b.keySet()) {
                    if (!o0r.allCppOrangeBlackKeys.contains(str)) {
                        arrayList.add(str);
                    }
                }
                int size = arrayList.size();
                if (size != 0) {
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    String[] strArr2 = new String[size];
                    for (int i = 0; i < size; i++) {
                        strArr2[i] = (String) this.b.get(strArr[i]);
                    }
                    try {
                        BHXCXXInnerBridge.access$000(strArr, strArr2);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6453a;

        public b(String str) {
            this.f6453a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BHXCXXInnerBridge.access$100(this.f6453a);
            }
        }
    }

    static {
        t2o.a(404750509);
    }

    public static /* synthetic */ void access$000(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818c8bd7", new Object[]{strArr, strArr2});
        } else {
            nativeNotifyNativeOrangeUpdate(strArr, strArr2);
        }
    }

    public static /* synthetic */ void access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            nativeExecMockInterface(str);
        }
    }

    public static void directlySaveFeaturesToBUFS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303dc4fc", new Object[]{str});
        } else if (BHXCXXBaseBridge.isNativeLibraryLoaded && !TextUtils.isEmpty(str)) {
            nativeDirectlySaveFeaturesToBUFS(str);
        }
    }

    public static void execMockInterface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9751cf", new Object[]{str});
        } else if (BHXCXXBaseBridge.isNativeLibraryLoaded && !TextUtils.isEmpty(str)) {
            u82.f(new b(str), eqv.TAG, "internal", "ExecMockInterface", null);
        }
    }

    public static JSONObject getMatchConditionConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("33e9e8d5", new Object[0]);
        }
        try {
            return JSON.parseObject(nativeGetMatchConditionConfig());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getNativeThreadTidByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1672d63e", new Object[]{str})).intValue();
        }
        return nativeGetTid(str);
    }

    public static void initOrangeByCacheValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f4dfcb", new Object[0]);
        } else if (!sHasUpdateOrange) {
            notifyOrangeUpdate(v82.g(), true);
        }
    }

    public static /* synthetic */ Object ipc$super(BHXCXXInnerBridge bHXCXXInnerBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/bhxbridge/BHXCXXInnerBridge");
    }

    private static native void nativeDirectlySaveFeaturesToBUFS(String str);

    private static native void nativeExecMockInterface(String str);

    private static native String nativeGetMatchConditionConfig();

    private static native int nativeGetTid(String str);

    private static native void nativeNotifyNativeOrangeUpdate(String[] strArr, String[] strArr2);

    private static native void nativeTransferBaseNodeToBUFS(String str, String str2);

    private static native void nativeTransferFeatureToBUFS(String str, String str2);

    private static native void nativeUpdataFeatureByBUFSProtocol(String str, String str2);

    private static native void nativeUpdateCXXCttpUploadState(boolean z, String str);

    public static void transferBaseNodeToBUFS(ly1 ly1Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e095932", new Object[]{ly1Var, str});
        } else if (BHXCXXBaseBridge.isNativeLibraryLoaded && ly1Var != null && !TextUtils.isEmpty(str)) {
            Map<String, Object> a2 = ly1Var.a();
            if (!a2.isEmpty()) {
                JSONObject jSONObject = new JSONObject(a2);
                if (!jSONObject.isEmpty()) {
                    String jSONString = jSONObject.toJSONString();
                    if (!TextUtils.isEmpty(jSONString)) {
                        nativeTransferBaseNodeToBUFS(jSONString, str);
                    }
                }
            }
        }
    }

    public static void transferFeatureToBUFS(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3a004d", new Object[]{jSONObject, str});
        } else if (BHXCXXBaseBridge.isNativeLibraryLoaded && !jSONObject.isEmpty() && !TextUtils.isEmpty(str)) {
            nativeTransferFeatureToBUFS(jSONObject.toJSONString(), str);
        }
    }

    public static void updataFeatureByBUFSProtocol(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e33db", new Object[]{str, str2});
        } else if (BHXCXXBaseBridge.isNativeLibraryLoaded && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            nativeUpdataFeatureByBUFSProtocol(str, str2);
        }
    }

    public static void updateCXXCttpUploadState(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997b4fee", new Object[]{new Boolean(z), str});
        } else if (BHXCXXBaseBridge.isNativeLibraryLoaded && !TextUtils.isEmpty(str) && JsBridgeBehaviXConfig.isEnableRealTimeMTopDebug()) {
            nativeUpdateCXXCttpUploadState(z, str);
        }
    }

    public static void notifyOrangeUpdate(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68254f6", new Object[]{map, new Boolean(z)});
            return;
        }
        sHasUpdateOrange = true;
        a aVar = new a("OrangeUpdate", map);
        if (!z || !v82.n(o0r.c.K_ENABLE_SWITCH_FIRST, false)) {
            u82.g(aVar);
        } else {
            aVar.run();
        }
    }
}
