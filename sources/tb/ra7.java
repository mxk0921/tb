package tb;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ze;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ra7 extends ze implements cod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a f;
    public i8x g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends hfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean b = false;
        public MotionEvent c = null;

        static {
            t2o.a(502268075);
        }

        public a(cae caeVar) {
            super(caeVar);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -97261413) {
                super.g((cae) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/ndadapter/DelegateSecondPageAdapterForND$NDNewViewPagerFeature");
        }

        @Override // tb.hfw
        public boolean d(View view, boolean z, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
            }
            if (!(view instanceof ied) || !((ied) view).canPullIntercept(ied.PULL_HORIZONTAL_DRAG)) {
                return a(view, z, i, i2, i3);
            }
            this.b = true;
            return true;
        }

        @Override // tb.hfw
        public boolean f(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.b = false;
            }
            boolean c = c(motionEvent);
            if (motionEvent == this.c) {
                return true;
            }
            if (!c && this.b && !a(e(), false, 0, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                b(obtain);
                obtain.recycle();
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                this.c = obtain2;
                obtain2.setAction(0);
                b(this.c);
                this.c.recycle();
                this.c = null;
            }
            return c;
        }

        @Override // tb.hfw
        public void g(cae caeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa33e89b", new Object[]{this, caeVar});
            } else if (caeVar != this.f20613a) {
                super.g(caeVar);
                this.b = false;
                this.c = null;
            }
        }
    }

    static {
        t2o.a(502268074);
        t2o.a(502268078);
    }

    public ra7(Context context) {
        super(context);
        tfs.e("DelegateSecondPageAdapterForND", "construct context:" + context + " ;;; " + this);
    }

    public static /* synthetic */ Object ipc$super(ra7 ra7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/ndadapter/DelegateSecondPageAdapterForND");
    }

    @Override // tb.ze
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4555c8c", new Object[]{this});
        }
        tfs.e("DelegateSecondPageAdapterForND", "createRootView context:" + this.f32701a + " ;;; " + this);
        return p().f(this.f32701a);
    }

    @Override // tb.ze
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            p().g();
        }
    }

    @Override // tb.cod
    public void back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58bdee", new Object[]{this});
            return;
        }
        ze.a aVar = this.e;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // tb.ze
    public hfw e(cae caeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hfw) ipChange.ipc$dispatch("7d541734", new Object[]{this, caeVar});
        }
        if (this.f == null) {
            this.f = new a(caeVar);
        }
        this.f.g(caeVar);
        return this.f;
    }

    @Override // tb.ze
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            p().h();
        }
    }

    @Override // tb.ze
    public void h(Uri uri, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6c487a", new Object[]{this, uri, view});
            return;
        }
        tfs.e("DelegateSecondPageAdapterForND", "renderContentView context:" + this.f32701a + ";;; rootView:" + view + " ;;; " + this);
        p().i(uri, null);
    }

    @Override // tb.ze
    public void i(Uri uri, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7955735", new Object[]{this, uri, view});
        } else {
            p().e();
        }
    }

    @Override // tb.ze
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            p().j();
        }
    }

    public final i8x p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i8x) ipChange.ipc$dispatch("7e0e3ea7", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new i8x(this);
        }
        return this.g;
    }
}
