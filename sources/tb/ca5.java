package tb;

import android.text.TextUtils;
import com.alipay.auth.mobile.common.AlipayAuthConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ca5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String saltForSign = "cloudvideo_signature";

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f16936a;
    public final float b;
    public final Map<String, ba5> c;
    public final Map<String, qs2> d;
    public final Map<String, String> e;
    public final Map<String, Integer> f;
    public final Map<String, String> g;
    public final Map<String, String> h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final String n;
    public final List<String> o;
    public final String p;
    public final boolean q;
    public final String r;
    public final String s = "";
    public final feh t;
    public final boolean u;

    static {
        t2o.a(774897768);
    }

    public ca5(JSONObject jSONObject, String str) {
        String str2;
        Object opt;
        Object opt2;
        String str3;
        this.b = 1.0f;
        this.i = false;
        this.q = false;
        this.r = "";
        this.u = false;
        this.t = new feh(toString(), str);
        this.f16936a = jSONObject;
        this.u = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enFullPC", "false"));
        if (jSONObject != null) {
            Object opt3 = jSONObject.opt(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
            if (opt3 != null) {
                String.valueOf(opt3);
            }
            Object opt4 = jSONObject.opt("id");
            this.p = opt4 == null ? null : String.valueOf(opt4);
            Object opt5 = jSONObject.opt("duration");
            if (opt5 != null && TextUtils.isDigitsOnly(opt5.toString())) {
                Long.parseLong(opt5.toString());
            }
            Object opt6 = jSONObject.opt("passThroughData");
            if (opt6 == null) {
                str2 = "";
            } else {
                str2 = String.valueOf(opt6);
            }
            this.n = str2;
            Object opt7 = jSONObject.opt(VideoControllerManager.ARRAY_KEY_RESOURCES);
            if (opt7 != null && (opt7 instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) opt7;
                if (jSONArray.length() > 0) {
                    this.c = new HashMap();
                    this.f = new HashMap();
                    this.e = new HashMap();
                    this.g = new HashMap();
                    this.h = new HashMap();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        ba5 ba5Var = new ba5(jSONArray.optJSONObject(i));
                        if (!TextUtils.isEmpty(ba5Var.d()) && !TextUtils.isEmpty(ba5Var.i())) {
                            ((HashMap) this.c).put(ba5Var.d(), ba5Var);
                            ((HashMap) this.f).put(ba5Var.d(), Integer.valueOf(ba5Var.g()));
                            Object opt8 = jSONArray.optJSONObject(i).opt("passThroughData");
                            Map<String, String> map = this.e;
                            String d = ba5Var.d();
                            if (opt8 == null) {
                                str3 = "";
                            } else {
                                str3 = String.valueOf(opt8);
                            }
                            ((HashMap) map).put(d, str3);
                        }
                        if (!TextUtils.isEmpty(ba5Var.b()) && !TextUtils.isEmpty(ba5Var.i())) {
                            ((HashMap) this.g).put(ba5Var.b(), ba5Var.i());
                            ((HashMap) this.h).put(ba5Var.b(), ba5Var.d());
                        }
                        Object opt9 = jSONArray.optJSONObject(i).opt("encodeUniqueCode");
                        if (opt9 != null) {
                            String valueOf = String.valueOf(opt9);
                            if (!TextUtils.isEmpty(valueOf)) {
                                this.s += valueOf;
                            }
                        }
                    }
                }
            }
            AVSDKLog.e(this.t, "HDR DWVideoInfoData mVideoId " + this.p + " mVideoBitRateMap " + this.f);
            Object opt10 = this.f16936a.opt(VideoControllerManager.ARRAY_KEY_CONFIGURATION);
            if (opt10 != null && (opt10 instanceof JSONObject)) {
                JSONObject jSONObject2 = (JSONObject) opt10;
                Object opt11 = jSONObject2.opt("playerBufferSetting");
                if (opt11 != null && (opt11 instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) opt11;
                    Object opt12 = jSONObject3.opt("avdataBufferedMaxBytes");
                    this.j = (opt12 == null || !TextUtils.isDigitsOnly(opt12.toString())) ? 0 : Integer.parseInt(opt12.toString());
                    Object opt13 = jSONObject3.opt("avdataBufferedMaxTime");
                    this.k = (opt13 == null || !TextUtils.isDigitsOnly(opt13.toString())) ? 0 : Integer.parseInt(opt13.toString());
                    Object opt14 = jSONObject3.opt("currentLevel");
                    this.l = (opt14 == null || !TextUtils.isDigitsOnly(opt14.toString())) ? 0 : Integer.parseInt(opt14.toString());
                    Object opt15 = jSONObject3.opt("maxLevel");
                    this.m = (opt15 == null || !TextUtils.isDigitsOnly(opt15.toString())) ? 0 : Integer.parseInt(opt15.toString());
                }
                try {
                    Object opt16 = jSONObject2.opt(VideoControllerManager.ARRAY_KEY_ENABLEVODABR);
                    if (opt16 != null) {
                        this.i = ew0.s(opt16.toString());
                    }
                } catch (Exception unused) {
                    AVSDKLog.e(this.t, "DWVideoInfoData construct: get enableVodAbr from configurationObj failed!");
                }
            }
            Object opt17 = this.f16936a.opt(VideoControllerManager.ARRAY_KEY_CACHES);
            if (opt17 != null && (opt17 instanceof JSONArray)) {
                JSONArray jSONArray2 = (JSONArray) opt17;
                if (jSONArray2.length() > 0) {
                    this.d = new HashMap();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        qs2 qs2Var = new qs2(jSONArray2.optJSONObject(i2));
                        if (!TextUtils.isEmpty(qs2Var.c()) && !TextUtils.isEmpty(qs2Var.b())) {
                            ((HashMap) this.d).put(qs2Var.c(), qs2Var);
                        }
                    }
                }
            }
            Object opt18 = this.f16936a.opt(VideoControllerManager.ARRAY_KEY_DEFINITIONPRIORITY);
            if (opt18 != null && (opt18 instanceof JSONArray)) {
                JSONArray jSONArray3 = (JSONArray) opt18;
                if (jSONArray3.length() > 0) {
                    this.o = new ArrayList();
                    int length3 = jSONArray3.length();
                    for (int i3 = 0; i3 < length3; i3++) {
                        Object opt19 = jSONArray3.opt(i3);
                        String valueOf2 = opt19 == null ? null : String.valueOf(opt19);
                        if (!TextUtils.isEmpty(valueOf2)) {
                            if (this.u) {
                                ((ArrayList) this.o).add(a(valueOf2));
                            } else {
                                ((ArrayList) this.o).add(valueOf2);
                            }
                        }
                    }
                }
            }
            Object opt20 = this.f16936a.opt("playOptions");
            if (!(opt20 == null || !(opt20 instanceof JSONObject) || (opt2 = ((JSONObject) opt20).opt("audioGainCoef")) == null)) {
                this.b = Float.parseFloat(String.valueOf(opt2));
            }
            this.q = this.f16936a.optBoolean("videoMute");
            Object opt21 = this.f16936a.opt("bizFieldValue");
            if (!(opt21 == null || !(opt21 instanceof JSONObject) || (opt = ((JSONObject) opt21).opt(AlipayAuthConstant.SIGN_DATA)) == null)) {
                String valueOf3 = String.valueOf(opt);
                this.r = valueOf3;
                AVSDKLog.e(this.t, "get the mSignData=".concat(valueOf3));
            }
        }
    }

    public String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deced9a3", new Object[]{this, str});
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
        AVSDKLog.e(this.t, "DWVideoDefinition fullPCVideoDefinition  PC->FULL:  " + str + " -> " + str2);
        return str2 == null ? str : str2;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69fb8ae3", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2b0ad57", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de8d89a7", new Object[]{this})).intValue();
        }
        return this.j * 1024;
    }

    public Map<String, qs2> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f70ac9d9", new Object[]{this});
        }
        return this.d;
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d5577897", new Object[]{this});
        }
        return this.h;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4df1db97", new Object[]{this});
        }
        return this.g;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88ef9ffb", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d64628a", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27611fbc", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9529b70", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dd9a3d5", new Object[]{this, str});
        }
        Map<String, String> map = this.e;
        if (map == null) {
            return "";
        }
        String str2 = (String) ((HashMap) map).get(str);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str2;
    }

    public List<String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("10b95eb0", new Object[]{this});
        }
        return this.o;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9cdbafa", new Object[]{this})).booleanValue();
        }
        String l = l(this.s, saltForSign);
        if (l == null || !l.equals(this.r)) {
            return false;
        }
        return true;
    }

    public Map<String, Integer> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b59b54b0", new Object[]{this});
        }
        return this.f;
    }

    public Map<String, ba5> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e3fd05c0", new Object[]{this});
        }
        return this.c;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        return this.p;
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e9eee0", new Object[]{this});
        }
        return this.n;
    }

    public static String l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fa493c", new Object[]{str, str2});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("md5");
            return new BigInteger(1, instance.digest((str + str2).getBytes("utf-8"))).toString(16);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "getMD5 failed at DWVideoInfoData with originData=" + str + ",salt=" + str2);
            throw new RuntimeException();
        }
    }

    public static boolean t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74246ee9", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        Object opt = jSONObject.opt(RemoteMessageConst.TTL);
        Object opt2 = jSONObject.opt("respTimeInMs");
        return opt == null || opt2 == null || ew0.v(opt2.toString()) + (ew0.v(opt.toString()) * 1000) > System.currentTimeMillis();
    }
}
