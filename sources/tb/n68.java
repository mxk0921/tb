package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.engine.reader.RuleDefine;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n68 extends dio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(615514207);
    }

    public static /* synthetic */ Object ipc$super(n68 n68Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/scene/engine/elv1/ELV1RuleFactory");
    }

    @Override // tb.dio
    public cio b(RuleDefine ruleDefine) {
        List<RuleDefine.ActionDefine> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cio) ipChange.ipc$dispatch("e9d64a9d", new Object[]{this, ruleDefine});
        }
        if (ruleDefine == null || TextUtils.isEmpty(ruleDefine.id) || TextUtils.isEmpty(ruleDefine.sceneCode) || TextUtils.isEmpty(ruleDefine.sceneRuleCode) || (list = ruleDefine.actions) == null || list.isEmpty()) {
            idh.a("ELV1RuleFactory", "Rule define invalid!!");
            return null;
        } else if (!"scene_custom".equals(ruleDefine.sceneCode) || !TextUtils.isEmpty(ruleDefine.bizName)) {
            l68 l68Var = new l68(ruleDefine.condition);
            List<x80> a2 = i90.a(ruleDefine.actions);
            if (a2 != null) {
                return new eio().b(ruleDefine.id).f(ruleDefine.sceneVersion).d(ruleDefine.sceneCode).e(ruleDefine.sceneRuleCode).c(ruleDefine.sampling).h(l68Var).g(a2).a();
            }
            idh.a("ELV1RuleFactory", "Action is empty!!");
            return null;
        } else {
            idh.a("ELV1RuleFactory", "Custom Rule define invalid!!");
            return null;
        }
    }
}
