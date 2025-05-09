package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class szl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f28375a;

    public szl() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.f28375a = hashMap;
        hashMap.put("android.permission.READ_CONTACTS", Localization.q(R.string.taobao_app_1040_1_23514));
        hashMap.put(t4p.CAMERA, Localization.q(R.string.taobao_app_1040_1_23512));
        hashMap.put("android.permission.READ_PHONE_STATE", Localization.q(R.string.taobao_app_1040_1_23511));
        int i = R.string.taobao_app_1040_1_23510;
        hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", Localization.q(i));
        int i2 = R.string.taobao_app_1040_1_23519;
        hashMap.put("android.permission.ACCESS_COARSE_LOCATION", Localization.q(i2));
        hashMap.put(p78.ACCESS_FINE_LOCATION, Localization.q(i2));
        hashMap.put("android.permission.RECORD_AUDIO", Localization.q(R.string.taobao_app_1040_1_23518));
        hashMap.put("android.permission.READ_EXTERNAL_STORAGE", Localization.q(i));
        hashMap.put("android.permission.WRITE_MEDIA_STORAGE", Localization.q(i));
        hashMap.put("android.permission.GET_ACCOUNTS", Localization.q(R.string.taobao_app_1040_1_23509));
    }

    public String a(Context context, String[] strArr, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f083eb2d", new Object[]{this, context, strArr, str});
        }
        if ("com.taobao.taobao".equals(context.getPackageName())) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArr) {
                if (!(str3 == null || (str2 = this.f28375a.get(str3)) == null || sb.indexOf(str2) >= 0)) {
                    if (sb.length() != 0) {
                        sb.append("\n");
                        sb.append(str2);
                    } else {
                        sb.append(str2);
                    }
                }
            }
            if (sb.length() != 0) {
                return sb.toString();
            }
        }
        return str;
    }
}
