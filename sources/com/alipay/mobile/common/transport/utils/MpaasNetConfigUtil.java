package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.man;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MpaasNetConfigUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f4146a;
    public static List<String> b;

    public static List<String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("962721e7", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        try {
            String str = getMpaasNetConfigProperties(context).get("GWWhiteList");
            LogCatUtil.printInfo("MpaasNetConfigUtil", "GWWhiteList: " + str);
            if (TextUtils.isEmpty(str)) {
                return arrayList;
            }
            for (String str2 : str.split(",")) {
                arrayList.add(str2);
            }
            return arrayList;
        } catch (Throwable th) {
            LogCatUtil.error("MpaasNetConfigUtil", "doGetGWWhiteList ex:" + th.toString());
            return arrayList;
        }
    }

    public static final Map<String, String> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7c4b7f4", new Object[]{context});
        }
        try {
            InputStream open = context.getAssets().open("mpaas_netconfig.properties");
            Properties properties = new Properties();
            properties.load(open);
            if (properties.size() <= 0) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap(properties.size());
            for (Map.Entry entry : properties.entrySet()) {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
            LogCatUtil.info("MpaasNetConfigUtil", "mpaas_netconfig properties loaded， size: " + hashMap.size());
            return hashMap;
        } catch (IOException e) {
            LogCatUtil.warn("MpaasNetConfigUtil", "mpaas_netconfig properties load fail. " + e.toString());
            return Collections.emptyMap();
        } catch (Throwable th) {
            LogCatUtil.error("MpaasNetConfigUtil", "mpaas_netconfig properties load fail. ", th);
            return Collections.emptyMap();
        }
    }

    public static byte getAsymmetricEncryptMethod(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f84c433", new Object[]{context})).byteValue();
        }
        try {
            str = getMpaasNetConfigProperties(context).get("RSA/ECC/SM2");
        } catch (Throwable th) {
            LogCatUtil.error("MpaasNetConfigUtil", "getAsymmetricEncryptMethod. ex: " + th.toString());
        }
        if (TextUtils.equals(str, man.KEY_ALGORITHM)) {
            return (byte) 1;
        }
        if (TextUtils.equals(str, "ECC")) {
            return (byte) 2;
        }
        if (TextUtils.equals(str, "SM2")) {
            return (byte) 3;
        }
        return (byte) 1;
    }

    public static List<String> getGWWhiteList(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c65a49c7", new Object[]{context});
        }
        try {
            List<String> list = b;
            if (list != null) {
                return list;
            }
            synchronized (MpaasNetConfigUtil.class) {
                if (b == null) {
                    b = a(context);
                }
            }
            return b;
        } catch (Throwable th) {
            LogCatUtil.error("MpaasNetConfigUtil", "getGWWhiteList ex:" + th.toString(), th);
            return new ArrayList();
        }
    }

    public static final Map<String, String> getMpaasNetConfigProperties(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("74a3613e", new Object[]{context});
        }
        Map<String, String> map = f4146a;
        if (map != null) {
            return map;
        }
        synchronized (MpaasNetConfigUtil.class) {
            try {
                if (f4146a == null) {
                    f4146a = b(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4146a;
    }

    public static String getPublicKey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e653de1f", new Object[]{context});
        }
        try {
            return getMpaasNetConfigProperties(context).get("PubKey");
        } catch (Throwable th) {
            LogCatUtil.error("MpaasNetConfigUtil", "getPublicKey ex: " + th.toString());
            return "";
        }
    }

    public static boolean isCrypt(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a423d41", new Object[]{context})).booleanValue();
        }
        try {
            String str = getMpaasNetConfigProperties(context).get("Crypt");
            if (!TextUtils.equals(str, "TRUE")) {
                if (!TextUtils.equals(str, "true")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            LogCatUtil.error("MpaasNetConfigUtil", "isCrypt. ex: " + th.toString());
            return false;
        }
    }

    public static boolean isDefaultGlobalCrypt(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93051451", new Object[]{context})).booleanValue();
        }
        try {
            return !TextUtils.equals(getMpaasNetConfigProperties(context).get("DefaultGlobalCrypt"), "false");
        } catch (Throwable th) {
            LogCatUtil.error("MpaasNetConfigUtil", "isDefaultGlobalCrypt ex: " + th.toString());
            return true;
        }
    }
}
