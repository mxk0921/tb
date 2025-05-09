package tb;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.data.BaseMmAdModel;
import com.taobao.mmad.linkage.pop.big.BootImageBigPopView;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ja2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BootImageBigPopView f21859a;
    public final nwi b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements p4q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efc72903", new Object[]{this});
                return;
            }
            jgh.a("BigPopManager", "showBigPopLottie onEnd:");
            ja2.a(ja2.this).c().e(2001);
            try {
                ((FrameLayout) ja2.a(ja2.this).b().b().getParent()).removeView(ja2.b(ja2.this));
                ja2.c(ja2.this, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static {
        t2o.a(573571147);
    }

    public ja2(nwi nwiVar) {
        this.b = nwiVar;
    }

    public static /* synthetic */ nwi a(ja2 ja2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwi) ipChange.ipc$dispatch("b1f3543c", new Object[]{ja2Var});
        }
        return ja2Var.b;
    }

    public static /* synthetic */ BootImageBigPopView b(ja2 ja2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageBigPopView) ipChange.ipc$dispatch("88548bdf", new Object[]{ja2Var});
        }
        return ja2Var.f21859a;
    }

    public static /* synthetic */ BootImageBigPopView c(ja2 ja2Var, BootImageBigPopView bootImageBigPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageBigPopView) ipChange.ipc$dispatch("5e9fe619", new Object[]{ja2Var, bootImageBigPopView});
        }
        ja2Var.f21859a = bootImageBigPopView;
        return bootImageBigPopView;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c942acf8", new Object[]{this})).booleanValue();
        }
        BootImageBigPopView bootImageBigPopView = this.f21859a;
        if (bootImageBigPopView == null || bootImageBigPopView.isShowing()) {
            return false;
        }
        return true;
    }

    public void e() {
        BaseMmAdModel a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f10ad9f", new Object[]{this});
            return;
        }
        nwi nwiVar = this.b;
        if (nwiVar != null && (a2 = nwiVar.d().a()) != null && TextUtils.equals(a2.getDataType(), rr6.TYPE_POPVIEW) && "1".equals(a2.animationType) && !TextUtils.isEmpty(a2.animationLottie)) {
            File b = rf9.b(nwi.BIZ_CODE, a2.animationLottie);
            if (b == null || !b.exists()) {
                ecj.f(this.b, "lottie_file_not_exists", 12);
            } else if (!lf4.c()) {
                nwi nwiVar2 = this.b;
                ecj.f(nwiVar2, "enableBigPop:" + lf4.c(), 13);
            } else {
                jgh.a("BigPopManager", "lottie_start_preload");
                try {
                    BootImageBigPopView bootImageBigPopView = new BootImageBigPopView(Globals.getApplication(), this.b);
                    this.f21859a = bootImageBigPopView;
                    bootImageBigPopView.setVisibility(8);
                    this.f21859a.preload(b);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (this.f21859a.show(new a())) {
            this.b.b().d();
            if (this.b.b().a() != null) {
                this.b.b().a().setVisibility(8);
            }
            this.b.b().b().animate().alpha(0.0f).setDuration(80L).start();
            ((FrameLayout) this.b.b().b().getParent()).addView(this.f21859a);
        } else {
            jgh.a("BigPopManager", "not show BigPopLottie onEnd");
            this.b.c().e(2001);
        }
    }
}
