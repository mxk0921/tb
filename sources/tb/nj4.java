package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nj4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, String> f24769a;
    public static final Map<Integer, String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f24770a;
        public final StringBuilder b = new StringBuilder();

        static {
            t2o.a(677380105);
        }
    }

    static {
        t2o.a(677380104);
        HashMap hashMap = new HashMap();
        f24769a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap.put(1, "No error occurred; only some types of update flow are allowed, while others are forbidden.");
        hashMap.put(-2, "An unknown error occurred.");
        hashMap.put(-3, "The API is not available on this device.");
        hashMap.put(-4, "The request that was sent by the app is malformed.");
        hashMap.put(-5, "The install is unavailable to this user or device.");
        hashMap.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        hashMap.put(-7, "The install/update has not been (fully) downloaded yet.");
        hashMap.put(-8, "The install is already in progress and there is no UI flow to resume.");
        hashMap.put(-100, "An internal error happened in the Play Store.");
        hashMap2.put(1, "NO_ERROR_PARTIALLY_ALLOWED");
        hashMap2.put(-2, "ERROR_UNKNOWN");
        hashMap2.put(-3, "ERROR_API_NOT_AVAILABLE");
        hashMap2.put(-4, "ERROR_INVALID_REQUEST");
        hashMap2.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        hashMap2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        hashMap2.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        hashMap2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        hashMap2.put(-100, "ERROR_INTERNAL_ERROR");
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9121b1d5", new Object[]{new Integer(i)});
        }
        Map<Integer, String> map = f24769a;
        if (!((HashMap) map).containsKey(Integer.valueOf(i))) {
            return "";
        }
        Map<Integer, String> map2 = b;
        if (!((HashMap) map2).containsKey(Integer.valueOf(i))) {
            return "";
        }
        String str = (String) ((HashMap) map).get(Integer.valueOf(i));
        String str2 = (String) ((HashMap) map2).get(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
        sb.append(str2);
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }
}
