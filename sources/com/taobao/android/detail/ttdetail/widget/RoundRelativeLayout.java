package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RoundRelativeLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float bottomLeftRadius;
    private float bottomRightRadius;
    private Paint imagePaint;
    private Paint roundPaint;
    private float topLeftRadius;
    private float topRightRadius;
    private boolean useClipOutLine;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6985a;

        public a(RoundRelativeLayout roundRelativeLayout, int i) {
            this.f6985a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/RoundRelativeLayout$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f6985a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6986a;

        public b(RoundRelativeLayout roundRelativeLayout, int i) {
            this.f6986a = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/RoundRelativeLayout$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, -this.f6986a, view.getWidth(), view.getHeight(), this.f6986a);
            outline.offset(0, this.f6986a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6987a;

        public c(RoundRelativeLayout roundRelativeLayout, int i) {
            this.f6987a = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/RoundRelativeLayout$3");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            int i = this.f6987a;
            outline.setRoundRect(0, 0, width, height + i, i);
            outline.offset(0, -this.f6987a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6988a;

        public d(RoundRelativeLayout roundRelativeLayout, int i) {
            this.f6988a = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/RoundRelativeLayout$4");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(-this.f6988a, 0, view.getWidth(), view.getHeight(), this.f6988a);
            outline.offset(this.f6988a, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6989a;

        public e(RoundRelativeLayout roundRelativeLayout, int i) {
            this.f6989a = i;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/RoundRelativeLayout$5");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth() + this.f6989a, view.getHeight(), this.f6989a);
            outline.offset(-this.f6989a, 0);
        }
    }

    static {
        t2o.a(912262912);
    }

    public RoundRelativeLayout(Context context) {
        this(context, null);
    }

    private void drawBottomLeft(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2519f948", new Object[]{this, canvas});
        } else if (this.bottomLeftRadius > 0.0f) {
            int height = getHeight();
            Path path = new Path();
            float f = height;
            path.moveTo(0.0f, f - this.bottomLeftRadius);
            path.lineTo(0.0f, f);
            path.lineTo(this.bottomLeftRadius, f);
            float f2 = this.bottomLeftRadius;
            path.arcTo(new RectF(0.0f, f - (f2 * 2.0f), f2 * 2.0f, f), 90.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private void drawBottomRight(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94031711", new Object[]{this, canvas});
        } else if (this.bottomRightRadius > 0.0f) {
            int height = getHeight();
            int width = getWidth();
            Path path = new Path();
            float f = width;
            float f2 = height;
            path.moveTo(f - this.bottomRightRadius, f2);
            path.lineTo(f, f2);
            path.lineTo(f, f2 - this.bottomRightRadius);
            float f3 = this.bottomRightRadius;
            path.arcTo(new RectF(f - (f3 * 2.0f), f2 - (f3 * 2.0f), f, f2), 0.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private void drawTopLeft(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a968a6", new Object[]{this, canvas});
        } else if (this.topLeftRadius > 0.0f) {
            Path path = new Path();
            path.moveTo(0.0f, this.topLeftRadius);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(this.topLeftRadius, 0.0f);
            float f = this.topLeftRadius;
            path.arcTo(new RectF(0.0f, 0.0f, f * 2.0f, f * 2.0f), -90.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private void drawTopRight(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56619373", new Object[]{this, canvas});
        } else if (this.topRightRadius > 0.0f) {
            int width = getWidth();
            Path path = new Path();
            float f = width;
            path.moveTo(f - this.topRightRadius, 0.0f);
            path.lineTo(f, 0.0f);
            path.lineTo(f, this.topRightRadius);
            float f2 = this.topRightRadius;
            path.arcTo(new RectF(f - (f2 * 2.0f), 0.0f, f, f2 * 2.0f), 0.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    public static /* synthetic */ Object ipc$super(RoundRelativeLayout roundRelativeLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/RoundRelativeLayout");
    }

    private boolean isSupportClipOutline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbe74c58", new Object[]{this})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 22 || i >= 29) {
            return false;
        }
        return true;
    }

    private void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        if (isSupportClipOutline()) {
            float f = this.topLeftRadius;
            float f2 = this.topRightRadius;
            int i = (f > f2 ? 1 : (f == f2 ? 0 : -1));
            if (i == 0) {
                float f3 = this.bottomLeftRadius;
                if (f == f3 && f3 == this.bottomRightRadius) {
                    setOutlineProvider(new a(this, (int) f));
                    setClipToOutline(true);
                    this.useClipOutLine = true;
                    return;
                }
            }
            if (i == 0 && this.bottomLeftRadius == 0.0f && this.bottomRightRadius == 0.0f) {
                setOutlineProvider(new b(this, (int) f));
                setClipToOutline(true);
                this.useClipOutLine = true;
                return;
            }
            float f4 = this.bottomLeftRadius;
            float f5 = this.bottomRightRadius;
            if (f4 == f5 && f == 0.0f && f2 == 0.0f) {
                setOutlineProvider(new c(this, (int) f4));
                setClipToOutline(true);
                this.useClipOutLine = true;
                return;
            } else if (f == f4 && f2 == 0.0f && f5 == 0.0f) {
                setOutlineProvider(new d(this, (int) f));
                setClipToOutline(true);
                this.useClipOutLine = true;
                return;
            } else if (f2 == f5 && f == 0.0f && f4 == 0.0f) {
                setOutlineProvider(new e(this, (int) f2));
                setClipToOutline(true);
                this.useClipOutLine = true;
                return;
            }
        }
        Paint paint = new Paint();
        this.roundPaint = paint;
        paint.setColor(-1);
        this.roundPaint.setAntiAlias(true);
        this.roundPaint.setStyle(Paint.Style.FILL);
        this.roundPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.imagePaint = paint2;
        paint2.setXfermode(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (this.useClipOutLine) {
            super.dispatchDraw(canvas);
        } else {
            canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.imagePaint, 31);
            super.dispatchDraw(canvas);
            drawTopLeft(canvas);
            drawTopRight(canvas);
            drawBottomLeft(canvas);
            drawBottomRight(canvas);
            canvas.restore();
        }
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            setRadius(f, f, f, f);
        }
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6855c89b", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.topLeftRadius = f;
        this.topRightRadius = f2;
        this.bottomLeftRadius = f3;
        this.bottomRightRadius = f4;
        prepare();
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.useClipOutLine = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TTRoundRelativeLayout);
            float dimension = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_allRadius, 0.0f);
            this.topLeftRadius = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_topLeftRadius, dimension);
            this.topRightRadius = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_topRightRadius, dimension);
            this.bottomLeftRadius = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_bottomLeftRadius, dimension);
            this.bottomRightRadius = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_bottomRightRadius, dimension);
            obtainStyledAttributes.recycle();
        }
        prepare();
    }
}
