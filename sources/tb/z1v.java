package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z1v extends xzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
                z1v.this.g();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                return;
            }
            nhh.f(null, "aGroupname", str, "aIsCached", Boolean.valueOf(z));
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs != null) {
                z1v.this.i(str, configs);
            }
        }
    }

    static {
        t2o.a(962592843);
    }

    public static /* synthetic */ Object ipc$super(z1v z1vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/config/UTOrangeConfMgr");
    }

    @Override // tb.xzu
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9286d62b", new Object[]{this});
            return;
        }
        try {
            OrangeConfig.getInstance().init(o2w.k().g());
            zdt.c().f(new a());
            OrangeConfig.getInstance().registerListener(xzu.ORANGE_CONFIGS, new b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
