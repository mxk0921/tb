package com.taobao.avplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.avplayer.f;
import com.taobao.avplayer.playercontrol.DWPlayerController;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.Iterator;
import tb.bub;
import tb.ctb;
import tb.dx4;
import tb.ew0;
import tb.ewj;
import tb.j95;
import tb.ja1;
import tb.l95;
import tb.msb;
import tb.mtb;
import tb.nsb;
import tb.otb;
import tb.t2o;
import tb.tfb;
import tb.usb;
import tb.vtb;
import tb.xsb;
import tb.y85;
import tb.z75;
import tb.zsb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWPlayerControlViewController implements ctb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f10097a;
    public final FrameLayout b;
    public final DWPlayerController c;
    public final j95 d;
    public final y85 e;
    public BroadcastReceiver f;
    public DWLifecycleType h;
    public final ImageView i;
    public final ImageView j;
    public final ImageView k;
    public final ImageView l;
    public xsb m;
    public msb n;
    public bub o;
    public final int q;
    public final int r;
    public boolean s;
    public boolean t;
    public boolean g = false;
    public final ArrayList<ctb> p = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements j95.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            } else {
                DWPlayerControlViewController.this.v();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements mtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.mtb
        public void hide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
                return;
            }
            if (DWPlayerControlViewController.a(DWPlayerControlViewController.this) != null && DWPlayerControlViewController.b(DWPlayerControlViewController.this) == DWLifecycleType.MID) {
                DWPlayerControlViewController.a(DWPlayerControlViewController.this).i();
            }
            if (DWPlayerControlViewController.e(DWPlayerControlViewController.this) != null && !DWPlayerControlViewController.f(DWPlayerControlViewController.this)) {
                DWPlayerControlViewController.e(DWPlayerControlViewController.this).hide();
            }
        }

        @Override // tb.mtb
        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            } else if (DWPlayerControlViewController.a(DWPlayerControlViewController.this) != null) {
                DWPlayerControlViewController.a(DWPlayerControlViewController.this).c();
                DWPlayerControlViewController.this.T();
                if (DWPlayerControlViewController.e(DWPlayerControlViewController.this) != null && !DWPlayerControlViewController.f(DWPlayerControlViewController.this)) {
                    DWPlayerControlViewController.e(DWPlayerControlViewController.this).show();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            DWPlayerControlViewController.this.getClass();
            if (!TextUtils.isEmpty(null) && DWPlayerControlViewController.g(DWPlayerControlViewController.this) != null && DWPlayerControlViewController.g(DWPlayerControlViewController.this).getDWEventAdapter() != null) {
                usb dWEventAdapter = DWPlayerControlViewController.g(DWPlayerControlViewController.this).getDWEventAdapter();
                DWPlayerControlViewController.this.getClass();
                dWEventAdapter.openUrl(null);
                if (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mUTAdapter != null) {
                    DWPlayerControlViewController.g(DWPlayerControlViewController.this).mUTAdapter.a("Player", "Button", "Freeplay", DWPlayerControlViewController.g(DWPlayerControlViewController.this).getUTParams(), null);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (DWPlayerControlViewController.h(DWPlayerControlViewController.this) != null && DWPlayerControlViewController.h(DWPlayerControlViewController.this).start()) {
            } else {
                if (DWPlayerControlViewController.g(DWPlayerControlViewController.this) != null && DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo() != null && DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo().getVideoState() == 1) {
                    DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo().pauseVideo();
                    DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo().f(true);
                } else if (DWPlayerControlViewController.g(DWPlayerControlViewController.this) != null && DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo() != null && DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo().getVideoState() == 2) {
                    DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo().playVideo();
                    DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo().f(false);
                } else if (DWPlayerControlViewController.g(DWPlayerControlViewController.this) != null && DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo() != null && DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo().getVideoState() != 2) {
                    DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo().c();
                    DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideo().f(false);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (DWPlayerControlViewController.i(DWPlayerControlViewController.this) != null) {
                DWPlayerControlViewController.j(DWPlayerControlViewController.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (DWPlayerControlViewController.i(DWPlayerControlViewController.this) != null) {
                DWPlayerControlViewController.i(DWPlayerControlViewController.this).mute(true ^ DWPlayerControlViewController.i(DWPlayerControlViewController.this).isMuted());
                if (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mDWImageAdapter != null) {
                    zsb zsbVar = DWPlayerControlViewController.g(DWPlayerControlViewController.this).mDWImageAdapter;
                    if (DWPlayerControlViewController.i(DWPlayerControlViewController.this).isMuted()) {
                        i2 = R.drawable.dw_ic_muted;
                    } else {
                        i2 = R.drawable.dw_ic_not_muted;
                    }
                    ((z75) zsbVar).e(i2, DWPlayerControlViewController.k(DWPlayerControlViewController.this));
                    return;
                }
                ImageView k = DWPlayerControlViewController.k(DWPlayerControlViewController.this);
                if (DWPlayerControlViewController.i(DWPlayerControlViewController.this).isMuted()) {
                    i = R.drawable.dw_ic_muted;
                } else {
                    i = R.drawable.dw_ic_not_muted;
                }
                k.setImageResource(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            DWPlayerControlViewController dWPlayerControlViewController = DWPlayerControlViewController.this;
            dWPlayerControlViewController.t = false;
            DWPlayerControlViewController.l(dWPlayerControlViewController).setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(452984936);
        t2o.a(452985037);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x016c, code lost:
        if (r13.getActivity() == null) goto L_0x0179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016e, code lost:
        r0 = r13.getActivity().getSharedPreferences("PLAYERINFO", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0179, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017a, code lost:
        if (r0 == null) goto L_0x0183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x017c, code lost:
        r2 = r0.getBoolean("OPENDEBUG", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0183, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0184, code lost:
        if (r2 == false) goto L_0x0190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0186, code lost:
        r12.i.setOnLongClickListener(new com.taobao.avplayer.DWPlayerControlViewController.e(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0190, code lost:
        if (r0 == null) goto L_0x0199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0192, code lost:
        r0 = r0.getBoolean("cleanDWLastFreeFlowTipTime", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0199, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x019a, code lost:
        if (r0 == false) goto L_0x01b9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019c, code lost:
        r0 = r13.getActivity().getSharedPreferences("NetFlow", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a6, code lost:
        if (r0 == null) goto L_0x01b9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ac, code lost:
        if (r0.edit() == null) goto L_0x01b9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ae, code lost:
        r0.edit().clear().commit();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DWPlayerControlViewController(com.taobao.avplayer.DWContext r13) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.DWPlayerControlViewController.<init>(com.taobao.avplayer.DWContext):void");
    }

    public static /* synthetic */ j95 a(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j95) ipChange.ipc$dispatch("2b890fc6", new Object[]{dWPlayerControlViewController});
        }
        return dWPlayerControlViewController.d;
    }

    public static /* synthetic */ DWLifecycleType b(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWLifecycleType) ipChange.ipc$dispatch("6c1dce0b", new Object[]{dWPlayerControlViewController});
        }
        return dWPlayerControlViewController.h;
    }

    public static /* synthetic */ msb c(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (msb) ipChange.ipc$dispatch("ac4ea2ce", new Object[]{dWPlayerControlViewController});
        }
        return dWPlayerControlViewController.n;
    }

    public static /* synthetic */ ImageView d(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("e428277a", new Object[]{dWPlayerControlViewController});
        }
        return dWPlayerControlViewController.l;
    }

    public static /* synthetic */ mtb e(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtb) ipChange.ipc$dispatch("97eb9c8c", new Object[]{dWPlayerControlViewController});
        }
        dWPlayerControlViewController.getClass();
        return null;
    }

    public static /* synthetic */ boolean f(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71b438a7", new Object[]{dWPlayerControlViewController})).booleanValue();
        }
        return dWPlayerControlViewController.s;
    }

    public static /* synthetic */ DWContext g(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("e5a5df1d", new Object[]{dWPlayerControlViewController});
        }
        return dWPlayerControlViewController.f10097a;
    }

    public static /* synthetic */ xsb h(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xsb) ipChange.ipc$dispatch("3e75b4fd", new Object[]{dWPlayerControlViewController});
        }
        return dWPlayerControlViewController.m;
    }

    public static /* synthetic */ bub i(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bub) ipChange.ipc$dispatch("2c5e1eb3", new Object[]{dWPlayerControlViewController});
        }
        return dWPlayerControlViewController.o;
    }

    public static /* synthetic */ void j(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a568951f", new Object[]{dWPlayerControlViewController});
        } else {
            dWPlayerControlViewController.V();
        }
    }

    public static /* synthetic */ ImageView k(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("3c707512", new Object[]{dWPlayerControlViewController});
        }
        return dWPlayerControlViewController.j;
    }

    public static /* synthetic */ ImageView l(DWPlayerControlViewController dWPlayerControlViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("e3ec4ed3", new Object[]{dWPlayerControlViewController});
        }
        return dWPlayerControlViewController.k;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd96e7a3", new Object[]{this})).booleanValue();
        }
        return this.d.f();
    }

    public void B(boolean z) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        if (z) {
            this.c.hideCloseView(false);
            DWContext dWContext = this.f10097a;
            if (dWContext.mMuteIconDisplay && (imageView = this.k) != null) {
                zsb zsbVar = dWContext.mDWImageAdapter;
                if (zsbVar != null) {
                    ((z75) zsbVar).e(R.drawable.dw_mute_open, imageView);
                } else {
                    imageView.setImageResource(R.drawable.dw_mute_open);
                }
                if (this.h == DWLifecycleType.MID) {
                    this.k.setVisibility(0);
                }
            }
        } else {
            ImageView imageView2 = this.k;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            DWContext dWContext2 = this.f10097a;
            if (!(dWContext2 == null || dWContext2.getVideo() == null || this.f10097a.getVideo().getVideoState() != 3)) {
                this.c.showCloseView(false);
            }
        }
        this.d.g(z);
    }

    public void C(ctb ctbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbffd053", new Object[]{this, ctbVar});
        } else if (!this.p.contains(ctbVar)) {
            this.p.add(ctbVar);
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd610a1", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.f == null) {
            y();
        } else {
            try {
                this.f10097a.getActivity().unregisterReceiver(this.f);
            } catch (Exception unused) {
            }
        }
        try {
            this.f10097a.getActivity().registerReceiver(this.f, intentFilter);
        } catch (Exception unused2) {
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
        } else {
            this.c.removeFullScreenCustomView();
        }
    }

    public void F(f.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00e316", new Object[]{this, cVar});
        } else {
            this.n = cVar;
        }
    }

    public void G(nsb nsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84ff1fa", new Object[]{this, nsbVar});
        } else {
            this.c.setCloseViewClickListener(nsbVar);
        }
    }

    public void H(xsb xsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506d7354", new Object[]{this, xsbVar});
        } else {
            this.m = xsbVar;
        }
    }

    public void I(otb otbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6acdbdf", new Object[]{this, otbVar});
        } else {
            this.c.setIDWPlayerControlListener(otbVar);
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a772f17", new Object[]{this});
            return;
        }
        ImageView imageView = this.i;
        if (imageView != null) {
            zsb zsbVar = this.f10097a.mDWImageAdapter;
            if (zsbVar != null) {
                ((z75) zsbVar).e(this.q, imageView);
            } else {
                imageView.setImageResource(this.q);
            }
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95834d5", new Object[]{this});
            return;
        }
        ImageView imageView = this.i;
        if (imageView != null) {
            zsb zsbVar = this.f10097a.mDWImageAdapter;
            if (zsbVar != null) {
                ((z75) zsbVar).e(this.r, imageView);
            } else {
                imageView.setImageResource(this.r);
            }
        }
    }

    public void L(bub bubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69b012a", new Object[]{this, bubVar});
        } else {
            this.o = bubVar;
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953f86c7", new Object[]{this});
        } else {
            this.c.showCloseView(true);
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb064d64", new Object[]{this});
        } else {
            this.c.showControllerInner();
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67080245", new Object[]{this});
        } else {
            this.c.showControllerView();
        }
    }

    public void P(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03e5802", new Object[]{this, str, new Boolean(z)});
        } else {
            this.e.m(str, z);
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d82d53", new Object[]{this});
        } else {
            this.e.n();
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a13c99", new Object[]{this});
        } else {
            this.d.k(true);
        }
    }

    public void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c.showOrHideInteractive(z);
        this.d.j(z);
    }

    public void T() {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf6fb9d", new Object[]{this});
            return;
        }
        y85 y85Var = this.e;
        if ((y85Var == null || !y85Var.l()) && (imageView = this.i) != null && imageView.getVisibility() != 0 && z()) {
            this.i.setVisibility(0);
        }
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ce99d0", new Object[]{this})).booleanValue();
        }
        return this.c.showing();
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472aaa68", new Object[]{this});
            return;
        }
        try {
            if (this.f != null) {
                this.f10097a.getActivity().unregisterReceiver(this.f);
                this.f = null;
            }
        } catch (Exception unused) {
        }
    }

    public void m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
        } else {
            this.c.addFullScreenCustomView(view);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.s = true;
        W();
        ArrayList<ctb> arrayList = this.p;
        if (arrayList != null) {
            arrayList.clear();
        }
        y85 y85Var = this.e;
        if (y85Var != null) {
            y85Var.f();
        }
    }

    public ViewGroup o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.h = dWLifecycleType;
        if (dWLifecycleType == DWLifecycleType.BEFORE) {
            if (!this.f10097a.isHiddenThumbnailPlayBtn() && (imageView3 = this.i) != null) {
                imageView3.setVisibility(0);
            }
        } else if (dWLifecycleType == DWLifecycleType.MID) {
            ewj.b(this.f10097a.getActivity());
            D();
            this.e.h();
            if (this.f10097a.mMuteIconDisplay && (imageView2 = this.k) != null && this.g) {
                imageView2.setVisibility(0);
            }
        }
        if (this.h == DWLifecycleType.MID_BEGIN) {
            this.e.h();
            this.b.bringToFront();
        }
        DWLifecycleType dWLifecycleType2 = this.h;
        if (dWLifecycleType2 == DWLifecycleType.AFTER || dWLifecycleType2 == DWLifecycleType.MID_END) {
            v();
        }
        if (!(this.h == DWLifecycleType.MID || !this.f10097a.mMuteIconDisplay || (imageView = this.k) == null)) {
            imageView.setVisibility(8);
        }
        this.c.hideControllerInner();
        Iterator<ctb> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(dWLifecycleType);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417f1ca2", new Object[]{this});
        } else {
            this.c.hideCloseView(true);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d76d2ff", new Object[]{this});
        } else {
            this.c.hideControllerInner();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f2dd4a", new Object[]{this});
        } else {
            this.c.hideControllerView();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183864be", new Object[]{this});
        } else {
            this.c.hideGoodsListView();
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa48b2ee", new Object[]{this});
        } else {
            this.e.h();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b911c234", new Object[]{this});
        } else {
            this.d.d(true);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9cfbe62", new Object[]{this});
            return;
        }
        ImageView imageView = this.i;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.i.setVisibility(8);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7df73", new Object[]{this});
            return;
        }
        DWPlayerController dWPlayerController = this.c;
        if (dWPlayerController != null) {
            dWPlayerController.hideTopEventView();
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70283098", new Object[]{this});
        } else {
            this.e.i();
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac7ea03", new Object[]{this});
        } else {
            this.f = new BroadcastReceiver() { // from class: com.taobao.avplayer.DWPlayerControlViewController.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWPlayerControlViewController$9");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && context.getApplicationContext() != null) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null) {
                            i = activeNetworkInfo.getType();
                        } else {
                            i = -1;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                            if (i == 0) {
                                if (DWPlayerControlViewController.c(DWPlayerControlViewController.this) == null || !DWPlayerControlViewController.c(DWPlayerControlViewController.this).a() || !DWPlayerControlViewController.c(DWPlayerControlViewController.this).b() || !DWPlayerControlViewController.g(DWPlayerControlViewController.this).getShowPlayWithCacheHint()) {
                                    try {
                                        if (DWPlayerControlViewController.g(DWPlayerControlViewController.this).getShowNotWifiHint() && i != ja1.e) {
                                            DWPlayerControlViewController.g(DWPlayerControlViewController.this).showToast(DWPlayerControlViewController.g(DWPlayerControlViewController.this).getActivity().getResources().getString(R.string.dw_tbavsdk_networktips));
                                        }
                                    } catch (Exception e2) {
                                        AVSDKLog.d(tfb.MODULE_SDK_PAGE, " show netflow toast error:" + ew0.k(e2));
                                    }
                                } else {
                                    DWPlayerControlViewController.g(DWPlayerControlViewController.this).showToast(DWPlayerControlViewController.g(DWPlayerControlViewController.this).getActivity().getResources().getString(R.string.dw_tbavsdk_networktips_cache_available));
                                }
                            }
                            ja1.e = i;
                        }
                    }
                }
            };
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be9ca394", new Object[]{this})).booleanValue();
        }
        return this.e.k();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            if (!(DWPlayerControlViewController.g(DWPlayerControlViewController.this) == null || DWPlayerControlViewController.g(DWPlayerControlViewController.this).getDWEventAdapter() == null)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mFrom", (Object) DWPlayerControlViewController.g(DWPlayerControlViewController.this).mFrom);
                jSONObject.put("mHeight", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mHeight + ""));
                jSONObject.put("mWidth", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mWidth + ""));
                jSONObject.put("mVideoSource", (Object) DWPlayerControlViewController.g(DWPlayerControlViewController.this).mVideoSource);
                jSONObject.put("mNormalWidth", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mNormalWidth + ""));
                jSONObject.put("mNormalHeight", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mHeight + ""));
                if (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mPlayContext.getPlayerType() == 1) {
                    str = "PLAYER_TYPE_FF";
                } else if (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mPlayContext.getPlayerType() != 2 && DWPlayerControlViewController.g(DWPlayerControlViewController.this).mPlayContext.getPlayerType() == 3) {
                    str = "PLAYER_TYPE_TAOBAO";
                } else {
                    str = "PLAYER_TYPE_MEDIA";
                }
                jSONObject.put("mPlayerType", (Object) str);
                jSONObject.put("mVideoUrl", (Object) DWPlayerControlViewController.g(DWPlayerControlViewController.this).mPlayContext.getVideoUrl());
                jSONObject.put("mVideoDefinition", (Object) DWPlayerControlViewController.g(DWPlayerControlViewController.this).mPlayContext.getVideoDefinition());
                jSONObject.put("mHardwareHevc", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mPlayContext.isHardwareHevc() + ""));
                jSONObject.put("mUseTBNet", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mPlayContext.isUseTBNet() + ""));
                jSONObject.put("mHardwareAvc", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mPlayContext.isHardwareAvc() + ""));
                jSONObject.put("mInteractiveId", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mInteractiveId + ""));
                jSONObject.put("mUserId", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mUserId + ""));
                jSONObject.put("mVideoId", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mVideoId + ""));
                jSONObject.put("mVideoSource", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mVideoSource + ""));
                jSONObject.put("mVideoToken", (Object) DWPlayerControlViewController.g(DWPlayerControlViewController.this).getVideoToken());
                jSONObject.put("mH265", (Object) (DWPlayerControlViewController.g(DWPlayerControlViewController.this).mPlayContext.isH265() + ""));
                jSONObject.put("mContentId", (Object) DWPlayerControlViewController.g(DWPlayerControlViewController.this).mContentId);
                jSONObject.put("mPlayToken", (Object) DWPlayerControlViewController.g(DWPlayerControlViewController.this).getPlayToken());
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("deviceName", Build.MODEL);
                    jSONObject2.put("deviceBrand", Build.BRAND);
                    jSONObject2.put(APower.TYPE_CPU, ew0.e());
                    int b = dx4.b();
                    float f = 0.0f;
                    for (int i = 0; i < b; i++) {
                        float c = l95.c(dx4.a(i)) / 1000000.0f;
                        if (c > f) {
                            f = c;
                        }
                    }
                    jSONObject2.put("cpuFreq", f + "");
                    DWPlayerControlViewController.g(DWPlayerControlViewController.this).getDWEventAdapter().openUrl("https://h5.m.taobao.com/medialab/androidDebugView.html?param=" + jSONObject.toJSONString() + "&deviceInfo=" + jSONObject2.toString());
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    public final void V() {
        vtb vtbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23b7275", new Object[]{this});
        } else if (!this.t && this.k != null) {
            this.t = true;
            this.o.mute(false);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(400L);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            this.k.startAnimation(alphaAnimation);
            alphaAnimation.setAnimationListener(new h());
            DWContext dWContext = this.f10097a;
            if (dWContext != null && (vtbVar = dWContext.mUTAdapter) != null) {
                vtbVar.a("DWVideo", "Button", "videoMute", dWContext.getUTParams(), null);
            }
        }
    }
}
