package tb;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.page.TMSBaseFragment;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.taobao.container.fragment.TMSTBHomeFragment;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import tb.swd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class las implements swd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final TMSTBHomeFragment f23214a;
    public final swd.b b;
    public final Deque<ITMSPage> c = new ArrayDeque();
    public final ras d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(847249430);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(847249429);
        t2o.a(839909871);
    }

    public las(bbs bbsVar, TMSTBHomeFragment tMSTBHomeFragment, swd.b bVar) {
        ckf.g(bbsVar, "instance");
        ckf.g(tMSTBHomeFragment, "mFragment");
        ckf.g(bVar, "mPageStackStatusCallback");
        this.f23214a = tMSTBHomeFragment;
        this.b = bVar;
        int i = R.id.tms_fragment_container;
        FragmentManager fragmentManager = tMSTBHomeFragment.getFragmentManager();
        ckf.f(fragmentManager, "mFragment.fragmentManager");
        this.d = new ras((FragmentActivity) bbsVar.I(), i, fragmentManager);
    }

    @Override // tb.swd
    public int c(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48de2872", new Object[]{this, iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "page");
        return i04.e0(this.c, iTMSPage);
    }

    @Override // tb.swd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        e();
        Iterator it = ((ArrayDeque) this.c).iterator();
        while (it.hasNext()) {
            ((ITMSPage) it.next()).destroy();
        }
        ((ArrayDeque) this.c).clear();
        this.d.i();
    }

    @Override // tb.swd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b26459", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    @Override // tb.swd
    public boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764f16b1", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (((ArrayDeque) this.c).size() > 1) {
            return h(true);
        }
        if (!z) {
            return false;
        }
        this.b.a();
        return true;
    }

    @Override // tb.swd
    public int getAlivePageCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26f55263", new Object[]{this})).intValue();
        }
        return ((ArrayDeque) this.c).size();
    }

    @Override // tb.swd
    public ITMSPage getPageByIndex(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("a28d109b", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < ((ArrayDeque) this.c).size()) {
            Iterator descendingIterator = ((ArrayDeque) this.c).descendingIterator();
            while (descendingIterator.hasNext()) {
                ITMSPage iTMSPage = (ITMSPage) descendingIterator.next();
                if (i2 == i) {
                    return iTMSPage;
                }
                i2++;
            }
        }
        return null;
    }

    @Override // tb.swd
    public ITMSPage getTopPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("5a383c0c", new Object[]{this});
        }
        ITMSPage iTMSPage = (ITMSPage) ((ArrayDeque) this.c).peek();
        if (iTMSPage == null) {
            return null;
        }
        dyd dydVar = (dyd) iTMSPage.getExtension(dyd.class);
        if (dydVar != null) {
            return dydVar.B();
        }
        return iTMSPage;
    }

    public final boolean h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7194e827", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ITMSPage iTMSPage = (ITMSPage) ((ArrayDeque) this.c).peek();
        if (iTMSPage == null) {
            return false;
        }
        dee deeVar = (dee) iTMSPage.getExtension(dee.class);
        if (deeVar != null) {
            deeVar.a1();
        }
        this.d.j(iTMSPage, z);
        ((ArrayDeque) this.c).poll();
        return true;
    }

    @Override // tb.swd
    public boolean a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e400fe7f", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        ITMSPage topPage = getTopPage();
        ((ArrayDeque) this.c).push(iTMSPage);
        if (qml.z(iTMSPage)) {
            if (!q9s.x1()) {
                Object extension = iTMSPage.getInstance().getExtension(ngb.class);
                x4b x4bVar = extension instanceof x4b ? (x4b) extension : null;
                if (x4bVar != null) {
                    x4bVar.t(iTMSPage);
                }
            }
            this.f23214a.p2(iTMSPage);
        } else {
            if (topPage != null && qml.z(topPage)) {
                topPage.onPause();
                topPage.onStop();
            }
            TMSBaseFragment h = this.d.h();
            h.D2(iTMSPage);
            this.d.k(iTMSPage, h, true);
        }
        return true;
    }

    @Override // tb.swd
    public boolean d(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a56d860", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        return false;
    }

    @Override // tb.swd
    public boolean g(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bed53ea", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        return false;
    }

    @Override // tb.swd
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7e21e34", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0) {
            TMSLogger.b("TMSFragmentPageManager", "popTo, index must be greater than 0");
            return false;
        } else if (((ArrayDeque) this.c).size() - 1 == i) {
            TMSLogger.b("TMSFragmentPageManager", "popTo, index must be less than page stack size");
            return false;
        } else {
            h(true);
            while (((ArrayDeque) this.c).size() - 1 > i) {
                h(false);
            }
            return true;
        }
    }
}
