package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.preload.core.task.b;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class det implements kzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Deque<ysm> f17762a = new ArrayDeque();
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    @Override // tb.kzd
    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab34af6", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // tb.kzd
    public synchronized boolean c(PreloadTaskEntity.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d770a09", new Object[]{this, aVar})).booleanValue();
        }
        for (ysm ysmVar : f()) {
            if (ysmVar.e().isContainsItem(aVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.kzd
    public synchronized void d(ysm ysmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf2a84d", new Object[]{this, ysmVar});
        } else {
            e(this.f17762a, ysmVar);
        }
    }

    public final void e(Deque<ysm> deque, ysm ysmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8734d13c", new Object[]{this, deque, ysmVar});
        } else if (!deque.remove(ysmVar)) {
            wsm.c(csm.a("TaskExecutor"), "任务删除出错");
        } else {
            if (cw6.b()) {
                String a2 = csm.a("TaskExecutor");
                wsm.c(a2, "任务执行结束：" + ysmVar.e().toString());
                Iterator it = ((ArrayDeque) this.f17762a).iterator();
                while (it.hasNext()) {
                    String a3 = csm.a("TaskExecutor");
                    wsm.c(a3, "运行中的任务：" + ((ysm) it.next()).e().toString());
                }
            }
            h();
        }
    }

    public synchronized Deque<ysm> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Deque) ipChange.ipc$dispatch("4437f626", new Object[]{this});
        }
        return this.f17762a;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32ffb5ca", new Object[]{this})).booleanValue();
        }
        if (((ArrayDeque) this.f17762a).size() >= 2) {
            return true;
        }
        return false;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24f9135", new Object[]{this});
        } else if (!g()) {
            while (((ArrayDeque) this.f17762a).size() < 2) {
                a aVar = this.b;
                if (aVar == null) {
                    wsm.c(csm.a("TaskExecutor"), "promoteTaskCallback为空");
                    return;
                }
                ysm a2 = ((b.a) aVar).a();
                if (a2 == null) {
                    wsm.c(csm.a("TaskExecutor"), "准备队列中没有可执行的任务");
                    return;
                }
                ((ArrayDeque) this.f17762a).add(a2);
                a2.c();
                if (cw6.b()) {
                    String a3 = csm.a("TaskExecutor");
                    wsm.c(a3, "从准备任务队列取出一个任务进入执行队列：" + a2.e().toString());
                }
            }
        }
    }

    @Override // tb.kzd
    public synchronized void a(ysm ysmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc09f10", new Object[]{this, ysmVar});
            return;
        }
        if (((ArrayDeque) this.f17762a).size() < 2) {
            ((ArrayDeque) this.f17762a).add(ysmVar);
            ysmVar.c();
            if (cw6.b()) {
                String a2 = csm.a("TaskExecutor");
                wsm.c(a2, "进入执行任务队列：" + ysmVar.e().toString());
            }
        }
    }
}
