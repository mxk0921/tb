package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ubl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAMESPACE_DEFAULT = "changeAppIconConfig";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_ACT_DELAY_FINISH_TIME_MS = "act_delay_finish_ms";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_ACT_DELAY_FORCE_FINISH_TIME_MS = "act_delay_force_finish_ms";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG = "auto_repair_more_icons_in_bg";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_INTERVAL = "auto_repair_more_icons_in_bg_interval";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_MAX_ATTEMPT_COUNT = "auto_repair_more_icons_in_bg_max_attempt_count";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_CAN_INIT = "change_app_icon_can_init";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_CHECK_INTERVAL_TIME_MS = "check_interval_ms";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_CHECK_IS_RESTART_REPORT = "check_is_restart_report";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_CHECK_TOTAL_TIME_MS = "check_total_ms";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_ENABLE_MTOP_REPORT = "enable_mtop_report";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_ERROR_MSG_MTOP_MAX_LENGTH = "error_msg_mtop_max_length";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_ERROR_MSG_UT_MAX_LENGTH = "error_msg_ut_max_length";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_INIT_REPORT = "change_app_icon_init_report";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_IN_BG_OPEN = "change_app_icon_in_bg_open";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_REDRESS_DEFAULT_ICON_ENABLE = "redress_default_icon_enable";
    public static final String ORANGE_KEY_CHANGE_APP_ICON_TO_DEFAULT_IN_BG = "change_to_default_in_bg";
    public static final String ORANGE_KEY_CHANGE_APP_SAFEMODE_CHANGE_TO_DEFAULT_ICON = "safemode_change_to_default_icon";
    public static final String ORANGE_KEY_CHANGE_APP_SUPPORT_JS_CHANGE_APP_ICON = "support_js_change_app_icon";

    static {
        t2o.a(284164125);
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            int parseInt = Integer.parseInt(OrangeConfig.getInstance().getConfig(NAMESPACE_DEFAULT, str, String.valueOf(i)));
            AdapterForTLog.logd(qh3.TAG, "orange: " + str + "= " + parseInt);
            return parseInt;
        } catch (Exception e) {
            AdapterForTLog.loge(qh3.TAG, "error " + e.getMessage(), e);
            return -1;
        }
    }

    public static long c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            long parseLong = Long.parseLong(OrangeConfig.getInstance().getConfig(NAMESPACE_DEFAULT, str, String.valueOf(j)));
            Long valueOf = Long.valueOf(parseLong);
            AdapterForTLog.logd(qh3.TAG, "orange: " + str + "= " + valueOf);
            return parseLong;
        } catch (Exception e) {
            AdapterForTLog.loge(qh3.TAG, "error " + e.getMessage(), e);
            return -1L;
        }
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75a59011", new Object[]{str, str2})).booleanValue();
        }
        try {
            boolean parseBoolean = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(NAMESPACE_DEFAULT, str, str2));
            AdapterForTLog.logd(qh3.TAG, "orange: " + str + "= " + parseBoolean);
            return parseBoolean;
        } catch (Exception e) {
            AdapterForTLog.loge(qh3.TAG, "error " + e.getMessage(), e);
            return false;
        }
    }
}
