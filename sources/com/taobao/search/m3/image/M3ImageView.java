package com.taobao.search.m3.image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.downgrade.Downgrade;
import com.taobao.search.m3.image.M3ImageView;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import com.taobao.search.searchdoor.sf.config.TbSearchStyleCard;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.alg;
import tb.ckf;
import tb.dgw;
import tb.hpc;
import tb.jnh;
import tb.nhl;
import tb.o1p;
import tb.o4p;
import tb.t2o;
import tb.tfe;
import tb.uvh;
import tb.uwj;
import tb.ykg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class M3ImageView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion;
    private static final String defP4pIcon = "https://gw.alicdn.com/mt/TB1_KoL7oH1gK0jSZSyXXXtlpXa-48-48.png";
    private static final String rightBottomP4pImg = "https://img.alicdn.com/imgextra/i3/O1CN01HPmvQK24XFngDb2qa_!!6000000007400-2-tps-76-44.png";
    private TbSearchStyle currentStyle;
    private Runnable delayTask;
    private boolean hasRightBottomIcon;
    private nhl lastP4pIcon;
    private hpc.a lastTarget;
    private String lastUrl;
    private alg leftScriptIcon;
    private Drawable loadedImage;
    private final boolean matchParent;
    private boolean p4pIconBottomLeft;
    private String p4pIconUrl;
    private int serverP4pIconHeight;
    private int serverP4pIconWidth;
    private final boolean wf;
    private static final float radius = o1p.a(12.0f);
    private static final int defP4pSize = o1p.a(24.0f);
    private static final int rightBottomIconWidth = o1p.a(21.0f);
    private static final int rightBottomIconHeight = o1p.a(12.0f);
    private static final int maskColOr = Color.argb(5, 0, 0, 0);
    private static float limitScale = 1.0f;
    private float ratio = 1.0f;
    private final float photoScale = o4p.L();
    private final tfe hotIcon = new tfe(this, null, 2, null);
    private final uwj newDateIcon = new uwj(this);
    private final tfe rightBottomIcon = new tfe(this, null, 2, null);
    private int p4pIconWidth = rightBottomIconWidth;
    private int p4pIconHeight = rightBottomIconHeight;
    private float currentRadius = radius;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/image/M3ImageView$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), M3ImageView.access$getCurrentRadius$p(M3ImageView.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792399);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1d0f7c3c", new Object[]{this})).floatValue();
            }
            return M3ImageView.access$getLimitScale$cp();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e9bf153b", new Object[]{this})).intValue();
            }
            return M3ImageView.access$getMaskColOr$cp();
        }

        public final float c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue();
            }
            return M3ImageView.access$getRadius$cp();
        }

        public final void d(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbb70e68", new Object[]{this, new Float(f)});
            } else {
                M3ImageView.access$setLimitScale$cp(f);
            }
        }

        @JvmStatic
        public final void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd43207f", new Object[]{this});
            } else if (ckf.b("degrade", Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
                d(o4p.z());
            }
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c extends jnh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/image/M3ImageView$setImageUrl$1");
        }

        @Override // tb.xdc
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6dc6f606", new Object[]{this})).intValue();
            }
            return (int) (M3ImageView.this.getMeasuredHeight() / M3ImageView.Companion.a());
        }

        @Override // tb.xdc
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("89ec02bb", new Object[]{this})).intValue();
            }
            return (int) (M3ImageView.this.getMeasuredWidth() / M3ImageView.Companion.a());
        }

        @Override // tb.hpc.a
        public void c(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
                return;
            }
            M3ImageView.access$setLoadedImage$p(M3ImageView.this, drawable);
            M3ImageView.this.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
            M3ImageView.this.setImageDrawable(drawable);
        }

        @Override // tb.hpc.a
        public int getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return (int) (M3ImageView.this.getMeasuredHeight() * M3ImageView.access$getPhotoScale$p(M3ImageView.this));
        }

        @Override // tb.hpc.a
        public int getWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return (int) (M3ImageView.this.getMeasuredWidth() * M3ImageView.access$getPhotoScale$p(M3ImageView.this));
        }
    }

    static {
        t2o.a(815792397);
        b bVar = new b(null);
        Companion = bVar;
        bVar.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3ImageView(Context context, boolean z, boolean z2) {
        super(context);
        ckf.g(context, "context");
        this.wf = z;
        this.matchParent = z2;
        this.leftScriptIcon = new alg(this, z);
        setClipToOutline(true);
        setOutlineProvider(new a());
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public static final /* synthetic */ float access$getCurrentRadius$p(M3ImageView m3ImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54e293f6", new Object[]{m3ImageView})).floatValue();
        }
        return m3ImageView.currentRadius;
    }

    public static final /* synthetic */ float access$getLimitScale$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a682f4e3", new Object[0])).floatValue();
        }
        return limitScale;
    }

    public static final /* synthetic */ int access$getMaskColOr$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0d153ea", new Object[0])).intValue();
        }
        return maskColOr;
    }

    public static final /* synthetic */ float access$getPhotoScale$p(M3ImageView m3ImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b69702f", new Object[]{m3ImageView})).floatValue();
        }
        return m3ImageView.photoScale;
    }

    public static final /* synthetic */ float access$getRadius$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33f3c640", new Object[0])).floatValue();
        }
        return radius;
    }

    public static final /* synthetic */ void access$setLimitScale$cp(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1079339", new Object[]{new Float(f)});
        } else {
            limitScale = f;
        }
    }

    public static final /* synthetic */ void access$setLoadedImage$p(M3ImageView m3ImageView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44091549", new Object[]{m3ImageView, drawable});
        } else {
            m3ImageView.loadedImage = drawable;
        }
    }

    public static /* synthetic */ Object ipc$super(M3ImageView m3ImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/image/M3ImageView");
        }
    }

    private final boolean isSame(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6dfcf7b", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (Math.abs(f - f2) < 1.0E-6f) {
            return true;
        }
        return false;
    }

    private final void loadBottomP4p() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e011c2", new Object[]{this});
        } else if (this.hasRightBottomIcon) {
            tfe tfeVar = this.rightBottomIcon;
            if (TextUtils.isEmpty(this.p4pIconUrl)) {
                str = rightBottomP4pImg;
            } else {
                str = this.p4pIconUrl;
            }
            tfeVar.d(str, this.p4pIconWidth, this.p4pIconHeight);
        }
    }

    private final void loadHotIcon() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe2f27", new Object[]{this});
            return;
        }
        int i3 = defP4pSize;
        nhl nhlVar = this.lastP4pIcon;
        String str = defP4pIcon;
        if (nhlVar != null) {
            if (!TextUtils.isEmpty(nhlVar.b())) {
                str = nhlVar.b();
                ckf.d(str);
            }
            if (nhlVar.c() > 0) {
                i2 = o1p.b(nhlVar.c());
            } else {
                i2 = i3;
            }
            if (nhlVar.a() > 0) {
                i3 = o1p.b(nhlVar.a());
            }
            i = i3;
            i3 = i2;
        } else {
            i = i3;
        }
        this.hotIcon.d(str, i3, i);
    }

    private final void releaseImage(hpc hpcVar) {
        hpc.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23080b8", new Object[]{this, hpcVar});
        } else if (hpcVar != null && (aVar = this.lastTarget) != null) {
            hpcVar.a("", aVar);
            this.lastTarget = null;
            Drawable drawable = this.loadedImage;
            if (drawable != null) {
                hpcVar.c(drawable, aVar);
                setImageDrawable(null);
                this.loadedImage = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setImageUrl$lambda$0(hpc hpcVar, M3ImageView m3ImageView, String str, hpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c10322", new Object[]{hpcVar, m3ImageView, str, aVar});
            return;
        }
        ckf.g(hpcVar, "$adapter");
        ckf.g(m3ImageView, "this$0");
        ckf.g(str, "$url");
        hpcVar.b(m3ImageView.getContext(), str, aVar, MUSImageQuality.AUTO);
    }

    @JvmStatic
    public static final void updateLimitScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd43207f", new Object[0]);
        } else {
            Companion.e();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && !TextUtils.isEmpty(this.lastUrl)) {
            String str = this.lastUrl;
            ckf.d(str);
            setImageUrl(str, this.ratio, this.currentStyle);
        }
        if (this.lastP4pIcon != null) {
            loadHotIcon();
        }
        loadBottomP4p();
        this.newDateIcon.a();
        this.leftScriptIcon.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseImage(uvh.f().e());
        this.hotIcon.e();
        this.rightBottomIcon.e();
        this.newDateIcon.b();
        this.leftScriptIcon.detach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.lastUrl)) {
            canvas.drawColor(maskColOr);
        }
        if (this.lastP4pIcon != null) {
            this.hotIcon.c(canvas);
        } else {
            this.newDateIcon.c(canvas);
        }
        this.leftScriptIcon.c(canvas);
        if (this.hasRightBottomIcon) {
            float measuredHeight = getMeasuredHeight() - this.p4pIconHeight;
            if (this.p4pIconBottomLeft) {
                f = 0.0f;
            } else {
                f = getMeasuredWidth() - this.p4pIconWidth;
            }
            canvas.translate(f, measuredHeight);
            this.rightBottomIcon.c(canvas);
            canvas.translate(-f, -measuredHeight);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.matchParent) {
            i3 = View.MeasureSpec.getSize(i2);
        } else {
            i3 = (int) (size / this.ratio);
        }
        setMeasuredDimension(size, i3);
        Runnable runnable = this.delayTask;
        if (runnable != null) {
            runnable.run();
        }
        this.delayTask = null;
        this.newDateIcon.d();
        this.leftScriptIcon.d();
    }

    public final void resetRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb36283", new Object[]{this});
        } else {
            this.ratio = 0.0f;
        }
    }

    public final void updateHotIcon(nhl nhlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23610517", new Object[]{this, nhlVar});
        } else if (nhlVar != this.lastP4pIcon) {
            this.lastP4pIcon = nhlVar;
            this.hotIcon.e();
            loadHotIcon();
        }
    }

    public final void updateLeftScriptIcon(ykg ykgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbed931", new Object[]{this, ykgVar, new Boolean(z)});
        } else {
            this.leftScriptIcon.a(ykgVar, z);
        }
    }

    public final void updateNewDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc48936", new Object[]{this, str});
        } else {
            this.newDateIcon.e(str);
        }
    }

    public final void updateRightBottomP4pIcon(boolean z, String str, int i, int i2, boolean z2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8679a9a4", new Object[]{this, new Boolean(z), str, new Integer(i), new Integer(i2), new Boolean(z2)});
            return;
        }
        if (this.p4pIconBottomLeft != z2) {
            this.p4pIconBottomLeft = z2;
            invalidate();
        }
        if (this.hasRightBottomIcon != z || !ckf.b(this.p4pIconUrl, str) || this.serverP4pIconWidth != i || this.serverP4pIconHeight != i2) {
            this.hasRightBottomIcon = z;
            this.p4pIconUrl = str;
            this.serverP4pIconWidth = i;
            this.serverP4pIconHeight = i2;
            if (i > 0) {
                i3 = o1p.b(i);
            } else {
                i3 = rightBottomIconWidth;
            }
            this.p4pIconWidth = i3;
            int i5 = this.serverP4pIconHeight;
            if (i5 > 0) {
                i4 = o1p.b(i5);
            } else {
                i4 = rightBottomIconHeight;
            }
            this.p4pIconHeight = i4;
            this.rightBottomIcon.e();
            loadBottomP4p();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }

    public final void setImageUrl(final String str, float f, TbSearchStyle tbSearchStyle) {
        Float f2;
        float f3;
        TbSearchStyleCard tbSearchStyleCard;
        float f4;
        TbSearchStyleCard tbSearchStyleCard2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a73a3", new Object[]{this, str, new Float(f), tbSearchStyle});
            return;
        }
        ckf.g(str, "url");
        this.currentStyle = tbSearchStyle;
        if (this.wf) {
            if (!(tbSearchStyle == null || (tbSearchStyleCard2 = tbSearchStyle.card) == null)) {
                f4 = tbSearchStyleCard2.wfImgRounded;
                f2 = Float.valueOf(f4);
            }
            f2 = null;
        } else {
            if (!(tbSearchStyle == null || (tbSearchStyleCard = tbSearchStyle.card) == null)) {
                f4 = tbSearchStyleCard.listImgRounded;
                f2 = Float.valueOf(f4);
            }
            f2 = null;
        }
        if (f2 != null) {
            f3 = f2.floatValue();
        } else {
            f3 = radius;
        }
        this.currentRadius = f3;
        if (!ckf.b(this.lastUrl, str) || !isSame(this.ratio, f) || this.lastTarget == null) {
            this.lastUrl = str;
            this.delayTask = null;
            if (this.ratio == f) {
                z = false;
            } else {
                this.ratio = f;
                requestLayout();
            }
            final hpc e = uvh.f().e();
            if (e != null) {
                releaseImage(e);
                this.lastTarget = new c();
                if (TextUtils.isEmpty(str)) {
                    setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
                    return;
                }
                setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_INVALID);
                if (getMeasuredWidth() <= 0 || z) {
                    final hpc.a aVar = this.lastTarget;
                    this.delayTask = new Runnable() { // from class: tb.obz
                        @Override // java.lang.Runnable
                        public final void run() {
                            M3ImageView.setImageUrl$lambda$0(hpc.this, this, str, aVar);
                        }
                    };
                    return;
                }
                e.b(getContext(), str, this.lastTarget, MUSImageQuality.AUTO);
            }
        }
    }
}
