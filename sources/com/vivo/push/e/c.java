package com.vivo.push.e;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.ali.user.mobile.rpc.safe.AES;
import com.vivo.push.util.u;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;
import tb.man;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private PrivateKey f14593a = null;
    private PublicKey b = null;
    private KeyStore c;
    private X500Principal d;
    private Context e;

    public c(Context context) {
        this.e = context;
        a(context);
    }

    private synchronized void a(Context context) {
        try {
            b();
            if (!b("PushRsaKeyAlias")) {
                b(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "init error" + e.getMessage());
        }
    }

    private void b(Context context) {
        try {
            if (context == null) {
                u.d("RsaSecurity", " generateRSAKeyPairSign context == null ");
                return;
            }
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 999);
            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context.getApplicationContext()).setAlias("PushRsaKeyAlias").setSubject(this.d).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance(man.KEY_ALGORITHM, AES.ANDROID_KEYSTORE);
            instance3.initialize(build);
            instance3.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "generateRSAKeyPairSign error" + e.getMessage());
        }
    }

    private PrivateKey c(Context context) {
        PrivateKey privateKey;
        try {
            privateKey = this.f14593a;
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
        }
        if (privateKey != null) {
            return privateKey;
        }
        if (context == null) {
            u.d("RsaSecurity", " getPrivateKeySigin context == null ");
            return null;
        }
        KeyStore.Entry d = d(context);
        if (d instanceof KeyStore.PrivateKeyEntry) {
            PrivateKey privateKey2 = ((KeyStore.PrivateKeyEntry) d).getPrivateKey();
            this.f14593a = privateKey2;
            return privateKey2;
        }
        return null;
    }

    private KeyStore.Entry d(Context context) throws UnrecoverableEntryException, NoSuchAlgorithmException, KeyStoreException {
        try {
            if (context == null) {
                u.d("RsaSecurity", " getPrivateKeySigin context == null ");
                return null;
            }
            if (!b("PushRsaKeyAlias")) {
                b(context);
            }
            return this.c.getEntry("PushRsaKeyAlias", null);
        } catch (Exception e) {
            b(context);
            KeyStore.Entry entry = this.c.getEntry("PushRsaKeyAlias", null);
            e.printStackTrace();
            u.a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
            return entry;
        }
    }

    @Override // com.vivo.push.e.a
    public final String a(String str) {
        try {
            if (TextUtils.isEmpty(str) || c(this.e) == null) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            PrivateKey c = c(this.e);
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initSign(c);
            instance.update(bytes);
            String encodeToString = Base64.encodeToString(instance.sign(), 2);
            u.d("RsaSecurity", str.hashCode() + " = " + encodeToString);
            return encodeToString;
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "signClientSDK error" + e.getMessage());
            return null;
        }
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.c == null) {
                b();
            }
            return this.c.containsAlias(str);
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
            return false;
        }
    }

    @Override // com.vivo.push.e.a
    public final boolean a(byte[] bArr, PublicKey publicKey, byte[] bArr2) {
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(publicKey);
            instance.update(bArr);
            return instance.verify(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "verifyClientSDK error" + e.getMessage());
            return false;
        }
    }

    private void b() {
        try {
            KeyStore instance = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            this.c = instance;
            instance.load(null);
            this.d = new X500Principal("CN=Push SDK, OU=VIVO, O=VIVO PUSH, C=CN");
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "initKeyStore error" + e.getMessage());
        }
    }

    @Override // com.vivo.push.e.a
    public final PublicKey a() {
        try {
            PublicKey publicKey = this.b;
            if (publicKey != null) {
                return publicKey;
            }
            KeyStore.Entry d = d(this.e);
            if (!(d instanceof KeyStore.PrivateKeyEntry)) {
                return null;
            }
            PublicKey publicKey2 = ((KeyStore.PrivateKeyEntry) d).getCertificate().getPublicKey();
            this.b = publicKey2;
            return publicKey2;
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "getPublicKeySign error" + e.getMessage());
            return null;
        }
    }
}
