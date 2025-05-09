package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class x0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final x0p INSTANCE = new x0p();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f31054a = new ConcurrentHashMap<>();

    static {
        t2o.a(815793499);
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("535ae54f", new Object[]{this, str});
        }
        ckf.g(str, "layerName");
        return f31054a.get(str);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3d4200", new Object[]{this});
            return;
        }
        String e = v4p.e("searchBts", "");
        ckf.d(e);
        d(e);
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70bb826", new Object[]{this, str});
            return;
        }
        ckf.g(str, "forBts");
        v4p.h("searchBts", str);
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68543951", new Object[]{this, str});
            return;
        }
        ckf.g(str, "forBts");
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : wsq.z0(str, new String[]{";"}, false, 0, 6, null)) {
                if (!TextUtils.isEmpty(str2)) {
                    List z0 = wsq.z0(str2, new String[]{":"}, false, 0, 6, null);
                    if (z0.size() >= 2) {
                        String str3 = (String) z0.get(0);
                        String str4 = (String) z0.get(1);
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                            f31054a.put(str3, str4);
                        }
                    }
                }
            }
        }
    }
}
