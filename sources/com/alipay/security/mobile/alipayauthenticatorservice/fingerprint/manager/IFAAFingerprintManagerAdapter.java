package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TACommands;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TAInterationV1;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.ByteUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.cache.AuthenticatorModel;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.IFAAManagerV2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IFAAFingerprintManagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_NEED_PROTECT = "isProtected";
    private static final String KEY_NEED_VERIFYSIGN = "isVerifySign";
    private static Object mInstanceLock = new Object();
    private static IFAAFingerprintManagerAdapter sInstance;
    private Context mContext;
    private IFAAFingerprintManagerFacade mFingerprintManagerFacade;
    private IFAAManager mIFAAManager;

    private IFAAFingerprintManagerAdapter(Context context) {
        this.mContext = context;
        this.mIFAAManager = IFAAFingerprintManagerFactory.getIFAAManager(context);
        try {
            if (isKmEnhanceIFAA()) {
                this.mFingerprintManagerFacade = IFAAFingerprintProtectedByKMCompat.getInstance(context);
            } else {
                this.mFingerprintManagerFacade = IFAAFingerprintManagerCompat.getInstance(context);
            }
        } catch (Throwable unused) {
        }
        if (this.mFingerprintManagerFacade == null) {
            try {
                this.mFingerprintManagerFacade = IFAAClientFingerprintManager.getInstance(context);
            } catch (Throwable unused2) {
            }
        }
    }

    public static IFAAFingerprintManagerAdapter getInstance(Context context) {
        IFAAFingerprintManagerAdapter iFAAFingerprintManagerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFAAFingerprintManagerAdapter) ipChange.ipc$dispatch("5dc03059", new Object[]{context});
        }
        synchronized (mInstanceLock) {
            try {
                if (sInstance == null) {
                    sInstance = new IFAAFingerprintManagerAdapter(context);
                }
                iFAAFingerprintManagerAdapter = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iFAAFingerprintManagerAdapter;
    }

    private static boolean isKmEnhanceIFAA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ae96ea", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            Map<String, Object> config = ConfigServiceUtil.getConfig(ConfigServiceUtil.KEY_NEED_KM_PROTECT_IFAA);
            if (config == null || !config.containsKey(KEY_NEED_PROTECT)) {
                return false;
            }
            return "true".equalsIgnoreCase((String) config.get(KEY_NEED_PROTECT));
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            return false;
        }
    }

    public static boolean isKmEnhanceIFAANeedVerifySign() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f385f1d6", new Object[0])).booleanValue();
        }
        try {
            Map<String, Object> config = ConfigServiceUtil.getConfig(ConfigServiceUtil.KEY_NEED_KM_PROTECT_IFAA);
            if (config == null || !config.containsKey(KEY_NEED_VERIFYSIGN)) {
                return false;
            }
            return "true".equalsIgnoreCase((String) config.get(KEY_NEED_VERIFYSIGN));
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            return false;
        }
    }

    public void authenticate(IFAAFingerprintCallback iFAAFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f67a94", new Object[]{this, iFAAFingerprintCallback});
        } else if (this.mContext != null) {
            IFAAFingerprintManagerFacade iFAAFingerprintManagerFacade = this.mFingerprintManagerFacade;
            if (iFAAFingerprintManagerFacade == null) {
                if (iFAAFingerprintCallback != null) {
                    iFAAFingerprintCallback.onAuthenticationError(-1, "fingerprint service is null");
                }
            } else if (iFAAFingerprintManagerFacade.isHardwareDetected()) {
                try {
                    this.mFingerprintManagerFacade.authenticate(iFAAFingerprintCallback);
                } catch (Exception unused) {
                    if (iFAAFingerprintCallback != null) {
                        iFAAFingerprintCallback.onAuthenticationError(-1, "fingerprint authenticate error");
                    }
                }
            } else if (iFAAFingerprintCallback != null) {
                iFAAFingerprintCallback.onAuthenticationError(-1, "hardware is not support");
            }
        } else if (iFAAFingerprintCallback != null) {
            iFAAFingerprintCallback.onAuthenticationError(-1, "context is null");
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        IFAAFingerprintManagerFacade iFAAFingerprintManagerFacade = this.mFingerprintManagerFacade;
        if (iFAAFingerprintManagerFacade != null) {
            iFAAFingerprintManagerFacade.cancel();
        }
    }

    public String getDeviceID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8f07df2", new Object[]{this});
        }
        try {
            Result sendCommand = TAInterationV1.sendCommand(this.mContext, TACommands.COMMAND_GETDEVICEID);
            if (sendCommand.getStatus() == 0) {
                return Base64.encodeToString(sendCommand.getData(), 8).replace("\n", "");
            }
            return null;
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return null;
        }
    }

    public synchronized String getDeviceModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd868ddc", new Object[]{this});
        }
        String deviceModel = this.mIFAAManager.getDeviceModel();
        if (!CommonUtils.isBlank(deviceModel)) {
            deviceModel = deviceModel.replace(" ", "_");
        }
        return deviceModel;
    }

    public int getTaVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("477874ef", new Object[]{this})).intValue();
        }
        try {
            Result sendCommand = TAInterationV1.sendCommand(this.mContext, TACommands.COMMAND_GET_TA_VERSION);
            if (sendCommand.getStatus() == 0) {
                return ByteUtils.toInt(sendCommand.getData());
            }
            return -1;
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return -1;
        }
    }

    public boolean hasEnrolledFingerprints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b8c7b9", new Object[]{this})).booleanValue();
        }
        IFAAFingerprintManagerFacade iFAAFingerprintManagerFacade = this.mFingerprintManagerFacade;
        if (iFAAFingerprintManagerFacade != null) {
            return iFAAFingerprintManagerFacade.hasEnrolledFingerprints();
        }
        return false;
    }

    public boolean isHardwareDetected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5964305f", new Object[]{this})).booleanValue();
        }
        IFAAFingerprintManagerFacade iFAAFingerprintManagerFacade = this.mFingerprintManagerFacade;
        if (iFAAFingerprintManagerFacade != null) {
            return iFAAFingerprintManagerFacade.isHardwareDetected();
        }
        return false;
    }

    public synchronized boolean startFingerprintManager() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eced1936", new Object[]{this})).booleanValue();
            }
            if (this.mIFAAManager.startBIOManager(this.mContext, 1) == 0) {
                z = true;
            }
            return z;
        }
    }

    public synchronized byte[] invokeCmd(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cb3f32d", new Object[]{this, bArr});
        }
        if (this.mIFAAManager.getVersion() >= 2) {
            try {
                return ((IFAAManagerV2) this.mIFAAManager).processCmdV2(this.mContext, bArr);
            } catch (Exception e) {
                AuthenticatorLOG.error(e);
                return null;
            }
        } else {
            try {
                return this.mIFAAManager.processCmd(this.mContext, bArr);
            } catch (UnsatisfiedLinkError unused) {
                AuthenticatorLOG.error("invoke cmd error cuz cant find method");
                return new byte[0];
            } catch (Throwable th) {
                AuthenticatorLOG.error(th);
                return new byte[0];
            }
        }
    }

    public int getUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c85f15d7", new Object[]{this, str})).intValue();
        }
        if (CommonUtils.isBlank(str)) {
            return -1;
        }
        try {
            Result sendCommandAndData = TAInterationV1.sendCommandAndData(this.mContext, TACommands.COMMAND_GET_USERSTATUS, str.getBytes());
            if (sendCommandAndData.getStatus() == 0) {
                AuthenticatorLOG.fpInfo("ifaa original user status: " + ByteUtils.toInt(sendCommandAndData.getData()));
                AuthenticatorModel.saveClientStatus(this.mContext, "2", str);
                return 2;
            } else if (sendCommandAndData.getStatus() == 2046820367) {
                AuthenticatorModel.saveClientStatus(this.mContext, "1", str);
                return 1;
            } else if (sendCommandAndData.getStatus() != 2046820364) {
                return -1;
            } else {
                AuthenticatorModel.saveClientStatus(this.mContext, "0", str);
                return 0;
            }
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return -1;
        }
    }
}
