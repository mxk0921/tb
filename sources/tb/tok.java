package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.sf.SearchDoorViewPool;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tok implements und {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchDoorActivity f28844a;
    public final r2p b;

    static {
        t2o.a(815792939);
        t2o.a(815792935);
    }

    public tok(SearchDoorActivity searchDoorActivity) {
        ckf.g(searchDoorActivity, "activity");
        this.f28844a = searchDoorActivity;
        this.b = new r2p(searchDoorActivity);
    }

    public static final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d35a9c", new Object[0]);
        } else {
            TLogTracker.p();
        }
    }

    public static final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1279127d", new Object[0]);
        } else {
            TLogTracker.q();
        }
    }

    @Override // tb.und
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a27443", new Object[]{this});
            return;
        }
        this.f28844a.setContentView(a());
        ViewGroup viewGroup = (ViewGroup) this.f28844a.findViewById(R.id.fl_root);
        this.b.U(viewGroup);
        this.b.S();
        try {
            if (!TextUtils.isEmpty(flo.a(this.f28844a.getIntent())) || cvr.INSTANCE.f()) {
                viewGroup.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_INVALID);
            }
        } catch (Exception unused) {
        }
        this.b.W();
    }

    @Override // tb.und
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fa639a", new Object[]{this});
        } else {
            this.b.y();
        }
    }

    @Override // tb.und
    public String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbaff8b5", new Object[]{this});
        }
        return this.b.x();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8d3cc2d", new Object[]{this})).intValue();
        }
        return this.b.t();
    }

    public final r2p b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2p) ipChange.ipc$dispatch("dcb94357", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.und
    public SearchDoorViewPool d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorViewPool) ipChange.ipc$dispatch("567c0283", new Object[]{this});
        }
        return this.b.w();
    }

    @Override // tb.und
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.M();
        }
    }

    @Override // tb.und
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.b.q();
        }
    }

    @Override // tb.und
    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        yko u = this.b.u();
        ckf.f(u, "getCore(...)");
        return u;
    }

    @Override // tb.und
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb438c9", new Object[]{this});
        } else {
            this.b.E();
        }
    }

    @Override // tb.und
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94810df4", new Object[]{this})).booleanValue();
        }
        return this.b.D();
    }

    @Override // tb.und
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("370526eb", new Object[]{this})).booleanValue();
        }
        return this.b.A();
    }

    @Override // tb.und
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.b.J(i, i2, intent);
        }
    }

    @Override // tb.und
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        this.b.N(intent);
    }

    @Override // tb.und
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        } else {
            this.b.R(z);
        }
    }

    @Override // tb.und
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.b.O();
        }
    }

    @Override // tb.und
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            this.b.P();
        }
    }

    @Override // tb.und
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            le1.a().execute(new Runnable() { // from class: tb.yiz
                @Override // java.lang.Runnable
                public final void run() {
                    tok.j();
                }
            });
        }
    }

    @Override // tb.und
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            le1.a().execute(new Runnable() { // from class: tb.ziz
                @Override // java.lang.Runnable
                public final void run() {
                    tok.m();
                }
            });
        }
    }

    @Override // tb.und
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
        } else {
            this.b.W();
        }
    }

    @Override // tb.und
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a998ec13", new Object[]{this});
        } else {
            this.b.V();
        }
    }

    @Override // tb.und
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("695dabf9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.und
    public void z(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a786b48e", new Object[]{this, bundle});
        } else {
            this.b.T();
        }
    }
}
