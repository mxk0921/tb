package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ars implements ayd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<zxd> f15966a;

    static {
        t2o.a(486539720);
        t2o.a(488636488);
    }

    @Override // tb.ayd
    public void a(zxd zxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac989b8", new Object[]{this, zxdVar});
            return;
        }
        if (this.f15966a == null) {
            this.f15966a = new CopyOnWriteArrayList();
        }
        this.f15966a.add(zxdVar);
    }

    @Override // tb.ayd
    public void b(zxd zxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5edb", new Object[]{this, zxdVar});
            return;
        }
        List<zxd> list = this.f15966a;
        if (list != null) {
            ((CopyOnWriteArrayList) list).remove(zxdVar);
        }
    }

    public void c(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9d2acd", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        List<zxd> list = this.f15966a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((zxd) it.next()).onPageScrolled(f, i);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5430f9", new Object[]{this});
            return;
        }
        List<zxd> list = this.f15966a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((zxd) it.next()).onPageSelected();
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7266fc72", new Object[]{this});
            return;
        }
        List<zxd> list = this.f15966a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((zxd) it.next()).onPageUnSelected();
            }
        }
    }
}
