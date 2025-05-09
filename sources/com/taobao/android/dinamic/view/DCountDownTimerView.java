package com.taobao.android.dinamic.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;
import tb.ym7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DCountDownTimerView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DCountDownTimerView";
    private TextView colonFirst;
    private TextView colonSecond;
    private View countDownTimerContainer;
    private long futureTime;
    private boolean hasRegisterReceiver;
    private TextView hour;
    private boolean isAttached;
    private HandlerTimer mTimer;
    private TextView minute;
    private TextView second;
    private TextView seeMoreView;
    private boolean isNativeTime = true;
    private long offset = 0;
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamic.view.DCountDownTimerView.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/view/DCountDownTimerView$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (DCountDownTimerView.access$100(DCountDownTimerView.this) != null) {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    DCountDownTimerView.access$100(DCountDownTimerView.this).g();
                } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                } else {
                    if (!DCountDownTimerView.this.isShown() || DCountDownTimerView.access$200(DCountDownTimerView.this) <= 0) {
                        DCountDownTimerView.access$100(DCountDownTimerView.this).g();
                    } else {
                        DCountDownTimerView.access$100(DCountDownTimerView.this).e();
                    }
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DCountDownTimerView.access$000(DCountDownTimerView.this)) {
                DCountDownTimerView.this.updateCountDownViewTime();
            }
        }
    }

    static {
        t2o.a(444596410);
    }

    public DCountDownTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public static /* synthetic */ boolean access$000(DCountDownTimerView dCountDownTimerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b738a8", new Object[]{dCountDownTimerView})).booleanValue();
        }
        return dCountDownTimerView.isAttached;
    }

    public static /* synthetic */ HandlerTimer access$100(DCountDownTimerView dCountDownTimerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerTimer) ipChange.ipc$dispatch("29f064f0", new Object[]{dCountDownTimerView});
        }
        return dCountDownTimerView.mTimer;
    }

    public static /* synthetic */ long access$200(DCountDownTimerView dCountDownTimerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13becf56", new Object[]{dCountDownTimerView})).longValue();
        }
        return dCountDownTimerView.futureTime;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.homepage_component_count_down_timer_view, this);
        this.hour = (TextView) findViewById(R.id.tv_hours);
        this.minute = (TextView) findViewById(R.id.tv_minutes);
        this.second = (TextView) findViewById(R.id.tv_seconds);
        this.colonFirst = (TextView) findViewById(R.id.tv_colon1);
        this.colonSecond = (TextView) findViewById(R.id.tv_colon2);
        this.countDownTimerContainer = findViewById(R.id.count_down_timer_view_container);
        this.seeMoreView = (TextView) findViewById(R.id.see_more_default);
    }

    public static /* synthetic */ Object ipc$super(DCountDownTimerView dCountDownTimerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic/view/DCountDownTimerView");
        }
    }

    public TextView getColonFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ade27602", new Object[]{this});
        }
        return this.colonFirst;
    }

    public TextView getColonSecond() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("67993df8", new Object[]{this});
        }
        return this.colonSecond;
    }

    public TextView getHour() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("bec87b55", new Object[]{this});
        }
        return this.hour;
    }

    public long getLastTime() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e823bf4", new Object[]{this})).longValue();
        }
        if (this.futureTime <= 0) {
            return -1L;
        }
        if (this.isNativeTime) {
            j = System.currentTimeMillis();
        } else {
            j = SystemClock.elapsedRealtime() + this.offset;
        }
        return this.futureTime - j;
    }

    public TextView getMinute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("34e4fe05", new Object[]{this});
        }
        return this.minute;
    }

    public TextView getSecond() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("27614c65", new Object[]{this});
        }
        return this.second;
    }

    public TextView getSeeMoreView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a117cb52", new Object[]{this});
        }
        return this.seeMoreView;
    }

    public HandlerTimer getTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerTimer) ipChange.ipc$dispatch("4440a93d", new Object[]{this});
        }
        if (this.mTimer == null) {
            this.mTimer = new HandlerTimer(1000L, new a());
        }
        return this.mTimer;
    }

    public void hideCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4c2c36", new Object[]{this});
            return;
        }
        this.seeMoreView.setVisibility(0);
        this.countDownTimerContainer.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.isAttached = true;
        HandlerTimer handlerTimer = this.mTimer;
        if (handlerTimer != null && this.futureTime > 0) {
            handlerTimer.e();
        }
        if (!this.hasRegisterReceiver) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            getContext().registerReceiver(this.mReceiver, intentFilter);
            this.hasRegisterReceiver = true;
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
        this.isAttached = false;
        HandlerTimer handlerTimer = this.mTimer;
        if (handlerTimer != null) {
            handlerTimer.g();
        }
        try {
            getContext().unregisterReceiver(this.mReceiver);
            this.hasRegisterReceiver = false;
        } catch (Exception e) {
            ym7.c("DCountDownTimerView", e, new String[0]);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        HandlerTimer handlerTimer = this.mTimer;
        if (handlerTimer != null) {
            if (i != 0 || this.futureTime <= 0) {
                handlerTimer.g();
            } else {
                handlerTimer.e();
            }
        }
    }

    public void setCurrentTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105f79", new Object[]{this, new Long(j)});
            return;
        }
        this.isNativeTime = false;
        this.offset = j - SystemClock.elapsedRealtime();
    }

    public void setFutureTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02eb12b", new Object[]{this, new Long(j)});
        } else {
            this.futureTime = j;
        }
    }

    public void showCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("220c965b", new Object[]{this});
            return;
        }
        this.seeMoreView.setVisibility(8);
        this.countDownTimerContainer.setVisibility(0);
    }

    public void updateCountDownViewTime() {
        long j;
        long j2;
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670e9e41", new Object[]{this});
        } else if (this.countDownTimerContainer != null) {
            long lastTime = getLastTime();
            if (lastTime > 0) {
                long j4 = 3600000;
                j2 = lastTime / j4;
                long j5 = lastTime - (j4 * j2);
                long j6 = 60000;
                j = j5 / j6;
                j3 = (j5 - (j6 * j)) / 1000;
            } else {
                j3 = 0;
                j2 = 0;
                j = 0;
            }
            if (j2 > 99 || j > 60 || j3 > 60 || (j2 == 0 && j == 0 && j3 == 0)) {
                this.countDownTimerContainer.setVisibility(8);
                this.seeMoreView.setVisibility(0);
                return;
            }
            int i = (int) (j3 % 10);
            this.hour.setText(((int) (j2 / 10)) + "" + ((int) (j2 % 10)));
            this.minute.setText(((int) (j / 10)) + "" + ((int) (j % 10)));
            this.second.setText(((int) (j3 / 10)) + "" + i);
            this.countDownTimerContainer.setVisibility(0);
            this.seeMoreView.setVisibility(8);
        }
    }

    public DCountDownTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public DCountDownTimerView(Context context) {
        super(context);
        init();
    }
}
