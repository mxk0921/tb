package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tro {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481296700);
    }

    public static HashMap<String, String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("cf9b176b", new Object[]{str, str2});
        }
        HashMap<String, String> hashMap = new HashMap<>(10);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("spm", str);
        }
        hashMap.put("rainbow", e0.b());
        hashMap.put(k7m.KEY_DEVICE_TYPE, k7m.a());
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("pssource", str2);
        }
        return hashMap;
    }

    public static long b(Activity activity, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfa09bc", new Object[]{activity, bitmap})).longValue();
        }
        if (!c(activity)) {
            return 0L;
        }
        if (gd2.INSTANCE.s(activity, bitmap)) {
            return lg4.x0();
        }
        return lg4.C1();
    }

    public static boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5dc927", new Object[]{activity})).booleanValue();
        }
        xr1 l = l53.l(activity);
        if (l != null) {
            return l.isScanMode();
        }
        agh.c("ScanBizUtil", "baseCaptureController is null, it must something wrong");
        return false;
    }
}
