package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r4s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REMOTE_DEBUGER_ANDROID = "remote_debug";
    public static final String REMOTE_TLOG_CONFIG = "tlog_switch";

    public static /* synthetic */ void a(Map map, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b0aa13", new Object[]{map, editor, str});
        } else {
            c(map, editor, str);
        }
    }

    public static /* synthetic */ void b(Map map, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5621432", new Object[]{map, editor, str});
        } else {
            d(map, editor, str);
        }
    }

    public static void c(Map<String, String> map, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64512e23", new Object[]{map, editor, str});
            return;
        }
        String str2 = map.get(str);
        if (!TextUtils.isEmpty(str2)) {
            editor.putBoolean(str, Boolean.parseBoolean(str2));
        } else {
            editor.remove(str);
        }
    }

    public static void d(Map<String, String> map, SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751d377c", new Object[]{map, editor, str});
            return;
        }
        String str2 = map.get(str);
        if (!TextUtils.isEmpty(str2)) {
            try {
                editor.putInt(str, Integer.parseInt(str2));
            } catch (Throwable unused) {
                TLog.loge("TLOG", "TLogConfigReceiver", "Failed to parse int config, key=" + str);
            }
        } else {
            editor.remove(str);
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{REMOTE_DEBUGER_ANDROID, REMOTE_TLOG_CONFIG}, new a(context));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f27099a;

        public a(Context context) {
            this.f27099a = context;
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs != null) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f27099a).edit();
                if (r4s.REMOTE_DEBUGER_ANDROID.equals(str)) {
                    String str3 = configs.get("tlog_destroy");
                    String str4 = configs.get(r4s.REMOTE_TLOG_CONFIG);
                    String str5 = configs.get(EnvironmentSwitcher.TLOG_LEVEL);
                    String str6 = configs.get("tlog_module");
                    String str7 = configs.get("tlog_start_up_sampling");
                    if (s4s.e() != null) {
                        Log.e("TLogConfigReceiver", "tlogDestroy is: " + str3 + "tlogSwitch is : " + str4 + "  tlogLevel is : " + str5 + "  tlogModule is : " + str6);
                        if (TextUtils.isEmpty(str3) || !"true".equals(str3)) {
                            edit.putBoolean("tlog_destroy", false);
                            if (TextUtils.isEmpty(str4) || !"false".equals(str4)) {
                                edit.putBoolean(r4s.REMOTE_TLOG_CONFIG, true);
                            } else {
                                Log.e("TLogConfigReceiver", "switch tlog function");
                                s4s.e().d();
                                edit.putBoolean(r4s.REMOTE_TLOG_CONFIG, false);
                            }
                            if (!TextUtils.isEmpty(str5)) {
                                Log.e("TLogConfigReceiver", "change tlog level : " + str5);
                                LogLevel c = n6s.c(str5);
                                edit.putString(EnvironmentSwitcher.TLOG_LEVEL, str5);
                                s4s.e().g(c);
                            }
                            if (!TextUtils.isEmpty(str6)) {
                                Log.e("TLogConfigReceiver", "tlog model : " + str6);
                                if ("off".equals(str6)) {
                                    s4s.e().c();
                                    edit.remove("tlog_module");
                                } else {
                                    Map<String, LogLevel> i = n6s.i(str6);
                                    if (i != null && i.size() > 0) {
                                        s4s.e().b(i);
                                        edit.putString("tlog_module", str6);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(str7)) {
                                Log.e("TLogConfigReceiver", "change tlog start up sampling : " + str7);
                                try {
                                    j5s.j().O(Integer.valueOf(Integer.parseInt(str7)));
                                } catch (NumberFormatException e) {
                                    e.printStackTrace();
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                            edit.apply();
                            return;
                        }
                        Log.e("TLogConfigReceiver", "destroy tlog");
                        s4s.e().d();
                        n6s.b(b5s.j());
                        edit.putBoolean("tlog_destroy", true).apply();
                    }
                } else if (r4s.REMOTE_TLOG_CONFIG.equals(str)) {
                    String str8 = configs.get("tlog_file_size");
                    if (!TextUtils.isEmpty(str8)) {
                        try {
                            edit.putLong("tlog_file_size", Long.parseLong(str8));
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    String str9 = configs.get("tlog_file_version");
                    if (!TextUtils.isEmpty(str9)) {
                        try {
                            edit.putInt("tlog_file_version", Integer.parseInt(str9));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    String str10 = configs.get("tlog_statistics_sample");
                    if (!TextUtils.isEmpty(str10)) {
                        try {
                            edit.putInt("tlog_statistics_sample", Integer.parseInt(str10));
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                    String str11 = configs.get("tlog_file_statistics_sample");
                    if (!TextUtils.isEmpty(str11)) {
                        try {
                            edit.putInt("tlog_file_statistics_sample", Integer.parseInt(str11));
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                    String str12 = configs.get("tlog_buffer_size");
                    if (!TextUtils.isEmpty(str12)) {
                        try {
                            edit.putLong("tlog_buffer_size", Long.parseLong(str12));
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    String str13 = configs.get("tlog_scan_upload");
                    if (!TextUtils.isEmpty(str13)) {
                        edit.putBoolean("tlog_scan_upload", "true".equals(str13));
                    }
                    String str14 = configs.get("tlog_multi_process_notify");
                    if (!TextUtils.isEmpty(str14)) {
                        edit.putBoolean("tlog_multi_process_notify", "true".equals(str14));
                    }
                    String str15 = configs.get(f6s.TLOG_UDF_SWITCH);
                    if (!TextUtils.isEmpty(str15)) {
                        edit.putBoolean(f6s.TLOG_UDF_SWITCH, "true".equals(str15));
                    }
                    String str16 = configs.get("tlog_use_zstd");
                    if (!TextUtils.isEmpty(str16)) {
                        edit.putBoolean("tlog_use_zstd", "true".equals(str16));
                    }
                    String str17 = configs.get("tlog_intercept");
                    if (!TextUtils.isEmpty(str17)) {
                        edit.putBoolean("tlog_intercept", "true".equals(str17));
                    } else {
                        edit.remove("tlog_intercept");
                    }
                    String str18 = configs.get("tlog_real_time");
                    if (!TextUtils.isEmpty(str18)) {
                        str2 = "TLogConfigReceiver";
                        edit.putBoolean("tlog_real_time", "true".equals(str18));
                    } else {
                        str2 = "TLogConfigReceiver";
                        edit.remove("tlog_real_time");
                    }
                    String str19 = configs.get("tlog_slice_config");
                    if (!TextUtils.isEmpty(str19)) {
                        edit.putString("tlog_slice_config", str19);
                    } else {
                        edit.remove("tlog_slice_config");
                    }
                    String str20 = configs.get("tlog_main_opt");
                    if (!TextUtils.isEmpty(str20)) {
                        edit.putBoolean("tlog_main_opt", "true".equals(str20));
                    } else {
                        edit.remove("tlog_main_opt");
                    }
                    r4s.a(configs, edit, "tlog_threadpool_anr_opt2");
                    r4s.b(configs, edit, "tlog_mini_blocks");
                    edit.apply();
                    Log.e(str2, "[orange]tlog_switch: fileVersion=" + str9 + ", tlogMaxSize=" + str8 + ", utSampleRate=" + str10 + ", fileStatisticsRate=" + str11 + ", bufferSize=" + str12 + ", scanUpload=" + str13 + ", multiProcessNotify=" + str14 + ", udfSwitch=" + str15 + ", useZstd=" + str16 + ", realtimeEnable=" + str18 + ", interceptEnable=" + str17 + ", sliceConfig=" + str19 + ", mainOpt=" + str20);
                }
            }
        }
    }
}
