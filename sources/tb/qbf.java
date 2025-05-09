package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qbf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092392);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ec1888", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("hit", "true");
        hashMap.put("itemSourceType", str2);
        v2s.o().E().track4Show("Page_TaobaoLiveWatch", "PreloadItemHit", hashMap);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e9ae8d", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("insideDetailType", str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("code", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            if (str4.length() > 100) {
                str4 = str4.substring(0, 99);
            }
            hashMap.put("url", str4);
        }
        v2s.o().E().track4Show("Page_TaobaoLiveWatch", str, hashMap);
    }
}
