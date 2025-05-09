package com.taobao.tao.welcome;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.obk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Launcher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BC_SP = "alibc_flowcustoms";
    private static final boolean DEBUG = true;
    private static final String ORANGE_NAMESPACE = "next_launch";
    private static final String POPLAYER_SP = "sp_poplayer_info_xxx";
    public static final String WELCOME_SP = "com.taobao.tao.welcome.Welcome";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f12883a;

        public a(Launcher launcher, Application application) {
            this.f12883a = application;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            Map<String, String> configs;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("next_launch".equals(str) && (configs = OrangeConfig.getInstance().getConfigs(str)) != null && !configs.isEmpty()) {
                this.f12883a.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().putBoolean(HostController.KEY_REQUEST_PERMISSION_ALWAYS, "1".equals(configs.get("welRequestPerAlways"))).commit();
            }
        }
    }

    static {
        t2o.a(734003222);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Log.e("Welcome", "preload preference with poplayer");
        application.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0);
        application.getSharedPreferences(POPLAYER_SP, 0);
        application.getSharedPreferences(BC_SP, 0);
        OrangeConfig.getInstance().registerListener(new String[]{"next_launch"}, new a(this, application), false);
    }
}
