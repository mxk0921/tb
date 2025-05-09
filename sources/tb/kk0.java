package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.etao.feimagesearch.capture.scan.ScanMode;
import com.etao.feimagesearch.capture.scan.irp.ImgChannelDetectManager;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import java.util.Objects;
import tb.fme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f f22719a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements fme.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f22720a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Rect c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ CaptureManager h;

        public a(Activity activity, String str, Rect rect, boolean z, int i, String str2, String str3, CaptureManager captureManager) {
            this.f22720a = activity;
            this.b = str;
            this.c = rect;
            this.d = z;
            this.e = i;
            this.f = str2;
            this.g = str3;
            this.h = captureManager;
        }

        @Override // tb.fme.b
        public void a(Bitmap bitmap, long j) {
            String str;
            PhotoFrom.Values values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19d9a641", new Object[]{this, bitmap, new Long(j)});
                return;
            }
            agh.h("_scancode_AlbumPreprocessor", "onSuccess");
            if (tro.c(this.f22720a)) {
                str = ScanFromEnum.SYS_ALBUM.getScanFrom();
            } else {
                str = ScanFromEnum.PLT_ALBUM.getScanFrom();
            }
            String str2 = this.b;
            KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(str2, str);
            kakaLibImageWrapper.n(str2);
            kakaLibImageWrapper.k(bitmap);
            kakaLibImageWrapper.p(bitmap.getWidth());
            kakaLibImageWrapper.l(bitmap.getHeight());
            kakaLibImageWrapper.m(this.f22720a);
            kakaLibImageWrapper.g = this.c;
            if (this.d) {
                values = PhotoFrom.Values.OUTER_ALBUM_LOCAL;
            } else {
                values = PhotoFrom.Values.ALBUM;
            }
            f fVar = new f(this.b, bitmap, this.e, values, 1, this.f, kakaLibImageWrapper);
            kk0.a(kk0.this, kakaLibImageWrapper, this.e, values, "a2141.7631739", this.g, fVar);
            kk0.c(kk0.this, fVar);
            agh.h("_scancode_AlbumPreprocessor", "cache result");
            if (this.h.F()) {
                kk0.d(kk0.this);
            }
            if (this.h.E()) {
                kk0.this.f();
            }
            if (this.h.H()) {
                kk0.this.h();
            }
        }

        @Override // tb.fme.b
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            agh.r("IrpPipLine", "_scancode_AlbumPreprocessor", "onFail: errorCode " + str + ", errorMsg " + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements utm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qu1 f22721a;

        public b(qu1 qu1Var) {
            this.f22721a = qu1Var;
        }

        @Override // tb.utm
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
            }
        }

        @Override // tb.utm
        public void onPrepareSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                return;
            }
            this.f22721a.h(this);
            try {
                if (kk0.b(kk0.this) != null) {
                    agh.h("_scancode_AlbumPreprocessor", "asyncDetectFace: onPrepareSuccess ".concat(this.f22721a.getClass().getSimpleName()));
                    if (hx8.j().f(kk0.b(kk0.this).a(), null)) {
                        kk0.b(kk0.this).h(kk0.b(kk0.this).b() | 16);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.etao.feimagesearch.capture.scan.b c;
        public final /* synthetic */ f d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, com.etao.feimagesearch.capture.scan.b bVar, f fVar) {
            super(str);
            this.c = bVar;
            this.d = fVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/album/AlbumPreprocessor$3");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            lso r = this.c.r();
            if (r != null && r.d() != null && r.d().length != 0) {
                this.d.getClass();
                zmf.g().a(this.c, r);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements utm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.utm
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
            } else {
                ImgChannelDetectManager.Companion.b().i(this);
            }
        }

        @Override // tb.utm
        public void onPrepareSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                return;
            }
            ImgChannelDetectManager.a aVar = ImgChannelDetectManager.Companion;
            aVar.b().i(this);
            if (kk0.b(kk0.this) != null) {
                agh.h("_scancode_AlbumPreprocessor", "asyncDetectChannel: onPrepareSuccess");
                try {
                    aVar.b().e(new oi3(kk0.b(kk0.this).a(), kk0.b(kk0.this).g()));
                    kk0.b(kk0.this).h(kk0.b(kk0.this).b() | 256);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements utm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.utm
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
            } else {
                hre.INSTANCE.j(this);
            }
        }

        @Override // tb.utm
        public void onPrepareSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                return;
            }
            hre hreVar = hre.INSTANCE;
            hreVar.j(this);
            if (kk0.b(kk0.this) != null) {
                agh.h("_scancode_AlbumPreprocessor", "asyncFeatureExtract: onPrepareSuccess");
                try {
                    hreVar.f(new y39(kk0.b(kk0.this).a(), null));
                    kk0.b(kk0.this).h(kk0.b(kk0.this).b() | 261);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class f extends ak0 {
        static {
            t2o.a(481296460);
        }

        public f(String str, Bitmap bitmap, int i, PhotoFrom.Values values, int i2, String str2, KakaLibImageWrapper kakaLibImageWrapper) {
            super(str, bitmap, i, values, i2, str2, kakaLibImageWrapper);
        }
    }

    static {
        t2o.a(481296454);
    }

    public static /* synthetic */ void a(kk0 kk0Var, KakaLibImageWrapper kakaLibImageWrapper, int i, PhotoFrom.Values values, String str, String str2, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45319a87", new Object[]{kk0Var, kakaLibImageWrapper, new Integer(i), values, str, str2, fVar});
        } else {
            kk0Var.e(kakaLibImageWrapper, i, values, str, str2, fVar);
        }
    }

    public static /* synthetic */ f b(kk0 kk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("98a708b3", new Object[]{kk0Var});
        }
        return kk0Var.f22719a;
    }

    public static /* synthetic */ f c(kk0 kk0Var, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("76f50cc", new Object[]{kk0Var, fVar});
        }
        kk0Var.f22719a = fVar;
        return fVar;
    }

    public static /* synthetic */ void d(kk0 kk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ab2f39", new Object[]{kk0Var});
        } else {
            kk0Var.g();
        }
    }

    public final void e(KakaLibImageWrapper kakaLibImageWrapper, int i, PhotoFrom.Values values, String str, String str2, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae29c9ed", new Object[]{this, kakaLibImageWrapper, new Integer(i), values, str, str2, fVar});
        } else {
            VExecutors.defaultSharedThreadPool().submit(new c("asyncDecode", new com.etao.feimagesearch.capture.scan.b(kakaLibImageWrapper, ScanMode.ACCURATE_MODE, tro.a(str, str2), 3, null, values, true, i, lg4.j1()), fVar));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf1da4b", new Object[]{this});
        } else {
            ImgChannelDetectManager.Companion.b().h(new d());
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2409e1c3", new Object[]{this});
            return;
        }
        qu1 i = hx8.j().i();
        if (i != null) {
            i.e(new b(i));
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c460bb9", new Object[]{this});
        } else {
            hre.INSTANCE.i(new e());
        }
    }

    public f j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("93413955", new Object[]{this, str});
        }
        if (this.f22719a == null || TextUtils.isEmpty(str) || !Objects.equals(this.f22719a.d(), str)) {
            return null;
        }
        return this.f22719a;
    }

    public void i(Activity activity, String str, int i, CaptureManager captureManager, String str2, Rect rect, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a1b041", new Object[]{this, activity, str, new Integer(i), captureManager, str2, rect, new Boolean(z), str3});
            return;
        }
        agh.h("_scancode_AlbumPreprocessor", "preProcess path:" + str + ", pssource:" + str3);
        if (str == null || TextUtils.isEmpty(str)) {
            agh.c("_scancode_AlbumPreprocessor", "path is null");
            return;
        }
        f fVar = this.f22719a;
        if (fVar == null || !Objects.equals(fVar.d(), str)) {
            VExecutors.defaultSharedThreadPool().submit(new fme.a(activity, str, i, new a(activity, str, rect, z, i, str2, str3, captureManager), false));
        } else {
            agh.h("_scancode_AlbumPreprocessor", "path is already in cache");
        }
    }
}
