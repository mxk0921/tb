package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.engine.reader.RuleDefine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26356a;

    static {
        t2o.a(615514209);
        t2o.a(615514213);
    }

    public pwf(String str) {
        this.f26356a = str;
    }

    public RuleDefine b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleDefine) ipChange.ipc$dispatch("449c899e", new Object[]{this});
        }
        try {
            if (!TextUtils.isEmpty(this.f26356a)) {
                return (RuleDefine) JSON.parseObject(this.f26356a, RuleDefine.class);
            }
            return null;
        } catch (Exception e) {
            idh.c("JsonRuleDefineReader", "readChannelRule", e);
            return null;
        }
    }

    public List<RuleDefine> a() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fc29718a", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f26356a)) {
            return Collections.emptyList();
        }
        try {
            JSONArray jSONArray2 = JSON.parseObject(this.f26356a).getJSONArray("updateInfo");
            if (jSONArray2 == null || jSONArray2.size() == 0 || (jSONObject = jSONArray2.getJSONObject(0)) == null || (jSONObject2 = jSONObject.getJSONObject("payload")) == null || (jSONArray = jSONObject2.getJSONArray("diagnoseSceneConfigModelList")) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                RuleDefine ruleDefine = (RuleDefine) jSONArray.getJSONObject(i).toJavaObject(RuleDefine.class);
                if (ruleDefine != null) {
                    arrayList.add(ruleDefine);
                }
            }
            return arrayList;
        } catch (Exception e) {
            idh.c("JsonRuleDefineReader", "read", e);
            return null;
        }
    }
}
