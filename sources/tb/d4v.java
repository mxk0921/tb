package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.StringUtils;
import com.ut.device.UTDevice;
import java.util.Iterator;
import org.json.JSONObject;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d4v implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "fu_hash";
    public static d4v c;

    /* renamed from: a  reason: collision with root package name */
    public int f17578a = -1;
    public final int b;

    static {
        t2o.a(962592854);
        t2o.a(962592825);
    }

    public d4v() {
        this.b = 100;
        this.b = Math.abs(StringUtils.hashCode(UTDevice.getUtdid(o2w.k().g()))) % 100;
        x2r.f().i(KEY, this);
        a(KEY, x2r.f().e(KEY));
    }

    public static synchronized d4v d() {
        synchronized (d4v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d4v) ipChange.ipc$dispatch("582afe7c", new Object[0]);
            }
            if (c == null) {
                c = new d4v();
            }
            return c;
        }
    }

    public final int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efd7a04c", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5cfdd08", new Object[]{this})).intValue();
        }
        int i = this.f17578a;
        if (i >= 1 && i <= 300) {
            return i;
        }
        int g = x2r.f().g("fu");
        if (g <= 0) {
            g = 30;
        }
        nhh.f("UTUploadCycleConfigMgr", "getFuCycleTime", Integer.valueOf(g));
        return g;
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
            return;
        }
        this.f17578a = -1;
        if (!TextUtils.isEmpty(str2)) {
            try {
                nhh.f("UTUploadCycleConfigMgr", "utdidMod", Integer.valueOf(this.b));
                nhh.f("UTUploadCycleConfigMgr", "key", str, "value", str2);
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> keys = jSONObject.keys();
                while (true) {
                    if (!keys.hasNext()) {
                        break;
                    }
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                        String[] split = optString.split("_");
                        if (split.length == 2) {
                            int b = b(split[0], -1);
                            int b2 = b(split[1], -1);
                            if (b >= 0 && b <= 100 && b2 >= 0 && b2 <= 100 && (i = this.b) >= b && i < b2) {
                                this.f17578a = b(next, -1);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                nhh.f("UTUploadCycleConfigMgr", "fuCycleTime", Integer.valueOf(this.f17578a));
            } catch (Throwable unused) {
                this.f17578a = -1;
            }
        }
    }
}
