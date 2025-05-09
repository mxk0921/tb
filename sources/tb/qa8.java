package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ElasticSchedulerEngine;
import com.taobao.themis.taobao.utils.TMSUrlChecker;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qa8 implements j6e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_RUNNABLE = 1;
    public static final int STATUS_WAIT = 2;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Deque<Pair<String, Runnable>>> f26623a = new HashMap();
    public int b = 1;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public long d = -1;
    public final hvd e = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qa8.this.l();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26629a;

        public f(String str) {
            this.f26629a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qa8.c(qa8.this, this.f26629a);
            }
        }
    }

    public static /* synthetic */ AtomicBoolean a(qa8 qa8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("91849bd", new Object[]{qa8Var});
        }
        return qa8Var.c;
    }

    public static /* synthetic */ Map b(qa8 qa8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("56bb0ff3", new Object[]{qa8Var});
        }
        return qa8Var.f26623a;
    }

    public static /* synthetic */ void c(qa8 qa8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa8cbc9", new Object[]{qa8Var, str});
        } else {
            qa8Var.n(str);
        }
    }

    public static /* synthetic */ int d(qa8 qa8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59d62533", new Object[]{qa8Var})).intValue();
        }
        return qa8Var.b;
    }

    public static /* synthetic */ int e(qa8 qa8Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ca02a74", new Object[]{qa8Var, new Integer(i)})).intValue();
        }
        qa8Var.b = i;
        return i;
    }

    public static /* synthetic */ long f(qa8 qa8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56bbacd5", new Object[]{qa8Var, new Long(j)})).longValue();
        }
        qa8Var.d = j;
        return j;
    }

    public static /* synthetic */ void g(qa8 qa8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242be58c", new Object[]{qa8Var, str});
        } else {
            qa8Var.o(str);
        }
    }

    public void h(int i, float f2, float f3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23228e6d", new Object[]{this, new Integer(i), new Float(f2), new Float(f3), new Long(j)});
        } else if (pxn.d().m()) {
            if ((i == 2 || i == 1) && !j() && System.currentTimeMillis() - this.d >= 500) {
                la8.c("elastic.UnifiedDispatcher", "[handlerTouchEvent] resume dispatcher.", new Object[0]);
                l();
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (pxn.d().m()) {
            com.taobao.tao.navigation.a.h(this.e);
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    public void k(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5645c91", new Object[]{this, uri});
        } else if (pxn.d().m()) {
            ja8.a(new d(uri));
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            q(1);
        }
    }

    public void m(String str, String str2, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb344f30", new Object[]{this, str, str2, runnable});
        } else if (!pxn.d().m()) {
            ja8.c(runnable);
        } else {
            ja8.a(new b(str, str2, runnable));
        }
    }

    public final void n(String str) {
        Pair<String, Runnable> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24946205", new Object[]{this, str});
        } else if (this.b == 2) {
            la8.c("elastic.UnifiedDispatcher", "[scheduleInternal] status is wait.", new Object[0]);
        } else if (!TextUtils.isEmpty(str)) {
            Deque deque = (Deque) ((HashMap) this.f26623a).get(str);
            if (!(deque == null || deque.isEmpty())) {
                r(str, (Pair) deque.poll());
            }
        } else {
            for (Map.Entry entry : ((HashMap) this.f26623a).entrySet()) {
                Deque deque2 = (Deque) entry.getValue();
                if (!(deque2 == null || deque2.isEmpty() || (pair = (Pair) deque2.poll()) == null)) {
                    r((String) entry.getKey(), pair);
                }
            }
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53279820", new Object[]{this, str});
        } else {
            ja8.a(new f(str));
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35afa6c3", new Object[]{this});
            return;
        }
        q(2);
        ja8.d(new c(), 3000L, TimeUnit.MILLISECONDS);
    }

    public final void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841d1e21", new Object[]{this, new Integer(i)});
        } else if (pxn.d().m()) {
            ja8.a(new e(i));
        }
    }

    public final void r(String str, Pair<String, Runnable> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4bb57b", new Object[]{this, str, pair});
        } else if (pair != null && pair.second != null) {
            ja8.c(new g(str, pair));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26625a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Runnable c;

        public b(String str, String str2, Runnable runnable) {
            this.f26625a = str;
            this.b = str2;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            la8.c("elastic.UnifiedDispatcher", "[schedule] add task to unified dispatcher.", "type", this.f26625a, "name", this.b, "task", this.c);
            Deque deque = (Deque) qa8.b(qa8.this).get(this.f26625a);
            if (deque == null) {
                deque = new ArrayDeque();
            }
            deque.add(Pair.create(this.b, this.c));
            qa8.b(qa8.this).put(this.f26625a, deque);
            qa8.c(qa8.this, this.f26625a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f26627a;

        public d(Uri uri) {
            this.f26627a = uri;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TMSUrlChecker.isTMSUrl(pa8.a(), this.f26627a)) {
                la8.c("elastic.UnifiedDispatcher", "[process]hit tms url, suspend dispatcher.", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, this.f26627a);
                qa8.this.p();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26630a;
        public final /* synthetic */ Pair b;

        public g(String str, Pair pair) {
            this.f26630a = str;
            this.b = pair;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                sz8.b(this.f26630a, (String) this.b.first);
                ((Runnable) this.b.second).run();
                la8.c("elastic.UnifiedDispatcher", "[workInternal].", "type", this.f26630a, "task", this.b, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f26628a;

        public e(int i) {
            this.f26628a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int d = qa8.d(qa8.this);
            int i = this.f26628a;
            if (d != i) {
                if (i == 2) {
                    qa8.f(qa8.this, System.currentTimeMillis());
                }
                la8.c("elastic.UnifiedDispatcher", "[updateStatus] called.", "status", Integer.valueOf(this.f26628a));
                qa8.e(qa8.this, this.f26628a);
                qa8.c(qa8.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                return;
            }
            la8.c("elastic.UnifiedDispatcher", "[onTabChanged] called.", "tabIndex", Integer.valueOf(i), "tabName", str);
            if ("cart".equals(str) && qa8.a(qa8.this).compareAndSet(false, true)) {
                ElasticSchedulerEngine.m().b().p();
            }
        }
    }
}
