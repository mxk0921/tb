package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cxm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_PRIORITY = 1;
    public static final int LOW_PRIORITY = 2;
    public static final int NORMAL_PRIORITY = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f17415a = new Handler(Looper.getMainLooper());
    public final boolean b = akt.p2("filterDupMessage", true);
    public final List<WeakReference<c>> c = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f17416a;

        public a(cxm cxmVar, c cVar) {
            this.f17416a = cVar;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            this.f17416a.run();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MessageQueue.IdleHandler f17417a;

        public b(MessageQueue.IdleHandler idleHandler) {
            this.f17417a = idleHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Looper.myQueue().addIdleHandler(this.f17417a);
            }
        }
    }

    static {
        t2o.a(503317418);
    }

    public static /* synthetic */ void a(cxm cxmVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90e01c9", new Object[]{cxmVar, cVar});
        } else {
            cxmVar.f(cVar);
        }
    }

    public final void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01cb606", new Object[]{this, cVar});
            return;
        }
        synchronized (this.c) {
            ((ArrayList) this.c).add(new WeakReference(cVar));
        }
    }

    public void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7053a6cb", new Object[]{this, cVar});
            return;
        }
        c.c(cVar, this);
        int b2 = c.b(cVar);
        if (b2 == 1) {
            if (this.b) {
                c e = e(c.a(cVar));
                if (e != null) {
                    this.f17415a.removeCallbacks(e);
                }
                b(cVar);
            }
            this.f17415a.postAtFrontOfQueue(cVar);
        } else if (b2 != 2) {
            this.f17415a.post(cVar);
        } else {
            nwv.z0(new b(new a(this, cVar)), true);
        }
    }

    public void d(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bde4d6", new Object[]{this, cVar, new Integer(i)});
            return;
        }
        if (c.b(cVar) != 0) {
            tfs.e("PriorityHandler", "only support normal priority task");
        }
        this.f17415a.postDelayed(cVar, i);
    }

    public final c e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("a33b9471", new Object[]{this, str});
        }
        synchronized (this.c) {
            try {
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    c cVar = (c) ((WeakReference) it.next()).get();
                    if (cVar != null && TextUtils.equals(c.a(cVar), str)) {
                        it.remove();
                        return cVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d19ec3", new Object[]{this, cVar});
            return;
        }
        synchronized (this.c) {
            try {
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    if (((WeakReference) it.next()).get() == cVar) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private cxm f17418a;
        private String b;
        private int c = 0;

        static {
            t2o.a(503317421);
        }

        public c() {
        }

        public static /* synthetic */ String a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad5dce5", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4c53f34f", new Object[]{cVar})).intValue();
            }
            return cVar.c;
        }

        public static /* synthetic */ cxm c(c cVar, cxm cxmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cxm) ipChange.ipc$dispatch("96139aef", new Object[]{cVar, cxmVar});
            }
            cVar.f17418a = cxmVar;
            return cxmVar;
        }

        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.c == 1) {
                cxm.a(this.f17418a, this);
            }
        }

        public c(String str) {
            this.b = str;
        }
    }
}
