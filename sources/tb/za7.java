package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.goods.response.DelCollectsResponseData;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class za7 implements ljd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hs6 f32643a;
    public String b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements js6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qzo f32644a;
        public final /* synthetic */ String b;

        public a(za7 za7Var, qzo qzoVar, String str) {
            this.f32644a = qzoVar;
            this.b = str;
        }

        @Override // tb.js6
        public void a(tzo tzoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e11d11e", new Object[]{this, tzoVar});
                return;
            }
            String str = (String) this.f32644a.d("appName");
            if (tzoVar != null && tzoVar.c && uzo.c()) {
                zp3.n(this.b, str);
            }
        }
    }

    static {
        t2o.a(463470618);
        t2o.a(463470657);
    }

    public void b(String str) {
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
        hs6 hs6Var = this.f32643a;
        if (hs6Var != null) {
            return hs6Var;
        }
        String arrays = Arrays.toString(new String[]{this.b});
        qzo qzoVar = new qzo();
        qzoVar.h("mtop.taobao.mercury.delCollects");
        qzoVar.i("1.0");
        qzoVar.m(DelCollectsResponseData.class);
        qzoVar.j(true);
        qzoVar.k("itemIds", arrays).k("favType", 1);
        hs6 c = ls6.c(qzoVar, null, new a(this, qzoVar, arrays));
        this.f32643a = c;
        return c;
    }
}
