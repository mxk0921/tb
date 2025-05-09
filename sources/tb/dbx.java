package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class dbx implements ode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f17719a;
    public pde b;
    public String c;
    public String d;
    public List<Integer> e;

    static {
        t2o.a(437256215);
        t2o.a(437256210);
    }

    public abstract void b(JSONObject jSONObject);

    @Override // tb.ode
    public void a(Context context, Intent intent, pde pdeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e4199b", new Object[]{this, context, intent, pdeVar});
            return;
        }
        try {
            this.f17719a = context;
            this.b = pdeVar;
            intent.getIntegerArrayListExtra("appWidgetIds");
            int intExtra = intent.getIntExtra("widgetId", 0);
            JSONObject parseObject = JSON.parseObject(intent.getStringExtra("action"));
            if (parseObject != null) {
                this.e = new ArrayList();
                CopyOnWriteArrayList<JSONObject> m = obx.f(this.f17719a).m();
                for (JSONObject jSONObject : m) {
                    if (String.valueOf(intExtra).equals(jSONObject.getString("widget_id"))) {
                        this.c = jSONObject.getString("widget_type_id");
                    }
                }
                for (JSONObject jSONObject2 : m) {
                    if (this.c.equals(jSONObject2.getString("widget_type_id"))) {
                        ((ArrayList) this.e).add(Integer.valueOf(jSONObject2.getString("widget_id")));
                        this.d = jSONObject2.getString("widget_receiver");
                    }
                }
                b(parseObject);
            }
        } catch (Exception e) {
            hgh.d("[widgetClickAction] WidgetActionBase error: " + e.getMessage());
        }
    }
}
