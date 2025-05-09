package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.scan.c;
import com.etao.feimagesearch.capture.scan.irp.ImgChannelDetectManager;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import java.util.Map;
import tb.fme;
import tb.kk0;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class b73 extends mz1<d73> implements hdd, qlb, vro, qk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "CaptureScanPresenterV2";
    public c c;
    public final b d = new b(this);
    public boolean e;
    public boolean f;
    public ak0 g;
    public oss h;
    public fso i;
    public boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(730857561);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f16223a;
        public long b;

        static {
            t2o.a(730857562);
        }

        public b(b73 b73Var) {
            ckf.g(b73Var, "this$0");
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("507fb616", new Object[]{this});
                return;
            }
            long j = this.b;
            if (j < Long.MAX_VALUE) {
                this.b = j + 1;
            }
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
            } else if (this.b > 0) {
                jzu.g("Page_PhotoSearchScan", "Button-HuoyanRecognize", "count", String.valueOf(this.b), "totalTime", String.valueOf(System.currentTimeMillis() - this.f16223a));
                c();
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.f16223a = System.currentTimeMillis();
            this.b = 0L;
        }
    }

    static {
        t2o.a(730857560);
        t2o.a(481297512);
        t2o.a(481297500);
        t2o.a(730857590);
        t2o.a(481297511);
    }

    public static final /* synthetic */ void C(b73 b73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6f1abb", new Object[]{b73Var});
        } else {
            b73Var.F();
        }
    }

    public static final /* synthetic */ void h(b73 b73Var, Bitmap bitmap, PhotoFrom.Values values, String str, int i, String str2, kk0.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c2c6ff", new Object[]{b73Var, bitmap, values, str, new Integer(i), str2, fVar});
        } else {
            b73Var.i(bitmap, values, str, i, str2, fVar);
        }
    }

    public static /* synthetic */ Object ipc$super(b73 b73Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.v();
                return null;
            case -1504501726:
                super.q();
                return null;
            case 267248023:
                super.n();
                return null;
            case 797441118:
                super.s();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/biz/CaptureScanPresenterV2");
        }
    }

    public static final /* synthetic */ d32 y(b73 b73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d32) ipChange.ipc$dispatch("88d5912c", new Object[]{b73Var});
        }
        return b73Var.f24401a;
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c104ff", new Object[]{this});
        } else if (!this.j) {
            this.j = true;
            ImgChannelDetectManager.Companion.b().f(String.valueOf(((d73) this.f24401a).I().hashCode()));
            hre.INSTANCE.g(String.valueOf(((d73) this.f24401a).I().hashCode()));
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        fso fsoVar = this.i;
        if (fsoVar != null) {
            fsoVar.b();
        }
    }

    public final void G(pei peiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5f8801", new Object[]{this, peiVar, new Boolean(z)});
        } else if (!((d73) this.f24401a).I().isFinishing() && peiVar != null) {
            if (peiVar.p()) {
                M(peiVar);
            } else {
                L(peiVar.b().toString(), peiVar.f(), z, peiVar.i());
            }
        }
    }

    public final void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb726c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z != this.f) {
            f1v.b(this.f24401a, z);
            this.f = z;
        }
        if (z) {
            jzu.q("Page_PhotoSearchScan", "PageShow_Scan", new String[0]);
        }
    }

    public final void K(MusOuterAlbumBean musOuterAlbumBean) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dffb4e", new Object[]{this, musOuterAlbumBean});
            return;
        }
        ckf.g(musOuterAlbumBean, "albumBean");
        if (!TextUtils.isEmpty(musOuterAlbumBean.getImgKey())) {
            String imgKey = musOuterAlbumBean.getImgKey();
            Float imgRotation = musOuterAlbumBean.getImgRotation();
            if (imgRotation == null) {
                f = 0.0f;
            } else {
                f = imgRotation.floatValue();
            }
            L(imgKey, (int) f, true, "");
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        fso fsoVar = this.i;
        if (fsoVar != null) {
            fsoVar.c();
        }
    }

    public final void O(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832f2585", new Object[]{this, new Boolean(z)});
            return;
        }
        this.e = z;
        if (!z || this.b) {
            z2 = false;
        }
        I(z2);
    }

    @Override // tb.vro
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b6b5d5c", new Object[]{this})).intValue();
        }
        return l53.b.b("scan");
    }

    @Override // tb.vro
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87621af3", new Object[]{this});
        }
        String pageSpm = ((d73) this.f24401a).p().getPageSpm();
        if (pageSpm == null) {
            return f1v.SCAN_SPM;
        }
        return pageSpm;
    }

    @Override // tb.qk0
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e159fe4", new Object[]{this});
            return;
        }
        ImgChannelDetectManager.Companion.b().f(String.valueOf(((d73) this.f24401a).I().hashCode()));
        hre.INSTANCE.g(String.valueOf(((d73) this.f24401a).I().hashCode()));
    }

    @Override // tb.vro
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d20426", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.g = null;
            oss ossVar = this.h;
            if (ossVar != null) {
                ossVar.o(true);
            }
        } else {
            this.d.b();
        }
    }

    @Override // tb.vro
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ea1304a", new Object[]{this})).booleanValue();
        }
        if (this.b || !this.e) {
            return false;
        }
        return true;
    }

    @Override // tb.qlb
    public void j(Bitmap bitmap, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8f6b2e", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(bitmap, "snapshot");
        oss ossVar = this.h;
        if (ossVar == null) {
            c cVar = this.c;
            if (cVar != null) {
                Activity I = ((d73) this.f24401a).I();
                ckf.f(I, "view.activity");
                CaptureManager m = ((d73) this.f24401a).m();
                ckf.f(m, "view.manager");
                CaptureManager captureManager = m;
                yr3 p = ((d73) this.f24401a).p();
                ckf.f(p, "view.pageModel");
                ossVar = new oss(cVar, I, captureManager, p, ((d73) this.f24401a).O());
                this.h = ossVar;
            } else {
                ckf.y("scancodeBizManager");
                throw null;
            }
        }
        ossVar.j(bitmap, z, z2);
    }

    @Override // tb.vro
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b205e9c", new Object[]{this});
        }
        String pssource = ((d73) this.f24401a).p().getPssource();
        return pssource == null ? "unknown_scan_pssource" : pssource;
    }

    @Override // tb.vro
    public void l(boolean z, wro wroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e6a95a", new Object[]{this, new Boolean(z), wroVar});
            return;
        }
        ckf.g(wroVar, "multiCodeData");
        F();
        ((d73) this.f24401a).Q(wroVar);
    }

    @Override // tb.mz1
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.n();
        Activity I = ((d73) this.f24401a).I();
        ckf.f(I, "view.activity");
        CaptureManager m = ((d73) this.f24401a).m();
        ckf.f(m, "view.manager");
        this.i = new fso(I, m);
        ((d73) this.f24401a).m().d0(this);
        Activity I2 = ((d73) this.f24401a).I();
        if (I2 != null) {
            this.c = new c((FragmentActivity) I2, this, new oda(((d73) this.f24401a).I(), ((d73) this.f24401a).p(), "", ((d73) this.f24401a).m()));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @Override // tb.mz1
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.q();
        c cVar = this.c;
        if (cVar != null) {
            cVar.s();
            if (lg4.i1()) {
                mso.INSTANCE.c();
                return;
            }
            return;
        }
        ckf.y("scancodeBizManager");
        throw null;
    }

    @Override // tb.vro
    public void g(boolean z, y6n y6nVar) {
        qu3 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b40fef", new Object[]{this, new Boolean(z), y6nVar});
            return;
        }
        ckf.g(y6nVar, "event");
        if (z) {
            F();
            oss ossVar = this.h;
            if (ossVar == null || !ossVar.n(z, y6nVar)) {
                jzu.i(s63.ALBUM_PAGE_NAME, "scanPicFail", "scene", "scanAlbum");
                i0u.f(((d73) this.f24401a).I(), lg4.a3(), 0);
                ak0 ak0Var = this.g;
                if (ak0Var != null && ckf.b(ak0Var.e(), y6nVar.c)) {
                    Uri parse = Uri.parse(y6nVar.f31881a);
                    if (parse != null) {
                        pmf.e0();
                        Map<String, String> extraParams = ((d73) this.f24401a).p().getExtraParams();
                        ckf.f(extraParams, "view.pageModel.extraParams");
                        extraParams.put("screenshotsAppSrc", ak0Var.g());
                        Bitmap a2 = ak0Var.a();
                        int i = y6nVar.b;
                        PhotoFrom.Values values = PhotoFrom.Values.ALBUM_SYS;
                        yr3 p = ((d73) this.f24401a).p();
                        Activity I = ((d73) this.f24401a).I();
                        int hashCode = ak0Var.a().hashCode();
                        int b2 = ak0Var.b();
                        m2d z2 = ((d73) this.f24401a).m().z();
                        o63.c(parse, a2, i, values, p, I, hashCode, b2, (z2 == null || (g = z2.g()) == null) ? null : g.a());
                    }
                    this.g = null;
                }
            }
        }
    }

    public final void M(pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69e3c3c", new Object[]{this, peiVar});
        } else if (!peiVar.o(lg4.L2())) {
            h9w.b(peiVar.j(), false);
            Activity I = ((d73) this.f24401a).I();
            Toast.makeText(I, Localization.q(R.string.taobao_app_1007_not_supported_now) + lg4.L2() + Localization.q(R.string.taobao_app_1007_1_19050), 0).show();
            jzu.n(p73.f25916a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(peiVar.j()));
        } else if (peiVar.n()) {
            h9w.b(peiVar.j(), false);
            Toast.makeText(((d73) this.f24401a).I(), Localization.q(R.string.taobao_app_1007_1_19054), 0).show();
            jzu.n(p73.f25916a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(peiVar.j()));
        } else {
            jzu.e("SelectedVideo", new String[0]);
            h9w.b(peiVar.j(), true);
            try {
                com.etao.feimagesearch.history.a.j().p(((d73) this.f24401a).I(), peiVar.g(), peiVar.d(), peiVar.k());
            } catch (Exception e) {
                e.printStackTrace();
            }
            mzu.k(s63.ALBUM_PAGE_NAME, "SelectedVideo", new String[0]);
            String uri = Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(peiVar.g())).appendQueryParameter("pssource", ((d73) this.f24401a).p().getPssource()).build().toString();
            ckf.f(uri, "parse(\"https://m.taobao.…ource).build().toString()");
            nmj.a(((d73) this.f24401a).I(), uri);
        }
    }

    @Override // tb.mz1
    public void s() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.s();
        if (!this.e && !this.b) {
            z = true;
        }
        I(z);
        c cVar = this.c;
        if (cVar != null) {
            cVar.x();
            oss ossVar = this.h;
            if (ossVar != null) {
                ossVar.m();
            }
            F();
            return;
        }
        ckf.y("scancodeBizManager");
        throw null;
    }

    @Override // tb.mz1
    public void v() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.v();
        if (this.e && !this.b) {
            z = true;
        }
        I(z);
        c cVar = this.c;
        if (cVar != null) {
            cVar.y();
            this.d.c();
            E();
            return;
        }
        ckf.y("scancodeBizManager");
        throw null;
    }

    public final void L(String str, int i, boolean z, String str2) {
        PhotoFrom.Values values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd372bfa", new Object[]{this, str, new Integer(i), new Boolean(z), str2});
        } else if (str != null && !TextUtils.isEmpty(str)) {
            agh.r("PltCameraScan", "processAlbumImageItem", str);
            N();
            if (z) {
                values = PhotoFrom.Values.OUTER_ALBUM_LOCAL;
            } else {
                values = PhotoFrom.Values.ALBUM;
            }
            kk0.f j = ((d73) this.f24401a).m().m().j(str);
            if (j != null) {
                agh.r("PltCameraScan", "processAlbumImageItem:", "use preprocess album bitmap");
                mzu.n(p73.f25916a, "firstAlbumCacheBingoScan", 19999, new String[0]);
                i(j.a(), values, str, i, str2, j);
                return;
            }
            fme.a aVar = new fme.a(((d73) this.f24401a).I(), str, i, new c73(this, values, str, i, str2), true);
            if (((d73) this.f24401a).m().w()) {
                ((d73) this.f24401a).m().j(aVar);
            } else {
                z7m.c(aVar);
            }
        }
    }

    @Override // tb.hdd
    public void d(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2128929", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6)});
            return;
        }
        this.d.a();
        if (ipe.c(bArr, i, i2, ((d73) this.f24401a).m().u()) == 1) {
            log logVar = log.INSTANCE;
            Activity I = ((d73) this.f24401a).I();
            ckf.f(I, "view.activity");
            CaptureManager m = ((d73) this.f24401a).m();
            ckf.f(m, "view.manager");
            logVar.c(I, m, false);
        } else {
            log logVar2 = log.INSTANCE;
            Activity I2 = ((d73) this.f24401a).I();
            ckf.f(I2, "view.activity");
            CaptureManager m2 = ((d73) this.f24401a).m();
            ckf.f(m2, "view.manager");
            logVar2.d(I2, m2, false);
        }
        c cVar = this.c;
        if (cVar != null) {
            cVar.t(bArr, i, i2, i3, i4, i5, z, i6, false);
        } else {
            ckf.y("scancodeBizManager");
            throw null;
        }
    }

    public final void i(Bitmap bitmap, PhotoFrom.Values values, String str, int i, String str2, kk0.f fVar) {
        xhv xhvVar;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2af7d55", new Object[]{this, bitmap, values, str, new Integer(i), str2, fVar});
            return;
        }
        if (fVar == null) {
            xhvVar = null;
        } else {
            i3 = fVar.b();
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            if (((d73) this.f24401a).m().F()) {
                hx8.g(hx8.Companion.a(), bitmap, null, 2, null);
                i3 = 16;
            }
            if (((d73) this.f24401a).m().E()) {
                ImgChannelDetectManager.Companion.b().e(new oi3(bitmap, str2));
                i3 |= 256;
            }
            if (((d73) this.f24401a).m().H()) {
                hre.INSTANCE.f(new y39(bitmap, null, 2, null));
                i3 |= 261;
            }
            i2 = i3 | 1;
        } else {
            i2 = i3;
        }
        ak0 ak0Var = new ak0(str, bitmap, i, values, i2, str2, null);
        this.g = ak0Var;
        long b2 = tro.b(((d73) this.f24401a).I(), bitmap);
        c cVar = this.c;
        if (cVar != null) {
            ak0Var.i(cVar.u(((d73) this.f24401a).I(), str, bitmap, i, values, ((d73) this.f24401a).P(), b2));
        } else {
            ckf.y("scancodeBizManager");
            throw null;
        }
    }
}
