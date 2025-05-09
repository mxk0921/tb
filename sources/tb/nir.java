package tb;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.mir;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nir implements IMediaPlayer.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24761a;
    public final qgi b;
    public final mir.a c;
    public final ywg d;
    public final Handler e;
    public final Runnable f = new a();
    public final b g;
    public final String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nir.a(nir.this).S(nir.this);
            nir.b(nir.this);
            if (nir.c(nir.this) != null) {
                nir.c(nir.this).b(nir.d(nir.this));
            }
            if (nir.e(nir.this) != null) {
                nir.e(nir.this).a(nir.this);
            }
            l6s.a("TBLVObjectSharedTask", "onRelease playContextKey = " + nir.d(nir.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(nir nirVar);
    }

    static {
        t2o.a(779093676);
        t2o.a(806356441);
    }

    public nir(Context context, String str, jgi jgiVar, Handler handler, mir.a aVar, b bVar) {
        qgi qgiVar = new qgi();
        this.b = qgiVar;
        String f = f(str, jgiVar);
        this.h = f;
        qgiVar.T(jgiVar, context, f);
        qgiVar.f(this);
        this.d = qgiVar.Q();
        this.f24761a = str;
        this.c = aVar;
        this.e = handler;
        this.g = bVar;
    }

    public static /* synthetic */ qgi a(nir nirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qgi) ipChange.ipc$dispatch("662dd11d", new Object[]{nirVar});
        }
        return nirVar.b;
    }

    public static /* synthetic */ void b(nir nirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe5aff3", new Object[]{nirVar});
        } else {
            nirVar.g();
        }
    }

    public static /* synthetic */ mir.a c(nir nirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mir.a) ipChange.ipc$dispatch("3b4ee642", new Object[]{nirVar});
        }
        return nirVar.c;
    }

    public static /* synthetic */ String d(nir nirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a19ec60f", new Object[]{nirVar});
        }
        return nirVar.f24761a;
    }

    public static /* synthetic */ b e(nir nirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7e8c6141", new Object[]{nirVar});
        }
        return nirVar.g;
    }

    public final String f(String str, jgi jgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fd3d896", new Object[]{this, str, jgiVar});
        }
        if (jgiVar == null) {
            return null;
        }
        ufi a2 = yx4.a(null, jgiVar.d());
        if (!TextUtils.isEmpty(a2.b)) {
            return a2.b;
        }
        return str;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171b1282", new Object[]{this});
        } else if (this.b != null) {
            tfi.i().e(this.b);
            this.b.P();
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fae29dbf", new Object[]{this});
        }
        return this.f24761a;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39ce5ce2", new Object[]{this})).booleanValue();
        }
        if (this.b == null || this.f24761a == null || this.c == null || this.e == null) {
            return false;
        }
        return true;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed145bd7", new Object[]{this});
        }
        if (!i()) {
            return null;
        }
        l6s.a("TBLVObjectSharedTask", "start playContextKey = " + this.f24761a);
        this.e.postDelayed(this.f, ejr.a());
        return tfi.i().c(this.b, this.d, this.h);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (i() && (obj instanceof String) && obj.equals(tfi.MOCK_MEDIA_INFO_WHAT_RECYCLED)) {
            this.c.a(this.f24761a);
            this.b.S(this);
            g();
            this.e.removeCallbacks(this.f);
            b bVar = this.g;
            if (bVar != null) {
                bVar.a(this);
            }
            l6s.a("TBLVObjectSharedTask", "onReuse playContextKey = " + this.f24761a);
        }
        return false;
    }
}
