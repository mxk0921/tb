package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ju3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ju3 INSTANCE = new ju3();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f22221a = new LinkedHashMap();

    static {
        t2o.a(815793475);
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("404df47d", new Object[0]);
        }
        Map<String, String> map = f22221a;
        if (map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append((String) entry.getValue());
            sb.append(";");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }
}
