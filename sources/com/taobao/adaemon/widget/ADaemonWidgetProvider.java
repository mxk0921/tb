package com.taobao.adaemon.widget;

import android.os.Build;
import com.taobao.adaemon.anr.ANRHacker;
import com.taobao.adaemon.widget.ADaemonWidgetProvider;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import tb.mf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ADaemonWidgetProvider extends ARangerProvider {
    static {
        t2o.a(349175938);
    }

    public static /* synthetic */ void e() {
        ANRHacker.u0().w0();
    }

    @Override // com.taobao.aranger.core.ipc.provider.ARangerProvider, android.content.ContentProvider
    public boolean onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        mf.l(new Runnable() { // from class: tb.d2
            @Override // java.lang.Runnable
            public final void run() {
                ADaemonWidgetProvider.e();
            }
        });
        return false;
    }
}
