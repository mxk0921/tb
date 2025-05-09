package tb;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import com.taobao.tao.log.interceptor.RealTimeLogConfig;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ewd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jkn implements ewd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long i;
    public static long j;
    public static long k;
    public static long l;
    public static long m;

    /* renamed from: a  reason: collision with root package name */
    public Context f22040a;
    public RealTimeLogConfig b;
    public ewd.a c;
    public final AtomicBoolean d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public b g;
    public final List<String> h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f22041a;

        public a(byte[] bArr) {
            this.f22041a = bArr;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            Log.e("RealTimeMtopUploader", "Upload Log Failed. ErrorCode=" + str + ",ErrorMsg=" + str2);
            try {
                if (jkn.s(jkn.this).contains(str)) {
                    Log.e("RealTimeMtopUploader", "Will Stop RealTimeLog with error: " + str);
                    if (jkn.t(jkn.this) != null) {
                        jkn.t(jkn.this).a(9, str);
                        return;
                    }
                    return;
                }
                if (jkn.r(jkn.this).b(this.f22041a)) {
                    int length = this.f22041a.length;
                } else {
                    jkn.q(this.f22041a.length);
                    String.format("[Data Lost] Queue will full. Do not add data（len=%d）to Queue", Integer.valueOf(this.f22041a.length));
                }
                String.format("Upload Log Failed. Log Write Len: %d(%d), Compress Len: %d Send Len: %d, Drop Len: %d, Queue Len:%d", Long.valueOf(jkn.j()), Long.valueOf(jkn.l()), Long.valueOf(jkn.n()), Long.valueOf(jkn.h()), Long.valueOf(jkn.p()), Long.valueOf(jkn.r(jkn.this).e()));
                synchronized (this) {
                    wait(2000L);
                }
            } catch (InterruptedException unused) {
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            jkn.i(this.f22041a.length);
            String.format("Upload Log Success. Log Write Len: %d(%d), Compress Len: %d Send Len: %d, Drop Len: %d, Queue Len:%d", Long.valueOf(jkn.j()), Long.valueOf(jkn.l()), Long.valueOf(jkn.n()), Long.valueOf(jkn.h()), Long.valueOf(jkn.p()), Long.valueOf(jkn.r(jkn.this).e()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final StringBuilder f22042a;
        public final ReentrantLock c;
        public final Condition d;
        public RealTimeLogConfig f;
        public int g;
        public int h;
        public int i;
        public final LinkedList<byte[]> b = new LinkedList<>();
        public long e = 0;
        public boolean j = false;

        static {
            t2o.a(767557666);
        }

        public b(RealTimeLogConfig realTimeLogConfig) {
            g(realTimeLogConfig);
            this.f22042a = new StringBuilder(realTimeLogConfig.compressSize);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.c = reentrantLock;
            this.d = reentrantLock.newCondition();
        }

        public void a(String str) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59241472", new Object[]{this, str});
                return;
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lockInterruptibly();
            try {
                this.f22042a.append(str);
                jkn.k(str.length());
                if (d(this.f.compressSize)) {
                    this.d.signal();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public boolean b(byte[] bArr) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a41532e1", new Object[]{this, bArr})).booleanValue();
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lockInterruptibly();
            try {
                if (this.e + bArr.length >= this.f.bufferSize) {
                    return false;
                }
                this.b.offerFirst(bArr);
                this.e += bArr.length;
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                this.j = true;
                StringBuilder sb = this.f22042a;
                sb.delete(0, sb.length());
                this.b.clear();
                this.d.signal();
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("31f07789", new Object[]{this, new Long(j)})).booleanValue();
            }
            int length = this.f22042a.length();
            long j2 = length;
            if (j2 > j) {
                byte[] u = jkn.u(this.f22042a.toString());
                if (u == null) {
                    Log.e("CompressBlockQueue", "Compress error, Data lose!!! len:" + length);
                    jkn.m(j2);
                    return false;
                }
                jkn.o(u.length);
                this.f22042a.delete(0, length);
                if (this.b.add(u)) {
                    this.e += u.length;
                    String.format("Move Log Cache(compress %d --> %d) to Log Queue(len=%d, count=%d). FlushSize=%d", Integer.valueOf(length), Integer.valueOf(u.length), Long.valueOf(this.e), Integer.valueOf(this.b.size()), Long.valueOf(j));
                    while (this.e > this.f.bufferSize) {
                        byte[] poll = this.b.poll();
                        if (poll != null) {
                            int length2 = poll.length;
                            long j3 = length2;
                            jkn.q(j3);
                            this.e -= j3;
                            String.format("[Data Lost] Queue is full. Remove data(len=%d) from Queue(len=%d, count=%d)", Integer.valueOf(length2), Long.valueOf(this.e), Integer.valueOf(this.b.size()));
                        }
                    }
                    return true;
                }
                Log.e("CompressBlockQueue", "Failed to add compressData to Queue!!! Data Lost. len:" + u.length);
                jkn.q((long) u.length);
            }
            return false;
        }

        public long e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc457052", new Object[]{this})).longValue();
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                return this.e;
            } finally {
                reentrantLock.unlock();
            }
        }

        public byte[] f() throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("5683950f", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lockInterruptibly();
            do {
                try {
                    if (!this.b.isEmpty()) {
                        byte[] poll = this.b.poll();
                        if (poll != null) {
                            this.e -= poll.length;
                        }
                        reentrantLock.unlock();
                        return poll;
                    } else if (this.d.await(this.h, TimeUnit.SECONDS)) {
                        this.g = 0;
                    } else if (this.b.isEmpty()) {
                        int i = this.g + this.h;
                        this.g = i;
                        if (i < this.i) {
                            d(this.f.compressSize / 3);
                        } else {
                            this.g = 0;
                            d(0L);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } while (!this.j);
            reentrantLock.unlock();
            return null;
        }

        public void g(RealTimeLogConfig realTimeLogConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("521c8f5b", new Object[]{this, realTimeLogConfig});
                return;
            }
            this.f = realTimeLogConfig;
            int i = realTimeLogConfig.updateInterval;
            this.h = i;
            if (i < 3) {
                this.h = 3;
            } else if (i > 30) {
                this.h = 30;
            }
            this.i = Math.min(this.h * 3, 30);
            this.g = 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    static {
        t2o.a(767557664);
        t2o.a(767557657);
    }

    public jkn(String str, String str2) {
        this.d = new AtomicBoolean(false);
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.add("-1");
        arrayList.add("3");
        arrayList.add("FAIL_SYS_API_NOT_FOUNDED");
    }

    public static /* synthetic */ long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076b", new Object[0])).longValue();
        }
        return l;
    }

    public static /* synthetic */ long i(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19a4fbde", new Object[]{new Long(j2)})).longValue();
        }
        long j3 = l + j2;
        l = j3;
        return j3;
    }

    public static /* synthetic */ long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ac", new Object[0])).longValue();
        }
        return i;
    }

    public static /* synthetic */ long k(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("818628bd", new Object[]{new Long(j2)})).longValue();
        }
        long j3 = i + j2;
        i = j3;
        return j3;
    }

    public static /* synthetic */ long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27ded", new Object[0])).longValue();
        }
        return j;
    }

    public static /* synthetic */ long m(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e967559c", new Object[]{new Long(j2)})).longValue();
        }
        long j3 = j + j2;
        j = j3;
        return j3;
    }

    public static /* synthetic */ long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b88b92e", new Object[0])).longValue();
        }
        return k;
    }

    public static /* synthetic */ long o(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5148827b", new Object[]{new Long(j2)})).longValue();
        }
        long j3 = k + j2;
        k = j3;
        return j3;
    }

    public static /* synthetic */ long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906ef46f", new Object[0])).longValue();
        }
        return m;
    }

    public static /* synthetic */ long q(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b929af5a", new Object[]{new Long(j2)})).longValue();
        }
        long j3 = m + j2;
        m = j3;
        return j3;
    }

    public static /* synthetic */ b r(jkn jknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("da82aa12", new Object[]{jknVar});
        }
        return jknVar.g;
    }

    public static /* synthetic */ List s(jkn jknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8cdc9475", new Object[]{jknVar});
        }
        return jknVar.h;
    }

    public static /* synthetic */ ewd.a t(jkn jknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewd.a) ipChange.ipc$dispatch("73f83b77", new Object[]{jknVar});
        }
        return jknVar.c;
    }

    public static byte[] u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2f247eca", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        Deflater deflater = new Deflater(1);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(str.getBytes("UTF-8"));
            deflaterOutputStream.flush();
            deflaterOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            deflaterOutputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            Log.e("RealTimeMtopUploader", "compress error", e);
            return null;
        }
    }

    public static /* synthetic */ Thread y(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("46213d35", new Object[]{runnable});
        }
        return new Thread(runnable, "tlog-realtime-producer");
    }

    public static /* synthetic */ Thread z(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("4d867254", new Object[]{runnable});
        }
        return new Thread(runnable, "tlog-realtime-consumer");
    }

    public final /* synthetic */ void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722abd56", new Object[]{this});
            return;
        }
        try {
            w();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18fa41a", new Object[]{this, str});
            return;
        }
        try {
            this.g.a(str);
        } catch (InterruptedException unused) {
        }
    }

    @Override // tb.ewd
    public void a(RealTimeLogConfig realTimeLogConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521c8f5b", new Object[]{this, realTimeLogConfig});
            return;
        }
        this.b = realTimeLogConfig;
        this.g.g(realTimeLogConfig);
    }

    @Override // tb.ewd
    public void b(Context context, RealTimeLogConfig realTimeLogConfig, ewd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6e0f7a", new Object[]{this, context, realTimeLogConfig, aVar});
        } else if (!this.d.get()) {
            this.f22040a = context;
            this.b = realTimeLogConfig;
            this.c = aVar;
            try {
                this.d.set(true);
                x();
            } catch (Exception e) {
                Log.e("RealTimeMtopUploader", "init exception", e);
            }
        }
    }

    @Override // tb.ewd
    public void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b840f51", new Object[]{this, str});
        } else if (this.d.get()) {
            this.e.execute(new Runnable() { // from class: tb.fkn
                @Override // java.lang.Runnable
                public final void run() {
                    jkn.this.B(str);
                }
            });
        }
    }

    @Override // tb.ewd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.d.get()) {
            this.d.set(false);
            try {
                v();
            } catch (Exception e) {
                Log.e("RealTimeMtopUploader", "destroy exception", e);
            }
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d9a8f4", new Object[]{this});
            return;
        }
        this.e.shutdownNow();
        this.e = null;
        b bVar = this.g;
        if (bVar != null) {
            bVar.c();
        }
        this.f.shutdownNow();
        this.f = null;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3fa7d0a", new Object[]{this});
            return;
        }
        this.g = new b(this.b);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 20L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: tb.gkn
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread y;
                y = jkn.y(runnable);
                return y;
            }
        });
        this.e = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 20L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: tb.hkn
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread z;
                z = jkn.z(runnable);
                return z;
            }
        });
        this.f = threadPoolExecutor2;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        this.f.execute(new Runnable() { // from class: tb.ikn
            @Override // java.lang.Runnable
            public final void run() {
                jkn.this.A();
            }
        });
    }

    public final void C(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab64f6c", new Object[]{this, str, cVar});
            return;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.alibaba.emas.publish.update.resource.upload");
            mtopRequest.setVersion("1.0");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", (Object) "taobao4android");
            jSONObject.put("appVersion", (Object) j5s.j().e());
            jSONObject.put("resourceType", (Object) "realtime");
            jSONObject.put("resourceContent", (Object) str);
            mtopRequest.setData(jSONObject.toJSONString());
            HashMap hashMap = new HashMap();
            hashMap.put("token", this.b.token);
            hashMap.put("compressType", WeexZipModule.NAME);
            hashMap.put("encryptType", "0");
            hashMap.put("dataType", "0");
            MtopResponse syncRequest = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, this.f22040a), mtopRequest).reqMethod(MethodEnum.POST).headers((Map<String, String>) hashMap).setConnectionTimeoutMilliSecond(10000).setSocketTimeoutMilliSecond(10000).retryTime(3).syncRequest();
            if (syncRequest.isApiSuccess()) {
                ((a) cVar).b();
            } else {
                ((a) cVar).a(syncRequest.getRetCode(), syncRequest.getRetMsg());
            }
        } catch (Exception e) {
            Log.e("RealTimeMtopUploader", "upload exception", e);
            if (cVar != null) {
                ((a) cVar).a("EXCEPTION", e.getMessage());
            }
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfcef69", new Object[]{this});
            return;
        }
        while (this.d.get()) {
            try {
                byte[] f = this.g.f();
                if (f != null) {
                    String encodeToString = Base64.encodeToString(f, 0);
                    if (!this.b.needWifi || n6s.a(this.f22040a)) {
                        String.format("Send log data to sever. Length=%d(%d)", Integer.valueOf(f.length), Integer.valueOf(encodeToString.length()));
                        C(encodeToString, new a(f));
                    } else {
                        this.c.a(10, "");
                        return;
                    }
                }
            } catch (InterruptedException unused) {
            } catch (Exception e) {
                Log.e("RealTimeMtopUploader", "uploadLog exception", e);
            }
        }
    }

    public jkn() {
        this(Mtop.Id.INNER, "taobao4android");
    }
}
