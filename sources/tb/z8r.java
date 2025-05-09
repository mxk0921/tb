package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z8r extends gn0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f32604a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends k17 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -34816638) {
                return super.e((Activity) objArr[0]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/config/TBBuyPageStatusConfig$1");
        }

        @Override // tb.k17
        public ViewGroup e(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("fdecbd82", new Object[]{this, activity});
            }
            ViewGroup viewGroup = (ViewGroup) z8r.e(z8r.this).findViewById(R.id.purchase_loading);
            if (viewGroup != null) {
                return viewGroup;
            }
            return super.e(activity);
        }
    }

    static {
        t2o.a(708837456);
    }

    public z8r(Activity activity) {
        this.f32604a = activity;
    }

    public static /* synthetic */ Activity e(z8r z8rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1db5d73d", new Object[]{z8rVar});
        }
        return z8rVar.f32604a;
    }

    public static /* synthetic */ Object ipc$super(z8r z8rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/config/TBBuyPageStatusConfig");
    }

    @Override // tb.gn0
    public h7d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h7d) ipChange.ipc$dispatch("becba628", new Object[]{this});
        }
        return new a();
    }
}
