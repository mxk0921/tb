package com.taobao.search.m3.shoinfo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.m3.BaseItemView;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.List;
import tb.a07;
import tb.ckf;
import tb.hfn;
import tb.hgw;
import tb.o1p;
import tb.oxb;
import tb.ruk;
import tb.t2o;
import tb.tqp;
import tb.vop;
import tb.wop;
import tb.xop;
import tb.yop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ShopInfoView extends BaseItemView implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static float iconWidth = 0.0f;
    private static final int shopTextSizeOrigin = 12;
    private vop currentBean;
    private List<tqp> drawList;
    private boolean hasBackground = true;
    private final TextPaint iconPaint;
    private ruk listener;
    private final wop shopBackground;
    private final xop shopDrawable;
    private final TextPaint shopInfoPaint;
    private boolean tb2024;
    public static final a Companion = new a(null);
    private static final int viewHeight = o1p.a(20.0f);
    private static final int tb2024ViewHeight = o1p.a(16.0f);
    private static final int bgRadius = o1p.a(10.5f);
    private static final int bgPadding = o1p.a(6.0f);
    private static final int bgColor = Color.parseColor("#f7f7f7");
    private static final int darkBgColor = Color.parseColor("#333333");
    private static final int darkTxtColor = Color.parseColor("#aaaaaa");
    private static final float shopTextSize = o1p.b(12);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792450);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792449);
    }

    public ShopInfoView(Context context) {
        super(context);
        int i = bgColor;
        int i2 = bgRadius;
        int i3 = bgPadding;
        this.shopBackground = new wop(i, i2, i3, i3);
        xop xopVar = new xop();
        this.shopDrawable = xopVar;
        TextPaint textPaint = new TextPaint(1);
        this.iconPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.shopInfoPaint = textPaint2;
        textPaint.setTypeface(xop.e);
        float f = shopTextSize;
        textPaint.setTextSize(f);
        textPaint2.setTextSize(f);
        xopVar.setCallback(this);
        setOnClickListener(this);
    }

    private final float calculateBaseline(TextPaint textPaint, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e185561", new Object[]{this, textPaint, new Integer(i)})).floatValue();
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f = fontMetrics.descent;
        float f2 = f - fontMetrics.ascent;
        float f3 = i;
        if (f2 <= f3) {
            f3 -= (f3 - f2) / 2.0f;
        }
        return f3 - f;
    }

    public static /* synthetic */ Object ipc$super(ShopInfoView shopInfoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/shoinfo/ShopInfoView");
    }

    private final boolean isDarkMode() {
        oxb oxbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        Context context = getContext();
        if (context instanceof oxb) {
            oxbVar = (oxb) context;
        } else {
            oxbVar = null;
        }
        if (oxbVar == null || !oxbVar.E1()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        if (this.hasBackground) {
            return viewHeight;
        }
        return tb2024ViewHeight;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ruk rukVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        vop vopVar = this.currentBean;
        if (vopVar != null && (rukVar = this.listener) != null) {
            rukVar.I(vopVar);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        this.shopDrawable.draw(canvas);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        updateDrawList(this.tb2024);
        this.shopDrawable.q(this.drawList);
        this.shopDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void update(vop vopVar, ruk rukVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d11c9f", new Object[]{this, vopVar, rukVar, new Boolean(z)});
            return;
        }
        ckf.g(vopVar, "bean");
        ckf.g(rukVar, DataReceiveMonitor.CB_LISTENER);
        this.tb2024 = z;
        this.listener = rukVar;
        if (this.currentBean != vopVar) {
            reset();
            this.currentBean = vopVar;
            oxb oxbVar = null;
            if (vopVar.c()) {
                this.shopDrawable.r(this.shopBackground);
                this.hasBackground = true;
            } else {
                this.shopDrawable.r(null);
                this.hasBackground = false;
            }
            Context context = getContext();
            if (context instanceof oxb) {
                oxbVar = (oxb) context;
            }
            if (oxbVar == null || !oxbVar.E1()) {
                this.shopBackground.e(bgColor);
            } else {
                hgw.a(this);
                this.shopBackground.e(darkBgColor);
            }
            requestLayout();
            setContentDescription(vopVar.a());
        }
    }

    private final void updateDrawList(boolean z) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b999a622", new Object[]{this, new Boolean(z2)});
            return;
        }
        this.drawList = null;
        vop vopVar = this.currentBean;
        if (vopVar != null) {
            this.drawList = new ArrayList();
            if (z2) {
                str = xop.g;
            } else {
                str = xop.f;
            }
            if (iconWidth == 0.0f) {
                iconWidth = this.iconPaint.measureText(str);
            }
            int measuredWidth = (int) (getMeasuredWidth() - iconWidth);
            int i7 = this.hasBackground ? bgPadding : 0;
            int i8 = measuredWidth - (i7 * 2);
            float calculateBaseline = calculateBaseline(this.shopInfoPaint, getMeasuredHeight());
            if (z2) {
                i = xop.k;
            } else {
                i = xop.j;
            }
            float[] fArr = new float[1];
            int size = vopVar.d().size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                yop yopVar = vopVar.d().get(i9);
                if (TextUtils.isEmpty(yopVar.c()) || yopVar.e() <= 0 || yopVar.d() <= 0) {
                    if (!TextUtils.isEmpty(yopVar.f())) {
                        float measureText = this.shopInfoPaint.measureText(yopVar.f());
                        float f = i8;
                        if (measureText <= f) {
                            tqp tqpVar = new tqp(this.shopInfoPaint, false);
                            if (isDarkMode()) {
                                i5 = darkTxtColor;
                            } else {
                                Integer a2 = yopVar.a();
                                if (a2 != null) {
                                    i5 = a2.intValue();
                                } else {
                                    i5 = xop.h;
                                }
                            }
                            i3 = i9;
                            size = size;
                            fArr = fArr;
                            tqpVar.f(yopVar.f(), calculateBaseline, i5, o1p.b(12), false);
                            tqpVar.h(i7, 0, 0, 0);
                            List<tqp> list = this.drawList;
                            ckf.d(list);
                            list.add(tqpVar);
                            int i10 = (int) (measureText + i);
                            i7 += i10;
                            i8 -= i10;
                            i9 = i3 + 1;
                            z2 = z;
                            z3 = true;
                        } else {
                            i3 = i9;
                            size = size;
                            fArr = fArr;
                            if (TextUtils.equals(Constants.Name.SUFFIX, yopVar.b())) {
                                float measureText2 = this.shopInfoPaint.measureText("...");
                                int breakText = this.shopInfoPaint.breakText(yopVar.f(), true, f - measureText2, fArr);
                                if (breakText >= 2) {
                                    tqp tqpVar2 = new tqp(this.shopInfoPaint, false);
                                    if (isDarkMode()) {
                                        i4 = darkTxtColor;
                                    } else {
                                        Integer a3 = yopVar.a();
                                        if (a3 != null) {
                                            i4 = a3.intValue();
                                        } else {
                                            i4 = xop.h;
                                        }
                                    }
                                    String f2 = yopVar.f();
                                    ckf.d(f2);
                                    String substring = f2.substring(0, breakText);
                                    ckf.f(substring, "substring(...)");
                                    tqpVar2.f(substring.concat("..."), calculateBaseline, i4, o1p.b(12), false);
                                    tqpVar2.h(i7, 0, 0, 0);
                                    List<tqp> list2 = this.drawList;
                                    ckf.d(list2);
                                    list2.add(tqpVar2);
                                    i7 += (int) (fArr[0] + i + measureText2);
                                }
                            }
                            i9 = i3 + 1;
                            z2 = z;
                            z3 = true;
                        }
                    }
                    i3 = i9;
                    size = size;
                    fArr = fArr;
                    i9 = i3 + 1;
                    z2 = z;
                    z3 = true;
                } else {
                    if (z2) {
                        i6 = xop.m;
                    } else {
                        i6 = hfn.f(xop.l, getMeasuredHeight());
                    }
                    int e = (int) ((yopVar.e() / yopVar.d()) * i6);
                    if (e <= i8) {
                        tqp tqpVar3 = new tqp(this.iconPaint, z3);
                        int measuredHeight = (int) ((getMeasuredHeight() - i6) / 2.0f);
                        tqpVar3.h(i7, measuredHeight, i7 + e, getMeasuredHeight() - measuredHeight);
                        tqpVar3.d(yopVar.c(), e, getContext());
                        int i11 = e + i;
                        i8 -= i11;
                        i7 += i11;
                        List<tqp> list3 = this.drawList;
                        ckf.d(list3);
                        list3.add(tqpVar3);
                        i3 = i9;
                        size = size;
                        fArr = fArr;
                        i9 = i3 + 1;
                        z2 = z;
                        z3 = true;
                    }
                    i3 = i9;
                    size = size;
                    fArr = fArr;
                    i9 = i3 + 1;
                    z2 = z;
                    z3 = true;
                }
            }
            float calculateBaseline2 = calculateBaseline(this.iconPaint, getMeasuredHeight());
            tqp tqpVar4 = new tqp(this.iconPaint, true);
            if (isDarkMode()) {
                i2 = darkTxtColor;
            } else {
                Integer b = vopVar.b();
                if (b != null) {
                    i2 = b.intValue();
                } else {
                    i2 = xop.h;
                }
            }
            tqpVar4.e(str, calculateBaseline2, i2);
            int i12 = i7 - i;
            tqpVar4.h(i12, 0, (int) (i12 + this.iconPaint.measureText(str)), 0);
            List<tqp> list4 = this.drawList;
            ckf.d(list4);
            list4.add(tqpVar4);
        }
    }
}
