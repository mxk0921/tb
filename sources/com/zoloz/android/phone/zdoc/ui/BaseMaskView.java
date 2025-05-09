package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.R;
import java.util.Arrays;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class BaseMaskView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBackgroundColor;
    public RectF mCaptureRect;
    public Paint mCoverPaint;
    public Paint mFramePaint;
    public int mLineColor;
    private float mInvisibleHeight = 0.2f;
    public float mBottomMargin = 0.8f;
    public boolean mIsDrawn = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Path f15162a;

        static {
            t2o.a(245366966);
        }

        public a(BaseMaskView baseMaskView, Path path) {
            this.f15162a = path;
        }

        public abstract void a(Canvas canvas, Paint paint);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(245366967);
        }

        public b(BaseMaskView baseMaskView, Path path) {
            super(baseMaskView, path);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/BaseMaskView$CoverMaskDrawer");
        }

        @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView.a
        public void a(Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fa8ce0f", new Object[]{this, canvas, paint});
                return;
            }
            canvas.save();
            canvas.clipPath(this.f15162a, Region.Op.DIFFERENCE);
            canvas.drawColor(paint.getColor());
            canvas.restore();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(245366968);
        }

        public c(BaseMaskView baseMaskView, Path path) {
            super(baseMaskView, path);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/BaseMaskView$FrameMaskDrawer");
        }

        @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView.a
        public void a(Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fa8ce0f", new Object[]{this, canvas, paint});
                return;
            }
            canvas.save();
            canvas.drawPath(this.f15162a, paint);
            canvas.restore();
        }
    }

    static {
        t2o.a(245366965);
    }

    public BaseMaskView(Context context) {
        super(context);
        init(context, null);
    }

    private int getColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("384a2dc2", new Object[]{this, new Integer(i)})).intValue();
        }
        return getResources().getColor(i);
    }

    public static /* synthetic */ Object ipc$super(BaseMaskView baseMaskView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1621401666) {
            super.invalidate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/zoloz/android/phone/zdoc/ui/BaseMaskView");
        }
    }

    private boolean isCanRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be11dfc0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract RectF calcCaptureRect(int i, int i2);

    public RectF getCaptureRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("e556d76c", new Object[]{this});
        }
        return this.mCaptureRect;
    }

    public int getCenterPositionY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c31b3f", new Object[]{this})).intValue();
        }
        RectF rectF = this.mCaptureRect;
        if (rectF == null) {
            return 0;
        }
        return (int) (rectF.top + (rectF.height() / 2.0f));
    }

    public abstract List<a> getCoverDrawer(int i, int i2);

    public Rect getDocFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("e09f335b", new Object[]{this});
        }
        if (this.mCaptureRect == null) {
            return new Rect(0, 0, getWidth(), getHeight());
        }
        RectF rectF = this.mCaptureRect;
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public abstract List<a> getFrameDrawer(int i, int i2);

    public int getInvisibleHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f953ae78", new Object[]{this})).intValue();
        }
        return (int) (getHeight() * this.mInvisibleHeight);
    }

    public int getStokeWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df7cdd0e", new Object[]{this})).intValue();
        }
        return 2;
    }

    public int getTipsBottomMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b656381", new Object[]{this})).intValue();
        }
        return (int) (getHeight() * this.mBottomMargin);
    }

    public void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DefaultMaskView);
        this.mBackgroundColor = obtainStyledAttributes.getColor(R.styleable.DefaultMaskView_z_mask_background, getColor(R.color.z_black_60));
        this.mLineColor = obtainStyledAttributes.getColor(R.styleable.DefaultMaskView_z_line_color, getColor(R.color.z_white));
        this.mInvisibleHeight = obtainStyledAttributes.getFloat(R.styleable.DefaultMaskView_z_mask_invisible_height, this.mInvisibleHeight);
        this.mBottomMargin = obtainStyledAttributes.getFloat(R.styleable.DefaultMaskView_z_mask_bottom_margin, this.mBottomMargin);
        initCustomAttributes(context, attributeSet);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.mCoverPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCoverPaint.setColor(this.mBackgroundColor);
        this.mCoverPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.mFramePaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mFramePaint.setColor(this.mLineColor);
        this.mFramePaint.setAntiAlias(true);
        this.mFramePaint.setStrokeWidth((int) (getStokeWidth() * getContext().getResources().getDisplayMetrics().density));
    }

    public void initCustomAttributes(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ea9f25", new Object[]{this, context, attributeSet});
        }
    }

    @Override // android.view.View
    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        this.mIsDrawn = false;
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (!this.mIsDrawn || isCanRefresh()) {
            this.mCaptureRect = calcCaptureRect(canvas.getWidth(), canvas.getHeight());
            List<a> coverDrawer = getCoverDrawer(canvas.getWidth(), canvas.getHeight());
            if (coverDrawer != null) {
                for (a aVar : coverDrawer) {
                    aVar.a(canvas, this.mCoverPaint);
                }
            }
            List<a> frameDrawer = getFrameDrawer(canvas.getWidth(), canvas.getHeight());
            if (frameDrawer != null) {
                for (a aVar2 : frameDrawer) {
                    aVar2.a(canvas, this.mFramePaint);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mCaptureRect == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.mCaptureRect.contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        return true;
    }

    public void setLineColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a147d5ef", new Object[]{this, new Integer(i)});
            return;
        }
        this.mLineColor = i;
        this.mFramePaint.setColor(i);
    }

    public void setMaskColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e1d6e7", new Object[]{this, new Integer(i)});
            return;
        }
        this.mBackgroundColor = i;
        this.mCoverPaint.setColor(i);
    }

    public List<a> toList(a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5a1f6e36", new Object[]{this, aVarArr});
        }
        if (aVarArr != null) {
            return Arrays.asList(aVarArr);
        }
        return null;
    }

    public void updateMaskAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f58ab0", new Object[]{this, new Float(f)});
            return;
        }
        BioLog.i("BaseMaskView", " anim " + f);
        this.mCoverPaint.setAlpha((int) (f * 255.0f));
    }

    public BaseMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public BaseMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
