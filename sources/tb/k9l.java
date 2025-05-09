package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k9l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_TNODE_URL = "http://h5.m.taobao.com/tnode/index.htm?tnode=page_comment";
    public static final String KEY_FAST_EMOJI = "fast_emoji";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f22501a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;

    static {
        t2o.a(817889348);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f63b3ec5", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "degradeCustomIME", "false")));
        b = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a22fa00", new Object[0])).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "enableBizBackgroundOpt", "true")));
        c = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c53ac6a6", new Object[0])).booleanValue();
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "enableDealReply", "true")));
        e = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e09c1d", new Object[0])).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "enableFixTopActivity", "true")));
        d = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c966bb3e", new Object[0])).booleanValue();
        }
        Boolean bool = f22501a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "reUseEngineNew", "false"))) {
            f22501a = Boolean.TRUE;
            return true;
        }
        try {
            boolean parseBoolean = Boolean.parseBoolean(s4v.b("TNodeComment.performance.reUseEngineNew", "false").toString());
            f22501a = Boolean.valueOf(parseBoolean);
            return parseBoolean;
        } catch (Throwable unused) {
            return f22501a.booleanValue();
        }
    }

    public static JSONObject f(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1c14140c", new Object[]{str});
        }
        try {
            String str3 = "default_params_" + str;
            if (!TextUtils.equals(q0j.ERROR_CODE_WEEX_RENDER_EXCEPTION, str) && !TextUtils.equals("guangguang", str) && !TextUtils.equals("ggdiscuss", str)) {
                str2 = "";
                return JSON.parseObject(OrangeConfig.getInstance().getConfig("dx_comment_qk", str3, str2));
            }
            str2 = "{\"fast_emoji\": 1, \"fast_emoji_list\": \"/:Q,/:815,/:087,/:b,/:085,/:071,/:?,/:077\"}";
            return JSON.parseObject(OrangeConfig.getInstance().getConfig("dx_comment_qk", str3, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("63446356", new Object[]{str});
        }
        try {
            return JSON.parseObject(OrangeConfig.getInstance().getConfig("dx_comment_qk", "overwrite_params_" + str, "{\"emojiBiz\":\"im\"}"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
