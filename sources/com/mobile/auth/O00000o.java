package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00000o {
    public static String O000000o(Context context, String str, String str2) {
        BufferedReader bufferedReader;
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        String str3 = "";
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestProperty("accept", "*/*");
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.addRequestProperty("Accept-Charset", "UTF-8");
                if (!TextUtils.isEmpty(str2)) {
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                    dataOutputStream.write(str2.getBytes("UTF-8"));
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } else {
                    httpURLConnection.connect();
                }
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream2 = httpURLConnection.getInputStream();
                    try {
                        StringBuilder sb = new StringBuilder();
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream2));
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                                sb.append("\n");
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStream2;
                                th = th;
                                th.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Exception e) {
                                        e = e;
                                        e.printStackTrace();
                                        return str3;
                                    }
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                return str3;
                            }
                        }
                        str3 = sb.toString();
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                    }
                } else {
                    inputStream2 = null;
                    bufferedReader = null;
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        return str3;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                bufferedReader = null;
            }
            return str3;
        } catch (Throwable th5) {
            try {
                ExceptionProcessor.processException(th5);
                return null;
            } catch (Throwable th6) {
                ExceptionProcessor.processException(th6);
                return null;
            }
        }
    }
}
