package com.taobao.login4android;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.utils.CommonUtil;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.tbelder.TBElder;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.DefaultTaobaoAppProvider;
import com.taobao.login4android.membercenter.account.AccountListComponent;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.Locale;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import tb.o78;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TaobaoAppProvider extends DefaultTaobaoAppProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LINE_CHANNEL_CONFIG = "{\"TW\":\"2006900327\",\"TH\":\"2006651255\",\"JP\":\"2006651240\"}";
    private static final String LINE_CHANNEL_CONFIG_NAME = "line_channel_config";
    private static final String TAG = "Login.AppProvider";

    static {
        t2o.a(517996564);
    }

    public TaobaoAppProvider() {
        this.isTaobaoApp = true;
        this.supportFaceLogin = true;
        this.enableAuthService = true;
        setRemoveSessionWhenLogout(false);
        this.enableElder = TBElder.b();
        setCheckCookieValid(true);
        this.isAdapterPadAndFold = true;
        this.alipaySsoDesKey = "authlogin_taobao_android_aes128";
    }

    public static /* synthetic */ Object ipc$super(TaobaoAppProvider taobaoAppProvider, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/TaobaoAppProvider");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getAuthSDKInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b49c12f", new Object[]{this});
        }
        if (Debuggable.isDebug()) {
            return "LFdzP9B3UuDx9dYE5QdwOg/tVVMunq4MUcHYXZNN5lYCACSfTDzOKM8VvlRUOY3dquPQqjL9BXOaAQM+u2m7MTdO9m6cS0eSnfoHla0d9M3WtenaJ9CLe8h+H7qD7+bDsyxdX4SDStE//Obw5CkdPJuhL0GRA4DakGuwf8xhPWAHXDs2bijQ1nRyFYvibOE2SJ/9vVkmrg23NMjOcty0n6YIalx41hd5uCytO5ZZzwlZOia8WTrYYhnHRpS5alfYO+HYEuBe1+wOw4IAmMmEpEwDlUvC8o00349FW1WYxQxuISMuRFgWEg==";
        }
        return "tKIZUvjHoahfUbu4IOGAetFU6BOOfwawcYTGWoTs2cXc+u4WVUlbbgkbJcOHY0EMFnc5JmBzLa9hH2/eOOAUEd6eHe5uz2wyBGmAjjKgJjncFn6C/ZHn/Q9lDzttM3jDWk/UH5Eyzc2ALexLvRxiqlwRh1YVyiV+lRSTxw0kDWQfakExNszNqU/ZTcbjrgVqgAoUKG2f1HsF5G1IJJzP6KNJCsiogzWpnfI+5rFpp+1/wYd5hc1spwVCzXhQGq5U7pFubV+Orq2Fj6+jvm8B3mCMFP+deOaJZWDXjCwVub3P0R8SQnC/2g==";
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getClientId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ed1ef3", new Object[]{this, str});
        }
        if (StringUtils.isBlank(str)) {
            return "";
        }
        if (str.equals(SNSPlatform.PLATFORM_GOOGLE.getPlatform())) {
            return "234612022780-rpsju7nmr23f4pi02lntnjdsjvhedeuf.apps.googleusercontent.com";
        }
        if (str.equals(SNSPlatform.PLATFORM_LINE.getPlatform())) {
            return getLineClientId();
        }
        return "";
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public Locale getCurrentLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("4578c909", new Object[]{this});
        }
        try {
            Language h = Localization.h();
            if (h != null) {
                return new Locale(h.getLanguage(), h.getCountry());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            LoginTLogAdapter.e(TAG, "getLanguageException");
        }
        return Locale.SIMPLIFIED_CHINESE;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public RegionInfo getCurrentRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionInfo) ipChange.ipc$dispatch("292031f7", new Object[]{this});
        }
        if (this.regionInfo == null) {
            RegionInfo regionInfo = new RegionInfo();
            this.regionInfo = regionInfo;
            regionInfo.domain = o78.CHINA_MAINLAND;
        }
        return this.regionInfo;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getMaxSessionSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3d4eca3", new Object[]{this})).intValue();
        }
        return getMaxHistoryAccount();
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean historySecurityMobileCanLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f74165a", new Object[]{this})).booleanValue();
        }
        return CommonUtil.isInABTestRegion("securityMobile", 10000);
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isForigenLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7154ee6", new Object[]{this})).booleanValue();
        }
        try {
            return o78.p(DataProviderFactory.getApplicationContext());
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isSmsLoginPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8e1c229", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportQrLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2f37f04", new Object[]{this})).booleanValue();
        }
        return CommonUtil.isInABTestRegion("qrcodeLogin", 10000);
    }

    public String getLineClientId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("918c2829", new Object[]{this});
        }
        PositionInfo i = o78.i(DataProviderFactory.getApplicationContext());
        if (i == null || StringUtils.isBlank(i.countryCode)) {
            LoginTLogAdapter.e(TAG, "Failed to get line clientID, info or countryCode is null");
            return "";
        }
        try {
            String str = (String) ((Map) JSON.parseObject(LoginSwitch.getConfig(LINE_CHANNEL_CONFIG_NAME, LINE_CHANNEL_CONFIG), new TypeReference<Map<String, String>>() { // from class: com.taobao.login4android.TaobaoAppProvider.1
            }, new Feature[0])).get(i.countryCode);
            return str != null ? str : "";
        } catch (Exception e) {
            LoginTLogAdapter.e(TAG, "Failed to parse 'support_line_country' config: " + e.getMessage());
            return "";
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getMaxHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f1531c1", new Object[]{this})).intValue();
        }
        if (AccountListComponent.isMultiAccountPageEnable()) {
            return LoginSwitch.getSwitch("maxAccount", 10);
        }
        return 1;
    }
}
