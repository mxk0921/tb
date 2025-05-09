package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.InputStreamEntity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZInputStreamEntityWrapper extends InputStreamEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HttpEntity f4086a;

    public ZInputStreamEntityWrapper(InputStream inputStream, HttpEntity httpEntity) {
        super(inputStream, httpEntity.getContentLength());
        this.f4086a = httpEntity;
    }

    public static /* synthetic */ Object ipc$super(ZInputStreamEntityWrapper zInputStreamEntityWrapper, String str, Object... objArr) {
        if (str.hashCode() == 1706191588) {
            ZInputStreamEntityWrapper.super.consumeContent();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/http/ZInputStreamEntityWrapper");
    }

    public void consumeContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b26ae4", new Object[]{this});
            return;
        }
        try {
            this.f4086a.consumeContent();
        } catch (Throwable th) {
            LogCatUtil.warn("ZInputStreamEntityWrapper", "mOriginHttpEntity consumeContent exception." + th.toString());
        }
        try {
            ZInputStreamEntityWrapper.super.consumeContent();
        } catch (Throwable th2) {
            LogCatUtil.warn("ZInputStreamEntityWrapper", "consumeContent exception." + th2.toString());
        }
    }
}
