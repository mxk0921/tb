package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.PackUpdateFinishedCallback;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, HashSet<PackUpdateFinishedCallback>> f16454a = new HashMap<>();
    public static final ConcurrentHashMap<qpx, Boolean> b = new ConcurrentHashMap<>();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashSet f16455a;
        public final /* synthetic */ String b;

        public a(HashSet hashSet, String str) {
            this.f16455a = hashSet;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = this.f16455a.iterator();
            while (it.hasNext()) {
                ((PackUpdateFinishedCallback) it.next()).finish(this.b, null);
            }
        }
    }

    static {
        t2o.a(996147264);
    }

    public static void a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b68354b", new Object[]{str, strArr});
            return;
        }
        HashSet hashSet = new HashSet();
        synchronized (f16454a) {
            try {
                for (String str2 : strArr) {
                    HashSet<PackUpdateFinishedCallback> hashSet2 = f16454a.get(str2);
                    if (hashSet2 != null) {
                        hashSet.addAll(hashSet2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hashSet.size() > 0) {
            tft.b(new a(hashSet, str));
        }
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d15f08", new Object[]{new Integer(i)});
            return;
        }
        c.set(true);
        for (Map.Entry<qpx, Boolean> entry : b.entrySet()) {
            entry.getKey().a(i);
            if (entry.getValue().booleanValue()) {
                b.remove(entry.getKey());
            }
        }
    }

    public static void c(String str, PackUpdateFinishedCallback packUpdateFinishedCallback) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2daa1393", new Object[]{str, packUpdateFinishedCallback});
            return;
        }
        HashMap<String, HashSet<PackUpdateFinishedCallback>> hashMap = f16454a;
        synchronized (hashMap) {
            try {
                HashSet<PackUpdateFinishedCallback> hashSet = hashMap.get(str);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    hashMap.put(str, hashSet);
                } else {
                    z = false;
                }
                hashSet.add(packUpdateFinishedCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            dpx.j(str);
        }
    }

    public static void d(qpx qpxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e8fba", new Object[]{qpxVar, new Boolean(z)});
        } else if (!z || !c.get()) {
            b.put(qpxVar, Boolean.valueOf(z));
        }
    }
}
