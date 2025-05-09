package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.TLogEventHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16894a = false;
    public static boolean b = false;

    static {
        t2o.a(767557690);
    }

    public static void a(Context context, int i, int i2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b801f231", new Object[]{context, new Integer(i), new Integer(i2)});
            return;
        }
        if (i > 10000 || i < 0) {
            i = 4000;
        }
        if (i2 > 10000 || i2 < 0) {
            i2 = 2000;
        }
        try {
            int nextInt = new Random().nextInt(10000);
            if (nextInt < i) {
                z = true;
            } else {
                z = false;
            }
            f16894a = z;
            if (nextInt < i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            b = z2;
            Log.e("TLogStatistics", String.format("TLog statistic ut_enable=%b, file_enable=%b, randomRate=%d, configRate=%d，fileRate=%d", Boolean.valueOf(z), Boolean.valueOf(b), Integer.valueOf(nextInt), Integer.valueOf(i), Integer.valueOf(i2)));
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("TLogStatistics", "TLogStatisticsManager init exception!");
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4d01fa2", new Object[0])).booleanValue();
        }
        return f16894a;
    }

    public static void c(Context context) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae16842", new Object[]{context});
            return;
        }
        try {
            if (q4s.h() || (f16894a && b)) {
                long currentTimeMillis = System.currentTimeMillis();
                String e = n6s.e(currentTimeMillis);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                String string = defaultSharedPreferences.getString("tlog_file_statistics_timestamp", "");
                if (!TextUtils.isEmpty(e) && !e.equals(string)) {
                    String e2 = n6s.e(currentTimeMillis - 86400000);
                    ArrayList arrayList = new ArrayList();
                    long j = 0;
                    long j2 = 0;
                    int i2 = 0;
                    int i3 = 0;
                    for (String str : b5s.f()) {
                        File file = new File(str);
                        if (file.exists() && file.isFile()) {
                            i2 += i;
                            j += file.length();
                            String name = file.getName();
                            int indexOf = name.indexOf("_");
                            int indexOf2 = name.indexOf(b5s.LOG_SUFFIX_DATA);
                            if (indexOf2 == -1) {
                                indexOf2 = name.indexOf(b5s.LOG_SUFFIX_TLOG);
                            }
                            if (!(indexOf == -1 || indexOf2 == -1)) {
                                String substring = name.substring(indexOf + 1, indexOf2);
                                if (!arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                                if (substring.equals(e2)) {
                                    i3++;
                                    j2 += file.length();
                                    i = 1;
                                }
                            }
                        }
                        i = 1;
                    }
                    TLogEventHelper.h(i2, j, arrayList.size(), i3, j2);
                    defaultSharedPreferences.edit().putString("tlog_file_statistics_timestamp", e).apply();
                    return;
                }
                return;
            }
            Log.e("TLogStatistics", "statistics file is disable");
        } catch (Exception e3) {
            e3.printStackTrace();
            Log.e("TLogStatistics", "statisticsFile exception!");
        }
    }
}
