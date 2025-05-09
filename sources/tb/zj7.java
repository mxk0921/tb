package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class zj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f32802a;

    static {
        t2o.a(989855812);
    }

    public zj7(File file) {
        this.f32802a = file;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("81f3f28f", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dexFile", (Object) this.f32802a.getAbsolutePath());
            File b = fk7.b(this.f32802a);
            jSONObject.put("dexFileSize", (Object) Long.valueOf(this.f32802a.length()));
            jSONObject.put("odexFileSize", (Object) Long.valueOf(b != null ? b.length() : 0L));
        } catch (Exception e) {
            v7t.d("DexOatStatus", "getStatus failed: " + e.getMessage());
        }
        return jSONObject;
    }
}
