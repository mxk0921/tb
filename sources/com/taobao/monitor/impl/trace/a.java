package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.jc8;
import tb.w9a;
import tb.zzb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a<LISTENER> implements zzb<LISTENER> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<LISTENER> f11091a = new ArrayList();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.monitor.impl.trace.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class RunnableC0624a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f11092a;

        public RunnableC0624a(Object obj) {
            this.f11092a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!((ArrayList) a.this.f11091a).contains(this.f11092a)) {
                ((ArrayList) a.this.f11091a).add(this.f11092a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f11093a;

        public b(Object obj) {
            this.f11093a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((ArrayList) a.this.f11091a).remove(this.f11093a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f11094a;

        public c(d dVar) {
            this.f11094a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = ((ArrayList) a.this.f11091a).iterator();
            while (it.hasNext()) {
                this.f11094a.a(it.next());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d<LISTENER> {
        void a(LISTENER listener);
    }

    @Override // tb.zzb
    public final void addListener(LISTENER listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbb7b58", new Object[]{this, listener});
        } else if (!(this instanceof jc8) && listener != null) {
            c(new RunnableC0624a(listener));
        }
    }

    public final void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d03401", new Object[]{this, runnable});
        } else {
            w9a.g().f().post(runnable);
        }
    }

    public final void d(d<LISTENER> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57b9925", new Object[]{this, dVar});
        } else {
            c(new c(dVar));
        }
    }

    @Override // tb.zzb
    public final void removeListener(LISTENER listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8064bfb", new Object[]{this, listener});
        } else if (!(this instanceof jc8) && listener != null) {
            c(new b(listener));
        }
    }
}
