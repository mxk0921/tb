package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.common.util.SwitchConfigUtil;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class v4j implements u4j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.u4j
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67001ef", new Object[]{this, context});
            return;
        }
        try {
            t5j.c(context);
            m0r m0rVar = new m0r();
            m0rVar.a(context);
            t5j.d(new String[]{SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_ANDROID_SWITCH}, m0rVar);
            t5j.d(new String[]{SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH}, new gmv());
            t5j.d(new String[]{SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_PARAMS_SWITCH}, m0rVar);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                StringBuilder sb = new StringBuilder(64);
                sb.append("groupNames=[mtopsdk_android_switch,mtopsdk_upload_switch]mtopsdk_params_switch]");
                TBSdkLog.i("mtopsdk.MtopConfigOrangeListenerImpl", "[initConfig] initConfig  parameter:" + sb.toString());
            }
        } catch (Throwable th) {
            TBSdkLog.w("mtopsdk.MtopConfigOrangeListenerImpl", "[initConfig] init mtop orange config error", th.toString());
        }
    }

    @Override // tb.u4j
    public Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c438cced", new Object[]{this, str});
        }
        try {
            return t5j.b(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // tb.u4j
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        try {
            return t5j.a(str, str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }
}
