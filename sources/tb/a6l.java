package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.delta.OperateInsert;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a6l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, jq> f15568a;

    static {
        t2o.a(83886217);
    }

    public a6l() {
        HashMap<String, jq> hashMap = new HashMap<>();
        this.f15568a = hashMap;
        hashMap.put("delete", new z5l());
        hashMap.put("insert", new OperateInsert());
        hashMap.put("reload", new d6l());
        hashMap.put("replace", new e6l());
        hashMap.put("modify", new c6l());
        hashMap.put("merge", new b6l());
    }

    public void a(String str, u55 u55Var, JSONObject jSONObject, List<rb4> list) {
        jq jqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0689d30", new Object[]{this, str, u55Var, jSONObject, list});
        } else if (!TextUtils.isEmpty(str) && this.f15568a.size() >= 1 && (jqVar = this.f15568a.get(str)) != null) {
            jqVar.a(u55Var, jSONObject, list);
        }
    }
}
