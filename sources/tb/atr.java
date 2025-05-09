package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class atr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f15995a = new AtomicBoolean(false);

    static {
        t2o.a(790626370);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            if (!f15995a.getAndSet(true)) {
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "TBPopLocalDataInitTask.readAndSetup.start");
                t4f.a().e();
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "TBPopLocalDataInitTask.readAndSetup.done");
            }
        } catch (Throwable th) {
            wdm.h("TBPopLocalDataInitTask.init.error", th);
        }
    }
}
