package tb;

import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f32784a;
        public final /* synthetic */ b b;

        public a(List list, b bVar) {
            this.f32784a = list;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (Object obj : this.f32784a) {
                this.b.a(obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b<E> {
        void a(E e);

        boolean b(E e);
    }

    static {
        t2o.a(79691787);
    }

    public static <E> void a(List<E> list, b<E> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d2aa791", new Object[]{list, bVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AURATraceUtil.a(3, "扩展点线程处理");
        for (E e : list) {
            if (bVar.b(e)) {
                arrayList2.add(e);
            } else {
                arrayList.add(e);
            }
        }
        AURATraceUtil.b(3);
        try {
            Iterator<E> it = arrayList2.iterator();
            while (it.hasNext()) {
                bVar.a(it.next());
            }
            cn.c(new ql(0, new a(arrayList, bVar)));
        } catch (Throwable th) {
            th.a(th.getMessage());
            ck.g().e("AURAExtensionSchedule", th.getMessage());
        }
    }
}
