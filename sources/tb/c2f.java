package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class c2f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c2f INSTANCE = new c2f();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f16791a = new AtomicBoolean(false);
    public static ofc b;

    static {
        t2o.a(144703494);
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        ofc ofcVar = b;
        if (ofcVar != null && f16791a.compareAndSet(false, true)) {
            ofcVar.init(null, null);
            b = null;
            iih.INSTANCE.b("InitMgr", "Mega 初始化完毕");
        }
    }

    @JvmStatic
    public static final void b(ofc ofcVar, Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d694598", new Object[]{ofcVar, application, hashMap});
            return;
        }
        ckf.g(ofcVar, "initExecutor");
        b = ofcVar;
    }
}
