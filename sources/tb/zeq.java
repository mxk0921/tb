package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zeq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static nnf f32711a;

    public static nnf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nnf) ipChange.ipc$dispatch("3cf188ff", new Object[0]);
        }
        nnf nnfVar = f32711a;
        if (nnfVar != null) {
            return nnfVar;
        }
        return new ffq();
    }

    public static HashMap<String, String> b() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("64cd7901", new Object[0]);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String c = yfq.d().c("forward_domains", "");
        if (!TextUtils.isEmpty(c)) {
            for (String str : c.split(",")) {
                String c2 = yfq.d().c(str, "");
                if (!TextUtils.isEmpty(c2)) {
                    hashMap.put(str, c2);
                }
            }
        }
        return hashMap;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        try {
            yfq.d().f(context);
        } catch (Throwable unused) {
        }
    }

    public static void d(nnf nnfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1aaa10", new Object[]{nnfVar});
        } else {
            f32711a = nnfVar;
        }
    }
}
