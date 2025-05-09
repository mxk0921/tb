package com.alipay.mobile.alertsentry;

import android.content.Context;
import com.alipay.mobile.alertsentry.engine.cache.MapCache;
import com.alipay.mobile.alertsentry.engine.cache.MemoryCache;
import com.alipay.mobile.alertsentry.engine.model.Journal;
import com.alipay.mobile.alertsentry.engine.source.DataSource;
import com.alipay.mobile.alertsentry.engine.source.DefaultDataSource;
import com.alipay.mobile.alertsentry.engine.source.local.LocalDataSource;
import com.alipay.mobile.alertsentry.trace.WatchDog;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SentryBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3875a;
    public MemoryCache<String, Journal> b;
    public MemoryCache<String, Journal> c;
    public MemoryCache<String, WatchDog> d;
    public DataSource e;

    public SentryBuilder(Context context) {
        this.f3875a = context;
    }

    public final Sentry a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sentry) ipChange.ipc$dispatch("352c594", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new MapCache();
        }
        if (this.c == null) {
            this.c = new MapCache();
        }
        if (this.d == null) {
            this.d = new MapCache();
        }
        if (this.e == null) {
            if (this.f3875a != null) {
                this.e = new LocalDataSource();
            } else {
                this.e = new DefaultDataSource();
            }
        }
        return new Sentry(null);
    }
}
