package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.apk.MainUpdateData;
import com.taobao.update.framework.UpdateRuntime;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z9k implements czm<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int notifyTimes = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MINITAO_FROM_DAY = "minitao_fromday";
        public static final String MINITAO_NOTIFICATION = "minitao_notification";

        static {
            t2o.a(953155611);
        }

        public static String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("da3372e6", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            return str + format;
        }

        public static void clear(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("769f891e", new Object[]{str});
                return;
            }
            SharedPreferences.Editor edit = getDatabase().edit();
            String a2 = a(str);
            edit.clear();
            edit.putInt(a2, 0);
            edit.commit();
        }

        public static int get(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1161055a", new Object[]{str})).intValue();
            }
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return getDatabase().getInt(a(str), -1);
        }

        public static SharedPreferences getDatabase() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("8734e5cc", new Object[0]);
            }
            return UpdateRuntime.getContext().getSharedPreferences("notification_record", 0);
        }

        public static void update(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab067fa9", new Object[]{str, new Integer(i)});
            } else if (!TextUtils.isEmpty(str) && i > 0) {
                int i2 = get(str);
                SharedPreferences.Editor edit = getDatabase().edit();
                String a2 = a(str);
                if (i2 <= 0) {
                    edit.clear();
                    edit.putInt(a2, 1);
                } else if (i2 < i) {
                    edit.putInt(a2, i2 + 1);
                }
                edit.commit();
            }
        }
    }

    static {
        t2o.a(953155610);
        t2o.a(947912754);
    }

    public static int differentDays(Date date, Date date2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("580ac66c", new Object[]{date, date2})).intValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date2);
        int i2 = instance.get(6);
        int i3 = instance2.get(6);
        int i4 = instance.get(1);
        int i5 = instance2.get(1);
        if (i4 == i5) {
            return i3 - i2;
        }
        while (i4 < i5) {
            if ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) {
                i += yh6.DEFAULT_EXPIRED_TIME;
            } else {
                i += 366;
            }
            i4++;
        }
        return i + (i3 - i2);
    }

    public void execute(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (apkUpdateContext.skipUpdate()) {
            apkUpdateContext.success = false;
            apkUpdateContext.errorCode = -53;
        } else if (apkUpdateContext.background && !apkUpdateContext.isForceUpdate()) {
            MainUpdateData mainUpdateData = apkUpdateContext.mainUpdate;
            int i = this.notifyTimes;
            if (i == -1) {
                i = a.get(mainUpdateData.version);
            }
            this.notifyTimes = i;
            int i2 = mainUpdateData.remindCount;
            if (i2 <= 0 || i >= i2) {
                apkUpdateContext.success = false;
                apkUpdateContext.errorCode = -52;
                apkUpdateContext.exceedUpdateTimes = Boolean.TRUE;
                return;
            }
            this.notifyTimes = i + 1;
            a.update(mainUpdateData.version, i2);
        }
    }
}
