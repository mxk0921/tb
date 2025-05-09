package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import org.android.netutil.UtilTool;
import org.android.spdy.spduLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class txn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CORE_SP_NAME = "network_core_init_config";
    public static final String SP_NAME = "tnet_android_config";
    public static final String TNET_TRUSTED_ROOT_CERT = "trusted_root_cert";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f29020a;
    public static SharedPreferences b;
    public static SharedPreferences c;
    public static Context d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else {
                txn.a(str);
            }
        }
    }

    static {
        try {
            IpChange ipChange = OrangeConfig.$ipChange;
            f29020a = true;
        } catch (Exception unused) {
            f29020a = false;
        }
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            m(str);
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        if (!f29020a) {
            spduLog.Tloge("tnetsdk.RemoteConfigImp", null, "no orange sdk", new Object[0]);
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig("tnet4Android_sdk", str, str2);
        } catch (Exception unused) {
            spduLog.Tloge("tnetsdk.RemoteConfigImp", null, "can not get config", new Object[0]);
            return null;
        }
    }

    public static SharedPreferences c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("bebb013b", new Object[]{context});
        }
        if (c == null && context != null) {
            c = context.getSharedPreferences(CORE_SP_NAME, 0);
        }
        return c;
    }

    public static long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab451ce5", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                return sharedPreferences.getLong(str, j);
            }
        } catch (Exception unused) {
        }
        return j;
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc1d3303", new Object[]{str, str2});
        }
        try {
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                return sharedPreferences.getString(str, str2);
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    public static boolean f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab455905", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(str, z);
            }
        } catch (Exception unused) {
        }
        return z;
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6019b89", new Object[]{context});
            return;
        }
        try {
            SharedPreferences c2 = c(context);
            if (c2 == null) {
                spduLog.Tloge("tnetsdk.RemoteConfigImp", null, "init core config, sp is null", new Object[0]);
                return;
            }
            if ("com.taobao.taobao".equals(UtilTool.getProcessName())) {
                l0r.E0(c2.getBoolean("multi_thread_opt_enable", true));
                l0r.l0(c2.getBoolean("cdn_pubkey_to_plain_enable", true));
                l0r.Z0(c2.getString("recv_body_opt_config", l0r.DEFAULT_SEND_AND_RECV_BODY_OPT_CONFIG));
            }
            l0r.R0(c2.getBoolean("quic_so_plugin_load_enable", true));
            l0r.L0(c2.getBoolean("quic_0rtt_rate_opt_enable", true));
        } catch (Exception unused) {
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{context});
        } else if (!f29020a || context == null) {
            spduLog.Logi("tnetsdk.RemoteConfigImp", "RemoteConfigImp register fail");
        } else {
            d = context;
            try {
                OrangeConfig.getInstance().registerListener(new String[]{"tnet4Android_sdk"}, new a());
            } catch (Exception unused) {
            }
            try {
                b = context.getSharedPreferences(SP_NAME, 0);
                c = c(context);
                l0r.a1(f("tlog_enable_switch", true));
                l0r.v0(f("jni_tlog_enable_switch", true));
                l0r.w0(d("jni_tlog_xquic_level", 2L));
                l0r.N0(d("quic_connect_timeout_ms", 5000L));
                l0r.b1(d("tcp_connect_timeout_ms", l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS));
                l0r.d1(f("tunnel_proxy_enable_switch", true));
                l0r.W0(f("request_read_idle_timeout_switch", true));
                l0r.t0(f("http3_opt_develop_enable", true));
                l0r.u0(f("http_zstd_enable", true));
                l0r.e0(f("agent_free_enable", false));
                l0r.c0(e("common_switch_config", ""));
                l0r.n0(e("connect_fast_timeout_host_white_list", ""));
                l0r.C0(e("multi_network_harmony_white_list", ""));
                l0r.e1(e("weak_network_force_cellular_host_white_list", ""));
                l0r.z0(e("mpquic_connect_compensate_host_white_list", ""));
                l0r.T0(e("request_idle_timeout_parameter_config", ""));
                l0r.d0(e("mpquic_parameter_config", ""));
                l0r.j0(e("multi_network_background_brand_block_list", ""));
                l0r.o0(e("cdn_connect_option", ""));
                l0r.q0(f("dns_black_connect_opt_v2_enable", true));
                if ("com.taobao.taobao".equals(UtilTool.getProcessName())) {
                    l0r.U0(e("request_limit_speed_host_white_list", l0r.DEFAULT_REQUEST_LIMIT_SPEED_WHITE_LIST));
                    l0r.D0(e("multi_session_host_white_list", l0r.DEFAULT_MULTI_SESSION_HOST_WHITE_LIST));
                    l0r.X0(e("request_timeout_block_list", l0r.DEFAULT_REQUEST_TIMEOUT_BLOCK_LIST));
                    l0r.J0(e("quic_0rtt_connect_fast_timeout_host_white", l0r.DEFAULT_QUIC_0RTT_FAST_TIMEOUT_HOST_WHITE_LIST));
                }
                Boolean isABGlobalFeatureOpened = UtilTool.isABGlobalFeatureOpened(context, "tnet_connect_fast_timeout_ab_enable");
                if (isABGlobalFeatureOpened != null) {
                    l0r.m0(isABGlobalFeatureOpened.booleanValue());
                }
                Boolean isABGlobalFeatureOpened2 = UtilTool.isABGlobalFeatureOpened(context, "tnet_tunnel_closed");
                if (isABGlobalFeatureOpened2 != null) {
                    l0r.c1(isABGlobalFeatureOpened2.booleanValue());
                }
                Boolean isABGlobalFeatureOpened3 = UtilTool.isABGlobalFeatureOpened(context, "tnet_request_read_idle_timeout_ab_enable");
                if (isABGlobalFeatureOpened3 != null) {
                    l0r.V0(isABGlobalFeatureOpened3.booleanValue());
                }
                Boolean isABGlobalFeatureOpened4 = UtilTool.isABGlobalFeatureOpened(context, "tnet_body_read_idle_timeout_ab_exp");
                if (isABGlobalFeatureOpened4 != null) {
                    l0r.k0(isABGlobalFeatureOpened4.booleanValue());
                }
                Boolean isABGlobalFeatureOpened5 = UtilTool.isABGlobalFeatureOpened(context, "tnet_mpquic_compensate_enable");
                if (isABGlobalFeatureOpened5 != null) {
                    l0r.y0(isABGlobalFeatureOpened5.booleanValue());
                }
                Boolean isABGlobalFeatureOpened6 = UtilTool.isABGlobalFeatureOpened(context, "tnet_amdc_mp_disable");
                if (isABGlobalFeatureOpened6 != null) {
                    l0r.h0(isABGlobalFeatureOpened6.booleanValue());
                }
                Boolean isABGlobalFeatureOpened7 = UtilTool.isABGlobalFeatureOpened(context, "quic_connect_option_picture_enable");
                if (isABGlobalFeatureOpened7 != null) {
                    l0r.M0(isABGlobalFeatureOpened7.booleanValue());
                }
                Boolean isABGlobalFeatureOpened8 = UtilTool.isABGlobalFeatureOpened(context, "tnet_fec_enable");
                if (isABGlobalFeatureOpened8 != null) {
                    l0r.r0(isABGlobalFeatureOpened8.booleanValue());
                }
                Boolean isABGlobalFeatureOpened9 = UtilTool.isABGlobalFeatureOpened(context, "tnet_fec_mask_enable");
                if (isABGlobalFeatureOpened9 != null) {
                    l0r.O0(isABGlobalFeatureOpened9.booleanValue());
                }
                Boolean isABGlobalFeatureOpened10 = UtilTool.isABGlobalFeatureOpened(context, "tnet_qpack_enable");
                if (isABGlobalFeatureOpened10 != null) {
                    l0r.H0(isABGlobalFeatureOpened10.booleanValue());
                }
            } catch (Exception e) {
                spduLog.Tloge("tnetsdk.RemoteConfigImp", null, "register fail", e);
            }
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a454c5", new Object[]{str});
            return;
        }
        try {
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove(str).apply();
            }
        } catch (Exception unused) {
        }
    }

    public static void j(String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81dc877", new Object[]{str, l});
            return;
        }
        try {
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong(str, l.longValue()).apply();
            }
        } catch (Exception unused) {
        }
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ff8c02", new Object[]{str, str2});
            return;
        }
        try {
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str, str2).apply();
            }
        } catch (Exception unused) {
        }
    }

    public static void l(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6bb99c", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean(str, z).apply();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x00b5 -> B:193:0x00b5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x031b -> B:199:0x031b). Please submit an issue!!! */
    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca5b5bc", new Object[]{str});
        } else if ("tnet4Android_sdk".equals(str)) {
            try {
                String b2 = b("multi_thread_opt_enable", null);
                if (!TextUtils.isEmpty(b2)) {
                    c(d).edit().putBoolean("multi_thread_opt_enable", Boolean.valueOf(b2).booleanValue()).apply();
                } else {
                    c(d).edit().remove("multi_thread_opt_enable").apply();
                }
            } catch (Exception unused) {
            }
            try {
                String b3 = b("cdn_pubkey_to_plain_enable", null);
                if (!TextUtils.isEmpty(b3)) {
                    boolean booleanValue = Boolean.valueOf(b3).booleanValue();
                    l0r.l0(booleanValue);
                    c(d).edit().putBoolean("cdn_pubkey_to_plain_enable", booleanValue).apply();
                } else {
                    c(d).edit().remove("cdn_pubkey_to_plain_enable").apply();
                }
            } catch (Exception unused2) {
            }
            try {
                String b4 = b("quic_0rtt_rate_opt_enable", null);
                if (!TextUtils.isEmpty(b4)) {
                    boolean booleanValue2 = Boolean.valueOf(b4).booleanValue();
                    l0r.L0(booleanValue2);
                    c(d).edit().putBoolean("quic_0rtt_rate_opt_enable", booleanValue2).apply();
                } else {
                    c(d).edit().remove("quic_0rtt_rate_opt_enable").apply();
                }
            } catch (Exception unused3) {
            }
            try {
                String b5 = b("quic_so_plugin_load_enable", null);
                if (!TextUtils.isEmpty(b5)) {
                    boolean booleanValue3 = Boolean.valueOf(b5).booleanValue();
                    l0r.R0(booleanValue3);
                    c(d).edit().putBoolean("quic_so_plugin_load_enable", booleanValue3).apply();
                } else {
                    c(d).edit().remove("quic_so_plugin_load_enable").apply();
                }
            } catch (Exception unused4) {
            }
            try {
                String b6 = b("recv_body_opt_config", null);
                if (!TextUtils.isEmpty(b6)) {
                    l0r.Z0(b6);
                    c(d).edit().putString("recv_body_opt_config", b6).apply();
                } else {
                    c(d).edit().remove("recv_body_opt_config").apply();
                }
            } catch (Exception unused5) {
            }
            try {
                String b7 = b("tlog_enable_switch", null);
                if (!TextUtils.isEmpty(b7)) {
                    boolean booleanValue4 = Boolean.valueOf(b7).booleanValue();
                    l0r.a1(booleanValue4);
                    l("tlog_enable_switch", booleanValue4);
                }
            } catch (Exception unused6) {
            }
            try {
                String b8 = b("jni_tlog_enable_switch", null);
                if (!TextUtils.isEmpty(b8)) {
                    boolean booleanValue5 = Boolean.valueOf(b8).booleanValue();
                    l0r.v0(booleanValue5);
                    l("jni_tlog_enable_switch", booleanValue5);
                }
            } catch (Exception unused7) {
            }
            try {
                String b9 = b("jni_tlog_xquic_level", null);
                if (!TextUtils.isEmpty(b9)) {
                    Long valueOf = Long.valueOf(b9);
                    l0r.w0(valueOf.longValue());
                    j("jni_tlog_xquic_level", valueOf);
                }
            } catch (Exception unused8) {
            }
            try {
                String b10 = b("tunnel_proxy_enable_switch", null);
                if (!TextUtils.isEmpty(b10)) {
                    boolean booleanValue6 = Boolean.valueOf(b10).booleanValue();
                    l0r.d1(booleanValue6);
                    l("tunnel_proxy_enable_switch", booleanValue6);
                }
            } catch (Exception unused9) {
            }
            try {
                String b11 = b("quic_connect_timeout_ms", null);
                if (!TextUtils.isEmpty(b11)) {
                    Long valueOf2 = Long.valueOf(b11);
                    l0r.N0(valueOf2.longValue());
                    j("quic_connect_timeout_ms", valueOf2);
                }
            } catch (Exception unused10) {
            }
            try {
                String b12 = b("tcp_connect_timeout_ms", null);
                if (!TextUtils.isEmpty(b12)) {
                    Long valueOf3 = Long.valueOf(b12);
                    l0r.b1(valueOf3.longValue());
                    j("tcp_connect_timeout_ms", valueOf3);
                }
            } catch (Exception unused11) {
            }
            try {
                String b13 = b("connect_fast_timeout_host_white_list", null);
                if (!TextUtils.isEmpty(b13)) {
                    l0r.n0(b13);
                    k("connect_fast_timeout_host_white_list", b13);
                } else {
                    i("connect_fast_timeout_host_white_list");
                }
            } catch (Exception unused12) {
            }
            try {
                String b14 = b("quic_0rtt_connect_fast_timeout_host_white", null);
                if (!TextUtils.isEmpty(b14)) {
                    l0r.J0(b14);
                    k("quic_0rtt_connect_fast_timeout_host_white", b14);
                } else {
                    i("quic_0rtt_connect_fast_timeout_host_white");
                }
            } catch (Exception unused13) {
            }
            try {
                String b15 = b("multi_network_harmony_white_list", null);
                if (!TextUtils.isEmpty(b15)) {
                    l0r.C0(b15);
                    k("multi_network_harmony_white_list", b15);
                } else {
                    i("multi_network_harmony_white_list");
                }
            } catch (Exception unused14) {
            }
            try {
                String b16 = b("weak_network_force_cellular_host_white_list", null);
                if (!TextUtils.isEmpty(b16)) {
                    l0r.e1(b16);
                    k("weak_network_force_cellular_host_white_list", b16);
                } else {
                    i("weak_network_force_cellular_host_white_list");
                }
            } catch (Exception unused15) {
            }
            try {
                String b17 = b("http3_opt_develop_enable", null);
                if (!TextUtils.isEmpty(b17)) {
                    boolean booleanValue7 = Boolean.valueOf(b17).booleanValue();
                    l0r.t0(booleanValue7);
                    l("http3_opt_develop_enable", booleanValue7);
                } else {
                    i("http3_opt_develop_enable");
                }
            } catch (Exception unused16) {
            }
            try {
                String b18 = b("mpquic_parameter_config", null);
                if (!TextUtils.isEmpty(b18)) {
                    l0r.d0(b18);
                    k("mpquic_parameter_config", b18);
                } else {
                    i("mpquic_parameter_config");
                }
            } catch (Exception unused17) {
            }
            try {
                String b19 = b("mpquic_connect_compensate_host_white_list", null);
                if (!TextUtils.isEmpty(b19)) {
                    l0r.z0(b19);
                    k("mpquic_connect_compensate_host_white_list", b19);
                } else {
                    i("mpquic_connect_compensate_host_white_list");
                }
            } catch (Exception unused18) {
            }
            try {
                String b20 = b("request_read_idle_timeout_switch", null);
                if (!TextUtils.isEmpty(b20)) {
                    boolean booleanValue8 = Boolean.valueOf(b20).booleanValue();
                    l0r.W0(booleanValue8);
                    l("request_read_idle_timeout_switch", booleanValue8);
                } else {
                    i("request_read_idle_timeout_switch");
                }
            } catch (Exception unused19) {
            }
            try {
                String b21 = b("request_idle_timeout_parameter_config", null);
                if (!TextUtils.isEmpty(b21)) {
                    l0r.T0(b21);
                    k("request_idle_timeout_parameter_config", b21);
                } else {
                    i("request_idle_timeout_parameter_config");
                }
            } catch (Exception unused20) {
            }
            try {
                String b22 = b("request_timeout_block_list", null);
                if (!TextUtils.isEmpty(b22)) {
                    l0r.X0(b22);
                    k("request_timeout_block_list", b22);
                } else {
                    i("request_timeout_block_list");
                }
            } catch (Exception unused21) {
            }
            try {
                String b23 = b("multi_network_background_brand_block_list", null);
                if (!TextUtils.isEmpty(b23)) {
                    l0r.j0(b23);
                    k("multi_network_background_brand_block_list", b23);
                } else {
                    i("multi_network_background_brand_block_list");
                }
            } catch (Exception unused22) {
            }
            try {
                String b24 = b("quic_0rtt_cache_expired_time_ms", null);
                if (!TextUtils.isEmpty(b24)) {
                    l0r.K0(Long.valueOf(b24).longValue());
                }
            } catch (Exception unused23) {
            }
            try {
                String b25 = b("http_zstd_enable", null);
                if (!TextUtils.isEmpty(b25)) {
                    boolean booleanValue9 = Boolean.valueOf(b25).booleanValue();
                    l0r.u0(booleanValue9);
                    l("http_zstd_enable", booleanValue9);
                } else {
                    i("http_zstd_enable");
                }
            } catch (Exception unused24) {
            }
            try {
                String b26 = b("agent_free_enable", null);
                if (!TextUtils.isEmpty(b26)) {
                    boolean booleanValue10 = Boolean.valueOf(b26).booleanValue();
                    l0r.e0(booleanValue10);
                    l("agent_free_enable", booleanValue10);
                } else {
                    i("agent_free_enable");
                }
            } catch (Exception unused25) {
            }
            try {
                String b27 = b("common_switch_config", null);
                if (!TextUtils.isEmpty(b27)) {
                    l0r.c0(b27);
                    k("common_switch_config", b27);
                } else {
                    i("common_switch_config");
                }
            } catch (Exception unused26) {
            }
            try {
                String b28 = b("request_limit_speed_host_white_list", null);
                if (!TextUtils.isEmpty(b28)) {
                    l0r.U0(b28);
                    k("request_limit_speed_host_white_list", b28);
                } else {
                    i("request_limit_speed_host_white_list");
                }
            } catch (Exception unused27) {
            }
            try {
                String b29 = b("cdn_connect_option", null);
                if (!TextUtils.isEmpty(b29)) {
                    l0r.o0(b29);
                    k("cdn_connect_option", b29);
                } else {
                    i("cdn_connect_option");
                }
            } catch (Exception unused28) {
            }
            try {
                String b30 = b("quic_init_and_min_cwnd", null);
                if (!TextUtils.isEmpty(b30)) {
                    Long valueOf4 = Long.valueOf(b30);
                    l0r.P0(valueOf4.longValue());
                    j("quic_init_and_min_cwnd", valueOf4);
                } else {
                    i("quic_init_and_min_cwnd");
                }
            } catch (Exception unused29) {
            }
            try {
                String b31 = b("multi_session_host_white_list", null);
                if (!TextUtils.isEmpty(b31)) {
                    l0r.D0(b31);
                    k("multi_session_host_white_list", b31);
                } else {
                    i("multi_session_host_white_list");
                }
            } catch (Exception unused30) {
            }
            try {
                String b32 = b(TNET_TRUSTED_ROOT_CERT, null);
                if (!TextUtils.isEmpty(b32)) {
                    k(TNET_TRUSTED_ROOT_CERT, b32);
                } else {
                    i(TNET_TRUSTED_ROOT_CERT);
                }
            } catch (Exception unused31) {
            }
            try {
                String b33 = b("dns_black_connect_opt_v2_enable", null);
                if (!TextUtils.isEmpty(b33)) {
                    boolean booleanValue11 = Boolean.valueOf(b33).booleanValue();
                    l0r.q0(booleanValue11);
                    l("dns_black_connect_opt_v2_enable", booleanValue11);
                } else {
                    i("dns_black_connect_opt_v2_enable");
                }
            } catch (Exception unused32) {
            }
        }
    }
}
