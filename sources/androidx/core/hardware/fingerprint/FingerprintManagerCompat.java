package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import tb.bj9;
import tb.cj9;
import tb.dj9;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FingerprintManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context mContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static void authenticate(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5e631d8", new Object[]{obj, obj2, cancellationSignal, new Integer(i), obj3, handler});
            } else {
                ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
            }
        }

        public static FingerprintManager.CryptoObject getCryptoObject(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FingerprintManager.CryptoObject) ipChange.ipc$dispatch("ec154303", new Object[]{obj});
            }
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager getFingerprintManagerOrNull(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FingerprintManager) ipChange.ipc$dispatch("e71adb8e", new Object[]{context});
            }
            int i = Build.VERSION.SDK_INT;
            if (i == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        public static boolean hasEnrolledFingerprints(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d5701455", new Object[]{obj})).booleanValue();
            }
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        public static boolean isHardwareDetected(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b8cdf7b", new Object[]{obj})).booleanValue();
            }
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static CryptoObject unwrapCryptoObject(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CryptoObject) ipChange.ipc$dispatch("7604c2ce", new Object[]{obj});
            }
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FingerprintManager.CryptoObject) ipChange.ipc$dispatch("62c54aad", new Object[]{cryptoObject});
            }
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class AuthenticationCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void onAuthenticationError(int i, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4947938f", new Object[]{this, new Integer(i), charSequence});
            }
        }

        public void onAuthenticationFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d822ffdb", new Object[]{this});
            }
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c05e8ce8", new Object[]{this, new Integer(i), charSequence});
            }
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("449782ba", new Object[]{this, authenticationResult});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AuthenticationResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CryptoObject) ipChange.ipc$dispatch("a8475f17", new Object[]{this});
            }
            return this.mCryptoObject;
        }
    }

    private FingerprintManagerCompat(Context context) {
        this.mContext = context;
    }

    public static FingerprintManagerCompat from(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintManagerCompat) ipChange.ipc$dispatch("f7288f95", new Object[]{context});
        }
        return new FingerprintManagerCompat(context);
    }

    private static FingerprintManager getFingerprintManagerOrNull(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return cj9.a(ipChange.ipc$dispatch("e71adb8e", new Object[]{context}));
        }
        return Api23Impl.getFingerprintManagerOrNull(context);
    }

    public static CryptoObject unwrapCryptoObject(FingerprintManager.CryptoObject cryptoObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CryptoObject) ipChange.ipc$dispatch("63f3fe4", new Object[]{cryptoObject});
        }
        return Api23Impl.unwrapCryptoObject(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback wrapCallback(final AuthenticationCallback authenticationCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return bj9.a(ipChange.ipc$dispatch("200511c8", new Object[]{authenticationCallback}));
        }
        return new FingerprintManager.AuthenticationCallback() { // from class: androidx.core.hardware.fingerprint.FingerprintManagerCompat.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/hardware/fingerprint/FingerprintManagerCompat$1");
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4947938f", new Object[]{this, new Integer(i), charSequence});
                } else {
                    AuthenticationCallback.this.onAuthenticationError(i, charSequence);
                }
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationFailed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d822ffdb", new Object[]{this});
                } else {
                    AuthenticationCallback.this.onAuthenticationFailed();
                }
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c05e8ce8", new Object[]{this, new Integer(i), charSequence});
                } else {
                    AuthenticationCallback.this.onAuthenticationHelp(i, charSequence);
                }
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7abbe242", new Object[]{this, authenticationResult});
                } else {
                    AuthenticationCallback.this.onAuthenticationSucceeded(new AuthenticationResult(FingerprintManagerCompat.unwrapCryptoObject(Api23Impl.getCryptoObject(authenticationResult))));
                }
            }
        };
    }

    private static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return dj9.a(ipChange.ipc$dispatch("62c54aad", new Object[]{cryptoObject}));
        }
        return Api23Impl.wrapCryptoObject(cryptoObject);
    }

    @Deprecated
    public void authenticate(CryptoObject cryptoObject, int i, androidx.core.os.CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5730c5d", new Object[]{this, cryptoObject, new Integer(i), cancellationSignal, authenticationCallback, handler});
        } else {
            authenticate(cryptoObject, i, cancellationSignal != null ? (CancellationSignal) cancellationSignal.getCancellationSignalObject() : null, authenticationCallback, handler);
        }
    }

    public boolean hasEnrolledFingerprints() {
        FingerprintManager fingerprintManagerOrNull;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b8c7b9", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23 || (fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext)) == null || !Api23Impl.hasEnrolledFingerprints(fingerprintManagerOrNull)) {
            return false;
        }
        return true;
    }

    public boolean isHardwareDetected() {
        FingerprintManager fingerprintManagerOrNull;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5964305f", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23 || (fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext)) == null || !Api23Impl.isHardwareDetected(fingerprintManagerOrNull)) {
            return false;
        }
        return true;
    }

    public void authenticate(CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        FingerprintManager fingerprintManagerOrNull;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbe3933", new Object[]{this, cryptoObject, new Integer(i), cancellationSignal, authenticationCallback, handler});
        } else if (Build.VERSION.SDK_INT >= 23 && (fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext)) != null) {
            Api23Impl.authenticate(fingerprintManagerOrNull, wrapCryptoObject(cryptoObject), cancellationSignal, i, wrapCallback(authenticationCallback), handler);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CryptoObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public Cipher getCipher() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Cipher) ipChange.ipc$dispatch("8dd0b2b9", new Object[]{this});
            }
            return this.mCipher;
        }

        public Mac getMac() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Mac) ipChange.ipc$dispatch("11dff82b", new Object[]{this});
            }
            return this.mMac;
        }

        public Signature getSignature() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Signature) ipChange.ipc$dispatch("5f913de4", new Object[]{this});
            }
            return this.mSignature;
        }

        public CryptoObject(Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }
    }
}
