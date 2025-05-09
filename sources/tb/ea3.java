package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ea3 extends sn2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final z9e CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements z9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z9e
        public sz a(ViewEngine viewEngine) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sz) ipChange.ipc$dispatch("345e20e7", new Object[]{this, viewEngine});
            }
            return new ea3(viewEngine);
        }
    }

    static {
        t2o.a(479199622);
    }

    public ea3(ViewEngine viewEngine) {
        super(viewEngine);
    }

    public static /* synthetic */ Object ipc$super(ea3 ea3Var, String str, Object... objArr) {
        if (str.hashCode() == 345067400) {
            return super.e((ViewGroup) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/widget/CartBundleLineViewHolder");
    }

    @Override // tb.sn2, tb.sz
    public View e(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14914f88", new Object[]{this, viewGroup});
        }
        View e = super.e(viewGroup);
        ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
        if (layoutParams != null) {
            if (m9v.d(c9x.CART_BIZ_NAME).h("isShot2024ItemV2Gray", false)) {
                layoutParams.height = pb6.f(this.f28365a.K(), 8.0f);
            } else {
                layoutParams.height = pb6.f(this.f28365a.K(), 9.0f);
            }
        }
        return e;
    }
}
