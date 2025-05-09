package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f20715a = th.c();

    static {
        t2o.a(79691962);
        new HashMap();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd1c67f", new Object[]{str});
        } else if (f20715a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  time:");
            sb.append(System.currentTimeMillis());
        }
    }

    public static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a525226", new Object[]{str, map});
        } else if (th.c() || new File("/data/local/tmp/.enableLogForPerf").exists()) {
            ck.b i = ck.b.b().i("AURA/performance");
            if (map != null) {
                for (String str2 : map.keySet()) {
                    String str3 = map.get(str2);
                    if (!TextUtils.isEmpty(str3)) {
                        i.g(str2, str3);
                    }
                }
            }
            ck.g().e(str, i.a());
        }
    }
}
