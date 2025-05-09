package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class frn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final frn INSTANCE = new frn();

    /* renamed from: a  reason: collision with root package name */
    public static final List<JSONObject> f19487a = new ArrayList();

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            ((ArrayList) f19487a).clear();
        }
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e3cb373", new Object[]{this});
        }
        List<JSONObject> list = f19487a;
        if (!list.isEmpty()) {
            return (JSONObject) ((ArrayList) list).remove(0);
        }
        return null;
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57fa5b09", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "data");
        ((ArrayList) f19487a).add(jSONObject);
    }
}
