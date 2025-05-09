package com.alipay.android.msp.framework.statistics;

import android.text.TextUtils;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DefaultHttpClient f3659a = new DefaultHttpClient();

    public byte[] fetch(String str, byte[] bArr, String str2, List<Header> list) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("aed00c70", new Object[]{this, str, bArr, str2, list});
        }
        HttpResponse fetchResponse = fetchResponse(str, bArr, str2, list);
        if (fetchResponse != null) {
            return read(fetchResponse);
        }
        return null;
    }

    /* JADX WARN: Finally extract failed */
    public HttpResponse fetchResponse(String str, byte[] bArr, String str2, List<Header> list) {
        HttpPost httpPost;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("7d55b75d", new Object[]{this, str, bArr, str2, list});
        }
        if (bArr == null || bArr.length == 0) {
            httpPost = new HttpGet(str);
        } else {
            httpPost = new HttpPost(str);
            if (TextUtils.isEmpty(str2)) {
                str2 = MspNetConstants.Request.DEFAULT_CONTENT_TYPE;
            }
            ByteArrayEntity byteArrayEntity = new ByteArrayEntity(bArr);
            byteArrayEntity.setContentType(str2);
            httpPost.setEntity(byteArrayEntity);
        }
        if (list != null) {
            for (Header header : list) {
                httpPost.addHeader(header);
            }
        }
        try {
            try {
                HttpResponse execute = this.f3659a.execute(httpPost);
                this.f3659a.getConnectionManager().shutdown();
                return execute;
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                this.f3659a.getConnectionManager().shutdown();
                return null;
            }
        } catch (Throwable th) {
            this.f3659a.getConnectionManager().shutdown();
            throw th;
        }
    }

    public byte[] read(HttpResponse httpResponse) throws IllegalStateException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("29eb740b", new Object[]{this, httpResponse});
        }
        byte[] bArr = new byte[1024];
        InputStream inputStream = null;
        try {
            InputStream content = httpResponse.getEntity().getContent();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = content.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = content;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e) {
                                LogUtil.printExceptionStackTrace(e);
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e2) {
                                LogUtil.printExceptionStackTrace(e2);
                            }
                        }
                        throw th;
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    content.close();
                } catch (Exception e3) {
                    LogUtil.printExceptionStackTrace(e3);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e4) {
                    LogUtil.printExceptionStackTrace(e4);
                }
                return byteArray;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }
}
