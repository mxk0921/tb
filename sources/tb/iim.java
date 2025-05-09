package tb;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.album.PictureAlbumCard;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iim {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_HIDDEN = "hidden";

    /* renamed from: a  reason: collision with root package name */
    public int f21330a;
    public int b;
    public int c;
    public int d;
    public float e;
    public float f;
    public ValueAnimator g;
    public boolean h;
    public uq9 i;
    public boolean j = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                iim.a(iim.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    static {
        t2o.a(468714097);
        t2o.a(468714094);
    }

    public iim(uq9 uq9Var) {
        this.i = uq9Var;
    }

    public static /* synthetic */ void a(iim iimVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc1e9b", new Object[]{iimVar, new Float(f)});
        } else {
            iimVar.d(f);
        }
    }

    public void b(int i, int i2) {
        PictureAlbumCard pictureAlbumCard;
        ViewGroup C1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec35db4", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i()) {
            uq9 uq9Var = this.i;
            if (uq9Var instanceof prp) {
                r8e c = ((prp) uq9Var).G1().c();
                atb dWInstance = ((prp) this.i).getDWInstance();
                if (c == null || dWInstance == null) {
                    ir9.b("PopVideoSizeAdjustHandler", "adjustVideoSize失效或者mDWInstance为空，mVideoFrameSizeObject为空");
                    return;
                }
                ViewGroup view = dWInstance.getView();
                if (view == null) {
                    ir9.b("PopVideoSizeAdjustHandler", "adjustVideoSize失效，mDWInstance.getView()为空");
                    return;
                }
                int i3 = (int) (i * (c.d / c.c));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    ir9.b("PopVideoSizeAdjustHandler", "adjustVideoSize失效，LayoutParams类型不符");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = i3;
                marginLayoutParams.height = i;
                marginLayoutParams.topMargin = i2;
                dWInstance.f(i3, i);
            } else if ((uq9Var instanceof PictureAlbumCard) && (C1 = (pictureAlbumCard = (PictureAlbumCard) uq9Var).C1()) != null && (C1.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) C1.getLayoutParams();
                double[] D1 = pictureAlbumCard.D1();
                double d = D1[2];
                int measuredHeight = this.i.W().getMeasuredHeight();
                int measuredWidth = this.i.W().getMeasuredWidth();
                int i4 = (int) ((i * 1.0f) / ((((int) D1[0]) * 1.0f) / measuredHeight));
                ir9.b("PopVideoSizeAdjustHandler", "albumAdjustSize，原 始 topmargin=" + layoutParams2.topMargin + ";itemHeight=" + measuredHeight + ";itemWidth=" + measuredWidth + ";albumHeight=" + C1.getMeasuredHeight() + ";albumWidth=" + C1.getMeasuredWidth() + ";newAlbumHeigth=" + i4 + "; height=" + i + ";marginTop=" + i2);
                layoutParams2.topMargin = 0 - (this.f21330a - i2);
                layoutParams2.height = i4;
                layoutParams2.width = (int) (((double) i) / d);
                C1.setLayoutParams(layoutParams2);
                StringBuilder sb = new StringBuilder("albumAdjustSize，topmargin=");
                sb.append(layoutParams2.topMargin);
                sb.append(";height=");
                sb.append(layoutParams2.height);
                sb.append(";width=");
                sb.append(layoutParams2.width);
                ir9.b("PopVideoSizeAdjustHandler", sb.toString());
            }
        }
    }

    public final void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f539cff7", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = this.e;
        float f3 = (f - f2) / (this.f - f2);
        int i = this.c;
        int i2 = (int) (i - ((i - this.d) * f3));
        int i3 = this.f21330a;
        int i4 = (int) (i3 - ((i3 - this.b) * f3));
        b(i2, i4);
        ir9.b("PopVideoSizeAdjustHandler", "y=" + f + "调整height: " + i2 + ", marginTop: " + i4 + ", ratio: " + f3);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d30a1a3", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("AB_fullscreenpage_android.halfZoomOPT2503.enaleHalfZoom0305", FluidSDK.isBetaAppPackage());
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7d16e8f", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("fixAdjust0304", true);
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f620089", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b("PopVideoSizeAdjustHandler", "sendToRootTnodeMessage isHide: " + z);
        p(z);
        this.j = z;
        q(z);
    }

    public final void h(com.taobao.android.fluid.framework.data.datamodel.pop.a aVar, int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a6bf67", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
        } else if (aVar != null) {
            int z = s6o.z(FluidSDK.getContext());
            this.e = aVar.f7802a;
            this.f = aVar.b;
            this.f21330a = i2;
            if (pto.m(this.i.U()) || f2k.c(this.i.U()) == 0) {
                i3 = z;
            }
            this.b = i3;
            this.c = i;
            int i4 = ((int) aVar.b) - z;
            this.d = i4;
            if (this.i instanceof PictureAlbumCard) {
                this.f21330a = i2 + ((i - i4) / 2);
            }
            g(true);
            ir9.b("PopVideoSizeAdjustHandler", "IN_ANIMATION_START, popStartY: " + aVar.f7802a + ", popEndY: " + aVar.b + ", videoStartMarginTop: " + this.f21330a + ", videoEndMarginTopStart: " + this.b + ", videoStartHeight: " + this.c + ", videoEndHeightStart: " + this.d);
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45f67dd0", new Object[]{this})).booleanValue();
        }
        if (this.f == this.e && f()) {
            return false;
        }
        if (!pr9.j() || pr9.k()) {
            return true;
        }
        if (!hn4.f(this.i.U()) || !e()) {
            return false;
        }
        return true;
    }

    public void j(com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb0e0d1", new Object[]{this, aVar});
        } else if (s(aVar)) {
            d(aVar.d);
        }
    }

    public final void l(com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52aa7e5", new Object[]{this, aVar});
        } else if (aVar != null) {
            if (aVar.b > aVar.f7802a) {
                this.h = true;
            } else {
                this.h = false;
            }
            ir9.b("PopVideoSizeAdjustHandler", "PAN_ANIMATION_RECOVER_START, popPosition.startY: " + aVar.f7802a + ", popPosition.endY: " + aVar.b);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2530a8fc", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g = null;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2505e851", new Object[]{this});
        } else if (this.j) {
            g(false);
        }
    }

    public void o(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978e19bb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        uq9 uq9Var = this.i;
        if (uq9Var instanceof prp) {
            this.e = i;
            this.f = i2;
            this.c = ((prp) uq9Var).G1().c().c;
            this.f21330a = ((prp) this.i).G1().c().e;
            this.d = i3;
        }
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad0b5eb", new Object[]{this, new Boolean(z)});
            return;
        }
        uq9 uq9Var = this.i;
        if (uq9Var != null && uq9Var.V() != null) {
            this.i.V().S(!z);
        }
    }

    public final void q(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f88550e", new Object[]{this, new Boolean(z)});
            return;
        }
        FluidContext U = this.i.U();
        ir9.b("PopVideoSizeAdjustHandler", "[webcomponent]setTopLayoutHide,发送给Node节点消息");
        ((IHostTNodeService) U.getService(IHostTNodeService.class)).showOrHideTab2TopBar(true ^ z);
        IContainerService iContainerService = (IContainerService) U.getService(IContainerService.class);
        if (z) {
            i = 8;
        }
        iContainerService.getAndSetTopLayoutVisibility(i);
    }

    public void r(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa787431", new Object[]{this, prpVar});
        } else {
            this.i = prpVar;
        }
    }

    public final boolean s(com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30b25a02", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar != null && this.i != null) {
            return true;
        }
        ir9.b("PopVideoSizeAdjustHandler", " position为空或者播放器为空,不响应");
        return false;
    }

    public final void c(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a20fa72b", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.g = ofFloat;
        ofFloat.setDuration(i);
        this.g.addUpdateListener(new a());
        ir9.b("PopVideoSizeAdjustHandler", "自动开启动画，" + f + " to " + f2 + "; duration=" + i);
        this.g.start();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r10.equals(com.taobao.android.abilitykit.ability.pop.render.IAKPopRender.LifecycleType.IN_ANIMATION_END) == false) goto L_0x005d;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(java.lang.String r10, com.taobao.android.fluid.framework.data.datamodel.pop.a r11) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iim.k(java.lang.String, com.taobao.android.fluid.framework.data.datamodel.pop.a):void");
    }
}
