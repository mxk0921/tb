package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.PopDialogSource;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.VesselViewHolder;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.avplayer.q;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.p6m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class id7 implements ztb, View.OnClickListener, ntc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f21252a;
    public DWInstance b;
    public Context c;
    public View d;
    public View e;
    public ImageView f;
    public p6m.a g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public bh7 l;
    public ztb m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements qtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262286);
            t2o.a(452985045);
        }

        public b() {
        }

        @Override // tb.qtb
        public boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            if (id7.a(id7.this) != null && id7.a(id7.this).isMute()) {
                id7.a(id7.this).mute(false);
            }
            if (id7.a(id7.this) != null && (id7.a(id7.this).getVideoState() == 0 || id7.a(id7.this).getVideoState() == 4)) {
                id7.a(id7.this).start();
            }
            id7.b(id7.this);
            return false;
        }
    }

    static {
        t2o.a(912262284);
        t2o.a(452985010);
        t2o.a(912262299);
        t2o.a(912261362);
    }

    public id7() {
        mr7.a(125.0f);
    }

    public static /* synthetic */ DWInstance a(id7 id7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInstance) ipChange.ipc$dispatch("be91771e", new Object[]{id7Var});
        }
        return id7Var.b;
    }

    public static /* synthetic */ void b(id7 id7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7eef9ba", new Object[]{id7Var});
        } else {
            id7Var.q();
        }
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f87bc9d", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            ViewGroup view = dWInstance.getView();
            this.e = view;
            if (view.getParent() != null) {
                ((ViewGroup) this.e.getParent()).removeView(this.e);
            }
            ((ViewGroup) this.d).addView(this.e, new RelativeLayout.LayoutParams(-1, -1));
            this.b.setFrame(this.d.getWidth(), this.d.getHeight());
        }
        o();
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b31b7088", new Object[]{this})).intValue();
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            return dWInstance.getCurrentPosition();
        }
        return -1;
    }

    public void e(Context context, p6m.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfbb4a0", new Object[]{this, context, aVar, new Boolean(z)});
            return;
        }
        if (this.c == null) {
            this.c = context;
            this.g = aVar;
            this.d = aVar.b;
            f();
        }
        g();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88074522", new Object[]{this});
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfa5052", new Object[]{this});
            return;
        }
        p6m.a aVar = this.g;
        if (aVar != null && !TextUtils.isEmpty(aVar.f25911a) && this.d != null) {
            if (this.b == null) {
                q.a aVar2 = new q.a(bew.a(this.c));
                aVar2.n(nbf.STDPOP_POP_ID_DETAIL);
                aVar2.U(true);
                aVar2.d0(false);
                aVar2.x(this.d.getHeight());
                aVar2.q0(this.d.getWidth());
                aVar2.p0(this.g.f25911a);
                aVar2.l0(this.g.c);
                aVar2.n0("TBVideo");
                aVar2.f0(null);
                aVar2.J(true);
                aVar2.L(true);
                aVar2.d0(true);
                aVar2.F(true);
                aVar2.c0(false);
                aVar2.u(false);
                aVar2.a0(false);
                aVar2.Z(true);
                aVar2.t(false);
                aVar2.E(true);
                aVar2.w(false);
                if (!TextUtils.isEmpty(null) && TextUtils.isDigitsOnly(null)) {
                    aVar2.h0(Long.parseLong(null));
                }
                if (!TextUtils.isEmpty(this.g.d)) {
                    aVar2.Q(true);
                    q75 q75Var = new q75();
                    q75Var.d(new DWFrontCoverBean(0L, null, this.g.d));
                    aVar2.v(q75Var);
                }
                q r0 = aVar2.r0();
                this.b = r0;
                r0.hideCloseView();
                this.b.setVideoLifecycleListener(this);
                this.b.setRootViewClickListener(new b());
                i();
            }
            c();
            this.b.showController();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.pauseVideo();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0d174b", new Object[]{this});
            return;
        }
        q84.i(this.c, pvl.class, this);
        q84.i(this.c, pao.class, this);
        q84.i(this.c, c8w.class, this);
        q84.i(this.c, i7w.class, this);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea0f33b", new Object[]{this});
        } else if (this.b != null) {
            if (this.e.getParent() != null) {
                ((ViewGroup) this.e.getParent()).removeView(this.e);
            }
            this.b.destroy();
            this.b = null;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.seekTo(i);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c5afa3", new Object[]{this});
            return;
        }
        if (this.f21252a == null) {
            HashMap<String, String> hashMap = new HashMap<>();
            this.f21252a = hashMap;
            hashMap.put("spm", "a2141.7631564.1999020245");
            p6m.a aVar = this.g;
            if (aVar != null) {
                this.f21252a.put(xau.PROPERTY_VIDEO_ID, aVar.c);
            }
        }
        GalleryTracker.a(this.c, VesselViewHolder.UT_SHOW_ARG1, this.f21252a);
    }

    public void m(mtb mtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0dbb8d2", new Object[]{this, mtbVar});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.setNormalControllerListener(mtbVar);
        }
    }

    public void n(ztb ztbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e4384", new Object[]{this, ztbVar});
        } else {
            this.m = ztbVar;
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ab50b5", new Object[]{this});
            return;
        }
        View view = this.d;
        if ((view == null || view.getHeight() < mr7.e(this.c)) && this.c != null) {
            bh7 bh7Var = this.l;
            if (bh7Var == null || !bh7Var.isShowing()) {
                if (this.f == null) {
                    ImageView imageView = new ImageView(this.c);
                    this.f = imageView;
                    imageView.setImageDrawable(this.c.getResources().getDrawable(R.drawable.tt_detail_video_enlarge));
                }
                if (this.f.getParent() != null) {
                    ((ViewGroup) this.f.getParent()).removeView(this.f);
                }
                DWInstance dWInstance = this.b;
                if (dWInstance != null) {
                    dWInstance.addFullScreenCustomView(this.f);
                }
                this.f.setOnClickListener(this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == this.f) {
            if (this.l == null) {
                this.l = new bh7(this.c, R.style.Dialog_Fullscreen, this.b);
            }
            bh7 bh7Var = this.l;
            DWInstance dWInstance = this.b;
            bh7Var.e(dWInstance, PopDialogSource.DESC, dWInstance.getView(), this.d.getWidth(), this.d.getHeight());
            this.b.removeFullScreenCustomView();
        }
    }

    @Override // tb.ztb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoClose();
        }
    }

    @Override // tb.ztb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.setDWLifecycleType(DWLifecycleType.BEFORE);
        }
        DWInstance dWInstance2 = this.b;
        if (dWInstance2 != null && dWInstance2.isFullScreen()) {
            this.b.toggleScreen();
        }
        DWInstance dWInstance3 = this.b;
        if (dWInstance3 != null) {
            dWInstance3.orientationDisable();
        }
        s();
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoComplete();
        }
    }

    @Override // tb.ztb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoError(Integer.valueOf(i), i, i2);
        }
    }

    @Override // tb.ztb
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoFullScreen();
        }
    }

    @Override // tb.ztb
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoInfo(obj, i, i2);
        }
    }

    @Override // tb.ztb
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoNormalScreen();
        }
    }

    @Override // tb.ztb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoPause(z);
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.showController();
        }
    }

    @Override // tb.ztb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoPlay();
        }
    }

    @Override // tb.ztb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoPrepared(obj);
        }
    }

    @Override // tb.ztb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoProgressChanged(i, i2, i3);
        }
    }

    @Override // tb.ztb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        ztb ztbVar = this.m;
        if (ztbVar != null) {
            ztbVar.onVideoSeekTo(i);
        }
    }

    @Override // tb.ztb
    public void onVideoStart() {
        DWInstance dWInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else if (!this.j || (dWInstance = this.b) == null) {
            ztb ztbVar = this.m;
            if (ztbVar != null) {
                ztbVar.onVideoStart();
            }
            if (this.k && bh7.c(this.b)) {
                this.b.orientationEnable();
            }
        } else {
            dWInstance.mute(false);
            this.b.pauseVideo();
            this.j = false;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            if (dWInstance.getVideoState() == 0 || this.b.getVideoState() == 4) {
                this.b.start();
            }
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4c016a", new Object[]{this});
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daef9b72", new Object[]{this});
            return;
        }
        q84.l(this.c, pvl.class);
        q84.l(this.c, pao.class);
        q84.l(this.c, c8w.class);
        q84.l(this.c, i7w.class);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6929b67", new Object[]{this});
            return;
        }
        bh7 bh7Var = this.l;
        if (bh7Var != null && bh7Var.isShowing()) {
            this.l.dismiss();
            this.l = null;
        }
        r();
        j();
        DWInstance dWInstance = this.b;
        if (dWInstance != null) {
            dWInstance.destroy();
            this.b = null;
        }
    }

    public void t(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd032a3", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        DWInstance dWInstance = this.b;
        if (dWInstance != null && this.g != null) {
            if (z && z2) {
                dWInstance.pauseVideo();
            }
            int videoState = this.b.getVideoState();
            if (!z || z2) {
                if (z && z2) {
                    this.b.pauseVideo();
                }
            } else if (videoState == 8) {
                this.j = true;
            }
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8558e", new Object[]{this});
            return;
        }
        bh7 bh7Var = this.l;
        if (bh7Var == null || !bh7Var.isShowing()) {
            l();
            c();
        }
    }

    @Override // tb.ntc
    public boolean y1(dtc dtcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7cc73d0", new Object[]{this, dtcVar})).booleanValue();
        }
        if (dtcVar instanceof pvl) {
            DWInstance dWInstance = this.b;
            if (dWInstance != null) {
                this.i = dWInstance.getVideoState();
                this.h = true;
                this.b.pauseVideo();
            }
            return true;
        } else if (dtcVar instanceof pao) {
            DWInstance dWInstance2 = this.b;
            if (dWInstance2 != null && this.h && this.i == 1) {
                dWInstance2.playVideo();
                this.h = false;
            }
            return true;
        } else if (dtcVar instanceof c8w) {
            this.k = true;
            this.b.removeFullScreenCustomView();
            return true;
        } else if (!(dtcVar instanceof i7w)) {
            return false;
        } else {
            this.k = false;
            if (this.l != null) {
                c();
            }
            return true;
        }
    }
}
