package tb;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.cv1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l3h implements View.OnClickListener, cv1.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = l3h.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final Context f23089a;
    public final air b;
    public final AudioManager c;
    public final View d;
    public View e;
    public TUrlImageView f;
    public RelativeLayout g;
    public RelativeLayout h;
    public TextView i;
    public TextView j;
    public IPlayPublicService k;
    public boolean o;
    public int m = 0;
    public int n = pvs.l2();
    public final Runnable p = new a();
    public final Runnable q = new b();
    public final Handler l = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (l3h.a(l3h.this) > 0) {
                l3h.b(l3h.this);
                l3h.c(l3h.this, 1);
                l3h.d(l3h.this);
                l3h.f(l3h.this).postDelayed(l3h.e(l3h.this), 1000L);
            } else {
                l3h.g(l3h.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                l3h.h(l3h.this);
            }
        }
    }

    static {
        t2o.a(779093074);
        t2o.a(806356055);
    }

    public l3h(Context context, View view, air airVar) {
        this.d = view;
        this.f23089a = context;
        this.b = airVar;
        if (context != null) {
            this.c = (AudioManager) context.getSystemService("audio");
        }
    }

    public static /* synthetic */ int a(l3h l3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40fe1ddf", new Object[]{l3hVar})).intValue();
        }
        return l3hVar.n;
    }

    public static /* synthetic */ int b(l3h l3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d53c8d7e", new Object[]{l3hVar})).intValue();
        }
        int i = l3hVar.n;
        l3hVar.n = i - 1;
        return i;
    }

    public static /* synthetic */ int c(l3h l3hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85a3f5a7", new Object[]{l3hVar, new Integer(i)})).intValue();
        }
        l3hVar.m = i;
        return i;
    }

    public static /* synthetic */ void d(l3h l3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281d266e", new Object[]{l3hVar});
        } else {
            l3hVar.w();
        }
    }

    public static /* synthetic */ Runnable e(l3h l3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("c7334685", new Object[]{l3hVar});
        }
        return l3hVar.p;
    }

    public static /* synthetic */ Handler f(l3h l3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1055b9d6", new Object[]{l3hVar});
        }
        return l3hVar.l;
    }

    public static /* synthetic */ void g(l3h l3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbb331", new Object[]{l3hVar});
        } else {
            l3hVar.j();
        }
    }

    public static /* synthetic */ void h(l3h l3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65b3772", new Object[]{l3hVar});
        } else {
            l3hVar.k();
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6505975", new Object[]{this});
            return;
        }
        this.l.removeCallbacks(this.q);
        this.l.postDelayed(this.q, pvs.m2() * 1000);
    }

    public final void i(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca18eb7", new Object[]{this, cbaVar});
        } else {
            cbaVar.a(this);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea7e5d9", new Object[]{this});
            return;
        }
        z(false);
        this.m = 3;
        v();
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f88ab83", new Object[]{this});
            return;
        }
        this.m = 4;
        s();
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc2581aa", new Object[]{this})).intValue();
        }
        AudioManager audioManager = this.c;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    @Override // tb.cv1.a
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ead943b", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            int i = this.m;
            if (i == 1 || i == 2) {
                this.m = 3;
                v();
            }
        }
    }

    public final void n() {
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        if (this.e == null && (viewStub = (ViewStub) this.d.findViewById(R.id.keep_mute_tip_stub)) != null) {
            viewStub.setLayoutResource(R.layout.taolive_keep_mute_layout);
            this.e = viewStub.inflate();
        }
        View view = this.e;
        if (view != null) {
            TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_keep_mute_icon);
            this.f = tUrlImageView;
            if (tUrlImageView != null) {
                tUrlImageView.setOnClickListener(this);
            }
            this.g = (RelativeLayout) this.e.findViewById(R.id.taolive_keep_mute_choose_layout);
            TextView textView = (TextView) this.e.findViewById(R.id.taolive_keep_mute_btn);
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            this.h = (RelativeLayout) this.e.findViewById(R.id.taolive_keep_mute_ret_layout);
            this.i = (TextView) this.e.findViewById(R.id.taolive_keep_mute_tv);
            this.j = (TextView) this.e.findViewById(R.id.taolive_keep_mute_ret_tv);
            y();
        }
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        IPlayPublicService iPlayPublicService = this.k;
        if (iPlayPublicService != null) {
            return iPlayPublicService.isMuted();
        }
        return false;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc734052", new Object[]{this})).booleanValue();
        }
        int i = this.m;
        if (i == 0 || i == 4) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("359aa4f3", new Object[]{this})).booleanValue();
        }
        if (this.b == null || this.f23089a == null || !pvs.O0()) {
            return false;
        }
        return true;
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (this.b != null) {
            String str2 = TAG;
            TLog.loge(str2, this.b.p() + " " + str);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8106a4bf", new Object[]{this});
            return;
        }
        r("onStateDismiss");
        View view = this.e;
        if (view != null && this.g != null && this.j != null && this.h != null) {
            view.setVisibility(8);
            this.l.removeCallbacks(this.p);
            this.l.removeCallbacks(this.q);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8320cda9", new Object[]{this});
            return;
        }
        r("onStateInit");
        View view = this.e;
        if (view != null && this.g != null && this.j != null && this.h != null) {
            view.setVisibility(8);
            this.l.removeCallbacks(this.p);
            this.l.removeCallbacks(this.q);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89f2b2b", new Object[]{this});
            return;
        }
        air airVar = this.b;
        if (airVar != null && airVar.j() != null) {
            this.b.j().v(this);
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a09ef34", new Object[]{this});
        } else if (this.f != null) {
            if (o()) {
                this.f.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01sfNXtM1yvAkpGYlCB_!!6000000006640-2-tps-120-120.png");
            } else {
                this.f.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01HmaGHp1zZ1DEbeXPk_!!6000000006727-2-tps-120-120.png");
            }
        }
    }

    public final void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        air airVar = this.b;
        if (airVar != null && airVar.u() != null) {
            this.b.u().i(z);
        }
    }

    public final void A(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce9a498", new Object[]{this, cbaVar});
            return;
        }
        if (cbaVar != null) {
            cbaVar.n0(true);
        }
        IPlayPublicService iPlayPublicService = this.k;
        if (iPlayPublicService != null) {
            iPlayPublicService.setMuted(true);
        }
        this.m = 1;
        w();
        this.l.postDelayed(this.p, 1000L);
        rbu.c0(this.b, "mute_outside", null);
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (q()) {
            r("stop");
            this.m = 0;
            t();
            x();
            this.k = null;
            this.n = pvs.l2();
            this.o = false;
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e30e32", new Object[]{this});
            return;
        }
        r("onStateMute");
        if (this.e != null && this.g != null && this.j != null && this.h != null) {
            this.l.removeCallbacks(this.p);
            this.e.setVisibility(0);
            this.g.setVisibility(8);
            this.j.setText("声音已关闭");
            this.h.setVisibility(0);
            y();
            D();
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8770c1", new Object[]{this});
            return;
        }
        r("onStateNotMute");
        if (this.e != null && this.g != null && this.j != null && this.h != null) {
            this.l.removeCallbacks(this.p);
            this.e.setVisibility(0);
            this.g.setVisibility(8);
            this.j.setText("声音已开启");
            this.h.setVisibility(0);
            y();
            D();
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (q()) {
            r("start");
            if (this.o) {
                r("start hasStart");
            } else if (this.b.w0() == null || !this.b.w0().isFirst) {
                r("start isFirst = false");
            } else {
                cba G0 = this.b.j();
                if (G0 == null) {
                    r("start globalContext == null");
                } else if (pvs.N2().contains(up6.r(this.b))) {
                    r("start is mainSearch");
                } else {
                    if (pvs.p0()) {
                        if (!G0.M) {
                            r("start liveInitialMuted == false");
                            return;
                        } else if (G0.N) {
                            r("start hasKeepMute == true");
                            return;
                        } else {
                            G0.N = true;
                        }
                    } else if (G0.N) {
                        r("start hasKeepMute == true");
                        return;
                    } else {
                        G0.N = true;
                        if (!G0.M) {
                            r("start liveInitialMuted == false");
                            return;
                        }
                    }
                    if (l() <= 0) {
                        r("start getStreamVolume()<=0");
                        return;
                    }
                    this.o = true;
                    if (this.b.x() != null) {
                        r("start mFrameContext.getPlayPublicService() != null");
                        this.k = this.b.x();
                    }
                    i(G0);
                    n();
                    this.m = 0;
                    t();
                    A(G0);
                }
            }
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc01893", new Object[]{this});
            return;
        }
        r("onStateShowTip");
        if (this.e != null && this.g != null && this.j != null && this.h != null) {
            TextView textView = this.i;
            if (textView != null) {
                textView.setText(String.format("%d秒后开启声音", Integer.valueOf(this.n)));
            }
            this.e.setVisibility(0);
            this.g.setVisibility(0);
            y();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_keep_mute_icon) {
            int i = this.m;
            if (i == 1 || i == 2) {
                z(false);
                this.m = 3;
                v();
                rbu.c0(this.b, "icon_soundopen", null);
            } else if (i == 3) {
                z(true);
                this.m = 2;
                u();
                rbu.c0(this.b, "icon_soundclose", null);
            }
        } else if (view.getId() == R.id.taolive_keep_mute_btn && this.m == 1) {
            z(true);
            this.m = 2;
            u();
            rbu.c0(this.b, "keepmute", null);
        }
    }
}
