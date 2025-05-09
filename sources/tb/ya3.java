package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ya3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EVENT_DATA_RESPONSE = "mtopResponse";
    public static final String KEY_EVENT_DOWNGRADE_TYPE = "downgradeType";
    public static final String TYPE_OLD_CART_DOWNGRADE = "oldCartDowngrade";
    public static final String TYPE_PROTOCOL_DOWNGRADE = "protocolDowngrade";
    public static final String TYPE_RENDER_ERROR_DOWNGRADE = "renderErrorDowngrade";

    static {
        t2o.a(479199358);
    }

    public void c(fdd fddVar, MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a1592", new Object[]{this, fddVar, mtopResponse, str});
        } else if (fddVar != null) {
            lcu d = fddVar.g().d();
            d.m("mtopResponse", mtopResponse);
            d.m("downgradeType", str);
            d.l("downgrade");
            fddVar.g().h(d);
            a(str);
        }
    }

    public void d(fdd fddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a17e9c", new Object[]{this, fddVar});
        } else if (fddVar != null) {
            lcu d = fddVar.g().d();
            d.l("undowngrade");
            fddVar.g().h(d);
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d9e4f5", new Object[]{this, str});
            return;
        }
        if (TYPE_OLD_CART_DOWNGRADE.equals(str)) {
            ub3.e(ub3.a.a("DegradeH5").message("非iCart降级").branch(1).sampling(1.0f));
        } else {
            ub3.e(ub3.a.a("DegradeH5").message("老奥创协议降级").branch(2).sampling(1.0f));
        }
        ub3.e(ub3.a.a("DegradeH5").message("购物车降级H5").branchEntry(true).sampling(1.0f));
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("340351d4", new Object[]{this, str})).booleanValue();
        }
        try {
            float parseFloat = Float.parseFloat(str);
            fdv.e("CartDowngradeManager", "downgrade", "needDowngrade", parseFloat + "");
            return parseFloat < 3.0f;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
