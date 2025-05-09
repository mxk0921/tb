package tb;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, CopyOnWriteArrayList<iwq>> f24079a;
    public final qsa b;
    public final go1 c;
    public final oe1 d;
    public final ExecutorService e;
    public final ThreadLocal<c> f;
    public static final String g = "EventCenter";
    public static final qj8 DEFAULT_BUILDER = new qj8();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends ThreadLocal<c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(mj8 mj8Var) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/event/EventCenter$1");
        }

        /* renamed from: a */
        public c initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b758078", new Object[]{this});
            }
            return new c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$trade$event$ThreadMode;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            $SwitchMap$com$taobao$android$trade$event$ThreadMode = iArr;
            try {
                iArr[ThreadMode.CurrentThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$trade$event$ThreadMode[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$trade$event$ThreadMode[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$trade$event$ThreadMode[ThreadMode.AsyncThread.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final List<Pair<Event, kj8>> f24080a = new ArrayList();
        public boolean b;
        public boolean c;
        public Object d;

        static {
            t2o.a(723517448);
        }
    }

    static {
        t2o.a(723517445);
    }

    public mj8() {
        this(DEFAULT_BUILDER);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                Iterator it = new ArrayList(((HashMap) this.f24079a).keySet()).iterator();
                while (it.hasNext()) {
                    l(((Integer) it.next()).intValue());
                }
                ((HashMap) this.f24079a).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final CopyOnWriteArrayList<iwq> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("1e94047a", new Object[]{this, new Integer(i)});
        }
        return (CopyOnWriteArrayList) ((HashMap) this.f24079a).get(Integer.valueOf(i));
    }

    public ExecutorService c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("d9806c48", new Object[]{this});
        }
        return this.e;
    }

    public void d(gwl gwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce8d012", new Object[]{this, gwlVar});
            return;
        }
        Event event = gwlVar.f20271a;
        iwq iwqVar = gwlVar.b;
        kj8 kj8Var = gwlVar.c;
        gwl.b(gwlVar);
        if (iwqVar.e) {
            e(iwqVar, event, kj8Var);
        }
    }

    public void e(iwq iwqVar, Event event, kj8 kj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58842375", new Object[]{this, iwqVar, event, kj8Var});
            return;
        }
        rl8 b2 = iwqVar.b();
        if (b2 != null) {
            try {
                gl8 h = b2.h(event);
                if (kj8Var != null) {
                    kj8Var.a(h, b2);
                }
            } catch (Throwable th) {
                Log.e(g, "Handle event error", th);
                if (kj8Var != null) {
                    kj8Var.onEventException(b2);
                }
            }
        }
    }

    public void f(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4810f089", new Object[]{this, event});
        } else {
            g(event, null);
        }
    }

    public void g(Event event, kj8 kj8Var) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd7da2c", new Object[]{this, event, kj8Var});
        } else if (event != null) {
            c cVar = this.f.get();
            ArrayList arrayList = (ArrayList) cVar.f24080a;
            arrayList.add(new Pair(event, kj8Var));
            if (!cVar.b) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.c = z;
                cVar.b = true;
                while (!arrayList.isEmpty()) {
                    try {
                        Pair pair = (Pair) arrayList.remove(0);
                        h((Event) pair.first, (kj8) pair.second, cVar);
                    } finally {
                        cVar.b = false;
                        cVar.c = false;
                    }
                }
            }
        }
    }

    public final void h(Event event, kj8 kj8Var, c cVar) {
        CopyOnWriteArrayList<iwq> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6530", new Object[]{this, event, kj8Var, cVar});
            return;
        }
        int eventId = event.getEventId();
        synchronized (this) {
            b2 = b(eventId);
        }
        if (b2 != null && !b2.isEmpty()) {
            Iterator<iwq> it = b2.iterator();
            while (it.hasNext()) {
                cVar.d = event;
                i(it.next(), event, kj8Var, cVar.c);
            }
        }
    }

    public final void i(iwq iwqVar, Event event, kj8 kj8Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d4d4f7", new Object[]{this, iwqVar, event, kj8Var, new Boolean(z)});
            return;
        }
        rl8 b2 = iwqVar.b();
        if (b2 != null) {
            ek8 a2 = iwqVar.a();
            if (a2 == null || a2.a(event)) {
                int i = b.$SwitchMap$com$taobao$android$trade$event$ThreadMode[b2.R().ordinal()];
                if (i == 1) {
                    e(iwqVar, event, kj8Var);
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.d.a(iwqVar, event, kj8Var);
                        }
                    } else if (z) {
                        this.c.a(iwqVar, event, kj8Var);
                    } else {
                        e(iwqVar, event, kj8Var);
                    }
                } else if (z) {
                    e(iwqVar, event, kj8Var);
                } else {
                    this.b.a(iwqVar, event, kj8Var);
                }
            }
        }
    }

    public void j(int i, rl8 rl8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b67f6f9", new Object[]{this, new Integer(i), rl8Var});
        } else {
            k(i, rl8Var, null);
        }
    }

    public void k(int i, rl8 rl8Var, dl8 dl8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0967049", new Object[]{this, new Integer(i), rl8Var, dl8Var});
        } else if (rl8Var != null) {
            synchronized (this) {
                try {
                    CopyOnWriteArrayList<iwq> b2 = b(i);
                    if (b2 == null) {
                        b2 = new CopyOnWriteArrayList<>();
                    }
                    Iterator<iwq> it = b2.iterator();
                    while (it.hasNext()) {
                        if (it.next().b() == rl8Var) {
                            return;
                        }
                    }
                    b2.add(new iwq(i, rl8Var, null, false));
                    ((HashMap) this.f24079a).put(Integer.valueOf(i), b2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e630a0", new Object[]{this, new Integer(i)});
        } else {
            m(i, null);
        }
    }

    public void m(int i, rl8 rl8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed35f00", new Object[]{this, new Integer(i), rl8Var});
            return;
        }
        synchronized (this) {
            try {
                CopyOnWriteArrayList<iwq> b2 = b(i);
                if (b2 != null && !b2.isEmpty()) {
                    if (rl8Var == null) {
                        ((HashMap) this.f24079a).remove(Integer.valueOf(i));
                        for (iwq iwqVar : b2) {
                            iwqVar.e = false;
                        }
                        return;
                    }
                    int size = b2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        iwq iwqVar2 = b2.get(i2);
                        if (iwqVar2.b() == rl8Var) {
                            iwqVar2.e = false;
                            b2.remove(i2);
                            i2--;
                            size--;
                        }
                        i2++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mj8(qj8 qj8Var) {
        this.f = new a(this);
        this.f24079a = new HashMap();
        this.b = new qsa(this, Looper.getMainLooper(), 10);
        this.c = new go1(this);
        this.d = new oe1(this);
        this.e = qj8Var.f26781a;
    }
}
