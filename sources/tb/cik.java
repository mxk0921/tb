package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138853);
    }

    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if (obj != null && cjdVar != null) {
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (!(hashMap == null || hashMap.size() == 0)) {
                cjdVar.c(obj);
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    String valueOf = String.valueOf(entry.getKey());
                    if (!TextUtils.isEmpty(valueOf)) {
                        try {
                            cjdVar.b(obj, valueOf, entry.getValue());
                        } catch (Throwable th) {
                            mgh.b(th);
                        }
                    } else {
                        return;
                    }
                }
                cjdVar.a(obj);
            }
        }
    }
}
