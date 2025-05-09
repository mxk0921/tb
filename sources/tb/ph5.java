package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.lc6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ph5 implements lc6.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PERIOD_COUNT = 2;
    public int d;
    public CopyOnWriteArrayList<oh5> c = new CopyOnWriteArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, List<WeakReference<avb>>> f26091a = new ConcurrentHashMap();
    public Map<String, List<avb>> b = new HashMap();

    static {
        t2o.a(444597503);
        t2o.a(444596937);
    }

    public ph5() {
        lc6.e().f(this);
    }

    private void b(List<WeakReference<avb>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8311e2ec", new Object[]{this, list});
            return;
        }
        Iterator<WeakReference<avb>> it = list.iterator();
        if (it != null) {
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                WeakReference<avb> next = it.next();
                if (next == null) {
                    it.remove();
                } else if (next.get() == null) {
                    arrayList.add(next);
                }
            }
            list.removeAll(arrayList);
        }
    }

    @Override // tb.lc6.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482f6a75", new Object[]{this});
            return;
        }
        int i = this.d;
        if (i == 2) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                d(this.c.get(i2));
            }
            this.c.clear();
            this.d = 0;
            return;
        }
        this.d = i + 1;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92cf56c", new Object[]{this});
        } else if (zg5.O2()) {
            this.f26091a.clear();
        } else {
            this.b.clear();
        }
    }

    public void d(oh5 oh5Var) {
        List<avb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b25a882", new Object[]{this, oh5Var});
        } else if (zg5.O2()) {
            f(oh5Var);
        } else if (oh5Var != null && !TextUtils.isEmpty(oh5Var.b) && (list = this.b.get(oh5Var.b)) != null) {
            if (zg5.d4()) {
                Iterator<avb> it = list.iterator();
                if (it != null) {
                    while (it.hasNext()) {
                        avb next = it.next();
                        if (next != null) {
                            next.a(oh5Var);
                        }
                    }
                    return;
                }
                return;
            }
            for (avb avbVar : list) {
                avbVar.a(oh5Var);
            }
        }
    }

    public void e(oh5 oh5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eea38f3", new Object[]{this, oh5Var});
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            try {
                if (this.c.get(i).a(oh5Var)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        this.c.add(oh5Var);
    }

    public void f(oh5 oh5Var) {
        List<WeakReference<avb>> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892518ea", new Object[]{this, oh5Var});
        } else if (oh5Var != null && !TextUtils.isEmpty(oh5Var.b) && (list = this.f26091a.get(oh5Var.b)) != null) {
            if (zg5.d4()) {
                Iterator<WeakReference<avb>> it = list.iterator();
                if (it != null) {
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        WeakReference<avb> next = it.next();
                        if (next == null) {
                            it.remove();
                        } else {
                            avb avbVar = next.get();
                            if (avbVar == null) {
                                arrayList.add(next);
                            } else {
                                avbVar.a(oh5Var);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                    return;
                }
                return;
            }
            for (WeakReference<avb> weakReference : list) {
                if (!(weakReference == null || weakReference.get() == null)) {
                    weakReference.get().a(oh5Var);
                }
            }
        }
    }

    public void g(avb avbVar, String str) {
        List<avb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68af2976", new Object[]{this, avbVar, str});
        } else if (zg5.O2()) {
            h(avbVar, str);
        } else if (!TextUtils.isEmpty(str) && avbVar != null) {
            List<avb> list2 = this.b.get(str);
            if (list2 == null) {
                if (zg5.o3()) {
                    list = new CopyOnWriteArrayList<>();
                } else {
                    list = new ArrayList<>();
                }
                list.add(avbVar);
                this.b.put(str, list);
                return;
            }
            list2.add(avbVar);
        }
    }

    public void h(avb avbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87da18e", new Object[]{this, avbVar, str});
        } else if (!TextUtils.isEmpty(str) && avbVar != null) {
            List<WeakReference<avb>> list = this.f26091a.get(str);
            if (list == null) {
                if (zg5.o3()) {
                    list = new CopyOnWriteArrayList<>();
                } else {
                    list = new ArrayList<>();
                }
                list.add(new WeakReference<>(avbVar));
                this.f26091a.put(str, list);
            } else {
                list.add(new WeakReference<>(avbVar));
            }
            b(list);
        }
    }

    public void i(avb avbVar, String str) {
        List<avb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ba872f", new Object[]{this, avbVar, str});
        } else if (zg5.O2()) {
            j(avbVar, str);
        } else if (!TextUtils.isEmpty(str) && avbVar != null && (list = this.b.get(str)) != null) {
            list.remove(avbVar);
        }
    }

    public void j(avb avbVar, String str) {
        List<WeakReference<avb>> list;
        Iterator<WeakReference<avb>> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc17ac7", new Object[]{this, avbVar, str});
        } else if (!TextUtils.isEmpty(str) && avbVar != null && (list = this.f26091a.get(str)) != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                WeakReference<avb> next = it.next();
                if (next != null && next.get() == avbVar) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
