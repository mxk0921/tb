package tb;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.huoyan.ui.KaDialogFragment;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ut1 implements hvm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hvm f29593a;
    public WeakReference<Fragment> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements eic {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ KaDialogFragment f29594a;

        public a(KaDialogFragment kaDialogFragment) {
            this.f29594a = kaDialogFragment;
        }

        @Override // tb.eic
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else {
                ut1.this.startPreview();
            }
        }

        @Override // tb.eic
        public void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                return;
            }
            try {
                if (ut1.a(ut1.this) != null) {
                    if (ut1.a(ut1.this).get() != this.f29594a) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            ut1.this.startPreview();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f29595a;
        public final /* synthetic */ String b;
        public final /* synthetic */ KaDialogFragment c;
        public final /* synthetic */ eic d;

        public b(FragmentActivity fragmentActivity, String str, KaDialogFragment kaDialogFragment, eic eicVar) {
            this.f29595a = fragmentActivity;
            this.b = str;
            this.c = kaDialogFragment;
            this.d = eicVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FragmentActivity fragmentActivity = this.f29595a;
            if (fragmentActivity != null) {
                ut1.this.c(fragmentActivity, this.b);
                ut1.this.stopPreview();
                ut1.b(ut1.this, new WeakReference(this.c));
                this.c.r2(this.d);
                this.c.show(this.f29595a.getSupportFragmentManager(), this.b);
            }
        }
    }

    static {
        t2o.a(760217634);
        t2o.a(760217732);
    }

    public ut1(hvm hvmVar) {
        this.f29593a = hvmVar;
    }

    public static /* synthetic */ WeakReference a(ut1 ut1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("8a2394a6", new Object[]{ut1Var});
        }
        return ut1Var.b;
    }

    public static /* synthetic */ WeakReference b(ut1 ut1Var, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("b3723352", new Object[]{ut1Var, weakReference});
        }
        ut1Var.b = weakReference;
        return weakReference;
    }

    public void c(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159293ac", new Object[]{this, fragmentActivity, str});
        } else if (fragmentActivity != null && str != null) {
            FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
            Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
            if (findFragmentByTag != null) {
                "#####find dialog".concat(str);
                beginTransaction.remove(findFragmentByTag);
                beginTransaction.commitAllowingStateLoss();
            }
        }
    }

    public void d(FragmentActivity fragmentActivity, KaDialogFragment kaDialogFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3980f7f1", new Object[]{this, fragmentActivity, kaDialogFragment, str});
        } else {
            e(fragmentActivity, kaDialogFragment, str, new a(kaDialogFragment));
        }
    }

    public void e(FragmentActivity fragmentActivity, KaDialogFragment kaDialogFragment, String str, eic eicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c8af9b", new Object[]{this, fragmentActivity, kaDialogFragment, str, eicVar});
        } else if (fragmentActivity != null && kaDialogFragment != null) {
            fragmentActivity.runOnUiThread(new b(fragmentActivity, str, kaDialogFragment, eicVar));
        }
    }

    @Override // tb.hvm
    public void startPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
            return;
        }
        hvm hvmVar = this.f29593a;
        if (hvmVar != null) {
            hvmVar.startPreview();
        }
    }

    @Override // tb.hvm
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
            return;
        }
        hvm hvmVar = this.f29593a;
        if (hvmVar != null) {
            hvmVar.stopPreview();
        }
    }
}
