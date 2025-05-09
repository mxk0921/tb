package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ynb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f32215a;
    public final qk7 b;
    public final Executor c = al7.b().c();

    static {
        t2o.a(615514133);
    }

    public ynb(Application application, qk7 qk7Var) {
        this.f32215a = application;
        this.b = qk7Var;
    }

    public abstract void a();
}
