package tb;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lu6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SimpleDateFormat f23567a;
    public static SimpleDateFormat b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements DatePickerDialog.OnDateSetListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f23568a;

        public a(f fVar) {
            this.f23568a = fVar;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84167245", new Object[]{this, datePicker, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            int i4 = i2 + 1;
            if (i4 < 10) {
                str = "0" + i4;
            } else {
                str = String.valueOf(i4);
            }
            if (i3 < 10) {
                str2 = "0" + i3;
            } else {
                str2 = String.valueOf(i3);
            }
            this.f23568a.onPick(true, i + "-" + str + "-" + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f23569a;

        public b(f fVar) {
            this.f23569a = fVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            } else {
                this.f23569a.onPick(false, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements TimePickerDialog.OnTimeSetListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f23570a;

        public c(f fVar) {
            this.f23570a = fVar;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e120539e", new Object[]{this, timePicker, new Integer(i), new Integer(i2)});
                return;
            }
            if (i < 10) {
                str = "0" + i;
            } else {
                str = String.valueOf(i);
            }
            if (i2 < 10) {
                str2 = "0" + i2;
            } else {
                str2 = String.valueOf(i2);
            }
            this.f23570a.onPick(true, str + ":" + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f23571a;

        public d(f fVar) {
            this.f23571a = fVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            } else {
                this.f23571a.onPick(false, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ AlertDialog d;
        public final /* synthetic */ int e;
        public final /* synthetic */ CharSequence f;

        public e(AlertDialog alertDialog, int i, CharSequence charSequence) {
            this.d = alertDialog;
            this.e = i;
            this.f = charSequence;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/DatePickerImpl$5");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            Button button = this.d.getButton(this.e);
            if (button != null) {
                button.setAllCaps(false);
                button.setText(this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f {
        void onPick(boolean z, String str);
    }

    static {
        t2o.a(986710157);
    }

    public static Date a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("8e767625", new Object[]{str});
        }
        if (b == null) {
            b = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        }
        try {
            return b.parse(str);
        } catch (ParseException e2) {
            dwh.i(e2);
            return new Date();
        }
    }

    public static Date b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("9261ea66", new Object[]{str});
        }
        if (f23567a == null) {
            f23567a = new SimpleDateFormat("HH:mm", Locale.getDefault());
        }
        try {
            return f23567a.parse(str);
        } catch (ParseException e2) {
            dwh.i(e2);
            return new Date();
        }
    }

    public static void c(Context context, String str, String str2, String str3, f fVar, Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aabcc36a", new Object[]{context, str, str2, str3, fVar, map});
            return;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(a(str));
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, new a(fVar), instance.get(1), instance.get(2), instance.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Calendar instance2 = Calendar.getInstance(Locale.getDefault());
        Calendar instance3 = Calendar.getInstance(Locale.getDefault());
        instance2.set(1900, 0, 1);
        instance3.set(2100, 11, 31);
        if (!TextUtils.isEmpty(str3)) {
            if (datePicker.getMaxDate() >= a(str3).getTime()) {
                datePicker.setMinDate(a(str3).getTime());
            } else {
                datePicker.setMinDate(instance2.getTimeInMillis());
                datePicker.setMaxDate(instance3.getTimeInMillis());
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            if (datePicker.getMinDate() <= a(str2).getTime()) {
                datePicker.setMaxDate(a(str2).getTime());
            } else {
                datePicker.setMinDate(instance2.getTimeInMillis());
                datePicker.setMaxDate(instance3.getTimeInMillis());
            }
        }
        datePickerDialog.setOnCancelListener(new b(fVar));
        Object obj2 = null;
        if (map != null) {
            obj = map.get("cancelTitle");
        } else {
            obj = null;
        }
        e(datePickerDialog, -2, String.valueOf(obj));
        if (map != null) {
            obj2 = map.get("confirmTitle");
        }
        e(datePickerDialog, -1, String.valueOf(obj2));
        datePickerDialog.show();
    }

    public static void d(Context context, String str, f fVar, Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d9601d", new Object[]{context, str, fVar, map});
            return;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(b(str));
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, new c(fVar), instance.get(11), instance.get(12), false);
        timePickerDialog.setOnCancelListener(new d(fVar));
        Object obj2 = null;
        if (map != null) {
            obj = map.get("cancelTitle");
        } else {
            obj = null;
        }
        e(timePickerDialog, -2, String.valueOf(obj));
        if (map != null) {
            obj2 = map.get("confirmTitle");
        }
        e(timePickerDialog, -1, String.valueOf(obj2));
        timePickerDialog.show();
    }

    public static void e(AlertDialog alertDialog, int i, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b90baa4", new Object[]{alertDialog, new Integer(i), charSequence});
        } else if (!TextUtils.isEmpty(charSequence) && !"null".equals(charSequence)) {
            try {
                if (alertDialog.getWindow() != null) {
                    alertDialog.getWindow().getDecorView().post(new e(alertDialog, i, charSequence));
                }
            } catch (Throwable th) {
                dwh.i(th);
            }
        }
    }
}
