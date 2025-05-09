package tb;

import android.preference.PreferenceManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.constans.SettingContants;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class qwp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n81 n81Var = new n81(Globals.getApplication());
            Object j = n81Var.j("mytaobao", "mute");
            Boolean bool = Boolean.TRUE;
            String str2 = "0";
            String str3 = ckf.b(j, bool) ? "1" : str2;
            String str4 = ckf.b(n81Var.j("mytaobao", r0k.KEY_LIVE_MUTE), bool) ? "1" : str2;
            String str5 = ckf.b(n81Var.j("mytaobao", r0k.KEY_INLINE_VOLUME), bool) ? "1" : str2;
            if (!PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).contains(SettingContants.SETTINGS_SYSTEM_SOUND)) {
                str = "null";
            } else {
                str = String.valueOf(yjp.a(SettingContants.SETTINGS_SYSTEM_SOUND, true));
            }
            if (ckf.b(n81Var.j("mytaobao", "timeFrameMute"), bool)) {
                str2 = "1";
            }
            Object j2 = n81Var.j("mytaobao", "timeFrameMuteSub");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "mute", str3);
            jSONObject.put((JSONObject) r0k.KEY_LIVE_MUTE, str4);
            jSONObject.put((JSONObject) "builtInVoice", str5);
            jSONObject.put((JSONObject) "timeFrameMute", str2);
            jSONObject.put((JSONObject) "timeFrameMute_subStatus", (String) j2);
            jSONObject.put((JSONObject) "hitABTestForSoundSetting", (String) bool);
            jSONObject.put((JSONObject) SettingContants.SETTINGS_SYSTEM_SOUND, str);
            String c = qwp.c(qwp.this);
            TLog.loge(c, "用户声音相关设置 " + jSONObject.toJSONString());
            float b = ((float) wu2.DAY) * qh4.b("silenceUtLimit", 1.0f);
            long currentTimeMillis = System.currentTimeMillis();
            if (((float) currentTimeMillis) > ((float) yjp.b(qwp.b(qwp.this), qwp.a(qwp.this), 0L)) + b) {
                TBS.Ext.commitEvent(u3j.b, 19999, "mtbMuteSettingsConfig", null, null, suv.i(jSONObject));
                yjp.d(qwp.b(qwp.this), qwp.a(qwp.this), currentTimeMillis);
            }
        }
    }

    static {
        t2o.a(745537805);
    }

    public static final /* synthetic */ String a(qwp qwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("802d1c92", new Object[]{qwpVar});
        }
        qwpVar.getClass();
        return "lastTime";
    }

    public static final /* synthetic */ String b(qwp qwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49064e67", new Object[]{qwpVar});
        }
        qwpVar.getClass();
        return "mtbSilenceSwitch";
    }

    public static final /* synthetic */ String c(qwp qwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbeea581", new Object[]{qwpVar});
        }
        qwpVar.getClass();
        return mba.BIZ_NAME;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b012e94", new Object[]{this});
        } else {
            p3j.a(new a(), 2000L);
        }
    }
}
