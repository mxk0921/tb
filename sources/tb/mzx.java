package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tao.reactivex.b.a;
import tao.reactivex.d.h.e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class mzx implements sxx, kzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<sxx> f24422a;
    public volatile boolean b;

    static {
        t2o.a(628097389);
        t2o.a(628097368);
        t2o.a(628097369);
    }

    @Override // tb.kzx
    public boolean a(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0a041a6", new Object[]{this, sxxVar})).booleanValue();
        }
        wxx.b(sxxVar, "d is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        List list = this.f24422a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f24422a = list;
                        }
                        list.add(sxxVar);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sxxVar.b_();
        return false;
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // tb.sxx
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        this.b = true;
                        List<sxx> list = this.f24422a;
                        this.f24422a = null;
                        d(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.kzx
    public boolean c(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a35f64", new Object[]{this, sxxVar})).booleanValue();
        }
        wxx.b(sxxVar, "Disposable item is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                List<sxx> list = this.f24422a;
                if (list != null && list.remove(sxxVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(List<sxx> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            ArrayList arrayList = null;
            for (sxx sxxVar : list) {
                try {
                    sxxVar.b_();
                } catch (Throwable th) {
                    uxx.a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw e.a((Throwable) arrayList.get(0));
            }
            throw new a(arrayList);
        }
    }

    @Override // tb.kzx
    public boolean b(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eca1d085", new Object[]{this, sxxVar})).booleanValue();
        }
        if (!c(sxxVar)) {
            return false;
        }
        sxxVar.b_();
        return true;
    }
}
