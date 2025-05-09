package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbicontext.ThreadMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class pfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ArrayList<qfr>> f26065a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qfr f26066a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public a(qfr qfrVar, String str, Object obj) {
            this.f26066a = qfrVar;
            this.b = str;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f26066a.onEvent(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qfr f26067a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public b(qfr qfrVar, String str, Object obj) {
            this.f26067a = qfrVar;
            this.b = str;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f26067a.onEvent(this.b, this.c);
            }
        }
    }

    static {
        t2o.a(803209249);
    }

    public final void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4ef407", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "name");
        ArrayList<qfr> arrayList = this.f26065a.get(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<qfr> arrayList2 = this.f26065a.get(str);
            ckf.d(arrayList2);
            Iterator<qfr> it = arrayList2.iterator();
            while (it.hasNext()) {
                qfr next = it.next();
                if (next.a() == ThreadMode.MainThread) {
                    d(next, str, obj);
                } else if (next.a() == ThreadMode.SubThread) {
                    c(next, str, obj);
                } else {
                    next.onEvent(str, obj);
                }
            }
        }
    }

    public final void b(String str, qfr qfrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5216fc", new Object[]{this, str, qfrVar});
            return;
        }
        ckf.g(str, "eventName");
        ckf.g(qfrVar, "handler");
        if (this.f26065a.get(str) == null) {
            this.f26065a.put(str, new ArrayList<>());
        }
        ArrayList<qfr> arrayList = this.f26065a.get(str);
        ckf.d(arrayList);
        if (!arrayList.contains(qfrVar)) {
            ArrayList<qfr> arrayList2 = this.f26065a.get(str);
            ckf.d(arrayList2);
            arrayList2.add(qfrVar);
        }
    }

    public final void c(qfr qfrVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f85ec21", new Object[]{this, qfrVar, str, obj});
        } else if (!ckf.b(Looper.myLooper(), Looper.getMainLooper())) {
            qfrVar.onEvent(str, obj);
        } else {
            rfr.INSTANCE.b(new a(qfrVar, str, obj));
        }
    }

    public final void d(qfr qfrVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3507e9", new Object[]{this, qfrVar, str, obj});
        } else if (ckf.b(Looper.myLooper(), Looper.getMainLooper())) {
            qfrVar.onEvent(str, obj);
        } else {
            rfr.INSTANCE.c(new b(qfrVar, str, obj));
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f26065a.clear();
        }
    }
}
