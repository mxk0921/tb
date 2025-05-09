package com.taobao.android.order.core.dinamicX.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import tb.kor;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DXBBOrderDatePickerViewWidgetNode extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXBBORDERDATEPICKERVIEW_BBORDERDATEPICKERVIEW = 8907738506336636172L;
    public static final long DXBBORDERDATEPICKERVIEW_MAXIDATE = 4685059529398859573L;
    public static final long DXBBORDERDATEPICKERVIEW_MINDATE = 5101431220141419849L;
    public static final long DXBBORDERDATEPICKERVIEW_SELECTEDDATE = 792202854466360275L;
    public static final String TAG = "ODatePicker";

    /* renamed from: a  reason: collision with root package name */
    public String f9144a;
    public String b;
    public String c;
    public SimpleDateFormat d;
    public SimpleDateFormat e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e2d6713", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                DXBBOrderDatePickerViewWidgetNode.t(DXBBOrderDatePickerViewWidgetNode.this, i, i2, i3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    static {
        t2o.a(614465691);
    }

    public static /* synthetic */ Object ipc$super(DXBBOrderDatePickerViewWidgetNode dXBBOrderDatePickerViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/DXBBOrderDatePickerViewWidgetNode");
        }
    }

    public static /* synthetic */ void t(DXBBOrderDatePickerViewWidgetNode dXBBOrderDatePickerViewWidgetNode, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851b069a", new Object[]{dXBBOrderDatePickerViewWidgetNode, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            dXBBOrderDatePickerViewWidgetNode.u(i, i2, i3);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXBBOrderDatePickerViewWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXBBOrderDatePickerViewWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXBBOrderDatePickerViewWidgetNode dXBBOrderDatePickerViewWidgetNode = (DXBBOrderDatePickerViewWidgetNode) dXWidgetNode;
            this.f9144a = dXBBOrderDatePickerViewWidgetNode.f9144a;
            this.b = dXBBOrderDatePickerViewWidgetNode.b;
            this.c = dXBBOrderDatePickerViewWidgetNode.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DatePickerView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof DatePickerView) {
            DatePickerView datePickerView = (DatePickerView) view;
            datePickerView.setDate(this.f9144a, this.b, this.c);
            datePickerView.setDateSelectCallback(new a());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXBBORDERDATEPICKERVIEW_MAXIDATE) {
            this.f9144a = str;
        } else if (j == DXBBORDERDATEPICKERVIEW_MINDATE) {
            this.b = str;
        } else if (j == 792202854466360275L) {
            this.c = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void u(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70fdc8a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String str = i + "-" + i2 + "-" + i3;
        try {
            if (this.d == null) {
                this.d = new SimpleDateFormat("yyyy-M-d");
            }
            if (this.e == null) {
                this.e = new SimpleDateFormat("yyyy-MM-dd");
            }
            String format = this.e.format(this.d.parse(str));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", (Object) getUserId());
            jSONObject.put("selectedDate", (Object) format);
            getDXRuntimeContext().s().f().v().l("calendarViewEvent", jSONObject);
        } catch (NullPointerException e) {
            kor.d(TAG, "DatePickerView select date空指针", e);
        } catch (ParseException e2) {
            kor.d(TAG, "DatePickerView select date出错", e2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class DatePickerView extends FrameLayout implements NumberPicker.OnValueChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private b callback;
        private int currentDay;
        private int currentMonth;
        private int currentYear;
        private int maxDayOfMaxYM;
        private int maxMonthOfMaxYear;
        private int maxYear;
        private int minDayOfMinYM;
        private int minMonthOfMinYear;
        private int minYear;
        private NumberPicker year = (NumberPicker) findViewById(R.id.yearPicker);
        private NumberPicker month = (NumberPicker) findViewById(R.id.mouthPicker);
        private NumberPicker day = (NumberPicker) findViewById(R.id.dayPicker);

        static {
            t2o.a(614465694);
        }

        public DatePickerView(Context context) {
            super(context);
            LayoutInflater.from(context).inflate(R.layout.babel_layout_date_picker, this);
            this.year.setOnValueChangedListener(this);
            this.month.setOnValueChangedListener(this);
            this.day.setOnValueChangedListener(this);
            this.day.setDescendantFocusability(393216);
            this.year.setDescendantFocusability(393216);
            this.month.setDescendantFocusability(393216);
        }

        public static /* synthetic */ Object ipc$super(DatePickerView datePickerView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/DXBBOrderDatePickerViewWidgetNode$DatePickerView");
        }

        private void updateDay() {
            int i;
            int i2;
            int i3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd09751a", new Object[]{this});
                return;
            }
            NumberPicker numberPicker = this.day;
            if (this.currentYear == this.minYear && this.currentMonth == this.minMonthOfMinYear) {
                i = this.minDayOfMinYM;
            } else {
                i = 1;
            }
            numberPicker.setMinValue(i);
            int i4 = this.minYear;
            int i5 = this.maxYear;
            if (i4 == i5 && this.minMonthOfMinYear == this.maxMonthOfMaxYear) {
                this.day.setMinValue(this.minDayOfMinYM);
                this.day.setMaxValue(this.maxDayOfMaxYM);
                return;
            }
            int i6 = this.currentYear;
            if (i6 == i5 && this.currentMonth == this.maxMonthOfMaxYear) {
                this.day.setMaxValue(this.maxDayOfMaxYM);
                this.day.setMinValue(1);
                return;
            }
            int i7 = this.currentMonth;
            if (i7 == 2) {
                NumberPicker numberPicker2 = this.day;
                if ((i6 % 4 != 0 || i6 % 100 == 0) && i6 % 400 != 0) {
                    i3 = 28;
                } else {
                    i3 = 29;
                }
                numberPicker2.setMaxValue(i3);
                return;
            }
            NumberPicker numberPicker3 = this.day;
            if (i7 == 4 || i7 == 6 || i7 == 9 || i7 == 11) {
                i2 = 30;
            } else {
                i2 = 31;
            }
            numberPicker3.setMaxValue(i2);
        }

        private void updateMD() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baf3a8a7", new Object[]{this});
                return;
            }
            updateMonth();
            this.currentMonth = this.month.getValue();
            updateDay();
            this.currentDay = this.day.getValue();
        }

        private void updateMonth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa4f203e", new Object[]{this});
                return;
            }
            int i = this.maxYear;
            int i2 = this.minYear;
            if (i == i2) {
                this.month.setMinValue(this.minMonthOfMinYear);
                this.month.setMaxValue(this.maxMonthOfMaxYear);
                return;
            }
            int i3 = this.currentYear;
            if (i3 == i2) {
                this.month.setMinValue(this.minMonthOfMinYear);
                this.month.setMaxValue(12);
            } else if (i3 == i) {
                this.month.setMinValue(1);
                this.month.setMaxValue(this.maxMonthOfMaxYear);
            } else {
                this.month.setMinValue(1);
                this.month.setMaxValue(12);
            }
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c37d7836", new Object[]{this, numberPicker, new Integer(i), new Integer(i2)});
                return;
            }
            this.currentYear = this.year.getValue();
            updateMD();
            b bVar = this.callback;
            if (bVar != null) {
                ((a) bVar).a(this.year.getValue(), this.month.getValue(), this.day.getValue());
            }
        }

        public void setDateSelectCallback(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58ee48b5", new Object[]{this, bVar});
            } else {
                this.callback = bVar;
            }
        }

        public void setDate(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bca2fe55", new Object[]{this, str, str2, str3});
            } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                try {
                    String[] split = str2.split("-");
                    if (split.length >= 3) {
                        this.minYear = Integer.parseInt(split[0]);
                        this.minMonthOfMinYear = Integer.parseInt(split[1]);
                        this.minDayOfMinYM = Integer.parseInt(split[2]);
                    }
                    String[] split2 = str.split("-");
                    if (split2.length >= 3) {
                        this.maxYear = Integer.parseInt(split2[0]);
                        this.maxMonthOfMaxYear = Integer.parseInt(split2[1]);
                        this.maxDayOfMaxYM = Integer.parseInt(split2[2]);
                    }
                    String[] split3 = str3.split("-");
                    if (split3.length >= 3) {
                        this.currentYear = Integer.parseInt(split3[0]);
                        this.currentMonth = Integer.parseInt(split3[1]);
                        this.currentDay = Integer.parseInt(split3[2]);
                    }
                } catch (NumberFormatException e) {
                    kor.d(DXBBOrderDatePickerViewWidgetNode.TAG, "setMinDate", e);
                }
                this.year.setMinValue(this.minYear);
                this.year.setMaxValue(this.maxYear);
                this.year.setValue(this.currentYear);
                updateMonth();
                this.month.setValue(this.currentMonth);
                updateDay();
                this.day.setValue(this.currentDay);
            }
        }
    }
}
