package com.alipay.mobile.alertsentry;

import android.content.Context;
import com.alipay.mobile.alertsentry.engine.Engine;
import com.alipay.mobile.alertsentry.module.ManifestParser;
import com.alipay.mobile.alertsentry.module.SentryModule;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Sentry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Sentry f3874a;

    public Sentry(Engine engine) {
    }

    public static Sentry a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sentry) ipChange.ipc$dispatch("15c7e89c", new Object[]{context});
        }
        if (f3874a == null) {
            synchronized (Sentry.class) {
                try {
                    if (f3874a == null) {
                        if (context != null) {
                            Context applicationContext = context.getApplicationContext();
                            SentryBuilder sentryBuilder = new SentryBuilder(applicationContext);
                            for (SentryModule sentryModule : new ManifestParser(applicationContext).a()) {
                                sentryModule.applyOptions(applicationContext, sentryBuilder);
                            }
                            f3874a = sentryBuilder.a();
                        } else {
                            f3874a = new SentryBuilder(context).a();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3874a;
    }
}
