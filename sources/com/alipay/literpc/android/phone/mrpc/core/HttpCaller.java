package com.alipay.literpc.android.phone.mrpc.core;

import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpCaller extends AbstractRpcCaller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Config f3845a;

    public HttpCaller(Config config, Method method, int i, String str, byte[] bArr, boolean z) {
        super(method, i, str, bArr, HeaderConstant.HEADER_VALUE_OLD_TYPE, z);
        this.f3845a = config;
    }

    public static /* synthetic */ Object ipc$super(HttpCaller httpCaller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/literpc/android/phone/mrpc/core/HttpCaller");
    }

    public final void a(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f27a47b", new Object[]{this, httpUrlRequest});
            return;
        }
        httpUrlRequest.addHeader(new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<Header> headers = this.f3845a.getRpcParams().getHeaders();
        if (!(headers == null || headers.isEmpty())) {
            for (Header header : headers) {
                httpUrlRequest.addHeader(header);
            }
        }
    }

    public final Transport b() throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport) ipChange.ipc$dispatch("dbd7bbab", new Object[]{this});
        }
        return this.f3845a.getTransport();
    }

    public final int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75f9dd7", new Object[]{this, new Integer(i)})).intValue();
        }
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 15;
            case 9:
                return 16;
            default:
                return i;
        }
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.RpcCaller
    public Object call() throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        HttpUrlRequest httpUrlRequest = new HttpUrlRequest(this.f3845a.getUrl());
        httpUrlRequest.setReqData(this.mReqData);
        httpUrlRequest.setContentType(this.mContentType);
        httpUrlRequest.setResetCookie(this.mResetCookie);
        httpUrlRequest.addTags("id", String.valueOf(this.mId));
        httpUrlRequest.addTags("operationType", this.mOperationType);
        httpUrlRequest.addTags("gzip", String.valueOf(this.f3845a.isGzip()));
        a(httpUrlRequest);
        Thread.currentThread().getId();
        httpUrlRequest.toString();
        try {
            Response response = b().execute(httpUrlRequest).get();
            if (response != null) {
                return response.getResData();
            }
            throw new RpcException((Integer) 9, "response is null");
        } catch (InterruptedException e) {
            throw new RpcException(13, "", e);
        } catch (CancellationException e2) {
            throw new RpcException(13, "", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException(9, "", e3);
            }
            HttpException httpException = (HttpException) cause;
            throw new RpcException(Integer.valueOf(c(httpException.getCode())), httpException.getMsg());
        }
    }
}
