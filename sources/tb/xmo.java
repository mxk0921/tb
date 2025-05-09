package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import com.taobao.login4android.api.Login;
import com.taobao.weex.common.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xmo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPTIMIZE_SP_NAME = "newDetailOptimize";
    public static final String ORANGE_SP_NAME = "newDetailOrange";
    public static final String PLACE_HOLDER_IMAGE_MODE_SP_NAME = "ndPlaceHolderImgMode";
    public static final String SP_KEY_AB_NEW_DETAIL_ROUTE = "abNewDetailRoute";
    public static final String SP_KEY_ALL_CHANNEL_NEW_DETAIL_ROUTE = "allChannelNewDetailRoute";
    public static final String SP_KEY_BX_CURRENT_SCENE = "bxFeatureCurrentScene";
    public static final String SP_KEY_BX_IDENTIFIER = "bxFeatureIdentifier";
    public static final String SP_KEY_BX_INVOKE_ID = "bxFeatureInvokeId";
    public static final String SP_KEY_ENTRY_EXP = "contentExp";
    public static final String SP_KEY_FIRST_CARD_TYPE = "firstCardType";
    public static final String SP_KEY_HALF_SCREEN_FEATURE = "halfScreenFeature";
    public static final String SP_KEY_HALF_SCREEN_FEATURE_NATIVE = "halfScreenFeatureNative";
    public static final String SP_KEY_HALF_SCREEN_GUIDE_LIST = "halfScreenGuideList";
    public static final String SP_KEY_HALF_SCREEN_SHOW_DATE = "halfScreenShowDate";
    public static final String SP_KEY_HALF_SCREEN_SHOW_TIME = "halfScreenShowTime";
    public static final String SP_KEY_IS_WHITE_MODE = "isWhiteMode";
    public static final String SP_KEY_MAIN_PIC_URL = "mainPicUrl";
    public static final String SP_KEY_ORANGE_CONFIG_VERSION = "orangeConfigVersion";
    public static final String SP_KEY_SCREEN_CONFIG_HALF_SCREEN_HEIGHT = "screenConfigHalfScreenHeight";
    public static final String SP_KEY_SCREEN_CONFIG_VALID_HEIGHT = "screenConfigValidHeight";
    public static final String SP_KEY_SCREEN_CONFIG_WIDTH = "screenConfigWidth";
    public static final String SP_KEY_SCREEN_TYPE = "screenType";
    public static final String SP_KEY_WEEX_BRANCH_WLM = "weexBranchWlm";
    public static final String SP_NAME = "ndUser";
    public static final String WEEX_BRANCH_SP_NAME = "newDetailWeexBranch";

    /* renamed from: a  reason: collision with root package name */
    public static final int f31475a = -1;
    public static final int b = -1;
    public static final String c = Constants.Name.RESIZE_MODE;
    public static final String d = "marginTop";
    public static final String e = "height";
    public static final String f = x3w.KEY_CONTEXT_DATA_HALF_HEIGHT;
    public static final String g = "width";
    public static final String h = "halfWidth";
    public static final String i = "sp_key_float_permission_deny_time";

    public static void A(cxj cxjVar, ue7 ue7Var) {
        SharedPreferences r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a349c1af", new Object[]{cxjVar, ue7Var});
        } else if (cxjVar != null) {
            String F0 = ue7Var.F0();
            if (!TextUtils.isEmpty(F0) && (r = r(cxjVar.i(), SP_NAME)) != null) {
                SharedPreferences.Editor edit = r.edit();
                String str = cxjVar.j().R().m;
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                edit.putString(ue7Var.b + str + SP_KEY_MAIN_PIC_URL, F0);
                edit.apply();
            }
        }
    }

    public static void B(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7c270b", new Object[]{context, jSONObject});
            return;
        }
        SharedPreferences r = r(context, OPTIMIZE_SP_NAME);
        if (r != null) {
            String userId = Login.getUserId();
            SharedPreferences.Editor edit = r.edit();
            if (jSONObject == null) {
                edit.putString(userId, "");
            } else {
                edit.putString(userId, jSONObject.toJSONString());
            }
            edit.apply();
        }
    }

    public static void C(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef170e5", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences r = r(context, ORANGE_SP_NAME);
        if (r != null) {
            SharedPreferences.Editor edit = r.edit();
            edit.putString(str, str2);
            edit.commit();
        }
    }

    public static void D(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127030be", new Object[]{context, str});
            return;
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r != null) {
            SharedPreferences.Editor edit = r.edit();
            edit.putString(SP_KEY_ORANGE_CONFIG_VERSION, str);
            edit.apply();
        }
    }

    public static void E(Context context, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476a26cd", new Object[]{context, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r != null) {
            SharedPreferences.Editor edit = r.edit();
            edit.putInt(SP_KEY_SCREEN_CONFIG_VALID_HEIGHT, i2);
            edit.putInt(SP_KEY_SCREEN_CONFIG_HALF_SCREEN_HEIGHT, i4);
            edit.putInt(SP_KEY_SCREEN_CONFIG_WIDTH, i3);
            edit.apply();
        }
    }

    public static void F(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96294f28", new Object[]{context, str});
            return;
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r != null) {
            SharedPreferences.Editor edit = r.edit();
            edit.putString(SP_KEY_SCREEN_TYPE, str);
            edit.apply();
        }
    }

    public static void G(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e5a6fd", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences r = r(context, WEEX_BRANCH_SP_NAME);
        if (r != null) {
            SharedPreferences.Editor edit = r.edit();
            edit.putString(str + SP_KEY_WEEX_BRANCH_WLM, str2);
            edit.apply();
        }
    }

    public static void a(Context context, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a04065", new Object[]{context, new Boolean(z), str});
            return;
        }
        SharedPreferences r = r(context, WEEX_BRANCH_SP_NAME);
        if (r != null) {
            SharedPreferences.Editor edit = r.edit();
            if (z) {
                edit.clear();
            } else {
                edit.putString(str + SP_KEY_WEEX_BRANCH_WLM, "");
            }
            edit.apply();
        }
    }

    public static Map<String, ?> b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("989f54d4", new Object[]{context, str});
        }
        SharedPreferences r = r(context, str + PLACE_HOLDER_IMAGE_MODE_SP_NAME);
        if (r == null) {
            return null;
        }
        return r.getAll();
    }

    public static bn1 c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bn1) ipChange.ipc$dispatch("ddf562b", new Object[]{context, str});
        }
        bn1 bn1Var = new bn1();
        if (TextUtils.isEmpty(str)) {
            return bn1Var;
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return bn1Var;
        }
        bn1Var.e(r.getString(str + SP_KEY_BX_CURRENT_SCENE, ""));
        bn1Var.d(r.getString(str + SP_KEY_BX_IDENTIFIER, ""));
        bn1Var.f(r.getString(str + SP_KEY_BX_INVOKE_ID, ""));
        return bn1Var;
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63031023", new Object[]{context});
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return null;
        }
        String string = r.getString(SP_KEY_FIRST_CARD_TYPE, "item");
        String string2 = r.getString(SP_KEY_ENTRY_EXP, "");
        return string + string2;
    }

    public static long e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("900422a7", new Object[]{context})).longValue();
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return 0L;
        }
        return r.getLong(i, 0L);
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0bf16a0", new Object[]{context});
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return "false";
        }
        return r.getString(SP_KEY_HALF_SCREEN_FEATURE, "false");
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5632efa4", new Object[]{context});
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return "";
        }
        return r.getString(SP_KEY_HALF_SCREEN_GUIDE_LIST, "false");
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a862289", new Object[]{context});
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return "false";
        }
        return r.getString(SP_KEY_HALF_SCREEN_FEATURE_NATIVE, "false");
    }

    public static int i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bfe475", new Object[]{context})).intValue();
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return 0;
        }
        return r.getInt(SP_KEY_HALF_SCREEN_SHOW_TIME, 0);
    }

    public static int k(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("502ec0fc", new Object[]{context, str, str2})).intValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return -1;
        }
        SharedPreferences r = r(context, SP_NAME);
        r.getAll();
        return r.getInt(str + str2, -1);
    }

    public static String l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4b0f1e9", new Object[]{context, str});
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return null;
        }
        return r.getString(str + SP_KEY_MAIN_PIC_URL, "");
    }

    public static p7l m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p7l) ipChange.ipc$dispatch("fce2af0d", new Object[]{context});
        }
        try {
            SharedPreferences r = r(context, OPTIMIZE_SP_NAME);
            if (r == null) {
                return new p7l();
            }
            String string = r.getString(Login.getUserId(), "");
            if (!TextUtils.isEmpty(string)) {
                return new p7l(JSON.parseObject(string));
            }
            return new p7l();
        } catch (Exception e2) {
            txj.f("new_detail异常", "getOptimizeFeature异常", e2);
            return new p7l();
        }
    }

    public static String n(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da0b2822", new Object[]{context, str, str2});
        }
        SharedPreferences r = r(context, ORANGE_SP_NAME);
        if (r == null) {
            return str2;
        }
        return r.getString(str, str2);
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45bfb5b3", new Object[]{context});
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return "";
        }
        return r.getString(SP_KEY_ORANGE_CONFIG_VERSION, "");
    }

    public static fvo p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvo) ipChange.ipc$dispatch("1fe41a58", new Object[]{context});
        }
        fvo fvoVar = new fvo();
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            fvoVar.f19556a = -1;
            return fvoVar;
        }
        fvoVar.f19556a = r.getInt(SP_KEY_SCREEN_CONFIG_VALID_HEIGHT, -1);
        fvoVar.b = r.getInt(SP_KEY_SCREEN_CONFIG_HALF_SCREEN_HEIGHT, -1);
        int i2 = r.getInt(SP_KEY_SCREEN_CONFIG_WIDTH, -1);
        fvoVar.c = i2;
        fvoVar.d = i2 / fvoVar.f19556a;
        return fvoVar;
    }

    public static String q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2ada511", new Object[]{context, str});
        }
        SharedPreferences r = r(context, SP_NAME);
        return r == null ? str : r.getString(SP_KEY_SCREEN_TYPE, str);
    }

    public static SharedPreferences r(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("581fe2e9", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        return context.getSharedPreferences(str, 0);
    }

    public static String s(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdb07d4", new Object[]{context, str});
        }
        SharedPreferences r = r(context, WEEX_BRANCH_SP_NAME);
        if (r == null) {
            return null;
        }
        return r.getString(str + SP_KEY_WEEX_BRANCH_WLM, null);
    }

    public static void t(Context context, String str, bn1 bn1Var) {
        SharedPreferences r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d581921e", new Object[]{context, str, bn1Var});
        } else if (bn1Var != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(bn1Var.a()) && !TextUtils.isEmpty(bn1Var.c()) && !TextUtils.isEmpty(bn1Var.b()) && (r = r(context, SP_NAME)) != null) {
            SharedPreferences.Editor edit = r.edit();
            edit.putString(str + SP_KEY_BX_IDENTIFIER, bn1Var.a());
            edit.putString(str + SP_KEY_BX_CURRENT_SCENE, bn1Var.b());
            edit.putString(str + SP_KEY_BX_INVOKE_ID, bn1Var.c());
            edit.apply();
        }
    }

    public static void v(cxj cxjVar, ue7 ue7Var) {
        SharedPreferences r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ac3d2d", new Object[]{cxjVar, ue7Var});
        } else if (cxjVar != null && (r = r(cxjVar.i(), SP_NAME)) != null) {
            SharedPreferences.Editor edit = r.edit();
            edit.putString(SP_KEY_FIRST_CARD_TYPE, ue7Var.b);
            String str = cxjVar.j().R().m;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            edit.putString(SP_KEY_ENTRY_EXP, str);
            edit.apply();
        }
    }

    public static void w(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b802aa", new Object[]{context, new Long(j)});
            return;
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r != null) {
            r.edit().putLong(i, j).apply();
        }
    }

    public static void x(Context context, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc40691d", new Object[]{context, x3wVar});
            return;
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r != null) {
            SharedPreferences.Editor edit = r.edit();
            edit.putString(SP_KEY_HALF_SCREEN_FEATURE_NATIVE, x3wVar.B().getString("enableNonFullScreenNative"));
            edit.putString(SP_KEY_HALF_SCREEN_FEATURE, x3wVar.B().getString("enableNonFullScreen"));
            edit.putString(SP_KEY_HALF_SCREEN_GUIDE_LIST, x3wVar.B().getString(RecRequestParamsV2.KEY_HALF_SCREEN_GUIDE_INDEX_LIST));
            edit.apply();
        }
    }

    public static void y(Context context, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447bc6e8", new Object[]{context, new Integer(i2)});
            return;
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r != null) {
            SharedPreferences.Editor edit = r.edit();
            edit.putInt(SP_KEY_HALF_SCREEN_SHOW_TIME, i2);
            edit.putString(SP_KEY_HALF_SCREEN_SHOW_DATE, new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
            edit.apply();
        }
    }

    public static boolean H(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c3eabf0", new Object[]{context})).booleanValue();
        }
        SharedPreferences r = r(context, SP_NAME);
        if (r == null) {
            return false;
        }
        return r.getString(SP_KEY_HALF_SCREEN_SHOW_DATE, "").equals(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
    }

    public static void z(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a069849", new Object[]{context, jSONObject});
            return;
        }
        try {
            SharedPreferences r = r(context, OPTIMIZE_SP_NAME);
            if (r != null) {
                String userId = Login.getUserId();
                SharedPreferences.Editor edit = r.edit();
                if (jSONObject == null) {
                    edit.putBoolean(userId + "kirin", false);
                } else {
                    edit.putBoolean(userId + "kirin", jSONObject.getBooleanValue("enableKirinVideo"));
                }
                edit.apply();
            }
        } catch (Exception e2) {
            txj.f("new_detail异常", "saveKirinFeature异常", e2);
        }
    }

    static {
        t2o.a(352321791);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void u(android.content.Context r20, java.lang.String r21, com.alibaba.fastjson.JSONObject r22) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xmo.u(android.content.Context, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }
}
