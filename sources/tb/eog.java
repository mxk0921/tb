package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837416);
    }

    public static String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe172f69", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra("openFrom");
        Uri data = intent.getData();
        if (data == null) {
            return stringExtra;
        }
        return TextUtils.isEmpty(stringExtra) ? data.getQueryParameter("openFrom") : null;
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185f0", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("c1", str2);
        }
        sj.b("下单降级H5监控", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.lightbuy.monitor", "downgrade_native_android", "1", hashMap, str);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b2ded6", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("c1", str2);
        }
        sj.b("light-buy异常", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.lightbuy.monitor", "lightbuy_exception_android", "1", hashMap, str);
    }

    public static void d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c764b67", new Object[]{intent});
            return;
        }
        HashMap hashMap = new HashMap();
        String a2 = a(intent);
        if (a2 == null) {
            a2 = "";
        }
        sj.b("light-buy曝光", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.lightbuy.monitor", "lightbuy_exposure_android", "1", hashMap, a2);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd32fcc", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("c1", str2);
        }
        sj.b("light-buy实例预热", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.lightbuy.monitor", "lightbuy_instance_preload_android", "1", hashMap, str);
    }
}
