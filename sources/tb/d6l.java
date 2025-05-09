package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d6l extends jq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "reload";
    public static final String TAG = "OperateReload";

    static {
        t2o.a(83886222);
    }

    public static /* synthetic */ Object ipc$super(d6l d6lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/delta/OperateReload");
    }

    @Override // tb.jq
    public void a(u55 u55Var, JSONObject jSONObject, List<rb4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1d5e0", new Object[]{this, u55Var, jSONObject, list});
            return;
        }
        u55Var.getComponents();
        String string = jSONObject.getString("target");
        DMComponent dMComponent = u55Var.p().get(string);
        if (dMComponent == null) {
            UnifyLog.m(u55Var.getBizName(), TAG, "reload target is null", new String[0]);
        }
        JSONObject jSONObject2 = u55Var.r().getJSONObject(string).getJSONObject("events");
        dMComponent.onReloadEvent(t55.g(u55Var, jSONObject2));
        dMComponent.setEvents(jSONObject2);
    }
}
