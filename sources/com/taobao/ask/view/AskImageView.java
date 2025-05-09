package com.taobao.ask.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.view.TImageView;
import tb.dme;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AskImageView extends TImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class MyRoundRectFeature extends AbsFeature<View> implements CanvasCallback, LayoutCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Paint mPaint;
        private Path mPath;
        private float[] mRadii;
        private RectF mRectF;
        private boolean mIsCircle = false;
        private float mRadiusX = 20.0f;
        private float mRadiusY = 20.0f;

        static {
            t2o.a(817889318);
        }

        public MyRoundRectFeature() {
        }

        private void invalidateHost() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9b2908a", new Object[]{this});
                return;
            }
            T t = this.mHost;
            if (t != 0) {
                t.invalidate();
            }
        }

        public static /* synthetic */ Object ipc$super(MyRoundRectFeature myRoundRectFeature, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ask/view/AskImageView$MyRoundRectFeature");
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void afterDispatchDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void afterDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void afterOnDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.LayoutCallback
        public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            this.mRectF.set(0.0f, 0.0f, this.mHost.getMeasuredWidth(), this.mHost.getMeasuredHeight());
            if (this.mIsCircle) {
                this.mRadiusX = this.mHost.getMeasuredWidth() / 2.0f;
                this.mRadiusY = this.mHost.getMeasuredHeight() / 2.0f;
            }
            this.mPath.reset();
            RectF rectF = new RectF(this.mRectF);
            float[] fArr = this.mRadii;
            if (fArr != null) {
                this.mPath.addRoundRect(rectF, fArr, Path.Direction.CW);
            } else {
                this.mPath.addRoundRect(rectF, this.mRadiusX, this.mRadiusY, Path.Direction.CW);
            }
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void beforeDispatchDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void beforeDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
            }
        }

        @Override // com.taobao.uikit.feature.callback.CanvasCallback
        public void beforeOnDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
                return;
            }
            Path path = this.mPath;
            if (path != null && !path.isEmpty()) {
                canvas.clipPath(this.mPath);
            }
        }

        @Override // com.taobao.uikit.feature.callback.LayoutCallback
        public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.uikit.feature.features.AbsFeature
        public void constructor(Context context, AttributeSet attributeSet, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
                return;
            }
            this.mPath = new Path();
            this.mRectF = new RectF();
        }

        public void setCircle(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69703e9b", new Object[]{this, new Boolean(z)});
                return;
            }
            this.mIsCircle = z;
            AskImageView.this.requestLayout();
            invalidateHost();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements dme.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
            }
        }

        public void b(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
            } else {
                AskImageView.this.setImageDrawable(bitmapDrawable);
            }
        }
    }

    static {
        t2o.a(817889316);
    }

    public AskImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(AskImageView askImageView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ask/view/AskImageView");
    }

    public void setCircle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69703e9b", new Object[]{this, new Boolean(z)});
            return;
        }
        AbsFeature<? super ImageView> findFeature = findFeature(MyRoundRectFeature.class);
        if (findFeature instanceof MyRoundRectFeature) {
            ((MyRoundRectFeature) findFeature).setCircle(z);
            return;
        }
        MyRoundRectFeature myRoundRectFeature = new MyRoundRectFeature();
        myRoundRectFeature.setCircle(z);
        addFeature(myRoundRectFeature);
    }

    public void setImageUrl(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960413c", new Object[]{this, str, new Integer(i)});
            return;
        }
        setImageDrawable(new ColorDrawable(i));
        if (!TextUtils.isEmpty(str)) {
            dme.a(getContext(), str, -1, -1, new a());
        }
    }

    public AskImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AskImageView(Context context) {
        super(context);
        init();
    }
}
