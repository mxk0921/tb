package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kp6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BubbleTipsBean f22820a;
    public b b;
    public a c;
    public d d;
    public final CopyOnWriteArrayList<c> e = new CopyOnWriteArrayList<>();
    public String f;
    public Bitmap g;
    public List<ma4> h;
    public List<ma4> i;
    public List<ma4> j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onComponentData(List<ma4> list);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void onComponentData(List<ma4> list);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void onQrData(Bitmap bitmap);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void onComponentData(List<ma4> list);
    }

    static {
        t2o.a(667942928);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fd2190", new Object[]{this, cVar});
            return;
        }
        this.e.add(cVar);
        if (this.g != null) {
            Iterator it = new ArrayList(this.e).iterator();
            while (it.hasNext()) {
                c cVar2 = (c) it.next();
                if (cVar2 != null) {
                    cVar2.onQrData(this.g);
                }
            }
        }
    }

    public void b(List<ma4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7bae48", new Object[]{this, list});
            return;
        }
        this.h = list;
        a aVar = this.c;
        if (aVar != null) {
            aVar.onComponentData(list);
        }
    }

    public void c(List<ma4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e3b67d", new Object[]{this, list});
            return;
        }
        this.j = list;
        b bVar = this.b;
        if (bVar != null) {
            bVar.onComponentData(list);
        }
    }

    public void d(List<ma4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c848ab7", new Object[]{this, list});
            return;
        }
        this.i = list;
        d dVar = this.d;
        if (dVar != null) {
            dVar.onComponentData(list);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f7ffa9", new Object[]{this});
        } else {
            this.e.clear();
        }
    }

    public Bitmap f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4cabad6b", new Object[]{this});
        }
        return this.g;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3beea021", new Object[]{this});
        }
        return this.f;
    }

    public BubbleTipsBean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BubbleTipsBean) ipChange.ipc$dispatch("295ff051", new Object[]{this});
        }
        return this.f22820a;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            e();
        }
    }

    public void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed154661", new Object[]{this, aVar});
            return;
        }
        this.c = aVar;
        List<ma4> list = this.h;
        if (list != null) {
            aVar.onComponentData(list);
        }
    }

    public void k(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ddd191", new Object[]{this, bVar});
            return;
        }
        this.b = bVar;
        List<ma4> list = this.j;
        if (list != null) {
            bVar.onComponentData(list);
        }
    }

    public void l(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e5d7b5", new Object[]{this, bitmap});
            return;
        }
        this.g = bitmap;
        if (bitmap != null) {
            Iterator<c> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().onQrData(bitmap);
            }
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebdf9dd", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void n(BubbleTipsBean bubbleTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b92257ab", new Object[]{this, bubbleTipsBean});
        } else {
            this.f22820a = bubbleTipsBean;
        }
    }

    public void o(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbfa311", new Object[]{this, dVar});
            return;
        }
        this.d = dVar;
        List<ma4> list = this.i;
        if (list != null) {
            dVar.onComponentData(list);
        }
    }
}
