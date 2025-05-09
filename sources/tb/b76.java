package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b76 implements zub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rpb f16224a;

        public a(b76 b76Var, rpb rpbVar) {
            this.f16224a = rpbVar;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                this.f16224a.onConfigUpdate(str, map);
            }
        }
    }

    @Override // tb.zub
    public void a(String[] strArr, rpb rpbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba07db59", new Object[]{this, strArr, rpbVar, new Boolean(z)});
        } else {
            OrangeConfig.getInstance().registerListener(strArr, new a(this, rpbVar), z);
        }
    }

    @Override // tb.zub
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
