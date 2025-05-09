package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f20362a;

    public h1r(Map<String, String> map) {
        this.f20362a = map;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5afce9f4", new Object[]{this, str, new Integer(i)})).intValue();
        }
        String str2 = this.f20362a.get(str);
        if (str2 != null) {
            try {
                return Integer.parseInt(str2);
            } catch (Exception e) {
                yhh.a(e);
            }
        }
        return i;
    }

    public boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afd29d6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        String str2 = this.f20362a.get(str);
        if (str2 != null) {
            try {
                return Boolean.parseBoolean(str2);
            } catch (Exception e) {
                yhh.a(e);
            }
        }
        return z;
    }
}
