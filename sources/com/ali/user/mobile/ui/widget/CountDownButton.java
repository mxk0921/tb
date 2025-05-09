package com.ali.user.mobile.ui.widget;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CountDownButton extends AppCompatButton {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CountListener mCountListener;
    public int mGetCodeTitleRes;
    public int mTickTitleRes;
    private TimeCountDown mTimeCountDown;
    private boolean needBackground = false;
    private boolean isCountDowning = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface CountListener {
        void onTick(long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class TimeCountDown extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(70254885);
        }

        public TimeCountDown(long j, long j2) {
            super(j, j2);
        }

        public static /* synthetic */ Object ipc$super(TimeCountDown timeCountDown, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ui/widget/CountDownButton$TimeCountDown");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            CountDownButton countDownButton = CountDownButton.this;
            if (countDownButton.mGetCodeTitleRes != 0) {
                countDownButton.setText(countDownButton.getContext().getString(CountDownButton.this.mGetCodeTitleRes));
                if (CountDownButton.access$000(CountDownButton.this)) {
                    CountDownButton countDownButton2 = CountDownButton.this;
                    countDownButton2.setBackgroundDrawable(countDownButton2.getResources().getDrawable(R.drawable.aliuser_btn_background_orange_round));
                }
            } else {
                countDownButton.setText(countDownButton.getContext().getString(R.string.aliuser_signup_verification_getCode));
            }
            CountDownButton.this.setEnabled(true);
            CountDownButton.access$102(CountDownButton.this, false);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                return;
            }
            long j2 = (j / 1000) + 1;
            CountDownButton countDownButton = CountDownButton.this;
            if (countDownButton.mTickTitleRes != 0) {
                countDownButton.setText(countDownButton.getResources().getString(CountDownButton.this.mTickTitleRes, String.valueOf(j2)));
            } else {
                countDownButton.setText(String.valueOf(j2) + CountDownButton.this.getContext().getString(R.string.aliuser_signup_verification_reGetCode));
            }
            CountDownButton.this.setEnabled(false);
            CountListener countListener = CountDownButton.this.mCountListener;
            if (countListener != null) {
                countListener.onTick(j);
            }
        }
    }

    static {
        t2o.a(70254883);
    }

    public CountDownButton(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$000(CountDownButton countDownButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff1f0323", new Object[]{countDownButton})).booleanValue();
        }
        return countDownButton.needBackground;
    }

    public static /* synthetic */ boolean access$102(CountDownButton countDownButton, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("288bcbdc", new Object[]{countDownButton, new Boolean(z)})).booleanValue();
        }
        countDownButton.isCountDowning = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(CountDownButton countDownButton, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ui/widget/CountDownButton");
    }

    public void cancelCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f295fe", new Object[]{this});
            return;
        }
        TimeCountDown timeCountDown = this.mTimeCountDown;
        if (timeCountDown != null) {
            timeCountDown.cancel();
        }
        this.isCountDowning = false;
    }

    public boolean isCountDowning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89aa4146", new Object[]{this})).booleanValue();
        }
        return this.isCountDowning;
    }

    public void setGetCodeTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadf3a85", new Object[]{this, new Integer(i)});
        } else {
            this.mGetCodeTitleRes = i;
        }
    }

    public void setNeedBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933a4387", new Object[]{this, new Boolean(z)});
        } else {
            this.needBackground = z;
        }
    }

    public void setTickListener(CountListener countListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c689bd", new Object[]{this, countListener});
        } else {
            this.mCountListener = countListener;
        }
    }

    public void setTickTitleRes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46a9255", new Object[]{this, new Integer(i)});
        } else {
            this.mTickTitleRes = i;
        }
    }

    public void startCountDown(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f7c416", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        TimeCountDown timeCountDown = new TimeCountDown(j, j2);
        this.mTimeCountDown = timeCountDown;
        timeCountDown.start();
        this.isCountDowning = true;
    }

    public CountDownButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
