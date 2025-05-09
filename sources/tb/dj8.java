package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.net.URLEncoder;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class dj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17859a;
    public final int b;
    public final long c;
    public final JSONObject d;

    static {
        t2o.a(502268334);
    }

    public dj8(String str, int i, long j, JSONObject jSONObject) {
        ckf.g(str, "page");
        this.f17859a = str;
        this.b = i;
        this.c = j;
        this.d = jSONObject;
    }

    public final String a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89fbfb40", new Object[]{this});
        }
        if (this.d == null) {
            str = "";
        } else {
            str = ",extras:" + b(this.d);
        }
        return "pa:" + this.f17859a + ",ty:" + this.b + ",ti:" + this.c + str;
    }

    public final String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26a1ec2", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return URLEncoder.encode(jSONObject.toString(), "UTF-8");
        } catch (Exception e) {
            TLog.loge("UserContext", "UserContext", "encodeExtras failed. " + e.getMessage());
            return null;
        }
    }

    public abstract String c();
}
