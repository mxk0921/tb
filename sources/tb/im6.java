package tb;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.IDXApmManager;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.fxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class im6<VideoData, Video> implements cxb<VideoData, Video>, IDXApmManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PLAY_CONTROL_MAX_FINDING_COUNT = 3;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<RecyclerView> f21401a;
    public final fxb<VideoData, Video> b;
    public final gxb<Video> c;
    public final DXVideoControlConfig<VideoData> d;
    public final k<VideoData, Video> e;
    public int f = 0;
    public final boolean g;
    public Handler h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f21402a;
        public final /* synthetic */ String b;

        public a(Object obj, String str) {
            this.f21402a = obj;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                im6.this.g(this.f21402a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                im6.this.e();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (String str : ((s00) im6.this.b).C()) {
                im6.i(im6.this, null, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String next;
            List<Video> h;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator<String> it = ((s00) im6.this.b).C().iterator();
            while (it.hasNext() && (h = ((s00) im6.this.b).h((next = it.next()))) != null && !h.isEmpty()) {
                for (Video video : h) {
                    if (((nm6) im6.this.c).a(video)) {
                        im6 im6Var = im6.this;
                        ((nm6) im6Var.c).e(im6Var, video, next);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                im6.this.e();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21407a;

        public f(String str) {
            this.f21407a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                im6.this.c(this.f21407a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f21408a;
        public final /* synthetic */ String b;

        public g(Object obj, String str) {
            this.f21408a = obj;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                im6.this.d(this.f21408a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f21409a;
        public final /* synthetic */ String b;

        public h(List list, String str) {
            this.f21409a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                im6.this.b(this.f21409a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f21410a;
        public final /* synthetic */ String b;

        public i(Object obj, String str) {
            this.f21410a = obj;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                im6.this.f(this.f21410a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f21411a;
        public final /* synthetic */ String b;

        public j(Object obj, String str) {
            this.f21411a = obj;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                im6.this.h(this.f21411a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface k<VideoData, Video> {
    }

    static {
        t2o.a(444597093);
        t2o.a(444597086);
        t2o.a(444596605);
    }

    public im6(RecyclerView recyclerView, fxb<VideoData, Video> fxbVar, gxb<Video> gxbVar, DXVideoControlConfig<VideoData> dXVideoControlConfig, k<VideoData, Video> kVar) {
        this.f21401a = new WeakReference<>(recyclerView);
        this.b = fxbVar;
        this.c = gxbVar;
        this.d = dXVideoControlConfig;
        this.e = kVar;
        this.g = dXVideoControlConfig.B();
        if (dXVideoControlConfig.A()) {
            recyclerView.addOnAttachStateChangeListener(new b());
        }
        if (dXVideoControlConfig.x()) {
            DinamicXEngine.L0(this);
        }
    }

    public static /* synthetic */ void i(im6 im6Var, Collection collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81865911", new Object[]{im6Var, collection, str});
        } else {
            im6Var.B(collection, str);
        }
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public Collection<String> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("325f3b19", new Object[]{this});
        }
        return ((s00) this.b).C();
    }

    public final void B(Collection<Video> collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6434144", new Object[]{this, collection, str});
        } else {
            C(collection, str, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Collection<Video> collection, String str, boolean z) {
        List<Video> h2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2259a10", new Object[]{this, collection, str, new Boolean(z)});
            return;
        }
        if (collection != null) {
            for (Video video : collection) {
                if (((nm6) this.c).a(video) && !((s00) this.b).f(str, video)) {
                    ((nm6) this.c).e(this, video, str);
                }
            }
        }
        if (z && (h2 = ((s00) this.b).h(str)) != null) {
            Iterator<Video> it = h2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                o(str, next);
                while (((nm6) this.c).g() > 0 && (next = ((s00) this.b).w(str, next)) != null && !((nm6) this.c).a(next) && !n()) {
                    o(str, next);
                }
            }
        }
    }

    @Override // tb.cxb
    public void a(VideoData videodata, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d4d137", new Object[]{this, videodata, str, new Boolean(z)});
            return;
        }
        try {
            if (!m()) {
                w(videodata, str);
                return;
            }
            Collection<Video> i2 = ((s00) this.b).i(str, videodata);
            if (i2 != null || !this.g) {
                C(i2, str, z);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    @Override // tb.cxb
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddba8d6", new Object[]{this, str});
            return;
        }
        try {
            if (!m()) {
                v(str);
                return;
            }
            for (Video video : ((s00) this.b).d(str)) {
                ((nm6) this.c).e(this, video, str);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    @Override // tb.cxb
    public void d(VideoData videodata, String str) {
        List<Video> m;
        Video video;
        List<Video> h2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c47c82e", new Object[]{this, videodata, str});
            return;
        }
        try {
            if (!m()) {
                s(videodata, str);
                return;
            }
            Collection<Video> b2 = ((s00) this.b).b(str, videodata);
            if (this.d.r() == 2 && (m = ((s00) this.b).m(str)) != null) {
                Iterator<Video> it = m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        video = null;
                        break;
                    }
                    video = it.next();
                    fxb.a<VideoData> j2 = ((s00) this.b).j(str, video);
                    if (j2 != null && j2.a() == videodata) {
                        break;
                    }
                }
                if (video != null) {
                    if (((nm6) this.c).g() == 0 && (h2 = ((s00) this.b).h(str)) != null && !h2.isEmpty()) {
                        Iterator<Video> it2 = h2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Video next = it2.next();
                            if (((nm6) this.c).a(next)) {
                                ((s00) this.b).A(str, next);
                                ((nm6) this.c).e(this, next, str);
                                break;
                            }
                        }
                    }
                    if (((nm6) this.c).g() > 0) {
                        ((s00) this.b).a(str, video);
                        ((nm6) this.c).c(this, video, str);
                        return;
                    }
                    return;
                }
            }
            z();
            B(b2, str);
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    @Override // tb.cxb
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a06a0c", new Object[]{this});
            return;
        }
        try {
            if (!m()) {
                u();
                return;
            }
            for (Map.Entry<String, List<Video>> entry : ((s00) this.b).e().entrySet()) {
                for (Video video : entry.getValue()) {
                    ((nm6) this.c).e(this, video, entry.getKey());
                }
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    @Override // tb.cxb
    public void f(VideoData videodata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30cd093d", new Object[]{this, videodata, str});
        } else {
            a(videodata, str, true);
        }
    }

    @Override // tb.cxb
    public void g(Video video, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0bc13bb", new Object[]{this, video, str});
            return;
        }
        try {
            if (!m()) {
                y(video, str);
                return;
            }
            ((nm6) this.c).h(video);
            Video k2 = k(video, str);
            ((s00) this.b).E(str, video);
            if (k2 != null && k2 != video) {
                o(str, k2);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    @Override // tb.cxb
    public void h(Video video, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a454c21", new Object[]{this, video, str});
        } else {
            r(video, str, false);
        }
    }

    public final Handler j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new Handler(Looper.getMainLooper());
        }
        return this.h;
    }

    public final Video k(Video video, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("69960ca7", new Object[]{this, video, str});
        }
        Object obj = (Video) ((s00) this.b).p(str, video);
        if (obj == null) {
            return null;
        }
        while (obj != null && ((nm6) this.c).a(obj)) {
            Object w = ((s00) this.b).w(str, obj);
            if (w != null && w == obj) {
                break;
            }
            obj = (Video) w;
        }
        return (Video) obj;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ba22ef", new Object[]{this});
        } else if (zg5.a4()) {
            this.f++;
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54928c8b", new Object[]{this})).booleanValue();
        }
        if (!zg5.a4() || this.f < 3) {
            return false;
        }
        return true;
    }

    public final void o(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b11333", new Object[]{this, str, video});
        } else if (zg5.a4()) {
            l();
            if (p(str, video)) {
                ((nm6) this.c).c(this, video, str);
                z();
            } else if (!n()) {
                r(video, str, true);
            }
        } else {
            ((nm6) this.c).c(this, video, str);
        }
    }

    public boolean p(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55524feb", new Object[]{this, str, video})).booleanValue();
        }
        RecyclerView recyclerView = this.f21401a.get();
        if (this.e == null || recyclerView == null || recyclerView.getScrollState() != 0) {
            return true;
        }
        return ((qm6) this.e).a(video, ((s00) this.b).j(str, video));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q(String str) {
        Object o;
        List<Video> h2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5227c832", new Object[]{this, str});
        } else if (((s00) this.b).m(str) != null && (o = ((s00) this.b).o(str)) != null) {
            if (((nm6) this.c).g() == 0 && (h2 = ((s00) this.b).h(str)) != null && !h2.isEmpty()) {
                Iterator<Video> it = h2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Video next = it.next();
                    if (((nm6) this.c).a(next) && next != o) {
                        ((s00) this.b).A(str, next);
                        ((nm6) this.c).e(this, next, str);
                        break;
                    }
                }
            }
            if (((nm6) this.c).g() > 0) {
                ((s00) this.b).a(str, o);
                ((nm6) this.c).c(this, o, str);
            }
        }
    }

    public final void r(Video video, String str, boolean z) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e64ead3", new Object[]{this, video, str, new Boolean(z)});
            return;
        }
        try {
            if (!m()) {
                x(video, str);
                return;
            }
            if (!z || !((nm6) this.c).a(video)) {
                ((nm6) this.c).h(video);
            } else {
                ((nm6) this.c).e(this, video, str);
            }
            RecyclerView recyclerView = this.f21401a.get();
            if ((recyclerView instanceof axb) && ((s00) this.b).o(str) == video) {
                ((axb) recyclerView).onDidFinishPlayingLastItem(((s00) this.b).k(str, video), ((s00) this.b).n(), str, new HashMap());
            }
            if (this.d.r() == 3) {
                obj = ((s00) this.b).y(str);
            } else {
                obj = k(video, str);
            }
            if (obj == null) {
                z();
            } else {
                o(str, obj);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public final void s(VideoData videodata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7938f36e", new Object[]{this, videodata, str});
        } else {
            j().post(new g(videodata, str));
        }
    }

    public final void t(List<VideoData> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb364a9", new Object[]{this, list, str});
        } else {
            j().post(new h(list, str));
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c504e075", new Object[]{this});
        } else {
            j().post(new e());
        }
    }

    public final void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a330b6ff", new Object[]{this, str});
        } else {
            j().post(new f(str));
        }
    }

    public final void w(VideoData videodata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dbe347d", new Object[]{this, videodata, str});
        } else {
            j().post(new i(videodata, str));
        }
    }

    public final void x(Video video, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df98a761", new Object[]{this, video, str});
        } else {
            j().post(new j(video, str));
        }
    }

    public final void y(Video video, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea59efb", new Object[]{this, video, str});
        } else {
            j().post(new a(video, str));
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720407fc", new Object[]{this});
        } else if (zg5.a4()) {
            this.f = 0;
        }
    }

    @Override // tb.cxb
    public void b(List<VideoData> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799b57e9", new Object[]{this, list, str});
            return;
        }
        try {
            if (!m()) {
                t(list, str);
            } else if (!list.isEmpty()) {
                if (DinamicXEngine.j0()) {
                    h36.g("DXVideoController", "start batchAppendVideo data size: " + list.size());
                }
                Collection<Video> c2 = ((s00) this.b).c(str, list);
                if (this.d.r() == 2) {
                    q(str);
                } else {
                    z();
                    B(c2, str);
                }
                if (DinamicXEngine.j0()) {
                    h36.g("DXVideoController", "end batchAppendVideo");
                }
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    @Override // com.taobao.android.dinamicx.IDXApmManager.a
    public void onEvent(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i2)});
            return;
        }
        if (DinamicXEngine.j0()) {
            h36.g("DXVideoController", "receive apm event: " + i2 + "; at thread " + Thread.currentThread().getName());
        }
        if (i2 == 2) {
            jb6.n(new c());
        } else if (i2 == 1) {
            jb6.n(new d());
        }
    }
}
