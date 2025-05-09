package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wuy extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String e;
    public final String f;
    public final JSONObject g;

    static {
        t2o.a(912261768);
    }

    public wuy(String str, String str2, JSONObject jSONObject) {
        this.e = str;
        this.g = jSONObject;
        this.f = str2;
    }

    public static /* synthetic */ Object ipc$super(wuy wuyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/floatview/RedPacketMessage");
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.e;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1395b3ef", new Object[]{this});
        }
        return this.g;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
        }
        return this.f;
    }
}
