package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.DinamicXComponent;
import com.taobao.android.detail.ttdetail.skeleton.recommend.RecommendDataEngine;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31500a;
    public final ze7 b;
    public final List<DinamicXComponent> c = new ArrayList();
    public boolean d;
    public JSONObject e;

    static {
        t2o.a(912262644);
    }

    public xon(Context context, ze7 ze7Var, JSONObject jSONObject) {
        this.f31500a = context;
        this.b = ze7Var;
        d(jSONObject);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("853d4de5", new Object[]{this});
        }
        return this.e;
    }

    public List<DinamicXComponent> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("969e0ba4", new Object[]{this});
        }
        return this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39d52367", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void d(JSONObject jSONObject) {
        JSONArray jSONArray;
        Map<String, ComponentViewMeta> b;
        DinamicXComponent dinamicXComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a204de8a", new Object[]{this, jSONObject});
            return;
        }
        RecommendDataEngine recommendDataEngine = new RecommendDataEngine(this.f31500a, this.b);
        enn ennVar = (enn) recommendDataEngine.c(jnn.PARSER_ID, jSONObject);
        if (!(ennVar == null || (jSONArray = jSONObject.getJSONArray("container")) == null || jSONArray.isEmpty() || (b = recommendDataEngine.b(recommendDataEngine.a(jSONArray))) == null || b.isEmpty())) {
            this.b.d().g(b);
            for (nb4 nb4Var : ennVar.s()) {
                if (!(nb4Var == null || (dinamicXComponent = (DinamicXComponent) this.b.d().b(nb4Var, new DataEntry[0])) == null)) {
                    ((ArrayList) this.c).add(dinamicXComponent);
                }
            }
            tgh.b("RecommendViewModel", "recommendComponents.size= " + ((ArrayList) this.c).size());
            JSONObject jSONObject2 = jSONObject.getJSONObject("global");
            if (jSONObject2 != null) {
                this.d = jSONObject2.getBooleanValue("hasNextPage");
                this.e = jSONObject2.getJSONObject("contextMap");
            }
        }
    }
}
