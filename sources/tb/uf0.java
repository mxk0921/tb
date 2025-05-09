package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uf0 extends cs1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IDMComponent g;
    public final zxb h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends o3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ux b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ux uxVar, ux uxVar2) {
            super(uxVar);
            this.b = uxVar2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/bizRequest/AdjustCartRequester$1");
        }

        @Override // tb.o3o, tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                uf0.i(uf0.this, i, mtopResponse, obj, fsbVar, map, this.b);
            }
        }
    }

    static {
        t2o.a(479199301);
    }

    public uf0(zxb zxbVar, Context context, b3o b3oVar) {
        super(zxbVar, context, b3oVar);
        this.h = zxbVar;
    }

    public static /* synthetic */ void i(uf0 uf0Var, int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map map, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d35d73b", new Object[]{uf0Var, new Integer(i), mtopResponse, obj, fsbVar, map, uxVar});
        } else {
            uf0Var.m(i, mtopResponse, obj, fsbVar, map, uxVar);
        }
    }

    public static /* synthetic */ Object ipc$super(uf0 uf0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/bizRequest/AdjustCartRequester");
    }

    public static void k(w55 w55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44d14ab", new Object[]{w55Var});
            return;
        }
        int e = CheckHoldManager.i().e();
        if (e == 1 || e == 5 || e == 10 || e == 20 || e == 300) {
            w55Var.e(na3.MTOP_TOPIC_UPDATE_PREFIX + e);
        }
    }

    @Override // tb.cs1
    public opq d(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opq) ipChange.ipc$dispatch("ae91335f", new Object[]{this, fsbVar});
        }
        w55 j = j();
        k(j);
        j.q(vav.b(c9x.CART_BIZ_NAME, na3.sEnableMtopStreamJsonForAdjust, false, true));
        return j.j(this.g, fsbVar);
    }

    @Override // tb.cs1
    public void g(ux uxVar, fsb fsbVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa576c99", new Object[]{this, uxVar, fsbVar, obj});
        } else if (this.g != null) {
            this.h.x().m().b(this.d, obj, new a(uxVar, uxVar));
        } else {
            throw new IllegalStateException("we find you not call setTrigger() method first before you call AdjustCartRequester's sendRequest() method");
        }
    }

    public w55 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("9c8c26c0", new Object[]{this});
        }
        return e();
    }

    public void l(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7fbef7", new Object[]{this, iDMComponent});
        } else {
            this.g = iDMComponent;
        }
    }

    public final void m(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ? extends Object> map, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a29346", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map, uxVar});
            return;
        }
        if (sca.s(this.h) == 0) {
            this.h.W("");
        }
        if (uxVar != null) {
            uxVar.b(i, mtopResponse, obj, fsbVar, map);
        }
    }
}
