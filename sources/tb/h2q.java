package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h2q implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "change_sku_frame";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f20378a;

    static {
        t2o.a(912261946);
        t2o.a(912261826);
    }

    public h2q(Context context, ze7 ze7Var) {
        this.f20378a = ze7Var;
    }

    public final String b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d83396ef", new Object[]{this, objArr});
        }
        if (objArr != null && objArr.length >= 1) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        String b = b(e28.e(runtimeAbilityParamArr));
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        this.f20378a.i().f("propPath", r3q.o((String) this.f20378a.i().c("propPath"), b));
        return true;
    }
}
