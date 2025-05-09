package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dbr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f17713a;

    static {
        t2o.a(491782148);
    }

    public dbr() {
        String d = mve.d("messiahMainBizWhiteList", "Page_Home_VideoPlayer_Count,Page_Home_VideoPlayer");
        if (TextUtils.isEmpty(d)) {
            this.f17713a = null;
            return;
        }
        try {
            this.f17713a = d.split(",");
        } catch (Throwable th) {
            fve.c("TBDefaultMessiah", "init white list error", th);
            this.f17713a = null;
        }
    }

    public void a(String str, String str2, String str3, Map<String, String> map, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9361d0", new Object[]{this, str, str2, str3, map, str4});
        } else if (b(str3)) {
            HashMap hashMap = new HashMap(16);
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(map);
            }
            hashMap.put("featureType", str);
            hashMap.put("tagId", str2);
            hashMap.put("errorCode", str4);
            gve.b(str3, str, hashMap);
        }
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7fb1205", new Object[]{this, str})).booleanValue();
        }
        String[] strArr = this.f17713a;
        if (!(strArr == null || strArr.length == 0)) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
