package com.taobao.android.behavir.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.m02;
import tb.om8;
import tb.t2o;
import tb.u82;
import tb.xzh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class a extends m02 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(404750427);
        }

        public a() {
            super("ucp");
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/ThreadUtil$SafeRunnable");
        }

        @Override // tb.m02
        public final void c(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
            } else {
                om8.d("postRunnable", exc.getMessage(), exc);
            }
        }
    }

    static {
        t2o.a(404750426);
    }

    public static void a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2624bfde", new Object[]{aVar, new Long(j)});
        } else {
            u82.e(aVar, j);
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa171e9", new Object[]{aVar});
        } else {
            u82.g(aVar);
        }
    }

    public static void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998f63b8", new Object[]{aVar});
        } else {
            u82.h(aVar);
        }
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46435e46", new Object[]{runnable});
        } else {
            u82.j(runnable);
        }
    }

    public static void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d8af33", new Object[]{aVar});
        } else {
            f(aVar, -1L);
        }
    }

    public static void f(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263dadf1", new Object[]{aVar, new Long(j)});
        } else if (j >= 0) {
            xzh.a().postDelayed(aVar, j);
        } else if (Utils.c()) {
            aVar.run();
        } else {
            xzh.a().post(aVar);
        }
    }
}
