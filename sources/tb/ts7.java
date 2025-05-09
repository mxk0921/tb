package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ts7 implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "donate";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f28927a;

    static {
        t2o.a(912261881);
        t2o.a(912261826);
    }

    public ts7(Context context, ze7 ze7Var) {
        this.f28927a = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        this.f28927a.b().h(OpenSkuImplementor.h("BUYNOW", null), runtimeAbilityParamArr);
        return true;
    }
}
