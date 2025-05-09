package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.monitor.procedure.IPage;
import com.taobao.mytaobao.basement.weex.WeexInstanceLoadHelper;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeexInstanceLoadHelper f18842a = new WeexInstanceLoadHelper();
    public final com.taobao.mytaobao.basement.a b = new com.taobao.mytaobao.basement.a();
    public ViewGroup c;
    public MTPtrRecyclerView d;
    public final MyTaobaoFragment e;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MTPtrRecyclerView l = ew.this.l();
            if (l != null) {
                RecyclerView.LayoutManager layoutManager = l.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    l.smoothScrollToPosition(linearLayoutManager.findLastVisibleItemPosition());
                }
            }
        }
    }

    static {
        t2o.a(745537551);
    }

    public ew(MyTaobaoFragment myTaobaoFragment) {
        ckf.h(myTaobaoFragment, "mtbFragment");
        this.e = myTaobaoFragment;
    }

    public abstract void A(String str, boolean z);

    public final void B(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a7134a", new Object[]{this, viewGroup});
        } else {
            this.c = viewGroup;
        }
    }

    public final void C(MTPtrRecyclerView mTPtrRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851e0162", new Object[]{this, mTPtrRecyclerView});
        } else {
            this.d = mTPtrRecyclerView;
        }
    }

    public final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511212cd", new Object[]{this, str, str2});
            return;
        }
        ckf.h(str, "key");
        if (str2 != null) {
            try {
                IPage i = snl.f28161a.i(this.e);
                ckf.c(i, "PageManagerProxy.PROXY.g…FragmentPage(mtbFragment)");
                i.d().a(str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    public final int h() {
        int i;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8001b536", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            i = viewGroup.getHeight();
        } else {
            i = 0;
        }
        if (i == 0 || (b = pgj.b()) == 0) {
            return 0;
        }
        return i - b;
    }

    public final Activity i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.e.getActivity();
    }

    public final ViewGroup j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("30aef49e", new Object[]{this});
        }
        return this.c;
    }

    public final com.taobao.mytaobao.basement.a k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.mytaobao.basement.a) ipChange.ipc$dispatch("9184cf29", new Object[]{this});
        }
        return this.b;
    }

    public final MTPtrRecyclerView l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTPtrRecyclerView) ipChange.ipc$dispatch("6309fa80", new Object[]{this});
        }
        return this.d;
    }

    public final MyTaobaoFragment m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MyTaobaoFragment) ipChange.ipc$dispatch("5d872da4", new Object[]{this});
        }
        return this.e;
    }

    public final WeexInstanceLoadHelper n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceLoadHelper) ipChange.ipc$dispatch("408f1e44", new Object[]{this});
        }
        return this.f18842a;
    }

    public abstract void o(LoginAction loginAction);

    public abstract void p(Context context);

    public abstract void q(Bundle bundle);

    public abstract View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract void v();

    public abstract void w();

    public abstract void x();

    public abstract void y(Activity activity, boolean z);

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f912cd7a", new Object[]{this});
        } else {
            uuu.a(new a());
        }
    }
}
