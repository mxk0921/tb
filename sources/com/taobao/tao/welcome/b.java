package com.taobao.tao.welcome;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.a;
import tb.h1k;
import tb.i1k;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.tao.welcome.a c;
    public com.taobao.tao.welcome.a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.tao.welcome.a.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbbb0a8", new Object[]{this, new Integer(i)});
                return;
            }
            b.this.c.dismiss();
            b.b(b.this);
        }

        @Override // com.taobao.tao.welcome.a.d
        public void onPositive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82ab057f", new Object[]{this});
                return;
            }
            b.this.c.dismiss();
            b.this.f12893a.onPositive();
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.welcome.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0732b implements a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0732b() {
        }

        @Override // com.taobao.tao.welcome.a.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbbb0a8", new Object[]{this, new Integer(i)});
                return;
            }
            b.this.d.dismiss();
            b.this.f12893a.a(i);
        }

        @Override // com.taobao.tao.welcome.a.d
        public void onPositive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82ab057f", new Object[]{this});
                return;
            }
            b.this.d.dismiss();
            b.this.f12893a.onPositive();
        }
    }

    static {
        t2o.a(734003237);
    }

    public b(Activity activity, a.d dVar) {
        super(activity, dVar);
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5ac428", new Object[]{bVar});
        } else {
            bVar.d();
        }
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/ProvisionPlan3");
    }

    @Override // com.taobao.tao.welcome.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("298508db", new Object[]{this});
        } else {
            c();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903293e2", new Object[]{this});
            return;
        }
        if (this.c == null) {
            h1k h1kVar = new h1k(this.b);
            this.c = h1kVar;
            h1kVar.j(new a());
        }
        this.c.show();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6f4280", new Object[]{this});
            return;
        }
        if (this.d == null) {
            i1k i1kVar = new i1k(this.b);
            this.d = i1kVar;
            i1kVar.j(new C0732b());
        }
        this.d.show();
    }
}
