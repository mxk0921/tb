package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.engine.reader.RuleDefine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class dio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(615514210);
    }

    public cio a(RuleDefine ruleDefine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cio) ipChange.ipc$dispatch("50387b4b", new Object[]{this, ruleDefine});
        }
        return b(ruleDefine);
    }

    public abstract cio b(RuleDefine ruleDefine);
}
