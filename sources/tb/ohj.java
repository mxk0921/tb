package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ohj implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f25395a;
    public final JSONObject b;
    public final qhj c;

    static {
        t2o.a(729809904);
    }

    public ohj(qhj qhjVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f25395a = jSONObject2;
        this.c = qhjVar;
        this.b = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        JSONObject jSONObject2 = this.f25395a;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("item")) != null && jSONObject.getJSONObject(r4p.VALUE_SHOWTYPE_SIMILAR) != null) {
            String string = jSONObject.getJSONObject(r4p.VALUE_SHOWTYPE_SIMILAR).getString("targetUrl");
            this.c.e(this.f25395a, jSONObject.getJSONObject(r4p.VALUE_SHOWTYPE_SIMILAR));
            this.c.a();
            gqv.e(this.b, jSONObject.getJSONObject(r4p.VALUE_SHOWTYPE_SIMILAR));
            Nav.from(s38.f(view)).toUri(string);
        }
    }
}
