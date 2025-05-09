package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x6v implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31184a;
    public String b;
    public String c;
    public JSONObject d;
    public JSONObject e;
    public JSONObject f;
    public String g;
    public String h;
    public boolean i = false;
    public String j;

    static {
        t2o.a(157286474);
    }

    /* renamed from: a */
    public x6v clone() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x6v) ipChange.ipc$dispatch("b310b0d6", new Object[]{this});
        }
        x6v x6vVar = new x6v();
        x6vVar.f31184a = this.f31184a;
        x6vVar.b = this.b;
        x6vVar.c = this.c;
        JSONObject jSONObject3 = this.d;
        JSONObject jSONObject4 = null;
        if (jSONObject3 != null) {
            jSONObject = JSON.parseObject(jSONObject3.toJSONString());
        } else {
            jSONObject = null;
        }
        x6vVar.d = jSONObject;
        JSONObject jSONObject5 = this.e;
        if (jSONObject5 != null) {
            jSONObject2 = JSON.parseObject(jSONObject5.toJSONString());
        } else {
            jSONObject2 = null;
        }
        x6vVar.e = jSONObject2;
        JSONObject jSONObject6 = this.f;
        if (jSONObject6 != null) {
            jSONObject4 = JSON.parseObject(jSONObject6.toJSONString());
        }
        x6vVar.f = jSONObject4;
        x6vVar.g = this.g;
        x6vVar.i = this.i;
        x6vVar.j = this.j;
        x6vVar.h = this.h;
        return x6vVar;
    }
}
