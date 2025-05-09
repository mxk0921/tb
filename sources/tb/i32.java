package tb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class i32 extends cz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View d;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i32.this.a();
            }
        }
    }

    static {
        t2o.a(916455583);
    }

    public static /* synthetic */ Object ipc$super(i32 i32Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.a();
            return null;
        } else if (hashCode == 1300596012) {
            super.i((qpu) objArr[0], (cgm) objArr[1], (d1a) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/turbo/service/pop/BaseViewPop");
        }
    }

    @Override // tb.cz1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        super.a();
        View view = this.d;
        if (view == null) {
            ckf.y("contentView");
            throw null;
        } else if (view.getParent() != null) {
            View view2 = this.d;
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                if (parent != null) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    View view3 = this.d;
                    if (view3 != null) {
                        viewGroup.removeView(view3);
                        g();
                        b().invoke();
                        return;
                    }
                    ckf.y("contentView");
                    throw null;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ckf.y("contentView");
            throw null;
        }
    }

    @Override // tb.cz1
    public void i(qpu qpuVar, cgm cgmVar, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85852c", new Object[]{this, qpuVar, cgmVar, d1aVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ckf.g(cgmVar, "msg");
        ckf.g(d1aVar, "dismissCallback");
        super.i(qpuVar, cgmVar, d1aVar);
        this.d = f(qpuVar.getContext(), cgmVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = e();
        layoutParams.gravity = 1;
        ViewGroup i0 = ((vad) qpuVar.getService(vad.class)).i0();
        View view = this.d;
        if (view != null) {
            i0.addView(view, layoutParams);
            h();
            zrt.Companion.d(new a(), cgmVar.a());
            return;
        }
        ckf.y("contentView");
        throw null;
    }
}
