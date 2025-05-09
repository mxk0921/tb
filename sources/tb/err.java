package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class err implements blc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18782a;
        public final /* synthetic */ Map b;

        public a(String str, Map map) {
            this.f18782a = str;
            this.b = map;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            OrangeConfig.getInstance().unregisterListener(new String[]{this.f18782a}, this);
            Map map2 = this.b;
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    u2s.b(str2, err.this.b(this.f18782a, str2, (String) this.b.get(str2)));
                }
            }
        }
    }

    static {
        t2o.a(779092281);
        t2o.a(806355886);
    }

    @Override // tb.blc
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fb6b9a", new Object[]{this, str, map});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{str}, new a(str, map), true);
        }
    }

    @Override // tb.blc
    public String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{this, str, str2, str3});
        }
        if (sbt.p()) {
            String c = c(str, str2);
            if (!TextUtils.isEmpty(c)) {
                q0h.a("TBOrangeConfig", "orange使用测试工具持久化值 " + str + "_" + str2 + " value " + c);
                return c;
            }
        }
        if (TextUtils.isEmpty(up6.h(vx9.c()))) {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        }
        OrangeConfig instance = OrangeConfig.getInstance();
        return instance.getConfig(str + "_" + up6.h(vx9.c()), str2, OrangeConfig.getInstance().getConfig(str, str2, str3));
    }

    @Override // tb.blc
    public String getStringSharedPreference(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d3974", new Object[]{this, str, str2, str3});
        }
        String a2 = u2s.a(str2);
        if (TextUtils.isEmpty(a2)) {
            return b(str, str2, str3);
        }
        return a2;
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("feca3747", new Object[]{this, str, str2});
        }
        try {
            SharedPreferences sharedPreferences = v2s.o().f().getApplication().getSharedPreferences("orange_mock_value", 0);
            return sharedPreferences.getString(str + "_" + str2, "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
