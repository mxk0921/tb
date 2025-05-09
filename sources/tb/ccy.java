package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ccy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map f16985a;
    public static final Map b;

    static {
        t2o.a(676331642);
        HashMap hashMap = new HashMap();
        f16985a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap.put(-1, "Too many sessions are running for current app, existing sessions must be resolved first.");
        hashMap.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        hashMap.put(-3, "Request is otherwise invalid.");
        hashMap.put(-4, "Requested session is not found.");
        hashMap.put(-5, "Split Install API is not available.");
        hashMap.put(-6, "Network error: unable to obtain split details.");
        hashMap.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        hashMap.put(-8, "Requested session contains modules from an existing active session and also new");
        hashMap.put(-9, "Service handling split install has died.");
        hashMap.put(-10, "Install failed due to insufficient storage.");
        hashMap.put(-11, "Signature verification error when invoking SplitCompat.");
        hashMap.put(-12, "Error in SplitCompat emulation.");
        hashMap.put(-13, "Error in copying files for SplitCompat.");
        hashMap.put(-100, "Unknown error processing split install.");
        hashMap2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        hashMap2.put(-2, "MODULE_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(-4, "SESSION_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(-6, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        hashMap2.put(-9, "SERVICE_DIED");
        hashMap2.put(-10, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        hashMap2.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        hashMap2.put(-13, "SPLITCOMPAT_COPY_ERROR");
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbfc60d0", new Object[]{new Integer(i)});
        }
        Map map = f16985a;
        if (!((HashMap) map).containsKey(Integer.valueOf(i))) {
            return "";
        }
        Map map2 = b;
        if (!((HashMap) map2).containsKey(Integer.valueOf(i))) {
            return "";
        }
        String str = (String) ((HashMap) map).get(Integer.valueOf(i));
        String str2 = (String) ((HashMap) map2).get(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 118 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#");
        sb.append(str2);
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }
}
