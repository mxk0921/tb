package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.immerse.ImgPreviewView;
import com.etao.feimagesearch.immerse.IrpManager;
import com.etao.feimagesearch.regionedit.RegionEditView2023;
import com.etao.feimagesearch.struct.ViewWidget;
import com.etao.feimagesearch.ui.coordinatorcard.CoordinatorCardView;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class vre extends ViewWidget<FrameLayout, IrpManager, vre> implements RegionEditView2023.a, ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImgPreviewView l;
    public FrameLayout m;
    public CoordinatorCardView n;
    public Map<String, nvn> o = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CoordinatorCardView i0 = vre.i0(vre.this);
            if (i0 != null) {
                ImgPreviewView h0 = vre.h0(vre.this);
                if (h0 != null) {
                    int c = hfn.c(h0.getImageView().getWidth(), caa.h(vre.this.E()));
                    ImgPreviewView h02 = vre.h0(vre.this);
                    if (h02 != null) {
                        i0.updateRootViewMetrics(c, hfn.c(h02.getImageView().getHeight(), caa.k(vre.this.E())));
                    } else {
                        ckf.y("imgPreviewView");
                        throw null;
                    }
                } else {
                    ckf.y("imgPreviewView");
                    throw null;
                }
            } else {
                ckf.y("regionContainer");
                throw null;
            }
        }
    }

    static {
        t2o.a(481296965);
        t2o.a(481297381);
        t2o.a(481297575);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vre(Activity activity, Object obj, IrpManager irpManager, xfw xfwVar) {
        super(activity, obj, irpManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(irpManager, ThemisConfig.SCENE_MANAGER);
        ckf.g(xfwVar, "viewSetter");
    }

    public static final /* synthetic */ ImgPreviewView h0(vre vreVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImgPreviewView) ipChange.ipc$dispatch("15b46e85", new Object[]{vreVar});
        }
        return vreVar.l;
    }

    public static final /* synthetic */ CoordinatorCardView i0(vre vreVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CoordinatorCardView) ipChange.ipc$dispatch("a1ecf544", new Object[]{vreVar});
        }
        return vreVar.n;
    }

    public static /* synthetic */ Object ipc$super(vre vreVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1083424568) {
            super.K();
            return null;
        } else if (hashCode == 1250151579) {
            super.G();
            return null;
        } else if (hashCode == 1585798659) {
            super.q((String) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/immerse/ImmersePreviewWidget");
        }
    }

    @Override // com.etao.feimagesearch.regionedit.RegionEditView2023.a
    public void A(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47aa881", new Object[]{this, new Float(f)});
            return;
        }
        CoordinatorCardView coordinatorCardView = this.n;
        if (coordinatorCardView != null) {
            coordinatorCardView.setLayoutTranslationX(f);
        } else {
            ckf.y("regionContainer");
            throw null;
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        super.G();
        hvn.INSTANCE.b(E(), this);
        W().c().c(gnf.EVENT_IDENTIFY_REGION_UPDATE, this);
        W().c().c(gnf.EVENT_PREVIEW_BITMAP_UPDATE, this);
        W().c().c(gnf.EVENT_KEYBOARD_HEIGHT_CHANGE, this);
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

    public final y73 j0(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y73) ipChange.ipc$dispatch("c6f875d3", new Object[]{this, str, jSONObject, jSONObject2});
        }
        y73 y73Var = new y73();
        y73Var.f(str);
        y73Var.d(jSONObject);
        y73Var.e(jSONObject2);
        return y73Var;
    }

    public final void k0(RectF rectF, Size size, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9ade52", new Object[]{this, rectF, size, new Float(f), new Float(f2)});
            return;
        }
        RectF rectF2 = new RectF(rectF);
        rectF2.left = rectF.left * size.getWidth();
        rectF2.top = rectF.top * size.getHeight();
        rectF2.right = rectF.right * size.getWidth();
        rectF2.bottom = rectF.bottom * size.getHeight();
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            View view = new View(E());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(2, Color.parseColor("#26FF00"));
            view.setBackground(gradientDrawable);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
            layoutParams.leftMargin = ((int) f) + ((int) rectF2.left);
            layoutParams.topMargin = ((int) f2) + ((int) rectF2.top);
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.addView(view, layoutParams);
            return;
        }
        ckf.y("debugRegionContainer");
        throw null;
    }

    public final void n0(int i, int i2, Rect rect, RectF rectF) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06af306", new Object[]{this, new Integer(i), new Integer(i2), rect, rectF});
            return;
        }
        float f2 = i2;
        float a2 = f2 - ghe.Companion.a();
        float f3 = i;
        if (f3 >= a2) {
            rect.top = 0;
            rect.bottom = i;
            rectF.top = 0.0f;
            rectF.bottom = a2 - p1p.a(10.0f);
            return;
        }
        int i3 = (int) (((f2 * 0.73f) - f3) / 2);
        rect.top = i3;
        rect.bottom = i3 + i;
        float a3 = p1p.a(10.0f);
        rectF.top = rect.top + a3;
        int i4 = rect.bottom;
        if (i4 > a2) {
            f = a2 - a3;
        } else {
            f = i4;
        }
        rectF.bottom = f;
    }

    @Override // com.etao.feimagesearch.regionedit.RegionEditView2023.a
    public void v(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15248682", new Object[]{this, new Float(f)});
            return;
        }
        CoordinatorCardView coordinatorCardView = this.n;
        if (coordinatorCardView != null) {
            coordinatorCardView.setLayoutTranslationY(f);
        } else {
            ckf.y("regionContainer");
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
        CoordinatorCardView coordinatorCardView = this.n;
        if (coordinatorCardView != null) {
            coordinatorCardView.setLayoutScale(f);
        } else {
            ckf.y("regionContainer");
            throw null;
        }
    }

    /* renamed from: l0 */
    public FrameLayout b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_view_irp_immerse_preview, (ViewGroup) null, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View findViewById = frameLayout.findViewById(R.id.ipv_preview);
            ((ImgPreviewView) findViewById).setRegionEditViewChangeListener(this);
            ckf.f(findViewById, "findViewById<ImgPreviewV…ersePreviewWidget\n      }");
            this.l = (ImgPreviewView) findViewById;
            View findViewById2 = frameLayout.findViewById(R.id.fl_debug_region_container);
            ckf.f(findViewById2, "findViewById(R.id.fl_debug_region_container)");
            this.m = (FrameLayout) findViewById2;
            View findViewById3 = frameLayout.findViewById(R.id.region_container);
            ckf.f(findViewById3, "findViewById(R.id.region_container)");
            this.n = (CoordinatorCardView) findViewById3;
            return frameLayout;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.v9e
    public void q(String str, Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e855e03", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "action");
        super.q(str, obj);
        int hashCode = str.hashCode();
        if (hashCode != -503246719) {
            if (hashCode != 331733410) {
                if (hashCode == 2052266864 && str.equals(gnf.EVENT_KEYBOARD_HEIGHT_CHANGE) && (obj instanceof Integer)) {
                    CoordinatorCardView coordinatorCardView = this.n;
                    if (coordinatorCardView != null) {
                        if (((Number) obj).intValue() > 0) {
                            i = 8;
                        }
                        coordinatorCardView.setVisibility(i);
                        return;
                    }
                    ckf.y("regionContainer");
                    throw null;
                }
            } else if (str.equals(gnf.EVENT_PREVIEW_BITMAP_UPDATE) && (obj instanceof Bitmap)) {
                m0((Bitmap) obj);
            }
        } else if (!str.equals(gnf.EVENT_IDENTIFY_REGION_UPDATE) || !kqu.l(obj)) {
        } else {
            if (obj != null) {
                o0(kqu.c(obj));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.etao.feimagesearch.newresult.base.RegionDigestModel>");
        }
    }

    public final void m0(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58f0bb2", new Object[]{this, bitmap});
        } else if (bitmap == null) {
            FrameLayout X = X();
            if (X != null) {
                X.setVisibility(8);
            }
        } else {
            Rect rect = new Rect();
            RectF rectF = new RectF();
            int h = caa.h(E());
            int g = caa.g(E());
            if (bitmap.getWidth() > h) {
                rect.left = 0;
                rect.right = h;
                rectF.left = 0.0f;
                float f = h;
                rectF.right = f;
                n0((int) ((f / bitmap.getWidth()) * bitmap.getHeight()), g, rect, rectF);
            } else if (bitmap.getHeight() > g) {
                int width = (h - bitmap.getWidth()) / 2;
                rect.left = width;
                int width2 = width + bitmap.getWidth();
                rect.right = width2;
                rectF.left = rect.left;
                rectF.right = width2;
                n0(bitmap.getHeight(), g, rect, rectF);
            } else {
                rect.left = 0;
                rect.right = h;
                rectF.left = 0.0f;
                float f2 = h;
                rectF.right = f2;
                n0((int) ((f2 / bitmap.getWidth()) * bitmap.getHeight()), g, rect, rectF);
            }
            ImgPreviewView imgPreviewView = this.l;
            if (imgPreviewView != null) {
                imgPreviewView.setPreviewImage(bitmap, rect, rectF);
                ImgPreviewView imgPreviewView2 = this.l;
                if (imgPreviewView2 != null) {
                    imgPreviewView2.post(new a());
                } else {
                    ckf.y("imgPreviewView");
                    throw null;
                }
            } else {
                ckf.y("imgPreviewView");
                throw null;
            }
        }
    }

    @Override // tb.ptk
    public void r(JSONObject jSONObject) {
        String i;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eba21b0", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (i = h19.i(jSONObject, "regionKey", "")) != null && i.length() != 0 && (d = h19.d(jSONObject, "cardData")) != null) {
            W().c().b(gnf.EVENT_IDENTIFY_REGION_SELECTED, d);
            Iterator it = ((LinkedHashMap) this.o).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                nvn nvnVar = (nvn) it.next();
                if (nvnVar.c()) {
                    nvnVar.d(false);
                    CoordinatorCardView coordinatorCardView = this.n;
                    if (coordinatorCardView != null) {
                        ArrayList arrayList = new ArrayList();
                        t83 t83Var = new t83(nvnVar.a());
                        t83Var.k(4);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put((JSONObject) "isSelected", (String) Boolean.FALSE);
                        t83Var.l(jSONObject2);
                        arrayList.add(t83Var);
                        coordinatorCardView.executeActions(arrayList);
                    } else {
                        ckf.y("regionContainer");
                        throw null;
                    }
                }
            }
            nvn nvnVar2 = (nvn) ((LinkedHashMap) this.o).get(i);
            if (nvnVar2 != null) {
                nvnVar2.d(true);
            }
        }
    }

    public final void o0(List<ivn> list) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aaa6787", new Object[]{this, list});
            return;
        }
        List<ivn> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            boolean m0 = lg4.m0();
            if (m0) {
                FrameLayout frameLayout = this.m;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    FrameLayout frameLayout2 = this.m;
                    if (frameLayout2 != null) {
                        frameLayout2.removeAllViews();
                    } else {
                        ckf.y("debugRegionContainer");
                        throw null;
                    }
                } else {
                    ckf.y("debugRegionContainer");
                    throw null;
                }
            }
            ImgPreviewView imgPreviewView = this.l;
            if (imgPreviewView != null) {
                float left = imgPreviewView.getImageView().getLeft();
                ImgPreviewView imgPreviewView2 = this.l;
                if (imgPreviewView2 != null) {
                    float top = imgPreviewView2.getImageView().getTop();
                    CoordinatorCardView coordinatorCardView = this.n;
                    if (coordinatorCardView != null) {
                        coordinatorCardView.setMargin(left, top);
                        ImgPreviewView imgPreviewView3 = this.l;
                        if (imgPreviewView3 != null) {
                            int width = imgPreviewView3.getImageView().getWidth();
                            ImgPreviewView imgPreviewView4 = this.l;
                            if (imgPreviewView4 != null) {
                                Size size = new Size(width, imgPreviewView4.getImageView().getHeight());
                                CoordinatorCardView coordinatorCardView2 = this.n;
                                if (coordinatorCardView2 != null) {
                                    coordinatorCardView2.setRegionRationSize(size.getWidth(), size.getHeight());
                                    this.o = new LinkedHashMap();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<ivn> it = list.iterator();
                                    boolean z = true;
                                    while (it.hasNext()) {
                                        ivn next = it.next();
                                        RectF e = trl.e(next.c(), i, i);
                                        if (e != null) {
                                            float centerY = e.centerY();
                                            float centerX = e.centerX();
                                            String f = trl.f(new RectF(centerX, centerY, centerX, centerY));
                                            ckf.f(f, "smallCardLocateValue");
                                            t83 t83Var = new t83(f);
                                            String b = next.b();
                                            JSONObject a2 = next.a();
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put((JSONObject) "isSelected", (String) Boolean.valueOf(z));
                                            xhv xhvVar = xhv.INSTANCE;
                                            t83Var.i(j0(b, a2, jSONObject));
                                            l83 l83Var = new l83();
                                            RectF rectF = new RectF(e);
                                            l83Var.i(2);
                                            l83Var.j(rectF);
                                            l83Var.f(3);
                                            l83Var.g(p1p.b(26.0f));
                                            t83Var.j(l83Var);
                                            t83Var.k(0);
                                            arrayList.add(t83Var);
                                            this.o.put(next.c(), new nvn(f, next, 0, z, 4, null));
                                            if (z) {
                                                z = false;
                                            }
                                            if (m0) {
                                                k0(e, size, left, top);
                                            }
                                            it = it;
                                            i = 1;
                                        }
                                    }
                                    CoordinatorCardView coordinatorCardView3 = this.n;
                                    if (coordinatorCardView3 != null) {
                                        coordinatorCardView3.executeActions(arrayList);
                                        if (arrayList.size() > 1) {
                                            o4w.a();
                                            return;
                                        }
                                        return;
                                    }
                                    ckf.y("regionContainer");
                                    throw null;
                                }
                                ckf.y("regionContainer");
                                throw null;
                            }
                            ckf.y("imgPreviewView");
                            throw null;
                        }
                        ckf.y("imgPreviewView");
                        throw null;
                    }
                    ckf.y("regionContainer");
                    throw null;
                }
                ckf.y("imgPreviewView");
                throw null;
            }
            ckf.y("imgPreviewView");
            throw null;
        }
    }
}
