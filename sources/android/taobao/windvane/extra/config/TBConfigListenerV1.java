package android.taobao.windvane.extra.config;

import android.taobao.windvane.jsbridge.WVJsBridge;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.t2o;
import tb.v7t;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBConfigListenerV1 implements z8l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855930);
        t2o.a(613417024);
    }

    @Override // tb.z8l
    public void onConfigUpdate(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str)) {
            v7t.a("TBConfigReceiver", "ConfigName: " + str + " isFromLocal:" + z);
            if (str.equalsIgnoreCase("WindVane")) {
                WVJsBridge.f = OrangeConfig.getInstance().getConfig("WindVane", "enableGetParamByJs", "0").equals("1");
            }
        }
    }
}
