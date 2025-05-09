package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class oss implements qlb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "_scancode_TakePhotoManager";

    /* renamed from: a  reason: collision with root package name */
    public final com.etao.feimagesearch.capture.scan.c f25624a;
    public final Activity b;
    public final CaptureManager c;
    public final yr3 d;
    public final View e;
    public nss f;
    public final boolean g = lg4.R0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(730857572);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            oss.b(oss.this).D0();
            agh.r("Dynamic", "promptImageDark", upx.PHOTO_CANCEL_SCAN);
            jzu.e(upx.PHOTO_CANCEL_SCAN, new String[0]);
        }
    }

    static {
        t2o.a(730857571);
        t2o.a(481297500);
    }

    public oss(com.etao.feimagesearch.capture.scan.c cVar, Activity activity, CaptureManager captureManager, yr3 yr3Var, View view) {
        ckf.g(cVar, "scancodeBizManager");
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        ckf.g(yr3Var, "pageModel");
        ckf.g(view, "rootView");
        this.f25624a = cVar;
        this.b = activity;
        this.c = captureManager;
        this.d = yr3Var;
        this.e = view;
    }

    public static final /* synthetic */ HashMap a(oss ossVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6ff78fb9", new Object[]{ossVar});
        }
        return ossVar.e();
    }

    public static final /* synthetic */ CaptureManager b(oss ossVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("889eb5e1", new Object[]{ossVar});
        }
        return ossVar.c;
    }

    public static final /* synthetic */ yr3 c(oss ossVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr3) ipChange.ipc$dispatch("d2a2d390", new Object[]{ossVar});
        }
        return ossVar.d;
    }

    public static final /* synthetic */ void d(oss ossVar, Activity activity, Bitmap bitmap, boolean z, yr3 yr3Var, Map map, int i, PhotoFrom.Values values) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a24481", new Object[]{ossVar, activity, bitmap, new Boolean(z), yr3Var, map, new Integer(i), values});
        } else {
            ossVar.l(activity, bitmap, z, yr3Var, map, i, values);
        }
    }

    public final Activity g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.b;
    }

    public final Rect h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("29d992f1", new Object[]{this});
        }
        return new Rect(0, 0, this.e.getWidth(), this.e.getHeight());
    }

    public final nss i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nss) ipChange.ipc$dispatch("d186ece3", new Object[]{this});
        }
        return this.f;
    }

    public final void l(Activity activity, Bitmap bitmap, boolean z, yr3 yr3Var, Map<String, String> map, int i, PhotoFrom.Values values) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b2b140", new Object[]{this, activity, bitmap, new Boolean(z), yr3Var, map, new Integer(i), values});
        } else {
            o63.a(activity, bitmap, z, yr3Var, map, this.c.d(yr3Var), i, values);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.f = null;
        }
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d20426", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.f = null;
        }
    }

    public final void p(Bitmap bitmap, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33dc448", new Object[]{this, bitmap, activity, new Boolean(z)});
        } else if (this.c.U()) {
            g9o.a(activity, "", Localization.q(R.string.taobao_app_1007_1_19055), Localization.q(R.string.taobao_app_1007_1_19044), new b(), Localization.q(R.string.taobao_app_1007_1_19043), new c(bitmap, activity, z));
        }
    }

    public final void q(nss nssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528cb941", new Object[]{this, nssVar});
        } else {
            this.f = nssVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ boolean d;

        public c(Bitmap bitmap, Activity activity, boolean z) {
            this.b = bitmap;
            this.c = activity;
            this.d = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            oss.b(oss.this).D0();
            jzu.e("continueupload", new String[0]);
            agh.r("Dynamic", "promptImageDark", "continueupload");
            if (oss.b(oss.this).F()) {
                hx8.g(hx8.Companion.a(), this.b, null, 2, null);
                i2 = 16;
            } else {
                i2 = 0;
            }
            oss ossVar = oss.this;
            oss.d(ossVar, this.c, this.b, this.d, oss.c(ossVar), oss.a(oss.this), i2, PhotoFrom.Values.TAKE);
        }
    }

    public final HashMap<String, String> e() {
        qu3 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f789d128", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        m2d z = this.c.z();
        if (!(z == null || (g = z.g()) == null)) {
            hashMap.put(qu3.KEY, g.a());
        }
        ok1 ok1Var = this.c.X;
        if (ok1Var != null && ok1Var.d()) {
            hashMap.put("noFrontRetake", "true");
        }
        return hashMap;
    }

    public final void f(int i, Bitmap bitmap, boolean z) {
        boolean z2;
        String str;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6b3f85", new Object[]{this, new Integer(i), bitmap, new Boolean(z)});
            return;
        }
        agh.h(TAG, ckf.p("try to decode after take photo ", bitmap));
        mzu.n(p73.f25916a, "decodeAfterTakePhoto", 19999, new String[0]);
        if (ckf.b(this.c.s(), "scan")) {
            j = lg4.v3();
            str = ScanFromEnum.SYS_CAMERA.getScanFrom();
            z2 = false;
        } else {
            String scanFrom = ScanFromEnum.PLT_CAMERA.getScanFrom();
            j = 0;
            z2 = this.g;
            str = scanFrom;
        }
        KakaLibImageWrapper v = this.f25624a.v(bitmap, h(), PhotoFrom.Values.TAKE, j, str, z2);
        ckf.f(v, "wrapper");
        this.f = new nss(i, bitmap, v, z);
    }

    @Override // tb.qlb
    public void j(Bitmap bitmap, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8f6b2e", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(bitmap, "snapshot");
        pmf.H0();
        mzu.n(p73.f25916a, "onCaptureFinished", 19999, new String[0]);
        k(bitmap, z, z2);
    }

    public final void k(Bitmap bitmap, boolean z, boolean z2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95588659", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            p(bitmap, this.b, z2);
        } else {
            if (this.c.F()) {
                hx8.g(hx8.Companion.a(), bitmap, null, 2, null);
                i = 16;
            } else {
                i = 0;
            }
            if (this.c.H()) {
                hre.INSTANCE.f(new y39(bitmap, null, 2, null));
                i |= 261;
            }
            if (ckf.b(this.c.s(), "scan") || this.g) {
                f(i, bitmap, z2);
            } else {
                agh.h(TAG, "direct jump");
                l(this.b, bitmap, z2, this.d, e(), i, PhotoFrom.Values.TAKE);
            }
        }
        jzu.e("Take", new String[0]);
    }

    public final boolean n(boolean z, y6n y6nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7b40ff3", new Object[]{this, new Boolean(z), y6nVar})).booleanValue();
        }
        ckf.g(y6nVar, "qrCodeNotFoundEvent");
        nss nssVar = this.f;
        if (nssVar != null) {
            KakaLibImageWrapper kakaLibImageWrapper = y6nVar.c;
            agh.h(TAG, "onScanFailed cachedImageWrapper=" + nssVar.b() + ", outImageWrapper=" + kakaLibImageWrapper);
            if (kakaLibImageWrapper != null && ckf.b(kakaLibImageWrapper, nssVar.b())) {
                agh.h(TAG, ckf.p("not scan code in photo ", kakaLibImageWrapper));
                q(null);
                mzu.n(p73.f25916a, "decodeFailedAfterTakePhoto", 19999, new String[0]);
                if (ckf.b(this.c.s(), "scan")) {
                    i0u.f(g(), lg4.a3(), 0);
                }
                l(g(), nssVar.c(), nssVar.d(), this.d, e(), nssVar.a(), PhotoFrom.Values.TAKE);
                return true;
            }
        }
        return false;
    }
}
