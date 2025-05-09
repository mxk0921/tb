package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.SmartDetectFlow;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.scan.DecodeState;
import com.etao.feimagesearch.capture.scan.irp.ImgChannelDetectManager;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.nn.MNNManager;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.Map;
import tb.fme;
import tb.kk0;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class s63 extends mz1<t63> implements hdd, qlb, vro, qk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final String ALBUM_PAGE_NAME = "Page_PhotoSearchAlbum";
    @Deprecated
    public static final String PAI_SPM = "a2141.7631739.0.0";
    @Deprecated
    public static final String TAG = "_scancode_CapturePaiPresenterV2";
    public boolean c;
    public boolean d;
    public fzb e;
    public m2d f;
    public com.etao.feimagesearch.capture.scan.c g;
    public ak0 h;
    public AlertDialog i;
    public Boolean j;
    public Boolean k;
    public oss l;
    public fso m;
    public boolean n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(730857551);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ wro b;

        public c(wro wroVar) {
            this.b = wroVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            mzu.n(s63.ALBUM_PAGE_NAME, "GoScanPic", 2101, new String[0]);
            s63.G(s63.this, this.b);
            s63.F(s63.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ wro c;

        public d(boolean z, wro wroVar) {
            this.b = z;
            this.c = wroVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            pmf.e0();
            mzu.n(s63.ALBUM_PAGE_NAME, "GoPhotoTake", 2101, new String[0]);
            s63 s63Var = s63.this;
            boolean z = this.b;
            y6n b = this.c.b();
            ckf.f(b, "scanCodeFoundEvent.qrCodeNotFoundEvent");
            s63Var.g(z, b);
            com.etao.feimagesearch.capture.scan.c y = s63.y(s63.this);
            if (y != null) {
                y.g(DecodeState.IDLE);
                com.etao.feimagesearch.capture.scan.c y2 = s63.y(s63.this);
                if (y2 != null) {
                    y2.G(false);
                    s63.F(s63.this, null);
                    return;
                }
                ckf.y("scancodeBizManager");
                throw null;
            }
            ckf.y("scancodeBizManager");
            throw null;
        }
    }

    static {
        t2o.a(730857550);
        t2o.a(481297512);
        t2o.a(481297500);
        t2o.a(730857590);
        t2o.a(481297511);
    }

    public static final /* synthetic */ d32 C(s63 s63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d32) ipChange.ipc$dispatch("6a46b387", new Object[]{s63Var});
        }
        return s63Var.f24401a;
    }

    public static final /* synthetic */ void D(s63 s63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62229aa2", new Object[]{s63Var});
        } else {
            s63Var.M();
        }
    }

    public static final /* synthetic */ void E(s63 s63Var, ak0 ak0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf7e3d2", new Object[]{s63Var, ak0Var});
        } else {
            s63Var.h = ak0Var;
        }
    }

    public static final /* synthetic */ void F(s63 s63Var, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d1e5d5", new Object[]{s63Var, alertDialog});
        } else {
            s63Var.i = alertDialog;
        }
    }

    public static final /* synthetic */ void G(s63 s63Var, wro wroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93809ed", new Object[]{s63Var, wroVar});
        } else {
            s63Var.Y(wroVar);
        }
    }

    public static /* synthetic */ Object ipc$super(s63 s63Var, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/biz/CapturePaiPresenterV2");
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.capture.scan.c y(s63 s63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.capture.scan.c) ipChange.ipc$dispatch("2a4c5059", new Object[]{s63Var});
        }
        return s63Var.g;
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c104ff", new Object[]{this});
        } else if (!this.n) {
            this.n = true;
            if (((t63) this.f24401a).m().H()) {
                hre.INSTANCE.g(String.valueOf(((t63) this.f24401a).I().hashCode()));
            }
        }
    }

    public final void K() {
        fzb fzbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68877a94", new Object[]{this});
        } else if (!((t63) this.f24401a).p().isDisableAutoDetect() && !((t63) this.f24401a).p().isInShop() && this.e == null && this.f != null) {
            if (((t63) this.f24401a).m().i()) {
                Activity I = ((t63) this.f24401a).I();
                ckf.f(I, "view.activity");
                com.etao.feimagesearch.capture.scan.c cVar = this.g;
                if (cVar != null) {
                    fzbVar = new SmartDetectFlow(I, this, cVar);
                    m2d m2dVar = this.f;
                    if (m2dVar != null) {
                        m2dVar.c(fzbVar);
                    }
                } else {
                    ckf.y("scancodeBizManager");
                    throw null;
                }
            } else {
                Activity I2 = ((t63) this.f24401a).I();
                ckf.f(I2, "view.activity");
                com.etao.feimagesearch.capture.scan.c cVar2 = this.g;
                if (cVar2 != null) {
                    fzbVar = new rke(I2, this, cVar2);
                    m2d m2dVar2 = this.f;
                    if (m2dVar2 != null) {
                        m2dVar2.c(fzbVar);
                    }
                } else {
                    ckf.y("scancodeBizManager");
                    throw null;
                }
            }
            this.e = fzbVar;
        }
    }

    public final void L(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a49eea", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6)});
            return;
        }
        m2d z3 = ((t63) this.f24401a).m().z();
        if (z3 != null) {
            z3.a(i3, i4);
            Boolean bool = this.j;
            if (bool == null) {
                z2 = lg4.c();
                this.j = Boolean.valueOf(z2);
            } else {
                z2 = bool.booleanValue();
            }
            if (!z2) {
                z3.b(bArr, z, i, i2, i6);
            }
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        fso fsoVar = this.m;
        if (fsoVar != null) {
            fsoVar.b();
        }
    }

    public final boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a63df36", new Object[]{this})).booleanValue();
        }
        AlertDialog alertDialog = this.i;
        if (alertDialog == null) {
            return false;
        }
        return alertDialog.isShowing();
    }

    public final void Q(pei peiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5f8801", new Object[]{this, peiVar, new Boolean(z)});
        } else if (!((t63) this.f24401a).I().isFinishing() && peiVar != null) {
            if (peiVar.p()) {
                V(peiVar);
            } else {
                U(peiVar.b().toString(), peiVar.f(), z, peiVar.i());
            }
        }
    }

    public final void T(MusOuterAlbumBean musOuterAlbumBean) {
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
            U(imgKey, (int) f, true, "");
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2058525f", new Object[]{this});
            return;
        }
        this.f = null;
        fzb fzbVar = this.e;
        if (fzbVar != null) {
            fzbVar.release();
        }
        this.e = null;
    }

    public final void X(boolean z, wro wroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bd7445", new Object[]{this, new Boolean(z), wroVar});
            return;
        }
        AlertDialog alertDialog = this.i;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            this.i = null;
        }
        this.i = new AlertDialog.Builder(((t63) this.f24401a).I()).setMessage(Localization.q(R.string.feis_album_scan_dialog_title)).setPositiveButton(Localization.q(R.string.feis_album_scan_dialog_confirm), new c(wroVar)).setNegativeButton(Localization.q(R.string.feis_album_scan_dialog_cancel), new d(z, wroVar)).setCancelable(false).show();
        mzu.n(ALBUM_PAGE_NAME, "GoScanPicExpose", 2101, new String[0]);
    }

    @Override // tb.vro
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b6b5d5c", new Object[]{this})).intValue();
        }
        return l53.b.b(l53.b.SCENE_AUTO_DETECT);
    }

    public final void a0(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832f2585", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (!z || this.b) {
            z2 = false;
        }
        S(z2);
    }

    @Override // tb.vro
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87621af3", new Object[]{this});
        }
        String pageSpm = ((t63) this.f24401a).p().getPageSpm();
        if (pageSpm == null) {
            return PAI_SPM;
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
        ImgChannelDetectManager.Companion.b().f(String.valueOf(((t63) this.f24401a).I().hashCode()));
        hre.INSTANCE.g(String.valueOf(((t63) this.f24401a).I().hashCode()));
    }

    @Override // tb.hdd
    public void d(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2128929", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6)});
            return;
        }
        try {
            if (!O() && !N()) {
                com.etao.feimagesearch.capture.scan.c cVar = this.g;
                if (cVar == null) {
                    ckf.y("scancodeBizManager");
                    throw null;
                } else if (!cVar.q()) {
                    L(bArr, i, i2, i3, i4, i5, z, i6);
                }
            }
        } catch (Exception e) {
            agh.d("TaoPaiPresenter", "onPreFrameDetect", e);
        }
    }

    @Override // tb.vro
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ea1304a", new Object[]{this})).booleanValue();
        }
        if (this.b || !this.c) {
            return false;
        }
        return true;
    }

    @Override // tb.vro
    public void g(boolean z, y6n y6nVar) {
        KakaLibImageWrapper e;
        qu3 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b40fef", new Object[]{this, new Boolean(z), y6nVar});
            return;
        }
        ckf.g(y6nVar, "qrCodeNotFoundEvent");
        agh.h(TAG, "onScanFailed isAlbumDecoding=" + z + '}');
        if (z) {
            M();
            ak0 ak0Var = this.h;
            if (ak0Var == null || (e = ak0Var.e()) == null || !ckf.b(e, y6nVar.c)) {
                oss ossVar = this.l;
                if (ossVar != null) {
                    ossVar.n(z, y6nVar);
                    return;
                }
                return;
            }
            jzu.i(ALBUM_PAGE_NAME, "scanPicFail", "scene", "paiAlbum");
            Map<String, String> extraParams = ((t63) this.f24401a).p().getExtraParams();
            ckf.f(extraParams, "view.pageModel.extraParams");
            extraParams.put("screenshotsAppSrc", ak0Var.g());
            Uri parse = Uri.parse(ak0Var.d());
            Bitmap a2 = ak0Var.a();
            int f = ak0Var.f();
            PhotoFrom.Values c2 = ak0Var.c();
            yr3 p = ((t63) this.f24401a).p();
            Activity I = ((t63) this.f24401a).I();
            int hashCode = ak0Var.a().hashCode();
            int b2 = ak0Var.b();
            m2d z2 = ((t63) this.f24401a).m().z();
            o63.c(parse, a2, f, c2, p, I, hashCode, b2, (z2 == null || (g = z2.g()) == null) ? null : g.a());
            this.h = null;
        }
    }

    @Override // tb.vro
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b205e9c", new Object[]{this});
        }
        String pssource = ((t63) this.f24401a).p().getPssource();
        return pssource == null ? "unknown_pai_pssource" : pssource;
    }

    @Override // tb.mz1
    public void n() {
        qu3 g;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.n();
        Activity I = ((t63) this.f24401a).I();
        ckf.f(I, "view.activity");
        CaptureManager m = ((t63) this.f24401a).m();
        ckf.f(m, "view.manager");
        this.m = new fso(I, m);
        m2d z = ((t63) this.f24401a).m().z();
        String str = "";
        if (!(z == null || (g = z.g()) == null || (a2 = g.a()) == null)) {
            str = a2;
        }
        Activity I2 = ((t63) this.f24401a).I();
        if (I2 != null) {
            this.g = new com.etao.feimagesearch.capture.scan.c((FragmentActivity) I2, this, new oda(((t63) this.f24401a).I(), ((t63) this.f24401a).p(), str, ((t63) this.f24401a).m()));
            ((t63) this.f24401a).m().d0(this);
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
        com.etao.feimagesearch.capture.scan.c cVar = this.g;
        if (cVar != null) {
            cVar.s();
            ((t63) this.f24401a).m().E0(this);
            MNNManager.Companion.a().k();
            if (((t63) this.f24401a).m().H()) {
                hre.INSTANCE.d(String.valueOf(((t63) this.f24401a).I().hashCode()));
                return;
            }
            return;
        }
        ckf.y("scancodeBizManager");
        throw null;
    }

    public final void Y(wro wroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4a4bce", new Object[]{this, wroVar});
            return;
        }
        ((t63) this.f24401a).Q(wroVar);
        com.etao.feimagesearch.capture.scan.c cVar = this.g;
        if (cVar != null) {
            cVar.G(true);
            fzb fzbVar = this.e;
            if (fzbVar != null) {
                fzbVar.f();
                return;
            }
            return;
        }
        ckf.y("scancodeBizManager");
        throw null;
    }

    public final void Z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6998649", new Object[]{this, new Boolean(z)});
        } else if (z) {
            log logVar = log.INSTANCE;
            Activity I = ((t63) this.f24401a).I();
            ckf.f(I, "view.activity");
            CaptureManager m = ((t63) this.f24401a).m();
            ckf.f(m, "view.manager");
            logVar.c(I, m, true);
        } else {
            log logVar2 = log.INSTANCE;
            Activity I2 = ((t63) this.f24401a).I();
            ckf.f(I2, "view.activity");
            CaptureManager m2 = ((t63) this.f24401a).m();
            ckf.f(m2, "view.manager");
            logVar2.d(I2, m2, true);
        }
    }

    @Override // tb.vro
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d20426", new Object[]{this, new Boolean(z)});
            return;
        }
        agh.h(TAG, ckf.p("onScanSuccess ", Boolean.valueOf(z)));
        if (z) {
            this.h = null;
            oss ossVar = this.l;
            if (ossVar != null) {
                ossVar.o(true);
            }
        }
    }

    @Override // tb.qlb
    public void j(Bitmap bitmap, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8f6b2e", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(bitmap, "snapshot");
        if (!z) {
            ((t63) this.f24401a).R(true);
        }
        oss ossVar = this.l;
        if (ossVar == null) {
            com.etao.feimagesearch.capture.scan.c cVar = this.g;
            if (cVar != null) {
                Activity I = ((t63) this.f24401a).I();
                ckf.f(I, "view.activity");
                CaptureManager m = ((t63) this.f24401a).m();
                ckf.f(m, "view.manager");
                CaptureManager captureManager = m;
                yr3 p = ((t63) this.f24401a).p();
                ckf.f(p, "view.pageModel");
                ossVar = new oss(cVar, I, captureManager, p, ((t63) this.f24401a).O());
                this.l = ossVar;
            } else {
                ckf.y("scancodeBizManager");
                throw null;
            }
        }
        ossVar.j(bitmap, z, z2);
    }

    @Override // tb.vro
    public void l(boolean z, wro wroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e6a95a", new Object[]{this, new Boolean(z), wroVar});
            return;
        }
        ckf.g(wroVar, "multiCodeData");
        agh.h(TAG, ckf.p("onGetScanResult ", Boolean.valueOf(z)));
        if (wroVar.d() != null && wroVar.c() != null) {
            if (P()) {
                agh.h(TAG, "onGetScanResult isShowingDecodeResultUI");
            } else if (z) {
                M();
                agh.h(TAG, ckf.p("directNav=", Boolean.valueOf(wroVar.e())));
                oss ossVar = this.l;
                if (ossVar != null) {
                    nss i = ossVar.i();
                    if (ckf.b(i == null ? null : i.b(), wroVar.b().c)) {
                        mzu.n(p73.f25916a, "findCodeAfterTakePhoto", 19999, new String[0]);
                    }
                }
                if (wroVar.e()) {
                    Y(wroVar);
                } else {
                    X(z, wroVar);
                }
            } else {
                Y(wroVar);
            }
        }
    }

    public final boolean N() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e92723b", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.k;
        if (bool == null) {
            z = lg4.S0();
            this.k = Boolean.valueOf(z);
        } else {
            z = bool.booleanValue();
        }
        if (!z) {
            return false;
        }
        com.etao.feimagesearch.capture.scan.c cVar = this.g;
        if (cVar != null) {
            return cVar.p();
        }
        ckf.y("scancodeBizManager");
        throw null;
    }

    public final boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e2d5f25", new Object[]{this})).booleanValue();
        }
        if (!O()) {
            com.etao.feimagesearch.capture.scan.c cVar = this.g;
            if (cVar == null) {
                ckf.y("scancodeBizManager");
                throw null;
            } else if (!cVar.q()) {
                return false;
            }
        }
        return true;
    }

    public final void R(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3eb181", new Object[]{this, new Integer(i)});
        } else if (i == 1 || i == 2) {
            com.etao.feimagesearch.capture.scan.c cVar = this.g;
            if (cVar != null) {
                cVar.F();
                AlertDialog alertDialog = this.i;
                if (alertDialog != null && alertDialog.isShowing()) {
                    alertDialog.dismiss();
                    return;
                }
                return;
            }
            ckf.y("scancodeBizManager");
            throw null;
        }
    }

    public final void S(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb726c", new Object[]{this, new Boolean(z)});
            return;
        }
        agh.h("_scancode__scancode_CapturePaiPresenterV2", ckf.p("onVisibilityChange: visible=", Boolean.valueOf(z)));
        if (!z || this.b) {
            z2 = false;
        }
        if (z2 != this.d) {
            if (z2) {
                Activity I = ((t63) this.f24401a).I();
                String str = p73.f25916a;
                jzu.r(I, str);
                jzu.t(((t63) this.f24401a).I(), "spm-cnt", "a2141.7631739", "rainbow", e0.b(), "pssource", ((t63) this.f24401a).p().getPssource(), k7m.KEY_DEVICE_TYPE, k7m.a());
                f1v.c(((t63) this.f24401a).I());
                ((t63) this.f24401a).p().setPageSpm(PAI_SPM);
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(((t63) this.f24401a).I(), str);
            } else {
                if (!lg4.c4()) {
                    jzu.t(((t63) this.f24401a).I(), "rainbow", e0.b());
                }
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(((t63) this.f24401a).I());
            }
            this.d = z2;
        }
        if (z) {
            this.f = ((t63) this.f24401a).m().z();
            K();
            return;
        }
        W();
    }

    public final void V(pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69e3c3c", new Object[]{this, peiVar});
        } else if (!peiVar.o(lg4.L2())) {
            h9w.b(peiVar.j(), false);
            Activity I = ((t63) this.f24401a).I();
            Toast.makeText(I, Localization.q(R.string.taobao_app_1007_not_supported_now) + lg4.L2() + Localization.q(R.string.taobao_app_1007_1_19050), 0).show();
            jzu.n(p73.f25916a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(peiVar.j()));
        } else if (peiVar.n()) {
            h9w.b(peiVar.j(), false);
            Toast.makeText(((t63) this.f24401a).I(), Localization.q(R.string.taobao_app_1007_1_19054), 0).show();
            jzu.n(p73.f25916a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(peiVar.j()));
        } else {
            ((t63) this.f24401a).R(true);
            h9w.b(peiVar.j(), true);
            try {
                com.etao.feimagesearch.history.a.j().p(((t63) this.f24401a).I(), peiVar.g(), peiVar.d(), peiVar.k());
            } catch (Exception e) {
                e.printStackTrace();
            }
            mzu.k(ALBUM_PAGE_NAME, "SelectedVideo", new String[0]);
            String uri = Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(peiVar.g())).appendQueryParameter("pssource", ((t63) this.f24401a).p().getPssource()).build().toString();
            ckf.f(uri, "parse(\"https://m.taobao.…ource).build().toString()");
            nmj.a(((t63) this.f24401a).I(), uri);
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
        fzb fzbVar = this.e;
        if (fzbVar != null) {
            fzbVar.f();
        }
        if (this.c && !this.b) {
            z = true;
        }
        S(z);
        com.etao.feimagesearch.capture.scan.c cVar = this.g;
        if (cVar != null) {
            cVar.x();
            AlertDialog alertDialog = this.i;
            if (alertDialog != null && alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            this.h = null;
            oss ossVar = this.l;
            if (ossVar != null) {
                ossVar.m();
            }
            M();
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
        if (this.c && !this.b) {
            z = true;
        }
        S(z);
        ((t63) this.f24401a).m().D0();
        com.etao.feimagesearch.capture.scan.c cVar = this.g;
        if (cVar != null) {
            cVar.y();
            I();
            return;
        }
        ckf.y("scancodeBizManager");
        throw null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements fme.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ PhotoFrom.Values e;

        public b(String str, String str2, int i, PhotoFrom.Values values) {
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = values;
        }

        @Override // tb.fme.b
        public void onFail(String str, String str2) {
            String str3;
            qu3 g;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            s63.D(s63.this);
            Uri parse = Uri.parse(this.c);
            int i = this.d;
            PhotoFrom.Values values = this.e;
            yr3 p = ((t63) s63.C(s63.this)).p();
            Activity I = ((t63) s63.C(s63.this)).I();
            m2d z = ((t63) s63.C(s63.this)).m().z();
            if (z == null || (g = z.g()) == null) {
                str3 = null;
            } else {
                str3 = g.a();
            }
            o63.c(parse, null, i, values, p, I, -1, 0, str3);
        }

        @Override // tb.fme.b
        public void a(Bitmap bitmap, long j) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19d9a641", new Object[]{this, bitmap, new Long(j)});
                return;
            }
            ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
            if (((t63) s63.C(s63.this)).m().F()) {
                hx8.g(hx8.Companion.a(), bitmap, null, 2, null);
                i = 16;
            }
            if (((t63) s63.C(s63.this)).m().E()) {
                ImgChannelDetectManager.Companion.b().e(new oi3(bitmap, this.b));
                i |= 256;
            }
            if (((t63) s63.C(s63.this)).m().H()) {
                hre.INSTANCE.f(new y39(bitmap, null, 2, null));
                i |= 261;
            }
            ak0 ak0Var = new ak0(this.c, bitmap, this.d, this.e, i | 1, this.b, null, 64, null);
            s63 s63Var = s63.this;
            s63.E(s63Var, ak0Var);
            long b = tro.b(((t63) s63.C(s63Var)).I(), bitmap);
            com.etao.feimagesearch.capture.scan.c y = s63.y(s63Var);
            if (y != null) {
                ak0Var.i(y.u(((t63) s63.C(s63Var)).I(), ak0Var.d(), bitmap, ak0Var.f(), ak0Var.c(), ((t63) s63.C(s63Var)).P(), b));
            } else {
                ckf.y("scancodeBizManager");
                throw null;
            }
        }
    }

    public final void U(String str, int i, boolean z, String str2) {
        PhotoFrom.Values values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd372bfa", new Object[]{this, str, new Integer(i), new Boolean(z), str2});
        } else if (str != null && !TextUtils.isEmpty(str)) {
            agh.r("PltCameraPai", "processAlbumImageItem", str);
            pmf.e0();
            if (z) {
                values = PhotoFrom.Values.OUTER_ALBUM_LOCAL;
            } else {
                values = PhotoFrom.Values.ALBUM;
            }
            if (!H(str, values)) {
                ((t63) this.f24401a).R(true);
                fme.a aVar = new fme.a(((t63) this.f24401a).I(), str, i, new b(str2, str, i, values), true);
                if (((t63) this.f24401a).m().w()) {
                    ((t63) this.f24401a).m().j(aVar);
                } else {
                    z7m.c(aVar);
                }
            }
        }
    }

    public final boolean H(String str, PhotoFrom.Values values) {
        qu3 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b83b3cd", new Object[]{this, str, values})).booleanValue();
        }
        try {
            kk0.f j = ((t63) this.f24401a).m().m().j(str);
            if (j != null) {
                ((t63) this.f24401a).R(true);
                int b2 = j.b();
                String str2 = null;
                if (((t63) this.f24401a).m().F() && (j.b() & 16) <= 0) {
                    agh.r("PltCameraPai", TAG, "retry face detect");
                    hx8.g(hx8.Companion.a(), j.a(), null, 2, null);
                    b2 |= 16;
                }
                if (((t63) this.f24401a).m().E() && (j.b() & 256) <= 0) {
                    agh.r("PltCameraPai", TAG, "retry channel detect");
                    ImgChannelDetectManager.Companion.b().e(new oi3(j.a(), j.g()));
                    b2 |= 256;
                }
                if (((t63) this.f24401a).m().H() && (j.b() & 261) <= 0) {
                    agh.r("PltCameraPai", TAG, "retry feature extract");
                    hre.INSTANCE.f(new y39(j.a(), null, 2, null));
                    b2 |= 261;
                }
                Uri parse = Uri.parse(j.d());
                Bitmap a2 = j.a();
                int f = j.f();
                yr3 p = ((t63) this.f24401a).p();
                Activity I = ((t63) this.f24401a).I();
                int hashCode = j.a().hashCode();
                m2d z = ((t63) this.f24401a).m().z();
                if (!(z == null || (g = z.g()) == null)) {
                    str2 = g.a();
                }
                o63.c(parse, a2, f, values, p, I, hashCode, b2, str2);
                mzu.n(p73.f25916a, "firstAlbumCacheBingoPai", 19999, new String[0]);
                agh.r("PltCameraPai", TAG, ckf.p("hit cache ", str));
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
