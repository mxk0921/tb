package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class mr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24244a;
    public final int b;
    public final Map<String, String[]> c;

    static {
        t2o.a(729808953);
    }

    public mr1(String str, JSONObject jSONObject) {
        this.b = Integer.MAX_VALUE;
        this.f24244a = str;
        try {
            this.b = jSONObject.getInteger(pg1.ATOM_length).intValue();
            JSONObject jSONObject2 = jSONObject.getJSONObject("key");
            this.c = new HashMap(c(jSONObject2.size()));
            for (String str2 : jSONObject2.keySet()) {
                ((HashMap) this.c).put(str2, d(jSONObject2.getString(str2)));
            }
        } catch (Exception unused) {
            TLog.loge("BaseBizParamsCollector", str + "BizParams collector init error");
        }
    }

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b34f3d40", new Object[]{new Integer(i)})).intValue();
        }
        return ((int) (i * 1.4d)) + 1;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca033e7", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.c != null && this.f24244a != null && !b(jSONObject)) {
            g();
        }
    }

    public boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afad3011", new Object[]{this, jSONObject})).booleanValue();
        }
        for (String str : ((HashMap) this.c).keySet()) {
            Object e = e(str, (String[]) ((HashMap) this.c).get(str));
            if (f(e)) {
                jSONObject.put(str, e);
            }
        }
        return true;
    }

    public final String[] d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("4ae5e2e5", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("\\s*,\\s*");
    }

    public abstract Object e(String str, String[] strArr);

    public boolean f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb41650", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            g();
            return false;
        }
        int length = obj.toString().length();
        if (length == 0) {
            return false;
        }
        if (length <= this.b) {
            return true;
        }
        g();
        return false;
    }

    public abstract void g();
}
