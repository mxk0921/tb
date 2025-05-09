package tb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.LocalizationManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.editionswitcher.LocationCallBack;
import com.taobao.android.editionswitcher.OvsPopExt;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.PositionInfoExt;
import com.taobao.android.editionswitcher.SwitcheFatigue;
import com.taobao.android.editionswitcher.TBEditionPositionSwitcherWVPlugin;
import com.taobao.android.editionswitcher.api.EditionApi;
import com.taobao.android.editionswitcher.boarding.d;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o78 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_EDITION_CODE_CHANGED = "EDITON_SWITCHER_EDITTION_CODE_CHANGED";
    public static final String ACTION_LOCATION_CHANGED = "EDITON_SWITCHER_LOCATION_CHANGED";
    public static final String ACTION_LOCATION_RECEIVE = "EDITON_SWITCHER_LOCATION_RECEIVE";
    public static final String CHINA_MAINLAND = "CN";
    public static final String CHINA_VILLIAGE = "CUN";
    public static final String EDITION_OLD = "OLD";
    public static final String KEY_LOCATION_RESULT = "EDITON_SWITCHER_LOCATION_RESULT";
    public static final String PAGE_HOME = "Page_Home";
    public static final String PREF_KEY_CUN_USER_NOTIFY_TIME = "PREF_KEY_CUN_USER_NOTIFY_TIME";
    public static final String PREF_KEY_IS_VILLAGER = "PREF_KEY_IS_VILLAGER";
    public static final String PREF_KEY_LAST_REAL_EDITION_CODE = "PREF_KEY_LAST_REAL_EDITION_CODE";
    public static final String PREF_KEY_LAST_REMIND_EDITION_CODE_TIME = "PREF_KEY_LAST_REMIND_EDITION_CODE_TIME";
    public static final String PREF_KEY_LOCATION_AREA = "PREF_KEY_LOCATION_AREA";
    public static final String PREF_KEY_OVS_EXT = "PREF_KEY_OVS_EXT";
    public static final String PREF_KEY_REAL_CITY_CODE = "PREF_KEY_REAL_CITY_CODE";
    public static final String PREF_KEY_REAL_CITY_NAME = "PREF_KEY_REAL_CITY_NAME";
    public static final String PREF_KEY_REAL_EDITION_CODE = "PREF_KEY_REAL_EDITION_CODE";
    public static final String PREF_KEY_REAL_EXT = "PREF_KEY_REAL_EXT";
    public static final String PREF_KEY_REMIND_EDITION_CODE_FATIGUE = "PREF_KEY_REMIND_EDITION_CODE_FATIGUE";
    public static final String REFRESH_SOURCE_COLD_START = "coldStart";
    public static final String REFRESH_SOURCE_HOT_START = "hotStart";
    public static final String REFRESH_SOURCE_LOGIN_SUCCESS = "loginSuccess";
    public static final String REFRESH_SOURCE_OLD_USER_BIND = "oldUserBind";
    public static final String REFRESH_SOURCE_OTHERS = "others";
    public static final String SWITCH_TYPE_BOARD = "BOARD";
    public static final String SWITCH_TYPE_FORCE = "FORCE";
    public static final String SWITCH_TYPE_HOME = "HOME";
    public static final String SWITCH_TYPE_OLD_SETTING = "OLDSETTING";
    public static final String SWITCH_TYPE_SETTING = "SETTING";
    public static final String TAG = "EditionPositionSwitcher";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocationCallBack f25184a;

        public a(LocationCallBack locationCallBack) {
            this.f25184a = locationCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge(o78.TAG, "location timeout， callback location");
            this.f25184a.onLocationChanged(new TBLocationDTO());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocationCallBack f25185a;

        public b(LocationCallBack locationCallBack) {
            this.f25185a = locationCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge(o78.TAG, "location timeout， callback location");
            this.f25185a.onLocationChanged(new TBLocationDTO());
        }
    }

    static {
        t2o.a(456130562);
    }

    public static void A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702a1a7d", new Object[]{context});
        } else {
            B(context, "others");
        }
    }

    public static void B(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68e7f07", new Object[]{context, str});
            return;
        }
        try {
            TBLocationOption tBLocationOption = new TBLocationOption();
            tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.valueOf(e()));
            tBLocationOption.setAccuracy(d());
            tBLocationOption.setTimeout(TBLocationOption.Timeout.DEFAULT);
            LocationCallBack locationCallBack = new LocationCallBack(context, str);
            TBLocationClient.g(context).h(tBLocationOption, locationCallBack, Looper.getMainLooper());
            new Handler().postDelayed(new a(locationCallBack), 5000L);
        } catch (Throwable th) {
            TLog.loge(TAG, "refresh position error", th);
        }
    }

    public static void C(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b481ed", new Object[]{context, str, new Boolean(z)});
            return;
        }
        try {
            LocationCallBack locationCallBack = new LocationCallBack(context, str);
            if (z) {
                TBLocationOption tBLocationOption = new TBLocationOption();
                tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.valueOf(e()));
                tBLocationOption.setAccuracy(d());
                tBLocationOption.setTimeout(TBLocationOption.Timeout.DEFAULT);
                TBLocationClient.g(context).h(tBLocationOption, locationCallBack, Looper.getMainLooper());
            }
            new Handler().postDelayed(new b(locationCallBack), 5000L);
        } catch (Throwable th) {
            TLog.loge(TAG, "refresh position error", th);
        }
    }

    public static void D(Context context, String str, SwitcheFatigue switcheFatigue) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545ec767", new Object[]{context, str, switcheFatigue});
            return;
        }
        try {
            SharedPreferences b2 = tza.b();
            SharedPreferences.Editor edit = b2.edit();
            String string = b2.getString(PREF_KEY_REMIND_EDITION_CODE_FATIGUE, null);
            if (string == null) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = JSON.parseObject(string);
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
            }
            TLog.loge(TAG, str + "弹窗时间记录：" + System.currentTimeMillis());
            jSONObject.put(str, (Object) switcheFatigue);
            edit.putString(PREF_KEY_REMIND_EDITION_CODE_FATIGUE, jSONObject.toJSONString());
            edit.apply();
        } catch (Exception unused2) {
        }
        kbq.l(context);
    }

    public static void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45b2494", new Object[0]);
            return;
        }
        try {
            SharedPreferences b2 = tza.b();
            SharedPreferences.Editor edit = b2.edit();
            edit.putString(PREF_KEY_LAST_REAL_EDITION_CODE, b2.getString(PREF_KEY_REAL_EDITION_CODE, ""));
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public static void F(Context context, PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1177fed", new Object[]{context, positionInfo});
            return;
        }
        try {
            SharedPreferences.Editor edit = tza.b().edit();
            edit.putString(PREF_KEY_REAL_CITY_CODE, positionInfo.cityId);
            edit.putString(PREF_KEY_REAL_CITY_NAME, positionInfo.cityName);
            edit.putString(PREF_KEY_REAL_EDITION_CODE, positionInfo.editionCode);
            edit.putString(PREF_KEY_IS_VILLAGER, positionInfo.isVillageUser);
            edit.putString(PREF_KEY_REAL_EXT, JSON.toJSONString(positionInfo.ext));
            edit.putString(PREF_KEY_OVS_EXT, JSON.toJSONString(positionInfo.ovsPopExt));
            edit.apply();
        } catch (Exception unused) {
        }
        kbq.l(context);
    }

    public static void G(Context context, HomeLocationResult homeLocationResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7840cbb3", new Object[]{context, homeLocationResult});
            return;
        }
        try {
            SharedPreferences.Editor edit = tza.b().edit();
            edit.putString(PREF_KEY_REAL_CITY_CODE, homeLocationResult.cityId);
            edit.putString(PREF_KEY_REAL_CITY_NAME, homeLocationResult.cityName);
            edit.putString(PREF_KEY_REAL_EDITION_CODE, homeLocationResult.editionCode);
            edit.putString(PREF_KEY_IS_VILLAGER, homeLocationResult.isVillageUser);
            edit.putString(PREF_KEY_REAL_EXT, JSON.toJSONString(new PositionInfoExt(homeLocationResult.hTaoContentImg, homeLocationResult.oldDialogTitle, homeLocationResult.oldDialogSubTitle, homeLocationResult.oldDialogContentImg)));
            OvsPopExt ovsPopExt = homeLocationResult.ovsPopExt;
            if (ovsPopExt == null) {
                edit.putString(PREF_KEY_OVS_EXT, JSON.toJSONString(new OvsPopExt()));
            } else {
                edit.putString(PREF_KEY_OVS_EXT, JSON.toJSONString(ovsPopExt));
            }
            edit.apply();
        } catch (Exception unused) {
        }
        kbq.l(context);
    }

    public static void H(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dee20a", new Object[]{context, str});
        } else {
            I(context, str, SWITCH_TYPE_HOME);
        }
    }

    public static void K(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36d180c", new Object[]{context, str});
        } else if (q(str) || u(context) || v(context)) {
            MtopSetting.removeParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-system-lang");
        } else {
            Locale d = LocalizationManager.INSTANCE.d();
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-system-lang", d.getLanguage() + "-" + d.getCountry());
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ea0ba81", new Object[]{str})).booleanValue();
        }
        return x78.d().containsKey(str);
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("509b6c1d", new Object[0]);
        }
        try {
            return JSON.parseObject(OrangeConfig.getInstance().getConfig("mtop_app_edition", "configMapping", "{\"standard_version\":\"ST\",\"new_user_minimalist_version\":\"NW\",\"elder_version\":\"ED\",\"goodprice_version\":\"GP\"}"));
        } catch (Exception unused) {
            return JSON.parseObject("{\"standard_version\":\"ST\",\"new_user_minimalist_version\":\"NW\",\"elder_version\":\"ED\",\"goodprice_version\":\"GP\"}");
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b24d9fe5", new Object[0]);
        }
        return tza.b().getString(PREF_KEY_LAST_REAL_EDITION_CODE, CHINA_MAINLAND);
    }

    public static TBLocationOption.Accuracy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption.Accuracy) ipChange.ipc$dispatch("513ee152", new Object[0]);
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("edition_switcher", "LocationAccuracySwitcher", "false"))) {
            return TBLocationOption.Accuracy.TENMETER;
        }
        return TBLocationOption.Accuracy.DEFAULT;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5536efd", new Object[0])).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig("edition_switcher", "LocationLimitTimeSwitcher", "12");
        if (!TextUtils.isEmpty(config)) {
            try {
                return Integer.valueOf(config).intValue();
            } catch (Throwable unused) {
                Log.e(TAG, "time limit NumberFormatException");
            }
        }
        return 12;
    }

    public static PositionInfo f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("6c4ec6fb", new Object[]{context});
        }
        SharedPreferences b2 = tza.b();
        String string = b2.getString(PREF_KEY_REAL_EDITION_CODE, null);
        if (TextUtils.isEmpty(string)) {
            PositionInfo b3 = x78.b();
            b3.ovsPopExt = new OvsPopExt();
            return b3;
        }
        String string2 = b2.getString(PREF_KEY_REAL_CITY_CODE, null);
        String string3 = b2.getString(PREF_KEY_REAL_CITY_NAME, null);
        String string4 = b2.getString(PREF_KEY_IS_VILLAGER, null);
        String string5 = b2.getString(PREF_KEY_REAL_EXT, null);
        String string6 = b2.getString(PREF_KEY_OVS_EXT, null);
        PositionInfo c = x78.c(string);
        c.cityId = string2;
        c.cityName = string3;
        c.isVillageUser = string4;
        c.area = j(context, PREF_KEY_LOCATION_AREA, "");
        if (!TextUtils.isEmpty(string5)) {
            c.ext = (PositionInfoExt) JSON.parseObject(string5, PositionInfoExt.class);
        }
        if (!TextUtils.isEmpty(string6)) {
            c.ovsPopExt = (OvsPopExt) JSON.parseObject(string6, OvsPopExt.class);
        } else {
            c.ovsPopExt = new OvsPopExt();
        }
        return c;
    }

    public static String g(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f009f419", new Object[]{context});
        }
        try {
            str = Localization.j();
            try {
                if (TextUtils.isEmpty(str)) {
                    str = h(context);
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = CHINA_MAINLAND;
        }
        MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-region-channel", str);
        K(context, str);
        return str;
    }

    public static String h(Context context) {
        SharedPreferences b2;
        String string;
        String str;
        String str2 = CHINA_MAINLAND;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a823eac", new Object[]{context});
        }
        try {
            b2 = tza.b();
            string = b2.getString("PREF_KEY_SELECTED_EDITION_CODE", null);
        } catch (Exception unused) {
        }
        try {
            if (TextUtils.isEmpty(string)) {
                return b2.getString("PREF_KEY_CHECKED_COUNTRY_CODE", str2);
            }
            return string;
        } catch (Exception unused2) {
            str2 = str;
            return str2;
        }
    }

    public static PositionInfo i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("2d90511e", new Object[]{context});
        }
        PositionInfo c = x78.c(g(context));
        c.area = j(context, PREF_KEY_LOCATION_AREA, "");
        return c;
    }

    public static String j(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1bfeca0", new Object[]{context, str, str2});
        }
        try {
            return tza.b().getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static SwitcheFatigue k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwitcheFatigue) ipChange.ipc$dispatch("5820dd77", new Object[]{context, str});
        }
        SwitcheFatigue switcheFatigue = null;
        try {
            String string = tza.b().getString(PREF_KEY_REMIND_EDITION_CODE_FATIGUE, null);
            if (string != null) {
                switcheFatigue = (SwitcheFatigue) JSON.parseObject(string).getObject(str, SwitcheFatigue.class);
            }
        } catch (Exception unused) {
        }
        if (switcheFatigue == null) {
            return new SwitcheFatigue();
        }
        return switcheFatigue;
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29818d88", new Object[]{context})).booleanValue();
        }
        try {
            SharedPreferences b2 = tza.b();
            String string = b2.getString("PREF_KEY_CHECKED_COUNTRY_CODE", null);
            String string2 = b2.getString("PREF_KEY_SELECTED_EDITION_CODE", null);
            if (string == null && string2 == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0735706", new Object[0]);
        } else {
            fsw.i("TBEditionPositionSwitcherWVPlugin", TBEditionPositionSwitcherWVPlugin.class, true);
        }
    }

    public static void n(x4d x4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c23deaf", new Object[]{x4dVar});
            return;
        }
        boolean P = TBDeviceUtils.P(Globals.getApplication());
        boolean p = TBDeviceUtils.p(Globals.getApplication());
        if (P || p) {
            TLog.loge("EditionSwitcher", "i18nboarding request is Tablet or FoldDevice");
            if (x4dVar != null) {
                x4dVar.a(false);
            }
        } else if (rah.a()) {
            d.i = true;
            x4dVar.a(true);
        } else {
            TLog.loge("EditionSwitcher", "i18nboarding request start");
            new EditionApi().d(x4dVar, 700L);
        }
    }

    public static boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f9e41b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(CHINA_MAINLAND, str) || TextUtils.equals("CUN", str) || TextUtils.equals("OLD", str)) {
            return false;
        }
        return true;
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e8d7e04", new Object[]{context})).booleanValue();
        }
        if (s(context) || w(context) || t(context)) {
            return false;
        }
        return true;
    }

    public static boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdaeaa3", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(CHINA_MAINLAND, str)) {
            return true;
        }
        return false;
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("911dd7c2", new Object[]{context})).booleanValue();
        }
        return q(f(context).editionCode);
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c942f69c", new Object[]{context})).booleanValue();
        }
        return q(g(context));
    }

    public static boolean t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4fa11cd", new Object[]{context})).booleanValue();
        }
        return TextUtils.equals("OLD", g(context));
    }

    public static boolean u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c25c101d", new Object[]{context})).booleanValue();
        }
        return TextUtils.equals("OLD", f(context).editionCode);
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a8e668e", new Object[]{context})).booleanValue();
        }
        return TextUtils.equals("CUN", f(context).editionCode);
    }

    public static boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2b38568", new Object[]{context})).booleanValue();
        }
        return TextUtils.equals("CUN", g(context));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f68fa48d", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("mtop_app_edition", "openConfigMapping", "true"));
    }

    public static void z(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7decea7", new Object[]{context, str, str2});
            return;
        }
        try {
            SharedPreferences.Editor edit = tza.b().edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public static void I(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf175d54", new Object[]{context, str, str2});
            return;
        }
        String g = g(context);
        if ((!x78.a() || !l(context) || !TextUtils.equals(g, str)) && !TextUtils.isEmpty(str)) {
            EditionApi.g(str, g, str2);
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-region-channel", str);
            K(context, str);
            String e = TBRevisionSwitchManager.c().e(LocationCallBack.ORIGIN_ELDER_HOME);
            String f = TBRevisionSwitchManager.c().f(LocationCallBack.ORIGIN_ELDER_HOME, true);
            if (e != null && f != null) {
                gbf.a(str, "elderHome", f, 1);
            } else if (e == null && f != null) {
                gbf.a(str, "elderHome", f, 0);
            }
            if (ta8.a().e()) {
                ta8.a().g(false);
                HashMap hashMap = new HashMap();
                hashMap.put("elderHome", "0");
                TBRevisionSwitchManager.c().l(hashMap, false, 1);
            }
            try {
                Localization.d(str);
                context.sendBroadcast(new Intent("EDITON_SWITCHER_EDITTION_CODE_CHANGED"));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(r78.EDITION_CODE_CHANGED, (Object) str);
                r78.b().a(null, new t7l(r78.EDITION_CODE_CHANGED, jSONObject));
                TLog.loge(TAG, "发送地区切换广播");
            } catch (Exception unused) {
            }
            kbq.l(context);
        }
    }

    public static void J(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e9c8fc", new Object[]{context, str, str2, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("elderHome", str2);
        TBRevisionSwitchManager.c().l(hashMap, false, 1);
        TBRevisionSwitchManager.c().l(map, false, 1);
        if ((!l(context) || !TextUtils.equals(g(context), str)) && !TextUtils.isEmpty(str)) {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-region-channel", str);
            K(context, str);
            new StringBuilder("editionCode 切换到 ").append(str);
            try {
                SharedPreferences.Editor edit = tza.b().edit();
                edit.putString("PREF_KEY_SELECTED_EDITION_CODE", str);
                edit.apply();
                Localization.d(str);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adfd8938", new Object[]{context})).booleanValue();
        }
        return TextUtils.equals(i(context).isVillageUser, "y") || TextUtils.equals(f(context).isVillageUser, "y");
    }
}
