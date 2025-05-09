package tb;

import android.content.Context;
import com.alibaba.android.icart.core.data.config.CartRequestType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s7n extends cs1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean i = true;
    public final String g;
    public final boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends o3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ux b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s7n s7nVar, ux uxVar, ux uxVar2) {
            super(uxVar);
            this.b = uxVar2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/bizRequest/QueryCartRequester$1");
        }

        @Override // tb.o3o, tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            ux uxVar = this.b;
            if (uxVar != null) {
                uxVar.b(i, mtopResponse, obj, fsbVar, map);
            }
        }
    }

    static {
        t2o.a(479199312);
    }

    public s7n(zxb zxbVar, Context context, b3o b3oVar, String str) {
        super(zxbVar, context, b3oVar);
        boolean z;
        this.g = str;
        if (zxbVar.B().f() != null) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
    }

    public static /* synthetic */ Object ipc$super(s7n s7nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/bizRequest/QueryCartRequester");
    }

    @Override // tb.cs1
    public opq d(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opq) ipChange.ipc$dispatch("ae91335f", new Object[]{this, fsbVar});
        }
        w55 i2 = i();
        if (fsbVar == null) {
            return i2.i();
        }
        return i2.k(fsbVar);
    }

    @Override // tb.cs1
    public void g(ux uxVar, fsb fsbVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa576c99", new Object[]{this, uxVar, fsbVar, obj});
        } else {
            this.e.m().c(this.d, new a(this, uxVar, uxVar));
        }
    }

    public w55 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("9c8c26c0", new Object[]{this});
        }
        w55 e = e();
        e.t0(this.b.h());
        e.q(vav.a(c9x.CART_BIZ_NAME, na3.sEnableMtopStreamJsonForQuery, false));
        if (this.h) {
            e.y0(false);
        }
        j(e);
        return e;
    }

    public final void j(w55 w55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44d14ab", new Object[]{this, w55Var});
        } else if ("query".equals(this.g)) {
            if (i) {
                i = false;
                w55Var.e(na3.MTOP_TOPIC_FIRST_SCREEN_COLD_START_QUERY);
                return;
            }
            w55Var.e("other");
        } else if (CartRequestType.queryNextPage.equals(this.g)) {
            w55Var.e("other");
        }
    }
}
