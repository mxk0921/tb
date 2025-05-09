package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.ResultRecord;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pxq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_ROOT_ANIM_DISABLE = 1;
    public static final int STATUS_ROOT_ANIM_ENABLE = 2;
    public static final int STATUS_UN_ROOT = 0;

    /* renamed from: a  reason: collision with root package name */
    public FragmentAnimator f26383a;
    public sz0 b;
    public Handler e;
    public int f;
    public fjw g;
    public Bundle h;
    public final ISupportFragment i;
    public final Fragment j;
    public FragmentActivity k;
    public wtd l;
    public boolean n;
    public int c = 0;
    public int d = Integer.MIN_VALUE;
    public boolean m = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Animation f26384a;

        /* compiled from: Taobao */
        /* renamed from: tb.pxq$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1032a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1032a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    pxq.a(pxq.this).getSupportDelegate().getClass();
                }
            }
        }

        public a(Animation animation) {
            this.f26384a = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            }
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
                return;
            }
            pxq.a(pxq.this).getSupportDelegate().getClass();
            pxq.b(pxq.this).postDelayed(new RunnableC1032a(), this.f26384a.getDuration());
        }
    }

    static {
        t2o.a(775946375);
    }

    public pxq(ISupportFragment iSupportFragment) {
        if (iSupportFragment instanceof Fragment) {
            this.i = iSupportFragment;
            this.j = (Fragment) iSupportFragment;
            return;
        }
        throw new RuntimeException("Must extends Fragment");
    }

    public static /* synthetic */ wtd a(pxq pxqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wtd) ipChange.ipc$dispatch("a786855a", new Object[]{pxqVar});
        }
        return pxqVar.l;
    }

    public static /* synthetic */ Handler b(pxq pxqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("c3b21789", new Object[]{pxqVar});
        }
        return pxqVar.e();
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
        }
    }

    public void C(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12902f9a", new Object[]{this, bundle});
        } else if (this.n) {
            this.h = bundle;
        }
    }

    public void D(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a7c6a4", new Object[]{this, fragmentAnimator});
        } else if (this.n) {
            this.f26383a = fragmentAnimator;
            sz0 sz0Var = this.b;
            if (sz0Var != null) {
                sz0Var.l(fragmentAnimator);
            }
            this.m = false;
        }
    }

    public void E(int i, Bundle bundle) {
        Bundle arguments;
        ResultRecord resultRecord;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570d6287", new Object[]{this, new Integer(i), bundle});
        } else if (this.n && (arguments = this.j.getArguments()) != null && arguments.containsKey(sdu.FRAGMENTATION_ARG_RESULT_RECORD) && (resultRecord = (ResultRecord) arguments.getParcelable(sdu.FRAGMENTATION_ARG_RESULT_RECORD)) != null) {
            resultRecord.resultCode = i;
            resultRecord.resultBundle = bundle;
        }
    }

    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
        } else if (this.n) {
            f().t(z);
        }
    }

    public final Animation c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("b33a2efc", new Object[]{this});
        }
        int i = this.d;
        if (i == Integer.MIN_VALUE) {
            sz0 sz0Var = this.b;
            if (sz0Var == null || sz0Var.b() == null) {
                return null;
            }
            return this.b.b();
        }
        try {
            return AnimationUtils.loadAnimation(this.k, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public FragmentAnimator d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("ce8bca08", new Object[]{this});
        }
        if (!this.n) {
            return null;
        }
        if (this.f26383a == null) {
            g();
        }
        return this.f26383a;
    }

    public final Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new Handler(Looper.getMainLooper());
        }
        return this.e;
    }

    public fjw f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjw) ipChange.ipc$dispatch("27bcb19a", new Object[]{this});
        }
        if (!this.n) {
            return null;
        }
        if (this.g == null) {
            this.g = new fjw(this.i);
        }
        return this.g;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f540938e", new Object[]{this});
        } else if (this.n) {
            if (this.l == null) {
                throw new RuntimeException("Fragment has not been attached to Activity!");
            } else if (this.f26383a == null) {
                FragmentAnimator onCreateFragmentAnimator = this.i.onCreateFragmentAnimator();
                this.f26383a = onCreateFragmentAnimator;
                if (onCreateFragmentAnimator == null) {
                    this.f26383a = this.l.getFragmentAnimator();
                }
            }
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acaff78", new Object[]{this})).booleanValue();
        }
        if (!this.n) {
            return false;
        }
        return f().k();
    }

    public void i(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
        } else if (this.n) {
            f().l(bundle);
            View view = this.j.getView();
            if (view != null) {
                view.setClickable(true);
                view.setImportantForAccessibility(2);
            }
        }
    }

    public void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        } else if (context instanceof wtd) {
            this.n = true;
            this.l = (wtd) context;
            this.k = (FragmentActivity) context;
        } else {
            this.n = false;
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void l(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else if (this.n) {
            f().m(bundle);
            Bundle arguments = this.j.getArguments();
            if (arguments != null) {
                this.f = arguments.getInt(sdu.FRAGMENTATION_ARG_CONTAINER);
                this.c = arguments.getInt(sdu.FRAGMENTATION_ARG_ROOT_STATUS, 0);
                this.d = arguments.getInt(sdu.FRAGMENTATION_ARG_CUSTOM_ENTER_ANIM, Integer.MIN_VALUE);
            }
            if (bundle == null) {
                g();
            } else {
                bundle.setClassLoader(pxq.class.getClassLoader());
                FragmentAnimator fragmentAnimator = (FragmentAnimator) bundle.getParcelable(sdu.FRAGMENTATION_STATE_SAVE_ANIMATOR);
                this.f26383a = fragmentAnimator;
                if (fragmentAnimator == null) {
                    g();
                }
                this.f = bundle.getInt(sdu.FRAGMENTATION_ARG_CONTAINER);
            }
            this.b = new sz0(this.k.getApplicationContext(), this.f26383a);
            Animation c = c();
            if (c != null) {
                c().setAnimationListener(new a(c));
            }
        }
    }

    public Animation m(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (!this.n) {
            return null;
        }
        if (this.l.getSupportDelegate().c) {
            if (i != 8194 || !z) {
                return this.b.d();
            }
            return this.b.e();
        } else if (i == 4097) {
            if (!z) {
                return this.b.g();
            }
            if (this.c == 1) {
                return this.b.d();
            }
            return this.b.b();
        } else if (i == 8194) {
            sz0 sz0Var = this.b;
            if (z) {
                return sz0Var.f();
            }
            return sz0Var.c();
        } else if (!z) {
            return this.b.a(this.j);
        } else {
            return null;
        }
    }

    public FragmentAnimator n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("c5eed56d", new Object[]{this});
        }
        if (!this.n) {
            return null;
        }
        return this.l.getFragmentAnimator();
    }

    public void o(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd116d5a", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else if (this.n) {
            this.l.getSupportDelegate().getClass();
            f().n();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        }
    }

    public void s(int i, int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c27981", new Object[]{this, new Integer(i), new Integer(i2), bundle});
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
        } else if (this.n) {
            f().o(z);
        }
    }

    public void u(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ef4a6a", new Object[]{this, bundle});
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (this.n) {
            f().p();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.n) {
            f().q();
        }
    }

    public void x(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else if (this.n) {
            f().r(bundle);
            bundle.putParcelable(sdu.FRAGMENTATION_STATE_SAVE_ANIMATOR, this.f26383a);
            bundle.putBoolean(sdu.FRAGMENTATION_STATE_SAVE_IS_HIDDEN, this.j.isHidden());
            bundle.putInt(sdu.FRAGMENTATION_ARG_CONTAINER, this.f);
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }
}
