package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475005035);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d33a3002", new Object[]{str})).booleanValue();
        }
        if (str == "true") {
            return true;
        }
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 1) {
            char charAt = str.charAt(0);
            return charAt == 'Y' || charAt == 'y';
        } else if (length != 2) {
            if (length == 3) {
                char charAt2 = str.charAt(0);
                if (charAt2 == 'y') {
                    if (str.charAt(1) == 'e' || str.charAt(1) == 'E') {
                        return str.charAt(2) == 's' || str.charAt(2) == 'S';
                    }
                    return false;
                } else if (charAt2 == 'Y') {
                    if (str.charAt(1) == 'E' || str.charAt(1) == 'e') {
                        return str.charAt(2) == 'S' || str.charAt(2) == 's';
                    }
                    return false;
                }
            } else if (length != 4) {
                return false;
            }
            char charAt3 = str.charAt(0);
            if (charAt3 == 't') {
                if (str.charAt(1) != 'r' && str.charAt(1) != 'R') {
                    return false;
                }
                if (str.charAt(2) == 'u' || str.charAt(2) == 'U') {
                    return str.charAt(3) == 'e' || str.charAt(3) == 'E';
                }
                return false;
            } else if (charAt3 != 'T') {
                return false;
            } else {
                if (str.charAt(1) != 'R' && str.charAt(1) != 'r') {
                    return false;
                }
                if (str.charAt(2) == 'U' || str.charAt(2) == 'u') {
                    return str.charAt(3) == 'E' || str.charAt(3) == 'e';
                }
                return false;
            }
        } else {
            char charAt4 = str.charAt(0);
            char charAt5 = str.charAt(1);
            if (charAt4 == 'o' || charAt4 == 'O') {
                return charAt5 == 'n' || charAt5 == 'N';
            }
            return false;
        }
    }
}
