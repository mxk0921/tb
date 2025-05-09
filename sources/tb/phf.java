package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class phf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f26093a = -1;
    public static List<String> b;
    public static List<String> c;

    static {
        t2o.a(806356560);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab41b9fe", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableRequestTradeTrack", "true"));
    }

    public static boolean b(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("769b6389", new Object[]{context})).booleanValue();
        }
        if (iw0.j(context)) {
            str = "true";
        } else {
            str = "false";
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableBlockOptABTest", str));
        }
        return false;
    }

    public static boolean a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c7d743c", new Object[]{context})).booleanValue();
        }
        if (iw0.j(context)) {
            str = "true";
        } else {
            str = "false";
        }
        if (f26093a == -1) {
            if (!b(context) || v2s.o().c() == null) {
                f26093a = 0;
            } else {
                f26093a = zqq.c(v2s.o().c().b("taolive", "BlockOpt", "enable", str)) ? 1 : 0;
            }
        }
        return f26093a == 1;
    }

    public static boolean c(String str, String str2) {
        List<String> list;
        List<String> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce3687db", new Object[]{str, str2})).booleanValue();
        }
        if (b == null) {
            String stringSharedPreference = v2s.o().p().getStringSharedPreference("tblive", "isNeedShowH5LiveSourceBlackList", "");
            if (!TextUtils.isEmpty(stringSharedPreference)) {
                b = Arrays.asList(stringSharedPreference.split(";"));
            }
        }
        if (!TextUtils.isEmpty(str) && (list2 = b) != null) {
            for (String str3 : list2) {
                if (str.startsWith(str3)) {
                    return false;
                }
            }
        }
        if (c == null) {
            String stringSharedPreference2 = v2s.o().p().getStringSharedPreference("tblive", "isNeedShowH5EntryLiveSourceBlackList", "");
            if (!TextUtils.isEmpty(stringSharedPreference2)) {
                c = Arrays.asList(stringSharedPreference2.split(";"));
            }
        }
        if (!TextUtils.isEmpty(str2) && (list = c) != null) {
            for (String str4 : list) {
                if (str2.startsWith(str4)) {
                    return false;
                }
            }
        }
        return true;
    }
}
