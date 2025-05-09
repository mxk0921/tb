package tb;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.app.page.TMSBaseFragment;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class y8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f31913a;
    public final int b;
    public final FragmentManager c;
    public final Map<ITMSPage, TMSBaseFragment> d = new LinkedHashMap();
    public final Deque<TMSBaseFragment> e = new ArrayDeque();
    public final String f = "mReadyFragment";
    public final AtomicInteger g = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715099);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715098);
        t2o.a(835715093);
    }

    public y8s(FragmentActivity fragmentActivity, int i, FragmentManager fragmentManager) {
        ckf.g(fragmentActivity, "mActivity");
        ckf.g(fragmentManager, "mFragmentManager");
        this.f31913a = fragmentActivity;
        this.b = i;
        this.c = fragmentManager;
    }

    public abstract TMSBaseFragment a();

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae671c0", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final FragmentActivity c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("c890efb2", new Object[]{this});
        }
        return this.f31913a;
    }

    public final FragmentManager d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("85488768", new Object[]{this});
        }
        return this.c;
    }

    public final Deque<TMSBaseFragment> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Deque) ipChange.ipc$dispatch("9e72a799", new Object[]{this});
        }
        return this.e;
    }

    public final Map<ITMSPage, TMSBaseFragment> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("23480722", new Object[]{this});
        }
        return this.d;
    }

    public final TMSBaseFragment g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSBaseFragment) ipChange.ipc$dispatch("14a934f5", new Object[]{this});
        }
        return null;
    }

    public TMSBaseFragment h() {
        TMSBaseFragment tMSBaseFragment;
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSBaseFragment) ipChange.ipc$dispatch("f8947d54", new Object[]{this});
        }
        try {
            findFragmentByTag = this.c.findFragmentByTag(ckf.p(this.f, Integer.valueOf(this.g.get())));
        } catch (Throwable th) {
            TMSLogger.c(kas.TAG, "getReadyFragment findFragmentByTag has Error", th);
            tMSBaseFragment = null;
        }
        if (findFragmentByTag != null) {
            tMSBaseFragment = (TMSBaseFragment) findFragmentByTag;
            if (tMSBaseFragment == null) {
                return a();
            }
            this.g.incrementAndGet();
            return tMSBaseFragment;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.container.app.page.TMSBaseFragment");
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        ((LinkedHashMap) this.d).clear();
        ((ArrayDeque) this.e).clear();
    }
}
