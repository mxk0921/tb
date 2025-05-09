package com.taobao.tbhudong;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.task.Coordinator;
import com.taobao.tbhudong.TBHuDongServiceImp;
import com.taobao.tbreachflow.shortcuts.windvane.WVShortcutsPlugin;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.aal;
import tb.avp;
import tb.fsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBHuDongServiceImp implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicBoolean INIT_STATED = new AtomicBoolean(false);
    private static Application mApplication;

    private static void doInit(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac14ddd", new Object[]{application});
        } else if (!INIT_STATED.getAndSet(true)) {
            mApplication = application;
            aal.d().c();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.efr
                @Override // java.lang.Runnable
                public final void run() {
                    TBHuDongServiceImp.lambda$doInit$1(application);
                }
            }, 5000L);
            fsw.i("WVShortcutsPlugin", WVShortcutsPlugin.class, true);
            avp.a();
        }
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return mApplication;
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (ABGlobal.isFeatureOpened(application, "poplayer_launch_task_opt")) {
            doInit(application);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doInit$1(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b84c813", new Object[]{application});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.ffr
                @Override // java.lang.Runnable
                public final void run() {
                    TBHuDongServiceImp.lambda$null$0(application);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$null$0(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bb3268", new Object[]{application});
        } else {
            StorageMonitor.e(application);
        }
    }

    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        }
    }

    public void setup(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1141d359", new Object[]{this, application, new Boolean(z)});
        } else {
            doInit(application);
        }
    }
}
