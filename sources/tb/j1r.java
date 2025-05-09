package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ?> f21704a;

    static {
        t2o.a(970981422);
    }

    public j1r(Map<String, ?> map) {
        this.f21704a = map;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5afce9f4", new Object[]{this, str, new Integer(i)})).intValue();
        }
        Object obj = this.f21704a.get(str);
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Integer.parseInt((String) obj);
                }
                if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                }
            } catch (Exception e) {
                ghh.c(e);
            }
        }
        return i;
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10d58f94", new Object[]{this, str, str2});
        }
        Object obj = this.f21704a.get(str);
        if (obj == null || !(obj instanceof String)) {
            return str2;
        }
        return (String) obj;
    }

    public boolean c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afd29d6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object obj = this.f21704a.get(str);
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Boolean.parseBoolean((String) obj);
                }
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            } catch (Exception e) {
                ghh.c(e);
            }
        }
        return z;
    }
}
