package com.taobao.alivfssdk.fresco.cache.disk;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import com.taobao.alivfssdk.fresco.cache.common.CacheEventListener;
import com.taobao.alivfssdk.fresco.cache.disk.a;
import com.taobao.alivfssdk.fresco.common.statfs.StatFsHelper;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import tb.cg8;
import tb.cpl;
import tb.lq7;
import tb.mfp;
import tb.mjx;
import tb.mq7;
import tb.pp;
import tb.ps2;
import tb.sa2;
import tb.t2o;
import tb.u8j;
import tb.vp;
import tb.y3k;
import tb.z7p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b implements com.taobao.alivfssdk.fresco.cache.disk.c, lq7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int START_OF_VERSIONING = 1;
    public static final long m = TimeUnit.HOURS.toMillis(2);
    public static final long n = TimeUnit.MINUTES.toMillis(30);
    public static final Pattern o = Pattern.compile("[^a-zA-Z0-9\\.\\-]");
    public final long b;
    public long d;
    public final CacheEventListener e;
    public final Set<String> f;
    public final com.taobao.alivfssdk.fresco.cache.disk.a i;
    public final CacheErrorLogger j;
    public final CountDownLatch c = new CountDownLatch(1);
    public final Object l = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final long f6199a = 0;
    public final StatFsHelper h = StatFsHelper.d();
    public long g = -1;
    public final C0323b k = new C0323b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6200a;

        public a(Context context) {
            this.f6200a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (b.a(b.this)) {
                b.b(b.this);
                b.e(this.f6200a, b.c(b.this).r0());
            }
            b.g(b.this).countDown();
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.alivfssdk.fresco.cache.disk.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0323b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f6201a = false;
        public long b = -1;
        public long c = -1;

        static {
            t2o.a(374341728);
        }

        public synchronized long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2754", new Object[]{this})).longValue();
            }
            return this.c;
        }

        public synchronized long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
            }
            return this.b;
        }

        public synchronized void c(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be7b5376", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            if (this.f6201a) {
                this.b += j;
                this.c += j2;
            }
        }

        public synchronized boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
            }
            return this.f6201a;
        }

        public synchronized void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.f6201a = false;
            this.c = -1L;
            this.b = -1L;
        }

        public synchronized void f(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfbcc229", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            this.c = j2;
            this.b = j;
            this.f6201a = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f6202a;

        static {
            t2o.a(374341729);
        }

        public c(long j, long j2, long j3) {
            this.f6202a = j3;
        }
    }

    static {
        t2o.a(374341726);
        t2o.a(374341732);
        t2o.a(374341736);
    }

    public b(com.taobao.alivfssdk.fresco.cache.disk.a aVar, cg8 cg8Var, c cVar, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, mq7 mq7Var, Context context, ExecutorService executorService) {
        cVar.getClass();
        long j = cVar.f6202a;
        this.b = j;
        this.d = j;
        this.i = aVar;
        this.e = cacheEventListener;
        this.j = cacheErrorLogger;
        if (mq7Var != null) {
            mq7Var.a(this);
        }
        this.f = new HashSet();
        executorService.execute(new a(context));
    }

    public static String A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("951039fd", new Object[]{str});
        }
        return o.matcher(str).replaceAll("_");
    }

    public static String L(ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49281081", new Object[]{ps2Var});
        }
        try {
            if (ps2Var instanceof u8j) {
                return M0(((u8j) ps2Var).a().get(0));
            }
            if (ps2Var instanceof y3k) {
                return ((cpl) ps2Var).toString();
            }
            return M0(ps2Var);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String M0(ps2 ps2Var) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43f4618", new Object[]{ps2Var});
        }
        return z7p.a(ps2Var.toString().getBytes("UTF-8"));
    }

    public static /* synthetic */ Object a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e820ed75", new Object[]{bVar});
        }
        return bVar.l;
    }

    public static /* synthetic */ boolean b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5a3340", new Object[]{bVar})).booleanValue();
        }
        return bVar.D0();
    }

    public static /* synthetic */ com.taobao.alivfssdk.fresco.cache.disk.a c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alivfssdk.fresco.cache.disk.a) ipChange.ipc$dispatch("23983255", new Object[]{bVar});
        }
        return bVar.i;
    }

    public static List<String> c0(ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14a859d9", new Object[]{ps2Var});
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (ps2Var instanceof u8j) {
                List<ps2> a2 = ((u8j) ps2Var).a();
                for (int i = 0; i < a2.size(); i++) {
                    arrayList.add(M0(a2.get(i)));
                }
            } else if (ps2Var instanceof y3k) {
                arrayList.add(A(((cpl) ps2Var).toString()));
            } else {
                arrayList.add(M0(ps2Var));
            }
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static /* synthetic */ void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e750da18", new Object[]{context, str});
        } else {
            B0(context, str);
        }
    }

    public static /* synthetic */ CountDownLatch g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("22d593f", new Object[]{bVar});
        }
        return bVar.c;
    }

    public final void C(long j, CacheEventListener.EvictionReason evictionReason) throws IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef510977", new Object[]{this, new Long(j), evictionReason});
            return;
        }
        try {
            Collection<a.AbstractC0322a> f0 = f0(this.i.K0());
            long b = this.k.b();
            long j2 = b - j;
            long j3 = 0;
            for (Iterator<a.AbstractC0322a> it = f0.iterator(); it.hasNext(); it = it) {
                a.AbstractC0322a next = it.next();
                if (j3 > j2) {
                    break;
                }
                long k = this.i.k(next);
                ((HashSet) this.f).remove(next.getId());
                if (k > 0) {
                    i++;
                    j3 += k;
                    CacheEventListener cacheEventListener = this.e;
                    if (cacheEventListener != null) {
                        ((vp) cacheEventListener).d(new mfp().j(next.getId()).g(evictionReason).i(k).e(b - j3).d(j));
                    }
                }
            }
            this.k.c(-j3, -i);
            this.i.J();
        } catch (IOException e) {
            CacheErrorLogger cacheErrorLogger = this.j;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
            cacheErrorLogger.a(cacheErrorCategory, "DiskStorageCache", "evictAboveSize: " + e.getMessage(), e);
            throw e;
        }
    }

    public final void C0() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f406ca4d", new Object[]{this});
            return;
        }
        synchronized (this.l) {
            try {
                boolean D0 = D0();
                O0();
                long b = this.k.b();
                if (b > this.d && !D0) {
                    this.k.e();
                    D0();
                }
                if (b > this.d) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = (this.d * 9) / 10;
                    C(j, CacheEventListener.EvictionReason.CACHE_FULL);
                    pp.c("DiskStorageCache", "- evictAboveSize: desiredSize=" + j + ", elapsed=" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89d5fa41", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.k.d()) {
            long j = this.g;
            if (j != -1 && currentTimeMillis - j <= n) {
                return false;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        E0();
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        pp.c("DiskStorageCache", "- maybeUpdateFileCacheSizeAndIndex: now=" + currentTimeMillis + ", elapsed=" + currentTimeMillis3 + "ms, thread=" + VExecutors.currentThread());
        this.g = currentTimeMillis;
        return true;
    }

    public final void E0() {
        Set<String> set;
        String str;
        IOException e;
        String str2;
        long j;
        boolean z = false;
        int i = 1;
        String str3 = "DiskStorageCache";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b707018", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = m + currentTimeMillis;
        if (((HashSet) this.f).isEmpty()) {
            set = this.f;
        } else {
            set = new HashSet<>();
        }
        try {
            long j3 = -1;
            int i2 = 0;
            long j4 = 0;
            int i3 = 0;
            int i4 = 0;
            for (a.AbstractC0322a aVar : this.i.K0()) {
                try {
                    i3 += i;
                    j4 += aVar.getSize();
                    if (aVar.getTimestamp() > j2) {
                        i4 += i;
                        str2 = str3;
                        try {
                            j = currentTimeMillis;
                            i2 = (int) (i2 + aVar.getSize());
                            j3 = Math.max(aVar.getTimestamp() - currentTimeMillis, j3);
                            z = true;
                        } catch (IOException e2) {
                            e = e2;
                            str = str2;
                            this.j.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, str, "calcFileCacheSize: " + e.getMessage(), e);
                            return;
                        }
                    } else {
                        str2 = str3;
                        j = currentTimeMillis;
                        set.add(aVar.getId());
                        j3 = j3;
                    }
                    str3 = str2;
                    currentTimeMillis = j;
                    i = 1;
                } catch (IOException e3) {
                    e = e3;
                    str2 = str3;
                    str = str2;
                    this.j.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, str, "calcFileCacheSize: " + e.getMessage(), e);
                    return;
                }
            }
            str2 = str3;
            if (z) {
                str = str2;
                try {
                    this.j.a(CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY, str, "Future timestamp found in " + i4 + " files , with a total size of " + i2 + " bytes, and a maximum time delta of " + j3 + "ms", null);
                } catch (IOException e4) {
                    e = e4;
                    this.j.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, str, "calcFileCacheSize: " + e.getMessage(), e);
                    return;
                }
            } else {
                str = str2;
            }
            long j5 = i3;
            if (!(this.k.a() == j5 && this.k.b() == j4)) {
                Set<String> set2 = this.f;
                if (set2 != set) {
                    ((HashSet) set2).clear();
                    this.f.addAll(set);
                }
                this.k.f(j4, j5);
            }
        } catch (IOException e5) {
            e = e5;
            str = str3;
        }
    }

    public List<String> F(ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ddf6a735", new Object[]{this, ps2Var});
        }
        synchronized (this.l) {
            try {
                List<String> c0 = c0(ps2Var);
                if (c0.size() <= 0) {
                    return null;
                }
                return this.i.f(c0.get(0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection<a.AbstractC0322a> K0() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("73c41b86", new Object[]{this});
        }
        return this.i.K0();
    }

    public boolean L0(ps2 ps2Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78df9ec2", new Object[]{this, ps2Var})).booleanValue();
        }
        synchronized (this.l) {
            try {
                try {
                    List<String> c0 = c0(ps2Var);
                    if (c0.size() > 0) {
                        String str = c0.get(0);
                        mfp c2 = new mfp().c(ps2Var);
                        c2.j(str);
                        long Q = this.i.Q(str, ps2Var);
                        ((HashSet) this.f).remove(str);
                        c2.i(Q).e(this.k.b());
                        CacheEventListener cacheEventListener = this.e;
                        if (cacheEventListener != null) {
                            ((vp) cacheEventListener).i(c2);
                        }
                        if (Q < 0) {
                            z = false;
                        }
                        return z;
                    }
                } catch (IOException e) {
                    CacheErrorLogger cacheErrorLogger = this.j;
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.DELETE_FILE;
                    cacheErrorLogger.a(cacheErrorCategory, "DiskStorageCache", "delete: " + e.getMessage(), e);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a.b N0(String str, ps2 ps2Var) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("5bab2339", new Object[]{this, str, ps2Var});
        }
        C0();
        return this.i.P(str, ps2Var, ps2Var);
    }

    public final void O0() {
        StatFsHelper.StorageType storageType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5837224", new Object[]{this});
            return;
        }
        if (this.i.isExternal()) {
            storageType = StatFsHelper.StorageType.EXTERNAL;
        } else {
            storageType = StatFsHelper.StorageType.INTERNAL;
        }
        if (this.h.f(storageType, this.b - this.k.b())) {
            this.d = this.f6199a;
        } else {
            this.d = this.b;
        }
    }

    public sa2 Z(ps2 ps2Var) {
        sa2 sa2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sa2) ipChange.ipc$dispatch("4b8732dc", new Object[]{this, ps2Var});
        }
        pp.c("DiskStorageCache", "- getResource: key=" + ps2Var + ", thread=" + VExecutors.currentThread());
        mfp c2 = new mfp().c(ps2Var);
        try {
            synchronized (this.l) {
                List<String> c0 = c0(ps2Var);
                String str = null;
                sa2Var = null;
                for (int i = 0; i < c0.size(); i++) {
                    str = c0.get(i);
                    c2.j(str);
                    sa2Var = this.i.h(str, ps2Var, ps2Var);
                    if (sa2Var != null) {
                        break;
                    }
                }
                if (sa2Var == null) {
                    CacheEventListener cacheEventListener = this.e;
                    if (cacheEventListener != null) {
                        ((vp) cacheEventListener).h(c2);
                    }
                    ((HashSet) this.f).remove(str);
                } else {
                    CacheEventListener cacheEventListener2 = this.e;
                    if (cacheEventListener2 != null) {
                        ((vp) cacheEventListener2).f(c2);
                    }
                    ((HashSet) this.f).add(str);
                }
            }
            return sa2Var;
        } catch (IOException e) {
            this.j.a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, "DiskStorageCache", "getResource", e);
            c2.h(e);
            CacheEventListener cacheEventListener3 = this.e;
            if (cacheEventListener3 != null) {
                ((vp) cacheEventListener3).B0(c2);
            }
            return null;
        }
    }

    public void clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
            return;
        }
        synchronized (this.l) {
            try {
                this.i.clearAll();
                ((HashSet) this.f).clear();
            } catch (IOException e) {
                CacheErrorLogger cacheErrorLogger = this.j;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
                cacheErrorLogger.a(cacheErrorCategory, "DiskStorageCache", "clearAll: " + e.getMessage(), e);
            }
            this.k.e();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.i.close();
        }
    }

    public final Collection<a.AbstractC0322a> f0(Collection<a.AbstractC0322a> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("d6576bd2", new Object[]{this, collection});
        }
        return collection;
    }

    public boolean i0(ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("448d98c1", new Object[]{this, ps2Var})).booleanValue();
        }
        synchronized (this.l) {
            if (n0(ps2Var)) {
                return true;
            }
            try {
                List<String> c0 = c0(ps2Var);
                for (int i = 0; i < c0.size(); i++) {
                    String str = c0.get(i);
                    if (this.i.b0(str, ps2Var, ps2Var)) {
                        ((HashSet) this.f).add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public boolean n0(ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("693fde26", new Object[]{this, ps2Var})).booleanValue();
        }
        synchronized (this.l) {
            try {
                List<String> c0 = c0(ps2Var);
                for (int i = 0; i < c0.size(); i++) {
                    if (((HashSet) this.f).contains(c0.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public sa2 u0(ps2 ps2Var, mjx mjxVar) throws IOException {
        String L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sa2) ipChange.ipc$dispatch("2f131683", new Object[]{this, ps2Var, mjxVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        mfp c2 = new mfp().c(ps2Var);
        CacheEventListener cacheEventListener = this.e;
        if (cacheEventListener != null) {
            ((vp) cacheEventListener).k(c2);
        }
        synchronized (this.l) {
            L = L(ps2Var);
        }
        c2.j(L);
        try {
            a.b N0 = N0(L, ps2Var);
            N0.a(mjxVar, ps2Var, ps2Var);
            sa2 w = w(N0, ps2Var, L);
            c2.i(w.size()).e(this.k.b()).f(System.currentTimeMillis() - currentTimeMillis);
            CacheEventListener cacheEventListener2 = this.e;
            if (cacheEventListener2 != null) {
                ((vp) cacheEventListener2).L0(c2);
            }
            if (!N0.cleanUp()) {
                pp.e("DiskStorageCache", "Failed to delete temp file");
            }
            return w;
        } catch (IOException e) {
            c2.h(e);
            CacheEventListener cacheEventListener3 = this.e;
            if (cacheEventListener3 != null) {
                ((vp) cacheEventListener3).E0(c2);
            }
            pp.e("DiskStorageCache", "Failed inserting a file into the cache", e);
            throw e;
        }
    }

    public final sa2 w(a.b bVar, ps2 ps2Var, String str) throws IOException {
        sa2 b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sa2) ipChange.ipc$dispatch("90930f20", new Object[]{this, bVar, ps2Var, str});
        }
        synchronized (this.l) {
            b = bVar.b(ps2Var, ps2Var);
            ((HashSet) this.f).add(str);
            this.k.c(b.size(), 1L);
        }
        return b;
    }

    public static void B0(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee04a2f", new Object[]{context, str});
        } else if (context != null) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            if (context != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getFilesDir().getParent());
                String str2 = File.separator;
                sb.append(str2);
                sb.append("shared_prefs");
                sb.append(str2);
                sb.append("disk_entries_list");
                sb.append(str);
                String sb2 = sb.toString();
                File file = new File(sb2 + ".xml");
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Exception unused) {
                    pp.e("DiskStorageCache", "Fail to delete SharedPreference from file system. ");
                }
            }
        }
    }
}
