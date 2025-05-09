package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.render.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r2m extends ksa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894444);
    }

    public r2m(whp whpVar) {
        super(whpVar);
    }

    public static /* synthetic */ Object ipc$super(r2m r2mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/interceptor/PicShareHandlerInterceptor");
    }

    @Override // tb.ksa
    public void b(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0736b2", new Object[]{this, context, ma4Var, new Integer(i), bVar});
            return;
        }
        this.f22885a.b.h = ma4Var;
        gj8.a(ma4Var.b(), "picture");
    }

    @Override // tb.ksa
    public boolean c(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d18e050", new Object[]{this, context, ma4Var, new Integer(i), bVar})).booleanValue();
        }
        if (!(ma4Var instanceof mi3)) {
            return false;
        }
        mi3 mi3Var = (mi3) ma4Var;
        if (mi3Var.g().l() || !mi3Var.f) {
            return false;
        }
        return true;
    }
}
