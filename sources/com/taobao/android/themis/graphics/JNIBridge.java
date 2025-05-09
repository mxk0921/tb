package com.taobao.android.themis.graphics;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.themis.graphics.IRiverBackend;
import com.taobao.android.themis.graphics.a;
import com.taobao.android.themis.graphics.audio.AudioContextFactory;
import com.taobao.android.themis.graphics.audio.AudioContextProxy;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.lcn;
import tb.pmi;
import tb.sds;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JNIBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "themis_gfx:JNIBridge";
    private static n sLibraryLoadedListener;
    private boolean isAttached;
    private final i mAPIDispatcher;
    private AudioContextFactory mAduioContextFactory;
    private boolean mCallAsyncAPIWithoutDecode;
    private Long mNativeInstancePtr;
    private j mOnAPIStatsListener;
    private k mOnJSErrorListener;
    private l mOnJSMemoryListener;
    private m mOnJSNotResponseListener;
    private o mOnSourceMapListener;
    private final Handler mUIHandler = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9640a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f9640a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                JNIBridge.access$300(JNIBridge.this).c(this.f9640a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9641a;

        public b(String str) {
            this.f9641a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JNIBridge.access$400(JNIBridge.this).c(this.f9641a);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx|memory", "failed to execute notifyLargeJSMemoryAllocated because of error:" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9642a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public c(int i, int i2, int i3, String str) {
            this.f9642a = i;
            this.b = i2;
            this.c = i3;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JNIBridge.access$400(JNIBridge.this).b(this.f9642a, this.b, this.c, this.d);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx|memory", "failed to execute notifyJSOutOfMemoryException because of error:" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9643a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public d(int i, int i2, int i3, int i4) {
            this.f9643a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JNIBridge.access$400(JNIBridge.this).a(this.f9643a, this.b, this.c, this.d);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx|memory", "failed to execute notifyJSMemoryUsageWhenExit because of error:" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9644a;

        public e(String str) {
            this.f9644a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JNIBridge.access$500(JNIBridge.this).b(this.f9644a);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx|jnr", "failed to execute notifyJSThreadNotResponse because of error:" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9645a;
        public final /* synthetic */ double b;

        public f(int i, double d) {
            this.f9645a = i;
            this.b = d;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JNIBridge.access$500(JNIBridge.this).a(this.f9645a, this.b);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx|jnr", "failed to execute notifyJSJankCountWhenExit because of error:" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ double f9646a;
        public final /* synthetic */ double b;
        public final /* synthetic */ double c;
        public final /* synthetic */ List d;
        public final /* synthetic */ List e;
        public final /* synthetic */ HashMap f;

        public g(double d, double d2, double d3, List list, List list2, HashMap hashMap) {
            this.f9646a = d;
            this.b = d2;
            this.c = d3;
            this.d = list;
            this.e = list2;
            this.f = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JNIBridge.access$600(JNIBridge.this).a(this.f9646a, this.b, this.c, this.d, this.e, this.f);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx|jnr", "failed to execute notifyAPIStatsReceived because of error:" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface i {
        void a(ByteBuffer byteBuffer, h hVar);

        void b(String str, h hVar);

        void c(JSONObject jSONObject, h hVar);

        JSONObject d(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface j {
        void a(double d, double d2, double d3, List<String> list, List<String> list2, Map<String, Double> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface k {
        void c(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface l {
        void a(int i, int i2, int i3, int i4);

        void b(int i, int i2, int i3, String str);

        void c(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface m {
        void a(int i, double d);

        void b(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface n {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface o {
        String a(String str);
    }

    public JNIBridge(i iVar, boolean z) {
        this.mAPIDispatcher = iVar;
        this.mCallAsyncAPIWithoutDecode = z;
        TMSGraphicsLibraryInit.e();
    }

    public static /* synthetic */ boolean access$000(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("895bafca", new Object[]{jNIBridge})).booleanValue();
        }
        return jNIBridge.isAttached;
    }

    public static /* synthetic */ void access$100(JNIBridge jNIBridge, long j2, long j3, ByteBuffer byteBuffer, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42dc303", new Object[]{jNIBridge, new Long(j2), new Long(j3), byteBuffer, bArr, new Boolean(z)});
        } else {
            jNIBridge.nativeInvokeJSCallbackInMainContextFast(j2, j3, byteBuffer, bArr, z);
        }
    }

    public static /* synthetic */ void access$200(JNIBridge jNIBridge, long j2, long j3, String str, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2aa49b", new Object[]{jNIBridge, new Long(j2), new Long(j3), str, bArr, new Boolean(z)});
        } else {
            jNIBridge.nativeInvokeJSCallbackInMainContext(j2, j3, str, bArr, z);
        }
    }

    public static /* synthetic */ k access$300(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("f0ae9bac", new Object[]{jNIBridge});
        }
        return jNIBridge.mOnJSErrorListener;
    }

    public static /* synthetic */ l access$400(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("1a70165a", new Object[]{jNIBridge});
        }
        return jNIBridge.mOnJSMemoryListener;
    }

    public static /* synthetic */ m access$500(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("19632f7e", new Object[]{jNIBridge});
        }
        return jNIBridge.mOnJSNotResponseListener;
    }

    public static /* synthetic */ j access$600(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("7a070ca1", new Object[]{jNIBridge});
        }
        return jNIBridge.mOnAPIStatsListener;
    }

    private boolean isAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue();
        }
        if (!this.isAttached || this.mNativeInstancePtr == null) {
            return false;
        }
        return true;
    }

    private native long nativeAttach(JNIBridge jNIBridge, String str, int i2, String str2, boolean z);

    private native void nativeCreateAppContext(long j2, HashMap<String, String> hashMap);

    private native boolean nativeDetach(long j2);

    private native void nativeDispatchPointerDataPacket(long j2, ByteBuffer byteBuffer, int i2);

    private native void nativeExecuteByteCodeInAppContext(long j2, byte[] bArr, String str, String str2);

    private native void nativeExecuteByteCodeInCurrentThread(long j2, byte[] bArr, String str, String str2);

    private native void nativeExecuteByteCodeInMainContext(long j2, byte[] bArr, String str);

    private native void nativeExecuteScriptInAppContext(long j2, String str, String str2, String str3);

    private native void nativeExecuteScriptInCurrentThread(long j2, String str, String str2, String str3);

    private native void nativeExecuteScriptInMainContext(long j2, String str, String str2);

    private native void nativeFireGlobalEventInMainContext(long j2, String str, String str2, boolean z);

    public static native long nativeGenTraceId();

    private native boolean nativeHasRegisterGlobalEventInMainContext(long j2, String str);

    private native void nativeInvokeJSCallbackInMainContext(long j2, long j3, String str, byte[] bArr, boolean z);

    private native void nativeInvokeJSCallbackInMainContextFast(long j2, long j3, ByteBuffer byteBuffer, byte[] bArr, boolean z);

    private native void nativeInvokeJSMethodInAppContext(long j2, String str, JSParam[] jSParamArr);

    private native void nativeInvokeJSMethodInMainContext(long j2, String str, JSParam[] jSParamArr);

    private native void nativeOrangeConfigUpdate(String str);

    public static native void nativeTimelineStart();

    public static native void nativeTimelineStop();

    public static native void nativeTraceAsyncBegin0(String str, long j2);

    public static native void nativeTraceAsyncBegin1(String str, long j2, String str2, String str3);

    public static native void nativeTraceAsyncEnd0(String str, long j2);

    public static native void nativeTraceAsyncEnd1(String str, long j2, String str2, String str3);

    public static native void nativeTraceBegin0(String str);

    public static native void nativeTraceBegin1(String str, String str2, String str3);

    public static native void nativeTraceBegin2(String str, String str2, String str3, String str4, String str5);

    public static native void nativeTraceEnd(String str);

    public static native void nativeTraceFlowBegin(String str, long j2);

    public static native void nativeTraceFlowEnd(String str, long j2);

    public static native void nativeTraceFlowStep(String str, long j2);

    public static void onLibraryLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca188908", new Object[0]);
            return;
        }
        n nVar = sLibraryLoadedListener;
        if (nVar != null) {
            ((a.C0497a) nVar).a();
        }
    }

    public static void setOnLibraryLoadedListener(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a624b78", new Object[]{nVar});
        } else {
            sLibraryLoadedListener = nVar;
        }
    }

    public boolean attach(String str, IRiverBackend.EngineType engineType, String str2, boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98920080", new Object[]{this, str, engineType, str2, new Boolean(z)})).booleanValue();
        }
        if (this.isAttached) {
            return false;
        }
        if (engineType == IRiverBackend.EngineType.Qking) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        this.mNativeInstancePtr = Long.valueOf(nativeAttach(this, str, i2, str2, z));
        this.isAttached = true;
        return true;
    }

    public void callAriverAPI(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33627422", new Object[]{this, str, new Long(j2)});
        } else if (this.mAPIDispatcher != null && !TextUtils.isEmpty(str)) {
            try {
                sds.f("Java_callAriverAPI", "token", Long.toString(j2));
                if (this.mCallAsyncAPIWithoutDecode) {
                    i iVar = this.mAPIDispatcher;
                    if (str == null) {
                        str = "";
                    }
                    iVar.b(str, new h(this.mNativeInstancePtr, this, j2));
                } else {
                    sds.e("Java_callAriverAPI_ParseJSON");
                    JSONObject parseObject = JSON.parseObject(str);
                    sds.h("Java_callAriverAPI_ParseJSON");
                    this.mAPIDispatcher.c(parseObject, new h(this.mNativeInstancePtr, this, j2));
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public void callAriverAPIFastPath(ByteBuffer byteBuffer, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e491eb2c", new Object[]{this, byteBuffer, new Long(j2)});
        } else if (this.mAPIDispatcher != null && byteBuffer != null) {
            try {
                sds.f("Java_callAriverAPIFast", "token", Long.toString(j2));
                if (this.mCallAsyncAPIWithoutDecode) {
                    this.mAPIDispatcher.a(byteBuffer, new h(this.mNativeInstancePtr, this, j2, true));
                } else {
                    this.mAPIDispatcher.c(pmi.a().b(byteBuffer), new h(this.mNativeInstancePtr, this, j2, true));
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public String callAriverAPISync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dae9b63", new Object[]{this, str});
        }
        if (this.mAPIDispatcher == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            sds.e("Java_callAriverAPISync");
            sds.e("Java_callAriverAPISync_ParseJSON");
            JSONObject parseObject = JSON.parseObject(str);
            sds.h("Java_callAriverAPISync_ParseJSON");
            JSONObject d2 = this.mAPIDispatcher.d(parseObject);
            if (d2 != null) {
                sds.e("Java_callAriverAPISync_ResultToJSONString");
                String json = d2.toString();
                sds.h("Java_callAriverAPISync_ResultToJSONString");
                return json;
            }
        } catch (Throwable th) {
            try {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx|invokeJSCallback", "failed to execute callAriverAPISync because of error params:" + th.getMessage());
            } finally {
                sds.h("Java_callAriverAPISync");
            }
        }
        return "";
    }

    public ByteBuffer callAriverAPISyncFastPath(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("6227607e", new Object[]{this, byteBuffer});
        }
        if (this.mAPIDispatcher == null || byteBuffer == null) {
            return null;
        }
        try {
            sds.e("Java_callAriverAPISync_Fast");
            JSONObject d2 = this.mAPIDispatcher.d(pmi.a().b(byteBuffer));
            if (d2 != null) {
                return pmi.a().c(d2);
            }
        } catch (Throwable th) {
            try {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx|invokeJSCallback", "failed to execute callAriverAPISync because of error params:" + th.getMessage());
            } finally {
                sds.h("Java_callAriverAPISync_Fast");
            }
        }
        return null;
    }

    public void createAppContext(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1ab422", new Object[]{this, hashMap});
        } else if (isAttached()) {
            nativeCreateAppContext(this.mNativeInstancePtr.longValue(), hashMap);
        }
    }

    public AudioContextProxy createAudioContext(long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioContextProxy) ipChange.ipc$dispatch("9623b45", new Object[]{this, new Long(j2), str});
        }
        AudioContextFactory audioContextFactory = this.mAduioContextFactory;
        if (audioContextFactory != null) {
            return audioContextFactory.createAudioContextProxy(j2, str);
        }
        return null;
    }

    public boolean detach() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7b39a9e", new Object[]{this})).booleanValue();
        }
        if (isAttached()) {
            boolean nativeDetach = nativeDetach(this.mNativeInstancePtr.longValue());
            this.isAttached = false;
            this.mNativeInstancePtr = null;
            z = nativeDetach;
        }
        sLibraryLoadedListener = null;
        return z;
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de8be6e", new Object[]{this, byteBuffer, new Integer(i2)});
        } else if (isAttached() && byteBuffer != null && i2 > 0) {
            nativeDispatchPointerDataPacket(this.mNativeInstancePtr.longValue(), byteBuffer, i2);
        }
    }

    public void executeByteCodeInCurrentThread(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a383d156", new Object[]{this, bArr, str, str2});
        } else if (isAttached() && bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            nativeExecuteByteCodeInCurrentThread(this.mNativeInstancePtr.longValue(), bArr, str, str2);
        }
    }

    public void executeBytecodeInAppContext(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b63f5f", new Object[]{this, bArr, str, str2});
        } else if (isAttached() && bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            nativeExecuteByteCodeInAppContext(this.mNativeInstancePtr.longValue(), bArr, str, str2);
        }
    }

    public void executeBytecodeInMainContext(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89226bf", new Object[]{this, bArr, str});
        } else if (isAttached() && bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            nativeExecuteByteCodeInMainContext(this.mNativeInstancePtr.longValue(), bArr, str);
        }
    }

    public void executeScriptInAppContext(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7222b578", new Object[]{this, str, str2, str3});
        } else if (isAttached() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            nativeExecuteScriptInAppContext(this.mNativeInstancePtr.longValue(), str, str2, str3);
        }
    }

    public void executeScriptInCurrentThread(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719e1ca3", new Object[]{this, str, str2, str3});
        } else if (isAttached() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            nativeExecuteScriptInCurrentThread(this.mNativeInstancePtr.longValue(), str, str2, str3);
        }
    }

    public void executeScriptInMainContext(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09b3fac", new Object[]{this, str, str2});
        } else if (isAttached() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            nativeExecuteScriptInMainContext(this.mNativeInstancePtr.longValue(), str, str2);
        }
    }

    public void fireGlobalEventInMainContext(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361bb065", new Object[]{this, str, jSONObject, new Boolean(z)});
        } else if (isAttached() && !TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                nativeFireGlobalEventInMainContext(this.mNativeInstancePtr.longValue(), str, jSONObject.toString(), z);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, TAG, "failed to fire global event (" + str + ") because of:" + th.getMessage());
            }
        }
    }

    public void invokeJSMethodInAppContext(String str, JSParam[] jSParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1f5048", new Object[]{this, str, jSParamArr});
        } else if (isAttached() && !TextUtils.isEmpty(str) && jSParamArr != null) {
            nativeInvokeJSMethodInAppContext(this.mNativeInstancePtr.longValue(), str, jSParamArr);
        }
    }

    public void invokeJSMethodInMainContext(String str, JSParam[] jSParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709b180e", new Object[]{this, str, jSParamArr});
        } else if (isAttached() && !TextUtils.isEmpty(str) && jSParamArr != null) {
            nativeInvokeJSMethodInMainContext(this.mNativeInstancePtr.longValue(), str, jSParamArr);
        }
    }

    public void notifyAPIStatsReceived(double d2, double d3, double d4, List<String> list, List<String> list2, HashMap<String, Double> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5f5ee9", new Object[]{this, new Double(d2), new Double(d3), new Double(d4), list, list2, hashMap});
        } else if (this.mOnAPIStatsListener != null) {
            this.mUIHandler.post(new g(d2, d3, d4, list, list2, hashMap));
        }
    }

    public void notifyJSError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e8c6f1", new Object[]{this, str, str2});
        } else if (this.mOnJSErrorListener != null) {
            this.mUIHandler.post(new a(str, str2));
        }
    }

    public void notifyJSJankCount(int i2, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d63ab", new Object[]{this, new Integer(i2), new Double(d2)});
        } else if (this.mOnJSNotResponseListener != null) {
            this.mUIHandler.post(new f(i2, d2));
        }
    }

    public void notifyJSMemoryUsageWhenExit(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fba4cd", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (this.mOnJSMemoryListener != null) {
            this.mUIHandler.post(new d(i2, i3, i4, i5));
        }
    }

    public void notifyJSOutOfMemoryException(int i2, int i3, int i4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a76eab", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), str});
        } else if (this.mOnJSMemoryListener != null) {
            this.mUIHandler.post(new c(i2, i3, i4, str));
        }
    }

    public void notifyJSThreadNotResponse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2792e429", new Object[]{this, str});
        } else if (this.mOnJSNotResponseListener != null) {
            this.mUIHandler.post(new e(str));
        }
    }

    public void notifyLargeJSMemoryAllocated(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d88a95c", new Object[]{this, str});
        } else if (this.mOnJSMemoryListener != null) {
            this.mUIHandler.post(new b(str));
        }
    }

    public String notifyOnGetSourceMapForPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4801474", new Object[]{this, str});
        }
        o oVar = this.mOnSourceMapListener;
        if (oVar != null) {
            try {
                String a2 = oVar.a(str);
                return a2 != null ? a2 : "";
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx|sourcemap", "failed to execute notifyOnGetSourceMapForPath because of error:" + th.getMessage());
            }
        }
        return "";
    }

    public void setAudioContextFactory(AudioContextFactory audioContextFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b9705b", new Object[]{this, audioContextFactory});
        } else {
            this.mAduioContextFactory = audioContextFactory;
        }
    }

    public void setOnAPIStatsListener(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286ba484", new Object[]{this, jVar});
        } else {
            this.mOnAPIStatsListener = jVar;
        }
    }

    public void setOnJSErrorListener(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48fd3dd8", new Object[]{this, kVar});
        } else {
            this.mOnJSErrorListener = kVar;
        }
    }

    public void setOnJSMemoryListener(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b7edba", new Object[]{this, lVar});
        } else {
            this.mOnJSMemoryListener = lVar;
        }
    }

    public void setOnJSNotResponseListener(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd99f5d8", new Object[]{this, mVar});
        } else {
            this.mOnJSNotResponseListener = mVar;
        }
    }

    public void setOnSourceMapListener(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28595098", new Object[]{this, oVar});
        } else {
            this.mOnSourceMapListener = oVar;
        }
    }

    public void updateOrangeConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ccf82b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSON.parse(str);
                nativeOrangeConfigUpdate(str);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis_gfx", "JNIBridge updateOrangeConfig cause error: " + th.getMessage());
            }
        }
    }

    public boolean hasRegisterGlobalEventInMainContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f43d3ac", new Object[]{this, str})).booleanValue();
        }
        if (isAttached() && !TextUtils.isEmpty(str)) {
            try {
                return nativeHasRegisterGlobalEventInMainContext(this.mNativeInstancePtr.longValue(), str);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, TAG, "failed to query global event (" + str + ") because of:" + th.getMessage());
            }
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JNIBridge f9647a;
        public final long b;
        public final Long c;
        public final boolean d;

        public h(Long l, JNIBridge jNIBridge, long j) {
            this.c = l;
            this.f9647a = jNIBridge;
            this.b = j;
            this.d = false;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f35ab5bd", new Object[]{this, jSONObject});
            } else {
                b(jSONObject, null);
            }
        }

        public void b(JSONObject jSONObject, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("879aaf44", new Object[]{this, jSONObject, bArr});
            } else {
                c(jSONObject, bArr, false);
            }
        }

        public void c(JSONObject jSONObject, byte[] bArr, boolean z) {
            JNIBridge jNIBridge;
            String str;
            String str2 = "Java_callAriverAPI_invokeJSCallback_toJSONString";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6bbbec10", new Object[]{this, jSONObject, bArr, new Boolean(z)});
            } else if (this.c == null || (jNIBridge = this.f9647a) == null || !JNIBridge.access$000(jNIBridge)) {
                lcn.f(RVLLevel.Error, JNIBridge.TAG, "unexpected error when invoke js callback: maybe native is not attached");
            } else {
                String str3 = "false";
                if (this.d) {
                    if (z) {
                        str3 = "true";
                    }
                    sds.f("Java_callAriverAPI_invokeJSCallbackFast", "keepAlive", str3);
                    JNIBridge.access$100(this.f9647a, this.c.longValue(), this.b, pmi.a().c(jSONObject), bArr, z);
                    return;
                }
                if (z) {
                    str3 = "true";
                }
                sds.f("Java_callAriverAPI_invokeJSCallback", "keepAlive", str3);
                try {
                    sds.e(str2);
                    str = jSONObject.toString();
                    sds.h(str2);
                } catch (Throwable th) {
                    try {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        lcn.f(rVLLevel, "themis_gfx|invokeJSCallback", "unexpected error when invoke js callback: " + th.getMessage());
                        sds.h(str2);
                        str = "";
                    } finally {
                        sds.h(str2);
                    }
                }
                JNIBridge.access$200(this.f9647a, this.c.longValue(), this.b, str, bArr, z);
            }
        }

        public h(Long l, JNIBridge jNIBridge, long j, boolean z) {
            this.c = l;
            this.f9647a = jNIBridge;
            this.b = j;
            this.d = z;
        }
    }
}
