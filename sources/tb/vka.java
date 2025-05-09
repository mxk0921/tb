package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vka {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f30068a;

    static {
        t2o.a(479199462);
    }

    public vka(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f30068a = jSONObject;
            return;
        }
        throw new IllegalStateException();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94e11edb", new Object[]{this});
        }
        return this.f30068a.getString("groupKey");
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9d2189c", new Object[]{this})).intValue();
        }
        return this.f30068a.getIntValue("priority");
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd634b9f", new Object[]{this});
        }
        return this.f30068a.getString("title");
    }
}
