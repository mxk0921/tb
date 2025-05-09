package tb;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yqg implements xqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Instrumentation f32282a;

    public yqg(Instrumentation instrumentation) {
        this.f32282a = instrumentation;
    }

    @Override // tb.xqg
    public void a(Activity activity, Bundle bundle, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1b4131", new Object[]{this, activity, bundle, runnable});
        } else {
            this.f32282a.callActivityOnCreate(activity, bundle);
        }
    }

    @Override // tb.xqg
    public void b(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a938c6", new Object[]{this, activity, intent});
        } else {
            this.f32282a.callActivityOnNewIntent(activity, intent);
        }
    }

    @Override // tb.xqg
    public Activity c(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f0db1f2d", new Object[]{this, classLoader, str, intent});
        }
        return this.f32282a.newActivity(classLoader, str, intent);
    }
}
