package com.taobao.mediaplay.playercontrol;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaLifecycleType;
import com.taobao.mediaplay.playercontrol.MediaPlayNormalController;
import com.taobao.taobao.R;
import tb.ofi;
import tb.t2o;
import tb.urc;
import tb.vfi;
import tb.zrc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a implements urc, zrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MediaContext f11034a;
    public FrameLayout b;
    public MediaPlayNormalController c;
    public vfi d;
    public ImageView e;
    public int f;
    public int g;
    public boolean h;
    public zrc i;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.mediaplay.playercontrol.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0596a implements MediaPlayNormalController.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0596a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            } else {
                a.this.h();
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            } else {
                a.this.q();
            }
        }
    }

    static {
        t2o.a(774897820);
        t2o.a(774897700);
        t2o.a(774897818);
    }

    public a(MediaContext mediaContext, boolean z) {
        this.f11034a = mediaContext;
        j();
        if (z) {
            i();
        }
    }

    public static /* synthetic */ MediaContext b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContext) ipChange.ipc$dispatch("fc0f3543", new Object[]{aVar});
        }
        return aVar.f11034a;
    }

    @Override // tb.zrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2fc8f1", new Object[]{this});
        }
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController != null) {
            mediaPlayNormalController.addFullScreenCustomView(view);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.h = true;
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController != null) {
            mediaPlayNormalController.destroy();
        }
        vfi vfiVar = this.d;
        if (vfiVar != null) {
            vfiVar.a();
        }
    }

    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.b;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d76d2ff", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController != null) {
            mediaPlayNormalController.hideControllerInner();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f2dd4a", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController != null) {
            mediaPlayNormalController.hideControllerView();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9cfbe62", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.e.setVisibility(8);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af98825", new Object[]{this});
        } else if (this.c == null) {
            this.d = new vfi(this.f11034a, this.b);
            MediaPlayNormalController mediaPlayNormalController = new MediaPlayNormalController(this.f11034a);
            this.c = mediaPlayNormalController;
            mediaPlayNormalController.setIMediaPlayControlListener(this.i);
            this.b.addView(this.c.getView(), new FrameLayout.LayoutParams(-1, -2, 80));
            this.f11034a.getVideo().h(this.d);
            this.f11034a.getVideo().h(this.c);
            this.c.setNormalControllerListener(new C0596a());
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.b = new FrameLayout(this.f11034a.getContext());
        this.f = R.drawable.mediaplay_sdk_pause;
        int i = R.drawable.mediaplay_sdk_play;
        this.g = i;
        ImageView imageView = new ImageView(this.f11034a.getContext());
        this.e = imageView;
        imageView.setVisibility(8);
        this.e.setImageResource(i);
        this.b.addView(this.e, new FrameLayout.LayoutParams(DWViewUtil.dip2px(this.f11034a.getContext(), 62.0f), DWViewUtil.dip2px(this.f11034a.getContext(), 62.0f), 17));
        this.e.setOnClickListener(new ofi(this));
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController != null) {
            mediaPlayNormalController.removeFullScreenCustomView();
        }
    }

    public void l(zrc zrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad790264", new Object[]{this, zrcVar});
            return;
        }
        this.i = zrcVar;
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController != null) {
            mediaPlayNormalController.setIMediaPlayControlListener(zrcVar);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a772f17", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageResource(this.f);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95834d5", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageResource(this.g);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb064d64", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController != null) {
            mediaPlayNormalController.showControllerInner();
        }
    }

    @Override // tb.urc
    public void onLifecycleChanged(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0fa27", new Object[]{this, mediaLifecycleType});
        } else if (MediaLifecycleType.PLAY == mediaLifecycleType && this.c == null && !this.h) {
            i();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67080245", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController != null) {
            mediaPlayNormalController.showControllerView();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf6fb9d", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView != null && imageView.getVisibility() != 0) {
            this.e.setVisibility(0);
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ce99d0", new Object[]{this})).booleanValue();
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController == null) {
            return false;
        }
        return mediaPlayNormalController.showing();
    }

    @Override // tb.zrc
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        }
    }
}
