package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vqg implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Intent f30180a;
    private final WeakReference<Activity> b;

    static {
        t2o.a(734003224);
    }

    public vqg(Activity activity, Intent intent) {
        this.b = new WeakReference<>(activity);
        this.f30180a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Intent intent = this.f30180a;
        if (intent != null && qqg.b(intent.getData()) && (activity = this.b.get()) != null) {
            qqg.c(activity, this.f30180a);
        }
    }
}
