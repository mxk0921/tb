package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXViewPager;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ym6 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEWPAGERCHANGEINDEX = "-8963138421018785284";

    static {
        t2o.a(786432092);
    }

    public static /* synthetic */ Object ipc$super(ym6 ym6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/viewpager/DXViewPagerChangeIndexAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        DXRuntimeContext p = tk6Var.p();
        if (p == null) {
            return new b8(new a8(f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER, "rootViewContext为空"), true);
        }
        DXWidgetNode W = p.W();
        if (W == null) {
            return new b8(new a8(f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER, "rootWidget为空"), true);
        }
        String i = n8Var.i("viewPagerUserId");
        if (TextUtils.isEmpty(i)) {
            return new b8(new a8(f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER, "userId为空"), true);
        }
        DXWidgetNode queryWidgetNodeByUserId = W.queryWidgetNodeByUserId(i);
        if (!(queryWidgetNodeByUserId instanceof DXViewPager)) {
            return new b8(new a8(f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER, "查找tabheader出错"), true);
        }
        int d = vwf.d(n8Var.h(), "index", -1);
        if (d < 0) {
            return new b8(new a8(f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER, "index 值出错"), true);
        }
        ((DXViewPager) queryWidgetNodeByUserId).c0(d, vwf.b(n8Var.h(), "animated", true));
        return new f8();
    }
}
