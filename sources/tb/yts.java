package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yts {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699527);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257656f1", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            for (byte b : instance.digest()) {
                sb.append(Integer.toHexString(b & 255));
            }
        } catch (NoSuchAlgorithmException unused) {
            sb = null;
        }
        if (sb == null) {
            return "";
        }
        return sb.toString();
    }

    public static String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f69cf0a", new Object[]{str, str2, str3});
        }
        return str.replaceAll("([?&])" + str2 + "=[^&]*", str3);
    }

    public static void d(String str, String str2, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf63f47", new Object[]{str, str2, liveItem});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("liveId", liveItem.liveId);
        hashMap.put("itemId", liveItem.itemId + "");
        hashMap.put("scene", str2);
        hashMap.put(rg0.JUMP_URL, str);
        if (kkr.i().o() != null) {
            kkr.i().o().c("liveNewtonExceptionMonitor", hashMap);
        }
    }

    public static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e004685", new Object[]{str});
        }
        try {
            String[] split = str.split("\\?");
            if (split.length <= 1 || (str2 = split[1]) == null) {
                return "";
            }
            for (String str3 : str2.split("&")) {
                String[] split2 = str3.split("=");
                if (split2.length > 1 && "newtonParams".equals(split2[0])) {
                    return split2[1];
                }
            }
            return "";
        } catch (Throwable th) {
            v7t.d("TaoLiveAdapterUriUtils", "getNewtonParamForUrl error msg=" + th);
            return "";
        }
    }
}
