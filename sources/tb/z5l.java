package tb;

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
public class z5l extends jq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "delete";
    public static final String TAG = "OperateDelete";

    static {
        t2o.a(83886216);
    }

    public static /* synthetic */ Object ipc$super(z5l z5lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/delta/OperateDelete");
    }

    @Override // tb.jq
    public void a(u55 u55Var, JSONObject jSONObject, List<rb4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1d5e0", new Object[]{this, u55Var, jSONObject, list});
        } else if (jSONObject instanceof JSONObject) {
            b(u55Var, jSONObject.getString("target"), list);
        }
    }

    public final void b(u55 u55Var, String str, List<rb4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d36ed8", new Object[]{this, u55Var, str, list});
            return;
        }
        List<IDMComponent> components = u55Var.getComponents();
        Map<String, DMComponent> p = u55Var.p();
        DMComponent dMComponent = p.get(str);
        if (dMComponent == null) {
            UnifyLog.m(u55Var.getBizName(), TAG, "delete target is null", new String[0]);
            return;
        }
        DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
        if (dMComponent2 == null) {
            UnifyLog.m(u55Var.getBizName(), TAG, "delete target's parent is null", new String[0]);
            return;
        }
        int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
        if (components.remove(dMComponent)) {
            db7 db7Var = new db7();
            db7Var.b(dMComponent);
            db7Var.c(indexOf);
            list.add(db7Var);
        }
        p.remove(str);
        dMComponent2.getChildren().remove(indexOf);
        dMComponent.setParent(null);
        u55Var.h0(str, dMComponent2.getKey());
        if (dMComponent.getChildren() != null) {
            for (int size = dMComponent.getChildren().size() - 1; size >= 0; size--) {
                b(u55Var, str, list);
            }
        }
    }
}
