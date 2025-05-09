package com.alipay.mobile.common.transport.http.method;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import org.apache.http.client.methods.HttpPost;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpPostExt extends HttpPost {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f4095a;

    public HttpPostExt(String str) {
        this.f4095a = str;
    }

    public static /* synthetic */ Object ipc$super(HttpPostExt httpPostExt, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/http/method/HttpPostExt");
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.f4095a;
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.f4095a = str;
        }
    }

    public HttpPostExt(URI uri, String str) {
        super(uri);
        this.f4095a = str;
    }

    public HttpPostExt(String str, String str2) {
        super(str);
        this.f4095a = str2;
    }
}
