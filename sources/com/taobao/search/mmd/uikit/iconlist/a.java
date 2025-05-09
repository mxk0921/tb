package com.taobao.search.mmd.uikit.iconlist;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import tb.cy0;
import tb.dki;
import tb.iy4;
import tb.nd2;
import tb.p1m;
import tb.s0m;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public String c;
    public p1m d;
    public final d g;
    public final int h;
    public final int i;
    public final int j;
    public boolean k;

    /* renamed from: a  reason: collision with root package name */
    public int f11551a = 0;
    public int e = 0;
    public boolean f = true;
    public final s8d<SuccPhenixEvent> l = new C0652a();
    public final s8d<dki> m = new b();
    public final s8d<FailPhenixEvent> n = new c();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.search.mmd.uikit.iconlist.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0652a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0652a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            String url = succPhenixEvent.getUrl();
            a aVar = a.this;
            aVar.e = 3;
            if (url != null && (str = aVar.c) != null && !url.startsWith(str)) {
                return true;
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable == null || (drawable.getBitmap() == null && !(drawable instanceof cy0))) {
                a.a(a.this, null);
            } else {
                boolean isIntermediate = succPhenixEvent.isIntermediate();
                a.a(a.this, drawable);
                if (!isIntermediate) {
                    succPhenixEvent.getTicket().d(true);
                    a.this.e = 2;
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<dki> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(dki dkiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("72d3ebbb", new Object[]{this, dkiVar})).booleanValue();
            }
            a.a(a.this, null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            int resultCode = failPhenixEvent.getResultCode();
            if (resultCode == -1 || resultCode == 404) {
                a.this.f = true;
            } else {
                a.this.f = false;
            }
            failPhenixEvent.getTicket().d(true);
            a.a(a.this, null);
            a.this.e = 3;
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        boolean isLayoutRequested();

        void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str);
    }

    static {
        t2o.a(815792566);
    }

    public a(Context context, d dVar, int i, int i2, int i3) {
        this.g = dVar;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    public static /* synthetic */ void a(a aVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253cf771", new Object[]{aVar, bitmapDrawable});
        } else {
            aVar.d(bitmapDrawable);
        }
    }

    public void b() {
        p1m p1mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.e != 2 && (p1mVar = this.d) != null) {
            p1mVar.a();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f37cd64", new Object[]{this});
        } else if (this.e == 2 || this.h <= 0 || this.i <= 0) {
        } else {
            if (TextUtils.isEmpty(this.b)) {
                s0m.B().f(this.d);
                d(null);
                return;
            }
            p1m p1mVar = this.d;
            if (p1mVar != null && !p1mVar.f(this.b)) {
                this.d.a();
            }
            if (!this.f && this.f11551a != 1 && this.e == 0) {
                this.e = 1;
                this.c = this.b;
                PhenixCreator failListener = s0m.B().T(this.c).memOnly(false).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "8920").succListener(this.l).limitSize(null, this.h, this.i).memCacheMissListener(this.m).failListener(this.n);
                if (this.k) {
                    failListener.bitmapProcessors(new iy4());
                }
                p1m fetch = failListener.fetch();
                this.d = fetch;
                fetch.e(this.b);
            }
        }
    }

    public final void d(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ffad8d", new Object[]{this, bitmapDrawable});
            return;
        }
        d dVar = this.g;
        if (dVar != null) {
            dVar.onDrawableLoaded(bitmapDrawable, this.j, this.b);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.f11551a = 1;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (this.f11551a == 1) {
            this.f11551a = 0;
            if (this.e != 2) {
                this.e = 0;
                c();
            }
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cea6d1", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        if (!TextUtils.equals(this.b, str)) {
            this.f = false;
        }
        this.b = str;
        this.e = 0;
        d dVar = this.g;
        if (dVar != null && !dVar.isLayoutRequested()) {
            c();
        }
    }
}
