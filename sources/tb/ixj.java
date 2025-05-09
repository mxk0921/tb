package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ixj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ixj b;

    /* renamed from: a  reason: collision with root package name */
    public volatile HashMap<String, String> f21630a;

    static {
        t2o.a(352321913);
    }

    public static ixj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ixj) ipChange.ipc$dispatch("2842f21e", new Object[0]);
        }
        if (b == null) {
            synchronized (ixj.class) {
                try {
                    if (b == null) {
                        b = new ixj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("532b8e47", new Object[]{this});
        }
        if (this.f21630a == null || this.f21630a.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            try {
                for (String str : this.f21630a.values()) {
                    sb.append(str);
                    sb.append("_");
                }
                this.f21630a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f61c46", new Object[]{this, str, str2});
            return;
        }
        if (this.f21630a == null) {
            this.f21630a = new HashMap<>();
        }
        synchronized (this) {
            this.f21630a.put(str, str2);
        }
    }
}
