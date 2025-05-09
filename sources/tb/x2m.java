package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class x2m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final x2m INSTANCE = new x2m();

    static {
        t2o.a(745537863);
    }

    public final String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9229e191", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return "0:00-0:00";
        }
        Integer integer = jSONObject.getInteger("startHour");
        Integer integer2 = jSONObject.getInteger("starMinute");
        Integer integer3 = jSONObject.getInteger("endHour");
        Integer integer4 = jSONObject.getInteger("endMinute");
        StringBuilder sb = new StringBuilder();
        ckf.c(integer, "startHour");
        sb.append(integer.intValue());
        sb.append(":");
        int i = ckf.i(integer2.intValue(), 10);
        String str = integer2;
        if (i < 0) {
            str = "0" + integer2;
        }
        sb.append(str);
        sb.append("-");
        ckf.c(integer3, "endHour");
        sb.append(integer3.intValue());
        sb.append(":");
        int i2 = ckf.i(integer4.intValue(), 10);
        String str2 = integer4;
        if (i2 < 0) {
            str2 = "0" + integer4;
        }
        sb.append(str2);
        String sb2 = sb.toString();
        ckf.c(sb2, "sb.toString()");
        return sb2;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af90855", new Object[]{this, str});
        }
        if (str == null) {
            return "0:00-0:00";
        }
        try {
            return a(JSON.parseObject(str));
        } catch (Throwable unused) {
            return "0:00-0:00";
        }
    }
}
