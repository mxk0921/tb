package tb;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.search.m3.image.M3ImageView;
import com.taobao.search.m3.widget.M3ListContainer;
import com.taobao.search.m3.widget.M3WfContainer;
import com.taobao.search.performance.perf.PreloadCardContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fnh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f19420a;
    public ViewGroup e;
    public boolean b = false;
    public final Map<String, List<com.taobao.android.weex_framework.a>> c = new HashMap();
    public final Map<String, com.taobao.android.weex_framework.a> d = new HashMap();
    public final List<M3WfContainer> f = new ArrayList(11);
    public final List<M3ListContainer> g = new ArrayList(11);
    public final boolean h = o4p.C1("preMount");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ Handler d;

        /* compiled from: Taobao */
        /* renamed from: tb.fnh$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0929a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ M3WfContainer f19421a;

            public RunnableC0929a(M3WfContainer m3WfContainer) {
                this.f19421a = m3WfContainer;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    fnh.a(fnh.this).add(this.f19421a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ M3ListContainer f19422a;

            public b(M3ListContainer m3ListContainer) {
                this.f19422a = m3ListContainer;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    fnh.b(fnh.this).add(this.f19422a);
                }
            }
        }

        public a(Activity activity, Handler handler) {
            this.c = activity;
            this.d = handler;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/performance/perf/M3CardManager$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            M3ImageView.updateLimitScale();
            for (int i = 0; i < 11; i++) {
                this.d.post(new RunnableC0929a(new M3WfContainer(this.c)));
            }
            for (int i2 = 0; i2 < 11; i2++) {
                this.d.post(new b(new M3ListContainer(this.c)));
            }
        }
    }

    static {
        t2o.a(815792824);
    }

    public fnh() {
        new ArrayList();
    }

    public static /* synthetic */ List a(fnh fnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("985a6985", new Object[]{fnhVar});
        }
        return fnhVar.f;
    }

    public static /* synthetic */ List b(fnh fnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1aa51e64", new Object[]{fnhVar});
        }
        return fnhVar.g;
    }

    public void c(String str, String str2, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e7fd8a", new Object[]{this, str, str2, aVar});
        } else if (aVar != null) {
            if (this.b) {
                aVar.destroy();
                return;
            }
            c4p.m("tbsearch_preload", "添加 cell " + str);
            String str3 = str + str2;
            List list = (List) ((HashMap) this.c).get(str3);
            if (list == null) {
                list = new ArrayList(6);
                ((HashMap) this.c).put(str3, list);
            }
            list.add(aVar);
            FrameLayout frameLayout = this.f19420a;
            if (frameLayout != null) {
                frameLayout.addView(aVar.getRenderRoot());
            }
        }
    }

    public void d(String str, String str2, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436ab3f", new Object[]{this, str, str2, aVar});
        } else if (aVar != null) {
            if (this.b) {
                aVar.destroy();
                return;
            }
            c4p.m("tbsearch_preload", "添加 header " + str);
            ((HashMap) this.d).put(str + str2, aVar);
            FrameLayout frameLayout = this.f19420a;
            if (frameLayout != null) {
                frameLayout.addView(aVar.getRenderRoot());
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        o();
        this.b = true;
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            List<com.taobao.android.weex_framework.a> list = (List) entry.getValue();
            if (list != null) {
                for (com.taobao.android.weex_framework.a aVar : list) {
                    aVar.destroy();
                }
                list.clear();
            }
        }
        ((HashMap) this.c).clear();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f575e8b3", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
            ((com.taobao.android.weex_framework.a) entry.getValue()).destroy();
        }
        ((HashMap) this.d).clear();
    }

    public M3ListContainer g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3ListContainer) ipChange.ipc$dispatch("ca182d35", new Object[]{this});
        }
        if (((ArrayList) this.g).isEmpty()) {
            return null;
        }
        return (M3ListContainer) ((ArrayList) this.g).remove(0);
    }

    public M3WfContainer h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3WfContainer) ipChange.ipc$dispatch("7bd32f1f", new Object[]{this});
        }
        if (((ArrayList) this.f).isEmpty()) {
            return null;
        }
        return (M3WfContainer) ((ArrayList) this.f).remove(0);
    }

    public boolean i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db7cdd9b", new Object[]{this, str, str2})).booleanValue();
        }
        return ((HashMap) this.d).containsKey(str + str2);
    }

    public void j(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c0ad01", new Object[]{this, viewGroup});
        } else if (this.h) {
            PreloadCardContainer preloadCardContainer = new PreloadCardContainer(viewGroup.getContext());
            this.f19420a = preloadCardContainer;
            this.e = viewGroup;
            viewGroup.addView(preloadCardContainer, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public void k(String str, String str2, fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3de3522", new Object[]{this, str, str2, fwVar});
        } else if (fwVar != null && fwVar.x() == null) {
            com.taobao.android.weex_framework.a aVar = (com.taobao.android.weex_framework.a) ((HashMap) this.d).remove(str + str2);
            if (aVar != null) {
                FrameLayout frameLayout = this.f19420a;
                if (frameLayout != null) {
                    frameLayout.removeView(aVar.getRenderRoot());
                }
                c4p.m("tbsearch_preload", "预加载 header " + str);
                fwVar.J(aVar);
            }
        }
    }

    public void m(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4250369c", new Object[]{this, activity});
        } else if (Build.VERSION.SDK_INT >= 28) {
            Coordinator.execute(new a(activity, new Handler(Looper.getMainLooper())));
        }
    }

    public void n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20418f8", new Object[]{this, view});
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (view instanceof M3WfContainer) {
            ((ArrayList) this.f).add((M3WfContainer) view);
        } else if (view instanceof M3ListContainer) {
            ((ArrayList) this.g).add((M3ListContainer) view);
        }
    }

    public void o() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751fa3e1", new Object[]{this});
        } else if (this.e != null && (frameLayout = this.f19420a) != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = this.e;
            if (parent == viewGroup) {
                viewGroup.removeView(this.f19420a);
                this.f19420a.removeAllViews();
            }
        }
    }

    public void l(String str, String str2, fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da36c6f", new Object[]{this, str, str2, fwVar});
        } else if (fwVar != null && fwVar.x() == null) {
            List list = (List) ((HashMap) this.c).get(str + str2);
            if (list != null && !list.isEmpty()) {
                com.taobao.android.weex_framework.a aVar = (com.taobao.android.weex_framework.a) list.remove(0);
                FrameLayout frameLayout = this.f19420a;
                if (frameLayout != null) {
                    frameLayout.removeView(aVar.getRenderRoot());
                }
                c4p.m("tbsearch_preload", "预加载 cell " + str);
                fwVar.J(aVar);
            }
        }
    }
}
