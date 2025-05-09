package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f16147a;
    public long b;
    public final List<String> c = new ArrayList();
    public String d;

    static {
        t2o.a(815792514);
    }

    public static b2p a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b2p) ipChange.ipc$dispatch("b358f1ae", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        b2p b2pVar = new b2p();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        try {
            String string = jSONObject.getString("startTime");
            String string2 = jSONObject.getString("endTime");
            b2pVar.f16147a = simpleDateFormat.parse(string).getTime();
            b2pVar.b = simpleDateFormat.parse(string2).getTime();
            JSONArray c = h19.c(jSONObject, "query");
            if (c != null && !c.isEmpty()) {
                for (int i = 0; i < c.size(); i++) {
                    String string3 = c.getString(i);
                    if (!TextUtils.isEmpty(string3)) {
                        ((ArrayList) b2pVar.c).add(string3);
                    }
                }
                if (((ArrayList) b2pVar.c).isEmpty()) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                if (TextUtils.isEmpty(string4)) {
                    return null;
                }
                b2pVar.d = string4;
                return b2pVar;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
