package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "TBIStateCenter";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Object> f16377a = new HashMap<>();
    public final HashMap<String, ArrayList<ksd>> b = new HashMap<>();
    public final Lock c = new ReentrantLock();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(803209270);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(803209269);
    }

    public final <T> T a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8f099586", new Object[]{this, str});
        }
        ckf.g(str, "key");
        try {
            ((ReentrantLock) this.c).lock();
            return (T) this.f16377a.get(str);
        } finally {
            ((ReentrantLock) this.c).unlock();
        }
    }

    public final void b(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54233695", new Object[]{this, str, obj, obj2});
            return;
        }
        ArrayList<ksd> arrayList = this.b.get(str);
        if (arrayList == null || arrayList.isEmpty()) {
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.b(TAG, "notify state changed, no " + str + " listener registered");
            return;
        }
        Iterator<ksd> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(str, obj, obj2);
        }
    }

    public final void c(String str, ksd ksdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f082994e", new Object[]{this, str, ksdVar});
            return;
        }
        ckf.g(str, "key");
        ckf.g(ksdVar, DataReceiveMonitor.CB_LISTENER);
        ArrayList<ksd> arrayList = this.b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.b.put(str, arrayList);
        }
        if (arrayList.contains(ksdVar)) {
            wfr.INSTANCE.a(TAG, "register state listener, listener has been registered");
        } else {
            arrayList.add(ksdVar);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f16377a.clear();
        this.b.clear();
    }

    /* JADX WARN: Finally extract failed */
    public final void d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c480d27c", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "key");
        Object obj2 = this.f16377a.get(str);
        if (!(obj2 == null && obj == null) && (obj2 == null || !obj2.equals(str))) {
            try {
                ((ReentrantLock) this.c).lock();
                this.f16377a.put(str, obj);
                ((ReentrantLock) this.c).unlock();
                b(str, obj2, obj);
            } catch (Throwable th) {
                ((ReentrantLock) this.c).unlock();
                throw th;
            }
        } else {
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.a(TAG, "set state " + str + ", but value not change " + obj2);
        }
    }
}
