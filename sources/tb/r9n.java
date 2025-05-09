package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r9n implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Pattern c = Pattern.compile("locate=(.*)(\"|&)");

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f27212a;
    public final dan b;

    static {
        t2o.a(729809913);
    }

    public r9n(dan danVar, JSONObject jSONObject) {
        this.f27212a = jSONObject;
        this.b = danVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        JSONObject jSONObject = this.f27212a;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            String string = jSONObject2.getString("similarUrl");
            Matcher matcher = c.matcher(string);
            if (matcher.find() && matcher.groupCount() >= 1) {
                String str = "Page_Home_Button-" + matcher.group(1);
                JSONObject jSONObject3 = this.f27212a.getJSONObject("clickParam");
                String string2 = jSONObject2.getString("similarArgs");
                if (!(jSONObject3 == null || string2 == null)) {
                    r5a.i(jSONObject3.getString("page"), jSONObject3.getIntValue("eventId"), str, string2);
                }
            }
            this.b.a();
            Nav.from(s38.f(view)).toUri(string);
        }
    }
}
