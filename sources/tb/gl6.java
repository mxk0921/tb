package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.statistic.TBS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class gl6 implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745537839);
        }

        public a() {
        }

        public final JSONObject a(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("fc652376", new Object[]{this, str, str2, jSONObject});
            }
            ckf.h(str, "pageName");
            ckf.h(str2, "arg1");
            ckf.h(jSONObject, "args");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "page", str);
            jSONObject2.put((JSONObject) "point", str2);
            jSONObject2.put((JSONObject) "args", (String) jSONObject);
            return jSONObject2;
        }

        public final void b(JSONObject jSONObject, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efeeea3d", new Object[]{this, jSONObject, new Integer(i)});
                return;
            }
            ckf.h(jSONObject, "userTrack");
            String string = jSONObject.getString("page");
            if (string != null) {
                String string2 = jSONObject.getString("point");
                if (string2 == null) {
                    string2 = "";
                }
                c(string, i, string2, jSONObject.getJSONObject("args"));
            }
        }

        public final void c(String str, int i, String str2, Object obj) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9df43f35", new Object[]{this, str, new Integer(i), str2, obj});
                return;
            }
            ckf.h(str, "pageName");
            ckf.h(str2, "arg1");
            if (obj instanceof JSONObject) {
                TBS.Ext.commitEvent(str, i, str2, null, null, suv.i((JSONObject) obj));
                return;
            }
            if (obj == null || (str3 = obj.toString()) == null) {
                str3 = "";
            }
            TBS.Ext.commitEvent(str, i, str2, null, null, str3);
        }

        public final void d(String str, String str2, String str3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f20a1ae4", new Object[]{this, str, str2, str3, obj});
                return;
            }
            ckf.h(str, "pageName");
            ckf.h(str2, "eventId");
            ckf.h(str3, "arg1");
            Integer m = ssq.m(str2);
            c(str, m != null ? m.intValue() : 2101, str3, obj);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(745537838);
        t2o.a(537919601);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        JSONObject jSONObject;
        Object obj;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        JSONObject jSONObject2 = null;
        Object data = action != null ? action.getData() : null;
        if (data instanceof JSONObject) {
            jSONObject2 = data;
        }
        JSONObject jSONObject3 = jSONObject2;
        if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("params")) != null && (obj = jSONObject3.get("eventId")) != null) {
            if (obj instanceof Integer) {
                i = ((Number) obj).intValue();
            } else {
                Integer m = ssq.m(obj.toString());
                i = m != null ? m.intValue() : 2101;
            }
            Companion.b(jSONObject, i);
        }
    }
}
