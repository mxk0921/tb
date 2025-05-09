package com.taobao.android.editionswitcher;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import tb.gf0;
import tb.kpw;
import tb.nsw;
import tb.o78;
import tb.r4p;
import tb.t2o;
import tb.tza;
import tb.x78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBEditionPositionSwitcherWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(456130592);
    }

    private boolean changeHtaoUserPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc90ff10", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            PositionInfo positionInfo = (PositionInfo) JSON.parseObject(str, PositionInfo.class);
            if (positionInfo != null) {
                PositionInfo c = x78.c(positionInfo.editionCode);
                c.ext = positionInfo.ext;
                c.ovsPopExt = positionInfo.ovsPopExt;
                o78.F(this.mContext, c);
                OvsPopExt ovsPopExt = c.ovsPopExt;
                if (ovsPopExt == null || 2 != ovsPopExt.ovsRemindKind || !o78.o(c.editionCode)) {
                    tza.h((Activity) this.mContext, 0);
                } else {
                    TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-areaauto-confirm", null, null, "area=" + o78.c() + ",page_version=" + o78.i(this.mContext).editionCode + ",option=" + c.editionCode);
                    o78.I(this.mContext, c.editionCode, o78.SWITCH_TYPE_FORCE);
                }
                wVCallBackContext.success();
            }
            return true;
        } catch (Exception e) {
            wVCallBackContext.error(e.toString());
            return false;
        }
    }

    public static /* synthetic */ Object ipc$super(TBEditionPositionSwitcherWVPlugin tBEditionPositionSwitcherWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/TBEditionPositionSwitcherWVPlugin");
    }

    private boolean realPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2309779", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        PositionInfo f = o78.f(this.mContext);
        if (f != null) {
            nsw nswVar = new nsw();
            nswVar.b("countryName", f.countryName);
            nswVar.b(r4p.KEY_CITY_NAME, f.cityName);
            nswVar.b("countryNumCode", f.countryNumCode);
            nswVar.b("countryCode", f.countryCode);
            nswVar.b(r4p.KEY_EDITION_CODE, f.editionCode);
            nswVar.b("areaName", f.area);
            nswVar.b("actualLanguageCode", f.actualLanguageCode);
            nswVar.b("currencyCode", f.currencyCode);
            nswVar.b("cityId", f.cityId);
            wVCallBackContext.success(nswVar);
        } else {
            wVCallBackContext.success();
        }
        return true;
    }

    private boolean refreshPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16c7376", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        o78.A(this.mContext);
        wVCallBackContext.success();
        return true;
    }

    private boolean selectedPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93b16336", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        PositionInfo i = o78.i(this.mContext);
        if (i != null) {
            nsw nswVar = new nsw();
            nswVar.b("countryName", i.countryName);
            nswVar.b(r4p.KEY_CITY_NAME, i.cityName);
            nswVar.b("countryNumCode", i.countryNumCode);
            nswVar.b("countryCode", i.countryCode);
            nswVar.b(r4p.KEY_EDITION_CODE, i.editionCode);
            nswVar.b("areaName", i.area);
            nswVar.b("actualLanguageCode", i.actualLanguageCode);
            nswVar.b("currencyCode", i.currencyCode);
            nswVar.b("cityId", i.cityId);
            wVCallBackContext.success(nswVar);
        } else {
            wVCallBackContext.success();
        }
        return true;
    }

    private boolean getAllEditionInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bef1ca33", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        nswVar.b(gf0.K_SITES, JSON.toJSONString(x78.d()));
        wVCallBackContext.success(nswVar);
        return true;
    }

    private boolean getRealPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34c5e6f", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        PositionInfo f = o78.f(this.mContext);
        if (f != null) {
            nsw nswVar = new nsw();
            nswVar.b("msg", JSON.toJSONString(f));
            wVCallBackContext.success(nswVar);
        } else {
            wVCallBackContext.success();
        }
        return true;
    }

    private boolean getSelectedPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7304bf2c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        PositionInfo i = o78.i(this.mContext);
        if (i != null) {
            nsw nswVar = new nsw();
            nswVar.b("msg", JSON.toJSONString(i));
            wVCallBackContext.success(nswVar);
        } else {
            wVCallBackContext.success();
        }
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("refreshPosition".equals(str)) {
            return refreshPosition(str2, wVCallBackContext);
        }
        if ("getSelectedPosition".equals(str)) {
            return getSelectedPosition(str2, wVCallBackContext);
        }
        if ("getRealPosition".equals(str)) {
            return getRealPosition(str2, wVCallBackContext);
        }
        if ("realPosition".equals(str)) {
            return realPosition(str2, wVCallBackContext);
        }
        if ("selectedPosition".equals(str)) {
            return selectedPosition(str2, wVCallBackContext);
        }
        if ("changeHtaoUserPosition".equals(str)) {
            return changeHtaoUserPosition(str2, wVCallBackContext);
        }
        if ("getAllEditionInfo".equals(str)) {
            return getAllEditionInfo(str2, wVCallBackContext);
        }
        nsw nswVar = new nsw();
        nswVar.b("errorMsg", "no matched method");
        wVCallBackContext.error(nswVar);
        return false;
    }
}
