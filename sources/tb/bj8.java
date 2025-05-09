package tb;

import com.alibaba.ut.abtest.event.EventType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class bj8<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final EventType f16424a;
    public final T b;
    public final Object c;

    static {
        t2o.a(961544296);
    }

    public bj8() {
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7e157e40", new Object[]{this});
        }
        return this.c;
    }

    public EventType b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventType) ipChange.ipc$dispatch("115480c4", new Object[]{this});
        }
        return this.f16424a;
    }

    public T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6b1660be", new Object[]{this});
        }
        return this.b;
    }

    public bj8(EventType eventType, T t) {
        this.f16424a = eventType;
        this.b = t;
    }

    public bj8(EventType eventType, T t, Object obj) {
        this.f16424a = eventType;
        this.b = t;
        this.c = obj;
    }
}
