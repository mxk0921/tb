package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.ability.MTOPRequestMethod;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class f4j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f4j INSTANCE = new f4j();

    static {
        t2o.a(1007681594);
    }

    public static final xhv f(Map map, MTOPRequestMethod mTOPRequestMethod, boolean z, String str, final q4j q4jVar, fth fthVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b755bc8e", new Object[]{map, mTOPRequestMethod, new Boolean(z), str, q4jVar, fthVar});
        }
        ckf.g(fthVar, "$this$requestData");
        fthVar.x(map);
        fthVar.A(mTOPRequestMethod);
        fthVar.B(z);
        if (str != null) {
            fthVar.G(str);
        }
        fthVar.E(new g1a() { // from class: tb.c4j
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv g;
                g = f4j.g(q4j.this, (eth) obj);
                return g;
            }
        });
        fthVar.D(new g1a() { // from class: tb.d4j
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv h;
                h = f4j.h(q4j.this, (eth) obj);
                return h;
            }
        });
        fthVar.C(new g1a() { // from class: tb.e4j
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv i;
                i = f4j.i(q4j.this, (bi8) obj);
                return i;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv g(q4j q4jVar, eth ethVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3ce76677", new Object[]{q4jVar, ethVar});
        }
        ckf.g(ethVar, "result");
        if (q4jVar != null) {
            q4jVar.c(ethVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv h(q4j q4jVar, eth ethVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("5920b9d6", new Object[]{q4jVar, ethVar});
        }
        ckf.g(ethVar, "result");
        if (q4jVar != null) {
            q4jVar.b(ethVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv i(q4j q4jVar, bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c24c5e7d", new Object[]{q4jVar, bi8Var});
        }
        ckf.g(bi8Var, "result");
        if (q4jVar != null) {
            q4jVar.a(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public final void e(String str, String str2, final MTOPRequestMethod mTOPRequestMethod, final boolean z, final String str3, final Map<String, ? extends Object> map, final q4j q4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad54c80", new Object[]{this, str, str2, mTOPRequestMethod, new Boolean(z), str3, map, q4jVar});
            return;
        }
        ckf.g(str, "api");
        ckf.g(str2, "v");
        ckf.g(mTOPRequestMethod, "method");
        ath.INSTANCE.d(str, str2, new g1a() { // from class: tb.b4j
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv f;
                boolean z2 = z;
                String str4 = str3;
                f = f4j.f(map, mTOPRequestMethod, z2, str4, q4jVar, (fth) obj);
                return f;
            }
        });
    }
}
