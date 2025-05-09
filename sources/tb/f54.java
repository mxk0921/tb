package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f54 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "commonBizParams";

    /* renamed from: a  reason: collision with root package name */
    public final List<fjb> f19018a = new CopyOnWriteArrayList();

    static {
        t2o.a(729808958);
    }

    public f54 a(fjb fjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f54) ipChange.ipc$dispatch("65056f0d", new Object[]{this, fjbVar});
        }
        ((CopyOnWriteArrayList) this.f19018a).add(fjbVar);
        return this;
    }

    public JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be8e66ed", new Object[]{this, jSONObject});
        }
        if (((CopyOnWriteArrayList) this.f19018a).isEmpty()) {
            uqa.b("CreateCommonParams", "create", "IBizParamsBuilder 为空请检查");
            return jSONObject;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(KEY);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject.put(KEY, (Object) jSONObject2);
        Iterator it = ((CopyOnWriteArrayList) this.f19018a).iterator();
        while (it.hasNext()) {
            fjb fjbVar = (fjb) it.next();
            String key = fjbVar.getKey();
            if (TextUtils.isEmpty(key)) {
                uqa.b("CreateCommonParams", "create", "IBizParamsBuilder getKey 返回空，请检查 ： ".concat(fjbVar.getClass().getName()));
            } else {
                jSONObject2.put(key, (Object) fjbVar.build());
            }
        }
        return jSONObject;
    }
}
