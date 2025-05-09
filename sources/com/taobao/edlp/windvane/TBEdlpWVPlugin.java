package com.taobao.edlp.windvane;

import android.graphics.RectF;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;
import org.json.JSONObject;
import tb.aba;
import tb.kpw;
import tb.nsw;
import tb.owo;
import tb.t2o;
import tb.urs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBEdlpWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION = "getTabBarItemPosition";
    private static final String ERROR_MESSAGE = "errorMessage";
    public static final String KEY_CENTER_X_RPX = "centerXRpx";
    public static final String KEY_CENTER_Y_RPX = "centerYRpx";
    public static final String KEY_COMPONENT_AREA = "componentArea";
    public static final String KEY_FIND = "find";
    public static final String KEY_HEIGHT_RPX = "heightRpx";
    public static final String KEY_IMAGE_URL = "imageUrl";
    public static final String KEY_LEFT_TOP_X_RPX = "leftTopXRpx";
    public static final String KEY_LEFT_TOP_Y_RPX = "leftTopYRpx";
    public static final String KEY_POP_EXT = "popExt";
    public static final String KEY_WIDTH_RPX = "widthRpx";
    private static final String TAB_BAR_BIZ_CODE = "tabBarBizCode";
    private static final String TAG = "TabBarInfoWVPlugin";
    private String mTabBarBizCode = "";

    static {
        t2o.a(1032847458);
    }

    private void assembleErrorMessage(nsw nswVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad268e5e", new Object[]{this, nswVar, str});
            return;
        }
        nswVar.b("errorMessage", str);
        TLog.loge(TAG, str);
    }

    private float getRpxByWidthPx(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da4d1036", new Object[]{this, new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float g = (f * 750.0f) / owo.g(Globals.getApplication());
        double d = g;
        if (d <= 0.005d || g >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    public static /* synthetic */ Object ipc$super(TBEdlpWVPlugin tBEdlpWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/windvane/TBEdlpWVPlugin");
    }

    private boolean addTabBarParam(nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5ef683b", new Object[]{this, nswVar})).booleanValue();
        }
        IEdlpTabBarActionButtonProvider iEdlpTabBarActionButtonProvider = (IEdlpTabBarActionButtonProvider) aba.g().d(IEdlpTabBarActionButtonProvider.class);
        if (iEdlpTabBarActionButtonProvider == null) {
            assembleErrorMessage(nswVar, "IEdlpTabBarActionButtonProvider null");
            return false;
        } else if (iEdlpTabBarActionButtonProvider.c() == null) {
            assembleErrorMessage(nswVar, "EdlpOverlayPopInfo null");
            return false;
        } else {
            JSONObject c = iEdlpTabBarActionButtonProvider.c();
            String optString = c.optString("imageUrl");
            if (TextUtils.isEmpty(optString)) {
                assembleErrorMessage(nswVar, "imageUrl null");
                return false;
            }
            TLog.loge(TAG, "assembleViewWVParam popInfo:" + c);
            nswVar.b("imageUrl", optString);
            try {
                JSONObject optJSONObject = c.optJSONObject(KEY_POP_EXT);
                if (optJSONObject != null) {
                    nswVar.a(KEY_POP_EXT, JSON.parseObject(optJSONObject.toString()));
                }
            } catch (Exception e) {
                TLog.loge(TAG, "assembleViewWVParam parsePopExtError:", e);
            }
            return true;
        }
    }

    private boolean assembleViewWVParam(nsw nswVar, boolean z, RectF rectF, RectF rectF2, RectF rectF3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fca23f9d", new Object[]{this, nswVar, new Boolean(z), rectF, rectF2, rectF3})).booleanValue();
        }
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        nswVar.b("find", str);
        if (!z) {
            assembleErrorMessage(nswVar, "tabBar not found");
            return false;
        } else if (!addTabBarParam(nswVar)) {
            return false;
        } else {
            nswVar.a(KEY_CENTER_X_RPX, Float.valueOf(getRpxByWidthPx((rectF.right + rectF.left) / 2.0f)));
            nswVar.a(KEY_CENTER_Y_RPX, Float.valueOf(getRpxByWidthPx(((rectF2.bottom + rectF2.top) + rectF3.top) / 2.0f)));
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put(KEY_LEFT_TOP_X_RPX, (Object) Float.valueOf(getRpxByWidthPx(rectF.left)));
            jSONObject.put(KEY_LEFT_TOP_Y_RPX, (Object) Float.valueOf(getRpxByWidthPx(((rectF2.bottom + rectF2.top) + rectF3.top) / 2.0f)));
            jSONObject.put(KEY_WIDTH_RPX, (Object) Float.valueOf(getRpxByWidthPx(rectF.right - rectF.left)));
            jSONObject.put(KEY_HEIGHT_RPX, (Object) Float.valueOf(getRpxByWidthPx(rectF.bottom - rectF.top)));
            nswVar.a(KEY_COMPONENT_AREA, jSONObject);
            TLog.loge(TAG, "assembleViewWVParam:" + nswVar.g());
            return true;
        }
    }

    private boolean checkEnterParam(String str, nsw nswVar) {
        com.alibaba.fastjson.JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26f0f522", new Object[]{this, str, nswVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            assembleErrorMessage(nswVar, "params is null");
            return false;
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception e) {
            TLog.loge(TAG, " parse enterParam error ", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            assembleErrorMessage(nswVar, "enterParam is null");
            return false;
        }
        String string = jSONObject.getString(TAB_BAR_BIZ_CODE);
        this.mTabBarBizCode = string;
        if (!TextUtils.isEmpty(string)) {
            return true;
        }
        assembleErrorMessage(nswVar, "tabBarBizCode is null");
        return false;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.equals(ACTION, str)) {
            return false;
        }
        nsw nswVar = new nsw();
        if (!checkEnterParam(str2, nswVar)) {
            wVCallBackContext.error(nswVar);
            return false;
        }
        urs u = a.u(this.mTabBarBizCode);
        if (u == null) {
            assembleErrorMessage(nswVar, "tab is null");
            wVCallBackContext.error(nswVar);
            return false;
        }
        RectF c = u.c();
        RectF a2 = u.a();
        if (!assembleViewWVParam(nswVar, c.right > c.left, c, u.b(), a2)) {
            wVCallBackContext.error(nswVar);
            return false;
        }
        wVCallBackContext.success(nswVar);
        return true;
    }
}
