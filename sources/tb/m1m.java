package tb;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, Drawable> h = new HashMap();
    public final pp6 b;
    public final int c;
    public final List<String> d;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f23719a = new AtomicInteger(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final s8d f = new a();
    public final s8d g = new b();

    static {
        t2o.a(1032847453);
    }

    public m1m(List<String> list, pp6 pp6Var) {
        this.b = pp6Var;
        this.d = list;
        ((HashMap) h).clear();
        if (list != null) {
            this.c = list.size();
        } else {
            this.c = 0;
        }
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ AtomicInteger b(m1m m1mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("97c60a09", new Object[]{m1mVar});
        }
        return m1mVar.f23719a;
    }

    public static /* synthetic */ void c(m1m m1mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52838c05", new Object[]{m1mVar, new Integer(i)});
        } else {
            m1mVar.h(i);
        }
    }

    public static /* synthetic */ pp6 d(m1m m1mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pp6) ipChange.ipc$dispatch("5a06140e", new Object[]{m1mVar});
        }
        return m1mVar.b;
    }

    public static /* synthetic */ AtomicBoolean e(m1m m1mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("7971babc", new Object[]{m1mVar});
        }
        return m1mVar.e;
    }

    public static Map<String, Drawable> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d415601d", new Object[0]);
        }
        return h;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede0495a", new Object[]{this});
        } else if (this.b != null && this.c != 0) {
            for (String str : this.d) {
                TLog.loge("tab3edlp", " PhenixLoad load ur " + str);
                s0m.B().N0(Globals.getApplication()).T(str).succListener(this.f).failListener(this.g).fetch();
            }
        }
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943a01a1", new Object[]{this, new Integer(i)});
        } else if (i >= this.c && !this.e.get()) {
            TLog.loge("tab3edlp", " PhenixLoad onAllComplete ");
            this.b.onComplete();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            String url = succPhenixEvent.getUrl();
            TLog.loge("tab3edlp", "PhenixLoad success url is " + url);
            m1m.a().put(url, drawable);
            m1m.c(m1m.this, m1m.b(m1m.this).addAndGet(1));
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            TLog.loge("tab3edlp", "PhenixLoad error url is " + failPhenixEvent.getUrl() + "|" + failPhenixEvent.getResultCode() + "|" + failPhenixEvent.getHttpMessage());
            m1m.a().clear();
            if (m1m.d(m1m.this) != null && !m1m.e(m1m.this).getAndSet(true)) {
                TLog.loge("tab3edlp", " PhenixLoad onError ");
                pp6 d = m1m.d(m1m.this);
                d.onError(failPhenixEvent.getResultCode() + "", failPhenixEvent.getHttpMessage(), failPhenixEvent);
            }
            return false;
        }
    }
}
