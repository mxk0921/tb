package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class feh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19240a;
    public String b;

    static {
        t2o.a(774897848);
    }

    public feh(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str.contains("@")) {
            this.f19240a = d(str);
        } else if (TextUtils.isEmpty(str) || !str.contains("{")) {
            this.f19240a = "[" + str + "]";
        } else {
            this.f19240a = e(str);
        }
        this.b = str2;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc44e24c", new Object[]{str});
        }
        int indexOf = str.indexOf(64);
        if (indexOf > 0) {
            int lastIndexOf = str.lastIndexOf(46);
            return "[" + str.substring(lastIndexOf + 1, indexOf) + str.substring(indexOf) + "]";
        }
        return "[" + str + "]";
    }

    public static String e(String str) {
        int indexOf;
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28542f9b", new Object[]{str});
        }
        if (str == null || str.isEmpty()) {
            return "InvalidInput";
        }
        int length = str.length();
        int i2 = -1;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == '.' && i > i2) {
                i2 = i;
            } else if (charAt == '{') {
                break;
            }
            i++;
        }
        if (i2 == -1 || i == -1 || (indexOf = str.indexOf(125, i)) == -1) {
            return "InvalidFormat";
        }
        String substring = str.substring(i2 + 1, i);
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 != -1) {
            str2 = str.substring(i + 1, indexOf2);
        } else {
            str2 = str.substring(i + 1, indexOf);
        }
        return "[" + substring + "@" + str2 + "]";
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
        }
        return this.f19240a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb989ea", new Object[]{this});
        }
        return this.b;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db56f34", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
