package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.goods.response.AddCollectResponseData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class re0 implements ljd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hs6 f27310a;
    public String b;
    public String c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements js6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qzo f27311a;

        public a(qzo qzoVar) {
            this.f27311a = qzoVar;
        }

        @Override // tb.js6
        public void a(tzo tzoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e11d11e", new Object[]{this, tzoVar});
            } else if (tzoVar != null && uzo.c()) {
                String str = (String) this.f27311a.d("appName");
                if (tzoVar.c) {
                    zp3.k(re0.b(re0.this), str);
                } else if ("ALREADY_COLLECT".equals(tzoVar.f29047a)) {
                    zp3.k(re0.b(re0.this), str);
                }
            }
        }
    }

    static {
        t2o.a(463470611);
        t2o.a(463470657);
    }

    public static /* synthetic */ String b(re0 re0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d869e303", new Object[]{re0Var});
        }
        return re0Var.b;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ff5431", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tb.ljd
    public hs6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("11f65278", new Object[]{this});
        }
        hs6 hs6Var = this.f27310a;
        if (hs6Var != null) {
            return hs6Var;
        }
        qzo qzoVar = new qzo();
        qzoVar.h("mtop.taobao.mercury.addCollect");
        qzoVar.i("1.0");
        qzoVar.m(AddCollectResponseData.class);
        qzoVar.j(true);
        qzoVar.k("itemId", this.b).k("extendMap", this.c);
        hs6 c = ls6.c(qzoVar, null, new a(qzoVar));
        this.f27310a = c;
        return c;
    }
}
