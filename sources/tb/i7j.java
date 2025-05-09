package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.network.domain.NetworkStats;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class i7j implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile AtomicBoolean f0 = new AtomicBoolean(false);
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public NetworkStats L;
    public c M;
    public final String N;
    public final int O;
    public String P;
    public String Q;
    public final IUploadStats R;
    public Object S;
    public String T;
    public String U;
    public String V;
    public long W;
    public long X;
    public long Y;
    public String Z;
    public String a0;
    public long b;
    public String b0;
    public long c;
    public String c0;
    public long d;
    public String d0;
    public long e;
    public String e0;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public String v;
    public boolean w;
    public long y;
    public long z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21141a = true;
    public int x = 0;
    public String K = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i7j.a(i7j.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i7j.a(i7j.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements Cloneable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f21144a;
        public long b;
        public long c;

        public /* synthetic */ c(i7j i7jVar, a aVar) {
            this(i7jVar);
        }

        public Object clone() throws CloneNotSupportedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
            }
            return super.clone();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append(",mtopReqTime=");
            sb.append(this.f21144a);
            sb.append(",mtopDispatchTime=");
            sb.append(this.b);
            sb.append(",bizCallbackTime=");
            sb.append(this.c);
            return sb.toString();
        }

        public c(i7j i7jVar) {
        }
    }

    public i7j(IUploadStats iUploadStats) {
        this.R = iUploadStats;
        int createSsrIntSeqNo = MtopUtils.createSsrIntSeqNo();
        this.O = createSsrIntSeqNo;
        this.N = Mtop.Id.SSR + createSsrIntSeqNo;
    }

    public static /* synthetic */ void a(i7j i7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488625d8", new Object[]{i7jVar});
        } else {
            i7jVar.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:10:0x001a, B:12:0x002c, B:15:0x0031, B:18:0x0036, B:19:0x0039, B:20:0x003c, B:22:0x007a, B:24:0x0092, B:25:0x0097, B:27:0x00c7, B:28:0x00e4, B:30:0x0129, B:33:0x012e, B:38:0x013c), top: B:41:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.i7j.b():void");
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6eef9d8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f21141a = z;
        if (z) {
            if (MtopUtils.isMainThread()) {
                MtopSDKThreadPoolExecutorFactory.submit(new b());
            } else {
                e();
            }
        }
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return super.clone();
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f536047", new Object[]{this})).longValue();
        }
        return System.nanoTime() / 1000000;
    }

    public final void e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ae22c9", new Object[]{this});
        } else if (this.R != null) {
            if (f0.compareAndSet(false, true)) {
                k();
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(rb.RESULT_KEY, this.v);
                hashMap.put("retType", String.valueOf(this.x));
                hashMap.put("httpResponseStatus", String.valueOf(this.u));
                hashMap.put("traceId", this.T);
                hashMap.put("serverTraceId", this.P);
                hashMap.put("eagleEyeTraceId", this.Q);
                hashMap.put("url", this.U);
                hashMap.put("domain", this.V);
                hashMap.put("tokenValid", this.Z);
                hashMap.put("serviceDomain", this.a0);
                hashMap.put("serviceIps", this.b0);
                hashMap.put("serviceUnit", this.c0);
                hashMap.put("serviceERCorrection", this.d0);
                hashMap.put("deviceLevel", this.e0);
                NetworkStats h = h();
                if (h != null) {
                    hashMap.put("connType", h.connectionType);
                    if (h.isSSL) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    hashMap.put("isSSL", str);
                    hashMap.put("retryTimes", String.valueOf(h.retryTimes));
                    hashMap.put("ip_port", h.ip_port);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("totalTime", Double.valueOf(this.b));
                hashMap2.put("networkExeTime", Double.valueOf(this.c));
                hashMap2.put("waitExecuteTime", Double.valueOf(this.d));
                hashMap2.put("waitCallbackTime", Double.valueOf(this.h));
                hashMap2.put("waitExecute2BuildParamTime", Double.valueOf(this.e));
                hashMap2.put("buildParamsTime", Double.valueOf(this.i));
                hashMap2.put("buildParams2NetworkTime", Double.valueOf(this.f));
                hashMap2.put("startCallBack2EndTime", Double.valueOf(this.g));
                hashMap2.put("signTime", Double.valueOf(this.l));
                hashMap2.put("callbackPocTime", Double.valueOf(this.X));
                hashMap2.put("allTime", Double.valueOf(this.Y));
                hashMap2.put("requestPocTime", Double.valueOf(this.W));
                hashMap2.put("firstResponseTime", Double.valueOf(this.o));
                hashMap2.put("firstChunkDuration", Double.valueOf(this.s));
                hashMap2.put("firstChunkSize", Double.valueOf(this.t));
                if (h != null) {
                    hashMap2.put("processTime", Double.valueOf(h.processTime));
                    hashMap2.put("firstDataTime", Double.valueOf(h.firstDataTime));
                    hashMap2.put("recDataTime", Double.valueOf(h.recDataTime));
                    hashMap2.put("oneWayTime_ANet", Double.valueOf(h.oneWayTime_ANet));
                    hashMap2.put("serverRT", Double.valueOf(h.serverRT));
                    hashMap2.put("sendSize", Double.valueOf(h.sendSize));
                    hashMap2.put("revSize", Double.valueOf(h.recvSize));
                    hashMap2.put("dataSpeed", Double.valueOf(h.dataSpeed));
                }
                c cVar = this.M;
                if (cVar != null) {
                    hashMap2.put("mtopDispatchTime", Double.valueOf(cVar.b));
                    hashMap2.put("bizCallbackTime", Double.valueOf(this.M.c));
                    hashMap2.put("mtopReqTime", Double.valueOf(this.M.f21144a));
                }
                IUploadStats iUploadStats = this.R;
                if (iUploadStats != null) {
                    iUploadStats.onCommit("mtopsdk_ssr", "ssrStats", hashMap, hashMap2);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36ce3c7", new Object[]{this});
        } else if (this.N != null) {
            StringBuilder sb = new StringBuilder("[falcoId:");
            sb.append(this.T);
            sb.append("] |MtopSsrStatistics,");
            sb.append(this.K);
            TBSdkLog.e("mtopsdk_ssr", this.N, sb.toString());
            mfq.c(this.S, sb.toString());
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa478a0", new Object[]{this});
        } else if (this.N != null) {
            TBSdkLog.e("mtopsdk_ssr", this.N, "[falcoId:" + this.T + "] |start");
        }
    }

    public NetworkStats h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStats) ipChange.ipc$dispatch("9e7f9661", new Object[]{this});
        }
        return this.L;
    }

    public synchronized c i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7d6df644", new Object[]{this});
        }
        if (this.M == null) {
            this.M = new c(this, null);
        }
        return this.M;
    }

    public void j() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41da4659", new Object[]{this});
            return;
        }
        long d = d();
        this.A = d;
        long j2 = this.y;
        this.b = d - j2;
        long j3 = this.z;
        long j4 = 0;
        if (j3 > j2) {
            j = j3 - j2;
        } else {
            j = 0;
        }
        this.d = j;
        if (this.C == 0) {
            this.C = d();
        }
        if (this.p == 0) {
            this.p = d();
        }
        long j5 = this.p;
        long j6 = this.y;
        this.o = j5 - j6;
        this.s = this.q - j6;
        long j7 = this.C;
        long j8 = this.B;
        this.c = j7 - j8;
        long j9 = this.D;
        if (j9 > j7) {
            j4 = j9 - j7;
        }
        this.h = j4;
        this.e = this.j - this.z;
        this.f = j8 - this.k;
        this.g = this.A - j9;
        this.W = j8 - j6;
        StringBuilder sb = new StringBuilder(128);
        sb.append("url=");
        sb.append(this.U);
        sb.append(",httpResponseStatus=");
        sb.append(this.u);
        sb.append(",retCode=");
        sb.append(this.v);
        sb.append(",retType=");
        sb.append(this.x);
        sb.append(",eagleEyeTraceId=");
        sb.append(this.Q);
        sb.append(",ssrTotalTime=");
        sb.append(this.b);
        sb.append(",waitExecuteTime=");
        sb.append(this.d);
        sb.append(",waitExecute2BuildParamTime=");
        sb.append(this.e);
        sb.append(",buildParamsTime=");
        sb.append(this.i);
        sb.append(",buildParams2NetworkTime=");
        sb.append(this.f);
        sb.append(",networkTotalTime=");
        sb.append(this.c);
        sb.append(",waitCallbackTime=");
        sb.append(this.h);
        sb.append(",startCallBack2EndTime=");
        sb.append(this.g);
        sb.append(",computeSignTime=");
        sb.append(this.l);
        sb.append(",firstResponseTime=");
        sb.append(this.o);
        sb.append(",firstChunkDuration=");
        sb.append(this.s);
        sb.append(",firstChunkSize=firstChunkSize,tokenValid=");
        sb.append(this.Z);
        sb.append(",serviceDomain=");
        sb.append(this.a0);
        sb.append(",serviceIps=");
        sb.append(this.b0);
        sb.append(",serviceUnit=");
        sb.append(this.c0);
        sb.append(",serviceERCorrection=");
        sb.append(this.d0);
        sb.append(",deviceLevel=");
        sb.append(this.e0);
        if (this.L != null) {
            sb.append(",");
            if (StringUtils.isBlank(this.L.netStatSum)) {
                sb.append(this.L.sumNetStat());
            } else {
                sb.append(this.L.netStatSum);
            }
        }
        this.K = sb.toString();
        if (this.f21141a) {
            if (MtopUtils.isMainThread()) {
                MtopSDKThreadPoolExecutorFactory.submit(new a());
            } else {
                e();
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("ssr.MtopSsrStatistics", this.N, toString());
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e19d6db", new Object[]{this});
            return;
        }
        try {
            if (this.R == null) {
                TBSdkLog.e("ssr.MtopSsrStatistics", this.N, "[registerMtopStats]register MtopStats error, uploadStats=null");
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add("url");
            hashSet.add("domain");
            hashSet.add("httpResponseStatus");
            hashSet.add(rb.RESULT_KEY);
            hashSet.add("retType");
            hashSet.add("traceId");
            hashSet.add("serverTraceId");
            hashSet.add("eagleEyeTraceId");
            hashSet.add("connType");
            hashSet.add("isSSL");
            hashSet.add("retryTimes");
            hashSet.add("ip_port");
            hashSet.add("tokenValid");
            hashSet.add("serviceDomain");
            hashSet.add("serviceIps");
            hashSet.add("serviceUnit");
            hashSet.add("serviceERCorrection");
            hashSet.add("deviceLevel");
            HashSet hashSet2 = new HashSet();
            hashSet2.add("totalTime");
            hashSet2.add("waitExecuteTime");
            hashSet2.add("waitExecute2BuildParamTime");
            hashSet2.add("buildParamsTime");
            hashSet2.add("buildParams2NetworkTime");
            hashSet2.add("networkExeTime");
            hashSet2.add("waitCallbackTime");
            hashSet2.add("startCallBack2EndTime");
            hashSet2.add("signTime");
            hashSet2.add("requestPocTime");
            hashSet2.add("callbackPocTime");
            hashSet2.add("allTime");
            hashSet2.add("firstResponseTime");
            hashSet2.add("firstChunkDuration");
            hashSet2.add("firstChunkSize");
            hashSet2.add("toMainThTime");
            hashSet2.add("mtopDispatchTime");
            hashSet2.add("bizCallbackTime");
            hashSet2.add("mtopReqTime");
            hashSet2.add("processTime");
            hashSet2.add("firstDataTime");
            hashSet2.add("recDataTime");
            hashSet2.add("revSize");
            hashSet2.add("sendSize");
            hashSet2.add("dataSpeed");
            hashSet2.add("oneWayTime_ANet");
            hashSet2.add("serverRT");
            IUploadStats iUploadStats = this.R;
            if (iUploadStats != null) {
                iUploadStats.onRegister("mtopsdk_ssr", "ssrStats", hashSet, hashSet2, false);
            }
            String str = this.N;
            TBSdkLog.i("ssr.MtopSsrStatistics", str, "[registerMtopStats]register MtopStats executed.uploadStats=" + this.R);
        } catch (Throwable th) {
            String str2 = this.N;
            TBSdkLog.e("ssr.MtopSsrStatistics", str2, "[registerMtopStats] register MtopStats error ---" + th.toString());
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("MtopSsrStatistics ");
        sb.append(hashCode());
        sb.append("[SumStat(ms)]:");
        sb.append(this.K);
        if (this.M != null) {
            sb.append(" [rbStatData]:");
            sb.append(this.M);
        }
        return sb.toString();
    }
}
