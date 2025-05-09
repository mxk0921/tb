package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class owt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"tinct"}, new a(context), true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f25716a;

        public a(Context context) {
            this.f25716a = context;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                if (configs != null) {
                    SharedPreferences l = com.taobao.tinct.impl.config.a.l(this.f25716a);
                    if (l == null) {
                        Log.e("TinctOrangeReceiver", "The sharedPreferences is null");
                        return;
                    }
                    SharedPreferences.Editor edit = l.edit();
                    if ("tinct".equals(str)) {
                        String str2 = configs.get(com.taobao.tinct.impl.config.a.CONFIG_IS_TINCT_ENABLE);
                        String str3 = configs.get(com.taobao.tinct.impl.config.a.CONFIG_TICNT_JSON);
                        String str4 = configs.get(com.taobao.tinct.impl.config.a.CONFIG_ORANGE_BIZ_MAP);
                        String str5 = configs.get(com.taobao.tinct.impl.config.a.CONFIG_IS_TINCT_LAUNCH_ENABLE);
                        if (TextUtils.isEmpty(str2)) {
                            edit.remove(com.taobao.tinct.impl.config.a.CONFIG_IS_TINCT_ENABLE);
                        } else if ("true".equals(str2)) {
                            edit.putBoolean(com.taobao.tinct.impl.config.a.CONFIG_IS_TINCT_ENABLE, true);
                        } else {
                            edit.putBoolean(com.taobao.tinct.impl.config.a.CONFIG_IS_TINCT_ENABLE, false);
                        }
                        if (!TextUtils.equals(l.getString(com.taobao.tinct.impl.config.a.CONFIG_TICNT_JSON, null), str3)) {
                            if (!TextUtils.isEmpty(str3)) {
                                edit.putString(com.taobao.tinct.impl.config.a.CONFIG_TICNT_JSON, str3);
                            } else {
                                edit.remove(com.taobao.tinct.impl.config.a.CONFIG_TICNT_JSON);
                            }
                            com.taobao.tinct.impl.config.a.N(str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            edit.putString(com.taobao.tinct.impl.config.a.CONFIG_ORANGE_BIZ_MAP, str4);
                        } else {
                            edit.remove(com.taobao.tinct.impl.config.a.CONFIG_ORANGE_BIZ_MAP);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            edit.putBoolean(com.taobao.tinct.impl.config.a.CONFIG_IS_TINCT_LAUNCH_ENABLE, "true".equals(str5));
                        } else {
                            edit.remove(com.taobao.tinct.impl.config.a.CONFIG_IS_TINCT_LAUNCH_ENABLE);
                        }
                        edit.apply();
                        Log.e("TinctOrangeReceiver", "[orange]Tinct Config: isTinctEnable=" + str2 + ", isTinctLaunchEnable=" + str5 + ", orange_biz_map=" + str4 + ", tinct_json_config=" + str3);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("TinctOrangeReceiver", "faile to get the orange config!");
            }
        }
    }
}
