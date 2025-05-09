package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a52 extends m8<k8> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BATCHCHAINSTORAGESET = "-3464126933797309446";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(336592953);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(336592952);
    }

    public static /* synthetic */ Object ipc$super(a52 a52Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/BatchChainStorageSetAbility");
    }

    @Override // tb.m8
    public c8<?> f(n8 n8Var, k8 k8Var, u8 u8Var) {
        Set<Map.Entry<String, Object>> entrySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        ckf.g(n8Var, "abilityData");
        ckf.g(k8Var, "akCtx");
        ckf.g(u8Var, "akiAbilityCallback");
        JSONObject jSONObject = n8Var.h().getJSONObject("pairs");
        if (!(jSONObject == null || (entrySet = jSONObject.entrySet()) == null)) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ckf.f(key, "it.key");
                h4g.c((String) key, k8Var.b(), entry.getValue());
            }
        }
        return new f8();
    }
}
