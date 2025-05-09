package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.cpb;
import tb.frr;
import tb.jw0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveCountDownView extends FrameLayout implements cpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mColonView1;
    private TextView mColonView2;
    private boolean mEnablePreForCountDown;
    private TextView mExpireText;
    private String mExpireTextStr;
    private b mFinishCallback;
    private TextView mHourView;
    private TextView mMinuteView;
    private boolean mNeedExpireText;
    private TextView mPreView;
    private View mRootView;
    private TextView mSecondView;
    private TextView mSuffixView;
    private CountDownTimer mTimer;
    private int mTag = -1;
    private long mCountToEnd = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(long j, long j2) {
            super(j, j2);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TBLiveCountDownView$1");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            if (TBLiveCountDownView.access$000(TBLiveCountDownView.this) != null) {
                TBLiveCountDownView.access$000(TBLiveCountDownView.this).setText("00");
            }
            if (TBLiveCountDownView.access$100(TBLiveCountDownView.this) != null) {
                TBLiveCountDownView.access$100(TBLiveCountDownView.this).setText("00");
            }
            if (TBLiveCountDownView.access$200(TBLiveCountDownView.this) != null) {
                TBLiveCountDownView.access$200(TBLiveCountDownView.this).setText("00");
            }
            if (TBLiveCountDownView.access$300(TBLiveCountDownView.this) != null) {
                TBLiveCountDownView.access$300(TBLiveCountDownView.this).onFinish(TBLiveCountDownView.access$400(TBLiveCountDownView.this));
            }
            TBLiveCountDownView.access$500(TBLiveCountDownView.this);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                return;
            }
            long j2 = j / 1000;
            long j3 = j2 / 3600;
            long j4 = j2 - (3600 * j3);
            long j5 = j4 / 60;
            long j6 = j4 - (60 * j5);
            if (TBLiveCountDownView.access$000(TBLiveCountDownView.this) != null) {
                if (j3 >= 100) {
                    j3 = 99;
                }
                if (j3 < 0 || j3 >= 10) {
                    TBLiveCountDownView.access$000(TBLiveCountDownView.this).setText(String.valueOf(j3));
                } else {
                    TBLiveCountDownView.access$000(TBLiveCountDownView.this).setText("0" + j3);
                }
            }
            if (TBLiveCountDownView.access$100(TBLiveCountDownView.this) != null) {
                if (j5 < 0 || j5 >= 10) {
                    TBLiveCountDownView.access$100(TBLiveCountDownView.this).setText(String.valueOf(j5));
                } else {
                    TBLiveCountDownView.access$100(TBLiveCountDownView.this).setText("0" + j5);
                }
            }
            if (TBLiveCountDownView.access$200(TBLiveCountDownView.this) == null) {
                return;
            }
            if (j6 < 0 || j6 >= 10) {
                TBLiveCountDownView.access$200(TBLiveCountDownView.this).setText(String.valueOf(j6));
                return;
            }
            TBLiveCountDownView.access$200(TBLiveCountDownView.this).setText("0" + j6);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onFinish(int i);
    }

    static {
        t2o.a(779093692);
        t2o.a(806356529);
    }

    public TBLiveCountDownView(Context context) {
        super(context);
        init(context, null, 0, false);
    }

    public static /* synthetic */ TextView access$000(TBLiveCountDownView tBLiveCountDownView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ec2452b", new Object[]{tBLiveCountDownView});
        }
        return tBLiveCountDownView.mHourView;
    }

    public static /* synthetic */ TextView access$100(TBLiveCountDownView tBLiveCountDownView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("3d73af4a", new Object[]{tBLiveCountDownView});
        }
        return tBLiveCountDownView.mMinuteView;
    }

    public static /* synthetic */ TextView access$200(TBLiveCountDownView tBLiveCountDownView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("6c251969", new Object[]{tBLiveCountDownView});
        }
        return tBLiveCountDownView.mSecondView;
    }

    public static /* synthetic */ b access$300(TBLiveCountDownView tBLiveCountDownView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("84af22b5", new Object[]{tBLiveCountDownView});
        }
        return tBLiveCountDownView.mFinishCallback;
    }

    public static /* synthetic */ int access$400(TBLiveCountDownView tBLiveCountDownView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e49ee26", new Object[]{tBLiveCountDownView})).intValue();
        }
        return tBLiveCountDownView.mTag;
    }

    public static /* synthetic */ void access$500(TBLiveCountDownView tBLiveCountDownView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb370552", new Object[]{tBLiveCountDownView});
        } else {
            tBLiveCountDownView.showExpireText();
        }
    }

    private Drawable createDrawable(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6d039adc", new Object[]{this, new Integer(i), new Float(f)});
        }
        int b2 = jw0.b(getContext(), f);
        try {
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            if (0.0f != f) {
                float f2 = b2;
                shapeDrawable.setShape(new RoundRectShape(new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, null, null));
            } else {
                shapeDrawable.setShape(new RectShape());
            }
            shapeDrawable.getPaint().setColor(i);
            return shapeDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void init(Context context, AttributeSet attributeSet, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aae784e", new Object[]{this, context, attributeSet, new Integer(i), new Boolean(z)});
            return;
        }
        boolean g = frr.g();
        this.mEnablePreForCountDown = g;
        if (!z || !g) {
            this.mRootView = LayoutInflater.from(context).inflate(R.layout.tbliveuikit_count_down_view, (ViewGroup) this, false);
        } else {
            this.mRootView = LayoutInflater.from(context).inflate(R.layout.tbliveuikit_count_down_view1, (ViewGroup) this, false);
        }
        TextView textView = (TextView) this.mRootView.findViewById(R.id.tbliveuikit_cd_pre);
        this.mPreView = textView;
        textView.setVisibility(8);
        TextView textView2 = (TextView) this.mRootView.findViewById(R.id.tbliveuikit_cd_suffix);
        this.mSuffixView = textView2;
        textView2.setVisibility(8);
        TextView textView3 = (TextView) this.mRootView.findViewById(R.id.tbliveuikit_cd_hour);
        this.mHourView = textView3;
        textView3.setVisibility(0);
        TextView textView4 = (TextView) this.mRootView.findViewById(R.id.tbliveuikit_cd_minute);
        this.mMinuteView = textView4;
        textView4.setVisibility(0);
        TextView textView5 = (TextView) this.mRootView.findViewById(R.id.tbliveuikit_cd_second);
        this.mSecondView = textView5;
        textView5.setVisibility(0);
        TextView textView6 = (TextView) this.mRootView.findViewById(R.id.tbliveuikit_cd_colon_1);
        this.mColonView1 = textView6;
        textView6.setVisibility(0);
        TextView textView7 = (TextView) this.mRootView.findViewById(R.id.tbliveuikit_cd_colon_2);
        this.mColonView2 = textView7;
        textView7.setVisibility(0);
        TextView textView8 = (TextView) this.mRootView.findViewById(R.id.tbliveuikit_expireText);
        this.mExpireText = textView8;
        textView8.setVisibility(8);
        addView(this.mRootView);
    }

    public static /* synthetic */ Object ipc$super(TBLiveCountDownView tBLiveCountDownView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/uikit/view/TBLiveCountDownView");
        }
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        TextView textView = this.mExpireText;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.mHourView;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.mMinuteView;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        TextView textView4 = this.mSecondView;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        TextView textView5 = this.mColonView1;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        TextView textView6 = this.mColonView2;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
    }

    private void showExpireText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32a65d0", new Object[]{this});
        } else if (this.mNeedExpireText && !TextUtils.isEmpty(this.mExpireTextStr)) {
            TextView textView = this.mExpireText;
            if (textView != null) {
                textView.setText(this.mExpireTextStr);
                this.mExpireText.setVisibility(0);
            }
            TextView textView2 = this.mPreView;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.mSuffixView;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.mHourView;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            TextView textView5 = this.mMinuteView;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            TextView textView6 = this.mSecondView;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.mColonView1;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            TextView textView8 = this.mColonView2;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
        }
    }

    @Override // tb.cpb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            stop();
        }
    }

    public void needExpireText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba3544b", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedExpireText = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        start(this.mTag);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        stop();
    }

    @Override // tb.cpb
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // tb.cpb
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public void setBackground(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4d0b14", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            setBackground(this.mRootView, createDrawable(i, f));
        }
    }

    public void setColonColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aaa81d6", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mColonView1;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.mColonView2;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
    }

    public void setColonSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2056d1b", new Object[]{this, new Float(f)});
            return;
        }
        TextView textView = this.mColonView1;
        if (textView != null) {
            textView.setTextSize(f);
        }
        TextView textView2 = this.mColonView2;
        if (textView2 != null) {
            textView2.setTextSize(f);
        }
    }

    public void setCountToEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb8e46a", new Object[]{this, new Long(j)});
        } else {
            this.mCountToEnd = j;
        }
    }

    public void setExpireTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9149567", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mExpireText;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setExpireTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3932236a", new Object[]{this, new Float(f)});
            return;
        }
        TextView textView = this.mExpireText;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setExpireTextStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b4e0b4", new Object[]{this, str});
        } else {
            this.mExpireTextStr = str;
        }
    }

    public void setFinishCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f0a550", new Object[]{this, bVar});
        } else {
            this.mFinishCallback = bVar;
        }
    }

    public void setPreText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7370fbf", new Object[]{this, str});
        } else if (this.mEnablePreForCountDown) {
            if (str == null) {
                str = "";
            }
            TextView textView = this.mPreView;
            if (textView != null) {
                textView.setText(str);
                this.mPreView.setVisibility(0);
            }
        }
    }

    public void setPreTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69dafc27", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mPreView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setPreTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a3e4aa", new Object[]{this, new Float(f)});
            return;
        }
        TextView textView = this.mPreView;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setSuffixText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37a88b1", new Object[]{this, str});
        } else if (this.mEnablePreForCountDown) {
            if (str == null) {
                str = "";
            }
            TextView textView = this.mSuffixView;
            if (textView != null) {
                textView.setText(str);
                this.mSuffixView.setVisibility(0);
            }
        }
    }

    public void setSuffixTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5866d019", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mSuffixView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setSuffixTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa34ca78", new Object[]{this, new Float(f)});
            return;
        }
        TextView textView = this.mSuffixView;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setTimeTextBackground(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851916ce", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        Drawable createDrawable = createDrawable(i, f);
        setBackground(this.mHourView, createDrawable);
        setBackground(this.mMinuteView, createDrawable);
        setBackground(this.mSecondView, createDrawable);
    }

    public void setTimeTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b345b15", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mHourView;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.mMinuteView;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        TextView textView3 = this.mSecondView;
        if (textView3 != null) {
            textView3.setTextColor(i);
        }
    }

    public void setTimeTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4beffc", new Object[]{this, new Float(f)});
            return;
        }
        TextView textView = this.mHourView;
        if (textView != null) {
            textView.setTextSize(f);
        }
        TextView textView2 = this.mMinuteView;
        if (textView2 != null) {
            textView2.setTextSize(f);
        }
        TextView textView3 = this.mSecondView;
        if (textView3 != null) {
            textView3.setTextSize(f);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        CountDownTimer countDownTimer = this.mTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mTimer = null;
        }
    }

    public void start(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f66283a", new Object[]{this, new Integer(i)});
        } else if (this.mCountToEnd < 1000) {
            showExpireText();
        } else {
            reset();
            if (this.mTimer == null) {
                a aVar = new a(this.mCountToEnd, 1000L);
                this.mTimer = aVar;
                this.mTag = i;
                aVar.start();
            }
        }
    }

    private void setBackground(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142cf15f", new Object[]{this, view, drawable});
        } else if (view != null && drawable != null) {
            view.setBackground(drawable);
        }
    }

    public TBLiveCountDownView(Context context, boolean z) {
        super(context);
        init(context, null, 0, z);
    }

    public TBLiveCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, false);
    }

    public TBLiveCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, false);
    }
}
