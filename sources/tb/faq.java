package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class faq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_AUTO_REPAIR_MORE_ICONS_IN_BG_LAST_TIME = "auto_repair_more_icons_in_bg_last_time";
    public static final String SP_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_HISTORY_ATTEMPT_COUNT = "auto_repair_more_icons_in_bg_history_attempt_count";
    public static final String SP_KEY_EXPECT_APP_ICON_MODEL = "expect_app_icon_model";
    public static final String SP_KEY_IS_UPLOAD_CHANGE_INFOS_FINISHED = "is_upload_change_infos_finished";
    public static final String SP_KEY_ORANGE_LAST_VERSION = "orange_last_version";
    public static final String TAG = "ChangeAppIconSP";
    public static volatile faq c;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f19146a;
    public final SharedPreferences.Editor b;

    static {
        t2o.a(284164127);
    }

    public faq() {
        SharedPreferences sharedPreferences = qh3.k().getSharedPreferences("change_icon", 0);
        this.f19146a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    public static faq f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (faq) ipChange.ipc$dispatch("d281521e", new Object[0]);
        }
        if (c == null) {
            synchronized (faq.class) {
                try {
                    if (c == null) {
                        c = new faq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            return;
        }
        this.b.commit();
        AdapterForTLog.loge(TAG, "commit");
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3aa27ef6", new Object[]{this, new Integer(i)})).intValue();
        }
        return f().g().getInt(SP_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_HISTORY_ATTEMPT_COUNT, i);
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65a01033", new Object[]{this})).longValue();
        }
        return f().g().getLong(ubl.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_INTERVAL, 86400000L);
    }

    public long d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83bb8fb1", new Object[]{this, new Long(j)})).longValue();
        }
        return f().g().getLong(SP_KEY_AUTO_REPAIR_MORE_ICONS_IN_BG_LAST_TIME, j);
    }

    public int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d06ea6", new Object[]{this, new Integer(i)})).intValue();
        }
        return f().g().getInt(ubl.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_MAX_ATTEMPT_COUNT, i);
    }

    public SharedPreferences g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[]{this});
        }
        return this.f19146a;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75c2c829", new Object[]{this});
        }
        return f().g().getString(SP_KEY_IS_UPLOAD_CHANGE_INFOS_FINISHED, "");
    }

    public faq i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (faq) ipChange.ipc$dispatch("9363ef36", new Object[]{this, str, new Boolean(z)});
        }
        this.b.putBoolean(str, z);
        AdapterForTLog.loge(TAG, "putBoolean key:" + str + " value:" + z);
        return this;
    }

    public faq j(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (faq) ipChange.ipc$dispatch("4d17f13e", new Object[]{this, str, new Integer(i)});
        }
        this.b.putInt(str, i);
        AdapterForTLog.loge(TAG, "putInt key:" + str + " value:" + i);
        return this;
    }

    public faq k(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (faq) ipChange.ipc$dispatch("570a9f54", new Object[]{this, str, new Long(j)});
        }
        this.b.putLong(str, j);
        AdapterForTLog.loge(TAG, "putInt key:" + str + " value:" + j);
        return this;
    }

    public faq l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (faq) ipChange.ipc$dispatch("293ee7", new Object[]{this, str, str2});
        }
        this.b.putString(str, str2);
        AdapterForTLog.loge(TAG, "putString key:" + str + " value:" + str2);
        return this;
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e964877", new Object[]{this, new Integer(i)});
        } else {
            f().j(SP_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_HISTORY_ATTEMPT_COUNT, i).a();
        }
    }

    public void n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc726c9", new Object[]{this, new Long(j)});
        } else {
            f().k(SP_KEY_AUTO_REPAIR_MORE_ICONS_IN_BG_LAST_TIME, j).a();
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4a90d5", new Object[]{this, str});
        } else {
            f().l(SP_KEY_IS_UPLOAD_CHANGE_INFOS_FINISHED, str).a();
        }
    }
}
