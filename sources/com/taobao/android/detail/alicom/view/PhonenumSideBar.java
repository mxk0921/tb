package com.taobao.android.detail.alicom.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView;
import java.util.List;
import tb.t2o;
import tb.v14;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PhonenumSideBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int choose;
    public int height;
    private List<String> letterList;
    private TextView mTextDialog;
    private a onTouchingLetterChangedListener;
    private Paint paint;
    public int singleHeight;
    public int textSize;
    public int width;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(703594526);
    }

    public PhonenumSideBar(Context context) {
        this(context, null);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setBackgroundColor(v14.a("#F5F5F5"));
        }
    }

    public static /* synthetic */ Object ipc$super(PhonenumSideBar phonenumSideBar, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/view/PhonenumSideBar");
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i2 = this.choose;
        a aVar = this.onTouchingLetterChangedListener;
        if (y <= (this.height - (this.letterList.size() * this.singleHeight)) / 2) {
            i = 0;
        } else {
            int i3 = this.height;
            int size = this.letterList.size();
            int i4 = this.singleHeight;
            if (y >= (i3 + (size * i4)) / 2) {
                i = this.letterList.size() - 1;
            } else {
                i = (int) ((y - ((this.height - (i4 * this.letterList.size())) / 2)) / this.singleHeight);
            }
        }
        if (action == 1) {
            this.choose = -1;
            invalidate();
            TextView textView = this.mTextDialog;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (i2 != i && (list = this.letterList) != null && i >= 0 && i < list.size()) {
            if (aVar != null && i < this.letterList.size() && i >= 0) {
                ((PhoneNumSalePlanView.SelectCityDialog.b) aVar).a(this.letterList.get(i));
            }
            TextView textView2 = this.mTextDialog;
            if (textView2 != null) {
                textView2.setText(this.letterList.get(i));
                this.mTextDialog.setVisibility(0);
            }
            this.choose = i;
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
        this.height = getHeight();
        int width = getWidth();
        this.width = width;
        this.textSize = (width / 3) * 2;
        this.singleHeight = width;
        this.paint.setColor(v14.a("#007AFF"));
        this.paint.setAntiAlias(true);
        this.paint.setTextSize(this.textSize);
        List<String> list = this.letterList;
        if (list == null || list.size() == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        for (int i = 0; i < this.letterList.size(); i++) {
            float measureText = (this.width / 2) - (this.paint.measureText(this.letterList.get(i)) / 2.0f);
            int i2 = this.singleHeight;
            canvas.drawText(this.letterList.get(i), measureText, (this.height / 2) + ((i - (this.letterList.size() / 2)) * i2) + ((i2 + this.textSize) / 2), this.paint);
        }
    }

    public void setIndexText(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8a6dd5", new Object[]{this, list});
            return;
        }
        this.letterList = list;
        invalidate();
    }

    public void setOnTouchingLetterChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a600f45", new Object[]{this, aVar});
        } else {
            this.onTouchingLetterChangedListener = aVar;
        }
    }

    public void setTextView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db637829", new Object[]{this, textView});
        } else {
            this.mTextDialog = textView;
        }
    }

    public PhonenumSideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhonenumSideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.choose = -1;
        this.paint = new Paint();
        init();
    }
}
