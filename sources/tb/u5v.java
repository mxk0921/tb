package tb;

import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u5v b = new u5v();

    /* renamed from: a  reason: collision with root package name */
    public String f29168a = "";

    static {
        t2o.a(573571146);
    }

    public static u5v b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u5v) ipChange.ipc$dispatch("6517c86", new Object[0]);
        }
        return b;
    }

    public final JSONObject a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1470df83", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            jSONObject.put("schemeId", (Object) "Page_Home@float_window");
            jSONObject.put("bizId", (Object) "auge-20737");
            jSONObject.put("schemeNumId", (Object) "47");
            jSONObject.put("bizNumId", (Object) "11197");
            jSONObject.put(arp.MATERIAL_ID_KEY, (Object) "22692");
        } else {
            jSONObject.put("schemeId", (Object) "Page_Home@float_window");
            jSONObject.put("bizId", (Object) "splash_ad");
            jSONObject.put("schemeNumId", (Object) "25");
            jSONObject.put("bizNumId", (Object) "11122");
            jSONObject.put(arp.MATERIAL_ID_KEY, (Object) "22328");
        }
        return jSONObject;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("931de447", new Object[]{this});
        }
        return this.f29168a;
    }

    public boolean d() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c629af3", new Object[]{this})).booleanValue();
        }
        int i = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
        JSONObject a2 = a(i);
        JSONObject jSONObject = new JSONObject();
        try {
            boolean r = UCPManager.r(a2, jSONObject);
            jgh.a("UcpController", "initUcpSdk isUcpSDKReady = " + r);
            if (jSONObject.containsKey("msg")) {
                str = jSONObject.getString("msg");
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder("initUcpSdk tryTriggerUCPEvent msg=");
            sb.append(str);
            sb.append(", 是否是线上？");
            if (i == 0) {
                str2 = "线上";
            } else {
                str2 = "非线上";
            }
            sb.append(str2);
            jgh.a("UcpController", sb.toString());
            if (!r) {
                this.f29168a = "";
                AppMonitor.Alarm.commitFail("Page_Topshow", "linkage_pop", "101", str);
                return false;
            }
            String string = jSONObject.getString("popIndexId");
            this.f29168a = string;
            if (TextUtils.isEmpty(string)) {
                AppMonitor.Alarm.commitFail("Page_Topshow", "linkage_pop", "102", str);
            }
            jgh.a("UcpController", "initUcpSdk popIndexId = " + this.f29168a);
            AppMonitor.Alarm.commitSuccess("Page_Topshow", "linkage_pop");
            return true;
        } catch (Throwable th) {
            this.f29168a = "";
            AppMonitor.Alarm.commitFail("Page_Topshow", "linkage_pop", "103", th.getMessage());
            jgh.a("UcpController", "initUcpSdk throwable = " + th);
            return false;
        }
    }
}
