package tb;

import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s78 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27842a;
    public final String b = "switchVersion";
    public a3w c;

    static {
        t2o.a(456130601);
    }

    public static s78 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s78) ipChange.ipc$dispatch("c496f0ff", new Object[0]);
        }
        return new s78();
    }

    public s78 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s78) ipChange.ipc$dispatch("c246fe05", new Object[]{this, str});
        }
        this.f27842a = str;
        return this;
    }

    public s78 b(a3w a3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s78) ipChange.ipc$dispatch("225e4178", new Object[]{this, a3wVar});
        }
        this.c = a3wVar;
        return this;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc0ed3da", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ParamsConstants.Key.PARAM_SCENE_CODE, (Object) this.f27842a);
        jSONObject.put("type", (Object) this.b);
        a3w a3wVar = this.c;
        if (a3wVar != null) {
            jSONObject.put("targetVersion", (Object) a3wVar.g());
        }
        return jSONObject;
    }
}
