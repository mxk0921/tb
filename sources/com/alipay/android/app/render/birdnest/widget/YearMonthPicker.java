package com.alipay.android.app.render.birdnest.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.text.util.LocalePreferences;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class YearMonthPicker extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int B;
    private String D;
    public int maxYear;
    public int minYear;
    public Button monthDownBtn;
    public TextView monthEditText;
    public Button monthUpBtn;
    public Button yearDownBtn;
    public TextView yearEditText;
    public Button yearUpBtn;
    public final int REP_DELAY = 100;
    public Handler rptUpdateHandler = new Handler();
    private boolean w = true;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private boolean A = false;
    private final int C = 99;

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class RptUpdater implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RptUpdater() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (YearMonthPicker.access$200(YearMonthPicker.this)) {
                if (YearMonthPicker.access$000(YearMonthPicker.this)) {
                    YearMonthPicker.this.incrementYear();
                }
                if (YearMonthPicker.access$100(YearMonthPicker.this)) {
                    YearMonthPicker.this.incrementMonth();
                }
                YearMonthPicker yearMonthPicker = YearMonthPicker.this;
                yearMonthPicker.rptUpdateHandler.postDelayed(new RptUpdater(), 100L);
            }
            if (YearMonthPicker.access$300(YearMonthPicker.this)) {
                if (YearMonthPicker.access$000(YearMonthPicker.this)) {
                    YearMonthPicker.this.decrementYear();
                }
                if (YearMonthPicker.access$100(YearMonthPicker.this)) {
                    YearMonthPicker.this.decrementMonth();
                }
                YearMonthPicker yearMonthPicker2 = YearMonthPicker.this;
                yearMonthPicker2.rptUpdateHandler.postDelayed(new RptUpdater(), 100L);
            }
        }
    }

    public YearMonthPicker(Context context) {
        super(context);
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        String valueOf = String.valueOf(i);
        if (i > 9) {
            return valueOf;
        }
        return "0" + valueOf;
    }

    public static /* synthetic */ boolean access$000(YearMonthPicker yearMonthPicker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a317fe", new Object[]{yearMonthPicker})).booleanValue();
        }
        return yearMonthPicker.z;
    }

    public static /* synthetic */ boolean access$002(YearMonthPicker yearMonthPicker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d463b920", new Object[]{yearMonthPicker, new Boolean(z)})).booleanValue();
        }
        yearMonthPicker.z = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(YearMonthPicker yearMonthPicker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b83789d", new Object[]{yearMonthPicker})).booleanValue();
        }
        return yearMonthPicker.A;
    }

    public static /* synthetic */ boolean access$102(YearMonthPicker yearMonthPicker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b78f6c61", new Object[]{yearMonthPicker, new Boolean(z)})).booleanValue();
        }
        yearMonthPicker.A = z;
        return z;
    }

    public static /* synthetic */ boolean access$200(YearMonthPicker yearMonthPicker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d463d93c", new Object[]{yearMonthPicker})).booleanValue();
        }
        return yearMonthPicker.x;
    }

    public static /* synthetic */ boolean access$202(YearMonthPicker yearMonthPicker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9abb1fa2", new Object[]{yearMonthPicker, new Boolean(z)})).booleanValue();
        }
        yearMonthPicker.x = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(YearMonthPicker yearMonthPicker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4439db", new Object[]{yearMonthPicker})).booleanValue();
        }
        return yearMonthPicker.y;
    }

    public static /* synthetic */ boolean access$302(YearMonthPicker yearMonthPicker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7de6d2e3", new Object[]{yearMonthPicker, new Boolean(z)})).booleanValue();
        }
        yearMonthPicker.y = z;
        return z;
    }

    private Calendar getCalendar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("899b8c", new Object[]{this});
        }
        if (LocalePreferences.CalendarType.GREGORIAN.equals(this.D)) {
            return new GregorianCalendar();
        }
        return Calendar.getInstance();
    }

    public static /* synthetic */ Object ipc$super(YearMonthPicker yearMonthPicker, String str, Object... objArr) {
        if (str.hashCode() == -436676516) {
            super.onFinishInflate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/render/birdnest/widget/YearMonthPicker");
    }

    public void decrement(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4dd67a", new Object[]{this, new Boolean(z)});
        } else if (z) {
            decrementYear();
        } else {
            decrementMonth();
        }
    }

    public void decrementMonth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f22fb4", new Object[]{this});
            return;
        }
        int intValue = Integer.valueOf(this.monthEditText.getText().toString()).intValue() - 1;
        if (intValue <= 0) {
            intValue = 12;
        }
        this.monthEditText.setText(a(intValue));
    }

    public void decrementYear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a593f7", new Object[]{this});
            return;
        }
        int intValue = Integer.valueOf(this.yearEditText.getText().toString()).intValue() - 1;
        if (intValue < this.minYear) {
            intValue = this.maxYear;
        }
        this.yearEditText.setText(String.valueOf(intValue));
    }

    public void disableBeforeYear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9813eb", new Object[]{this});
            return;
        }
        this.w = false;
        int i = this.minYear;
        int i2 = this.B;
        if (i < i2) {
            i = i2;
        }
        this.minYear = i;
    }

    public void enableBeforeYear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffceb46", new Object[]{this});
        } else {
            this.w = true;
        }
    }

    public int getMonth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1e1d844", new Object[]{this})).intValue();
        }
        return Integer.valueOf(this.monthEditText.getText().toString()).intValue();
    }

    public String getMonthStr(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("128796da", new Object[]{this, new Boolean(z)});
        }
        String charSequence = this.monthEditText.getText().toString();
        if (!z) {
            return String.valueOf(Integer.valueOf(charSequence).intValue());
        }
        return charSequence;
    }

    public String getYear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("749abc26", new Object[]{this});
        }
        return this.yearEditText.getText().toString();
    }

    public void increment(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693e011e", new Object[]{this, new Boolean(z)});
        } else if (z) {
            incrementYear();
        } else {
            incrementMonth();
        }
    }

    public void incrementMonth() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c46858", new Object[]{this});
            return;
        }
        int intValue = Integer.valueOf(this.monthEditText.getText().toString()).intValue() + 1;
        if (intValue <= 12) {
            i = intValue;
        }
        this.monthEditText.setText(a(i));
    }

    public void incrementYear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4417b6d3", new Object[]{this});
            return;
        }
        int intValue = Integer.valueOf(this.yearEditText.getText().toString()).intValue() + 1;
        if (intValue > this.maxYear) {
            intValue = this.minYear;
        }
        this.yearEditText.setText(String.valueOf(intValue));
    }

    public void setButtonAction(Button button, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("267e1d93", new Object[]{this, button, new Boolean(z), new Boolean(z2)});
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.app.render.birdnest.widget.YearMonthPicker.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (z2) {
                    YearMonthPicker.this.increment(z);
                } else {
                    YearMonthPicker.this.decrement(z);
                }
            }
        });
        button.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.alipay.android.app.render.birdnest.widget.YearMonthPicker.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                YearMonthPicker.access$002(YearMonthPicker.this, z);
                YearMonthPicker.access$102(YearMonthPicker.this, !z);
                YearMonthPicker.access$202(YearMonthPicker.this, z2);
                YearMonthPicker.access$302(YearMonthPicker.this, true ^ z2);
                YearMonthPicker yearMonthPicker = YearMonthPicker.this;
                yearMonthPicker.rptUpdateHandler.post(new RptUpdater());
                return false;
            }
        });
        button.setOnTouchListener(new View.OnTouchListener() { // from class: com.alipay.android.app.render.birdnest.widget.YearMonthPicker.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (YearMonthPicker.access$200(YearMonthPicker.this)) {
                        YearMonthPicker.access$202(YearMonthPicker.this, false);
                    }
                    if (YearMonthPicker.access$300(YearMonthPicker.this)) {
                        YearMonthPicker.access$302(YearMonthPicker.this, false);
                    }
                }
                return false;
            }
        });
    }

    public void setCalendarType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bfc82b", new Object[]{this, str});
        } else {
            this.D = str;
        }
    }

    public void setCurrentDate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52f10c", new Object[]{this});
            return;
        }
        Calendar calendar = getCalendar();
        setYearMonth(calendar.get(1), calendar.get(2) + 1);
    }

    public void setDefaultYearLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f3dc6", new Object[]{this});
            return;
        }
        int i = getCalendar().get(1);
        this.B = i;
        this.minYear = Math.max(0, ((i / 100) * 100) - 100);
        this.maxYear = this.B + 99;
    }

    public void setMaxPickerYears(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a2abe36", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = getCalendar().get(1);
        this.B = i2;
        this.maxYear = i2 + i;
    }

    public void setMaxYear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f56dbd", new Object[]{this, new Integer(i)});
        } else {
            this.maxYear = i;
        }
    }

    public void setMinYear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3c988f", new Object[]{this, new Integer(i)});
        } else if (!this.w) {
            this.minYear = Math.max(this.B, i);
        } else {
            this.minYear = i;
        }
    }

    public void setYearMonth(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79e1468", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.yearEditText.setText(String.valueOf(Math.min(this.maxYear, Math.max(i, this.minYear))));
        this.monthEditText.setText(a(i2));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        this.yearUpBtn = (Button) findViewById(ResUtils.getId("year_up_btn"));
        this.yearDownBtn = (Button) findViewById(ResUtils.getId("year_down_btn"));
        this.yearEditText = (TextView) findViewById(ResUtils.getId("year_text"));
        this.monthUpBtn = (Button) findViewById(ResUtils.getId("month_up_btn"));
        this.monthDownBtn = (Button) findViewById(ResUtils.getId("month_down_btn"));
        this.monthEditText = (TextView) findViewById(ResUtils.getId("month_text"));
        setButtonAction(this.yearUpBtn, true, true);
        setButtonAction(this.yearDownBtn, true, false);
        setButtonAction(this.monthUpBtn, false, true);
        setButtonAction(this.monthDownBtn, false, false);
        setDefaultYearLimit();
    }

    public YearMonthPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(ResUtils.getLayoutId("alipay_template_year_month_picker"), (ViewGroup) this, true);
    }
}
