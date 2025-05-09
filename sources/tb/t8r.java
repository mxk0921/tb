package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.aspect.monitor.buy2.0")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class t8r extends fv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEGRADE_REASON = "buy2DowngradeNewContainer";
    public lo d;

    static {
        t2o.a(708837490);
    }

    public static /* synthetic */ Object ipc$super(t8r t8rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/aspect/TBBuyMonitorExtension");
    }

    @Override // tb.fv
    public void J0(boolean z, JSONObject jSONObject, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5582d87e", new Object[]{this, new Boolean(z), jSONObject, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_DEGRADE_REASON, str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.d.f(), hashMap);
    }

    @Override // tb.us, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.d = loVar;
        }
    }
}
