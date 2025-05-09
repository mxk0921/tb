package com.sina.weibo.sdk.net;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b implements a {
    static {
        t2o.a(988807223);
        t2o.a(988807222);
    }

    @Override // com.sina.weibo.sdk.net.a
    public final f a(d dVar) {
        InputStream inputStream;
        String url = dVar.getUrl();
        Bundle params = dVar.getParams();
        if (!(params == null || params.size() == 0 || TextUtils.isEmpty(url))) {
            Uri parse = Uri.parse(url);
            if (!params.isEmpty()) {
                Uri.Builder buildUpon = parse.buildUpon();
                for (String str : params.keySet()) {
                    buildUpon.appendQueryParameter(str, String.valueOf(params.get(str)));
                }
                parse = buildUpon.build();
            }
            if (parse != null) {
                url = parse.toString();
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
        try {
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                Bundle bundle = new Bundle();
                bundle.putString("Content-Type", HeaderConstant.HEADER_VALUE_OLD_TYPE);
                a(httpURLConnection, bundle);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setReadTimeout(dVar.getReadTimeout());
                httpURLConnection.setConnectTimeout(dVar.getConnectTimeout());
                httpURLConnection.connect();
                a(httpURLConnection.getOutputStream(), dVar);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    inputStream = httpURLConnection.getInputStream();
                } else {
                    inputStream = httpURLConnection.getErrorStream();
                }
                g gVar = new g(responseCode, inputStream);
                httpURLConnection.disconnect();
                return gVar;
            } catch (Exception e) {
                throw new Throwable(e.getMessage());
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Bundle bundle) {
        for (String str : bundle.keySet()) {
            httpURLConnection.addRequestProperty(str, String.valueOf(bundle.get(str)));
        }
    }

    private static void a(OutputStream outputStream, d dVar) {
        Bundle d = dVar.d();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : d.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            String valueOf = String.valueOf(d.get(str));
            try {
                sb.append(URLEncoder.encode(str, "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(valueOf, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.write(sb.toString().getBytes("UTF-8"));
            dataOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
