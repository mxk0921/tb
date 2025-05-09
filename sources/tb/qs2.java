package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.taobaoavsdk.AVSDKLog;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qs2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26901a;
    public final JSONObject b;
    public String c;
    public final boolean d = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enFullPC", "false"));

    static {
        t2o.a(774897765);
    }

    public qs2(JSONObject jSONObject) {
        this.b = jSONObject;
    }

    public final String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71eb46a4", new Object[]{this, str});
        }
        if (!str.contains("_")) {
            str2 = ew0.m(str, "264") + "_sdr";
        } else {
            str2 = null;
        }
        if (str.contains("hdr")) {
            str2 = str;
        }
        if ((str.contains("266") || str.contains("265")) && !str.contains("hdr")) {
            str2 = ew0.m(str, "sdr");
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "CDVideoDefinition fullPCVideoDefinition  PC->FULL:  " + str + " -> " + str2);
        return str2 == null ? str : str2;
    }

    public String b() {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f26901a) && (jSONObject = this.b) != null) {
            Object opt = jSONObject.opt(VideoControllerManager.KEY_CACHEKEY);
            if (opt == null) {
                str = null;
            } else {
                str = opt.toString();
            }
            this.f26901a = str;
        }
        return this.f26901a;
    }

    public String c() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57099950", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.c) && (jSONObject = this.b) != null) {
            Object opt = jSONObject.opt("definition");
            String str = null;
            if (this.d) {
                if (opt != null) {
                    str = a(opt.toString());
                }
                this.c = str;
            } else {
                if (opt != null) {
                    str = opt.toString();
                }
                this.c = str;
            }
        }
        return this.c;
    }
}
