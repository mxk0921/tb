package com.alipay.mobile.common.transport.httpdns.downloader;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HttpURLConnection conn = null;
    public int requesttimeout = 15000;
    public int conntimeout = 15000;

    /* renamed from: a  reason: collision with root package name */
    public int f4113a = 0;

    public HttpClient(Context context) {
    }

    public final void b(StrategyRequest strategyRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c9a215", new Object[]{this, strategyRequest});
            return;
        }
        String generateStrategyReq = StrategyItemParser.generateStrategyReq(strategyRequest);
        if (!TextUtils.isEmpty(generateStrategyReq)) {
            c(generateStrategyReq);
            byte[] f = f(generateStrategyReq.getBytes("UTF-8"));
            this.conn.setRequestProperty(HttpConstant.CONTENT_ENCODING, "gzip");
            d(this.conn);
            this.conn.getOutputStream().write(f);
            this.conn.getOutputStream().flush();
        }
    }

    public final byte[] f(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{this, bArr});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream) { // from class: com.alipay.mobile.common.transport.httpdns.downloader.HttpClient.1
            {
                ((GZIPOutputStream) this).def.setLevel(9);
            }
        };
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.flush();
        gZIPOutputStream.close();
        LogCatUtil.debug("HDNS_HClient", "Gzip Pre-check, compressed size= " + byteArrayOutputStream.size() + ", origsize= " + bArr.length);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (DnsUtil.isUseSign()) {
            Map<String, List<String>> headerFields = this.conn.getHeaderFields();
            if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                e(headerFields);
            }
            String headerField = this.conn.getHeaderField("x-amdc-sign");
            String headerField2 = this.conn.getHeaderField("x-amdc-ts");
            String headerField3 = this.conn.getHeaderField("x-amdc-code");
            if (TextUtils.equals(headerField3, "7000") || TextUtils.equals(headerField3, "7001") || TextUtils.equals(headerField3, "7002")) {
                e(headerFields);
                throw new Exception("x-amdc-code:" + headerField3 + ",server signature verify fail");
            }
            String signData = DnsUtil.getSignData(this.conn.getURL().toString(), str, headerField2, DnsUtil.getAppId());
            LogCatUtil.debug("HDNS_HClient", "amdcRespSign:" + headerField + ",localSign:" + signData);
            if (TextUtils.isEmpty(headerField) || TextUtils.isEmpty(headerField2)) {
                e(headerFields);
                throw new Exception("8001,client signature verify fail");
            } else if (!TextUtils.equals(headerField, signData)) {
                e(headerFields);
                throw new Exception("8002,client signature verify fail");
            }
        }
    }

    public int getResponseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("baa782be", new Object[]{this})).intValue();
        }
        return this.f4113a;
    }

    public final byte[] h(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8ef4ac6d", new Object[]{this, bArr});
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr2, 0, read);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
            LogCatUtil.debug("HDNS_HClient", "Unzipped data, compressed size= " + bArr.length + ",origsize= " + byteArray.length);
        }
        byteArrayOutputStream.close();
        gZIPInputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    public final String a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        this.f4113a = this.conn.getResponseCode();
        LogCatUtil.debug("HDNS_HClient", "responseCode : " + this.f4113a);
        if (this.f4113a != 200) {
            Map<String, List<String>> headerFields = this.conn.getHeaderFields();
            if (headerFields != null) {
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    LogCatUtil.debug("HDNS_HClient", "key:" + entry.getKey() + ",value:" + entry.getValue().get(0));
                }
            }
            throw new Exception("resCode:" + this.f4113a + " invalid");
        }
        String contentEncoding = this.conn.getContentEncoding();
        InputStream inputStream = this.conn.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (contentEncoding == null || contentEncoding.indexOf("gzip") == -1) {
            LogCatUtil.debug("HDNS_HClient", "Received no zip data, size:" + byteArray.length);
            str = new String(byteArray, "utf-8");
        } else {
            str = new String(h(byteArray), "utf-8");
        }
        String trim = str.trim();
        byteArrayOutputStream.close();
        inputStream.close();
        g(trim);
        return trim;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (DnsUtil.isUseSign()) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                String signData = DnsUtil.getSignData(this.conn.getURL().toString(), str, valueOf, DnsUtil.getAppId());
                this.conn.setRequestProperty("x-amdc-ts", valueOf);
                this.conn.setRequestProperty("x-amdc-sign", signData);
                if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                    for (Map.Entry<String, List<String>> entry : this.conn.getRequestProperties().entrySet()) {
                        LogCatUtil.debug("HDNS_HClient", "key:" + entry.getKey() + ",value:" + entry.getValue().get(0));
                    }
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("HDNS_HClient", "addSignParams ex:" + th.toString());
        }
    }

    public final void d(HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af8daf11", new Object[]{this, httpURLConnection});
            return;
        }
        try {
            for (Map.Entry<String, List<String>> entry : httpURLConnection.getRequestProperties().entrySet()) {
                LogCatUtil.debug("HDNS_HClient", "key:" + entry.getKey() + ",value:" + entry.getValue().get(0));
            }
        } catch (Throwable th) {
            LogCatUtil.error("HDNS_HClient", "printRequestInfo ex:" + th.toString());
        }
    }

    public final void e(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                LogCatUtil.debug("HDNS_HClient", "key:" + entry.getKey() + ",value:" + entry.getValue().get(0));
            }
        } catch (Throwable th) {
            LogCatUtil.error("HDNS_HClient", "printResponHeaders ex:" + th.toString());
        }
    }

    public StrategyResponse getStrategyFromServer(String str, StrategyRequest strategyRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyResponse) ipChange.ipc$dispatch("437f57a3", new Object[]{this, str, strategyRequest});
        }
        this.f4113a = 0;
        try {
            HttpURLConnection connection = getConnection(new URL(str));
            this.conn = connection;
            if (connection != null) {
                b(strategyRequest);
                String a2 = a();
                if (!TextUtils.isEmpty(a2)) {
                    StrategyResponse parseStrategyContent = StrategyItemParser.parseStrategyContent(a2);
                    if (parseStrategyContent != null) {
                        return parseStrategyContent;
                    }
                    throw new Exception("parse exception");
                }
                throw new Exception("response is null");
            }
            throw new Exception("Conn_Failed_to_Create");
        } catch (Exception e) {
            LogCatUtil.debug("HDNS_HClient", "General error: " + e.toString());
            throw e;
        }
    }

    public HttpURLConnection getConnection(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("750b3da5", new Object[]{this, url});
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (httpURLConnection == null) {
            return null;
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(this.conntimeout);
        httpURLConnection.setReadTimeout(this.requesttimeout);
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "text/json");
        httpURLConnection.setRequestProperty(HttpConstant.USER_AGENT, "A");
        String host = url.getHost();
        if (DnsUtil.isAmdcHost(host)) {
            httpURLConnection.setRequestProperty(HttpConstant.HOST, host);
        } else {
            httpURLConnection.setRequestProperty(HttpConstant.HOST, DnsUtil.getAmdcHost());
        }
        String appId = DnsUtil.getAppId();
        if (TextUtils.equals(appId, "UnknowProductId")) {
            appId = MiscUtils.getPackageName();
        }
        httpURLConnection.setRequestProperty("x-amdc-appid", appId);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }
}
