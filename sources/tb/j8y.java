package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j8y {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean h;
    public static final byte[] i = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public String f21840a;
    public int b;
    public String c;
    public String d;
    public int e;
    public int f;
    public long g;

    public static /* synthetic */ Set a(j8y j8yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5c72644a", new Object[]{j8yVar});
        }
        return j8yVar.h();
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        h = z;
        return z;
    }

    public static /* synthetic */ Set d(j8y j8yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d1ec8a8b", new Object[]{j8yVar});
        }
        return j8yVar.g();
    }

    public static /* synthetic */ boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return h;
    }

    public static /* synthetic */ byte[] f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[0]);
        }
        return i;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ewx.a(new a());
        }
    }

    public final Set<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("916979a", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add(pod.IP);
        hashSet.add("port");
        hashSet.add("protocol");
        hashSet.add("nettype");
        hashSet.add(rb.RESULT_KEY);
        hashSet.add("code");
        return hashSet;
    }

    public final Set<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d6c0f95b", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("connecttime");
        return hashSet;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(pod.IP, j8y.this.f21840a);
            hashMap.put("port", String.valueOf(j8y.this.b));
            hashMap.put("protocol", j8y.this.c);
            hashMap.put("nettype", j8y.this.d);
            hashMap.put(rb.RESULT_KEY, String.valueOf(j8y.this.e));
            hashMap.put("code", String.valueOf(j8y.this.f));
            HashMap hashMap2 = new HashMap();
            long j = j8y.this.g;
            if (j > 0) {
                hashMap2.put("connecttime", Double.valueOf(j));
            }
            if (!j8y.e()) {
                synchronized (j8y.f()) {
                    try {
                        if (!j8y.e()) {
                            dzx.b("ARUP", "QuicDetect", j8y.a(j8y.this), j8y.d(j8y.this), false);
                            j8y.c(true);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (rtx.d(16)) {
                rtx.a(16, "QuicDetectStatistics", "commit statistic, dimensions:" + hashMap + ", measures:" + hashMap2);
            }
            dzx.a("ARUP", "QuicDetect", hashMap2, hashMap);
        }
    }
}
