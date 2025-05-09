package com.taobao.android.identity.fingerprint;

import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.FingerCallback;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.rpc.safe.AES;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import tb.aj9;
import tb.cj9;
import tb.dj9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FingerPrintComponent implements FingerprintService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FINGERPRINTINFO = "aliuser.login.fingerprint";
    private static final String TAG = FingerPrintComponent.class.getSimpleName();
    private CancellationSignal mCancellationSignal = null;
    private FingerprintManager mFingerprintManager;
    private SharedPreferences storage;

    static {
        t2o.a(69206248);
        t2o.a(68157606);
    }

    public FingerPrintComponent() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                this.mFingerprintManager = cj9.a(DataProviderFactory.getApplicationContext().getSystemService("fingerprint"));
                this.storage = DataProviderFactory.getApplicationContext().getSharedPreferences(FINGERPRINTINFO, 4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private FingerprintManager.CryptoObject buildCryptoObject() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return dj9.a(ipChange.ipc$dispatch("6b188007", new Object[]{this}));
        }
        return aj9.a(new AES().getCipher(true));
    }

    @Override // com.ali.user.mobile.service.FingerprintService
    public void authenticate(final FingerCallback fingerCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cecc515", new Object[]{this, fingerCallback});
        } else if (fingerCallback != null) {
            FingerprintManager.AuthenticationCallback authenticationCallback = new FingerprintManager.AuthenticationCallback() { // from class: com.taobao.android.identity.fingerprint.FingerPrintComponent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/identity/fingerprint/FingerPrintComponent$1");
                }

                @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4947938f", new Object[]{this, new Integer(i), charSequence});
                    } else {
                        fingerCallback.onAuthenticationError(i, charSequence);
                    }
                }

                @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
                public void onAuthenticationFailed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d822ffdb", new Object[]{this});
                    } else {
                        fingerCallback.onAuthenticationFailed();
                    }
                }

                @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c05e8ce8", new Object[]{this, new Integer(i), charSequence});
                    } else {
                        fingerCallback.onAuthenticationHelp(i, charSequence);
                    }
                }

                @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
                public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7abbe242", new Object[]{this, authenticationResult});
                    } else {
                        fingerCallback.onAuthenticationSucceeded(authenticationResult);
                    }
                }
            };
            try {
                this.mCancellationSignal = new CancellationSignal();
                this.mFingerprintManager.authenticate(buildCryptoObject(), this.mCancellationSignal, 0, authenticationCallback, null);
            } catch (IllegalStateException e) {
                if (e.getLocalizedMessage().contains("Crypto primitive not initialized")) {
                    MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.android.identity.fingerprint.FingerPrintComponent.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                fingerCallback.onAuthenticationError(100, "指纹变更");
                            }
                        }
                    });
                    return;
                }
                throw new RuntimeException(e);
            } catch (SecurityException e2) {
                throw new RuntimeException(e2);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    @Override // com.ali.user.mobile.service.FingerprintService
    public void cancelIdentify() {
        CancellationSignal cancellationSignal;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b9292d", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 23 && (cancellationSignal = this.mCancellationSignal) != null) {
            try {
                cancellationSignal.cancel();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.ali.user.mobile.service.FingerprintService
    public boolean isFingerprintAvailable() {
        boolean isHardwareDetected;
        boolean hasEnrolledFingerprints;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56992f9a", new Object[]{this})).booleanValue();
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) DataProviderFactory.getApplicationContext().getSystemService("keyguard");
            if (Build.VERSION.SDK_INT < 23 || keyguardManager == null || this.mFingerprintManager == null) {
                return false;
            }
            boolean isKeyguardSecure = keyguardManager.isKeyguardSecure();
            isHardwareDetected = this.mFingerprintManager.isHardwareDetected();
            hasEnrolledFingerprints = this.mFingerprintManager.hasEnrolledFingerprints();
            if (!isKeyguardSecure || !isHardwareDetected || !hasEnrolledFingerprints) {
                return false;
            }
            if (CommonUtil.isInABTestRegion(LoginSwitch.FINGER_ORANGE, 10000)) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ali.user.mobile.service.FingerprintService
    public boolean isFingerprintSetable() {
        boolean isHardwareDetected;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5543d8d", new Object[]{this})).booleanValue();
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) DataProviderFactory.getApplicationContext().getSystemService("keyguard");
            if (Build.VERSION.SDK_INT < 23 || keyguardManager == null || this.mFingerprintManager == null) {
                return false;
            }
            boolean isKeyguardSecure = keyguardManager.isKeyguardSecure();
            isHardwareDetected = this.mFingerprintManager.isHardwareDetected();
            if ((!AppInfo.getInstance().isRoot() || !LoginSwitch.getSwitch("rootCheck", "true")) && isKeyguardSecure && isHardwareDetected) {
                return CommonUtil.isInABTestRegion(LoginSwitch.FINGER_ORANGE, 10000);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
