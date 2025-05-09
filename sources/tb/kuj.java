package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f22931a;
    public Map<String, String> c;
    public JSONObject e;
    public int b = 200;
    public boolean d = false;

    static {
        t2o.a(649068593);
    }

    public kuj(String str) {
        this.f22931a = str;
    }

    public kuj a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuj) ipChange.ipc$dispatch("4fcd5dbd", new Object[]{this, str, str2});
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.put(str, str2);
        return this;
    }
}
