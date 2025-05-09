package com.alipay.mobile.common.transport.http;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZNetworkHttpEntityWrapper extends HttpEntityWrapper implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HttpWorker f4087a;
    public ZHttpOutputStream b;
    public final HttpEntity c;

    public ZNetworkHttpEntityWrapper(HttpEntity httpEntity) {
        super(httpEntity);
        this.c = httpEntity;
    }

    public static /* synthetic */ Object ipc$super(ZNetworkHttpEntityWrapper zNetworkHttpEntityWrapper, String str, Object... objArr) {
        if (str.hashCode() == -1862539917) {
            ZNetworkHttpEntityWrapper.super.writeTo((OutputStream) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/http/ZNetworkHttpEntityWrapper");
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        if (this.c.isRepeatable()) {
            return this;
        }
        throw new CloneNotSupportedException("Entity isRepeatable returnc false.");
    }

    public void setHttpWorker(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94895a45", new Object[]{this, httpWorker});
            return;
        }
        this.f4087a = httpWorker;
        ZHttpOutputStream zHttpOutputStream = this.b;
        if (zHttpOutputStream != null) {
            zHttpOutputStream.setHttpWorker(httpWorker);
        }
    }

    public void writeTo(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fbe573", new Object[]{this, outputStream});
            return;
        }
        ZHttpOutputStream zHttpOutputStream = new ZHttpOutputStream(outputStream);
        this.b = zHttpOutputStream;
        HttpWorker httpWorker = this.f4087a;
        if (httpWorker != null) {
            zHttpOutputStream.setHttpWorker(httpWorker);
        }
        ZNetworkHttpEntityWrapper.super.writeTo(this.b);
    }

    public Object clone(Class[] clsArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bcaf0d06", new Object[]{this, clsArr}) : clone();
    }
}
