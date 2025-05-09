package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.taobaoavsdk.AVSDKLog;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ba5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f16276a;
    public String b;
    public int c;
    public String d;
    public int e;
    public String f;
    public int g;
    public final boolean h;

    static {
        t2o.a(774897767);
    }

    public ba5(JSONObject jSONObject) {
        this.h = false;
        this.f16276a = jSONObject;
        this.h = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enFullPC", "false"));
    }

    public final String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dce49fd6", new Object[]{this, str});
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
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "HDR DWFullPCVideoDefinition  PC->FULL:  " + str + " -> " + str2);
        return str2 == null ? str : str2;
    }

    public String b() {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f) && (jSONObject = this.f16276a) != null) {
            Object opt = jSONObject.opt(VideoControllerManager.KEY_CACHEKEY);
            if (opt == null) {
                str = null;
            } else {
                str = opt.toString();
            }
            this.f = str;
        }
        return this.f;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        JSONObject jSONObject = this.f16276a;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return "";
    }

    public String d() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57099950", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b) && (jSONObject = this.f16276a) != null) {
            Object opt = jSONObject.opt("definition");
            String str = null;
            if (this.h) {
                if (opt != null) {
                    str = a(opt.toString());
                }
                this.b = str;
            } else {
                if (opt != null) {
                    str = opt.toString();
                }
                this.b = str;
            }
        }
        return this.b;
    }

    public int f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e53ab7e2", new Object[]{this})).intValue();
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "getRealVideoSize");
        try {
            if (this.e == 0 && (jSONObject = this.f16276a) != null) {
                Object opt = jSONObject.opt(pg1.ATOM_length);
                this.e = (int) ((opt == null || !TextUtils.isDigitsOnly(opt.toString())) ? vu3.b.GEO_NOT_SUPPORT : Integer.parseInt(opt.toString()));
            }
        } catch (Exception unused) {
            this.e = -1;
        }
        return this.e;
    }

    public int g() {
        JSONObject jSONObject;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39f7162", new Object[]{this})).intValue();
        }
        if (this.c == 0 && (jSONObject = this.f16276a) != null) {
            Object opt = jSONObject.opt(VideoControllerManager.KEY_BITRATE);
            if (opt != null && TextUtils.isDigitsOnly(opt.toString())) {
                i = Integer.parseInt(opt.toString());
            }
            this.c = i;
        }
        return this.c;
    }

    public int h() {
        JSONObject jSONObject;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfe105e0", new Object[]{this})).intValue();
        }
        try {
            if (this.e == 0 && (jSONObject = this.f16276a) != null) {
                Object opt = jSONObject.opt(pg1.ATOM_length);
                double parseInt = (opt == null || !TextUtils.isDigitsOnly(opt.toString())) ? vu3.b.GEO_NOT_SUPPORT : Integer.parseInt(opt.toString());
                if (parseInt >= 102400.0d && parseInt <= 2.097152E8d) {
                    i = (int) parseInt;
                    this.e = i;
                }
                i = -1;
                this.e = i;
            }
        } catch (Exception unused) {
            this.e = -1;
        }
        return this.e;
    }

    public String i() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d) && (jSONObject = this.f16276a) != null) {
            Object opt = jSONObject.opt("video_url");
            this.d = opt == null ? null : opt.toString();
        }
        return this.d;
    }

    public int e() {
        JSONObject jSONObject;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("164bd7c1", new Object[]{this})).intValue();
        }
        if (this.g == 0 && (jSONObject = this.f16276a) != null) {
            Object opt = jSONObject.opt("playableBytes");
            if (opt != null && TextUtils.isDigitsOnly(opt.toString())) {
                i = Integer.parseInt(opt.toString());
            }
            this.g = i;
        }
        return this.g;
    }
}
