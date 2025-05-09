package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f1h implements mtc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dx6 f18937a;
    public final i1h b;
    public final c1h c;
    public final sjm d;
    public final fq2 e;
    public final eva f;
    public String h;
    public Runnable j;
    public final boolean k;
    public boolean l;
    public zqi m;
    public boolean n;
    public final e1h g = new e1h();
    public final Handler i = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            f1h f1hVar = f1h.this;
            f1h.d(f1hVar, f1h.c(f1hVar));
        }
    }

    public f1h(String str, boolean z, boolean z2, fva fvaVar) {
        this.k = qp0.b() == 2;
        k6s.a("f1h", "LiveMessageManager[init]:" + z + " " + z2);
        c1h c1hVar = new c1h(str);
        a1h a1hVar = c1hVar.b;
        this.c = c1hVar;
        this.f18937a = new dx6(c1hVar);
        this.b = new i1h(c1hVar);
        this.d = new sjm(c1hVar, this);
        if (a1hVar.q) {
            k6s.a("f1h", "useCDNabTest[true]");
        } else {
            k6s.a("f1h", "useCDNabTest[false]");
        }
        if (a1hVar.c && z && a1hVar.q) {
            this.e = new fq2(c1hVar, this);
        }
        if (a1hVar.m && z2) {
            eva evaVar = new eva(c1hVar, fvaVar);
            this.f = evaVar;
            evaVar.j(a1hVar.k);
        }
    }

    public static /* synthetic */ zqi c(f1h f1hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zqi) ipChange.ipc$dispatch("de729b76", new Object[]{f1hVar});
        }
        return f1hVar.m;
    }

    public static /* synthetic */ void d(f1h f1hVar, zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc5339", new Object[]{f1hVar, zqiVar});
        } else {
            f1hVar.h(zqiVar);
        }
    }

    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d6107b", new Object[]{this, new Integer(i), obj});
        } else {
            this.b.b(i, obj);
        }
    }

    public void b(String str, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85493f60", new Object[]{this, str, tLiveMsg});
            return;
        }
        this.g.b(tLiveMsg, this.h);
        if (this.f18937a.a(str, tLiveMsg, this.g) && this.b.a(str, tLiveMsg)) {
            k6s.a("f1h", "OnReceiveListener[分发成功(" + str + ")]:" + tLiveMsg);
            c1h c1hVar = this.c;
            c1hVar.h.e(100, str, tLiveMsg, c1hVar);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2a4934", new Object[]{this});
            return;
        }
        Runnable runnable = this.j;
        if (runnable != null) {
            this.i.removeCallbacks(runnable);
            this.j = null;
        }
    }

    public final boolean f(String str, Object obj, zvd zvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47f605c", new Object[]{this, str, obj, zvdVar})).booleanValue();
        }
        if (this.c.a()) {
            return true;
        }
        k6s.a("f1h", "checkIsSend[" + str + f7l.BRACKET_START_STR + this.c.f16771a + ")]:" + obj);
        zvdVar.a(IMediaPlayer.MEDIA_INFO_VIDEO_FOV_CHANGE, null, str, obj);
        return false;
    }

    public void g(Map<String, Double> map, boolean z, zvd zvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70b9f09", new Object[]{this, map, new Boolean(z), zvdVar});
        } else if (f("countValue", map, zvdVar)) {
            k6s.a("f1h", "sendMessage[计数上报]:" + map + " " + z + " " + this.c);
            this.d.e(map, z, zvdVar);
        }
    }

    public final void h(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80fdc803", new Object[]{this, zqiVar});
            return;
        }
        this.f18937a.b(zqiVar);
        fq2 fq2Var = this.e;
        if (fq2Var != null) {
            fq2Var.p(zqiVar);
        }
        eva evaVar = this.f;
        if (evaVar != null) {
            evaVar.m(zqiVar);
        }
        this.j = null;
        this.m = null;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886dbb1c", new Object[]{this});
            return;
        }
        k6s.a("f1h", "onAppInBackgroud[进入后台]");
        this.c.b();
        this.d.c();
        fq2 fq2Var = this.e;
        if (fq2Var != null) {
            fq2Var.c();
        }
        eva evaVar = this.f;
        if (evaVar != null) {
            evaVar.d();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
            return;
        }
        k6s.a("f1h", "onAppInBackgroud[恢复前台]");
        this.c.c();
        this.d.d();
        fq2 fq2Var = this.e;
        if (fq2Var != null) {
            fq2Var.d();
        }
        eva evaVar = this.f;
        if (evaVar != null) {
            evaVar.e();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        k6s.a("f1h", "onPause[直播间不可见]");
        eva evaVar = this.f;
        if (evaVar != null) {
            evaVar.f();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        k6s.a("f1h", "onResume[直播间可见]");
        eva evaVar = this.f;
        if (evaVar != null) {
            evaVar.g();
        }
    }

    public void n(awd awdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c54680", new Object[]{this, awdVar});
            return;
        }
        k6s.a("f1h", "registerDispatcher[注册回调]:" + awdVar + " " + this.c);
        this.b.c(awdVar);
    }

    public void p(TLiveMsg tLiveMsg, zvd zvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b962d4", new Object[]{this, tLiveMsg, zvdVar});
        } else if (f("sendMessage", tLiveMsg, zvdVar)) {
            k6s.a("f1h", "sendMessage[发送消息]:" + tLiveMsg + " " + this.c);
            this.d.f(tLiveMsg, zvdVar);
        }
    }

    public void q(int i, int i2, int i3, zvd zvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc60eaa6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), zvdVar});
        } else if (f("sendRequest", Integer.valueOf(i), zvdVar)) {
            k6s.a("f1h", "sendMessage[发送请求]:" + i + " " + i2 + " " + i3 + " " + this.c);
            this.d.g(i, i2, i3, zvdVar);
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e33bd5", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76e264c", new Object[]{this});
            return;
        }
        e();
        a aVar = new a();
        this.j = aVar;
        this.i.postDelayed(aVar, 3000L);
    }

    public void t(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a7ade", new Object[]{this, zqiVar});
            return;
        }
        k6s.a("f1h", "subscribe[订阅]:" + zqiVar);
        this.h = zqiVar.b;
        this.c.d(zqiVar);
        this.b.d(zqiVar);
        this.d.h(zqiVar);
        this.g.e();
        if (!this.k || !this.n) {
            h(zqiVar);
            return;
        }
        this.m = zqiVar;
        s();
    }

    public void u(awd awdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85b4f9", new Object[]{this, awdVar});
            return;
        }
        k6s.a("f1h", "unRegisterDispatcher[取消注册回调]:" + awdVar + " " + this.c);
        this.b.e(awdVar);
    }

    public void v(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2fc97", new Object[]{this, zqiVar});
            return;
        }
        e();
        k6s.a("f1h", "unSubscribe[取消订阅]:" + this.c);
        c1h c1hVar = this.c;
        if (c1hVar != null) {
            c1hVar.e(zqiVar);
        }
        sjm sjmVar = this.d;
        if (sjmVar != null) {
            sjmVar.i(zqiVar);
        }
        fq2 fq2Var = this.e;
        if (fq2Var != null) {
            fq2Var.q(zqiVar);
        }
        dx6 dx6Var = this.f18937a;
        if (dx6Var != null) {
            dx6Var.c(zqiVar);
        }
        i1h i1hVar = this.b;
        if (i1hVar != null) {
            i1hVar.f(zqiVar);
        }
        eva evaVar = this.f;
        if (evaVar != null) {
            evaVar.n(zqiVar);
        }
        e1h e1hVar = this.g;
        if (e1hVar != null) {
            e1hVar.c();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        k6s.a("f1h", "pause[暂停消息加载]");
        if (this.n && !this.l && this.j != null) {
            e();
            this.l = true;
        }
    }

    public void o() {
        zqi zqiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        k6s.a("f1h", "resume[恢复消息加载]");
        if (this.n && this.l) {
            if (this.j == null && (zqiVar = this.m) != null) {
                h(zqiVar);
            }
            this.l = false;
        }
    }
}
