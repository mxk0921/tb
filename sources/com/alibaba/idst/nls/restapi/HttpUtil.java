package com.alibaba.idst.nls.restapi;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HttpUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_OK = 200;
    private static final String TAG = "AliSpeechSDK";

    static {
        t2o.a(199229493);
    }

    private static byte[] readAll(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("40a2e65c", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr);
        while (read > 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static HttpResponse send(HttpRequest httpRequest) throws IOException {
        Throwable th;
        InputStream inputStream;
        HttpResponse httpResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("15b4203f", new Object[]{httpRequest});
        }
        OutputStream outputStream = null;
        InputStream inputStream2 = null;
        try {
            URL url = new URL(httpRequest.getUrl());
            System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            httpsURLConnection.setRequestMethod(httpRequest.getMethod());
            if ("POST".equals(httpRequest.getMethod())) {
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setDoInput(true);
            }
            httpsURLConnection.setUseCaches(false);
            if (httpRequest.getHeader() != null) {
                Map<String, String> header = httpRequest.getHeader();
                for (String str : header.keySet()) {
                    httpsURLConnection.setRequestProperty(str, header.get(str));
                }
            }
            String bodyString = httpRequest.getBodyString();
            if (bodyString == null) {
                return null;
            }
            OutputStream outputStream2 = httpsURLConnection.getOutputStream();
            try {
                outputStream2.write(bodyString.getBytes());
                outputStream2.flush();
                int responseCode = httpsURLConnection.getResponseCode();
                String responseMessage = httpsURLConnection.getResponseMessage();
                if (responseCode == 200) {
                    Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
                    headerFields.get("Content-Type").get(0);
                    if (headerFields.get("Content-Type").get(0).equals("audio/mpeg")) {
                        inputStream2 = httpsURLConnection.getInputStream();
                        httpResponse = httpRequest.parse(responseCode, readAll(inputStream2), true);
                    } else if (headerFields.get("Content-Type").get(0).equals("application/json")) {
                        inputStream2 = httpsURLConnection.getInputStream();
                        httpResponse = httpRequest.parse(responseCode, readAll(inputStream2), false);
                    } else {
                        httpResponse = null;
                    }
                } else {
                    Log.e(TAG, "error, rest get status :" + responseCode + responseMessage);
                    inputStream2 = httpsURLConnection.getErrorStream();
                    httpResponse = httpRequest.parse(responseCode, readAll(inputStream2), false);
                }
                try {
                    outputStream2.close();
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return httpResponse;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                outputStream = outputStream2;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        throw th;
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }
}
