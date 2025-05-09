package com.ali.user.mobile.login.service.impl;

import android.util.Log;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.login.model.FingerprintLoginInfo;
import com.ali.user.mobile.rpc.login.model.AliUserResponseData;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FingerprintLoginServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String INFO_SP_KEY = "fingerprint_login_info";
    private static final String TAG = "login.FingerprintLoginService";
    private static FingerprintLoginServiceImpl instance;
    private FingerprintLoginInfo fingerprintLoginInfo;

    static {
        t2o.a(69206142);
    }

    public static FingerprintLoginServiceImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintLoginServiceImpl) ipChange.ipc$dispatch("f80e976a", new Object[0]);
        }
        if (instance == null) {
            instance = new FingerprintLoginServiceImpl();
        }
        return instance;
    }

    public void clearFingerprintInfo(AliUserResponseData aliUserResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("835b7f9f", new Object[]{this, aliUserResponseData});
            return;
        }
        try {
            if (isFingerprintLoginAvailable()) {
                getFingerprintLoginInfo().token = null;
            }
        } catch (Exception e) {
            LoginTLogAdapter.e(TAG, "clearFingerprintInfo error", e);
        }
    }

    public void closeFingerprintInfo(FingerprintLoginInfo fingerprintLoginInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e6088b", new Object[]{this, fingerprintLoginInfo, new Boolean(z)});
            return;
        }
        fingerprintLoginInfo.open = false;
        if (z) {
            fingerprintLoginInfo.loginEntrance = null;
        }
        resetFingerprintInfo(fingerprintLoginInfo);
    }

    public void closeFingerprintLoginSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b03a2c", new Object[]{this});
            return;
        }
        FingerprintLoginInfo fingerprintLoginInfo = getFingerprintLoginInfo();
        closeFingerprintInfo(fingerprintLoginInfo, false);
        updateFingerprintInfo(fingerprintLoginInfo);
    }

    public void disableFingerprintLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf361f4", new Object[]{this});
            return;
        }
        FingerprintLoginInfo fingerprintLoginInfo = getFingerprintLoginInfo();
        fingerprintLoginInfo.disable = true;
        updateFingerprintInfo(fingerprintLoginInfo);
    }

    public FingerprintLoginInfo getFingerprintLoginInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintLoginInfo) ipChange.ipc$dispatch("3866ab2e", new Object[]{this});
        }
        FingerprintLoginInfo fingerprintLoginInfo = this.fingerprintLoginInfo;
        if (fingerprintLoginInfo != null) {
            return fingerprintLoginInfo;
        }
        String str = (String) SharedPreferencesUtil.getData(DataProviderFactory.getApplicationContext(), INFO_SP_KEY, "{}");
        Log.e(RPCDataItems.SWITCH_TAG_LOG, "info=" + str);
        FingerprintLoginInfo fingerprintLoginInfo2 = (FingerprintLoginInfo) JSON.parseObject(str, FingerprintLoginInfo.class);
        this.fingerprintLoginInfo = fingerprintLoginInfo2;
        return fingerprintLoginInfo2;
    }

    public boolean isFingerprintLoginAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("908434e5", new Object[]{this})).booleanValue();
        }
        FingerprintService fingerprintService = (FingerprintService) ServiceFactory.getService(FingerprintService.class);
        if (!DataProviderFactory.getDataProvider().isSupportFingerprintLogin() || fingerprintService == null || !fingerprintService.isFingerprintAvailable()) {
            return false;
        }
        return !getFingerprintLoginInfo().disable;
    }

    public boolean isFingerprintLoginOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9192fd24", new Object[]{this})).booleanValue();
        }
        if (!isFingerprintLoginAvailable()) {
            return false;
        }
        return getFingerprintLoginInfo().open;
    }

    public boolean isFingerprintLoginSetable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14461998", new Object[]{this})).booleanValue();
        }
        if (!isFingerprintLoginAvailable()) {
            return false;
        }
        return isSupportedLoginEntrance(getFingerprintLoginInfo().loginEntrance);
    }

    public boolean isSupportedLoginEntrance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f774e550", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    public void openFingerprintLoginSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff10b59a", new Object[]{this});
            return;
        }
        FingerprintLoginInfo fingerprintLoginInfo = getFingerprintLoginInfo();
        fingerprintLoginInfo.open = true;
        updateFingerprintInfo(fingerprintLoginInfo);
    }

    public void resetFingerprintInfo(FingerprintLoginInfo fingerprintLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b0e1f2", new Object[]{this, fingerprintLoginInfo});
        } else if (fingerprintLoginInfo != null) {
            fingerprintLoginInfo.token = null;
            fingerprintLoginInfo.showLoginId = "";
        }
    }

    public void updateFingerprintInfo(FingerprintLoginInfo fingerprintLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d83dfb8", new Object[]{this, fingerprintLoginInfo});
        } else if (fingerprintLoginInfo != null) {
            try {
                fingerprintLoginInfo.lastUpdateTime = System.currentTimeMillis();
                String jSONString = JSON.toJSONString(fingerprintLoginInfo);
                LoginTLogAdapter.w(TAG, "updateFingerprintInfo to " + jSONString);
                SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), INFO_SP_KEY, jSONString);
            } catch (Exception e) {
                LoginTLogAdapter.e(TAG, "updateFingerprintInfo error", e);
            }
        }
    }
}
