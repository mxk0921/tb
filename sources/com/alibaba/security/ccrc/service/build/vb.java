package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;
import tb.obk;
import tb.pqw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String A = "wukong_log_mtop_switch";
    public static final String B = "wukong_log_ut_switch";
    public static final List<String> C = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public static final String f2630a = "OrangeService";
    public static final String b = "lrc_sdk";
    public static final String c = "wukong_ccrccode_config";
    public static final String d = "wukong_support_low_device";
    public static final String e = "global_switch";
    public static final String f = "key_bitmap_check_limit_size";
    public static final String g = "key_config_disk_cache_switch";
    public static final String h = "key_mrt_start_switch";
    public static final String i = "_switch";
    public static final String j = "log_upload_size";
    public static final String k = "log_interval";
    public static final String l = "bootstrap_log_interval";
    public static final String m = "log_switch";
    public static final String n = "log_init_upload_size";
    public static final String o = "ccrc_behavior_switch";
    public static final String p = "behavior_domain_config";
    public static final String q = "configVersion";
    public static final String r = "behaviorConfigVersion";
    public static final String s = "event_result_upload_interval";
    public static final String t = "_heartbeat_switch";
    public static final String u = "_bh_detect_frequency";
    public static final String v = "ccrc_mnn_detect_latch_time";
    public static final String w = "ccrc_cache_valid_time";
    public static final String x = "ccrc_sg_pip_switch";
    public static final String y = "_feature_reprocess_switch";
    public static final String z = "wukong_feature_reprocess_switch";
    public wb D;
    public final obk E = new tb(this);
    public final obk F = new ub(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final vb f2631a = new vb();

        public static /* synthetic */ vb a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vb) ipChange.ipc$dispatch("e36fcc66", new Object[0]);
            }
            return f2631a;
        }
    }

    public static /* synthetic */ void a(vb vbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315b1a0", new Object[]{vbVar});
        } else {
            vbVar.t();
        }
    }

    private String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("255e0466", new Object[]{this});
        }
        try {
            return OrangeConfig.getInstance().getCustomConfig(c, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        String b2 = b(str + t, "0");
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        return "1".equals(b2);
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        String b2 = b(str + i, "1");
        if (TextUtils.isEmpty(b2)) {
            return true;
        }
        return "1".equals(b2);
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : o() && d(str);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        String b2 = b(g, "1");
        if (TextUtils.isEmpty(b2)) {
            return true;
        }
        return "1".equals(b2);
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
        }
        try {
            return Integer.parseInt(b(s, "10")) * 1000;
        } catch (Throwable unused) {
            return 10000L;
        }
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue();
        }
        try {
            return Long.parseLong(b(k, "60"));
        } catch (Throwable unused) {
            return 60L;
        }
    }

    public List<Float> i() {
        List<Float> parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this});
        }
        try {
            String b2 = b(f, null);
            if (!TextUtils.isEmpty(b2) && (parseArray = JSON.parseArray(b2, Float.class)) != null) {
                if (parseArray.size() == 4) {
                    return parseArray;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(b(v, "10"));
        } catch (Throwable unused) {
            return 10;
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        String b2 = b(h, "1");
        if (TextUtils.isEmpty(b2)) {
            return true;
        }
        return "1".equals(b2);
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(b(j, "100"));
        } catch (Throwable unused) {
            return 100;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(b(n, "50"));
        } catch (Throwable unused) {
            return 50;
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        String b2 = b(e, "1");
        if (TextUtils.isEmpty(b2)) {
            return true;
        }
        return "1".equals(b2);
    }

    private String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        try {
            String a2 = a(str, str2);
            return TextUtils.isEmpty(a2) ? (String) a(str, str2) : a2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        try {
            return Integer.parseInt(b(w, "43200")) * 60 * 1000;
        } catch (Throwable unused) {
            return pqw.DEFAULT_MAX_AGE;
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        try {
            return "1".equals(b(z, "1"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        try {
            return "1".equals(b(A, "1"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        try {
            return "1".equals(b(B, "1"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        String b2 = b(d, "0");
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        return "1".equals(b2);
    }

    private void t() {
        List<String> parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig(c, null);
        if (!TextUtils.isEmpty(customConfig) && (parseArray = JSON.parseArray(customConfig, String.class)) != null && !parseArray.isEmpty()) {
            for (String str : parseArray) {
                List<String> list = C;
                if (!list.contains(str)) {
                    list.add(str);
                }
            }
            OrangeConfig.getInstance().registerListener((String[]) C.toArray(new String[0]), this.F, true);
        }
    }

    public synchronized void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        if (this.D == null) {
            this.D = new wb(context);
            OrangeConfig.getInstance().registerListener(new String[]{b, c}, this.E, true);
        }
    }

    public static vb c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (vb) ipChange.ipc$dispatch("57051024", new Object[0]) : a.f2631a;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        try {
            return Long.parseLong(b(l, "60"));
        } catch (Throwable unused) {
            return 60L;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            return "1".equals(b(x, "1"));
        } catch (Throwable unused) {
            return true;
        }
    }

    private <T> T a(String str, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, t2});
        }
        try {
            wb wbVar = this.D;
            if (wbVar != null) {
                return (T) wbVar.a(wb.f2633a, str, t2);
            }
        } catch (Throwable unused) {
        }
        return t2;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(y);
            return "1".equals(b(sb.toString(), "1"));
        } catch (Throwable unused) {
            return true;
        }
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : OrangeConfig.getInstance().getConfig(b, str, str2);
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        try {
            return Math.max(Integer.parseInt(b(str + u, "1")), 1);
        } catch (Throwable unused) {
            return 1;
        }
    }
}
