package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.regionedit.RegionEditView2023;
import com.etao.feimagesearch.result.FirstChildOffsetView;
import com.etao.feimagesearch.ui.coordinatorcard.CoordinatorCardView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.xlf;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class tlf extends xlf implements ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RegionEditView2023 m;
    public CoordinatorCardView n;
    public Map<String, nvn> o = new LinkedHashMap();
    public String p;
    public String q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List<t83> b;

        public a(List<t83> list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CoordinatorCardView y0 = tlf.y0(tlf.this);
            if (y0 != null) {
                y0.executeActions(this.b);
            } else {
                ckf.y("regionDigestContainer");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements RegionEditView2023.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.etao.feimagesearch.regionedit.RegionEditView2023.a
        public void A(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c47aa881", new Object[]{this, new Float(f)});
                return;
            }
            CoordinatorCardView y0 = tlf.y0(tlf.this);
            if (y0 != null) {
                y0.setLayoutTranslationX(f);
            } else {
                ckf.y("regionDigestContainer");
                throw null;
            }
        }

        @Override // com.etao.feimagesearch.regionedit.RegionEditView2023.a
        public void v(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15248682", new Object[]{this, new Float(f)});
                return;
            }
            CoordinatorCardView y0 = tlf.y0(tlf.this);
            if (y0 != null) {
                y0.setLayoutTranslationY(f);
            } else {
                ckf.y("regionDigestContainer");
                throw null;
            }
        }

        @Override // com.etao.feimagesearch.regionedit.RegionEditView2023.a
        public void y(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce5cc8eb", new Object[]{this, new Float(f)});
                return;
            }
            CoordinatorCardView y0 = tlf.y0(tlf.this);
            if (y0 != null) {
                y0.setLayoutScale(f);
            } else {
                ckf.y("regionDigestContainer");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CoordinatorCardView y0 = tlf.y0(tlf.this);
            if (y0 != null) {
                RegionEditView2023 x0 = tlf.x0(tlf.this);
                if (x0 != null) {
                    int width = x0.getImageView().getWidth();
                    RegionEditView2023 x02 = tlf.x0(tlf.this);
                    if (x02 != null) {
                        y0.setRegionRationSize(width, x02.getImageView().getHeight());
                        CoordinatorCardView y02 = tlf.y0(tlf.this);
                        if (y02 != null) {
                            RegionEditView2023 x03 = tlf.x0(tlf.this);
                            if (x03 != null) {
                                int c = hfn.c(x03.getImageView().getWidth(), caa.h(tlf.this.E()));
                                RegionEditView2023 x04 = tlf.x0(tlf.this);
                                if (x04 != null) {
                                    y02.updateRootViewMetrics(c, hfn.c(x04.getImageView().getHeight(), caa.g(tlf.this.E())));
                                    RegionEditView2023 x05 = tlf.x0(tlf.this);
                                    if (x05 != null) {
                                        x05.setImageTranslationY(0.0f);
                                    } else {
                                        ckf.y("mRegionEditView");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("mRegionEditView");
                                    throw null;
                                }
                            } else {
                                ckf.y("mRegionEditView");
                                throw null;
                            }
                        } else {
                            ckf.y("regionDigestContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("mRegionEditView");
                        throw null;
                    }
                } else {
                    ckf.y("mRegionEditView");
                    throw null;
                }
            } else {
                ckf.y("regionDigestContainer");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CoordinatorCardView y0 = tlf.y0(tlf.this);
            if (y0 != null) {
                RegionEditView2023 x0 = tlf.x0(tlf.this);
                if (x0 != null) {
                    int c = hfn.c(x0.getImageView().getWidth(), caa.h(tlf.this.E()));
                    RegionEditView2023 x02 = tlf.x0(tlf.this);
                    if (x02 != null) {
                        y0.updateRootViewMetrics(c, hfn.c(x02.getImageView().getHeight(), caa.k(tlf.this.E())));
                    } else {
                        ckf.y("mRegionEditView");
                        throw null;
                    }
                } else {
                    ckf.y("mRegionEditView");
                    throw null;
                }
            } else {
                ckf.y("regionDigestContainer");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List<t83> b;

        public e(List<t83> list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CoordinatorCardView y0 = tlf.y0(tlf.this);
            if (y0 != null) {
                y0.executeActions(this.b);
            } else {
                ckf.y("regionDigestContainer");
                throw null;
            }
        }
    }

    static {
        t2o.a(481297236);
        t2o.a(481297235);
        t2o.a(481297575);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar, xlf.a aVar) {
        super(activity, vzVar, irpDatasource, xfwVar, aVar);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
    }

    public static /* synthetic */ Object ipc$super(tlf tlfVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1919370897:
                super.e((RectF) objArr[0], (mh7) objArr[1]);
                return null;
            case 636801434:
                tlfVar.c(((Number) objArr[0]).intValue());
                return null;
            case 1083424568:
                super.K();
                return null;
            case 1437722631:
                super.m0((RectF) objArr[0], (mh7) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/preview/Irp2023CropPreviewWidget");
        }
    }

    public static final /* synthetic */ RegionEditView2023 x0(tlf tlfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionEditView2023) ipChange.ipc$dispatch("faf3ceec", new Object[]{tlfVar});
        }
        return tlfVar.m;
    }

    public static final /* synthetic */ CoordinatorCardView y0(tlf tlfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CoordinatorCardView) ipChange.ipc$dispatch("623fcf75", new Object[]{tlfVar});
        }
        return tlfVar.n;
    }

    public final y73 A0(boolean z, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y73) ipChange.ipc$dispatch("50f02cc5", new Object[]{this, new Boolean(z), str, str2, jSONObject});
        }
        y73 y73Var = new y73();
        y73Var.f(str);
        y73Var.d(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "region", str2);
        jSONObject2.put((JSONObject) slo.KEY_IS_FULL, (String) Boolean.valueOf(z));
        y73Var.e(jSONObject2);
        return y73Var;
    }

    @Override // tb.vz
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        super.K();
        hvn.INSTANCE.c(E());
    }

    @Override // tb.xlf, tb.ph7
    public void e(RectF rectF, mh7 mh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d98b96f", new Object[]{this, rectF, mh7Var});
            return;
        }
        super.e(rectF, mh7Var);
        C0(rectF);
    }

    @Override // tb.xlf
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299d4ee6", new Object[]{this});
            return;
        }
        CoordinatorCardView coordinatorCardView = this.n;
        if (coordinatorCardView != null) {
            coordinatorCardView.removeAllChild();
        } else {
            ckf.y("regionDigestContainer");
            throw null;
        }
    }

    @Override // tb.xlf
    public View j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f5a3f19f", new Object[]{this});
        }
        RegionEditView2023 regionEditView2023 = this.m;
        if (regionEditView2023 != null) {
            return regionEditView2023.getImageView();
        }
        ckf.y("mRegionEditView");
        throw null;
    }

    @Override // tb.xlf
    public int k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ede02b9d", new Object[]{this})).intValue();
        }
        RegionEditView2023 regionEditView2023 = this.m;
        if (regionEditView2023 != null) {
            return regionEditView2023.getRegionCount();
        }
        ckf.y("mRegionEditView");
        throw null;
    }

    @Override // tb.xlf
    public void m0(RectF rectF, mh7 mh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b1e807", new Object[]{this, rectF, mh7Var});
            return;
        }
        super.m0(rectF, mh7Var);
        C0(rectF);
    }

    @Override // tb.xlf
    public void o0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
            return;
        }
        RegionEditView2023 regionEditView2023 = this.m;
        if (regionEditView2023 != null) {
            regionEditView2023.post(new c());
        } else {
            ckf.y("mRegionEditView");
            throw null;
        }
    }

    @Override // tb.xlf
    public void r0(RectF rectF, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac39201a", new Object[]{this, rectF, new Integer(i), new Integer(i2)});
        } else if (rectF != null) {
            RegionEditView2023 regionEditView2023 = this.m;
            if (regionEditView2023 != null) {
                regionEditView2023.setRegionSelected(rectF);
                C0(rectF);
                return;
            }
            ckf.y("mRegionEditView");
            throw null;
        }
    }

    @Override // tb.xlf
    public void s0(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93ca023", new Object[]{this, f});
            return;
        }
        RegionEditView2023 regionEditView2023 = this.m;
        if (regionEditView2023 != null) {
            regionEditView2023.updateRegionImgDragBottomHeight(f);
        } else {
            ckf.y("mRegionEditView");
            throw null;
        }
    }

    @Override // tb.xlf
    public void t0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e4246e", new Object[]{this, new Boolean(z)});
        } else if (z) {
            RegionEditView2023 regionEditView2023 = this.m;
            if (regionEditView2023 != null) {
                regionEditView2023.setRegionAlpha(1.0f);
            } else {
                ckf.y("mRegionEditView");
                throw null;
            }
        } else {
            RegionEditView2023 regionEditView20232 = this.m;
            if (regionEditView20232 != null) {
                regionEditView20232.setRegionAlpha(0.0f);
            } else {
                ckf.y("mRegionEditView");
                throw null;
            }
        }
    }

    @Override // tb.xlf
    public void v0(List<mh7> list, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2697e", new Object[]{this, list, f});
            return;
        }
        ckf.g(list, "parts");
        RegionEditView2023 regionEditView2023 = this.m;
        if (regionEditView2023 != null) {
            regionEditView2023.setObjects(list);
            RegionEditView2023 regionEditView20232 = this.m;
            if (regionEditView20232 != null) {
                regionEditView20232.initTouchHelpers(f);
            } else {
                ckf.y("mRegionEditView");
                throw null;
            }
        } else {
            ckf.y("mRegionEditView");
            throw null;
        }
    }

    public final t83 z0(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t83) ipChange.ipc$dispatch("de95e7f8", new Object[]{this, str, str2, str3, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        t83 t83Var = new t83(str);
        t83Var.i(A0(true, str3, str2, jSONObject));
        l83 l83Var = new l83();
        l83Var.i(1);
        l83Var.f(0);
        t83Var.j(l83Var);
        t83Var.k(0);
        t83Var.h(1);
        this.p = str;
        return t83Var;
    }

    /* renamed from: B0 */
    public FirstChildOffsetView b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FirstChildOffsetView) ipChange.ipc$dispatch("31aa2d77", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_view_irp_2023_crop_preview, V(), false);
        if (inflate != null) {
            FirstChildOffsetView firstChildOffsetView = (FirstChildOffsetView) inflate;
            View findViewById = firstChildOffsetView.findViewById(R.id.region_edit_view);
            ckf.f(findViewById, "rootView.findViewById(R.id.region_edit_view)");
            this.m = (RegionEditView2023) findViewById;
            if (!W().w().e()) {
                RegionEditView2023 regionEditView2023 = this.m;
                if (regionEditView2023 != null) {
                    regionEditView2023.triggerPreviewImgViewHide();
                } else {
                    ckf.y("mRegionEditView");
                    throw null;
                }
            }
            if (!W().w().c()) {
                RegionEditView2023 regionEditView20232 = this.m;
                if (regionEditView20232 != null) {
                    regionEditView20232.triggerAnchorViewHide();
                } else {
                    ckf.y("mRegionEditView");
                    throw null;
                }
            }
            RegionEditView2023 regionEditView20233 = this.m;
            if (regionEditView20233 != null) {
                regionEditView20233.assignPreviewImgLocation(W().C());
                RegionEditView2023 regionEditView20234 = this.m;
                if (regionEditView20234 != null) {
                    regionEditView20234.optionRegionTouch(W().w().f());
                    RegionEditView2023 regionEditView20235 = this.m;
                    if (regionEditView20235 != null) {
                        regionEditView20235.setRegionCallback(this);
                        RegionEditView2023 regionEditView20236 = this.m;
                        if (regionEditView20236 != null) {
                            regionEditView20236.setRegionEditViewChangeListener(new b());
                            View findViewById2 = firstChildOffsetView.findViewById(R.id.card_container);
                            ((CoordinatorCardView) findViewById2).setChildNeedScaleWithParent(W().X());
                            ckf.f(findViewById2, "rootView.findViewById<Co…isImageTranslate())\n    }");
                            this.n = (CoordinatorCardView) findViewById2;
                            hvn.INSTANCE.b(E(), this);
                            firstChildOffsetView.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
                            return firstChildOffsetView;
                        }
                        ckf.y("mRegionEditView");
                        throw null;
                    }
                    ckf.y("mRegionEditView");
                    throw null;
                }
                ckf.y("mRegionEditView");
                throw null;
            }
            ckf.y("mRegionEditView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.result.FirstChildOffsetView");
    }

    @Override // tb.xlf
    public void q0(Bitmap bitmap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc531d62", new Object[]{this, bitmap, new Boolean(z)});
        } else if (bitmap == null) {
            FirstChildOffsetView X = X();
            if (X != null) {
                X.setVisibility(8);
            }
        } else {
            d(bitmap);
            RegionEditView2023 regionEditView2023 = this.m;
            if (regionEditView2023 != null) {
                regionEditView2023.setBitmap(bitmap);
                RegionEditView2023 regionEditView20232 = this.m;
                if (regionEditView20232 != null) {
                    regionEditView20232.post(new d());
                    FirstChildOffsetView X2 = X();
                    if (X2 != null) {
                        X2.setCenter(false);
                        return;
                    }
                    return;
                }
                ckf.y("mRegionEditView");
                throw null;
            }
            ckf.y("mRegionEditView");
            throw null;
        }
    }

    public final void C0(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47b1adf", new Object[]{this, rectF});
            return;
        }
        String f = trl.f(rectF);
        if (f != null && !TextUtils.isEmpty(f)) {
            ArrayList arrayList = new ArrayList();
            String str = this.p;
            if (str != null && !TextUtils.isEmpty(str)) {
                t83 t83Var = new t83(str);
                t83Var.k(1);
                arrayList.add(t83Var);
            }
            nvn nvnVar = this.o.get(this.q);
            if (nvnVar != null) {
                t83 t83Var2 = new t83(nvnVar.a());
                t83Var2.k(3);
                arrayList.add(t83Var2);
            }
            nvn nvnVar2 = this.o.get(f);
            if (nvnVar2 != null) {
                t83 t83Var3 = new t83(nvnVar2.a());
                t83Var3.k(2);
                arrayList.add(t83Var3);
                this.q = f;
                String f2 = trl.f(trl.e(f, 1, 1));
                ckf.f(f2, "parseRectF2Str(ParseUtil…ctF(targetCardKey, 1, 1))");
                t83 z0 = z0(f2, f, nvnVar2.b().b(), nvnVar2.b().a());
                if (z0 != null) {
                    arrayList.add(z0);
                }
            }
            CoordinatorCardView coordinatorCardView = this.n;
            if (coordinatorCardView != null) {
                coordinatorCardView.executeActions(arrayList);
                this.q = f;
                return;
            }
            ckf.y("regionDigestContainer");
            throw null;
        }
    }

    @Override // tb.ptk
    public void r(JSONObject jSONObject) {
        zmf.a r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eba21b0", new Object[]{this, jSONObject});
        } else if (h19.e(jSONObject, "isScanRegion", false)) {
            String i = h19.i(jSONObject, "region", "");
            if (!TextUtils.isEmpty(i) && (r = W().r(trl.e(i, 1, 1))) != null) {
                zmf.g().d((FragmentActivity) E(), r);
            }
        } else if (h19.e(jSONObject, "isRegionChange", false)) {
            RectF e2 = trl.e(h19.i(jSONObject, "region", ""), 1, 1);
            if (e2 != null) {
                RegionEditView2023 regionEditView2023 = this.m;
                if (regionEditView2023 != null) {
                    regionEditView2023.setRegionSelected(e2);
                    m0(e2, null);
                    return;
                }
                ckf.y("mRegionEditView");
                throw null;
            }
        } else {
            xlf.a i0 = i0();
            if (i0 != null) {
                i0.a();
            }
        }
    }

    @Override // tb.xlf
    public void l0(List<ivn> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acea64a3", new Object[]{this, list});
            return;
        }
        ckf.g(list, "parts");
        if (!list.isEmpty() && !this.o.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<ivn> it = list.iterator();
            while (true) {
                JSONObject jSONObject = null;
                if (!it.hasNext()) {
                    break;
                }
                ivn next = it.next();
                RectF e2 = trl.e(next.c(), 1, 1);
                if (e2 != null) {
                    float centerY = e2.centerY();
                    float centerX = e2.centerX();
                    String f = trl.f(new RectF(centerX, centerY, centerX, centerY));
                    ckf.f(f, "smallCardLocateValue");
                    t83 t83Var = new t83(f);
                    String b2 = next.b();
                    String c2 = next.c();
                    if (next.d()) {
                        jSONObject = next.a();
                    }
                    t83Var.i(A0(false, b2, c2, jSONObject));
                    l83 l83Var = new l83();
                    l83Var.i(0);
                    RectF rectF = new RectF(e2);
                    l83Var.j(rectF);
                    l83Var.f(rectF.width() > rectF.height() ? 2 : 1);
                    l83Var.h(true);
                    t83Var.j(l83Var);
                    t83Var.k(0);
                    arrayList.add(t83Var);
                    this.o.put(next.c(), new nvn(f, next, 0, false, 12, null));
                }
            }
            CoordinatorCardView coordinatorCardView = this.n;
            if (coordinatorCardView != null) {
                coordinatorCardView.post(new a(arrayList));
            } else {
                ckf.y("regionDigestContainer");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.xlf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w0(java.util.List<tb.ivn> r18) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tlf.w0(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.xlf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u0(java.util.List<tb.ivn> r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tlf.u0(java.util.List):void");
    }
}
