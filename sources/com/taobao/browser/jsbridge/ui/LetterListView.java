package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LetterListView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public OnTouchingLetterChangedListener onTouchingLetterChangedListener;
    public String[] b = {"A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
    public int choose = -1;
    public Paint paint = new Paint();
    public boolean showBkg = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface OnTouchingLetterChangedListener {
        void onTouchingLetterChanged(String str);
    }

    static {
        t2o.a(619708581);
    }

    public LetterListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(LetterListView letterListView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/jsbridge/ui/LetterListView");
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.choose;
        OnTouchingLetterChangedListener onTouchingLetterChangedListener = this.onTouchingLetterChangedListener;
        float height = y / getHeight();
        String[] strArr = this.b;
        int length = (int) (height * strArr.length);
        if (action == 0) {
            this.showBkg = true;
            if (i != length && onTouchingLetterChangedListener != null && length > 0 && length < strArr.length) {
                onTouchingLetterChangedListener.onTouchingLetterChanged(strArr[length]);
                this.choose = length;
                invalidate();
            }
        } else if (action == 1) {
            this.showBkg = false;
            this.choose = -1;
            invalidate();
        } else if (action == 2 && i != length && onTouchingLetterChangedListener != null && length >= 0 && length < strArr.length) {
            onTouchingLetterChangedListener.onTouchingLetterChanged(strArr[length]);
            this.choose = length;
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.showBkg) {
            canvas.drawColor(Color.parseColor("#40000000"));
        }
        int height = getHeight();
        int width = getWidth();
        int length = height / this.b.length;
        for (int i = 0; i < this.b.length; i++) {
            this.paint.setColor(-65536);
            this.paint.setTextSize((width * 3) / 5);
            this.paint.setTypeface(Typeface.DEFAULT);
            this.paint.setAntiAlias(true);
            if (i == this.choose) {
                this.paint.setColor(Color.parseColor("#3399ff"));
                this.paint.setFakeBoldText(true);
            }
            canvas.drawText(this.b[i], (width / 2) - (this.paint.measureText(this.b[i]) / 2.0f), (length * i) + length, this.paint);
            this.paint.reset();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTouchingLetterChangedListener(OnTouchingLetterChangedListener onTouchingLetterChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91895df", new Object[]{this, onTouchingLetterChangedListener});
        } else {
            this.onTouchingLetterChangedListener = onTouchingLetterChangedListener;
        }
    }

    public LetterListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LetterListView(Context context) {
        super(context);
    }
}
