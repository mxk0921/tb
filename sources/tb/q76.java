package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q76 extends o4r<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_PARTIAL_UPDATE = "-3922734880382485599";

    static {
        t2o.a(786432060);
    }

    public static /* synthetic */ Object ipc$super(q76 q76Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/DXPartialUpdateTemplateAbility");
    }

    /* renamed from: l */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        DXRuntimeContext p = tk6Var.p();
        if (p == null) {
            return i("runtimeContext为空", true);
        }
        DXWidgetNode W = p.W();
        if (W == null) {
            return i("rootWidget为空", true);
        }
        DXWidgetNode queryWidgetNodeByUserId = W.queryWidgetNodeByUserId(n8Var.i("userId"));
        if (queryWidgetNodeByUserId == null) {
            queryWidgetNodeByUserId = tk6Var.q();
        }
        if (queryWidgetNodeByUserId == null) {
            return i("查找当前widget为空", true);
        }
        if ("layout".equals(n8Var.i("type"))) {
            queryWidgetNodeByUserId.setNeedLayout(true);
        } else {
            queryWidgetNodeByUserId.setNeedParse(true);
        }
        return new f8();
    }
}
