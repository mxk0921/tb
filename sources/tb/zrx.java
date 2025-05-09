package tb;

import com.alibaba.wireless.aliprivacy.AliPrivacyCore;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zrx implements jpb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f32980a = "aliprivacy_config";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(zrx zrxVar) {
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            AliPrivacyCore.l(configs);
            if (configs != null) {
                str2 = configs.toString();
            } else {
                str2 = "empty";
            }
            g01.a("OrangeConfigAdapter", str2);
        }
    }

    @Override // tb.jpb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd739c8", new Object[]{this});
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{f32980a}, new a(this));
        OrangeConfig.getInstance().getConfigs(f32980a);
    }
}
