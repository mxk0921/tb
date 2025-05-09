package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import tb.emv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ikv implements emv.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_LAUNCH_SESSION = "last_launch_session";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21373a;

    public ikv(boolean z) {
        this.f21373a = z;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c32d39a", new Object[]{this});
        }
        return w9a.g().k().getString(KEY_LAST_LAUNCH_SESSION, "");
    }

    public String b(File file, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("886d12ca", new Object[]{this, file, str});
        }
        if (!file.getName().startsWith("startup")) {
            return str;
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            return str;
        }
        String name = file.getName();
        if (!name.endsWith(a2 + q2s.JSON)) {
            return str;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
            if (!(jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject(wua.KEY_PROPERTIES)) == null)) {
                jSONObject.put("processKilled", this.f21373a);
            }
            return jSONObject2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df5b922", new Object[]{this, str, str2});
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6683c74a", new Object[]{this, new Boolean(z)});
        }
    }
}
