package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kur {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBP_CONFIG = "tbp_config";

    static {
        t2o.a(824180747);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{TBP_CONFIG}, new a(context));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22936a;

        public a(Context context) {
            this.f22936a = context;
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            String str2;
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            urr.a("TBProfConfig", "DiagnoseConfigReceiver onConfigUpdate " + str, new Object[0]);
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs != null) {
                SharedPreferences j = TBProfConfig.j(TBProfConfig.TBP_SP, this.f22936a);
                if (j == null) {
                    urr.b("TBProfConfig", "The sharedPreferences is null", new Object[0]);
                    return;
                }
                SharedPreferences.Editor edit = j.edit();
                if (kur.TBP_CONFIG.equals(str)) {
                    String str4 = configs.get(TBProfConfig.CONFIG_IS_TBP_ENABLE);
                    String str5 = configs.get(TBProfConfig.CONFIG_BLACK_LIST);
                    String str6 = configs.get(TBProfConfig.CONFIG_MONITOR_SAMPLE);
                    String str7 = configs.get(TBProfConfig.CONFIG_PLUGIN_ARGS);
                    String str8 = configs.get(TBProfConfig.CONFIG_CAPS_LIST);
                    String str9 = configs.get(TBProfConfig.CONFIG_LOG_LEVEL);
                    String str10 = configs.get(TBProfConfig.CONFIG_BIG_MEM_MONITOR_SAMPLE);
                    String str11 = configs.get(TBProfConfig.CONFIG_MAIN_WAIT_MONITOR_SAMPLE);
                    String str12 = configs.get(TBProfConfig.CONFIG_CHECK_MUTATOR);
                    String str13 = configs.get(TBProfConfig.CONFIG_WAIT_PREVENT_GC);
                    String str14 = configs.get(TBProfConfig.CONFIG_DUMP_HEAP);
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = str14;
                        edit.putBoolean(TBProfConfig.CONFIG_IS_TBP_ENABLE, "true".equals(str4));
                    } else {
                        str2 = str14;
                        edit.remove(TBProfConfig.CONFIG_IS_TBP_ENABLE);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        edit.putString(TBProfConfig.CONFIG_BLACK_LIST, str5);
                    } else {
                        edit.remove(TBProfConfig.CONFIG_BLACK_LIST);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        try {
                            edit.putInt(TBProfConfig.CONFIG_MONITOR_SAMPLE, Integer.parseInt(str6));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        edit.remove(TBProfConfig.CONFIG_MONITOR_SAMPLE);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        edit.putString(TBProfConfig.CONFIG_PLUGIN_ARGS, str7);
                    } else {
                        edit.remove(TBProfConfig.CONFIG_PLUGIN_ARGS);
                    }
                    if (!TextUtils.isEmpty(str8)) {
                        edit.putString(TBProfConfig.CONFIG_CAPS_LIST, str8);
                    } else {
                        edit.remove(TBProfConfig.CONFIG_CAPS_LIST);
                    }
                    if (!TextUtils.isEmpty(str9)) {
                        edit.putString(TBProfConfig.CONFIG_LOG_LEVEL, str9);
                    } else {
                        edit.remove(TBProfConfig.CONFIG_LOG_LEVEL);
                    }
                    if (!TextUtils.isEmpty(str10)) {
                        try {
                            edit.putInt(TBProfConfig.CONFIG_BIG_MEM_MONITOR_SAMPLE, Integer.parseInt(str10));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        edit.remove(TBProfConfig.CONFIG_BIG_MEM_MONITOR_SAMPLE);
                    }
                    if (!TextUtils.isEmpty(str11)) {
                        try {
                            edit.putInt(TBProfConfig.CONFIG_MAIN_WAIT_MONITOR_SAMPLE, Integer.parseInt(str11));
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    } else {
                        edit.remove(TBProfConfig.CONFIG_MAIN_WAIT_MONITOR_SAMPLE);
                    }
                    if (!TextUtils.isEmpty(str12)) {
                        edit.putBoolean(TBProfConfig.CONFIG_CHECK_MUTATOR, "true".equals(str12));
                    } else {
                        edit.remove(TBProfConfig.CONFIG_CHECK_MUTATOR);
                    }
                    if (!TextUtils.isEmpty(str13)) {
                        edit.putBoolean(TBProfConfig.CONFIG_WAIT_PREVENT_GC, "true".equals(str13));
                    } else {
                        edit.remove(TBProfConfig.CONFIG_WAIT_PREVENT_GC);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        str3 = str2;
                        edit.putString(TBProfConfig.CONFIG_DUMP_HEAP, str3);
                    } else {
                        str3 = str2;
                        edit.remove(TBProfConfig.CONFIG_DUMP_HEAP);
                    }
                    edit.apply();
                    String str15 = configs.get(TBProfConfig.CONFIG_ANR_PROFILER);
                    SharedPreferences j2 = TBProfConfig.j(TBProfConfig.ANR_SP, this.f22936a);
                    if (j2 != null) {
                        SharedPreferences.Editor edit2 = j2.edit();
                        if (!TextUtils.isEmpty(str15)) {
                            edit2.putString(TBProfConfig.CONFIG_ANR_PROFILER, str15);
                        } else {
                            edit2.remove(TBProfConfig.CONFIG_ANR_PROFILER);
                        }
                        edit2.apply();
                    }
                    urr.b("TBProfConfig", "[orange]TBP Config: TBPConfig=" + str4 + ", BlackList=" + str5 + ", PluginOptions=" + str7 + ", MonitorSample=" + str6 + ", bigMemSample=" + str10 + ", mainWaitSample=" + str11 + ",CapList=" + str8 + ", LogLeve=" + str9 + ", dumpHeapConfig=" + str3 + ", anrConfig=" + str15, new Object[0]);
                    return;
                }
                return;
            }
            urr.g("TBProfConfig", "The config is null!", new Object[0]);
        }
    }
}
