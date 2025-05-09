package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.calander.Calendar;
import com.taobao.android.dinamicx.widget.calander.CalendarView;
import com.taobao.android.dinamicx.widget.calander.DXOnCalendarMonthUIRangeChangeEvent;
import com.taobao.android.dinamicx.widget.calander.DXOnSelectDateEvent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ef5 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCALENDARVIEW_ANCHORDATE = -8904535438500141309L;
    public static final long DXCALENDARVIEW_AUTOCHANGEMONTH = 8833414845409451796L;
    public static final long DXCALENDARVIEW_BEGINDATE = -1860805752639688564L;
    public static final long DXCALENDARVIEW_CALENDARITEMHEIGHT = -1496427289189049292L;
    public static final long DXCALENDARVIEW_CALENDARVIEW = 116344237634520001L;
    public static final long DXCALENDARVIEW_CURRENTDAYTEXTSIZE = -7647500290265887373L;
    public static final long DXCALENDARVIEW_DATETOPGAP = -5929381539273250573L;
    public static final long DXCALENDARVIEW_DAYTEXTGRAVITY = 262055229558107607L;
    public static final long DXCALENDARVIEW_DAYTEXTSIZE = -8982072168126024311L;
    public static final long DXCALENDARVIEW_DISABLEDDATES = 2788104028282969654L;
    public static final long DXCALENDARVIEW_ENDDATE = 4804791552104474556L;
    public static final long DXCALENDARVIEW_FONT = 34149272427L;
    public static final long DXCALENDARVIEW_HIGHLIGHTCURRENTDAYUNSELECTED = -4751183184166360670L;
    public static final long DXCALENDARVIEW_HIGHLIGHTDATES = -4039211786071886953L;
    public static final long DXCALENDARVIEW_ITEMBOTTOMPADDING = -1606397561075253268L;
    public static final long DXCALENDARVIEW_ITEMTOPPADDING = -2470631056276577113L;
    public static final long DXCALENDARVIEW_ONCHANGE = 5288679823228297259L;
    public static final long DXCALENDARVIEW_ONMONTHCHANGE = -5286047925153782218L;
    public static final long DXCALENDARVIEW_ONTAPDISABLEDATE = 4959443637101445444L;
    public static final long DXCALENDARVIEW_SCROLLABLE = 5099976257538233901L;
    public static final long DXCALENDARVIEW_SELECTEDDATE = 792202854466360275L;
    public static final long DXCALENDARVIEW_SELECTTEXTCOLOR = 2053814541299040819L;
    public static final long DXCALENDARVIEW_WEEKBARTEXTCOLOR = -3668263311141608587L;

    /* renamed from: a  reason: collision with root package name */
    public String f18525a;
    public String c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String i;
    public int j;
    public CalendarView k;
    public TextView l;
    public JSONArray m;
    public JSONObject n;
    public int r;
    public int t;
    public int u;
    public boolean b = true;
    public int h = -1;
    public boolean o = false;
    public int p = 0;
    public boolean q = true;
    public int s = -13421773;
    public boolean v = false;
    public boolean w = false;
    public final CalendarView.d x = new c();
    public final CalendarView.e y = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ef5.t(ef5.this).scrollToPre(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ef5.t(ef5.this).scrollToNext(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements CalendarView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.dinamicx.widget.calander.CalendarView.d
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fcdf158", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            ef5.u(ef5.this).setText(String.format(Locale.getDefault(), "%d年%d月", Integer.valueOf(i), Integer.valueOf(i2)));
            ef5.t(ef5.this).updateMonthArrowStatus();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements CalendarView.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void a(Calendar calendar, String str, Pair<String, String> pair) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bf7a761", new Object[]{this, calendar, str, pair});
                return;
            }
            DXOnCalendarMonthUIRangeChangeEvent dXOnCalendarMonthUIRangeChangeEvent = new DXOnCalendarMonthUIRangeChangeEvent(ef5.DXCALENDARVIEW_ONMONTHCHANGE);
            if (calendar != null) {
                dXOnCalendarMonthUIRangeChangeEvent.setData("selectedDate", calendar.getDateString());
            }
            if (!TextUtils.isEmpty(str)) {
                dXOnCalendarMonthUIRangeChangeEvent.setData("anchorDate", str);
            }
            if (pair != null) {
                dXOnCalendarMonthUIRangeChangeEvent.setData("startDate", (String) pair.first);
                dXOnCalendarMonthUIRangeChangeEvent.setData("endDate", (String) pair.second);
                ef5.this.postEvent(dXOnCalendarMonthUIRangeChangeEvent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597280);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ef5();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements CalendarView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597281);
            t2o.a(444597476);
        }

        public f() {
        }

        @Override // com.taobao.android.dinamicx.widget.calander.CalendarView.b
        public void a(Calendar calendar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab3a194c", new Object[]{this, calendar});
            } else if (ef5.t(ef5.this).isDisable(calendar)) {
                DXEvent dXEvent = new DXEvent(ef5.DXCALENDARVIEW_ONTAPDISABLEDATE);
                HashMap hashMap = new HashMap();
                hashMap.put("disableDate", mw5.O(calendar.getDateString()));
                dXEvent.setArgs(hashMap);
                ef5.this.postEvent(dXEvent);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.calander.CalendarView.b
        public void b(Calendar calendar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c990384", new Object[]{this, calendar, new Boolean(z)});
            } else if (z) {
                DXOnSelectDateEvent dXOnSelectDateEvent = new DXOnSelectDateEvent(5288679823228297259L);
                dXOnSelectDateEvent.addData("selectedDate", calendar.getDateString());
                ef5.this.postEvent(dXOnSelectDateEvent);
            }
        }

        public /* synthetic */ f(ef5 ef5Var, a aVar) {
            this();
        }
    }

    static {
        t2o.a(444597275);
    }

    public static /* synthetic */ Object ipc$super(ef5 ef5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXCalendarViewWidgetNode");
        }
    }

    public static /* synthetic */ CalendarView t(ef5 ef5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CalendarView) ipChange.ipc$dispatch("1e0f8f2c", new Object[]{ef5Var});
        }
        return ef5Var.k;
    }

    public static /* synthetic */ TextView u(ef5 ef5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d73e1d87", new Object[]{ef5Var});
        }
        return ef5Var.l;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ef5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof ef5) {
            super.onClone(dXWidgetNode, z);
            ef5 ef5Var = (ef5) dXWidgetNode;
            this.j = ef5Var.j;
            this.c = ef5Var.c;
            this.e = ef5Var.e;
            this.p = ef5Var.p;
            this.f = ef5Var.f;
            this.h = ef5Var.h;
            this.i = ef5Var.i;
            this.m = ef5Var.m;
            this.n = ef5Var.n;
            this.q = ef5Var.q;
            this.b = ef5Var.b;
            this.f18525a = ef5Var.f18525a;
            this.g = ef5Var.g;
            this.d = ef5Var.d;
            this.r = ef5Var.r;
            this.s = ef5Var.s;
            this.t = ef5Var.t;
            this.u = ef5Var.u;
            this.v = ef5Var.v;
            this.w = ef5Var.w;
            this.o = ef5Var.o;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        View a2 = xb6.a(context, R.layout.datepicker_widget);
        this.k = (CalendarView) a2.findViewById(R.id.calendarView);
        this.l = (TextView) a2.findViewById(R.id.tv_cur_month);
        int i = R.id.iv_left;
        ImageView imageView = (ImageView) a2.findViewById(i);
        int i2 = R.id.iv_right;
        ImageView imageView2 = (ImageView) a2.findViewById(i2);
        imageView.setOnClickListener(new a());
        imageView2.setOnClickListener(new b());
        int i3 = this.e;
        if (i3 != 0) {
            this.k.setDayTextSize(i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            this.k.setCurrentDayTextSize(i4);
        }
        this.k.setCalendarItemHeight(this.j);
        this.k.setOnMonthChangeListener(this.x);
        this.k.setOnMonthUIRangeChangeListener(this.y);
        a2.setTag(R.id.dx_date_picker_view_tag, this.k);
        this.k.setTag(i, imageView);
        this.k.setTag(i2, imageView2);
        return a2;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else {
            int c2 = com.taobao.android.dinamicx.widget.calander.a.c(getDXRuntimeContext().h(), 50.0f);
            int i3 = this.j;
            if (i3 <= 0) {
                i3 = com.taobao.android.dinamicx.widget.calander.a.c(getDXRuntimeContext().h(), 56.0f);
            }
            setMeasuredDimension(i, c2 + com.taobao.android.dinamicx.widget.calander.a.c(getDXRuntimeContext().h(), 40.0f) + this.r + (i3 * 6));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view != null) {
            if (this.k == null) {
                Object tag = view.getTag(R.id.dx_date_picker_view_tag);
                if (tag instanceof CalendarView) {
                    this.k = (CalendarView) tag;
                }
            }
            if (this.v) {
                this.k.setItemTopPadding(this.u);
            }
            if (this.w) {
                this.k.setItemBottomPadding(this.t);
            }
            this.k.setHighLightCurrentDayUnSelected(this.o);
            this.k.setSelectedTextColor(this.h);
            this.k.setWeekBarTextColor(this.s);
            this.k.setDateTopGap(this.r);
            this.k.setDateTextGravity(this.p);
            this.k.setDateTextFont(this.g);
            this.k.setScrollable(this.q);
            this.k.setAutoChangeMonth(this.b);
            this.k.setOnCalendarSelectListener(new f(this, null));
            Calendar x = x(this.c);
            Calendar x2 = x(this.f);
            Calendar x3 = x(this.f18525a);
            List<Pair<Calendar, Calendar>> y = y();
            HashMap<String, Calendar> w = w();
            if (x != null) {
                int year = x.getYear();
                int month = x.getMonth();
                i = x.getDay();
                i2 = year;
                i6 = month;
            } else {
                i2 = 1971;
                i = 1;
            }
            if (x2 != null) {
                int year2 = x2.getYear();
                int month2 = x2.getMonth();
                i3 = x2.getDay();
                i5 = year2;
                i4 = month2;
            } else {
                i5 = 2055;
                i4 = 12;
                i3 = -1;
            }
            this.k.setAnchorCalendar(x3);
            this.k.setRange(i2, i6, i, i5, i4, i3, y, w);
            if (x3 != null) {
                this.k.scrollToCalendar(x3.getYear(), x3.getMonth(), x3.getDay(), false, false, false);
                return;
            }
            Calendar x4 = x(this.i);
            if (x4 == null || !this.k.isInRange(x4)) {
                this.k.scrollToCalendar(i2, i6, i, false, false, false);
            } else {
                this.k.scrollToCalendar(x4.getYear(), x4.getMonth(), x4.getDay());
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXCALENDARVIEW_AUTOCHANGEMONTH) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else if (j == DXCALENDARVIEW_CALENDARITEMHEIGHT) {
            this.j = i;
        } else if (j == DXCALENDARVIEW_CURRENTDAYTEXTSIZE) {
            this.d = i;
        } else if (j == DXCALENDARVIEW_DATETOPGAP) {
            this.r = i;
        } else if (j == DXCALENDARVIEW_DAYTEXTGRAVITY) {
            this.p = i;
        } else if (j == DXCALENDARVIEW_DAYTEXTSIZE) {
            this.e = i;
        } else if (j == DXCALENDARVIEW_HIGHLIGHTCURRENTDAYUNSELECTED) {
            if (i == 0) {
                z = false;
            }
            this.o = z;
        } else if (j == DXCALENDARVIEW_ITEMBOTTOMPADDING) {
            this.t = i;
            this.v = true;
        } else if (j == DXCALENDARVIEW_ITEMTOPPADDING) {
            this.u = i;
            this.w = true;
        } else if (j == 2053814541299040819L) {
            this.h = i;
        } else if (j == DXCALENDARVIEW_SCROLLABLE) {
            if (i == 0) {
                z = false;
            }
            this.q = z;
        } else if (j == DXCALENDARVIEW_WEEKBARTEXTCOLOR) {
            this.s = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXCALENDARVIEW_DISABLEDDATES) {
            this.m = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXCALENDARVIEW_HIGHLIGHTDATES) {
            this.n = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXCALENDARVIEW_ANCHORDATE) {
            this.f18525a = str;
        } else if (j == DXCALENDARVIEW_BEGINDATE) {
            this.c = str;
        } else if (j == DXCALENDARVIEW_ENDDATE) {
            this.f = str;
        } else if (j == 34149272427L) {
            this.g = str;
        } else if (j == 792202854466360275L) {
            this.i = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("897a9cff", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !Pattern.matches("(\\d{4})-((0[1-9])|(1[0-2]))-(([0-2][1-9])|3[0-1]|([1-2]0))", str)) {
            return false;
        }
        return true;
    }

    public final HashMap<String, Calendar> w() {
        String key;
        Calendar x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b8f322c0", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap<String, Calendar> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : this.n.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof JSONObject) && (x = x((key = entry.getKey()))) != null) {
                JSONObject jSONObject2 = (JSONObject) value;
                x.setBooked(jSONObject2.getBooleanValue("booked"));
                JSONObject jSONObject3 = jSONObject2.getJSONObject("activityInfo");
                if (jSONObject3 != null) {
                    Calendar.a aVar = new Calendar.a();
                    aVar.f7423a = jSONObject3.getString("title");
                    aVar.b = jSONObject3.getString("color");
                    x.setCalendarInfo(aVar);
                }
                hashMap.put(key, x);
            }
        }
        return hashMap;
    }

    public final Calendar x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("7292d8f4", new Object[]{this, str});
        }
        if (!v(str)) {
            return null;
        }
        int parseInt = Integer.parseInt(str.substring(0, 4));
        int parseInt2 = Integer.parseInt(str.substring(5, 7));
        int parseInt3 = Integer.parseInt(str.substring(8, 10));
        Calendar calendar = new Calendar();
        calendar.setYear(parseInt);
        calendar.setMonth(parseInt2);
        calendar.setDay(parseInt3);
        return calendar;
    }

    public final List<Pair<Calendar, Calendar>> y() {
        Calendar x;
        Calendar x2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d4bdb915", new Object[]{this});
        }
        JSONArray jSONArray = this.m;
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.m.size(); i++) {
            String string = this.m.getString(i);
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split(",");
                if (!(split.length != 2 || (x = x(split[0])) == null || (x2 = x(split[1])) == null)) {
                    arrayList.add(new Pair(x, x2));
                }
            }
        }
        return arrayList;
    }
}
