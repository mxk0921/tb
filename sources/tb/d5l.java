package tb;

import android.content.Context;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.TaxDescFragment;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d5l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openTaxDesc";

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f17598a;
    public final ze7 b;

    static {
        t2o.a(912261920);
        t2o.a(912261826);
    }

    public d5l(Context context, ze7 ze7Var) {
        if (context instanceof FragmentActivity) {
            this.f17598a = (FragmentActivity) context;
        }
        this.b = ze7Var;
    }

    public List<Map<String, List<Pair<String, String>>>> b() {
        Vertical.b hk;
        List<Map<String, List<Pair<String, String>>>> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f0f307a", new Object[]{this});
        }
        Vertical vertical = (Vertical) this.b.e().f(Vertical.class);
        if (vertical == null || (hk = vertical.getHK()) == null || (c = hk.c()) == null || c.size() <= 0) {
            return null;
        }
        return c;
    }

    public String c() {
        Vertical.b hk;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        Vertical vertical = (Vertical) this.b.e().f(Vertical.class);
        if (vertical == null || (hk = vertical.getHK()) == null) {
            return "税费说明";
        }
        return hk.d();
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        List<Map<String, List<Pair<String, String>>>> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (b = b()) == null || b.isEmpty()) {
            return false;
        }
        try {
            TaxDescFragment.M2(this.f17598a, c(), b());
        } catch (Exception unused) {
        }
        UtUtils.e(EVENT_TYPE, this.b);
        return true;
    }
}
