package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.parser.ExprParserParams;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f17189a = "";

    static {
        t2o.a(329253032);
    }

    public static boolean b(String str, Map<String, String> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff9c48b9", new Object[]{str, map, str2})).booleanValue();
        }
        boolean a2 = a(str, str2);
        if (a2 || map == null) {
            return a2;
        }
        String str3 = map.get("fullUrl");
        if (!TextUtils.isEmpty(str3)) {
            return a(str3, str2);
        }
        return a2;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5818c912", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(":") + 1;
        int indexOf2 = str.indexOf("?");
        if (indexOf2 > 0 && indexOf2 >= indexOf) {
            return str.substring(indexOf, indexOf2);
        }
        if (indexOf > 0) {
            return str.substring(indexOf);
        }
        return str;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c98702", new Object[0]);
        }
        try {
            if (TextUtils.isEmpty(f17189a)) {
                int myPid = Process.myPid();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) TScheduleInitialize.b().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == myPid) {
                            f17189a = next.processName;
                            break;
                        }
                    }
                }
                return f17189a;
            }
        } catch (Throwable unused) {
        }
        return f17189a;
    }

    public static String e(String str, String str2, String str3) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d7e8b32", new Object[]{str, str2, str3});
        }
        try {
            VariationSet activate = UTABTest.activate(str, str2);
            if (!(activate == null || (variation = activate.getVariation(str3)) == null)) {
                return variation.getValueAsString(null);
            }
            return null;
        } catch (Throwable th) {
            zdh.b("TS.utils", "parseUTABTest error", th);
            return null;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673df0ec", new Object[0])).booleanValue();
        }
        try {
            if ((TScheduleInitialize.b().getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        d();
        if (TextUtils.isEmpty(f17189a) || TextUtils.equals(TScheduleInitialize.f(), f17189a)) {
            return true;
        }
        return false;
    }

    public static boolean h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca60d0f2", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return Pattern.matches(str, str2);
    }

    public static TimeContent i(String str, List<TimeContent> list) {
        String d;
        String d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeContent) ipChange.ipc$dispatch("9aa3f12d", new Object[]{str, list});
        }
        xls c = xls.c(str, new Object[0]);
        cms c2 = cms.c(str, new Object[0]);
        if (c != null) {
            return TimeContent.create(c.b(null));
        }
        if (c2 != null) {
            return c2.b(new wp8(new ExprParserParams(null, null, null, list), TScheduleInitialize.d()));
        }
        int indexOf = str.indexOf(fms.PREFIX);
        if (indexOf > 0) {
            try {
                int indexOf2 = str.indexOf(str.charAt(indexOf - 1), indexOf);
                if (indexOf2 >= indexOf) {
                    String substring = str.substring(indexOf, indexOf2);
                    zdh.a("TS.utils", substring);
                    fms c3 = fms.c(substring, new Object[0]);
                    if (!(c3 == null || (d2 = c3.b(null)) == null)) {
                        return TimeContent.create(str.replace(substring, d2));
                    }
                }
            } catch (Throwable unused) {
                return TimeContent.create(str);
            }
        } else if (indexOf == 0) {
            try {
                String substring2 = str.substring(indexOf);
                zdh.a("TS.utils", substring2);
                fms c4 = fms.c(substring2, new Object[0]);
                if (!(c4 == null || (d = c4.b(null)) == null)) {
                    return TimeContent.create(str.replace(substring2, d));
                }
            } catch (Exception e) {
                e.printStackTrace();
                return TimeContent.create(str);
            }
        }
        return TimeContent.create(str);
    }

    public static void j(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95feb47a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        vms.c().g("h5", str);
        vms.c().g("miniApp", str2);
        vms.c().g(vms.PROTOCOL_BIZ_CODE_PHA, str3);
        vms.c().f("h5", str4);
        vms.c().f("miniApp", str5);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32e6b7e8", new Object[]{str, str2})).booleanValue();
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("spm");
            if (!TextUtils.isEmpty(queryParameter)) {
                String[] split = queryParameter.split("\\.");
                if (split.length >= 2) {
                    String str3 = split[1];
                    if (!TextUtils.isEmpty(str2)) {
                        String[] split2 = str2.trim().split(",");
                        if ((split2.length == 1 && "*".equals(split2[0])) || Arrays.asList(split2).contains(str3)) {
                            return true;
                        }
                    }
                }
            } else {
                String[] split3 = str2.trim().split(",");
                if (split3.length == 1 && "*".equals(split3[0])) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
