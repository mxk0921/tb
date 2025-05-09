package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kab;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wgv implements kab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f30686a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final CopyOnWriteArraySet<rqb> c = new CopyOnWriteArraySet<>();
    public final HashMap<TMSBackPressedType, CopyOnWriteArraySet<rqb>> d = new HashMap<>();

    static {
        t2o.a(839909678);
        t2o.a(839909609);
    }

    public wgv(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f30686a = iTMSPage;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            kab.a.b(this, iTMSPage);
        }
    }

    @Override // tb.kab
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4cfc87c", new Object[]{this});
            return;
        }
        this.c.clear();
        this.d.clear();
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
            return;
        }
        kab.a.c(this);
        w5d w5dVar = (w5d) this.f30686a.getExtension(w5d.class);
        if (w5dVar != null) {
            w5dVar.c0(this);
        }
        this.c.clear();
        this.d.clear();
    }

    @Override // tb.w5d.c
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            kab.a.a(this);
        }
    }

    @Override // tb.kab
    public void Y0(TMSBackPressedType tMSBackPressedType, rqb rqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7721fa0a", new Object[]{this, tMSBackPressedType, rqbVar});
            return;
        }
        ckf.g(rqbVar, DataReceiveMonitor.CB_LISTENER);
        w5d w5dVar = (w5d) this.f30686a.getExtension(w5d.class);
        if (w5dVar != null && this.b.compareAndSet(false, true)) {
            w5dVar.A(this);
        }
        if (tMSBackPressedType == null) {
            this.c.add(rqbVar);
            return;
        }
        if (!this.d.containsKey(tMSBackPressedType)) {
            this.d.put(tMSBackPressedType, new CopyOnWriteArraySet<>());
        }
        CopyOnWriteArraySet<rqb> copyOnWriteArraySet = this.d.get(tMSBackPressedType);
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.add(rqbVar);
        }
    }

    @Override // tb.w5d.c
    public boolean a(ITMSPage iTMSPage, TMSBackPressedType tMSBackPressedType) {
        CopyOnWriteArraySet<rqb> copyOnWriteArraySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89a4e043", new Object[]{this, iTMSPage, tMSBackPressedType})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        ckf.g(tMSBackPressedType, "type");
        if (this.c.isEmpty() && ((copyOnWriteArraySet = this.d.get(tMSBackPressedType)) == null || copyOnWriteArraySet.isEmpty())) {
            return false;
        }
        Iterator<rqb> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onClose();
        }
        CopyOnWriteArraySet<rqb> copyOnWriteArraySet2 = this.d.get(tMSBackPressedType);
        if (copyOnWriteArraySet2 != null) {
            for (rqb rqbVar : copyOnWriteArraySet2) {
                rqbVar.onClose();
            }
        }
        return true;
    }
}
