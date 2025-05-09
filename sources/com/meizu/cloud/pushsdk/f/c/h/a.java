package com.meizu.cloud.pushsdk.f.c.h;

import com.meizu.cloud.pushsdk.e.d.i;
import com.meizu.cloud.pushsdk.f.c.a;
import com.meizu.cloud.pushsdk.f.c.f;
import com.meizu.cloud.pushsdk.f.c.g;
import com.meizu.cloud.pushsdk.f.e.d;
import com.meizu.cloud.pushsdk.f.g.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends com.meizu.cloud.pushsdk.f.c.a {
    private final String s;
    private d t;
    private int u;

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.f.c.h.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RunnableC0284a implements Runnable {
        public RunnableC0284a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((com.meizu.cloud.pushsdk.f.c.a) a.this).r.compareAndSet(false, true)) {
                a.this.d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Callable<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f5865a;

        public b(i iVar) {
            this.f5865a = iVar;
        }

        /* renamed from: a */
        public Integer call() {
            return Integer.valueOf(a.this.a(this.f5865a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Long f5866a;

        public c(Long l) {
            this.f5866a = l;
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(a.this.t.a(this.f5866a.longValue()));
        }
    }

    public a(a.C0283a aVar) {
        super(aVar);
        String simpleName = a.class.getSimpleName();
        this.s = simpleName;
        com.meizu.cloud.pushsdk.f.e.a aVar2 = new com.meizu.cloud.pushsdk.f.e.a(this.c, this.m);
        this.t = aVar2;
        if (!aVar2.a()) {
            this.t = new com.meizu.cloud.pushsdk.f.e.c(this.m);
            com.meizu.cloud.pushsdk.f.g.c.b(simpleName, "init memory store", new Object[0]);
        }
    }

    private LinkedList<Boolean> b(LinkedList<Long> linkedList) {
        boolean z;
        LinkedList<Boolean> linkedList2 = new LinkedList<>();
        LinkedList linkedList3 = new LinkedList();
        Iterator<Long> it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList3.add(com.meizu.cloud.pushsdk.f.c.h.b.a(a(it.next())));
        }
        com.meizu.cloud.pushsdk.f.g.c.a(this.s, "Removal Futures: %s", Integer.valueOf(linkedList3.size()));
        for (int i = 0; i < linkedList3.size(); i++) {
            try {
                z = ((Boolean) ((Future) linkedList3.get(i)).get(5L, TimeUnit.SECONDS)).booleanValue();
            } catch (InterruptedException e) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Removal Future was interrupted: %s", e.getMessage());
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            } catch (ExecutionException e2) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Removal Future failed: %s", e2.getMessage());
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            } catch (TimeoutException e3) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Removal Future had a timeout: %s", e3.getMessage());
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            }
            linkedList2.add(Boolean.valueOf(z));
        }
        return linkedList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (e.d(this.c)) {
            if (this.t.b() > 0) {
                this.u = 0;
                LinkedList<g> a2 = a(a(this.t.c()));
                com.meizu.cloud.pushsdk.f.g.c.c(this.s, "Processing emitter results.", new Object[0]);
                LinkedList<Long> linkedList = new LinkedList<>();
                Iterator<g> it = a2.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    g next = it.next();
                    if (next.b()) {
                        linkedList.addAll(next.a());
                        i += next.a().size();
                    } else {
                        i2 += next.a().size();
                        com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Request sending failed but we will retry later.", new Object[0]);
                    }
                }
                b(linkedList);
                com.meizu.cloud.pushsdk.f.g.c.a(this.s, "Success Count: %s", Integer.valueOf(i));
                com.meizu.cloud.pushsdk.f.g.c.a(this.s, "Failure Count: %s", Integer.valueOf(i2));
                f fVar = this.e;
                if (fVar != null) {
                    if (i2 != 0) {
                        fVar.a(i, i2);
                    } else {
                        fVar.a(i);
                    }
                }
                if (i2 > 0 && i == 0) {
                    if (e.d(this.c)) {
                        com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Ensure collector path is valid: %s", c());
                    }
                    com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Emitter loop stopping: failures.", new Object[0]);
                }
            } else {
                int i3 = this.u;
                if (i3 >= this.l) {
                    com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Emitter loop stopping: empty limit reached.", new Object[0]);
                    this.r.compareAndSet(true, false);
                    f fVar2 = this.e;
                    if (fVar2 != null) {
                        fVar2.a(true);
                        return;
                    }
                    return;
                }
                this.u = i3 + 1;
                String str = this.s;
                com.meizu.cloud.pushsdk.f.g.c.b(str, "Emitter database empty: " + this.u, new Object[0]);
                try {
                    this.p.sleep(this.k);
                } catch (InterruptedException e) {
                    String str2 = this.s;
                    com.meizu.cloud.pushsdk.f.g.c.b(str2, "Emitter thread sleep interrupted: " + e.toString(), new Object[0]);
                }
            }
            d();
            return;
        }
        com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Emitter loop stopping: emitter offline.", new Object[0]);
        this.r.compareAndSet(true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.LinkedList<com.meizu.cloud.pushsdk.f.c.g> a(java.util.LinkedList<com.meizu.cloud.pushsdk.f.c.e> r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Iterator r4 = r10.iterator()
        L_0x0010:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x002c
            java.lang.Object r5 = r4.next()
            com.meizu.cloud.pushsdk.f.c.e r5 = (com.meizu.cloud.pushsdk.f.c.e) r5
            com.meizu.cloud.pushsdk.e.d.i r5 = r5.b()
            java.util.concurrent.Callable r5 = r9.b(r5)
            java.util.concurrent.Future r5 = com.meizu.cloud.pushsdk.f.c.h.b.a(r5)
            r3.add(r5)
            goto L_0x0010
        L_0x002c:
            java.lang.String r4 = r9.s
            int r5 = r3.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r6[r0] = r5
            java.lang.String r5 = "Request Futures: %s"
            com.meizu.cloud.pushsdk.f.g.c.a(r4, r5, r6)
            r4 = 0
        L_0x0040:
            int r5 = r3.size()
            if (r4 >= r5) goto L_0x00c9
            java.lang.Object r5 = r3.get(r4)     // Catch: TimeoutException -> 0x005b, ExecutionException -> 0x005d, InterruptedException -> 0x005f
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5     // Catch: TimeoutException -> 0x005b, ExecutionException -> 0x005d, InterruptedException -> 0x005f
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: TimeoutException -> 0x005b, ExecutionException -> 0x005d, InterruptedException -> 0x005f
            r7 = 5
            java.lang.Object r5 = r5.get(r7, r6)     // Catch: TimeoutException -> 0x005b, ExecutionException -> 0x005d, InterruptedException -> 0x005f
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: TimeoutException -> 0x005b, ExecutionException -> 0x005d, InterruptedException -> 0x005f
            int r5 = r5.intValue()     // Catch: TimeoutException -> 0x005b, ExecutionException -> 0x005d, InterruptedException -> 0x005f
            goto L_0x0091
        L_0x005b:
            r5 = move-exception
            goto L_0x0061
        L_0x005d:
            r5 = move-exception
            goto L_0x0071
        L_0x005f:
            r5 = move-exception
            goto L_0x0081
        L_0x0061:
            java.lang.String r6 = r9.s
            java.lang.String r5 = r5.getMessage()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r5
            java.lang.String r5 = "Request Future had a timeout: %s"
            com.meizu.cloud.pushsdk.f.g.c.b(r6, r5, r7)
            goto L_0x0090
        L_0x0071:
            java.lang.String r6 = r9.s
            java.lang.String r5 = r5.getMessage()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r5
            java.lang.String r5 = "Request Future failed: %s"
            com.meizu.cloud.pushsdk.f.g.c.b(r6, r5, r7)
            goto L_0x0090
        L_0x0081:
            java.lang.String r6 = r9.s
            java.lang.String r5 = r5.getMessage()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r5
            java.lang.String r5 = "Request Future was interrupted: %s"
            com.meizu.cloud.pushsdk.f.g.c.b(r6, r5, r7)
        L_0x0090:
            r5 = -1
        L_0x0091:
            java.lang.Object r6 = r10.get(r4)
            com.meizu.cloud.pushsdk.f.c.e r6 = (com.meizu.cloud.pushsdk.f.c.e) r6
            boolean r6 = r6.c()
            if (r6 == 0) goto L_0x00b0
            com.meizu.cloud.pushsdk.f.c.g r5 = new com.meizu.cloud.pushsdk.f.c.g
            java.lang.Object r6 = r10.get(r4)
            com.meizu.cloud.pushsdk.f.c.e r6 = (com.meizu.cloud.pushsdk.f.c.e) r6
            java.util.LinkedList r6 = r6.a()
            r5.<init>(r1, r6)
            r2.add(r5)
            goto L_0x00c6
        L_0x00b0:
            com.meizu.cloud.pushsdk.f.c.g r6 = new com.meizu.cloud.pushsdk.f.c.g
            boolean r5 = r9.a(r5)
            java.lang.Object r7 = r10.get(r4)
            com.meizu.cloud.pushsdk.f.c.e r7 = (com.meizu.cloud.pushsdk.f.c.e) r7
            java.util.LinkedList r7 = r7.a()
            r6.<init>(r5, r7)
            r2.add(r6)
        L_0x00c6:
            int r4 = r4 + r1
            goto L_0x0040
        L_0x00c9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.f.c.h.a.a(java.util.LinkedList):java.util.LinkedList");
    }

    private Callable<Integer> b(i iVar) {
        return new b(iVar);
    }

    private Callable<Boolean> a(Long l) {
        return new c(l);
    }

    @Override // com.meizu.cloud.pushsdk.f.c.a
    public void b() {
        com.meizu.cloud.pushsdk.f.c.h.b.a(new RunnableC0284a());
    }

    @Override // com.meizu.cloud.pushsdk.f.c.a
    public void a(com.meizu.cloud.pushsdk.f.b.a aVar, boolean z) {
        this.t.a(aVar);
        String str = this.s;
        com.meizu.cloud.pushsdk.f.g.c.b(str, "isRunning " + this.r + " attemptEmit " + z, new Object[0]);
        if (!z) {
            try {
                this.p.sleep(1L);
            } catch (InterruptedException e) {
                String str2 = this.s;
                com.meizu.cloud.pushsdk.f.g.c.b(str2, "Emitter add thread sleep interrupted: " + e.toString(), new Object[0]);
            }
        }
        if (this.r.compareAndSet(false, true)) {
            d();
        }
    }
}
