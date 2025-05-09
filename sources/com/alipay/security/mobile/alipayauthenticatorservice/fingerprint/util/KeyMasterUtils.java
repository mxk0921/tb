package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.ali.user.mobile.rpc.safe.AES;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import tb.c4g;
import tb.j2;
import tb.w3g;
import tb.x3g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class KeyMasterUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "KeyMasterUtils";
    private static KeyMasterUtils instance;

    private KeyMasterUtils() {
    }

    public static synchronized KeyMasterUtils getInstance() {
        synchronized (KeyMasterUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (KeyMasterUtils) ipChange.ipc$dispatch("ecfb109f", new Object[0]);
            }
            if (instance == null) {
                instance = new KeyMasterUtils();
            }
            return instance;
        }
    }

    public boolean deleteKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1c43849", new Object[]{this, str})).booleanValue();
        }
        try {
            AuthenticatorLOG.debug(TAG, "deleteKey alias:" + str);
            KeyStore instance2 = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            instance2.load(null);
            instance2.deleteEntry(str);
            return true;
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "Could not delete key." + e.getMessage());
            return false;
        }
    }

    public boolean generateKey(String str) {
        KeyPair keyPair;
        KeyGenParameterSpec.Builder digests;
        KeyGenParameterSpec.Builder algorithmParameterSpec;
        KeyGenParameterSpec.Builder userAuthenticationRequired;
        KeyGenParameterSpec build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44d1fbf", new Object[]{this, str})).booleanValue();
        }
        AuthenticatorLOG.debug(TAG, "generateKey alias:" + str);
        try {
            KeyPairGenerator instance2 = KeyPairGenerator.getInstance("EC", AES.ANDROID_KEYSTORE);
            c4g.a();
            digests = j2.a(str, 12).setDigests("SHA-256", "SHA-512");
            algorithmParameterSpec = digests.setAlgorithmParameterSpec(new ECGenParameterSpec("prime256v1"));
            userAuthenticationRequired = algorithmParameterSpec.setUserAuthenticationRequired(true);
            build = userAuthenticationRequired.build();
            instance2.initialize(build);
            keyPair = instance2.generateKeyPair();
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "exception:" + e.getMessage());
            keyPair = null;
        }
        return keyPair != null;
    }

    public List<String> getAliasList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("36277b88", new Object[]{this});
        }
        try {
            KeyStore instance2 = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            instance2.load(null);
            Enumeration<String> aliases = instance2.aliases();
            ArrayList arrayList = new ArrayList();
            while (aliases.hasMoreElements()) {
                arrayList.add(aliases.nextElement());
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Certificate[] getCertificateChain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Certificate[]) ipChange.ipc$dispatch("b473a57", new Object[]{this, str});
        }
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            if (!isKeyContains(str)) {
                return null;
            }
            KeyStore instance2 = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            instance2.load(null);
            return instance2.getCertificateChain(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Signature initSignature(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Signature) ipChange.ipc$dispatch("3d7aba74", new Object[]{this, str});
        }
        AuthenticatorLOG.debug(TAG, "initSign alias:" + str);
        try {
            KeyStore instance2 = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            instance2.load(null);
            Signature instance3 = Signature.getInstance("SHA256withECDSA");
            instance3.initSign((PrivateKey) instance2.getKey(str, null));
            return instance3;
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "Failed to init Signature." + e.getMessage());
            return null;
        }
    }

    public boolean isInsideSecureHardware(String str) {
        boolean isInsideSecureHardware;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e19dcaba", new Object[]{this, str})).booleanValue();
        }
        try {
            KeyStore instance2 = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            instance2.load(null);
            PrivateKey privateKey = ((KeyStore.PrivateKeyEntry) instance2.getEntry(str, null)).getPrivateKey();
            if (privateKey == null) {
                return false;
            }
            isInsideSecureHardware = x3g.a(KeyFactory.getInstance(privateKey.getAlgorithm(), AES.ANDROID_KEYSTORE).getKeySpec(privateKey, w3g.a())).isInsideSecureHardware();
            return isInsideSecureHardware;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public PublicKey loadPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("6f86e51e", new Object[]{this, str});
        }
        try {
            AuthenticatorLOG.debug(TAG, "loadPublicKey  alias:" + str);
            KeyStore instance2 = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            instance2.load(null);
            return ((KeyStore.PrivateKeyEntry) instance2.getEntry(str, null)).getCertificate().getPublicKey();
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "Failed to load publickey." + e.getMessage());
            return null;
        }
    }

    public boolean isKeyContains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c7f9a9", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            AuthenticatorLOG.debug(TAG, "isKeyContains alias:" + str);
            KeyStore instance2 = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            instance2.load(null);
            return instance2.containsAlias(str);
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "exception:" + e.getMessage());
            return false;
        }
    }

    public boolean generateKey(String str, boolean z, byte[] bArr) {
        KeyPair keyPair;
        KeyGenParameterSpec.Builder digests;
        KeyGenParameterSpec.Builder algorithmParameterSpec;
        KeyGenParameterSpec.Builder userAuthenticationRequired;
        KeyGenParameterSpec build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8db54504", new Object[]{this, str, new Boolean(z), bArr})).booleanValue();
        }
        AuthenticatorLOG.debug(TAG, "generateKey alias:" + str);
        try {
            KeyPairGenerator instance2 = KeyPairGenerator.getInstance("EC", AES.ANDROID_KEYSTORE);
            c4g.a();
            digests = j2.a(str, 12).setDigests("SHA-256", "SHA-512");
            algorithmParameterSpec = digests.setAlgorithmParameterSpec(new ECGenParameterSpec("prime256v1"));
            userAuthenticationRequired = algorithmParameterSpec.setUserAuthenticationRequired(z);
            if (Build.VERSION.SDK_INT >= 24 && bArr != null && bArr.length > 0) {
                userAuthenticationRequired.setAttestationChallenge(bArr);
            }
            build = userAuthenticationRequired.build();
            instance2.initialize(build);
            keyPair = instance2.generateKeyPair();
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "exception:" + e.getMessage());
            keyPair = null;
        }
        return keyPair != null;
    }
}
