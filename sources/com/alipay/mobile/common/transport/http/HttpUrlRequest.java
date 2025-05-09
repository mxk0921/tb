package com.alipay.mobile.common.transport.http;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.RequestMethodUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.ZURLEncodedUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpUrlRequest extends Request {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte TASK_STATE_END = 2;
    public static final byte TASK_STATE_INIT = 0;
    public static final byte TASK_STATE_RUNNING = 1;
    public Map<String, String> A;
    public boolean B;
    public final Map<String, String> C;
    public String D;
    public boolean allowNonNet;
    public boolean allowRetry;
    public String b;
    public byte[] c;
    public boolean capture;
    public String d;
    public ArrayList<Header> e;
    public Map<String, String> f;
    public Throwable failedException;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public HttpForm m;
    public PerformanceDataCallback mPerformanceDataCallback;
    public long mTimeout;
    public InputStream n;
    public Thread networkThread;
    public boolean o;
    public long p;
    public HttpEntity q;
    public HttpUriRequest r;
    public HttpResponse s;
    public boolean t;
    public int taskState;
    public boolean u;
    public boolean v;
    public String w;
    public boolean x;
    public boolean y;
    public boolean z;

    public HttpUrlRequest(HttpUriRequest httpUriRequest) {
        this(httpUriRequest.getURI().toString());
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase;
        HttpEntity entity;
        this.r = httpUriRequest;
        Header[] allHeaders = httpUriRequest.getAllHeaders();
        if (allHeaders != null && allHeaders.length > 0) {
            for (Header header : allHeaders) {
                addHeader(header);
            }
        }
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase2 = this.r;
        if ((httpEntityEnclosingRequestBase2 instanceof HttpEntityEnclosingRequestBase) && (entity = (httpEntityEnclosingRequestBase = httpEntityEnclosingRequestBase2).getEntity()) != null) {
            httpEntityEnclosingRequestBase.setEntity(new ZNetworkHttpEntityWrapper(entity));
        }
        setRequestMethod(RequestMethodUtils.getMethodByHttpUriRequest(httpUriRequest));
        a(httpUriRequest);
    }

    public static /* synthetic */ Object ipc$super(HttpUrlRequest httpUrlRequest, String str, Object... objArr) {
        if (str.hashCode() == 1887430145) {
            super.cancel();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/http/HttpUrlRequest");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: all -> 0x006e, TryCatch #2 {all -> 0x006e, blocks: (B:19:0x0054, B:22:0x005b, B:24:0x0062, B:26:0x006a, B:29:0x0070), top: B:36:0x0054 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(org.apache.http.client.methods.HttpUriRequest r10) {
        /*
            r9 = this;
            java.lang.String r0 = "alinet_tspi"
            java.lang.String r1 = "HttpUrlRequest"
            java.lang.String r2 = "bizId"
            java.lang.String r3 = "[paramsCopyToTags] Illegal target spi data type: "
            com.android.alibaba.ip.runtime.IpChange r4 = com.alipay.mobile.common.transport.http.HttpUrlRequest.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001d
            java.lang.String r0 = "5d512bfe"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            r2 = 1
            r1[r2] = r10
            r4.ipc$dispatch(r0, r1)
            return
        L_0x001d:
            org.apache.http.params.HttpParams r10 = r10.getParams()
            if (r10 != 0) goto L_0x0024
            return
        L_0x0024:
            java.lang.String r4 = ""
            java.lang.Object r5 = r10.getParameter(r2)     // Catch: all -> 0x0032
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x0032
            r10.removeParameter(r2)     // Catch: all -> 0x0030
            goto L_0x004b
        L_0x0030:
            r4 = move-exception
            goto L_0x0036
        L_0x0032:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
        L_0x0036:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Get bizId from parameter fail. msg: "
            r6.<init>(r7)
            java.lang.String r4 = r4.toString()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.warn(r1, r4)
        L_0x004b:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x0054
            r9.addTags(r2, r5)
        L_0x0054:
            java.lang.Object r2 = r10.getParameter(r0)     // Catch: all -> 0x006e
            if (r2 != 0) goto L_0x005b
            return
        L_0x005b:
            r10.removeParameter(r0)     // Catch: all -> 0x006e
            boolean r10 = r2 instanceof java.lang.String     // Catch: all -> 0x006e
            if (r10 == 0) goto L_0x0070
            java.lang.String r2 = (java.lang.String) r2     // Catch: all -> 0x006e
            boolean r10 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x006e
            if (r10 != 0) goto L_0x0095
            r9.addTags(r0, r2)     // Catch: all -> 0x006e
            goto L_0x0095
        L_0x006e:
            r10 = move-exception
            goto L_0x0080
        L_0x0070:
            java.lang.Class r10 = r2.getClass()     // Catch: all -> 0x006e
            java.lang.String r10 = r10.getName()     // Catch: all -> 0x006e
            java.lang.String r10 = r3.concat(r10)     // Catch: all -> 0x006e
            com.alipay.mobile.common.transport.utils.LogCatUtil.warn(r1, r10)     // Catch: all -> 0x006e
            goto L_0x0095
        L_0x0080:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[paramsCopyToTags] Not find target spi param. msg : "
            r0.<init>(r2)
            java.lang.String r10 = r10.toString()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r1, r10)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.http.HttpUrlRequest.a(org.apache.http.client.methods.HttpUriRequest):void");
    }

    public void addHeader(Header header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369e1a26", new Object[]{this, header});
        } else {
            this.e.add(header);
        }
    }

    public void addTags(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6584875", new Object[]{this, str, str2});
            return;
        }
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, str2);
    }

    @Override // com.alipay.mobile.common.transport.Request
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        super.cancel();
        if (this.r != null) {
            try {
                closeRequestEntity();
                closeResponseStream();
                if (!this.r.isAborted()) {
                    this.r.abort();
                    if (isTaskStateRunning()) {
                        this.networkThread.interrupt();
                        LogCatUtil.info("HttpUrlRequest", "invoke cancel, interrupt thread");
                    }
                    LogCatUtil.info("HttpUrlRequest", "invoke cancel, abort request");
                }
            } catch (Throwable th) {
                LogCatUtil.warn("HttpUrlRequest", "abort request exception. errMsg=" + th.toString());
            }
        }
    }

    public void closeRequestEntity() {
        InputStream content;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9429f7c1", new Object[]{this});
            return;
        }
        HttpEntityEnclosingRequest httpEntityEnclosingRequest = this.r;
        if (httpEntityEnclosingRequest != null && (httpEntityEnclosingRequest instanceof HttpEntityEnclosingRequest)) {
            try {
                HttpEntity entity = httpEntityEnclosingRequest.getEntity();
                if (entity != null && (content = entity.getContent()) != null) {
                    content.close();
                }
            } catch (Throwable th) {
                LogCatUtil.warn("HttpUrlRequest", "closeRequestEntity exception: " + th.toString());
            }
        }
    }

    public void closeResponseStream() {
        InputStream content;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56237340", new Object[]{this});
            return;
        }
        HttpResponse httpResponse = this.s;
        if (httpResponse != null) {
            try {
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null && (content = entity.getContent()) != null) {
                    content.close();
                }
            } catch (Throwable th) {
                LogCatUtil.warn("HttpUrlRequest", "closeResponseStream exception: " + th.toString());
            }
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpUrlRequest httpUrlRequest = (HttpUrlRequest) obj;
        byte[] bArr = this.c;
        if (bArr == null) {
            if (httpUrlRequest.c != null) {
                return false;
            }
        } else if (!Arrays.equals(bArr, httpUrlRequest.c)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (httpUrlRequest.b != null) {
                return false;
            }
        } else if (!TextUtils.equals(str, httpUrlRequest.b)) {
            return false;
        }
        return true;
    }

    public String getBizLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd4c932", new Object[]{this});
        }
        return this.D;
    }

    public String getCancelMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5e917a8", new Object[]{this});
        }
        return this.w;
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this});
        }
        ArrayList<Header> arrayList = this.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return this.d;
        }
        Iterator<Header> it = this.e.iterator();
        while (it.hasNext()) {
            Header next = it.next();
            if ("Content-Type".equalsIgnoreCase(next.getName()) && !TextUtils.isEmpty(next.getValue())) {
                String value = next.getValue();
                this.d = value;
                return value;
            }
        }
        return this.d;
    }

    public long getDataLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bf868a1", new Object[]{this})).longValue();
        }
        return this.p;
    }

    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return this.C;
    }

    public Throwable getFailedException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("210c9e48", new Object[]{this});
        }
        return this.failedException;
    }

    public ArrayList<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("387b9a31", new Object[]{this});
        }
        return this.e;
    }

    public HttpEntity getHttpEntity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpEntity) ipChange.ipc$dispatch("3ae0cb21", new Object[]{this});
        }
        return this.q;
    }

    public HttpForm getHttpForm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpForm) ipChange.ipc$dispatch("27b7ac1d", new Object[]{this});
        }
        return this.m;
    }

    public HttpUriRequest getHttpUriRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("13e8dd7e", new Object[]{this});
        }
        return this.r;
    }

    public InputStream getInputStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("b713b4be", new Object[]{this});
        }
        return this.n;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return getUrl() + Integer.toHexString(getReqData().hashCode());
    }

    public PerformanceDataCallback getPerformanceDataCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceDataCallback) ipChange.ipc$dispatch("f1c563f5", new Object[]{this});
        }
        return this.mPerformanceDataCallback;
    }

    public byte[] getReqData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfa72344", new Object[]{this});
        }
        return this.c;
    }

    public String getRequestMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e510ee9f", new Object[]{this});
        }
        return this.l;
    }

    public String getTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca26b54b", new Object[]{this, str});
        }
        Map<String, String> map = this.f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, String> getTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6c88d54b", new Object[]{this});
        }
        Map<String, String> map = this.f;
        if (map == null || map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        return this.f;
    }

    public int getTaskState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b388a4d0", new Object[]{this})).intValue();
        }
        return this.taskState;
    }

    public long getTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838026", new Object[]{this})).longValue();
        }
        return this.mTimeout;
    }

    public boolean getUrgentFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08d214e", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b;
    }

    public void innerSetDataLength(InputStream inputStream) {
        int available;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22d2170", new Object[]{this, inputStream});
            return;
        }
        try {
            if (this.p <= 0 && (available = inputStream.available()) > 0) {
                this.p = available;
            }
        } catch (IOException e) {
            LogCatUtil.error(HttpWorker.TAG, "HttpUrlRequest#setInputStream. available error!", e);
        }
    }

    public boolean isAllowNonNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbdbddba", new Object[]{this})).booleanValue();
        }
        return this.allowNonNet;
    }

    public boolean isBgRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a6f29e1", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean isCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b598d547", new Object[]{this})).booleanValue();
        }
        return this.capture;
    }

    public boolean isCompress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2873e137", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean isContainerHeader(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c52bdf79", new Object[]{this, str})).booleanValue();
        }
        Iterator<Header> it = this.e.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next().getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean isDisableEncrypt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a99db332", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean isEnableEncrypt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6a0eae3", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public boolean isFastReturnFailure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b274d9bf", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    public boolean isRadicalStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23de7a6e", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public boolean isResetCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d221114", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean isSwitchLoginRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64196465", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public boolean isTaskStateEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7ca0d84", new Object[]{this})).booleanValue();
        }
        if (this.taskState == 2) {
            return true;
        }
        return false;
    }

    public boolean isTaskStateInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd61afbd", new Object[]{this})).booleanValue();
        }
        if (this.taskState == 0) {
            return true;
        }
        return false;
    }

    public boolean isTaskStateRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76d68968", new Object[]{this})).booleanValue();
        }
        if (this.taskState == 1) {
            return true;
        }
        return false;
    }

    public boolean isUseEtag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97c2ea3d", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean isUseHttpStdRetryModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12f80eca", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    public boolean isUseSystemH2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa25401", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public void putLogAttachment(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8737ead3", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.A == null) {
                this.A = new HashMap(1);
            }
            this.A.put(str, str2);
        }
    }

    public Map<String, String> refLogAttachmentMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5f4a7b84", new Object[]{this});
        }
        Map<String, String> map = this.A;
        if (map == null) {
            return Collections.EMPTY_MAP;
        }
        return map;
    }

    public void setAllowNonNet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418ccb16", new Object[]{this, new Boolean(z)});
        } else {
            this.allowNonNet = z;
        }
    }

    public void setBgRpc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e70cdcf", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void setBizLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e4a84", new Object[]{this, str});
        } else {
            this.D = str;
        }
    }

    public void setCapture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f2129", new Object[]{this, new Boolean(z)});
        } else {
            this.capture = z;
        }
    }

    public void setCompress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ffc3c9", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setDataLength(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ebbd2b", new Object[]{this, new Long(j)});
        } else {
            this.p = j;
        }
    }

    public void setDisableEncrypt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6a3b2e", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public void setEnableEncrypt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b556750d", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public void setExtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.C.clear();
            this.C.putAll(map);
        }
    }

    public void setFailedException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33407fe", new Object[]{this, th});
        } else {
            this.failedException = th;
        }
    }

    public void setFastReturnFailure(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580505b1", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public void setHeaders(ArrayList<Header> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23bab3f", new Object[]{this, arrayList});
        } else if (arrayList != null) {
            this.e = arrayList;
        }
    }

    public void setHttpEntity(HttpEntity httpEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13755e7", new Object[]{this, httpEntity});
            return;
        }
        this.q = httpEntity;
        if (httpEntity != null) {
            this.p = httpEntity.getContentLength();
        }
    }

    public void setHttpForm(HttpForm httpForm) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7f1145", new Object[]{this, httpForm});
        } else if (this.n != null) {
            throw new IllegalArgumentException("You have been set inputStream  ， not allowed to set httpForm");
        } else if (this.c == null) {
            this.m = httpForm;
            if (httpForm != null) {
                this.p = httpForm.getContentLength();
            }
        } else {
            throw new IllegalArgumentException("You have been set reqData ， not allowed to set httpForm");
        }
    }

    public void setHttpResponse(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6aa6a7", new Object[]{this, httpResponse});
        } else {
            this.s = httpResponse;
        }
    }

    public void setHttpUriRequest(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c839cdb2", new Object[]{this, httpUriRequest});
        } else {
            this.r = httpUriRequest;
        }
    }

    public void setInputStream(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186a1f44", new Object[]{this, inputStream});
        } else if (this.m != null) {
            throw new IllegalArgumentException("You have been set httpForm ， not allowed to set inputStream");
        } else if (this.c == null) {
            this.n = inputStream;
            if (inputStream != null) {
                innerSetDataLength(inputStream);
            }
        } else {
            throw new IllegalArgumentException("You have been set mReqData ， not allowed to set inputStream");
        }
    }

    public void setNetworkThread(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d449060e", new Object[]{this, thread});
        } else {
            this.networkThread = thread;
        }
    }

    public void setPerformanceDataCallback(PerformanceDataCallback performanceDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc7ef31", new Object[]{this, performanceDataCallback});
        } else {
            this.mPerformanceDataCallback = performanceDataCallback;
        }
    }

    public void setRadicalStrategy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebb68e2", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public void setReqData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82a05b4", new Object[]{this, bArr});
        } else if (this.n != null) {
            throw new IllegalArgumentException("You have been set inputStream  ， not allowed to set reqData");
        } else if (this.m == null) {
            this.c = bArr;
            if (bArr != null) {
                this.p = bArr.length;
            }
        } else {
            throw new IllegalArgumentException("You have been set httpForm ， not allowed to set reqData");
        }
    }

    public void setRequestMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1acc71f", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void setResetCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390d02fc", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void setRpcHttp2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb12ef46", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public void setSwitchLoginRpc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4264b05b", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public void setTags(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328360a3", new Object[]{this, map});
        } else {
            this.f = map;
        }
    }

    public void setTaskState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8582d1d2", new Object[]{this, new Integer(i)});
        } else {
            this.taskState = i;
        }
    }

    public void setTimeout(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f7de", new Object[]{this, new Long(j)});
        } else {
            this.mTimeout = j;
        }
    }

    public void setUrgentFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ee543e", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public String setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b4d97e2", new Object[]{this, str});
        }
        String urlEncode = ZURLEncodedUtil.urlEncode(str);
        this.b = urlEncode;
        return urlEncode;
    }

    public void setUseEtag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2537aaf3", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void setUseHttpStdRetryModel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9685dc96", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void setUseSystemH2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b951daf", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String url = getUrl();
        ArrayList<Header> headers = getHeaders();
        String obj = getTags().toString();
        byte[] bArr = this.c;
        if (bArr == null) {
            str = "";
        } else {
            str = new String(bArr);
        }
        return String.format("Url : %s,HttpHeader: %s, Tags: %s, Body:%s", url, headers, obj, str);
    }

    public void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
        } else {
            this.e.add(new BasicHeader(str, str2));
        }
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Map<String, String> map = this.f;
        if (map != null && map.containsKey(TransportConstants.KEY_REQ_DATA_DIGEST)) {
            i2 = this.f.get(TransportConstants.KEY_REQ_DATA_DIGEST).hashCode() + 31;
        }
        int hashCode = (i2 * 31) + (TextUtils.isEmpty(this.b) ? 0 : this.b.hashCode());
        if (this.f.containsKey("operationType")) {
            i = this.f.get("operationType").hashCode();
        }
        return hashCode + i;
    }

    public boolean isRpcHttp2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bbed21a", new Object[]{this})).booleanValue();
        }
        return this.z || TextUtils.equals(getTag(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK), "true");
    }

    public void setHeader(Header header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a362da7", new Object[]{this, header});
        } else if (header != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Header header2 = this.e.get(i);
                if (header2 != null && header2.getName() != null && header2.getName().equalsIgnoreCase(header.getName())) {
                    LogCatUtil.warn("HttpUrlRequest", "setHeadert. Conflict header , key=[" + header.getName() + "], old_value=[" + header2.getValue() + "] , new_value=[" + header.getValue() + "] ");
                    this.e.set(i, header);
                    return;
                }
            }
            this.e.add(header);
        }
    }

    @Override // com.alipay.mobile.common.transport.Request
    public void cancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5301f18b", new Object[]{this, str});
            return;
        }
        this.w = str;
        cancel();
    }

    public HttpUrlRequest(String str) {
        this.i = true;
        this.j = true;
        this.k = false;
        this.l = "GET";
        this.o = false;
        this.p = 0L;
        this.allowRetry = false;
        this.mTimeout = -1L;
        this.allowNonNet = false;
        this.t = false;
        this.u = false;
        this.capture = false;
        this.v = false;
        this.x = false;
        this.y = false;
        this.taskState = 0;
        this.z = true;
        this.B = false;
        this.C = new HashMap();
        this.D = "";
        this.b = ZURLEncodedUtil.urlEncode(str);
        this.e = new ArrayList<>();
        this.f = new HashMap();
        this.d = HeaderConstant.HEADER_VALUE_OLD_TYPE;
    }

    public HttpUrlRequest(String str, byte[] bArr, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this.i = true;
        this.j = true;
        this.k = false;
        this.l = "GET";
        this.o = false;
        this.p = 0L;
        this.allowRetry = false;
        this.mTimeout = -1L;
        this.allowNonNet = false;
        this.t = false;
        this.u = false;
        this.capture = false;
        this.v = false;
        this.x = false;
        this.y = false;
        this.taskState = 0;
        this.z = true;
        this.B = false;
        this.C = new HashMap();
        this.D = "";
        this.b = ZURLEncodedUtil.urlEncode(str);
        this.c = bArr;
        if (bArr != null) {
            this.p = bArr.length;
        }
        if (arrayList == null) {
            this.e = new ArrayList<>();
        } else {
            this.e = arrayList;
        }
        if (hashMap == null) {
            this.f = new HashMap(4);
        } else {
            this.f = hashMap;
        }
        this.d = HeaderConstant.HEADER_VALUE_OLD_TYPE;
    }

    public HttpUrlRequest(String str, HttpForm httpForm, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this(str, (byte[]) null, arrayList, hashMap);
        this.m = httpForm;
        this.p = httpForm.getContentLength();
    }

    public HttpUrlRequest(String str, HttpEntity httpEntity, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this(str, (byte[]) null, arrayList, hashMap);
        this.q = httpEntity;
        this.p = httpEntity.getContentLength();
    }

    public HttpUrlRequest(String str, InputStream inputStream, long j, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        this(str, (byte[]) null, arrayList, hashMap);
        this.n = inputStream;
        this.p = j;
    }
}
