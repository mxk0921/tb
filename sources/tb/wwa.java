package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wwa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nwa f30965a = new nwa();
    public final dxa b = new dxa();
    public int c;
    public String d;
    public int e;

    static {
        t2o.a(779092496);
    }

    public nwa a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwa) ipChange.ipc$dispatch("edf7e78e", new Object[]{this});
        }
        return this.f30965a;
    }

    public dxa b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxa) ipChange.ipc$dispatch("f74f7b24", new Object[]{this});
        }
        return this.b;
    }
}
