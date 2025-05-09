package com.taobao.android.litecreator.widgets;

import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.widgets.LCBubble;
import java.lang.ref.WeakReference;
import java.util.PriorityQueue;
import java.util.Queue;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c b;
    public boolean d;
    public final Queue<c> c = new PriorityQueue();
    public final LCBubble.j e = new C0445a();

    /* renamed from: a  reason: collision with root package name */
    public final b f8346a = new b(this);

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.litecreator.widgets.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class C0445a implements LCBubble.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0445a() {
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.j
        public void a(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edabee77", new Object[]{this, lCBubble});
            } else {
                a.b(a.this);
            }
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.j
        public void b(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a63d3d9a", new Object[]{this, lCBubble});
            }
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.j
        public void c(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5fc6f2a", new Object[]{this, lCBubble});
                return;
            }
            a.b(a.this);
            a.a(a.this, false);
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.j
        public void d(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd2fbcc1", new Object[]{this, lCBubble});
            } else {
                a.a(a.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<a> f8348a;

        static {
            t2o.a(511705696);
        }

        public b(a aVar) {
            this.f8348a = new WeakReference<>(aVar);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/widgets/LCBubbleManager$BubbleHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            a aVar = this.f8348a.get();
            if (aVar != null) {
                c cVar = (c) a.c(aVar).peek();
                if (a.d(aVar) == null) {
                    if (cVar != null) {
                        a.c(aVar).remove(cVar);
                        a.e(aVar, cVar);
                        a.a(aVar, true);
                        cVar.f8349a.l(cVar.b);
                        removeMessages(1);
                    }
                } else if (cVar != null && cVar.b.c < a.d(aVar).b.c) {
                    a.d(aVar).f8349a.j();
                }
                super.handleMessage(message);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements Comparable<c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public LCBubble f8349a;
        public LCBubble.h b;

        static {
            t2o.a(511705697);
        }

        public c(LCBubble lCBubble, LCBubble.h hVar) {
            this.f8349a = lCBubble;
            this.b = hVar;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c22a8e55", new Object[]{this, cVar})).intValue();
            }
            if (this == cVar) {
                return 0;
            }
            return this.b.c - cVar.b.c;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.f8349a == this.f8349a && cVar.b == this.b) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(511705693);
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aaac296", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.d = z;
        return z;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ba43c1", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ Queue c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("c86cfba2", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ c d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1ec4e93c", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ c e(a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("440d5fdd", new Object[]{aVar, cVar});
        }
        aVar.b = cVar;
        return cVar;
    }

    public void f(LCBubble lCBubble, LCBubble.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13eee086", new Object[]{this, lCBubble, hVar});
            return;
        }
        c cVar = new c(lCBubble, hVar);
        lCBubble.h(this.e);
        ((PriorityQueue) this.c).add(cVar);
        if (!this.d && !this.f8346a.hasMessages(1)) {
            this.f8346a.sendEmptyMessage(1);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("220c5017", new Object[]{this});
            return;
        }
        this.b = null;
        this.f8346a.sendEmptyMessage(1);
    }
}
