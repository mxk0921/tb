package com.ali.user.mobile.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.model.CountryCode;
import com.ali.user.mobile.model.RegionInfo;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.List;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CountryUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CountryUtil";

    static {
        t2o.a(70254894);
    }

    public static RegionInfo matchRegionFromLocal(Context context, String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionInfo) ipChange.ipc$dispatch("21c64952", new Object[]{context, str});
        }
        RegionInfo regionInfo = new RegionInfo();
        if (!TextUtils.isEmpty(str)) {
            try {
                list = JSON.parseArray(context.getString(R.string.aliuser_hot_region_list), CountryCode.class);
            } catch (Throwable th) {
                th.printStackTrace();
                list = null;
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CountryCode countryCode = (CountryCode) it.next();
                    if (TextUtils.equals(str.toLowerCase(), countryCode.domain.toLowerCase())) {
                        regionInfo.name = countryCode.name;
                        regionInfo.code = countryCode.code;
                        regionInfo.checkPattern = countryCode.checkPattern;
                        regionInfo.domain = countryCode.domain;
                        break;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(regionInfo.name)) {
            regionInfo.name = "中国大陆";
            regionInfo.code = "+86";
            regionInfo.checkPattern = "^(86){0,1}1\\d{10}$";
            regionInfo.domain = o78.CHINA_MAINLAND;
        }
        return regionInfo;
    }

    public static boolean supportOverseaSimLogin(AppLaunchInfoResponseData appLaunchInfoResponseData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef6b83c7", new Object[]{appLaunchInfoResponseData})).booleanValue() : supportOverseaSimLogin(appLaunchInfoResponseData, DataProviderFactory.getDataProvider().getCurrentRegion(), false);
    }

    public static boolean supportOverseaSimLogin(AppLaunchInfoResponseData appLaunchInfoResponseData, RegionInfo regionInfo, boolean z) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bec08fd6", new Object[]{appLaunchInfoResponseData, regionInfo, new Boolean(z)})).booleanValue();
        }
        if (!LoginSwitch.getSwitch(LoginSwitch.SUPPORT_OVERSEA_SIMLOGIN, "true")) {
            LoginTLogAdapter.e(TAG, "supportOverseaSimLogin: orange not support");
            return false;
        }
        boolean z2 = appLaunchInfoResponseData != null && (t = appLaunchInfoResponseData.returnValue) != 0 && ((AppLaunchInfo) t).supportOverseaSimLogin && ((AppLaunchInfo) t).fromOversea;
        boolean z3 = z2 && regionInfo != null && (!z ? TextUtils.equals(regionInfo.code, ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).phoneCode) : TextUtils.equals(regionInfo.code, ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).regPhoneCode));
        LoginTLogAdapter.e(TAG, "supportOverseaSimLogin:" + z2 + " supportRegionInfo:" + z3);
        return z2 && z3;
    }
}
