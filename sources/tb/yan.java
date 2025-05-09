package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xan f31945a;
    public final Object b;

    public yan(xan xanVar, Object obj) {
        this.f31945a = xanVar;
        this.b = obj;
    }

    public xan a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xan) ipChange.ipc$dispatch("57fc9220", new Object[]{this});
        }
        return this.f31945a;
    }

    public Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5422a9df", new Object[]{this});
        }
        return this.b;
    }
}
