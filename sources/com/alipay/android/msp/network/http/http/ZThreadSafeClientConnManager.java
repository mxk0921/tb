package com.alipay.android.msp.network.http.http;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZThreadSafeClientConnManager extends ThreadSafeClientConnManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ZThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
    }

    public static /* synthetic */ Object ipc$super(ZThreadSafeClientConnManager zThreadSafeClientConnManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/http/http/ZThreadSafeClientConnManager");
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientConnectionOperator) ipChange.ipc$dispatch("cea04ecc", new Object[]{this, schemeRegistry});
        }
        return new ZClientConnectionOperator(schemeRegistry);
    }
}
