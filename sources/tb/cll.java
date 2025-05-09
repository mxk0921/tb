package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cll implements IPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public vy1 b;
    public IPage.d c;
    public WeakReference<Window> d;
    public WeakReference<View> e;
    public WeakReference<Activity> i;
    public WeakReference<Fragment> j;
    public IPage k;
    public String l;
    public String n;
    public boolean o;
    public long x;

    /* renamed from: a  reason: collision with root package name */
    public final String f17140a = String.valueOf(System.nanoTime());
    public String f = null;
    public String g = null;
    public String h = null;
    public final AtomicLong m = new AtomicLong(-1);
    public final AtomicLong p = new AtomicLong(-1);
    public final AtomicInteger q = new AtomicInteger(0);
    public final AtomicInteger r = new AtomicInteger(0);
    public final AtomicInteger s = new AtomicInteger(0);
    public final AtomicInteger t = new AtomicInteger(0);
    public final AtomicInteger u = new AtomicInteger(0);
    public final Map<String, Integer> v = new ConcurrentHashMap();
    public final Map<String, Integer> w = new ConcurrentHashMap();
    public final LruCache<WeakReference<View>, IPage.a> y = new LruCache<>(20);
    public final int z = qgw.screenWidth;
    public final int A = qgw.screenHeight;

    public long A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5418daa", new Object[]{this})).longValue();
        }
        return this.x;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.z;
    }

    public Window C() {
        Window window;
        FragmentActivity activity;
        Window window2;
        Window window3;
        Window window4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("7f59f544", new Object[]{this});
        }
        WeakReference<Window> weakReference = this.d;
        if (weakReference != null && (window4 = weakReference.get()) != null) {
            return window4;
        }
        Activity f = f();
        if (f == null || (window3 = f.getWindow()) == null) {
            Fragment j = j();
            if (j == null || (activity = j.getActivity()) == null || (window2 = activity.getWindow()) == null) {
                View w = w();
                if (w == null) {
                    return null;
                }
                Context context = w.getContext();
                if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) {
                    return null;
                }
                e0(window);
                return window;
            }
            e0(window2);
            return window2;
        }
        e0(window3);
        return window3;
    }

    public void D(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a7de9a", new Object[]{this, new Long(j)});
        } else {
            this.x += j;
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0293462", new Object[]{this});
        } else {
            this.t.incrementAndGet();
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0643f1", new Object[]{this});
        } else {
            this.q.incrementAndGet();
        }
    }

    public void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98cf01", new Object[]{this, new Integer(i)});
        } else {
            this.r.addAndGet(i);
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74818471", new Object[]{this});
        } else {
            this.u.incrementAndGet();
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b2fe64", new Object[]{this});
        } else {
            this.s.incrementAndGet();
        }
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8969d13", new Object[]{this})).booleanValue();
        }
        WeakReference<Activity> weakReference = this.i;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        return true;
    }

    public final boolean K(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa102235", new Object[]{this, view})).booleanValue();
        }
        if (view != null && ((view.getRight() - view.getLeft()) * (view.getBottom() - view.getTop())) / (qgw.screenHeight * qgw.screenWidth) > 0.7f) {
            return true;
        }
        return false;
    }

    public boolean L() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd16a70", new Object[]{this})).booleanValue();
        }
        Activity f = f();
        Fragment j = j();
        if (f == null || !f.isFinishing()) {
            z = false;
        } else {
            z = true;
        }
        if (j != null) {
            if (j.isRemoving()) {
                z2 = true;
            } else {
                FragmentActivity activity = j.getActivity();
                if (activity != null) {
                    z2 = activity.isFinishing();
                }
            }
            if (!z || z2) {
                return true;
            }
            return false;
        }
        z2 = false;
        if (!z) {
        }
        return true;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7beebb54", new Object[]{this})).booleanValue();
        }
        WeakReference<Fragment> weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        return true;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14699dc", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public void O(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a989aea", new Object[]{this, activity});
        } else {
            this.i = new WeakReference<>(activity);
        }
    }

    public void P(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50387091", new Object[]{this, new Long(j)});
        } else {
            this.p.set(j);
        }
    }

    public void Q(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ddd551", new Object[]{this, fragment});
        } else {
            this.j = new WeakReference<>(fragment);
        }
    }

    public void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4fef3c", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e537f9ba", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac675f3b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) ((ConcurrentHashMap) this.w).get(str);
            if (num == null) {
                num = 0;
            }
            ((ConcurrentHashMap) this.w).put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2e92fa", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void V(IPage.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3577aae", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
    }

    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177cde56", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) ((ConcurrentHashMap) this.v).get(str);
            if (num == null) {
                num = 0;
            }
            ((ConcurrentHashMap) this.v).put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public void X(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b1e1ef", new Object[]{this, new Long(j)});
        }
    }

    public void Y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7ded34", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void Z(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b7a6b3", new Object[]{this, new Long(j)});
        } else {
            this.m.set(j);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public void a(View view, IPage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54089bad", new Object[]{this, view, aVar});
        } else {
            this.y.put(new WeakReference<>(view), aVar);
        }
    }

    public void a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85bf1bc8", new Object[]{this});
        }
        return this.f17140a;
    }

    public void b0(IPage.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5763444", new Object[]{this, eVar});
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.b) ipChange.ipc$dispatch("1bb912f6", new Object[]{this});
        }
        return this.b;
    }

    public void c0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ceeaa13", new Object[]{this, view});
        } else if (view != null) {
            this.e = new WeakReference<>(view);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.c) ipChange.ipc$dispatch("2ded361e", new Object[]{this});
        }
        return this.b;
    }

    public void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecb45af", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.d) ipChange.ipc$dispatch("fec5cf24", new Object[]{this});
        }
        return this.c;
    }

    public void e0(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b557537f", new Object[]{this, window});
        } else if (window != null) {
            this.d = new WeakReference<>(window);
        }
    }

    public Activity f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void f0(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b24f1d", new Object[]{this, iPage});
        } else {
            this.k = iPage;
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f9c957c", new Object[]{this})).intValue();
        }
        return this.t.get();
    }

    public void g0(vy1 vy1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a85166e", new Object[]{this, vy1Var});
        } else {
            this.b = vy1Var;
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.f;
    }

    public Context h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        View w = w();
        if (w != null) {
            return w.getContext();
        }
        return null;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdff967b", new Object[]{this})).longValue();
        }
        return this.p.get();
    }

    public Fragment j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        WeakReference<Fragment> weakReference = this.j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5e6865d", new Object[]{this})).intValue();
        }
        return this.q.get();
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99a58a2e", new Object[]{this})).intValue();
        }
        return this.r.get();
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d37a481d", new Object[]{this})).intValue();
        }
        return this.u.get();
    }

    public IPage.a n() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.a) ipChange.ipc$dispatch("e8eefbbb", new Object[]{this});
        }
        for (Map.Entry<WeakReference<View>, IPage.a> entry : this.y.snapshot().entrySet()) {
            WeakReference<View> key = entry.getKey();
            if (!(key == null || (view = key.get()) == null || !K(view))) {
                return entry.getValue();
            }
        }
        return null;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e471147a", new Object[]{this});
        }
        return this.g;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6560f3c", new Object[]{this});
        }
        return this.n;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.A;
    }

    public Map<String, Integer> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84c804b2", new Object[]{this});
        }
        return this.w;
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("803da864", new Object[]{this});
        }
        return this.l;
    }

    public Map<String, Integer> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c2afe8b5", new Object[]{this});
        }
        return this.v;
    }

    public WeakReference<View> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("a1c74cf2", new Object[]{this});
        }
        return null;
    }

    public long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9389fec8", new Object[]{this})).longValue();
        }
        return this.m.get();
    }

    public View w() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("74fd10d5", new Object[]{this});
        }
        WeakReference<View> weakReference = this.e;
        if (weakReference != null) {
            return weakReference.get();
        }
        WeakReference<Window> weakReference2 = this.d;
        if (weakReference2 == null || (window = weakReference2.get()) == null) {
            return null;
        }
        return window.getDecorView();
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        return this.h;
    }

    public IPage y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("51b991fb", new Object[]{this});
        }
        return this.k;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53abc210", new Object[]{this})).intValue();
        }
        return this.s.get();
    }
}
