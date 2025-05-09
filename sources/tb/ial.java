package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.zcache.core.ZCacheCoreProxy;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ial implements cfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21191a;
        public final /* synthetic */ v5n b;

        public a(ial ialVar, String str, v5n v5nVar) {
            this.f21191a = str;
            this.b = v5nVar;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (this.f21191a.equals(str)) {
                String customConfig = OrangeConfig.getInstance().getCustomConfig(this.f21191a, "{}");
                ArrayList arrayList = new ArrayList();
                arrayList.add(customConfig);
                ((ZCacheCoreProxy.d) this.b).a(arrayList);
            }
        }
    }

    static {
        t2o.a(996147257);
        t2o.a(996147208);
    }

    public void a(String str, v5n v5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9306d8f", new Object[]{this, str, v5nVar});
        } else if (str != null && v5nVar != null) {
            String replace = str.replace('.', '_');
            try {
                OrangeConfig.getInstance().registerListener(new String[]{replace}, new a(this, replace, v5nVar), true);
            } catch (NoClassDefFoundError unused) {
            }
        }
    }
}
