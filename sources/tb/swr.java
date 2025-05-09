package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.s;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class swr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public s f28329a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            BitmapDrawable bitmapDrawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            s a2 = swr.a(swr.this);
            if (a2 != null) {
                if (succPhenixEvent == null) {
                    bitmapDrawable = null;
                } else {
                    bitmapDrawable = succPhenixEvent.getDrawable();
                }
                a2.z(bitmapDrawable);
            }
            return true;
        }
    }

    static {
        t2o.a(766509225);
    }

    public static final /* synthetic */ s a(swr swrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("8dfc718e", new Object[]{swrVar});
        }
        return swrVar.f28329a;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e27053d", new Object[]{this})).longValue();
        }
        s sVar = this.f28329a;
        if (sVar == null) {
            return 0L;
        }
        return sVar.m(1502);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.i(0L);
        }
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c90e80f", new Object[]{this})).longValue();
        }
        s sVar = this.f28329a;
        if (sVar == null) {
            return 0L;
        }
        return sVar.m(1501);
    }

    public final View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        s sVar = this.f28329a;
        if (sVar == null) {
            return null;
        }
        return sVar.o();
    }

    public final boolean g() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        s sVar = this.f28329a;
        if (sVar == null) {
            j = 0;
        } else {
            j = sVar.m(1007);
        }
        if (j > 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        s sVar = this.f28329a;
        if (sVar == null) {
            j = 0;
        } else {
            j = sVar.m(1500);
        }
        npp.Companion.f(ckf.p("TBShopVideoView isPlaying ", Long.valueOf(j)));
        if (j == 1) {
            return true;
        }
        return false;
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.u();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.v();
        }
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.y(i, false);
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        ckf.g(str, "url");
        s0m.B().T(str).succListener(new a());
    }

    public final void n(asc ascVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39001713", new Object[]{this, ascVar});
            return;
        }
        ckf.g(ascVar, DataReceiveMonitor.CB_LISTENER);
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.D(4009, ascVar);
        }
    }

    public final void o(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.B(2000, f);
        }
    }

    public final void p(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.D(4000, hashMap);
        }
    }

    public final void q(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7ec244", new Object[]{this, fscVar});
            return;
        }
        ckf.g(fscVar, DataReceiveMonitor.CB_LISTENER);
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.D(RSoException.ERROR_LOAD_ASYNC_FAILED, fscVar);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        s sVar = this.f28329a;
        if (sVar != null) {
            sVar.F();
        }
    }

    public final void b(Context context, g1a<? super s.d, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f247d0a", new Object[]{this, context, g1aVar});
            return;
        }
        npp.Companion.f("TBShopVideoView createPlayer ");
        s.d dVar = new s.d();
        dVar.A = true;
        dVar.h = context;
        dVar.g = context instanceof Activity ? (Activity) context : null;
        dVar.n = "shop";
        dVar.r = 0;
        dVar.Z = DWInstanceType.VIDEO;
        dVar.k = 2;
        if (g1aVar != null) {
            g1aVar.invoke(dVar);
        }
        s c = s.c.c(String.valueOf(System.currentTimeMillis()), dVar);
        this.f28329a = c;
        if (c != null) {
            c.v();
        }
    }
}
