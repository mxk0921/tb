package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w9u implements x7e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626492);
        t2o.a(625999992);
    }

    public void b(int i, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1808521d", new Object[]{this, new Integer(i), str, str2, str3, str4, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
        } catch (Throwable th) {
            wdm.h("TrackAdapter trackCustom error.", th);
        }
    }

    public void a(String str, String str2, BaseConfigItem baseConfigItem, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2800f1f", new Object[]{this, str, str2, baseConfigItem, map, new Boolean(z)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (map == null) {
                    map = new HashMap<>();
                }
                if (!y9u.f().e(str, baseConfigItem)) {
                    wdm.d("TrackConfigManager getUTEnable == false", new Object[0]);
                } else if (str.equals(auv.EVENT_CATEGORY_FULL_UP) || y9u.f().c(str, baseConfigItem, z)) {
                    if (!auv.a().b(str)) {
                        if (baseConfigItem != null && !TextUtils.isEmpty(baseConfigItem.uuid)) {
                            map.put("uuid", baseConfigItem.uuid);
                        }
                        if (z) {
                            map.put("realTime", "true");
                        }
                    }
                    UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("PopLayer_".concat(str));
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "NonePage";
                    }
                    uTHitBuilders$UTCustomHitBuilder.setEventPage(str2);
                    uTHitBuilders$UTCustomHitBuilder.setProperties(map);
                    UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
                } else {
                    wdm.d("TrackConfigManager category %s is not enable", str);
                }
            }
        } catch (Throwable th) {
            wdm.h("TrackAdapter track error.", th);
        }
    }
}
