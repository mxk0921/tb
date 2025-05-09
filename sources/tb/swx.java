package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.heytap.msp.keychain.a;
import com.heytap.msp.keychain.b;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class swx {
    static {
        t2o.a(253755426);
    }

    public static Bundle a(Context context, HashMap<String, String> hashMap) {
        Bundle bundle = new Bundle();
        bundle.putString("sessionId", UUID.randomUUID().toString().replace("-", ""));
        bundle.putString("pkg", context.getPackageName());
        bundle.putSerializable("item", hashMap);
        return bundle;
    }

    public static String b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            c3j.b("DeviceUtils", "getProperty: " + e.getMessage());
            return str2;
        }
    }

    public static <E> String c(List<E> list) {
        String str;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                str = list.get(i).toString();
            } else {
                str = "";
            }
            sb.append(str);
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static r4y d(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("msp_app_min_versioncode", 2010000);
        bundle.putString("msp_sdk_kit_name", "keychain");
        return (r4y) d3j.a(new qyx(context, bundle));
    }

    public static void e(int i, String str, a aVar) {
        b bVar = new b();
        bVar.f5210a = i;
        bVar.b = str;
        try {
            ((com.heytap.mspsdk.keychain.impl.a) aVar).a(bVar);
        } catch (RemoteException e) {
            e.printStackTrace();
            c3j.c("KeyChainImpl", e);
        }
    }
}
