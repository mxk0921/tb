package com.ali.user.mobile.utils;

import android.content.ClipboardManager;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.model.CountryCode;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.rpc.login.model.GroupedCountryCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.SDKUtil;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CommonUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.CommonUtil";

    static {
        t2o.a(68157635);
    }

    public static boolean autoCheckbox() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f40e2a1d", new Object[0])).booleanValue();
        }
        if (unionReg() == 2) {
            return false;
        }
        return isInABTestRegion("autoCheckbox", 10000);
    }

    public static String getDomainAndPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d1e566d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            URI uri = new URL(str).toURI();
            String host = uri.getHost();
            String path = uri.getPath();
            return host + path;
        } catch (Throwable unused) {
            LoginTLogAdapter.e(TAG, "getDomainAndPath Exception: " + str);
            return "";
        }
    }

    public static String getSourceOrApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f531e613", new Object[0]);
        }
        if (!TextUtils.isEmpty(LoginStatus.source)) {
            return LoginStatus.source;
        }
        if (TextUtils.isEmpty(LoginStatus.mtopApiReferer)) {
            return null;
        }
        try {
            return new JSONObject(LoginStatus.mtopApiReferer).getString("apiName");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean hasClipboardText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d118ab74", new Object[0])).booleanValue();
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) DataProviderFactory.getApplicationContext().getSystemService("clipboard");
            if (clipboardManager != null) {
                return clipboardManager.hasPrimaryClip();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static boolean isInABTestRegion(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd5c6b40", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (Math.abs(AppInfo.getInstance().getUtdid().hashCode()) % 10000 < LoginSwitch.getSwitch(str, i)) {
            return true;
        }
        return false;
    }

    public static String replaceSpot(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bdf2399", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace(".", "");
    }

    public static int unionReg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40db9d3f", new Object[0])).intValue();
        }
        return LoginSwitch.getSwitch("protocolType", 0);
    }

    public static boolean notShowUI(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ff6699", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return SDKUtil.inList(str, LoginSwitch.getConfig("showui_blacklist", LoginSwitch.DEFAULT_UI_BALCKLIST));
    }

    public static boolean notShowUIByTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94564c7d", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return SDKUtil.inList(str, LoginSwitch.getConfig("showui_blacklist_time", LoginSwitch.DEFAULT_UI_BLACKLIST_TIME));
    }

    public static ArrayList<RegionInfo> fillData(String str, List<GroupedCountryCode> list, HashMap<String, Integer> hashMap, List<String> list2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a47d4a0f", new Object[]{str, list, hashMap, list2});
        }
        ArrayList<RegionInfo> arrayList = new ArrayList<>();
        boolean isForigenLocation = DataProviderFactory.getDataProvider().isForigenLocation();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            GroupedCountryCode groupedCountryCode = list.get(i);
            if (!isForigenLocation || !"#".equals(groupedCountryCode.index)) {
                List<CountryCode> list3 = groupedCountryCode.countryCodeList;
                int i3 = 0;
                while (i3 < list3.size()) {
                    CountryCode countryCode = list3.get(i3);
                    RegionInfo regionInfo = new RegionInfo();
                    if ("#".equals(groupedCountryCode.index)) {
                        regionInfo.character = str;
                        groupedCountryCode.index = "★";
                    } else {
                        regionInfo.character = groupedCountryCode.index;
                    }
                    if (i3 == 0) {
                        regionInfo.isDisplayLetter = z;
                        String str2 = groupedCountryCode.index;
                        if (str2 != null) {
                            hashMap.put(str2, Integer.valueOf(i2));
                            list2.add(groupedCountryCode.index);
                        } else {
                            LoginTLogAdapter.e(TAG, "error!! index can not be null!");
                        }
                    } else {
                        regionInfo.isDisplayLetter = false;
                    }
                    regionInfo.name = countryCode.name;
                    regionInfo.code = "" + countryCode.code;
                    regionInfo.domain = countryCode.domain;
                    regionInfo.checkPattern = countryCode.checkPattern;
                    regionInfo.pinyin = countryCode.pinyin;
                    i2++;
                    arrayList.add(regionInfo);
                    i3++;
                    z = true;
                }
            }
            i++;
            z = true;
        }
        return arrayList;
    }
}
