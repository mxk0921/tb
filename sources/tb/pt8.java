package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.model.IFBTplInfo;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pt8 implements IFBTplInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26281a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public static JSONObject b(pt8 pt8Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8d8f81bd", new Object[]{pt8Var});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", pt8Var.f26281a).put("tplId", pt8Var.b).put("tplHash", pt8Var.d).put("tplVersion", pt8Var.c).put("publishVersion", pt8Var.e).put("time", pt8Var.f);
        return jSONObject;
    }

    public static String c(pt8 pt8Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53f46783", new Object[]{pt8Var});
        }
        return b(pt8Var).toString();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c71e7524", new Object[]{this});
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FBBasicTplInfo{tag='" + this.f26281a + "', tplId='" + this.b + "', tplHash='" + this.d + "', tplVersion='" + this.c + "', publishVersion='" + this.e + "', time='" + this.f + "'}";
    }
}
