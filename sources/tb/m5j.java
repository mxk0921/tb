package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m5j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final m5j f23795a = new m5j();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(1018167332);
    }

    public static m5j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m5j) ipChange.ipc$dispatch("d4281160", new Object[0]);
        }
        return f23795a;
    }

    public synchronized Mtop b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("255bc38a", new Object[]{this});
        }
        return Mtop.instance(Global.getApplication());
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3937a47", new Object[]{this, aVar});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17bb128", new Object[]{this});
        }
    }
}
