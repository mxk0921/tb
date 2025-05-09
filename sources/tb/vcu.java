package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vcu extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRADEONSTAGE = "-4231265500675731027";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(614465655);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public vcu build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vcu) ipChange.ipc$dispatch("177589f4", new Object[]{this, obj});
            }
            return new vcu();
        }
    }

    static {
        t2o.a(614465654);
    }

    public static /* synthetic */ Object ipc$super(vcu vcuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/ability/TradeOnStageAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (k8Var == null || k8Var.d() == null) {
            return new b8(new a8(-1, "context is null"));
        }
        JSONObject h = n8Var.h();
        if (h == null) {
            return new b8(new a8(-2, "params is null"));
        }
        if (!(h.get(v4s.PARAM_UPLOAD_STAGE) instanceof String) || !(h.get("bizType") instanceof String)) {
            return new b8(new a8(-3, "data is wrong"));
        }
        h.put("context", (Object) k8Var.d());
        qbv.j().a((String) h.get(v4s.PARAM_UPLOAD_STAGE), (String) h.get("bizType"), h);
        return new f8();
    }
}
