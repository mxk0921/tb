package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d74 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286519);
    }

    public static /* synthetic */ Object ipc$super(d74 d74Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonServerEventSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        String str;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        try {
            Object k = k();
            if ((k instanceof JSONObject) && (jSONArray = ((JSONObject) k).getJSONArray(Constants.KEY_EVENT_LIST)) != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    this.c.getEventHandler().k(x(jSONArray.getJSONObject(i)));
                }
            }
        } catch (Throwable th) {
            UnifyLog.e("CommonServerEventSubscriber", th.toString());
            fsb fsbVar = this.d;
            if (fsbVar == null) {
                str = "Ultron";
            } else {
                str = fsbVar.getBizName();
            }
            lbq.c(str, "CommonServerEventSubscriber.onHandleEvent", th);
        }
    }

    public final b8v x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("cc84e2a9", new Object[]{this, jSONObject});
        }
        b8v e = this.c.getEventHandler().e();
        String string = jSONObject.getString("type");
        e.t(string);
        e.r(new DMEvent(string, jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option")));
        return e;
    }
}
