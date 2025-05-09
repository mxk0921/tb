package tb;

import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class nnm implements zbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f24850a;
    public final CopyOnWriteArrayList<ITMSPage> b = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<ITMSPage> c = new CopyOnWriteArrayList<>();

    static {
        t2o.a(839909587);
        t2o.a(839909574);
    }

    public nnm(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f24850a = bbsVar;
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            ckf.g(bbsVar, "instance");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74a200a", new Object[]{this});
            return;
        }
        Iterator<ITMSPage> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.b.clear();
        Iterator<ITMSPage> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
        this.c.clear();
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // tb.zbd
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9413163a", new Object[]{this})).booleanValue();
        }
        if (this.b.size() == 0 && this.c.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // tb.zbd
    public void s(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9007486b", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        this.b.remove(iTMSPage);
        this.c.add(iTMSPage);
    }

    @Override // tb.zbd
    public ITMSPage L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("8139ad75", new Object[]{this, str});
        }
        ckf.g(str, "pageUrl");
        Iterator<ITMSPage> it = this.b.iterator();
        while (it.hasNext()) {
            ITMSPage next = it.next();
            if (ies.a(str, next.c())) {
                this.b.remove(next);
                next.destroy();
            }
        }
        Iterator<ITMSPage> it2 = this.c.iterator();
        while (it2.hasNext()) {
            ITMSPage next2 = it2.next();
            if (ies.a(str, next2.c())) {
                this.c.remove(next2);
                if (CommonExtKt.j()) {
                    Toast.makeText(this.f24850a.I(), "子页命中预渲染", 0).show();
                }
                return next2;
            }
        }
        return null;
    }

    @Override // tb.zbd
    public boolean f0(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("376cd3a2", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        if (!e()) {
            return false;
        }
        this.b.add(iTMSPage);
        return true;
    }
}
