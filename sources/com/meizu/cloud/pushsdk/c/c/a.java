package com.meizu.cloud.pushsdk.c.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import tb.man;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f5774a;
    private static final Object b = new Object();
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private PublicKey h;
    private final SharedPreferences i;
    private final SharedPreferences j;
    private long k = 0;

    private a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.x.y.1", 0);
        this.i = sharedPreferences;
        this.j = context.getSharedPreferences("com.x.y.2", 0);
        Integer.parseInt(sharedPreferences.getString("keyTimeout", "0"));
        sharedPreferences.getLong("createDate", 0L);
        h();
        byte[] bArr = this.c;
        if (bArr == null || bArr.length == 0) {
            PublicKey b2 = b(context);
            this.h = b2;
            if (b2 != null) {
                c();
                return;
            }
            sharedPreferences.edit().clear().apply();
            try {
                a();
                PublicKey b3 = b(context);
                this.h = b3;
                if (b3 != null) {
                    c();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            byte[] bArr2 = this.d;
            if (bArr2 == null || bArr2.length == 0) {
                PublicKey b4 = b(context);
                this.h = b4;
                if (b4 != null) {
                    b();
                }
            }
        }
    }

    private String a(InputStream inputStream) {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            } catch (IOException unused) {
                str = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        }
        str = byteArrayOutputStream.toString();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused3) {
            return str;
        }
    }

    private PublicKey b(Context context) {
        a("load publicKey from preference");
        String string = this.j.getString("publicKey", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(string, 2)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void c() {
        d();
        b();
    }

    private void d() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            byte[] encoded = instance.generateKey().getEncoded();
            this.c = encoded;
            byte[] encode = Base64.encode(encoded, 2);
            this.e = encode;
            a("***** rKey64: ".concat(new String(encode)));
            SharedPreferences.Editor edit = this.i.edit();
            edit.putString("rKey64", new String(this.e));
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static a e() {
        a aVar = f5774a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KeyMgr is not initialised - invoke at least once with parameterised init/get");
    }

    private void h() {
        a("loadKeys");
        String string = this.i.getString("sKey64", "");
        a("saved sKey64: " + string);
        if (!TextUtils.isEmpty(string)) {
            this.g = string.getBytes();
        }
        String string2 = this.i.getString("aKey64", "");
        a("saved aKey64: " + string2);
        if (!TextUtils.isEmpty(string2)) {
            byte[] bytes = string2.getBytes();
            this.f = bytes;
            this.d = Base64.decode(bytes, 2);
        }
        String string3 = this.i.getString("rKey64", "");
        a("saved rKey64: " + string3);
        if (!TextUtils.isEmpty(string3)) {
            byte[] bytes2 = string3.getBytes();
            this.e = bytes2;
            byte[] decode = Base64.decode(bytes2, 2);
            this.c = decode;
            a("saved rKey: ".concat(new String(decode)));
        }
    }

    public byte[] f() {
        return this.f;
    }

    public byte[] g() {
        return this.g;
    }

    private void a() throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(PushConstants.URL_DOWNLOAD_PUBLIC_KEY).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            try {
                httpURLConnection.setRequestMethod("GET");
            } catch (ProtocolException e) {
                e.printStackTrace();
            }
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            InputStream inputStream = null;
            try {
                int responseCode = httpURLConnection.getResponseCode();
                a("code = " + responseCode);
                inputStream = httpURLConnection.getInputStream();
                if (inputStream != null) {
                    String a2 = a(inputStream);
                    a("body = " + a2);
                    if (!TextUtils.isEmpty(a2)) {
                        try {
                            JSONObject jSONObject = new JSONObject(a2);
                            if (jSONObject.getInt("code") == 200) {
                                String string = jSONObject.getString("value");
                                SharedPreferences.Editor edit = this.j.edit();
                                edit.putString("publicKey", string);
                                edit.apply();
                            }
                        } catch (Exception e2) {
                            b("downloadPublicKey message error " + e2.getMessage());
                        }
                    }
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                httpURLConnection.disconnect();
            }
        } catch (MalformedURLException unused2) {
        }
    }

    private void b() {
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, this.h);
            byte[] doFinal = instance.doFinal(this.c);
            this.d = doFinal;
            byte[] encode = Base64.encode(doFinal, 2);
            this.f = encode;
            a("***** aKey64: ".concat(new String(encode)));
            SharedPreferences.Editor edit = this.i.edit();
            edit.putString("aKey64", new String(this.f));
            edit.apply();
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | Exception e) {
            e.printStackTrace();
        }
    }

    public void c(String str) {
        this.g = str.getBytes();
        SharedPreferences.Editor edit = this.i.edit();
        edit.putString("sKey64", new String(this.g));
        edit.apply();
    }

    public static void a(Context context) {
        if (f5774a == null) {
            synchronized (b) {
                try {
                    if (f5774a == null) {
                        f5774a = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void b(String str) {
        DebugLogger.e("HttpKeyMgr", str);
    }

    private void a(String str) {
        DebugLogger.d("HttpKeyMgr", str);
    }

    public byte[] a(byte[] bArr) {
        String str;
        byte[] bArr2 = this.c;
        if (bArr2 == null || bArr2.length == 0) {
            str = "rKey null!";
        } else if (bArr == null || bArr.length == 0) {
            str = "input null!";
        } else {
            a(">>>>>>>>>> encrypt input >>>>>>>>>>\n".concat(new String(Base64.encode(bArr, 2))));
            a("<<<<<<<<<< encrypt input <<<<<<<<<<");
            try {
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(1, new SecretKeySpec(this.c, "AES"), new IvParameterSpec(this.c));
                byte[] doFinal = instance.doFinal(bArr);
                a(">>>>>>>>>> encrypt output >>>>>>>>>>\n".concat(new String(Base64.encode(doFinal, 2))));
                a("<<<<<<<<<< encrypt output <<<<<<<<<<");
                return doFinal;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        b(str);
        return null;
    }
}
