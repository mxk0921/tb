package tb;

import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e6l extends jq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "replace";
    public static final String TAG = "OperateReplace";

    static {
        t2o.a(83886223);
    }

    public static /* synthetic */ Object ipc$super(e6l e6lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/delta/OperateReplace");
    }

    @Override // tb.jq
    public void a(u55 u55Var, JSONObject jSONObject, List<rb4> list) {
        ArrayMap<String, Object> extMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1d5e0", new Object[]{this, u55Var, jSONObject, list});
        } else if (jSONObject instanceof JSONObject) {
            String string = jSONObject.getString("target");
            List<IDMComponent> components = u55Var.getComponents();
            Map<String, DMComponent> p = u55Var.p();
            DMComponent dMComponent = p.get(string);
            if (dMComponent == null) {
                UnifyLog.m(u55Var.getBizName(), TAG, "replaceOp target is null", new String[0]);
                return;
            }
            DMComponent a2 = t55.a(u55Var, u55Var.r().getJSONObject(string), string);
            DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
            if (dMComponent2 != null) {
                int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
                if (indexOf == -1) {
                    UnifyLog.m(u55Var.getBizName(), TAG, "target component index is -1", new String[0]);
                }
                dMComponent2.getChildren().remove(indexOf);
                dMComponent2.getChildren().add(indexOf, a2);
                a2.setParent(dMComponent2);
                ArrayMap<String, Object> extMap2 = dMComponent.getExtMap();
                if (!(extMap2 == null || (extMap = a2.getExtMap()) == null)) {
                    for (Map.Entry<String, Object> entry : extMap2.entrySet()) {
                        extMap.put(entry.getKey(), entry.getValue());
                    }
                }
                String a3 = f6l.a(a2, dMComponent2);
                String f = f6l.f(a2, dMComponent2);
                a2.setComponentCardGroupTag(a3);
                a2.setComponentPosition(f);
                o1o o1oVar = new o1o();
                o1oVar.c(a2);
                o1oVar.e(dMComponent);
                o1oVar.d(indexOf);
                list.add(o1oVar);
                int indexOf2 = components.indexOf(dMComponent);
                components.remove(indexOf2);
                components.add(indexOf2, a2);
                p.put(string, a2);
            }
        }
    }
}
