package tb;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xe8 implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String UNSUBSCRIBE = "unsubscribeMsg";
    public static final String UNSUBSCRIBE_ = "unsubscribe";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(336592960);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(336592959);
        t2o.a(144703491);
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        y7 a2;
        hr d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (!ckf.b(str, UNSUBSCRIBE) && !ckf.b(str, "unsubscribe")) {
            return new ErrorResult("501", (String) null, (Map) null, 6, (a07) null);
        }
        String w = MegaUtils.w(map, "action", null);
        if (w == null) {
            return new ErrorResult("400", "no action", (Map) null, 4, (a07) null);
        }
        Object userContext = kdbVar.getUserContext();
        if (!(userContext instanceof k8)) {
            userContext = null;
        }
        k8 k8Var = (k8) userContext;
        if (k8Var == null || (a2 = k8Var.a()) == null || (d = a2.d()) == null) {
            return new ErrorResult("400", "can not find ak engine", (Map) null, 4, (a07) null);
        }
        d.c(w);
        return new FinishResult(null, null, 3, null);
    }
}
