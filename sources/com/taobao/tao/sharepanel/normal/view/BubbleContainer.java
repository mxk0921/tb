package com.taobao.tao.sharepanel.normal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BubbleContainer extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Bitmap mBubbleBmp;
    private Runnable mRun;
    private int mX;
    private int mY;
    public boolean mIsShow = false;
    private Handler mH = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f12758a;

        public a(TextView textView) {
            this.f12758a = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BubbleContainer.this.mBubbleBmp = Bitmap.createBitmap(this.f12758a.getMeasuredWidth(), this.f12758a.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            BubbleContainer bubbleContainer = BubbleContainer.this;
            bubbleContainer.mBubbleBmp.setDensity(bubbleContainer.getResources().getDisplayMetrics().densityDpi);
            Canvas canvas = new Canvas(BubbleContainer.this.mBubbleBmp);
            this.f12758a.draw(canvas);
            canvas.setBitmap(null);
            BubbleContainer.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Bitmap bitmap = BubbleContainer.this.mBubbleBmp;
            if (bitmap != null && !bitmap.isRecycled()) {
                BubbleContainer.this.mBubbleBmp.recycle();
                BubbleContainer bubbleContainer = BubbleContainer.this;
                bubbleContainer.mBubbleBmp = null;
                bubbleContainer.invalidate();
            }
        }
    }

    static {
        t2o.a(666894562);
    }

    public BubbleContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ Object ipc$super(BubbleContainer bubbleContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/sharepanel/normal/view/BubbleContainer");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
            if (this.mIsShow && (bitmap = this.mBubbleBmp) != null && !bitmap.isRecycled()) {
                canvas.drawBitmap(this.mBubbleBmp, this.mX, this.mY, (Paint) null);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void hideBubble(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e862136f", new Object[]{this, new Long(j)});
        } else if (this.mIsShow) {
            Runnable runnable = this.mRun;
            if (runnable == null) {
                this.mRun = new b();
            } else {
                this.mH.removeCallbacks(runnable);
            }
            this.mH.postDelayed(this.mRun, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Bitmap bitmap = this.mBubbleBmp;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mBubbleBmp.recycle();
        }
    }

    public void showBubble(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe91cc1a", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else if (!this.mIsShow) {
            this.mX = i;
            this.mY = i2;
            this.mIsShow = true;
            TextView textView = (TextView) findViewById(R.id.tv_buddle);
            textView.setText(str);
            this.mH.post(new a(textView));
        }
    }
}
