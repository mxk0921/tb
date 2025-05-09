package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29252a;
    public final File b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ String a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2cd3348f", new Object[]{context});
            }
            return d(context);
        }

        public static /* synthetic */ void b(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fd8dda", new Object[]{context, str});
            } else {
                e(context, str);
            }
        }

        public static SharedPreferences c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("80af22", new Object[]{context});
            }
            return m7l.a(context, "TCrashSDK", 0);
        }

        public static String d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ee504818", new Object[]{context});
            }
            return c(context).getString("LAST_ANR_TIME", "");
        }

        public static void e(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b2428e9", new Object[]{context, str});
            } else {
                c(context).edit().putString("LAST_ANR_TIME", str).apply();
            }
        }
    }

    public u9u(Context context, File file) {
        this.f29252a = context;
        this.b = file;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b8b0d", new Object[]{this})).booleanValue();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.b));
            Pattern compile = Pattern.compile("-----\\spid\\s(\\d+?)\\sat\\s(.+?)\\s-----");
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!TextUtils.isEmpty(readLine)) {
                    Matcher matcher = compile.matcher(readLine);
                    if (matcher.find()) {
                        matcher.group(1);
                        String group = matcher.group(2);
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 != null) {
                            Matcher matcher2 = Pattern.compile("Cmd\\sline:\\s(.+)").matcher(readLine2);
                            if (matcher2.find() && matcher2.group(1).equals(njo.j(this.f29252a))) {
                                String a2 = a.a(this.f29252a);
                                if (!group.equals(a2)) {
                                    a.b(this.f29252a, a2);
                                    bufferedReader.close();
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ehh.b("TracesFinder", "this is not my anr");
        return false;
    }
}
