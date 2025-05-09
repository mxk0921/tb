package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.taobaoavsdk.AVSDKLog;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c75 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final o85 f16898a;

    static {
        t2o.a(452984837);
    }

    public c75(JSONObject jSONObject) {
        this.f16898a = new o85(a(VideoControllerManager.ARRAY_KEY_CONFIGURATION, jSONObject));
    }

    public final JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b87feb1d", new Object[]{this, str, jSONObject});
        }
        if (str == null || jSONObject == null) {
            return null;
        }
        try {
            Object opt = jSONObject.opt(str);
            if (opt != null) {
                return (JSONObject) opt;
            }
            return null;
        } catch (Exception e) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "getconfig getJson error" + e.getMessage());
            return null;
        }
    }

    public o85 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o85) ipChange.ipc$dispatch("34e769f4", new Object[]{this});
        }
        return this.f16898a;
    }
}
