package tb;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.text.Regex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f17369a = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    public final Set<String> b = new LinkedHashSet();
    public final yt c;
    public final a d;
    public boolean e;
    public d1a<xhv> f;
    public final ContentResolver g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Regex f17370a;

        public a(Handler handler) {
            super(handler);
            this.f17370a = new Regex(cwo.a(cwo.this) + "/[0-9]+");
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/screen/observer/ScreenShotObserver$contentObserver$1");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            String uri2;
            d1a<xhv> e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
            } else if (uri != null && (uri2 = uri.toString()) != null && this.f17370a.matches(uri2) && cwo.b(cwo.this).add(uri2) && (e = cwo.this.e()) != null) {
                e.invoke();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements bkc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bkc
        public void onBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            } else {
                cwo.d(cwo.this);
            }
        }

        @Override // tb.bkc
        public void onForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
            } else {
                cwo.c(cwo.this);
            }
        }
    }

    static {
        t2o.a(130023433);
    }

    public cwo(ContentResolver contentResolver) {
        yt ytVar;
        ckf.g(contentResolver, "contentResolver");
        this.g = contentResolver;
        sgb b2 = cjf.INSTANCE.b();
        if (b2 != null) {
            ytVar = b2.a(new b());
        } else {
            ytVar = null;
        }
        this.c = ytVar;
        this.d = new a(null);
    }

    public static final /* synthetic */ Uri a(cwo cwoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("99896f21", new Object[]{cwoVar});
        }
        return cwoVar.f17369a;
    }

    public static final /* synthetic */ Set b(cwo cwoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("58abeb8", new Object[]{cwoVar});
        }
        return cwoVar.b;
    }

    public static final /* synthetic */ void c(cwo cwoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f39c433", new Object[]{cwoVar});
        } else {
            cwoVar.f();
        }
    }

    public static final /* synthetic */ void d(cwo cwoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b3bfcc", new Object[]{cwoVar});
        } else {
            cwoVar.j();
        }
    }

    public final d1a<xhv> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("eb3b6351", new Object[]{this});
        }
        return this.f;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d66fd3", new Object[]{this});
        } else {
            this.g.registerContentObserver(this.f17369a, true, this.d);
        }
    }

    public final void g(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae42647", new Object[]{this, d1aVar});
        } else {
            this.f = d1aVar;
        }
    }

    public final synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.e) {
            f();
            yt ytVar = this.c;
            if (ytVar != null) {
                ytVar.b();
            }
            this.e = true;
        }
    }

    public final synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.e) {
            yt ytVar = this.c;
            if (ytVar != null) {
                ytVar.c();
            }
            j();
            this.b.clear();
            this.e = false;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b099a", new Object[]{this});
        } else {
            this.g.unregisterContentObserver(this.d);
        }
    }
}
