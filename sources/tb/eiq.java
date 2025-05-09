package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.HashMap;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        mdd e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        xhq c = ppo.b().c();
        if (c != null && (e = vxm.b.e()) != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("packageName", c.b);
            hashMap2.put("processName", c.c);
            hashMap2.put("referrer", c.d);
            hashMap2.put("fullyInfo", c.toString());
            if (c.e != null) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("action", c.e.getAction());
                Set<String> categories = c.e.getCategories();
                if (categories != null) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : categories) {
                        sb.append(str);
                        sb.append(";");
                    }
                    hashMap3.put("categories", sb.toString());
                }
                hashMap3.put("flags", "0x" + Integer.toHexString(c.e.getFlags()));
                hashMap3.put("dataString", c.e.getDataString());
                hashMap3.put("scheme", c.e.getScheme());
                hashMap3.put("type", c.e.getType());
                hashMap2.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, hashMap3);
            }
            if (!TextUtils.isEmpty(c.f)) {
                String[] split = c.f.split("[{}= ]");
                if (split.length > 1 && (split.length - 1) % 2 == 0) {
                    String str2 = split[0];
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("name", str2);
                    for (int i = 1; i < split.length; i += 2) {
                        hashMap4.put(split[i], split[i + 1]);
                    }
                    hashMap2.put("extra", hashMap4);
                }
            }
            if (fxp.l(fxp.j())) {
                e.b("startupContextFixed", hashMap2);
            } else {
                e.b("startupContext", hashMap2);
            }
        }
    }
}
