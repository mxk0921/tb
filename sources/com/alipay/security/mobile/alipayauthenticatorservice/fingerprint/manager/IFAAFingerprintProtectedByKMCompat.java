package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.CryptoUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.KeyMasterUtils;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.security.Signature;
import java.security.SignatureException;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.IFAAManagerV3;
import tb.a5c;
import tb.cj9;
import tb.z4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IFAAFingerprintProtectedByKMCompat implements IFAAFingerprintManagerFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KM_PROTECK_IFAA_TOKEN = "ifaa_protected_alias";
    private static final String TAG = "IFAAFingerprintProtecte";
    private static IFAAFingerprintProtectedByKMCompat sInstance;
    private String authChallenge;
    private FingerprintManager.AuthenticationCallback mCallback;
    private CancellationSignal mCancellationSignal;
    private Context mContext;
    private FingerprintManager mFingerprintManager;
    private Signature mSignature = null;

    private IFAAFingerprintProtectedByKMCompat(Context context) {
        this.mContext = context;
        try {
            this.mFingerprintManager = cj9.a(context.getSystemService("fingerprint"));
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void access$000(IFAAFingerprintProtectedByKMCompat iFAAFingerprintProtectedByKMCompat, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4faa913", new Object[]{iFAAFingerprintProtectedByKMCompat, str});
        } else {
            iFAAFingerprintProtectedByKMCompat.addMonitor(str);
        }
    }

    public static /* synthetic */ byte[] access$100(IFAAFingerprintProtectedByKMCompat iFAAFingerprintProtectedByKMCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d7f00913", new Object[]{iFAAFingerprintProtectedByKMCompat});
        }
        return iFAAFingerprintProtectedByKMCompat.signWithKM();
    }

    public static /* synthetic */ boolean access$200(IFAAFingerprintProtectedByKMCompat iFAAFingerprintProtectedByKMCompat, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fff14096", new Object[]{iFAAFingerprintProtectedByKMCompat, bArr})).booleanValue();
        }
        return iFAAFingerprintProtectedByKMCompat.verifyWithKM(bArr);
    }

    private void addMonitor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eccff4a", new Object[]{this, str});
        } else {
            TrackEvent.getIns().addMonitorKey("IFAA_PROTECTED_BY_KM", str);
        }
    }

    public static synchronized IFAAFingerprintProtectedByKMCompat getInstance(Context context) {
        synchronized (IFAAFingerprintProtectedByKMCompat.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IFAAFingerprintProtectedByKMCompat) ipChange.ipc$dispatch("6deb4772", new Object[]{context});
            }
            if (sInstance == null) {
                sInstance = new IFAAFingerprintProtectedByKMCompat(context);
            }
            IFAAFingerprintProtectedByKMCompat iFAAFingerprintProtectedByKMCompat = sInstance;
            if (iFAAFingerprintProtectedByKMCompat.mFingerprintManager == null) {
                return null;
            }
            return iFAAFingerprintProtectedByKMCompat;
        }
    }

    private String initChallenge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b87713a6", new Object[]{this});
        }
        return String.valueOf(System.currentTimeMillis());
    }

    private void initSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71e860f", new Object[]{this});
            return;
        }
        Signature initSignature = KeyMasterUtils.getInstance().initSignature(KM_PROTECK_IFAA_TOKEN);
        this.mSignature = initSignature;
        if (initSignature != null) {
            return;
        }
        if (KeyMasterUtils.getInstance().generateKey(KM_PROTECK_IFAA_TOKEN)) {
            Signature initSignature2 = KeyMasterUtils.getInstance().initSignature(KM_PROTECK_IFAA_TOKEN);
            this.mSignature = initSignature2;
            if (initSignature2 == null) {
                addMonitor("signature_init_failed");
                this.mCallback.onAuthenticationError(-2, "signature obj init failed");
                return;
            }
            return;
        }
        addMonitor("signature_init_failed");
        this.mCallback.onAuthenticationError(-2, "km key gen failed");
    }

    private byte[] signWithKM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7a5d5791", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.authChallenge)) {
            this.authChallenge = initChallenge();
        }
        try {
            this.mSignature.update(this.authChallenge.getBytes());
            return this.mSignature.sign();
        } catch (Exception e) {
            if (e instanceof SignatureException) {
                AuthenticatorLOG.error(TAG, "fp changed with SignatureException");
            } else {
                AuthenticatorLOG.error(TAG, e.getMessage());
            }
            addMonitor("sign exception");
            return null;
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
        this.mCallback = new FingerprintManager.AuthenticationCallback() { // from class: com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/alipayauthenticatorservice/fingerprint/manager/IFAAFingerprintProtectedByKMCompat$1");
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

            /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
                if (r5 == null) goto L_0x002d;
             */
            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r5) {
                /*
                    r4 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L_0x0015
                    java.lang.String r1 = "7abbe242"
                    r2 = 2
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r4
                    r3 = 1
                    r2[r3] = r5
                    r0.ipc$dispatch(r1, r2)
                    return
                L_0x0015:
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintCallback r0 = r2
                    if (r0 != 0) goto L_0x001a
                    return
                L_0x001a:
                    r0 = -1
                    if (r5 == 0) goto L_0x002d
                    android.hardware.fingerprint.FingerprintManager$CryptoObject r1 = tb.b5c.a(r5)
                    if (r1 == 0) goto L_0x002d
                    android.hardware.fingerprint.FingerprintManager$CryptoObject r5 = tb.b5c.a(r5)
                    java.security.Signature r5 = tb.c5c.a(r5)
                    if (r5 != 0) goto L_0x003a
                L_0x002d:
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat r5 = com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.this
                    java.lang.String r1 = "result/crypto/signature is null"
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.access$000(r5, r1)
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintCallback r5 = r2
                    r5.onAuthenticationError(r0, r1)
                L_0x003a:
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat r5 = com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.this
                    byte[] r5 = com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.access$100(r5)
                    if (r5 == 0) goto L_0x0050
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat r1 = com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.this
                    boolean r5 = com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.access$200(r1, r5)
                    if (r5 == 0) goto L_0x0050
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintCallback r5 = r2
                    r5.onAuthenticationSucceeded()
                    goto L_0x005d
                L_0x0050:
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat r5 = com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.this
                    java.lang.String r1 = "sign or verify failed"
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.access$000(r5, r1)
                    com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintCallback r5 = r2
                    r5.onAuthenticationError(r0, r1)
                L_0x005d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintProtectedByKMCompat.AnonymousClass1.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
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
            initSignature();
            if (this.mSignature != null) {
                FingerprintManager fingerprintManager = this.mFingerprintManager;
                a5c.a();
                fingerprintManager.authenticate(z4c.a(this.mSignature), this.mCancellationSignal, 0, this.mCallback, null);
                return;
            }
            this.mCallback.onAuthenticationError(-2, "km key gen failed");
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

    private boolean verifyWithKM(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd86553", new Object[]{this, bArr})).booleanValue();
        }
        if (!IFAAFingerprintManagerAdapter.isKmEnhanceIFAANeedVerifySign()) {
            return true;
        }
        try {
            if (CryptoUtils.verifyECCSign(this.authChallenge, CryptoUtils.byteArray2String(bArr), CryptoUtils.byteArray2String(KeyMasterUtils.getInstance().loadPublicKey(KM_PROTECK_IFAA_TOKEN).getEncoded()))) {
                return true;
            }
            addMonitor("verify sign failed");
            return false;
        } catch (UnsupportedEncodingException unused) {
            addMonitor("pubkey bytearray 2 string err");
            return false;
        } catch (Exception unused2) {
            addMonitor("verify sign exception");
            return false;
        }
    }
}
