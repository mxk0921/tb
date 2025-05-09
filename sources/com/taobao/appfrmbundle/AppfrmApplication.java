package com.taobao.appfrmbundle;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appfrmbundle.mkt.MKTHandler;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AppfrmApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Appfrm";

    static {
        System.setProperty("rx.scheduler.jdk6.purge-frequency-millis", "30000");
        System.setProperty("rx.ring-buffer.size", "300");
        int i = 2;
        int availableProcessors = Runtime.getRuntime().availableProcessors() / 2;
        StringBuilder sb = new StringBuilder("");
        if (availableProcessors >= 2) {
            i = availableProcessors;
        }
        sb.append(i);
        System.setProperty("rx.scheduler.max-computation-threads", sb.toString());
    }

    public static /* synthetic */ Object ipc$super(AppfrmApplication appfrmApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appfrmbundle/AppfrmApplication");
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        MKTHandler.d().e(Globals.getApplication());
    }
}
