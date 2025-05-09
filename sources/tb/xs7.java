package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xs7 extends zzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;

    public static /* synthetic */ Object ipc$super(xs7 xs7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/revisionswitch/core/DosaSwitch");
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b88e19", new Object[]{this});
        }
        return this.b;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8203227d", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bucket", this.b);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.f33129a.e()) {
                jSONObject2.put(str, this.f33129a.b(str));
            }
            jSONObject.put("switch", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            TLog.loge("DosaSwitch", "JSONException " + e.getMessage());
            return null;
        }
    }
}
