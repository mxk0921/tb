package tb;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprException;
import java.util.Map;
import tb.iiz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class cgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cgz INSTANCE = new cgz();

    static {
        t2o.a(598737366);
    }

    public final hhz a(String str, String str2, byte b, Map<String, ? extends Object> map, Map<String, Integer> map2, m9z m9zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("b93ca3d", new Object[]{this, str, str2, new Byte(b), map, map2, m9zVar});
        }
        ckf.g(str, "megaName");
        ckf.g(str2, "megaApi");
        ckf.g(m9zVar, "ncCallMageContext");
        kdb b2 = m9zVar.b();
        AbilityHubAdapter e = m9zVar.e();
        if (e != null) {
            iiz.a aVar = iiz.Companion;
            aVar.q("NCCallMegaChainNodeOpImpl processMegaNode " + str + " : " + str2);
            if (b == 0) {
                e.j(str, str2, b2, map, new ohz(m9zVar, map2, str, str2));
                return hhz.Companion.n();
            } else if (b != 1) {
                return hhz.Companion.n();
            } else {
                ExecuteResult z = e.z(str, str2, b2, map, new ohz(m9zVar, map2, str, str2));
                if (z.getStatusCode() <= 99) {
                    if (u7z.Companion.a()) {
                        aVar.q(ckf.p("DXCallMegaChainNodeOpImpl SYNC CALL ", JSON.toJSONString(z)));
                    }
                    if (z.getData() != null) {
                        return hhz.Companion.k(z.getData());
                    }
                    return hhz.Companion.m();
                }
                if (u7z.Companion.a()) {
                    String jSONString = JSON.toJSONString(z);
                    ckf.f(jSONString, "toJSONString(executeResult)");
                    aVar.q("SYNC CALL 失败 ", jSONString);
                }
                return hhz.Companion.m();
            }
        } else {
            throw new NCExprException("megaAbilityEngine is null");
        }
    }
}
