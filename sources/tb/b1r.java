package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b1r extends dbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends TypeReference<List<String>> {
        public a(b1r b1rVar) {
        }
    }

    static {
        t2o.a(437256213);
    }

    public static /* synthetic */ Object ipc$super(b1r b1rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/action/SwitchTypeAction");
    }

    @Override // tb.dbx
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999d5fc5", new Object[]{this, jSONObject});
            return;
        }
        try {
            String d = d(this.c);
            if (!TextUtils.isEmpty(d)) {
                CopyOnWriteArrayList<JSONObject> m = obx.f(this.f17719a).m();
                ArrayList arrayList = new ArrayList();
                String str = "";
                for (JSONObject jSONObject2 : m) {
                    if (this.c.equals(jSONObject2.getString("widget_type_id"))) {
                        arrayList.add(Integer.valueOf(jSONObject2.getString("widget_id")));
                        str = jSONObject2.getString("widget_receiver");
                    }
                }
                String z = obx.f(this.f17719a).z(d);
                if (!TextUtils.isEmpty(z)) {
                    String c = c(z);
                    pde pdeVar = this.b;
                    if (pdeVar != null) {
                        ((m32) pdeVar).c(arrayList, str, c);
                    }
                    bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(this.c).w("widget_click_switch_type"));
                }
            }
        } catch (Throwable th) {
            hgh.d("[SwitchTypeAction] actionEvent: " + th);
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2ba2312", new Object[]{this, str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            JSONObject jSONObject = parseObject.getJSONObject("dataContent");
            if (jSONObject != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("switchEnable", (Object) Boolean.TRUE);
                jSONObject.put("native", (Object) jSONObject2);
            }
            return parseObject.toString();
        } catch (Exception e) {
            hgh.d("[SwitchTypeAction] disposeSwitchData: " + e);
            return "";
        }
    }

    public final String d(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("316bf327", new Object[]{this, str});
        }
        JSONObject D = obx.f(this.f17719a).D(str);
        if (D == null) {
            return null;
        }
        String string = D.getString("switch_ids");
        long longValue = D.getLong("switch_refresh_time").longValue();
        String string2 = D.getString("switch_id_index");
        List list = (List) JSON.parseObject(string, new a(this), new Feature[0]);
        while (true) {
            if (i >= list.size()) {
                break;
            } else if (string2.equals(list.get(i))) {
                string2 = (String) list.get((i + 1) % list.size());
                break;
            } else {
                i++;
            }
        }
        obx.f(this.f17719a).F(str, string, string2, longValue, ru6.a());
        hgh.d("[widgetSwitch] actionWidgetClick switchIdList: " + list + ",currWidgetTypeId: " + string2);
        return string2;
    }
}
