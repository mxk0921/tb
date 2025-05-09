package com.taobao.android.alinnkit.alinn;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.core.AliNNForwardType;
import com.taobao.android.alinnkit.net.AliNNKitBaseNet;
import tb.bzf;
import tb.qq0;
import tb.t2o;
import tb.vj1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliNNNetInstance extends AliNNKitBaseNet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f6332a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum MemoryMode {
        Memory_Normal(0),
        Memory_High(1),
        Memory_Low(2);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mode;

        MemoryMode(int i) {
            this.mode = i;
        }

        public static /* synthetic */ Object ipc$super(MemoryMode memoryMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/alinn/AliNNNetInstance$MemoryMode");
        }

        public static MemoryMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MemoryMode) ipChange.ipc$dispatch("71d34aeb", new Object[]{str});
            }
            return (MemoryMode) Enum.valueOf(MemoryMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum PowerMode {
        Power_Normal(0),
        Power_High(1),
        Power_Low(2);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mode;

        PowerMode(int i) {
            this.mode = i;
        }

        public static /* synthetic */ Object ipc$super(PowerMode powerMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/alinn/AliNNNetInstance$PowerMode");
        }

        public static PowerMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PowerMode) ipChange.ipc$dispatch("f939f9ff", new Object[]{str});
            }
            return (PowerMode) Enum.valueOf(PowerMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum PrecisionMode {
        Precision_Normal(0),
        Precision_High(1),
        Precision_Low(2);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mode;

        PrecisionMode(int i) {
            this.mode = i;
        }

        public static /* synthetic */ Object ipc$super(PrecisionMode precisionMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/alinn/AliNNNetInstance$PrecisionMode");
        }

        public static PrecisionMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PrecisionMode) ipChange.ipc$dispatch("e19f2c26", new Object[]{str});
            }
            return (PrecisionMode) Enum.valueOf(PrecisionMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f6333a = MemoryMode.Memory_Normal.mode;
        public final int b = PowerMode.Power_Normal.mode;
        public final int c = PrecisionMode.Precision_Normal.mode;

        static {
            t2o.a(367001608);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f6334a = AliNNForwardType.FORWARD_CPU.type;
        public int b = 4;
        public final b c = new b();

        static {
            t2o.a(367001609);
        }
    }

    static {
        t2o.a(367001606);
    }

    public AliNNNetInstance(long j) {
        this.f6332a = j;
    }

    public static /* synthetic */ long a(AliNNNetInstance aliNNNetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("356b8131", new Object[]{aliNNNetInstance})).longValue();
        }
        return aliNNNetInstance.f6332a;
    }

    public static /* synthetic */ void b(AliNNNetInstance aliNNNetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46214dfe", new Object[]{aliNNNetInstance});
        } else {
            aliNNNetInstance.c();
        }
    }

    public static AliNNNetInstance d(Context context, String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNNetInstance) ipChange.ipc$dispatch("fd5f70e9", new Object[]{context, str, str2});
        }
        long nativeCreateNetFromFile = AliNNNetNative.nativeCreateNetFromFile(str);
        if (0 == nativeCreateNetFromFile) {
            Log.e("alinnnet-v2", "Create Net Failed from file " + str);
            return null;
        }
        try {
            z = vj1.b(context, AliNNNetNative.nativeNetBizCode(nativeCreateNetFromFile), str2);
        } catch (Exception e) {
            bzf.a("alinnnet-v2", e.getMessage(), new Object[0]);
            z = false;
        }
        if (z) {
            return new AliNNNetInstance(nativeCreateNetFromFile);
        }
        bzf.a("alinnnet-v2", "license code or model not match, please input the correct code or models", new Object[0]);
        AliNNNetNative.nativeReleaseNet(nativeCreateNetFromFile);
        return null;
    }

    public static AliNNNetInstance e(Context context, String str, String str2, String str3, String str4, String str5) {
        String str6;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNNetInstance) ipChange.ipc$dispatch("816be28b", new Object[]{context, str, str2, str3, str4, str5});
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            return d(context, str, str2);
        }
        long currentTimeMillis = System.currentTimeMillis();
        AliNNNetInstance d2 = d(context, str, str2);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (d2 != null) {
            str6 = "0";
        } else {
            str6 = "ALINN_UNCOMMIT_VALUE";
        }
        if (d2 != null) {
            z = true;
        } else {
            z = false;
        }
        qq0.h(str3, str4, str5, str6, z, (float) currentTimeMillis2);
        d2.getClass();
        return d2;
    }

    public static /* synthetic */ Object ipc$super(AliNNNetInstance aliNNNetInstance, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/alinn/AliNNNetInstance");
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6d1a5b", new Object[]{this});
        } else if (this.f6332a == 0) {
            throw new RuntimeException("AliNNNetInstance native pointer is null, it may has been released");
        }
    }

    public d f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("8c491dc7", new Object[]{this, cVar});
        }
        c();
        if (cVar == null) {
            cVar = new c();
        }
        long j = this.f6332a;
        int i = cVar.f6334a;
        int i2 = cVar.b;
        b bVar = cVar.c;
        long nativeCreateSession = AliNNNetNative.nativeCreateSession(j, i, i2, bVar.f6333a, bVar.b, bVar.c, null);
        if (0 != nativeCreateSession) {
            return new d(nativeCreateSession);
        }
        Log.e("alinnnet-v2", "Create Session Error");
        return null;
    }

    public d g(c cVar) {
        c cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("207716b9", new Object[]{this, cVar});
        }
        c();
        if (cVar == null) {
            cVar2 = new c();
        } else {
            cVar2 = cVar;
        }
        boolean[] zArr = {false};
        long j = this.f6332a;
        int i = cVar2.f6334a;
        int i2 = cVar2.b;
        b bVar = cVar2.c;
        long nativeCreateSessionWithFlag = AliNNNetNative.nativeCreateSessionWithFlag(j, i, i2, bVar.f6333a, bVar.b, bVar.c, null, zArr);
        if (0 != nativeCreateSessionWithFlag) {
            return new d(nativeCreateSessionWithFlag, zArr[0]);
        }
        Log.e("alinnnet-v2", "Create Session Error");
        return null;
    }

    @Override // com.taobao.android.alinnkit.net.AliNNKitBaseNet
    public synchronized void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        c();
        AliNNNetNative.nativeReleaseNet(this.f6332a);
        this.f6332a = 0L;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f6335a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public float[] f6336a = null;
            public final long b;

            static {
                t2o.a(367001614);
            }

            public a(d dVar, long j) {
                this.b = j;
            }

            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e66acca7", new Object[]{this});
                    return;
                }
                if (this.f6336a == null) {
                    this.f6336a = new float[AliNNNetNative.nativeTensorGetData(this.b, null)];
                }
                AliNNNetNative.nativeTensorGetData(this.b, this.f6336a);
            }

            public int[] b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (int[]) ipChange.ipc$dispatch("4cab775a", new Object[]{this});
                }
                return AliNNNetNative.nativeTensorGetDimensions(this.b);
            }

            public float[] c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (float[]) ipChange.ipc$dispatch("5d2609ca", new Object[]{this});
                }
                a();
                return this.f6336a;
            }

            public long d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("d3f5c690", new Object[]{this})).longValue();
                }
                return this.b;
            }
        }

        static {
            t2o.a(367001613);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1ef41434", new Object[]{this, str});
            }
            long nativeGetSessionInput = AliNNNetNative.nativeGetSessionInput(AliNNNetInstance.a(AliNNNetInstance.this), this.f6335a, str);
            if (0 != nativeGetSessionInput) {
                return new a(this, nativeGetSessionInput);
            }
            Log.e("alinnnet-v2", "Can't find seesion input: " + str);
            return null;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5a580117", new Object[]{this, str});
            }
            long nativeGetSessionOutput = AliNNNetNative.nativeGetSessionOutput(AliNNNetInstance.a(AliNNNetInstance.this), this.f6335a, str);
            if (0 != nativeGetSessionOutput) {
                return new a(this, nativeGetSessionOutput);
            }
            Log.e("alinnnet-v2", "Can't find seesion output: " + str);
            return null;
        }

        public synchronized void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
                return;
            }
            AliNNNetInstance.b(AliNNNetInstance.this);
            AliNNNetNative.nativeReleaseSession(AliNNNetInstance.a(AliNNNetInstance.this), this.f6335a);
            this.f6335a = 0L;
        }

        public synchronized void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AliNNNetNative.nativeRunSession(AliNNNetInstance.a(AliNNNetInstance.this), this.f6335a);
            }
        }

        public d(long j) {
            this.f6335a = j;
        }

        public d(long j, boolean z) {
            this.f6335a = j;
        }
    }
}
