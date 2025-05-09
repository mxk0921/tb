package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.goods.response.DelCollectsResponseData;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ya7 implements ljd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hs6 f31932a;
    public String[] b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements js6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qzo f31933a;
        public final /* synthetic */ String b;

        public a(ya7 ya7Var, qzo qzoVar, String str) {
            this.f31933a = qzoVar;
            this.b = str;
        }

        @Override // tb.js6
        public void a(tzo tzoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e11d11e", new Object[]{this, tzoVar});
                return;
            }
            String str = (String) this.f31933a.d("appName");
            if (tzoVar != null && tzoVar.c && uzo.c()) {
                zp3.n(this.b, str);
            }
        }
    }

    static {
        t2o.a(463470616);
        t2o.a(463470657);
    }

    public void b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24208a8", new Object[]{this, strArr});
        } else {
            this.b = strArr;
        }
    }

    @Override // tb.ljd
    public hs6 a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("11f65278", new Object[]{this});
        }
        hs6 hs6Var = this.f31932a;
        if (hs6Var != null) {
            return hs6Var;
        }
        String[] strArr = this.b;
        if (strArr == null || strArr.length <= 0) {
            str = "";
        } else {
            str = Arrays.toString(strArr);
        }
        qzo qzoVar = new qzo();
        qzoVar.h("mtop.taobao.mercury.delCollects");
        qzoVar.i("1.0");
        qzoVar.m(DelCollectsResponseData.class);
        qzoVar.j(true);
        qzoVar.k("itemIds", str).k("favType", 1L);
        hs6 c = ls6.c(qzoVar, null, new a(this, qzoVar, str));
        this.f31932a = c;
        return c;
    }
}
