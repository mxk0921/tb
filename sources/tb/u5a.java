package tb;

import android.content.Context;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(789577848);
    }

    public void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa48b0d8", new Object[]{this, context, new Boolean(z)});
        } else if (!"off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "passivelocationoption", "off"))) {
            ich ichVar = new ich(yah.f31937a);
            if (!ich.e && ichVar.a()) {
                tbj tbjVar = new tbj(context, tbj.PASSIVE_LOCATION_CHANNEL_GATHER_SOURCE);
                long j = 3600000;
                long j2 = 100;
                if (z) {
                    String config = OrangeConfig.getInstance().getConfig("gps", "backGatherNormalRate", "30");
                    if (config != null && !config.isEmpty()) {
                        j = Long.parseLong(config) * 60000;
                    }
                    String config2 = OrangeConfig.getInstance().getConfig("gps", "backAccuracy", "500");
                    if (config2 != null && !config2.isEmpty()) {
                        j2 = Long.parseLong(config2);
                    }
                } else {
                    String config3 = OrangeConfig.getInstance().getConfig("gps", "gatherNormalRate", "10");
                    if (config3 != null && !config3.isEmpty()) {
                        j = Long.parseLong(config3) * 60000;
                    }
                    String config4 = OrangeConfig.getInstance().getConfig("gps", UserLocation.KEY_DOUBLE_ACCURACY, "500");
                    if (config4 != null && !config4.isEmpty()) {
                        j2 = Long.parseLong(config4);
                    }
                }
                tbjVar.c(j, (float) j2);
            }
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4839bd1c", new Object[]{this, context});
        } else {
            new tbj(context, tbj.PASSIVE_LOCATION_CHANNEL_GATHER_SOURCE).e();
        }
    }
}
