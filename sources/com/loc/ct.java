package com.loc;

import com.loc.cs;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ct {

    /* renamed from: a  reason: collision with root package name */
    protected ThreadPoolExecutor f5637a;
    private ConcurrentHashMap<cs, Future<?>> c = new ConcurrentHashMap<>();
    protected cs.a b = new cs.a() { // from class: com.loc.ct.1
        @Override // com.loc.cs.a
        public final void a(cs csVar) {
            ct.this.a(csVar);
        }
    };

    private synchronized boolean c(cs csVar) {
        boolean z;
        try {
            z = this.c.containsKey(csVar);
        } catch (Throwable th) {
            av.b(th, "TPool", "contain");
            th.printStackTrace();
            z = false;
        }
        return z;
    }

    public final synchronized void a(cs csVar) {
        try {
            this.c.remove(csVar);
        } catch (Throwable th) {
            av.b(th, "TPool", "removeQueue");
            th.printStackTrace();
        }
    }

    public final Executor b() {
        return this.f5637a;
    }

    private synchronized void a(cs csVar, Future<?> future) {
        try {
            this.c.put(csVar, future);
        } catch (Throwable th) {
            av.b(th, "TPool", "addQueue");
            th.printStackTrace();
        }
    }

    public final void b(cs csVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (!c(csVar) && (threadPoolExecutor = this.f5637a) != null && !threadPoolExecutor.isShutdown()) {
            csVar.e = this.b;
            try {
                Future<?> submit = this.f5637a.submit(csVar);
                if (submit != null) {
                    a(csVar, submit);
                }
            } catch (RejectedExecutionException e) {
                av.b(e, "TPool", "addTask");
            }
        }
    }
}
