package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.no7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f26833a = new AtomicBoolean(false);
    public static a b;
    public static Application c;
    public static HashMap d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(444596236);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        a aVar = b;
        if (aVar != null && f26833a.compareAndSet(false, true)) {
            ((no7.a) aVar).a(c, d);
            b = null;
            c = null;
            d = null;
        }
    }

    public static void b(a aVar, Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b06bb66", new Object[]{aVar, application, hashMap});
            return;
        }
        b = aVar;
        c = application;
        d = hashMap;
    }
}
