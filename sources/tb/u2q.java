package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u2q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29091a;
    public String b;
    public JSONObject c;
    public String d;
    public JSONObject e;
    public JSONObject f;
    public String g;
    public final JSONArray h = new JSONArray();

    static {
        t2o.a(478150864);
    }

    public static u2q a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u2q) ipChange.ipc$dispatch("931bb485", new Object[]{str, str2, str3, str4});
        }
        u2q u2qVar = new u2q();
        u2qVar.f29091a = str;
        u2qVar.b = str2;
        u2qVar.g = str4;
        return u2qVar;
    }
}
