package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.xob;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltb/noa;", "Ltb/xob;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class noa implements xob<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24861a;

    static {
        t2o.a(804257831);
        t2o.a(803209232);
    }

    public noa(Context context) {
        ckf.g(context, "context");
        this.f24861a = context;
    }

    /* renamed from: b */
    public moa a(cc4 cc4Var, mb4<Object> mb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (moa) ipChange.ipc$dispatch("2cee454a", new Object[]{this, cc4Var, mb4Var});
        }
        ckf.g(cc4Var, "info");
        ckf.g(mb4Var, "data");
        moa moaVar = new moa(this.f24861a);
        moaVar.f(cc4Var);
        moaVar.e(mb4Var);
        return moaVar;
    }

    @Override // tb.xob
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            xob.a.a(this);
        }
    }
}
