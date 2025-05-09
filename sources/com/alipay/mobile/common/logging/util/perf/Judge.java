package com.alipay.mobile.common.logging.util.perf;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Judge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Judge c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4007a;
    public final Map<String, String> b;

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            Map<String, String> startupReason = LoggerFactory.getProcessInfo().getStartupReason();
            String str = "";
            if (startupReason != null) {
                str = startupReason.get(ProcessInfo.SR_COMPONENT_NAME);
            }
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
                if (str != null && str.contains(resolveInfo.activityInfo.name)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Judge getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Judge) ipChange.ipc$dispatch("c40e484f", new Object[]{context});
        }
        if (c == null) {
            synchronized (Judge.class) {
                try {
                    if (c == null) {
                        c = new Judge(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final void b(List<Long> list) {
        SharedPreferences judgeSP;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && list.size() > 0 && (judgeSP = getJudgeSP()) != null) {
            StringBuilder sb = new StringBuilder();
            for (Long l : list) {
                if (l != null) {
                    if (sb.length() > 0) {
                        sb.append("-");
                    }
                    sb.append(l);
                }
            }
            if (sb.length() > 0) {
                judgeSP.edit().putString(Constants.KEY_LAUNCH_TIME_LIST, sb.toString()).apply();
            }
        }
    }

    public SharedPreferences getJudgeSP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("93971099", new Object[]{this});
        }
        Context context = this.f4007a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(Constants.SP_NAME, 0);
    }

    public synchronized Map<String, String> getJudgement() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1214befb", new Object[]{this});
        }
        return this.b;
    }

    public synchronized void judgeForNoneUIProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b087f8", new Object[]{this});
            return;
        }
        ((HashMap) this.b).clear();
        SharedPreferences judgeSP = getJudgeSP();
        String str = "disable";
        if (judgeSP != null) {
            str = judgeSP.getString(Constants.KEY_TOOLS_CONTROL, "disable");
        }
        if ("enable".equals(str)) {
            try {
                if (new File(this.f4007a.getFilesDir(), "process_start_tag").exists()) {
                    ((HashMap) this.b).put(Constants.PARAM_TOOLS_DOWNGRADE, Constants.VAL_YES);
                }
            } catch (Throwable unused) {
            }
        }
        if (!((HashMap) this.b).containsKey(Constants.PARAM_PERF_LEVEL)) {
            ((HashMap) this.b).put(Constants.PARAM_PERF_LEVEL, "3");
        }
        if (!((HashMap) this.b).containsKey(Constants.PARAM_TOOLS_DOWNGRADE)) {
            ((HashMap) this.b).put(Constants.PARAM_TOOLS_DOWNGRADE, "no");
        }
        ((HashMap) this.b).get(Constants.PARAM_PERF_LEVEL);
        ((HashMap) this.b).get(Constants.PARAM_TOOLS_DOWNGRADE);
    }

    public void recordColdClientLaunchTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95150add", new Object[]{this, new Long(j)});
        } else if (j > 0 && j <= 30000) {
            List<Long> a2 = a();
            if (a2 == null) {
                a2 = new ArrayList<>();
            }
            while (a2.size() >= 3) {
                a2.remove(0);
            }
            a2.add(Long.valueOf(j));
            b(a2);
        }
    }

    public Judge(Context context) {
        long j;
        this.f4007a = null;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        Context applicationContext = context.getApplicationContext();
        this.f4007a = applicationContext;
        if (applicationContext == null) {
            this.f4007a = context;
        }
        hashMap.clear();
        if (c(this.f4007a)) {
            SharedPreferences judgeSP = getJudgeSP();
            String str = "disable";
            if ("enable".equals(judgeSP != null ? judgeSP.getString(Constants.KEY_JUDGE_CONTROL, str) : str)) {
                List<Long> a2 = a();
                int i = 0;
                if (a2 != null) {
                    j = 0;
                    for (Long l : a2) {
                        if (l != null) {
                            j += l.longValue();
                            i++;
                        }
                    }
                } else {
                    j = 0;
                }
                long j2 = Constants.STARTUP_TIME_LEVEL_1;
                if (judgeSP != null) {
                    try {
                        String string = judgeSP.getString(Constants.KEY_JUDGE_NO_WRITE_STARTUP_TIME, "-1");
                        if (!TextUtils.isEmpty(string) && !"-1".equals(string)) {
                            j2 = Long.valueOf(string).longValue();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (i > 0) {
                    long j3 = j / i;
                    if (j3 > j2) {
                        ((HashMap) this.b).put(Constants.PARAM_PERF_LEVEL, "1");
                    } else if (j3 > 2000) {
                        ((HashMap) this.b).put(Constants.PARAM_PERF_LEVEL, "2");
                    } else if (j3 > 0) {
                        ((HashMap) this.b).put(Constants.PARAM_PERF_LEVEL, "2");
                    }
                }
            }
            if ("enable".equals(judgeSP != null ? judgeSP.getString(Constants.KEY_TOOLS_CONTROL, str) : str)) {
                ((HashMap) this.b).put(Constants.PARAM_TOOLS_DOWNGRADE, Constants.VAL_YES);
            }
        }
        if (!((HashMap) this.b).containsKey(Constants.PARAM_PERF_LEVEL)) {
            ((HashMap) this.b).put(Constants.PARAM_PERF_LEVEL, "3");
        }
        if (!((HashMap) this.b).containsKey(Constants.PARAM_TOOLS_DOWNGRADE)) {
            ((HashMap) this.b).put(Constants.PARAM_TOOLS_DOWNGRADE, "no");
        }
        ((HashMap) this.b).get(Constants.PARAM_PERF_LEVEL);
        ((HashMap) this.b).get(Constants.PARAM_TOOLS_DOWNGRADE);
    }

    public final List<Long> a() {
        String[] split;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        SharedPreferences judgeSP = getJudgeSP();
        if (judgeSP == null) {
            return null;
        }
        String string = judgeSP.getString(Constants.KEY_LAUNCH_TIME_LIST, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : string.split("-")) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    j = Long.parseLong(str);
                } catch (Throwable unused) {
                    j = -1;
                }
                if (j != -1) {
                    arrayList.add(Long.valueOf(j));
                }
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        return arrayList;
    }
}
