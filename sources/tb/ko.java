package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Component f22791a;
    public final JSONObject b;

    static {
        t2o.a(81789209);
    }

    public ko(String str, Component component, JSONObject jSONObject) {
        this.f22791a = component;
        this.b = jSONObject;
    }

    public Component a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("e1577502", new Object[]{this});
        }
        return this.f22791a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee29ecad", new Object[]{this});
        }
        return this.b;
    }
}
