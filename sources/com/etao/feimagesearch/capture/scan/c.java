package com.etao.feimagesearch.capture.scan;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.IDecodeTask;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.taobao.scancode.gateway.util.ScancodeController;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.util.ArrayList;
import java.util.HashMap;
import tb.agh;
import tb.g1a;
import tb.hvm;
import tb.jso;
import tb.jzu;
import tb.kso;
import tb.lg4;
import tb.lso;
import tb.mzu;
import tb.nmd;
import tb.o4w;
import tb.oda;
import tb.p73;
import tb.p7m;
import tb.pso;
import tb.pw6;
import tb.pyb;
import tb.qyb;
import tb.s63;
import tb.t2o;
import tb.tro;
import tb.vro;
import tb.wro;
import tb.x6n;
import tb.xhv;
import tb.y6n;
import tb.zb7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class c implements pyb, hvm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int o = zb7.a(44.0f);

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f4667a;
    public MaType[] b;
    public long c;
    public com.taobao.taobao.scancode.gateway.util.a d;
    public final vro g;
    public IDecodeTask h;
    public final pw6 j;
    public HashMap<String, String> k;
    public final oda n;
    public volatile boolean e = false;
    public volatile DecodeState f = DecodeState.IDLE;
    public Boolean l = null;
    public volatile boolean m = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements nmd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.nmd
        public HashMap<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("5f815aaa", new Object[]{this});
            }
            return c.b(c.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements qyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a f4669a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements wro.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kso[] f4670a;
            public final /* synthetic */ String b;

            public a(kso[] ksoVarArr, String str) {
                this.f4670a = ksoVarArr;
                this.b = str;
            }

            @Override // tb.wro.a
            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e3e5f199", new Object[]{this, new Integer(i)});
                    return;
                }
                if (i >= 0) {
                    kso[] ksoVarArr = this.f4670a;
                    if (i <= ksoVarArr.length) {
                        kso ksoVar = ksoVarArr[i];
                        if (ksoVar == null) {
                            b.this.f4669a.invoke(Boolean.TRUE);
                            return;
                        } else if (ksoVar.c() == null) {
                            b.this.f4669a.invoke(Boolean.TRUE);
                            return;
                        } else {
                            if (!c.c(c.this).f()) {
                                b.this.f4669a.invoke(Boolean.TRUE);
                            }
                            c.d(c.this, ksoVar, this.b);
                            return;
                        }
                    }
                }
                b.this.f4669a.invoke(Boolean.TRUE);
            }

            @Override // tb.wro.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("49cc7651", new Object[]{this});
                    return;
                }
                b.this.f4669a.invoke(Boolean.FALSE);
                c.this.startPreview();
            }
        }

        public b(g1a g1aVar) {
            this.f4669a = g1aVar;
        }

        @Override // tb.qyb
        public void a(com.etao.feimagesearch.capture.scan.b bVar, lso lsoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c83b7d12", new Object[]{this, bVar, lsoVar});
            } else if (lsoVar == null) {
                this.f4669a.invoke(Boolean.FALSE);
            } else if (lsoVar.d() == null || lsoVar.c() == null) {
                this.f4669a.invoke(Boolean.FALSE);
            } else if (!c.c(c.this).f()) {
                this.f4669a.invoke(Boolean.FALSE);
            } else {
                kso[] d = lsoVar.d();
                KakaLibImageWrapper u = bVar.u();
                String h = u.h();
                c.c(c.this).l(false, new wro(lsoVar.b(), lsoVar.c(), new a(d, h), c.H(c.c(c.this), lsoVar.c(), lsoVar.d(), lsoVar.b(), h), new y6n(u.d(), bVar.v(), u)));
            }
        }

        @Override // tb.qyb
        public void b(com.etao.feimagesearch.capture.scan.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13cd52db", new Object[]{this, bVar});
            } else {
                this.f4669a.invoke(Boolean.TRUE);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.etao.feimagesearch.capture.scan.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class C0235c implements wro.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kso[] f4671a;
        public final /* synthetic */ String b;

        public C0235c(kso[] ksoVarArr, String str) {
            this.f4671a = ksoVarArr;
            this.b = str;
        }

        @Override // tb.wro.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49cc7651", new Object[]{this});
                return;
            }
            agh.h("_scancode_ScancodeBizManager", "onBackButtonPressed");
            c.this.startPreview();
        }

        @Override // tb.wro.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3e5f199", new Object[]{this, new Integer(i)});
                return;
            }
            agh.h("_scancode_ScancodeBizManager", "onScanCodeHasChosen: index = " + i);
            c.e(c.this, false);
            if (i >= 0) {
                kso[] ksoVarArr = this.f4671a;
                if (i <= ksoVarArr.length) {
                    c.d(c.this, ksoVarArr[i], this.b);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType;

        static {
            int[] iArr = new int[ScancodeType.values().length];
            $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType = iArr;
            try {
                iArr[ScancodeType.PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[ScancodeType.QR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[ScancodeType.EXPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[ScancodeType.MEDICINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[ScancodeType.ANTI_FAKE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[ScancodeType.GEN3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[ScancodeType.TB_4G.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[ScancodeType.DM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        t2o.a(730857591);
        t2o.a(481296695);
        t2o.a(760217732);
        t2o.a(481296694);
    }

    public c(FragmentActivity fragmentActivity, vro vroVar, oda odaVar) {
        this.f4667a = fragmentActivity;
        this.g = vroVar;
        this.n = odaVar;
        if (this.j == null) {
            this.j = new pw6(fragmentActivity);
        }
        if (!lg4.g1()) {
            h();
        }
    }

    public static /* synthetic */ HashMap b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d6f2788b", new Object[]{cVar});
        }
        return cVar.i();
    }

    public static /* synthetic */ vro c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vro) ipChange.ipc$dispatch("a42ef0d3", new Object[]{cVar});
        }
        return cVar.g;
    }

    public static /* synthetic */ void d(c cVar, kso ksoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2cabcf", new Object[]{cVar, ksoVar, str});
        } else {
            cVar.C(ksoVar, str);
        }
    }

    public static /* synthetic */ boolean e(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a9b058b", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.e = z;
        return z;
    }

    public final void B(KakaLibImageWrapper kakaLibImageWrapper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65ab38a", new Object[]{this, kakaLibImageWrapper, new Integer(i)});
        } else if (p()) {
            g(DecodeState.IDLE);
            startPreview();
            vro vroVar = this.g;
            if (vroVar != null) {
                vroVar.g(true, new y6n(kakaLibImageWrapper.d(), i, kakaLibImageWrapper));
            }
        } else {
            g(DecodeState.IDLE);
        }
    }

    public final void E(kso ksoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9665c3c3", new Object[]{this, ksoVar});
        } else if (!this.g.f()) {
        } else {
            if (ksoVar.c() != null || ksoVar.d() != null) {
                o4w.a();
            }
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        x();
        y();
    }

    public void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4b8d8d", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    @Override // tb.pyb
    public void a(com.etao.feimagesearch.capture.scan.b bVar, lso lsoVar) {
        kso[] ksoVarArr;
        Rect[] rectArr;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83b7d12", new Object[]{this, bVar, lsoVar});
            return;
        }
        KakaLibImageWrapper u = bVar.u();
        if (lsoVar != null) {
            Bitmap b2 = lsoVar.b();
            Rect[] c = lsoVar.c();
            ksoVarArr = lsoVar.d();
            bitmap = b2;
            rectArr = c;
        } else {
            bitmap = null;
            rectArr = null;
            ksoVarArr = null;
        }
        if (ksoVarArr != null && ksoVarArr.length > 0) {
            h();
            E(ksoVarArr[0]);
            mzu.i(s63.ALBUM_PAGE_NAME, "ScanPicSuc", new String[0]);
            if (rectArr == null || rectArr.length != ksoVarArr.length || bitmap == null) {
                C(ksoVarArr[0], u.h());
            } else {
                D(u, bitmap, rectArr, ksoVarArr, u.h(), bVar.v());
            }
        } else if (!p() || u.g() == null) {
            B(u, bVar.v());
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ff34769", new Object[]{this})).booleanValue();
        }
        if (this.c == 0) {
            this.c = SystemClock.elapsedRealtime();
            return true;
        } else if (SystemClock.elapsedRealtime() - this.c > 1000) {
            return true;
        } else {
            return false;
        }
    }

    public void g(DecodeState decodeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf445cfe", new Object[]{this, decodeState});
        } else if (this.f != decodeState) {
            agh.h("_scancode_ScancodeBizManager", "changeDecodeState: old=" + this.f + ", new=" + decodeState);
            this.f = decodeState;
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ecfcfc", new Object[]{this});
        } else if (lg4.h1()) {
            o();
        } else {
            r();
        }
    }

    public final HashMap<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("408fa3cb", new Object[]{this});
        }
        if (this.k == null) {
            this.k = tro.a(this.g.b(), this.g.k());
        }
        return this.k;
    }

    public final ScanMode j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScanMode) ipChange.ipc$dispatch("e7b0996b", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return ScanMode.ACCURATE_MODE;
        }
        return ScanMode.TOUGH_MODE;
    }

    public final nmd k(vro vroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmd) ipChange.ipc$dispatch("a9efd280", new Object[]{this, vroVar});
        }
        return new a();
    }

    public boolean l(FragmentActivity fragmentActivity, MaResult maResult, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c761d71", new Object[]{this, fragmentActivity, maResult, str})).booleanValue();
        }
        return this.d.s(maResult, null, str);
    }

    public final qyb m(g1a<Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qyb) ipChange.ipc$dispatch("16cb5ecc", new Object[]{this, g1aVar});
        }
        return new b(g1aVar);
    }

    public final MaType[] n(pso psoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaType[]) ipChange.ipc$dispatch("c59f437", new Object[]{this, psoVar});
        }
        ArrayList arrayList = new ArrayList();
        for (ScancodeType scancodeType : psoVar.d()) {
            switch (d.$SwitchMap$com$taobao$android$scancode$common$object$ScancodeType[scancodeType.ordinal()]) {
                case 1:
                    arrayList.add(MaType.PRODUCT);
                    break;
                case 2:
                    arrayList.add(MaType.QR);
                    break;
                case 3:
                    arrayList.add(MaType.EXPRESS);
                    break;
                case 4:
                    arrayList.add(MaType.MEDICINE);
                    break;
                case 5:
                    arrayList.add(MaType.TB_ANTI_FAKE);
                    break;
                case 6:
                    arrayList.add(MaType.GEN3);
                    break;
                case 7:
                    arrayList.add(MaType.TB_4G);
                    break;
                case 8:
                    arrayList.add(MaType.DM);
                    break;
            }
        }
        MaType[] maTypeArr = new MaType[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            maTypeArr[i] = (MaType) arrayList.get(i);
        }
        return maTypeArr;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f35492d2", new Object[]{this});
        } else if (!this.m) {
            synchronized (this) {
                try {
                    if (!this.m) {
                        r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e92723b", new Object[]{this})).booleanValue();
        }
        if (this.f == DecodeState.ALBUM_DECODE) {
            return true;
        }
        return false;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88cce2f3", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdc8ea3", new Object[]{this});
        } else if (!this.m) {
            jso jsoVar = new jso();
            jsoVar.j(this.f4667a);
            this.b = n(jsoVar.d);
            com.taobao.taobao.scancode.gateway.util.a aVar = new com.taobao.taobao.scancode.gateway.util.a(jsoVar, new ScancodeController(this), this.f4667a, k(this.g));
            this.d = aVar;
            aVar.G("Page_ScanHome");
            this.m = true;
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.j.p();
        }
    }

    @Override // tb.hvm
    public void startPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
            return;
        }
        g(DecodeState.IDLE);
        this.e = false;
    }

    @Override // tb.hvm
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
        } else {
            g(DecodeState.PREVIEW_DECODE);
        }
    }

    public void t(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        ScanFromEnum scanFromEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503f4ecb", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6), new Boolean(z2)});
            return;
        }
        if (this.l == null) {
            this.l = Boolean.valueOf(lg4.y1());
        }
        if (!this.l.booleanValue() && i3 != 0 && i4 != 0 && this.f == DecodeState.IDLE) {
            h();
            if (f()) {
                g(DecodeState.PREVIEW_DECODE);
                if (tro.c(this.f4667a)) {
                    scanFromEnum = ScanFromEnum.SYS_CAMERA;
                } else {
                    scanFromEnum = ScanFromEnum.PLT_CAMERA;
                }
                KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(bArr, i, i2, i5, scanFromEnum.getScanFrom());
                kakaLibImageWrapper.o(this.b);
                kakaLibImageWrapper.g = new Rect(0, 0, i3, i4);
                kakaLibImageWrapper.h = new Rect(0, o, i3, i4);
                com.etao.feimagesearch.capture.scan.b bVar = new com.etao.feimagesearch.capture.scan.b(z, kakaLibImageWrapper, i6, i(), 1, PhotoFrom.Values.Got_CODE, new com.etao.feimagesearch.capture.scan.a(this, this, this.n), z2);
                this.j.a(bVar, 0L);
                this.h = bVar;
            }
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        agh.h("_scancode_ScancodeBizManager", "onPause");
        IDecodeTask iDecodeTask = this.h;
        if (iDecodeTask != null && !((com.etao.feimagesearch.capture.scan.b) iDecodeTask).D()) {
            ((com.etao.feimagesearch.capture.scan.b) this.h).f(IDecodeTask.TaskStatus.CANCELLED);
            this.h = null;
        }
        pw6 pw6Var = this.j;
        if (pw6Var != null) {
            pw6Var.q();
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        IDecodeTask iDecodeTask = this.h;
        if (iDecodeTask != null) {
            ((com.etao.feimagesearch.capture.scan.b) iDecodeTask).f(IDecodeTask.TaskStatus.CANCELLED);
            this.h = null;
        }
        startPreview();
    }

    public final void z(MaResult maResult, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a261312", new Object[]{this, maResult, new Boolean(z), str});
            return;
        }
        stopPreview();
        this.g.e(z);
        if (l(this.f4667a, maResult, str)) {
            startPreview();
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public final void D(KakaLibImageWrapper kakaLibImageWrapper, Bitmap bitmap, Rect[] rectArr, kso[] ksoVarArr, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54e5c56", new Object[]{this, kakaLibImageWrapper, bitmap, rectArr, ksoVarArr, str, new Integer(i)});
            return;
        }
        agh.h("_scancode_ScancodeBizManager", "processScanResultWithAnchor");
        if (rectArr == null || ksoVarArr == null || ksoVarArr.length == 0 || rectArr.length != ksoVarArr.length) {
            B(kakaLibImageWrapper, i);
        } else if (!this.g.f()) {
            g(DecodeState.IDLE);
        } else if (!q()) {
            this.g.l(p(), new wro(bitmap, rectArr, new C0235c(ksoVarArr, str), (!p() || !lg4.h0()) ? false : H(this.g, rectArr, ksoVarArr, bitmap, kakaLibImageWrapper.h()), new y6n(kakaLibImageWrapper.d(), i, kakaLibImageWrapper)));
        }
    }

    public static boolean H(vro vroVar, Rect[] rectArr, kso[] ksoVarArr, Bitmap bitmap, String str) {
        MaType type;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("971daf03", new Object[]{vroVar, rectArr, ksoVarArr, bitmap, str})).booleanValue();
        }
        if (vroVar != null && ScanFromEnum.SYS_ALBUM.getScanFrom().equalsIgnoreCase(str)) {
            agh.h("_scancode_ScancodeBizManager", "scan from sys_album");
            return true;
        } else if (ksoVarArr.length != rectArr.length) {
            return false;
        } else {
            for (int i = 0; i < ksoVarArr.length; i++) {
                kso ksoVar = ksoVarArr[i];
                Rect rect = rectArr[i];
                MaResult c = ksoVar.c();
                if (c != null && ((type = c.getType()) == MaType.GEN3 || ((type == MaType.QR || type == MaType.TB_ANTI_FAKE || type == MaType.TB_4G) && rect.width() * rect.height() * 2 > bitmap.getWidth() * bitmap.getHeight()))) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void C(kso ksoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee429780", new Object[]{this, ksoVar, str});
            return;
        }
        x6n d2 = ksoVar.d();
        if (d2 != null) {
            if (!this.g.f()) {
                g(DecodeState.IDLE);
                return;
            }
            MaResult a2 = d2.a();
            if (a2 == null) {
                g(DecodeState.IDLE);
                return;
            }
            if (!(a2.getType() == null || a2.getText() == null)) {
                p7m.a("scan", "相机扫码 type " + a2.getType().name() + " content " + a2.getText());
            }
            z(d2.a(), false, str);
            if (ksoVar.d().a() != null) {
                jzu.i(p73.f25916a, "scanSuccess", "content", ksoVar.d().a().getText());
            }
        } else if (ksoVar.c() != null && this.g.f()) {
            if (!(ksoVar.c().getType() == null || ksoVar.c().getText() == null)) {
                p7m.a("scan", "相册扫码 type " + ksoVar.c().getType().name() + " content " + ksoVar.c().getText());
            }
            jzu.i(p73.f25916a, "scanSuccess", "content", ksoVar.c().getText());
            z(ksoVar.c(), true, str);
        }
    }

    public KakaLibImageWrapper w(Bitmap bitmap, Size size, long j, g1a<Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibImageWrapper) ipChange.ipc$dispatch("8287551", new Object[]{this, bitmap, size, new Long(j), g1aVar});
        }
        h();
        g(DecodeState.ALBUM_DECODE);
        IDecodeTask iDecodeTask = this.h;
        if (iDecodeTask != null) {
            ((com.etao.feimagesearch.capture.scan.b) iDecodeTask).f(IDecodeTask.TaskStatus.CANCELLED);
            this.h = null;
        }
        KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(bitmap, ScanFromEnum.SMART_LENS.getScanFrom());
        kakaLibImageWrapper.l(bitmap.getHeight());
        kakaLibImageWrapper.p(bitmap.getWidth());
        kakaLibImageWrapper.o(this.b);
        kakaLibImageWrapper.m(this.f4667a.getApplicationContext());
        kakaLibImageWrapper.g = new Rect(0, 0, size.getWidth(), size.getHeight());
        kakaLibImageWrapper.h = new Rect(0, 0, size.getWidth(), size.getHeight());
        com.etao.feimagesearch.capture.scan.b bVar = new com.etao.feimagesearch.capture.scan.b(kakaLibImageWrapper, ScanMode.ACCURATE_MODE, i(), 2, m(g1aVar), PhotoFrom.Values.AUTO_DETECT, false, 0, false);
        this.j.a(bVar, j);
        this.h = bVar;
        agh.h("_scancode_ScancodeBizManager", "onGetAutoDetectBitmap: token=" + kakaLibImageWrapper.hashCode() + ", timeout=0");
        return kakaLibImageWrapper;
    }

    public KakaLibImageWrapper v(Bitmap bitmap, Rect rect, PhotoFrom.Values values, long j, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibImageWrapper) ipChange.ipc$dispatch("ba7962eb", new Object[]{this, bitmap, rect, values, new Long(j), str, new Boolean(z)});
        }
        h();
        g(DecodeState.ALBUM_DECODE);
        IDecodeTask iDecodeTask = this.h;
        if (iDecodeTask != null) {
            ((com.etao.feimagesearch.capture.scan.b) iDecodeTask).f(IDecodeTask.TaskStatus.CANCELLED);
            this.h = null;
        }
        KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(bitmap, str);
        kakaLibImageWrapper.l(bitmap.getHeight());
        kakaLibImageWrapper.p(bitmap.getWidth());
        kakaLibImageWrapper.o(this.b);
        kakaLibImageWrapper.m(this.f4667a.getApplicationContext());
        kakaLibImageWrapper.g = rect;
        com.etao.feimagesearch.capture.scan.b bVar = new com.etao.feimagesearch.capture.scan.b(kakaLibImageWrapper, ScanMode.ACCURATE_MODE, i(), 2, new com.etao.feimagesearch.capture.scan.a(this, this, this.n), values, z, 0, false);
        this.j.a(bVar, j);
        this.h = bVar;
        agh.h("_scancode_ScancodeBizManager", "onGetRealtimeBitmap: token=" + kakaLibImageWrapper.hashCode() + ", timeout=" + j);
        return kakaLibImageWrapper;
    }

    public KakaLibImageWrapper u(Context context, String str, Bitmap bitmap, int i, PhotoFrom.Values values, Rect rect, long j) {
        ScanFromEnum scanFromEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibImageWrapper) ipChange.ipc$dispatch("b6e1ffa0", new Object[]{this, context, str, bitmap, new Integer(i), values, rect, new Long(j)});
        }
        agh.r("Scan", "_scancode_ScancodeBizManager", "onGetAlbumImage " + str + ", timeoutConfig=" + j);
        h();
        stopPreview();
        int a2 = this.g.a();
        if (tro.c(this.f4667a)) {
            scanFromEnum = ScanFromEnum.SYS_ALBUM;
        } else {
            scanFromEnum = ScanFromEnum.PLT_ALBUM;
        }
        String scanFrom = scanFromEnum.getScanFrom();
        if (p()) {
            KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(str, scanFrom);
            B(kakaLibImageWrapper, i);
            return kakaLibImageWrapper;
        }
        g(DecodeState.ALBUM_DECODE);
        IDecodeTask iDecodeTask = this.h;
        if (iDecodeTask != null) {
            ((com.etao.feimagesearch.capture.scan.b) iDecodeTask).f(IDecodeTask.TaskStatus.CANCELLED);
            this.h = null;
        }
        ScanMode j2 = j(a2);
        KakaLibImageWrapper kakaLibImageWrapper2 = new KakaLibImageWrapper(str, scanFrom);
        kakaLibImageWrapper2.n(str);
        kakaLibImageWrapper2.k(bitmap);
        kakaLibImageWrapper2.p(bitmap.getWidth());
        kakaLibImageWrapper2.l(bitmap.getHeight());
        kakaLibImageWrapper2.m(context);
        kakaLibImageWrapper2.g = rect;
        com.etao.feimagesearch.capture.scan.b bVar = new com.etao.feimagesearch.capture.scan.b(kakaLibImageWrapper2, j2, i(), 3, new com.etao.feimagesearch.capture.scan.a(this, this, this.n), values, true, i, lg4.j1());
        this.j.a(bVar, j);
        this.h = bVar;
        agh.h("_scancode_ScancodeBizManager", "onGetAlbumImage: token=" + str.hashCode() + ", timeout=" + j);
        return kakaLibImageWrapper2;
    }
}
