package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/nfr;", "Ltb/hgr;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "detail-industry_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nfr extends hgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ofr i = new ofr(this);

    static {
        t2o.a(440401988);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfr(Context context) {
        super(context);
        ckf.g(context, "context");
        b().e("deliveryError", new rb7(context));
        a().b("error", new e6z(this));
    }

    public static /* synthetic */ Object ipc$super(nfr nfrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/hourlydelivery/TBIDeliveryContext");
    }

    @Override // tb.jfr
    public kfr<xfr> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kfr) ipChange.ipc$dispatch("aa2b961b", new Object[]{this});
        }
        return this.i;
    }
}
