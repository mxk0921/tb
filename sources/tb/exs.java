package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtServiceContainer;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class exs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ITaoLiveKtUtManager b;
    public ITaoLiveKtServiceContainer c;
    public ITaoLiveKtGlobalTimer d;

    /* renamed from: a  reason: collision with root package name */
    public czs f18877a = new czs();
    public boolean e = true;

    static {
        t2o.a(1003487275);
    }

    public exs() {
        new TaoLiveKtSwitchModel();
    }

    public final czs a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (czs) ipChange.ipc$dispatch("d902976d", new Object[]{this});
        }
        return this.f18877a;
    }

    public final ITaoLiveKtGlobalTimer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtGlobalTimer) ipChange.ipc$dispatch("a425b127", new Object[]{this});
        }
        return this.d;
    }

    public final ITaoLiveKtServiceContainer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtServiceContainer) ipChange.ipc$dispatch("5a331fa4", new Object[]{this});
        }
        return this.c;
    }

    public final ITaoLiveKtUtManager d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtUtManager) ipChange.ipc$dispatch("c79b384a", new Object[]{this});
        }
        return this.b;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be5eecf0", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final void f(czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2277fd", new Object[]{this, czsVar});
        } else {
            this.f18877a = czsVar;
        }
    }

    public final void g(ITaoLiveKtGlobalTimer iTaoLiveKtGlobalTimer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94668fbd", new Object[]{this, iTaoLiveKtGlobalTimer});
        } else {
            this.d = iTaoLiveKtGlobalTimer;
        }
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc762f30", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void i(ITaoLiveKtServiceContainer iTaoLiveKtServiceContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6388176", new Object[]{this, iTaoLiveKtServiceContainer});
        } else {
            this.c = iTaoLiveKtServiceContainer;
        }
    }

    public final void j(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bec0de0", new Object[]{this, taoLiveKtSwitchModel});
        }
    }

    public final void k(ITaoLiveKtUtManager iTaoLiveKtUtManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33eacc8", new Object[]{this, iTaoLiveKtUtManager});
        } else {
            this.b = iTaoLiveKtUtManager;
        }
    }
}
