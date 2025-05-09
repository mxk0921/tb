package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class py8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f26396a = "__NULL__";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(475004940);
        }

        public static SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("6cb3acc2", new Object[]{str});
            }
            Context context = q4a.b;
            if (context != null) {
                return context.getSharedPreferences(str, 0);
            }
            return null;
        }

        public static String b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
            }
            return c(str, str2, str3);
        }

        public static String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4de5145d", new Object[]{str, str2, str3});
            }
            SharedPreferences a2 = a(str);
            if (a2 != null) {
                return a2.getString(str2, str3);
            }
            return str3;
        }

        public static void d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48297325", new Object[]{str, str2, str3});
            } else {
                e(str, str2, str3);
            }
        }

        public static void e(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc54da1c", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences a2 = a(str);
            if (a2 != null) {
                SharedPreferences.Editor edit = a2.edit();
                edit.putString(str2, str3);
                edit.apply();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static final py8 instance = new py8();

        static {
            t2o.a(475004941);
        }
    }

    static {
        t2o.a(475004938);
    }

    public static py8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (py8) ipChange.ipc$dispatch("4bc0125f", new Object[0]);
        }
        return c.instance;
    }

    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        String b2 = b.b(str, str2, str3);
        if (TextUtils.equals(b2, f26396a)) {
            return str3;
        }
        return b2;
    }

    public py8() {
    }
}
