package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bn extends bp<UMFRuleIO, AURAParseIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.service.rule";
    public sab c;

    static {
        t2o.a(80740638);
    }

    public static /* synthetic */ Object ipc$super(bn bnVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -576780562) {
            super.B((AURAInputData) objArr[0], (pt) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/rule/AURARulesService");
        }
    }

    public final String L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88db853c", new Object[]{this, str});
        }
        str.hashCode();
        if (str.equals("modify")) {
            return "modify";
        }
        if (!str.equals("rollback")) {
            return "default";
        }
        return "rollback";
    }

    @Override // tb.gn, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        sab sabVar = this.c;
        if (sabVar != null) {
            ((zm) sabVar).h();
        }
    }

    @Override // tb.bp
    public void B(AURAInputData<UMFRuleIO> aURAInputData, pt<AURAParseIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
            return;
        }
        super.B(aURAInputData, ptVar);
        this.c = new zm(aURAInputData, r());
        UMFRuleIO data = aURAInputData.getData();
        String type = data.getType();
        if (TextUtils.isEmpty(type)) {
            th.a("ruleType is NULL!!");
            ptVar.b(new mi(1, "AURARulesServiceDomain", "-1000_EMPTY_ACTION", "规则服务type为null"));
        } else if ("rollback".equals(type)) {
            ptVar.c(yk.a(new AURAParseIO(null, L(type)), aURAInputData));
        } else {
            List<rxu> actions = data.getActions();
            if (actions == null) {
                ptVar.b(new mi(0, "AURARulesServiceDomain", "-1000_EMPTY_ACTION", "规则服务actions为null"));
                return;
            }
            UltronDeltaProtocol b = ((zm) this.c).b(actions, ptVar);
            if (b != null) {
                ptVar.c(yk.a(new AURAParseIO(Arrays.asList(new rl((JSONObject) JSON.toJSON(b), data.isConfirm())), L(type)), aURAInputData));
            }
        }
    }
}
