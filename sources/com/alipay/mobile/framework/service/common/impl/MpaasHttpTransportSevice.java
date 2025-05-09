package com.alipay.mobile.framework.service.common.impl;

import android.content.Context;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.Transport;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MpaasHttpTransportSevice implements Transport {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static MpaasHttpTransportSevice b;

    /* renamed from: a  reason: collision with root package name */
    public final HttpManager f4221a;

    public MpaasHttpTransportSevice(Context context) {
        if (context != null) {
            this.f4221a = new HttpManager(context);
            return;
        }
        throw new IllegalArgumentException("context parameter can't be null ");
    }

    public static MpaasHttpTransportSevice getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MpaasHttpTransportSevice) ipChange.ipc$dispatch("8e7b604b", new Object[]{context});
        }
        MpaasHttpTransportSevice mpaasHttpTransportSevice = b;
        if (mpaasHttpTransportSevice != null) {
            return mpaasHttpTransportSevice;
        }
        synchronized (MpaasHttpTransportSevice.class) {
            try {
                MpaasHttpTransportSevice mpaasHttpTransportSevice2 = b;
                if (mpaasHttpTransportSevice2 != null) {
                    return mpaasHttpTransportSevice2;
                }
                MpaasHttpTransportSevice mpaasHttpTransportSevice3 = new MpaasHttpTransportSevice(context);
                b = mpaasHttpTransportSevice3;
                return mpaasHttpTransportSevice3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.Transport
    public Future<Response> execute(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("439d65a6", new Object[]{this, request});
        }
        return this.f4221a.execute(request);
    }
}
