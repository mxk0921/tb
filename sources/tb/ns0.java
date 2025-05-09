package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.threads.BackgroundExecutor;
import com.taobao.alimama.tkcps.TaokeBaseUtil;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ns0 implements pfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLK1 = "clk1";
    public static final String KEY_TTID = "dynamic_ttid";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                hat.b().c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                hat.b().d();
            }
        }
    }

    static {
        t2o.a(1020264450);
        t2o.a(1020264453);
    }

    public ns0(String str) {
        TaoLog.Logi("AlimamaSdk", "create taoke cps implement : " + str);
        TaokeBaseUtil.h(str);
    }

    @Override // tb.pfb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3640da", new Object[]{this});
        }
    }

    @Override // tb.pfb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2176b979", new Object[]{this});
        } else {
            BackgroundExecutor.execute(new a());
        }
    }

    @Override // tb.pfb
    public synchronized void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff82c3f", new Object[]{this, str, str2});
        }
    }

    @Override // tb.pfb
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740791cb", new Object[]{this, str});
        } else {
            TaokeBaseUtil.g(str);
        }
    }

    @Override // tb.pfb
    public void e(String str) {
        String m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1803f51", new Object[]{this, str});
            return;
        }
        TaoLog.Logd("AlimamaSdk", "parsing tk_cps_param: " + str);
        if (!TextUtils.isEmpty(str) && (m = m("flj", str)) != null) {
            hat.b().e("flj", m);
            BackgroundExecutor.execute(new b());
        }
    }

    @Override // tb.pfb
    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f65f3d03", new Object[]{this, str});
        }
        return m(str, hat.b().a(str));
    }

    @Override // tb.pfb
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3753e", new Object[]{this});
        }
    }

    @Override // tb.pfb
    public void h(String str, long j, long j2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb813d5", new Object[]{this, str, new Long(j), new Long(j2), new Boolean(z), map});
            return;
        }
        i4g.a("weex_commit_taoke_info", "url=" + str + ",extMap=" + JSON.toJSONString(map));
        TaokeBaseUtil.e(str, j, j2, z, map);
    }

    @Override // tb.pfb
    @Deprecated
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398db395", new Object[]{this});
        } else {
            TaokeBaseUtil.i();
        }
    }

    @Override // tb.pfb
    public Map<String, String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dcbc0ed1", new Object[]{this});
        }
        return TaokeBaseUtil.d();
    }

    @Override // tb.pfb
    public void k(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8285226f", new Object[]{this, str, str2, str3, map});
        } else {
            TaokeBaseUtil.a(str, str2, str3, map);
        }
    }

    @Override // tb.pfb
    public void l(String str, long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31a31b0", new Object[]{this, str, new Long(j), new Long(j2), new Boolean(z)});
        } else if (vm2.u()) {
            TaokeBaseUtil.e(str, j, j2, z, null);
        } else {
            TaokeBaseUtil.b(str, j, j2, z, null);
        }
    }

    public final String m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ce2ed2", new Object[]{this, str, str2});
        }
        if (!"flj".equals(str) || str2 == null || TextUtils.isDigitsOnly(str2)) {
            return str2;
        }
        UserTrackLogs.trackAdLog("Munion_tk_cps_param_parse", "error_code=0", "error_msg=flj_value_error", "req_param=".concat(str2));
        return null;
    }
}
