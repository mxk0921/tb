package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.testutils.log.LogUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class rz1 extends uct implements led {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ke4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ke4
        public void a(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f84e7f62", new Object[]{this, str, str2, str3, jSONObject});
                return;
            }
            rz1.this.l(jSONObject);
            rz1.this.k(jSONObject);
            om8.b("PythonTask", jSONObject);
        }

        @Override // tb.ke4
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c939cdb", new Object[]{this, str, jSONObject});
                return;
            }
            rz1.this.m(jSONObject);
            rz1.this.i(jSONObject);
        }
    }

    static {
        t2o.a(404750403);
        t2o.a(404750405);
    }

    public rz1(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
    }

    public static /* synthetic */ Object ipc$super(rz1 rz1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/task/BasePythonTask");
    }

    @Override // tb.uct
    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!Debuggable.isDebug()) {
            n(null);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // tb.uct
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            n(a());
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    public abstract void l(JSONObject jSONObject);

    public abstract void m(JSONObject jSONObject);

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            LogUtils.e(LogUtils.BR_BIZ_NAME, "PythonTask", "createEventBySuccess result is null.");
        } else {
            HashMap hashMap = null;
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    hashMap = new HashMap(jSONObject2);
                }
            } catch (Exception e) {
                om8.c("PythonTask", "createEventBySuccess", e.getMessage());
            }
            d(hashMap);
        }
    }

    public void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            LogUtils.e(LogUtils.BR_BIZ_NAME, "PythonTask", "createEventByError result is null.");
        } else {
            JSONObject d = com.taobao.android.behavir.util.a.d("success", Boolean.FALSE, "errorCode", "BRPythonTask_" + kxw.b(jSONObject), "errorMsg", "BRPythonTask_" + kxw.c(jSONObject));
            d.putAll(jSONObject);
            d(d);
        }
    }

    public void n(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ef43b3", new Object[]{this, map});
            return;
        }
        JSONObject taskInfo = this.b.getTaskInfo();
        if (taskInfo != null) {
            String string = taskInfo.getString(r4p.KEY_MODEL_NAME);
            if (TextUtils.isEmpty(string)) {
                string = taskInfo.getString("pythonName");
            }
            boolean booleanValue = taskInfo.getBooleanValue("isAlias");
            if (map != null) {
                Object obj = map.get("bizCustomPythonName");
                Object obj2 = map.get("bizCustomIsAlias");
                if (obj instanceof String) {
                    string = (String) obj;
                }
                if (obj2 instanceof Boolean) {
                    booleanValue = ((Boolean) obj2).booleanValue();
                }
            }
            j(string);
            p6n.c(string, map, booleanValue, new a(), taskInfo.getIntValue("algTimeout"));
            LogUtils.e(LogUtils.BR_BIZ_NAME, "PythonTask", "sync task is running.", string);
        }
    }
}
