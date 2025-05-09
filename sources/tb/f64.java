package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f64 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19044a;
    public final JSONObject b;
    public final a c;
    public final a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void invoke(Object obj);
    }

    static {
        t2o.a(993001802);
    }

    public f64(String str, JSONObject jSONObject, a aVar, a aVar2) {
        this.f19044a = str;
        this.b = jSONObject;
        this.c = aVar;
        this.d = aVar2;
    }

    public static f64 a(String str, JSONObject jSONObject, a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f64) ipChange.ipc$dispatch("78eadbc1", new Object[]{str, jSONObject, aVar, aVar2});
        }
        return new f64(str, jSONObject, aVar, aVar2);
    }
}
