package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p81 extends wr6 implements ehb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25929a;
    public final String b;
    public final ulp c;

    public p81(Context context, String str) {
        this.f25929a = context;
        this.b = str;
        this.c = ulp.c(context.getApplicationContext());
    }

    public static /* synthetic */ Object ipc$super(p81 p81Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/global/setting/data/app/AppSettingUpdater");
    }

    @Override // tb.ehb
    public <T> void a(String str, String str2, T t, gyb gybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7a4140", new Object[]{this, str, str2, t, gybVar});
        } else if (!mba.b().c()) {
            if (!tfp.d(str, str2)) {
                tfp.b(gybVar, 261, "bizName and key cannot be empty!");
                return;
            }
            try {
                if (!mba.b().c() && r0k.KEY_LIVE_MUTE.equals(str2)) {
                    str2 = "mute";
                }
                nng.b().d(str2, t);
                tfp.e(gybVar, null);
                AppMonitor.Counter.commit(quv.PAGE_NAME, quv.ARG1_CHANGE_LIFE_CICLE_SETTING_STATE, quv.c(str, str2, t), 1.0d);
            } catch (IllegalArgumentException e) {
                tfp.b(gybVar, 261, e.getMessage());
            }
        }
    }

    @Override // tb.ehb
    public void b(int i) {
        SharedPreferences e;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643ed801", new Object[]{this, new Integer(i)});
        } else if (h() && (e = this.c.e()) != null) {
            SharedPreferences.Editor edit = e.edit();
            edit.putInt("Global_App_Video_Play_Network_Type", i);
            if (i != 0) {
                z = false;
            }
            edit.putBoolean("Global_App_Auto_Play_Video", z);
            edit.commit();
            o81.c("Global_App_Video_Play_Network_Type", Integer.valueOf(i));
            o81.c("Global_App_Auto_Play_Video", Boolean.valueOf(z));
        }
    }

    @Override // tb.ehb
    public <T> void c(String str, String str2, T t, gyb gybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86ad4a", new Object[]{this, str, str2, t, gybVar});
        } else if (!tfp.d(str, str2)) {
            tfp.b(gybVar, 261, "bizName and key cannot be empty!");
        } else {
            try {
                g(str2, t);
                tfp.e(gybVar, null);
                o81.c(str2, t);
                AppMonitor.Counter.commit(quv.PAGE_NAME, quv.ARG1_CHANGE_SETTING_STATE, quv.c(str, str2, t), 1.0d);
                TLog.loge(mba.BIZ_NAME, "写开关: bizName=" + str + " key=" + str2 + " value=" + t);
            } catch (IllegalArgumentException e) {
                tfp.b(gybVar, 261, e.getMessage());
            }
        }
    }

    @Override // tb.ehb
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5c5d5c", new Object[]{this, new Boolean(z)});
        } else if (h()) {
            this.c.f("Global_App_Is_TaoPassWord_Cut", z);
        }
    }

    @Override // tb.ehb
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57aa018", new Object[]{this, new Boolean(z)});
        } else if (h()) {
            this.c.f("Global_App_Auto_Play_Video", z);
            o81.c("Global_App_Auto_Play_Video", Boolean.valueOf(z));
        }
    }

    public final <T> void g(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144c74fb", new Object[]{this, str, t});
        } else if (!TextUtils.isEmpty(str)) {
            SharedPreferences.Editor edit = tfp.c().edit();
            if (t instanceof Integer) {
                edit.putInt(str, ((Integer) t).intValue());
            } else if (t instanceof String) {
                edit.putString(str, String.valueOf(t));
            } else if (t instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) t).booleanValue());
            } else {
                edit.apply();
                throw new IllegalArgumentException("the type of value must be one of the Integer, String or Boolean!");
            }
            edit.apply();
            m81.c(str, t);
        } else {
            throw new IllegalArgumentException("key cannot be empty!");
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44987957", new Object[]{this})).booleanValue();
        }
        if (f(this.b)) {
            return true;
        }
        Nav.from(this.f25929a).toUri("http://m.taobao.com/go/mytaobaocommonsettings");
        return false;
    }
}
