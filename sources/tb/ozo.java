package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ozo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f25769a;

    public static String a() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("602bfb32", new Object[0]);
        }
        try {
            Object e = ztn.e("com.taobao.updatecenter.hotpatch.HotPatchManager", "getInstance");
            if (e == null || (a2 = ztn.a(e, "getPatchSuccessedVersion")) == null) {
                return null;
            }
            return a2 + "";
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9a7c002f", new Object[0]);
        }
        Context g = o2w.k().g();
        if (g != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f25769a;
            if (!concurrentHashMap.containsKey(AdvertisementOption.PRIORITY_VALID_TIME)) {
                String c = c(g, "package_type");
                if (!TextUtils.isEmpty(c)) {
                    concurrentHashMap.put(AdvertisementOption.PRIORITY_VALID_TIME, c);
                } else {
                    concurrentHashMap.put(AdvertisementOption.PRIORITY_VALID_TIME, "");
                }
            }
            if (!concurrentHashMap.containsKey(MspDBHelper.BizEntry.COLUMN_NAME_PID)) {
                String c2 = c(g, "project_id");
                if (!TextUtils.isEmpty(c2)) {
                    concurrentHashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, c2);
                } else {
                    concurrentHashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, "");
                }
            }
            if (!concurrentHashMap.containsKey("bid")) {
                String c3 = c(g, "build_id");
                if (!TextUtils.isEmpty(c3)) {
                    concurrentHashMap.put("bid", c3);
                } else {
                    concurrentHashMap.put("bid", "");
                }
            }
            if (!concurrentHashMap.containsKey("bv")) {
                String c4 = c(g, "base_version");
                if (!TextUtils.isEmpty(c4)) {
                    concurrentHashMap.put("bv", c4);
                } else {
                    concurrentHashMap.put("bv", "");
                }
            }
        }
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            ((ConcurrentHashMap) f25769a).put("hv", a2);
        } else {
            ((ConcurrentHashMap) f25769a).put("hv", "");
        }
        Map<String, String> map = f25769a;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) map;
        if (!concurrentHashMap2.containsKey("sdk-version")) {
            concurrentHashMap2.put("sdk-version", g0v.b().a());
        }
        return map;
    }

    static {
        t2o.a(962593027);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f25769a = concurrentHashMap;
        concurrentHashMap.put("sdk-version", g0v.b().a());
    }

    public static String c(Context context, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e9ea5c", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            i = context.getResources().getIdentifier(str, "string", context.getPackageName());
        } catch (Throwable th) {
            nhh.v("SdkMeta", "getString Id error", th);
        }
        if (i != 0) {
            return context.getString(i);
        }
        return null;
    }
}
