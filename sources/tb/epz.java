package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class epz extends h9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String r;
    public final long s;
    public final String t;

    static {
        t2o.a(786432103);
    }

    public epz(JSONObject jSONObject) {
        super(jSONObject);
        JSONObject jSONObject2;
        this.r = "";
        this.s = 1L;
        this.t = "";
        JSONObject jSONObject3 = this.h;
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("template_nano")) != null) {
            String string = jSONObject2.getString("url");
            ckf.f(string, "template.getString(\"url\")");
            this.r = string;
            Long l = jSONObject2.getLong("version");
            ckf.f(l, "template.getLong(\"version\")");
            this.s = l.longValue();
            String string2 = jSONObject2.getString("name");
            ckf.f(string2, "template.getString(\"name\")");
            this.t = string2;
        }
    }

    public static /* synthetic */ Object ipc$super(epz epzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/nano/render/TAKNanoComposePopParams");
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8afad3e", new Object[]{this});
        }
        return this.t;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c62d2fa", new Object[]{this});
        }
        return this.r;
    }

    public final long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45907d43", new Object[]{this})).longValue();
        }
        return this.s;
    }
}
