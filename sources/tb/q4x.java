package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q4x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zpk f26509a;

    static {
        t2o.a(729810077);
    }

    public q4x(zpk zpkVar, z4a z4aVar) {
        this.f26509a = zpkVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bf5038", new Object[]{this});
            return;
        }
        this.f26509a.a();
        bqa.d("WeexCompleteVisibleStatus", "嵌套weex信息流不完全展示了");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9c5abf", new Object[]{this});
            return;
        }
        this.f26509a.b();
        bqa.d("WeexCompleteVisibleStatus", "嵌套weex信息流完全展示了");
    }
}
