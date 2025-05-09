package tb;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Map;
import tb.ct1;
import tb.n8v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class zxb extends ct1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(boolean z);

        void b(boolean z);
    }

    static {
        t2o.a(479199245);
    }

    public zxb(fdd fddVar) {
        super(fddVar);
    }

    public static /* synthetic */ Object ipc$super(zxb zxbVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/IDataManager");
    }

    public abstract String A();

    public abstract DataBizContext B();

    public abstract boolean C(String str);

    public abstract List<IDMComponent> D();

    public abstract et6 E();

    public abstract boolean F();

    public abstract boolean G();

    public abstract void H();

    public abstract boolean I();

    public abstract boolean J();

    public abstract boolean K();

    public abstract boolean L();

    public abstract void M();

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public abstract void O(ct1.a aVar);

    public abstract void P(ct1.b bVar);

    public abstract void Q(IDMComponent iDMComponent);

    public abstract void R(ux uxVar);

    public abstract void S(RequestConfig requestConfig, ux uxVar);

    public abstract void T(Map<String, List<IDMComponent>> map);

    public abstract void U(String str);

    public abstract void V(String str);

    public abstract void W(String str);

    public abstract void X(boolean z);

    public abstract void Y(String str);

    public abstract void o(a aVar);

    public abstract void p(IDMComponent iDMComponent, boolean z);

    public abstract void q(ux uxVar);

    public abstract void r();

    public abstract void s();

    public abstract boolean t();

    public abstract IDMComponent u(String str);

    public abstract void v(n8v.c<byte[]> cVar);

    public abstract CartGlobal w();

    public abstract kmb x();

    public abstract String y();

    public abstract String z();
}
