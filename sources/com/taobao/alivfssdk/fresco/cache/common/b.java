package com.taobao.alivfssdk.fresco.cache.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b implements CacheErrorLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f6193a = null;

    static {
        t2o.a(374341702);
        t2o.a(374341693);
    }

    public static synchronized b b() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("52767450", new Object[0]);
            }
            if (f6193a == null) {
                f6193a = new b();
            }
            return f6193a;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger
    public void a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2989c7e", new Object[]{this, cacheErrorCategory, str, str2, th});
        }
    }
}
