package tb;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.qol;
import tb.sll;
import tb.zcr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rnl implements sll {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<sll.a> b;
    public final Activity c;
    public final FrameLayout d;
    public boolean f;
    public zcr.a g;

    /* renamed from: a  reason: collision with root package name */
    public int f27484a = Integer.MAX_VALUE;
    public final List<anl> e = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements qol.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f27485a;
        public final /* synthetic */ anl b;

        public a(boolean[] zArr, anl anlVar) {
            this.f27485a = zArr;
            this.b = anlVar;
        }

        @Override // tb.qol.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df164ae", new Object[]{this});
                return;
            }
            this.f27485a[0] = false;
            rnl.a(rnl.this, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements qol.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ anl f27486a;

        public b(anl anlVar) {
            this.f27486a = anlVar;
        }

        @Override // tb.qol.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df164ae", new Object[]{this});
            } else {
                rnl.a(rnl.this, this.f27486a);
            }
        }
    }

    static {
        t2o.a(502268045);
        t2o.a(503316945);
    }

    public rnl(Activity activity) {
        this.c = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        frameLayout.setId(R.id.layout_manager_multi_page_container);
        frameLayout.setTag(this);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        l(Integer.MAX_VALUE);
    }

    public static /* synthetic */ void a(rnl rnlVar, anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae47da61", new Object[]{rnlVar, anlVar});
        } else {
            rnlVar.g(anlVar);
        }
    }

    public static void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d14166c", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            String queryParameter = Uri.parse(str).getQueryParameter(yj4.PARAM_UT_PARAMS);
            if (!TextUtils.isEmpty(queryParameter)) {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(queryParameter);
            }
        }
    }

    @Override // tb.sll
    public zcr.a A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zcr.a) ipChange.ipc$dispatch("c36ed0d3", new Object[]{this});
        }
        if (u()) {
            return this.g;
        }
        return null;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e7f3d0", new Object[]{this, new Boolean(z)});
        } else if (z) {
            i();
        } else {
            anl f = f();
            if (f != null && f.canMoveToState(3)) {
                f.onPause();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b467f0d", new Object[]{this});
            return;
        }
        anl f = f();
        if (f != null && f.canMoveToState(2)) {
            f.onResume();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869437f0", new Object[]{this});
            return;
        }
        anl f = f();
        if (f != null && f.canMoveToState(1)) {
            f.onStart();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24412ea2", new Object[]{this});
            return;
        }
        anl f = f();
        if (f != null && f.canMoveToState(4)) {
            f.onStop();
        }
    }

    public anl f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("3bb21c40", new Object[]{this});
        }
        int size = ((ArrayList) this.e).size();
        if (size > 0) {
            return (anl) ((ArrayList) this.e).get(size - 1);
        }
        return null;
    }

    public final void g(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4892a7", new Object[]{this, anlVar});
            return;
        }
        List<sll.a> list = this.b;
        if (list != null && anlVar != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((sll.a) it.next()).a(((ArrayList) this.e).size(), anlVar);
            }
        }
    }

    @Override // tb.sll
    public ViewGroup getContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("30aef49e", new Object[]{this});
        }
        return this.d;
    }

    public boolean[] h(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("670f911d", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        anl f = f();
        if (f != null && f.onBackPressed(z2)) {
            return new boolean[]{true, false};
        }
        anl j = j();
        if (j != null) {
            j.setIsFinishing();
            if (j.canMoveToState(3)) {
                j.onPause();
            }
            if (j.canMoveToState(4)) {
                j.onStop();
            }
            if (j.canMoveToState(5)) {
                j.onDestroy();
            }
        }
        anl f2 = f();
        if (f2 != null) {
            if (f2.canMoveToState(1)) {
                f2.onStart();
            }
            if (f2.canMoveToState(2)) {
                f2.onResume();
            }
        }
        boolean[] zArr = {false};
        if (j != null) {
            zArr[0] = true;
            rol.t(f2, j, z, new a(zArr, j));
        }
        return new boolean[]{!((ArrayList) this.e).isEmpty(), zArr[0]};
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9191e17", new Object[]{this});
            return;
        }
        anl anlVar = null;
        while (true) {
            anl j = j();
            if (j != null) {
                j.setIsFinishing();
                if (j.canMoveToState(3)) {
                    j.onPause();
                }
                if (j.canMoveToState(4)) {
                    j.onStop();
                }
                if (j.canMoveToState(5)) {
                    j.onDestroy();
                }
                anlVar = j;
            } else {
                g(anlVar);
                return;
            }
        }
    }

    public final anl j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("d700ffeb", new Object[]{this});
        }
        int size = ((ArrayList) this.e).size();
        if (size > 0) {
            return (anl) ((ArrayList) this.e).remove(size - 1);
        }
        return null;
    }

    public final boolean k(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dc84f7a", new Object[]{this, anlVar})).booleanValue();
        }
        return ((ArrayList) this.e).remove(anlVar);
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ac015a", new Object[]{this, new Integer(i)});
            return;
        }
        IDeviceInfo i2 = od0.D().i();
        if (i2 != null && i2.i()) {
            i = 1;
        }
        this.f27484a = i;
    }

    public void m(boolean z, zcr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b303df05", new Object[]{this, new Boolean(z), aVar});
            return;
        }
        this.f = z;
        this.g = aVar;
    }

    @Override // tb.sll
    public boolean t(String str, List<Pair<View, String>> list, Bundle bundle) {
        boolean z;
        anl anlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7614263c", new Object[]{this, str, list, bundle})).booleanValue();
        }
        if (((ArrayList) this.e).size() >= this.f27484a) {
            return false;
        }
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (bundle != null) {
            z |= bundle.getBoolean("has_share_element", false);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        n(str);
        anl a2 = tml.a(this.c, this, str, z, bundle);
        if (a2 == null) {
            return false;
        }
        ((ArrayList) this.e).add(a2);
        int size = ((ArrayList) this.e).size();
        if (size > 1) {
            anlVar = (anl) ((ArrayList) this.e).get(size - 2);
            if (anlVar.canMoveToState(3)) {
                anlVar.onPause();
            }
        } else {
            anlVar = null;
        }
        rol.u(anlVar, a2, list);
        if (a2.canMoveToState(0)) {
            a2.onCreate(null);
        }
        if (a2.canMoveToState(1)) {
            a2.onStart();
        }
        if (a2.canMoveToState(2)) {
            a2.onResume();
        }
        if (anlVar != null && anlVar.canMoveToState(4)) {
            anlVar.onStop();
        }
        return true;
    }

    @Override // tb.sll
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4a87d7f", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    @Override // tb.sll
    public void v(sll.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649a1c31", new Object[]{this, aVar});
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(aVar);
    }

    @Override // tb.sll
    public void w(sll.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9853d594", new Object[]{this, aVar});
            return;
        }
        List<sll.a> list = this.b;
        if (list != null) {
            ((ArrayList) list).remove(aVar);
        }
    }

    @Override // tb.sll
    public boolean x(anl anlVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7d30044", new Object[]{this, anlVar, new Boolean(z)})).booleanValue();
        }
        anl f = f();
        if (f == anlVar) {
            return h(z, false)[0];
        }
        if (k(anlVar)) {
            anlVar.setIsFinishing();
            if (anlVar.canMoveToState(3)) {
                anlVar.onPause();
            }
            if (anlVar.canMoveToState(4)) {
                anlVar.onStop();
            }
            if (anlVar.canMoveToState(5)) {
                anlVar.onDestroy();
            }
            rol.t(f, anlVar, z, new b(anlVar));
        }
        return !((ArrayList) this.e).isEmpty();
    }

    @Override // tb.sll
    public List<anl> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("51843212", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.sll
    public anl z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("48ad837b", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= ((ArrayList) this.e).size()) {
            return null;
        }
        return (anl) ((ArrayList) this.e).get(i);
    }
}
