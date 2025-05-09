package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.mce;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v8l implements mce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OrangeConfig f29855a = OrangeConfig.getInstance();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29856a;
        public final /* synthetic */ mce.a b;

        public a(v8l v8lVar, String str, mce.a aVar) {
            this.f29856a = str;
            this.b = aVar;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (str.equals(this.f29856a)) {
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                mce.a aVar = this.b;
                if (aVar != null) {
                    aVar.a(configs);
                }
            }
        }
    }

    static {
        t2o.a(982516052);
        t2o.a(982516049);
    }

    @Override // tb.mce
    public void a(String str, mce.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba67b7e", new Object[]{this, str, aVar});
        } else {
            this.f29855a.registerListener(new String[]{str}, new a(this, str, aVar), true);
        }
    }

    @Override // tb.mce
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        return this.f29855a.getConfig(str, str2, str3);
    }

    @Override // tb.mce
    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        return this.f29855a.getConfigs(str);
    }
}
