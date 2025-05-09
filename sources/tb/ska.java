package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ska {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c;
    public long d;
    public List<IDMComponent> e;
    public final HashSet<IDMComponent> b = new HashSet<>();

    /* renamed from: a  reason: collision with root package name */
    public uka f28113a = new uka("B&C", Localization.q(R.string.taobao_app_1028_1_21680), 0);

    static {
        t2o.a(479199458);
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc24467", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null) {
            this.b.add(iDMComponent);
        }
    }

    public uka d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uka) ipChange.ipc$dispatch("af0f8c25", new Object[]{this});
        }
        return this.f28113a;
    }

    public List<IDMComponent> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ac041d01", new Object[]{this});
        }
        return this.e;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9453dfb", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public HashSet<IDMComponent> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("f49ee815", new Object[]{this});
        }
        return this.b;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f460c5c", new Object[]{this});
        }
        if (vav.a(c9x.CART_BIZ_NAME, "enableTotalPriceDecimal", true)) {
            BigDecimal valueOf = BigDecimal.valueOf(this.d / c());
            return b() + valueOf.setScale(2, 4).doubleValue();
        }
        return b() + String.format("%1$.2f", Double.valueOf(this.d / c()));
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62390efe", new Object[]{this, new Boolean(z)});
        }
    }

    public void k(uka ukaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126a3f79", new Object[]{this, ukaVar});
        } else {
            this.f28113a = ukaVar;
        }
    }

    public void l(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b178383", new Object[]{this, list});
        } else {
            this.e = list;
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12395c6f", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acbf1516", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5002265a", new Object[]{this});
        }
        List<IDMComponent> list = this.e;
        if (list == null || list.isEmpty()) {
            return "￥";
        }
        String str = (String) cb4.x(this.e.get(0), String.class, "pay", "currencySymbol");
        return TextUtils.isEmpty(str) ? "￥" : str;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4a72054", new Object[]{this})).intValue();
        }
        List<IDMComponent> list = this.e;
        if (list == null || list.isEmpty()) {
            return 100;
        }
        Integer num = (Integer) cb4.x(this.e.get(0), Integer.class, "pay", "currencyUnitFactor");
        if (num == null || num.intValue() == 0) {
            num = 100;
        }
        return num.intValue();
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e222e660", new Object[]{this});
        }
        if (this.b.size() == 1) {
            IDMComponent next = this.b.iterator().next();
            String str = (String) cb4.x(next, String.class, "shopName");
            return TextUtils.isEmpty(str) ? (String) cb4.x(next, String.class, "title") : str;
        }
        uka ukaVar = this.f28113a;
        if (ukaVar == null) {
            return "";
        }
        return ukaVar.b();
    }
}
