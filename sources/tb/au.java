package tb;

import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class au {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f16004a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static final int STATUS_TRIGGERED = 1;
        public static final int STATUS_UNTRIGGER = 0;

        /* renamed from: a  reason: collision with root package name */
        public String f16005a;
        public AtomicInteger b = new AtomicInteger(0);
        public RenderComponent c;
        public AsyncModule d;

        static {
            t2o.a(81788975);
        }
    }

    static {
        t2o.a(81788974);
    }

    public abstract void a(String str, String str2, RenderComponent renderComponent, AsyncModule asyncModule);

    public abstract AsyncModule b(String str);

    public abstract void c(String str);
}
