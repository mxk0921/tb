package com.taobao.login4android.login;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProvider;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.StorageService;
import com.ali.user.mobile.utils.CommonUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DefaultTaobaoAppProvider extends DataProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DefaultTaobaoAppProvider defaultTaobaoAppProvider, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/login/DefaultTaobaoAppProvider");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getAppkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.appKey)) {
            int envType = getEnvType();
            if (envType == 0 || envType == 1) {
                this.appKey = ((StorageService) ServiceFactory.getService(StorageService.class)).getAppKey(2);
            } else {
                this.appKey = ((StorageService) ServiceFactory.getService(StorageService.class)).getAppKey(0);
            }
        }
        return this.appKey;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        String deviceId = ((RpcService) ServiceFactory.getService(RpcService.class)).getDeviceId();
        this.deviceId = deviceId;
        return deviceId;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isForbidLoginFromBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d92350e", new Object[]{this})).booleanValue();
        }
        return LoginSwitch.getSwitch(LoginSwitch.FORBID_LOGIN_FROM_BACKGROUND, "false");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean needAccsLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4109de8c", new Object[]{this})).booleanValue();
        }
        return LoginSwitch.getSwitch(LoginSwitch.ACCS_LOGIN_SWITCH, "false");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportOneKeyLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46e82d8c", new Object[]{this})).booleanValue();
        }
        return CommonUtil.isInABTestRegion(LoginSwitch.ONEKEY_LOGIN_PERCENT, 10000);
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportOneKeyRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc6a3c96", new Object[]{this})).booleanValue();
        }
        return CommonUtil.isInABTestRegion(LoginSwitch.ONEKEY_REGISTER_PERCENT, 10000);
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean enableAlipaySSO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a64dcad", new Object[]{this})).booleanValue();
        }
        return LoginSwitch.getSwitch(LoginSwitch.ALIPAY_SSO_SWITCH, "true") && this.enableAlipaySSO;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isSupportFingerprintLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f59035d5", new Object[]{this})).booleanValue();
        }
        return this.supportFingerprintLogin && LoginSwitch.getSwitch(LoginSwitch.SUPPORT_FINGERPRINT_LOGIN, "true");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportFaceLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a99dd208", new Object[]{this})).booleanValue();
        }
        return LoginSwitch.getSwitch(LoginSwitch.SUPPORT_FACE_LOGIN, "true") && this.supportFaceLogin;
    }
}
