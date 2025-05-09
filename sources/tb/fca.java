package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTTracker;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final fca INSTANCE = new fca();
    public static final String MTOP_I18N_KEY = "x-app-i18n";
    public static final String UT_I18N_KEY = "x_i18n_info";

    static {
        t2o.a(322961413);
    }

    @JvmStatic
    public static final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f1d7e", new Object[0]);
            return;
        }
        String j = Localization.j();
        Language h = Localization.h();
        ckf.f(h, "Localization.getLanguage()");
        String tag = h.getTag();
        ckf.f(tag, "Localization.getLanguage().tag");
        e(j, tag);
    }

    @JvmStatic
    public static final void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c081eb92", new Object[]{str, str2});
            return;
        }
        ckf.g(str2, Constants.KEY_LANGUAGE_TAG);
        fca fcaVar = INSTANCE;
        fcaVar.d(fcaVar.a(str, str2));
    }

    @JvmStatic
    public static final void g(String str, Language language) {
        UncaughtCrashHeader crashCaughtHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4097ff9f", new Object[]{str, language});
            return;
        }
        ckf.g(language, LoggingSPCache.STORAGE_LANGUAGE);
        fca fcaVar = INSTANCE;
        String tag = language.getTag();
        ckf.f(tag, "language.tag");
        String a2 = fcaVar.a(str, tag);
        fcaVar.d(a2);
        fcaVar.f(a2);
        TCrashSDK instance = TCrashSDK.instance();
        if (!(instance == null || (crashCaughtHeader = instance.getCrashCaughtHeader()) == null)) {
            crashCaughtHeader.addHeaderInfo("languageInfo", a2);
        }
        zap.b().k = a2;
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8824d84d", new Object[]{this, str, str2});
        }
        return str + '.' + str2 + '.' + b();
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200323c8", new Object[]{this, str});
        } else if (Localization.n()) {
            MtopSetting.removeParam(Mtop.Id.INNER, MtopParamType.HEADER, MTOP_I18N_KEY);
            MtopSetting.removeParam(Mtop.Id.SSR, MtopParamType.HEADER, MTOP_I18N_KEY);
            TLog.logd(Localization.LOG_MODULE, Localization.LOG_MODULE, "mtop header update, not cn site, remove header x-app-i18n");
        } else {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, MTOP_I18N_KEY, str);
            MtopSetting.setParam(Mtop.Id.SSR, MtopParamType.HEADER, MTOP_I18N_KEY, str);
            TLog.logd(Localization.LOG_MODULE, Localization.LOG_MODULE, "mtop header update, x-app-i18n: " + str);
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c04ffd", new Object[]{this, str});
        } else if (Localization.n()) {
            UTTracker.removeGlobalPropertyForAllTracker(UT_I18N_KEY);
            AppMonitor.removeGlobalProperty(UT_I18N_KEY);
            TLog.logd(Localization.LOG_MODULE, Localization.LOG_MODULE, "ut param update, not cn site, remove global property x_i18n_info");
        } else {
            UTTracker.setGlobalPropertyForAllTracker(UT_I18N_KEY, str);
            AppMonitor.setGlobalProperty(UT_I18N_KEY, str);
            TLog.logd(Localization.LOG_MODULE, Localization.LOG_MODULE, "ut param update, x_i18n_info: " + str);
        }
    }

    public final String b() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ca6e137", new Object[]{this});
        }
        TimeZone timeZone = TimeZone.getDefault();
        ckf.f(timeZone, "timeZone");
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            i = timeZone.getDSTSavings();
        }
        return String.valueOf((rawOffset + i) / 60000);
    }
}
