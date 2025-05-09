package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.IFAAManagerV3;
import tb.cj9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IFAAFingerprintManagerCompat implements IFAAFingerprintManagerFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static IFAAFingerprintManagerCompat sInstance;
    private FingerprintManager.AuthenticationCallback mCallback;
    private CancellationSignal mCancellationSignal;
    private Context mContext;
    private FingerprintManager mFingerprintManager;

    private IFAAFingerprintManagerCompat(Context context) {
        this.mContext = context;
        try {
            this.mFingerprintManager = cj9.a(context.getSystemService("fingerprint"));
        } catch (Throwable unused) {
        }
    }

    public static synchronized IFAAFingerprintManagerCompat getInstance(Context context) {
        synchronized (IFAAFingerprintManagerCompat.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IFAAFingerprintManagerCompat) ipChange.ipc$dispatch("90c4edcc", new Object[]{context});
            }
            if (sInstance == null) {
                sInstance = new IFAAFingerprintManagerCompat(context);
            }
            IFAAFingerprintManagerCompat iFAAFingerprintManagerCompat = sInstance;
            if (iFAAFingerprintManagerCompat.mFingerprintManager == null) {
                return null;
            }
            return iFAAFingerprintManagerCompat;
        }
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFacade
    public void authenticate(final IFAAFingerprintCallback iFAAFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f67a94", new Object[]{this, iFAAFingerprintCallback});
            return;
        }
        this.mCancellationSignal = new CancellationSignal();
        this.mCallback = new FingerprintManager.AuthenticationCallback() { // from class: com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerCompat.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/alipayauthenticatorservice/fingerprint/manager/IFAAFingerprintManagerCompat$1");
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4947938f", new Object[]{this, new Integer(i), charSequence});
                    return;
                }
                IFAAFingerprintCallback iFAAFingerprintCallback2 = iFAAFingerprintCallback;
                if (iFAAFingerprintCallback2 != null) {
                    iFAAFingerprintCallback2.onAuthenticationError(i, charSequence);
                }
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationFailed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d822ffdb", new Object[]{this});
                    return;
                }
                IFAAFingerprintCallback iFAAFingerprintCallback2 = iFAAFingerprintCallback;
                if (iFAAFingerprintCallback2 != null) {
                    iFAAFingerprintCallback2.onAuthenticationFailed();
                }
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c05e8ce8", new Object[]{this, new Integer(i), charSequence});
                }
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7abbe242", new Object[]{this, authenticationResult});
                    return;
                }
                IFAAFingerprintCallback iFAAFingerprintCallback2 = iFAAFingerprintCallback;
                if (iFAAFingerprintCallback2 != null) {
                    iFAAFingerprintCallback2.onAuthenticationSucceeded();
                }
            }
        };
        try {
            IFAAManager iFAAManager = IFAAFingerprintManagerFactory.getIFAAManager(this.mContext);
            if (iFAAManager != null) {
                int supportBIOTypes = iFAAManager.getSupportBIOTypes(this.mContext);
                AuthenticatorLOG.fpInfo("bioTypes: " + supportBIOTypes);
                int i = Constants.TYPE_FINGERPRINT;
                int i2 = i | 16;
                if ((supportBIOTypes & i2) == i2) {
                    ((IFAAManagerV3) iFAAManager).setExtInfo(i, "org.ifaa.ext.key.CUSTOM_VIEW", "enable");
                }
            }
            this.mFingerprintManager.authenticate(null, this.mCancellationSignal, 0, this.mCallback, null);
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            if (iFAAFingerprintCallback != null) {
                iFAAFingerprintCallback.onAuthenticationError(-1, "exception when authing");
            }
        }
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFacade
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        try {
            CancellationSignal cancellationSignal = this.mCancellationSignal;
            if (cancellationSignal != null && !cancellationSignal.isCanceled()) {
                this.mCancellationSignal.cancel();
            }
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
        }
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFacade
    public boolean hasEnrolledFingerprints() {
        boolean hasEnrolledFingerprints;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b8c7b9", new Object[]{this})).booleanValue();
        }
        try {
            FingerprintManager fingerprintManager = this.mFingerprintManager;
            if (fingerprintManager == null) {
                return false;
            }
            hasEnrolledFingerprints = fingerprintManager.hasEnrolledFingerprints();
            return hasEnrolledFingerprints;
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return false;
        }
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFacade
    public boolean isHardwareDetected() {
        boolean isHardwareDetected;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5964305f", new Object[]{this})).booleanValue();
        }
        try {
            FingerprintManager fingerprintManager = this.mFingerprintManager;
            if (fingerprintManager == null) {
                return false;
            }
            isHardwareDetected = fingerprintManager.isHardwareDetected();
            return isHardwareDetected;
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            return false;
        }
    }
}
