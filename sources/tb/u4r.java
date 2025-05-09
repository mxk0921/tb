package tb;

import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class u4r extends h9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final UltronInstanceConfig l;
    public final JSONObject m;

    static {
        t2o.a(786432137);
    }

    public u4r(JSONObject jSONObject) {
        super(jSONObject);
        String str;
        UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
        this.l = ultronInstanceConfig;
        String str2 = this.f;
        if (str2 == null || wsq.a0(str2)) {
            str = "stdUltronPop";
        } else {
            str = this.f;
        }
        ultronInstanceConfig.z(str);
        JSONObject f = vwf.f(jSONObject, "content", null);
        if (f != null) {
            JSONObject f2 = vwf.f(f, "data", null);
            this.m = f2;
            if (f2 == null) {
                this.m = new JSONObject(0);
            }
            String g = vwf.g(f, "namespace", null);
            this.j = g == null ? this.j : g;
            JSONObject f3 = vwf.f(f, "containerConfig", null);
            if (f3 != null) {
                ultronInstanceConfig.C(vwf.b(f3, "enableTextSizeStrategy", false));
                ultronInstanceConfig.B(vwf.b(f3, "isRefreshDownloaded", false) ? 2 : 1);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(u4r u4rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/ultron/pop/TAKUltronPopParams");
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.m;
    }

    public final UltronInstanceConfig g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronInstanceConfig) ipChange.ipc$dispatch("ca317a2f", new Object[]{this});
        }
        return this.l;
    }
}
