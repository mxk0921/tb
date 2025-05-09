package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c extends com.taobao.monitor.impl.trace.a<AbstractC0626c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements a.d<AbstractC0626c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11095a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;

        public a(c cVar, String str, int i, long j) {
            this.f11095a = str;
            this.b = i;
            this.c = j;
        }

        /* renamed from: b */
        public void a(AbstractC0626c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e926a88", new Object[]{this, cVar});
            } else {
                cVar.s(this.f11095a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements a.d<AbstractC0626c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11096a;

        public b(c cVar, String str) {
            this.f11096a = str;
        }

        /* renamed from: b */
        public void a(AbstractC0626c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e926a88", new Object[]{this, cVar});
            } else {
                cVar.i(this.f11096a);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.monitor.impl.trace.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface AbstractC0626c {
        void F(float f, int i, int i2);

        void J(String str);

        void i(String str);

        void s(String str, int i, long j);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/trace/BatteryDispatcher");
    }

    public void e(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d77c72", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        Iterator it = ((ArrayList) this.f11091a).iterator();
        while (it.hasNext()) {
            ((AbstractC0626c) it.next()).F(f, i, i2);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbfef539", new Object[]{this, str});
            return;
        }
        Iterator it = ((ArrayList) this.f11091a).iterator();
        while (it.hasNext()) {
            ((AbstractC0626c) it.next()).J(str);
        }
    }

    public void g(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2363ef", new Object[]{this, str, new Integer(i), new Long(j)});
        } else {
            d(new a(this, str, i, j));
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fe35c7", new Object[]{this, str});
        } else {
            d(new b(this, str));
        }
    }
}
