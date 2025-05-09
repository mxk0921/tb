package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class mrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile mrw c = null;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f24265a = null;
    public String[] b = null;

    static {
        t2o.a(989856465);
    }

    public static mrw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrw) ipChange.ipc$dispatch("3cc6d074", new Object[0]);
        }
        if (c == null) {
            synchronized (mrw.class) {
                try {
                    if (c == null) {
                        c = new mrw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f24265a = null;
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9f25d9ba", new Object[]{this});
        }
        return this.f24265a;
    }

    public String[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fa980a65", new Object[]{this});
        }
        return this.b;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb325a2", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("\"") && str.endsWith("\"")) {
                    str = str.substring(1, str.length() - 1);
                }
                this.f24265a = new JSONObject(str.replace("\\", ""));
            }
        } catch (Exception unused) {
            this.f24265a = null;
        }
    }

    public void f(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12eb12bd", new Object[]{this, strArr});
        } else {
            this.b = strArr;
        }
    }
}
