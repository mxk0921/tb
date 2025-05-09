package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AlertDialog f29424a;
    public Activity b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ efb f29425a;

        public a(uk0 uk0Var, efb efbVar) {
            this.f29425a = efbVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            efb efbVar = this.f29425a;
            if (efbVar != null) {
                efbVar.onResult(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ efb f29426a;

        public b(uk0 uk0Var, efb efbVar) {
            this.f29426a = efbVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            efb efbVar = this.f29426a;
            if (efbVar != null) {
                efbVar.onResult(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ efb f29427a;

        public c(uk0 uk0Var, efb efbVar) {
            this.f29427a = efbVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            efb efbVar = this.f29427a;
            if (efbVar != null) {
                efbVar.onResult(true);
            }
        }
    }

    static {
        t2o.a(336593061);
    }

    public uk0(Activity activity, efb efbVar, String str, String str2, String str3, String str4) {
        b(activity, efbVar, str, str2, str3, str4);
    }

    public static AlertDialog.Builder a(String str, String str2, String str3, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog.Builder) ipChange.ipc$dispatch("aefb0ff4", new Object[]{str, str2, str3, context});
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 3);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        return builder;
    }

    public final void b(Activity activity, efb efbVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fe3093", new Object[]{this, activity, efbVar, str, str2, str3, str4});
        } else if (activity != null && !TextUtils.isEmpty(str2)) {
            this.b = activity;
            String string = activity.getString(R.string.ak_alert_confirm);
            AlertDialog.Builder a2 = a(str, str2, str3, activity);
            if (!TextUtils.isEmpty(str3)) {
                a2.setNegativeButton(str3, new a(this, efbVar));
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = string;
            }
            a2.setPositiveButton(str4, new c(this, efbVar)).setCancelable(!TextUtils.isEmpty(str3)).setOnCancelListener(new b(this, efbVar));
            this.f29424a = a2.create();
        }
    }

    public void c() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (this.f29424a != null && (activity = this.b) != null && !activity.isFinishing()) {
            this.f29424a.show();
        }
    }
}
