package com.taobao.monitor.impl.trace;

import android.app.Activity;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l extends com.taobao.monitor.impl.trace.a<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements a.d<c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f11125a;
        public final /* synthetic */ KeyEvent b;
        public final /* synthetic */ long c;

        public a(l lVar, Activity activity, KeyEvent keyEvent, long j) {
            this.f11125a = activity;
            this.b = keyEvent;
            this.c = j;
        }

        /* renamed from: b */
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff169dfd", new Object[]{this, cVar});
            } else {
                cVar.A(this.f11125a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements a.d<c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f11126a;
        public final /* synthetic */ int b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ long e;

        public b(l lVar, Activity activity, int i, float f, float f2, long j) {
            this.f11126a = activity;
            this.b = i;
            this.c = f;
            this.d = f2;
            this.e = j;
        }

        /* renamed from: b */
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff169dfd", new Object[]{this, cVar});
            } else {
                cVar.o(this.f11126a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void A(Activity activity, KeyEvent keyEvent, long j);

        void o(Activity activity, int i, float f, float f2, long j);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/trace/WindowEventDispatcher");
    }

    public void e(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c8321", new Object[]{this, activity, keyEvent, new Long(j)});
        } else {
            d(new a(this, activity, keyEvent, j));
        }
    }

    public void f(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747a3d9a", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else {
            d(new b(this, activity, i, f, f2, j));
        }
    }
}
