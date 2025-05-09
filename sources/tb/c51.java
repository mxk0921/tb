package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.StringUtil;
import com.taobao.tao.Globals;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c51 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qg0 f16864a;

        public a(qg0 qg0Var) {
            this.f16864a = qg0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, String> map = vg0.c().f29996a;
            if (map != null) {
                str = map.get("visitValidTime");
            } else {
                str = "86400";
            }
            String replace = Base64.encodeToString(c51.a(this.f16864a, str).getBytes(), 0).replace("\n", "");
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
            edit.putString("appGuide", replace);
            edit.apply();
        }
    }

    static {
        t2o.a(744489031);
    }

    public static /* synthetic */ String a(qg0 qg0Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cad8bc", new Object[]{qg0Var, str});
        }
        return d(qg0Var, str);
    }

    public static synchronized void b() {
        synchronized (c51.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[0]);
                return;
            }
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
            edit.remove("appGuide");
            edit.apply();
        }
    }

    public static synchronized void c() {
        synchronized (c51.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a1c742c", new Object[0]);
                return;
            }
            if (h()) {
                b();
            }
        }
    }

    public static String d(qg0 qg0Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf9d4fbc", new Object[]{qg0Var, str});
        }
        if (qg0Var == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TimestampSynchronizer.getServerTime());
        stringBuffer.append("|");
        stringBuffer.append(str);
        stringBuffer.append("|");
        if (!StringUtil.isBlank(qg0Var.h)) {
            stringBuffer.append(qg0Var.h);
        }
        stringBuffer.append("|");
        Map<String, String> map = qg0Var.l;
        if (map != null) {
            String str2 = map.get("shopId");
            if (!StringUtil.isBlank(str2)) {
                stringBuffer.append(str2);
            }
            stringBuffer.append("|");
            String str3 = qg0Var.l.get("itemId");
            if (!StringUtil.isBlank(str3)) {
                stringBuffer.append(str3);
            }
            stringBuffer.append("|");
            if (!StringUtil.isBlank(qg0Var.i)) {
                stringBuffer.append(qg0Var.i);
            }
            stringBuffer.append("|");
            if (!StringUtil.isBlank(qg0Var.f26733a)) {
                stringBuffer.append(qg0Var.f26733a);
            }
            stringBuffer.append("|");
            if (!StringUtil.isBlank(qg0Var.s)) {
                stringBuffer.append(qg0Var.s);
            }
            stringBuffer.append("|");
            String str4 = qg0Var.l.get(MspDBHelper.BizEntry.COLUMN_NAME_PID);
            if (!StringUtil.isBlank(str4)) {
                stringBuffer.append(str4);
            }
            stringBuffer.append("|");
            if (!StringUtil.isBlank(qg0Var.j)) {
                stringBuffer.append(qg0Var.j);
            }
            stringBuffer.append("|");
            String str5 = qg0Var.l.get(rg0.SOURCE_VC);
            if (!StringUtil.isBlank(str5)) {
                stringBuffer.append(str5);
            }
            stringBuffer.append("|");
            String str6 = qg0Var.f26733a;
            if (str6 != null) {
                stringBuffer.append(str6);
            }
        } else {
            stringBuffer.append("||||||||");
        }
        return stringBuffer.toString();
    }

    public static void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        c();
        f(application);
    }

    public static void f(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9826530", new Object[]{application});
        } else {
            application.registerActivityLifecycleCallbacks(new b51());
        }
    }

    public static synchronized void g(qg0 qg0Var) {
        synchronized (c51.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0629c6d", new Object[]{qg0Var});
            } else {
                zsa.b.a(new a(qg0Var));
            }
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221d07fc", new Object[0])).booleanValue();
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
        if (defaultSharedPreferences == null) {
            return false;
        }
        String string = defaultSharedPreferences.getString("appGuide", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            String str = new String(Base64.decode(string.getBytes(), 0), "UTF-8");
            int indexOf = str.indexOf("|");
            int i = indexOf + 1;
            long parseLong = Long.parseLong(str.substring(0, indexOf)) + (Long.parseLong(str.substring(i, str.indexOf("|", i))) * 1000);
            long serverTime = TimestampSynchronizer.getServerTime();
            return parseLong > 0 && serverTime > 0 && serverTime - parseLong > 0;
        } catch (Exception e) {
            vp9.b("appGuide", e.toString());
            return false;
        }
    }
}
