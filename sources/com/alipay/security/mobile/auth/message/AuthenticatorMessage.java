package com.alipay.security.mobile.auth.message;

import com.alipay.security.mobile.auth.Constants;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthenticatorMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIO_PAY = 1;
    public static final String FINGERPRINTS_NUM = "FINGERPRINTS_NUM";
    public static final String KEY_AUTHENTICATE_METHOD = "KEY_AUTHENTICATE_METHOD";
    public static final String KEY_AUTHENTICATOR_TYPE = "KEY_AUTHENTICATOR_TYPE";
    public static final String KEY_CALLBACK_TYPE = "KEY_CALLBACK_TYPE";
    public static final String KEY_CHECKING_POLICY = "KEY_CHECKING_POLICY";
    public static final String KEY_DEVICEID = "DEVICEID";
    public static final String KEY_ERROR_CODE = "KEY_ERROR_CODE";
    public static final String KEY_ERROR_LOG = "KEY_ERROR_LOG";
    public static final String KEY_EXTRA_PARAMS = "KEY_EXTRA_PARAMS";
    public static final String KEY_FEATURE = "KEY_FEATURE";
    public static final String KEY_FULL_LOG = "KEY_FULL_LOG";
    public static final String KEY_MESSAGE = "KEY_MESSAGE";
    public static final String KEY_OPERATION = "KEY_OPERATION";
    public static final String KEY_OPERATIONT_TYPE = "KEY_OPERATIONT_TYPE";
    public static final String KEY_PF_LOG = "KEY_PERFORMANCE_LOG";
    public static final String KEY_REGISTERED_TOKENS = "KEY_REGISTERED_TOKENS";
    public static final String KEY_RESULT = "KEY_RESULT";
    public static final String KEY_STATUS = "KEY_STATUS";
    public static final String KEY_TIME_OUT = "KEY_TIME_OUT";
    public static final String KEY_TRY_TIME = "KEY_TRY_TIME";
    public static final int KEY_UI_TYPE_NEW = 1;
    public static final int KEY_UI_TYPE_OLD = 0;
    public static final String KEY_USERID = "KEY_USERID";
    public static final String KEY_USERSTATUS = "KEY_USERSTATUS";
    public static final String KEY_VENDOR_ERROR_CODE = "KEY_VENDOR_ERROR_CODE";
    public static final String KEY_VENDOR_TYPE = "KEY_VENDOR_TYPE";
    public static final String KEY_VERIFY_ID = "KEY_VERIFY_ID";
    public static final int MSG_AUTHENTICATOR_REQUEST = 3;
    public static final int MSG_AUTHENTICATOR_RESPONSE = 9;
    public static final int MSG_CHECK_UPDATE = 17;
    public static final int MSG_DEREGISTER_REQUEST = 4;
    public static final int MSG_DEREGISTER_RESPONSE = 10;
    public static final int MSG_GET_DEVICE_ID = 12;
    public static final int MSG_INIT_REQUEST = 0;
    public static final int MSG_INIT_RESPONSE = 6;
    public static final int MSG_LOGIN_REQUEST = 1;
    public static final int MSG_LOGIN_RESPONSE = 7;
    public static final int MSG_OPEN_FINGERPRINT_MANAGER = 16;
    public static final int MSG_PREPARE_KEYPARE = 15;
    public static final int MSG_QUERYTOKENS_REQUEST = 5;
    public static final int MSG_QUERYTOKENS_RESPONSE = 11;
    public static final int MSG_QUERY_FINGERPRINTS = 13;
    public static final int MSG_QUERY_USERSTATUS = 14;
    public static final int MSG_REGISTER_REQUEST = 2;
    public static final int MSG_REGISTER_RESPONSE = 8;
    public static final int MSG_UPDATE_TA = 18;
    public static final int SWITCH_BTN_TYPE_DEFAULT = 0;
    public static final int SWITCH_BTN_TYPE_INVISIBLE = 2;
    public static final int SWITCH_BTN_TYPE_OTHER = 1;
    public static final int SWITCH_BTN_TYPE_PWD = 3;
    public static int TYPE_NNL_FIDO = 1;
    public static int VERSION_NNL_S5 = 1;
    public int authenticatorType;
    public boolean checkPolicyOnly;
    public String data;
    public String extraParams;
    private int featureType;
    private String id;
    private int switchBtnType;
    public int type;
    private int uiType;
    public int version;

    public AuthenticatorMessage() {
        this.authenticatorType = Constants.TYPE_FINGERPRINT;
        this.featureType = 1;
        this.switchBtnType = 0;
        this.type = 1;
        this.version = 1;
        this.checkPolicyOnly = false;
        this.uiType = 0;
    }

    public int getAuthenticatorType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("428baf91", new Object[]{this})).intValue();
        }
        return this.authenticatorType;
    }

    public String getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        return this.data;
    }

    public String getExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ace68a79", new Object[]{this});
        }
        return this.extraParams;
    }

    public int getFeatureType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da254194", new Object[]{this})).intValue();
        }
        return this.featureType;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    public int getSwitchBtnType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fc35ca6", new Object[]{this})).intValue();
        }
        return this.switchBtnType;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    public int getUiType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f5b3d5e", new Object[]{this})).intValue();
        }
        return this.uiType;
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        return this.version;
    }

    public boolean isCheckPolicyOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea7faf27", new Object[]{this})).booleanValue();
        }
        return this.checkPolicyOnly;
    }

    public void setAuthenticatorType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("412e5331", new Object[]{this, new Integer(i)});
        } else {
            this.authenticatorType = i;
        }
    }

    public void setCheckPolicyOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac40cb49", new Object[]{this, new Boolean(z)});
        } else {
            this.checkPolicyOnly = z;
        }
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }

    public void setExtraParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1f385", new Object[]{this, str});
        } else {
            this.extraParams = str;
        }
    }

    public void setFeatureType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ffa8e", new Object[]{this, new Integer(i)});
        } else {
            this.featureType = i;
        }
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public void setSwitchBtnType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd42ebc", new Object[]{this, new Integer(i)});
        } else {
            this.switchBtnType = i;
        }
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public void setUiType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4272566c", new Object[]{this, new Integer(i)});
        } else {
            this.uiType = i;
        }
    }

    public void setVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
        } else {
            this.version = i;
        }
    }

    public AuthenticatorMessage(int i, int i2) {
        this.authenticatorType = Constants.TYPE_FINGERPRINT;
        this.featureType = 1;
        this.switchBtnType = 0;
        this.checkPolicyOnly = false;
        this.uiType = 0;
        this.type = i;
        this.version = i2;
    }

    public AuthenticatorMessage(int i, String str) {
        this.authenticatorType = Constants.TYPE_FINGERPRINT;
        this.featureType = 1;
        this.switchBtnType = 0;
        this.version = 1;
        this.checkPolicyOnly = false;
        this.uiType = 0;
        this.type = i;
        this.data = str;
    }

    public AuthenticatorMessage(int i, int i2, String str) {
        this.authenticatorType = Constants.TYPE_FINGERPRINT;
        this.featureType = 1;
        this.switchBtnType = 0;
        this.checkPolicyOnly = false;
        this.uiType = 0;
        this.type = i;
        this.version = i2;
        this.data = str;
    }
}
