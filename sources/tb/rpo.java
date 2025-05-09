package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class rpo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARE_PREFERENCES_NAME = "SafeModeOrange";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f27533a;

        public a(Application application) {
            this.f27533a = application;
        }

        public final void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c644b96", new Object[]{this, map});
                return;
            }
            SharedPreferences.Editor edit = this.f27533a.getSharedPreferences(rpo.SHARE_PREFERENCES_NAME, 0).edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    edit.putString(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    Log.e(rpo.SHARE_PREFERENCES_NAME, e.toString());
                }
            }
            edit.apply();
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(rpo.SHARE_PREFERENCES_NAME);
            if (configs != null && configs.size() > 0) {
                a(configs);
            }
        }
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        OrangeConfig.getInstance().getConfigs(SHARE_PREFERENCES_NAME);
        OrangeConfig.getInstance().registerListener(new String[]{SHARE_PREFERENCES_NAME}, new a(application), true);
    }
}
