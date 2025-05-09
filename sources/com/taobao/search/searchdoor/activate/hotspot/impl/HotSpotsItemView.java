package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.RpxConfigVM;
import tb.a07;
import tb.ckf;
import tb.dgw;
import tb.kw1;
import tb.o1p;
import tb.oxb;
import tb.p1p;
import tb.r3p;
import tb.sfe;
import tb.t2o;
import tb.tx3;
import tb.ux3;
import tb.v6b;
import tb.vfe;
import tb.vx3;
import tb.ytk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotsItemView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int darkModeEndColor = 0;
    private static final int limitRankNum = 3;
    private static final int nonTopThreeEndColor2024 = 0;
    private static final String suffix = "...";
    private static final int topThreeEndColor2024 = 0;
    private final sfe arrowIcon;
    private tx3 clueTag;
    private final int currNonTopThreeColor;
    private final int currNonTopThreeEndColor;
    private final int currTopThreeColor;
    private final int currTopThreeEndColor;
    private int currentIndexHeight;
    private int currentIndexWidth;
    private float currentNumTs;
    private float currentTitleTs;
    private boolean hasArrow;
    private boolean hasSearchIcon;
    private boolean hasTag;
    private final sfe indexIcon;
    private int indexMarginRight;
    private v6b lastItem;
    private float realShowTextWidth;
    private final b rpxListener;
    private final sfe searchIcon;
    private final TextPaint searchNumPaint;
    private float searchNumWidth;
    private final TextPaint showTextPaint;
    private final float suffixWidth;
    private final sfe tagIcon;
    private final boolean tb2024;
    private boolean topThree;
    public static final a Companion = new a(null);
    private static int indexWidthAfter19 = p1p.a(16.5f);
    private static int indexWidthBefore19 = p1p.a(14.0f);
    private static int indexHeightBeforeLimitNum = p1p.a(14.0f);
    private static int indexHeightAfterLimitNum = p1p.a(14.0f);
    private static int tagSize = p1p.a(14.0f);
    private static final float radius = o1p.a(9.0f);
    private static final float radius2024 = o1p.a(6.0f);
    private static final int topThreeColor = Color.parseColor("#E6FFF7F3");
    private static final int topThreeColor2024 = Color.parseColor("#FFEFE5");
    private static final int topThreeEndColor = Color.parseColor("#E6FFFFFF");
    private static final int nonTopThreeColor = Color.parseColor("#B3F7F7F7");
    private static final int nonTopThreeColor2024 = Color.parseColor("#B3F3F6F8");
    private static final int nonTopThreeEndColor = Color.parseColor("#19FFFFFF");
    private static final int darkModeStartColor = Color.parseColor("#E6333333");
    private static final int searchNumColor = Color.parseColor("#999999");
    private static final int searchNumColor2024 = Color.parseColor("#7C889C");
    private static final int titleColor = Color.parseColor("#111111");
    private static final int titleColor2024 = Color.parseColor("#11192D");
    private static final int titleColorDarkMode = Color.parseColor("#DDDDDD");
    private static final float searchNumTextSize = 11.0f;
    private static final float searchNumTextSize2024 = 10.0f;
    private static final float titleTextSize = 14.0f;
    private static final float titleTextSize2024 = 13.0f;
    private static final int indexMarginRightBefore19 = o1p.a(9.0f);
    private static final int indexMarginRightAfter19 = o1p.a(6.5f);
    private static final int titleMarginRight = o1p.a(3.0f);
    private static final int arrowWidth = o1p.a(6.0f);
    private static final int arrowHeight = o1p.a(11.0f);
    private static final int arrowMarginLeft = o1p.a(3.0f);
    private final Paint bgPaint = new Paint(1);
    private String realShowText = "";
    private boolean hasIndex = true;
    private final float[] measureArray = new float[1];
    private boolean generateShader = true;
    private RectF bgRect = new RectF();
    private int currentTagWidth = tagSize;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793022);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e8a2be0a", new Object[]{aVar, new Integer(i)})).intValue();
            }
            return aVar.c(i);
        }

        public final int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("db9a1dcc", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i < 3) {
                return HotSpotsItemView.access$getIndexHeightBeforeLimitNum$cp();
            }
            return HotSpotsItemView.access$getIndexHeightAfterLimitNum$cp();
        }

        public final int c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2595aa3d", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i >= 19) {
                return HotSpotsItemView.access$getIndexMarginRightAfter19$cp();
            }
            return HotSpotsItemView.access$getIndexMarginRightBefore19$cp();
        }

        public final int d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e1887585", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i >= 19) {
                return HotSpotsItemView.access$getIndexWidthAfter19$cp();
            }
            return HotSpotsItemView.access$getIndexWidthBefore19$cp();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements ytk {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // tb.ytk
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b567900f", new Object[]{this});
                return;
            }
            TextPaint access$getShowTextPaint$p = HotSpotsItemView.access$getShowTextPaint$p(HotSpotsItemView.this);
            RpxConfigVM.a aVar = RpxConfigVM.Companion;
            Context context = this.b;
            ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
            access$getShowTextPaint$p.setTextSize(aVar.f((Activity) context, HotSpotsItemView.access$getCurrentTitleTs$p(HotSpotsItemView.this)));
            HotSpotsItemView.access$getSearchNumPaint$p(HotSpotsItemView.this).setTextSize(aVar.f((Activity) this.b, HotSpotsItemView.access$getCurrentNumTs$p(HotSpotsItemView.this)));
            tx3 access$getClueTag$p = HotSpotsItemView.access$getClueTag$p(HotSpotsItemView.this);
            if (access$getClueTag$p != null) {
                access$getClueTag$p.b();
            }
            HotSpotsItemView.this.requestLayout();
        }
    }

    static {
        t2o.a(815793021);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotSpotsItemView(Context context, boolean z) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        ckf.g(context, "context");
        this.tb2024 = z;
        vfe vfeVar = vfe.INSTANCE;
        int i5 = 0;
        this.indexIcon = new sfe(this, vfeVar, false);
        this.tagIcon = new sfe(this, vfeVar, true);
        this.searchIcon = new sfe(this, vfeVar, false);
        this.arrowIcon = new sfe(this, vfeVar, true);
        TextPaint textPaint = new TextPaint(1);
        this.showTextPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.searchNumPaint = textPaint2;
        if (z) {
            i = topThreeColor2024;
        } else {
            i = topThreeColor;
        }
        this.currTopThreeColor = i;
        if (z) {
            i2 = nonTopThreeColor2024;
        } else {
            i2 = nonTopThreeColor;
        }
        this.currNonTopThreeColor = i2;
        this.currTopThreeEndColor = z ? 0 : topThreeEndColor;
        this.currNonTopThreeEndColor = !z ? nonTopThreeEndColor : i5;
        float f = titleTextSize;
        this.currentTitleTs = f;
        float f2 = searchNumTextSize;
        this.currentNumTs = f2;
        this.rpxListener = new b(context);
        this.currentTitleTs = z ? titleTextSize2024 : f;
        if (z) {
            i3 = titleColor2024;
        } else {
            i3 = titleColor;
        }
        textPaint.setColor(i3);
        this.currentNumTs = z ? searchNumTextSize2024 : f2;
        if (z) {
            i4 = searchNumColor2024;
        } else {
            i4 = searchNumColor;
        }
        textPaint2.setColor(i4);
        this.suffixWidth = textPaint.measureText(suffix);
        RpxConfigVM.a aVar = RpxConfigVM.Companion;
        Activity activity = (Activity) context;
        textPaint.setTextSize(aVar.f(activity, this.currentTitleTs));
        textPaint2.setTextSize(aVar.f(activity, this.currentNumTs));
        setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
    }

    public static final /* synthetic */ tx3 access$getClueTag$p(HotSpotsItemView hotSpotsItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tx3) ipChange.ipc$dispatch("e74e6c91", new Object[]{hotSpotsItemView});
        }
        return hotSpotsItemView.clueTag;
    }

    public static final /* synthetic */ float access$getCurrentNumTs$p(HotSpotsItemView hotSpotsItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75ae9808", new Object[]{hotSpotsItemView})).floatValue();
        }
        return hotSpotsItemView.currentNumTs;
    }

    public static final /* synthetic */ float access$getCurrentTitleTs$p(HotSpotsItemView hotSpotsItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e21b9b6", new Object[]{hotSpotsItemView})).floatValue();
        }
        return hotSpotsItemView.currentTitleTs;
    }

    public static final /* synthetic */ int access$getIndexHeightAfterLimitNum$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38746527", new Object[0])).intValue();
        }
        return indexHeightAfterLimitNum;
    }

    public static final /* synthetic */ int access$getIndexHeightBeforeLimitNum$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2db012fe", new Object[0])).intValue();
        }
        return indexHeightBeforeLimitNum;
    }

    public static final /* synthetic */ int access$getIndexMarginRightAfter19$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebf7f3b9", new Object[0])).intValue();
        }
        return indexMarginRightAfter19;
    }

    public static final /* synthetic */ int access$getIndexMarginRightBefore19$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7d79c52", new Object[0])).intValue();
        }
        return indexMarginRightBefore19;
    }

    public static final /* synthetic */ int access$getIndexWidthAfter19$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c354e971", new Object[0])).intValue();
        }
        return indexWidthAfter19;
    }

    public static final /* synthetic */ int access$getIndexWidthBefore19$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc195d9a", new Object[0])).intValue();
        }
        return indexWidthBefore19;
    }

    public static final /* synthetic */ TextPaint access$getSearchNumPaint$p(HotSpotsItemView hotSpotsItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextPaint) ipChange.ipc$dispatch("4b531b12", new Object[]{hotSpotsItemView});
        }
        return hotSpotsItemView.searchNumPaint;
    }

    public static final /* synthetic */ TextPaint access$getShowTextPaint$p(HotSpotsItemView hotSpotsItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextPaint) ipChange.ipc$dispatch("c477c55a", new Object[]{hotSpotsItemView});
        }
        return hotSpotsItemView.showTextPaint;
    }

    private final void drawIcon(float f, Canvas canvas, sfe sfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdfdfe39", new Object[]{this, new Float(f), canvas, sfeVar});
            return;
        }
        float height = (getHeight() - tagSize) / 2.0f;
        int i = titleMarginRight;
        canvas.translate(i + f, height);
        sfeVar.h(canvas);
        canvas.translate((-f) - i, -height);
    }

    public static /* synthetic */ Object ipc$super(HotSpotsItemView hotSpotsItemView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotsItemView");
        }
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

    private final void loadArrow() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de49ca", new Object[]{this});
            return;
        }
        v6b v6bVar = this.lastItem;
        if (v6bVar != null) {
            if (isDarkMode()) {
                str = v6bVar.b();
            } else {
                str = v6bVar.a();
            }
            if (TextUtils.isEmpty(str)) {
                str = v6bVar.a();
            }
            this.arrowIcon.j(str, arrowWidth, arrowHeight);
        }
    }

    public final void bind(v6b v6bVar, int i, int i2) {
        int i3;
        boolean z;
        String str;
        vx3 vx3Var;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f6f445", new Object[]{this, v6bVar, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(v6bVar, "item");
        if (this.lastItem != v6bVar) {
            TextPaint textPaint = this.showTextPaint;
            if (isDarkMode()) {
                i3 = titleColorDarkMode;
            } else {
                i3 = titleColor;
            }
            textPaint.setColor(i3);
            a aVar = Companion;
            this.currentIndexHeight = aVar.b(i);
            this.currentIndexWidth = aVar.d(i);
            this.indexMarginRight = a.a(aVar, i);
            this.lastItem = v6bVar;
            this.hasIndex = !TextUtils.isEmpty(v6bVar.e());
            this.hasTag = !TextUtils.isEmpty(v6bVar.l());
            this.hasArrow = !TextUtils.isEmpty(v6bVar.a());
            if (v6bVar.g() != null) {
                z = true;
            } else {
                z = false;
            }
            this.hasSearchIcon = z;
            this.clueTag = null;
            ux3 c = v6bVar.c();
            if (c != null) {
                if (isDarkMode()) {
                    vx3Var = c.a();
                } else {
                    vx3Var = c.b();
                }
                if (vx3Var != null) {
                    Context context = getContext();
                    ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) context;
                    String c2 = c.c();
                    Integer a2 = vx3Var.a();
                    if (a2 != null) {
                        int intValue = a2.intValue();
                        Integer b2 = vx3Var.b();
                        if (b2 != null) {
                            this.clueTag = new tx3(activity, c2, intValue, b2.intValue());
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (i < i2) {
                z2 = true;
            }
            if (this.topThree != z2) {
                this.generateShader = true;
                this.topThree = z2;
            }
            if (this.hasSearchIcon) {
                r3p g = v6bVar.g();
                ckf.d(g);
                if (g.c() <= 0 || v6bVar.g().a() <= 0) {
                    this.currentTagWidth = tagSize;
                    sfe sfeVar = this.searchIcon;
                    String b3 = v6bVar.g().b();
                    int i4 = tagSize;
                    sfeVar.j(b3, i4, i4);
                } else {
                    this.currentTagWidth = (int) ((tagSize * v6bVar.g().c()) / v6bVar.g().a());
                    this.searchIcon.j(v6bVar.g().b(), this.currentTagWidth, tagSize);
                }
            } else if (this.hasTag && this.clueTag == null) {
                if (v6bVar.m() <= 0 || v6bVar.k() <= 0) {
                    this.currentTagWidth = tagSize;
                    sfe sfeVar2 = this.tagIcon;
                    String l = v6bVar.l();
                    ckf.d(l);
                    int i5 = tagSize;
                    sfeVar2.j(l, i5, i5);
                } else {
                    this.currentTagWidth = (int) ((tagSize * v6bVar.m()) / v6bVar.k());
                    sfe sfeVar3 = this.tagIcon;
                    String l2 = v6bVar.l();
                    ckf.d(l2);
                    sfeVar3.j(l2, this.currentTagWidth, tagSize);
                }
            }
            if (this.hasIndex) {
                this.indexIcon.j(v6bVar.e(), this.currentIndexWidth, this.currentIndexHeight);
            }
            if (this.hasArrow) {
                loadArrow();
            }
            if (TextUtils.isEmpty(v6bVar.h())) {
                str = v6bVar.n();
            } else {
                str = v6bVar.n() + (char) 65292 + v6bVar.h();
            }
            setContentDescription(str);
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        v6b v6bVar = this.lastItem;
        if (v6bVar != null) {
            if (this.hasSearchIcon) {
                sfe sfeVar = this.searchIcon;
                r3p g = v6bVar.g();
                ckf.d(g);
                sfeVar.j(g.b(), this.currentTagWidth, tagSize);
            } else if (this.clueTag == null && this.hasTag) {
                sfe sfeVar2 = this.tagIcon;
                String l = v6bVar.l();
                ckf.d(l);
                sfeVar2.j(l, this.currentTagWidth, tagSize);
            }
            if (this.hasIndex) {
                sfe sfeVar3 = this.indexIcon;
                String e = v6bVar.e();
                ckf.d(e);
                sfeVar3.j(e, this.currentIndexWidth, this.currentIndexHeight);
            }
            RpxConfigVM.a aVar = RpxConfigVM.Companion;
            Context context = getContext();
            ckf.f(context, "getContext(...)");
            aVar.i(context, this.rpxListener);
            if (this.hasArrow) {
                loadArrow();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.hasTag) {
            this.tagIcon.k();
        }
        if (this.hasSearchIcon) {
            this.searchIcon.k();
        }
        if (this.hasIndex) {
            this.indexIcon.k();
        }
        RpxConfigVM.a aVar = RpxConfigVM.Companion;
        Context context = getContext();
        ckf.f(context, "getContext(...)");
        aVar.j(context, this.rpxListener);
        if (this.hasArrow) {
            this.arrowIcon.k();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        tx3 tx3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        v6b v6bVar = this.lastItem;
        if (v6bVar != null) {
            if (this.tb2024) {
                f = radius2024;
            } else {
                f = radius;
            }
            canvas.drawRoundRect(this.bgRect, f, f, this.bgPaint);
            float paddingLeft = getPaddingLeft();
            if (this.hasIndex) {
                float height = (getHeight() - this.currentIndexHeight) / 2.0f;
                canvas.translate(paddingLeft, height);
                this.indexIcon.h(canvas);
                canvas.translate(-paddingLeft, -height);
                paddingLeft += this.indexMarginRight + this.currentIndexWidth;
            }
            kw1.a(canvas, this.showTextPaint, paddingLeft, this.realShowText, 0.0f, getHeight());
            float f2 = paddingLeft + this.realShowTextWidth;
            if (this.hasSearchIcon) {
                drawIcon(f2, canvas, this.searchIcon);
            } else if (this.clueTag != null) {
                int height2 = getHeight();
                ckf.d(this.clueTag);
                float intrinsicHeight = (height2 - tx3Var.getIntrinsicHeight()) / 2.0f;
                int i = titleMarginRight;
                canvas.translate(i + f2, intrinsicHeight);
                tx3 tx3Var2 = this.clueTag;
                ckf.d(tx3Var2);
                tx3Var2.draw(canvas);
                canvas.translate((-f2) - i, -intrinsicHeight);
            } else if (this.hasTag) {
                drawIcon(f2, canvas, this.tagIcon);
            }
            int width = getWidth() - getPaddingRight();
            if (this.hasArrow) {
                int i2 = arrowWidth;
                width = (width - i2) - arrowMarginLeft;
                int width2 = (getWidth() - getPaddingRight()) - i2;
                float height3 = (getHeight() - arrowHeight) / 2.0f;
                float f3 = width2;
                canvas.translate(f3, height3);
                this.arrowIcon.h(canvas);
                canvas.translate(-f3, -height3);
            }
            if (v6bVar.h() != null) {
                kw1.a(canvas, this.searchNumPaint, width - this.searchNumWidth, v6bVar.h(), 0.0f, getHeight());
            }
        }
    }

    public final void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        this.generateShader = true;
        requestLayout();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsItemView.onMeasure(int, int):void");
    }
}
