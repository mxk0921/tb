package tb;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ze8 implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_GET = "get";
    public static final String API_REMOVE = "remove";
    public static final String API_SET = "set";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(336592962);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(336592961);
        t2o.a(144703491);
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        y7 y7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        ldb l = kdbVar.l();
        if (!(l instanceof zq)) {
            l = null;
        }
        zq zqVar = (zq) l;
        if (zqVar == null || (y7Var = (y7) zqVar.f()) == null) {
            return new ErrorResult("400", "NoAkEngine", (Map) null, 4, (a07) null);
        }
        String w = MegaUtils.w(map, "key", null);
        if (w == null) {
            return new ErrorResult("400", "NoKey", (Map) null, 4, (a07) null);
        }
        int hashCode = str.hashCode();
        if (hashCode != -934610812) {
            if (hashCode != 102230) {
                if (hashCode == 113762 && str.equals("set")) {
                    Object obj = map.get("value");
                    if (h4g.c(w, y7Var.e(), obj)) {
                        return new FinishResult(null, null, 3, null);
                    }
                    return new ErrorResult("KeyPathSetFail", "Please check input: key=" + w + ", value=" + obj, (Map) null, 4, (a07) null);
                }
            } else if (str.equals("get")) {
                JSONObject jSONObject = new JSONObject(1);
                jSONObject.put("result", y7Var.e().get(w));
                xhv xhvVar = xhv.INSTANCE;
                return new FinishResult(jSONObject, null, 2, null);
            }
        } else if (str.equals("remove")) {
            y7Var.e().remove(w);
            return new FinishResult(null, null, 3, null);
        }
        return new ErrorResult("501", (String) null, (Map) null, 6, (a07) null);
    }
}
