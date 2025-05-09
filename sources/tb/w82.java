package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.task.BehaviXTaskType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class w82 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BehaviXTaskType f30511a;
    public final Map<String, Object> b;

    static {
        t2o.a(404750634);
    }

    public w82(BehaviXTaskType behaviXTaskType, Map<String, Object> map, x82 x82Var) {
        this.f30511a = behaviXTaskType;
        this.b = map;
        if (map != null) {
            JSONObject jSONObject = (JSONObject) map.get("taskConfig");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        }
    }
}
