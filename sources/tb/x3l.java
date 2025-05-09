package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.SizingChartFloatFragment;
import com.taobao.android.detail.ttdetail.utils.UtUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x3l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openInterSizingChart";

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f31116a;
    public final ze7 b;

    static {
        t2o.a(912261901);
        t2o.a(912261826);
    }

    public x3l(Context context, ze7 ze7Var) {
        if (context instanceof FragmentActivity) {
            this.f31116a = (FragmentActivity) context;
        }
        this.b = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        Vertical vertical;
        Vertical.b hk;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || irVar.a() == null || (vertical = (Vertical) this.b.e().f(Vertical.class)) == null || (hk = vertical.getHK()) == null) {
            return false;
        }
        String b = hk.b();
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        try {
            SizingChartFloatFragment.E2(this.f31116a, "国际尺码对照表", b);
        } catch (Exception e) {
            tgh.c("OpenInterSizingChartImplementor", "execute error", e);
        }
        UtUtils.e(EVENT_TYPE, this.b);
        return true;
    }
}
