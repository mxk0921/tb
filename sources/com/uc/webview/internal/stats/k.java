package com.uc.webview.internal.stats;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.a;
import com.uc.webview.base.io.d;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tb.gat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14523a = "k";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends c {
        private b() {
            super(k.this, (byte) 0);
        }

        @Override // com.uc.webview.internal.stats.k.c
        public final String a() {
            return "4ee01a39f0c1";
        }

        @Override // com.uc.webview.internal.stats.k.c
        public final String b() {
            return GlobalSettings.getStringValue(222);
        }

        public /* synthetic */ b(k kVar, byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c {
        private c() {
        }

        public final String a(String str) {
            String c;
            String valueOf = String.valueOf(System.currentTimeMillis());
            a.b a2 = a.b.a();
            a2.f14258a = (a() + str + valueOf + "AppChk#2014").getBytes(Charset.forName("UTF-8"));
            if (TextUtils.isEmpty(a2.c())) {
                return null;
            }
            return b() + "?uc_param_str=&chk=" + c.substring(c.length() - 8, c.length()) + "&vno=" + valueOf + "&uuid=" + str + "&app=" + a() + "&zip=gzip&enc=aes";
        }

        public String b() {
            return GlobalSettings.getStringValue(223);
        }

        public /* synthetic */ c(k kVar, byte b) {
            this();
        }

        public String a() {
            return "27120f2b4115";
        }
    }

    public final boolean a(List<d> list) {
        String a2;
        byte[] bArr;
        String str = f14523a;
        Log.d(str, "upload start");
        try {
            a2 = (EnvInfo.a() ? new b(this, (byte) 0) : new c(this, (byte) 0)).a(EnvInfo.m());
        } catch (Throwable th) {
            Log.e(f14523a, "upload failed", th);
        }
        if (TextUtils.isEmpty(a2)) {
            Log.e(str, "generateServerUrl falied");
            return false;
        }
        a aVar = new a("uc");
        HashMap hashMap = new HashMap();
        i.a();
        i.a(hashMap);
        for (Map.Entry entry : hashMap.entrySet()) {
            aVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        for (d dVar : list) {
            aVar.a().a("lt", "ev").a(gat.CT, "corepv").a("ev_ac", dVar.f14511a).a(dVar.b);
        }
        aVar.a().a("stat_size", String.valueOf(aVar.b().length));
        aVar.f14524a.toString();
        Log.b();
        a.C0830a aVar2 = new a.C0830a(a(aVar.b())) { // from class: com.uc.webview.internal.stats.k.1
            @Override // com.uc.webview.base.a.C0830a
            public final byte[] a() {
                int length = this.f14257a.length;
                byte[] bArr2 = new byte[length + 16];
                bArr2[0] = (byte) (length & 255);
                bArr2[1] = (byte) ((length >> 8) & 255);
                bArr2[2] = (byte) ((length >> 16) & 255);
                bArr2[3] = (byte) ((length >> 24) & 255);
                for (int i = 4; i < 16; i++) {
                    bArr2[i] = 0;
                }
                System.arraycopy(this.f14257a, 0, bArr2, 16, length);
                return bArr2;
            }
        };
        bArr = com.uc.webview.base.a.b;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, secretKeySpec, ivParameterSpec);
        byte[] doFinal = instance.doFinal(aVar2.a());
        int i = 3;
        while (!a(a2, doFinal)) {
            i--;
            if (i <= 0) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        final StringBuilder f14524a;

        public a(String str) {
            StringBuilder sb = new StringBuilder();
            this.f14524a = sb;
            sb.append("lt=");
            sb.append(str);
            sb.append("`");
        }

        public final a a(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb = this.f14524a;
                sb.append(str);
                sb.append("=");
                sb.append(str2);
                sb.append("`");
            }
            return this;
        }

        public final byte[] b() {
            return this.f14524a.toString().getBytes();
        }

        public final a a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a a() {
            this.f14524a.append("\n");
            return this;
        }
    }

    private static byte[] a(byte[] bArr) {
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Log.d(f14523a, "zip failed", th);
                        return null;
                    } finally {
                        d.a(gZIPOutputStream);
                        d.a(byteArrayOutputStream);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        }
    }

    private static boolean a(String str, byte[] bArr) {
        InputStream inputStream;
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        int responseCode;
        String str2;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            int length = bArr.length;
            Log.b();
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Content-Type", HeaderConstant.HEADER_VALUE_OLD_TYPE);
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
            outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                responseCode = httpURLConnection.getResponseCode();
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            outputStream = null;
        }
        if (responseCode != 200) {
            Log.w(f14523a, "upload response error:".concat(String.valueOf(responseCode)));
            return false;
        }
        inputStream = httpURLConnection.getInputStream();
        try {
            byte[] bArr2 = new byte[1024];
            byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            while (true) {
                try {
                    int read = inputStream.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayOutputStream = byteArrayOutputStream;
                    inputStream = inputStream;
                    try {
                        Log.e(f14523a, "uploadInternal failed", th);
                    } finally {
                        d.a(outputStream);
                        d.a(inputStream);
                        d.a(byteArrayOutputStream);
                    }
                }
            }
            str2 = new String(byteArrayOutputStream.toByteArray());
            Log.i(f14523a, "upload response:".concat(str2));
        } catch (Throwable th5) {
            th = th5;
        }
        return str2.contains("retcode=0");
    }
}
