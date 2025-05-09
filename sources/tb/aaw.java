package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class aaw implements Comparable<aaw> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f15636a;
    private final IVideoPlayControllerService.c b;
    private final dcw c;
    private int d;

    static {
        t2o.a(491782767);
    }

    public aaw(IVideoPlayControllerService.c cVar, dcw dcwVar) {
        this.b = cVar;
        this.c = dcwVar;
        this.f15636a = System.identityHashCode(cVar);
    }

    /* renamed from: a */
    public int compareTo(aaw aawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e5fdd4", new Object[]{this, aawVar})).intValue();
        }
        return this.d - aawVar.d();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.f15636a;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public IVideoPlayControllerService.c e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IVideoPlayControllerService.c) ipChange.ipc$dispatch("64b6c2c1", new Object[]{this});
        }
        return this.b;
    }

    public dcw f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dcw) ipChange.ipc$dispatch("1eddf429", new Object[]{this});
        }
        return this.c;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }
}
