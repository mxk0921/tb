package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.zk0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yt0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AlertDialog f32338a;
    public Activity b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sfb f32339a;

        public a(yt0 yt0Var, sfb sfbVar) {
            this.f32339a = sfbVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            sfb sfbVar = this.f32339a;
            if (sfbVar != null) {
                ((zk0.b) sfbVar).a(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sfb f32340a;

        public b(yt0 yt0Var, sfb sfbVar) {
            this.f32340a = sfbVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            sfb sfbVar = this.f32340a;
            if (sfbVar != null) {
                ((zk0.b) sfbVar).a(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sfb f32341a;

        public c(yt0 yt0Var, sfb sfbVar) {
            this.f32341a = sfbVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            sfb sfbVar = this.f32341a;
            if (sfbVar != null) {
                ((zk0.b) sfbVar).a(true);
            }
        }
    }

    static {
        t2o.a(614465584);
    }

    public yt0(Activity activity, sfb sfbVar, String str, String str2, String str3, String str4) {
        b(activity, sfbVar, str, str2, str3, str4);
    }

    public final void b(Activity activity, sfb sfbVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2991dc6", new Object[]{this, activity, sfbVar, str, str2, str3, str4});
        } else if (activity != null && !TextUtils.isEmpty(str2)) {
            this.b = activity;
            AlertDialog.Builder a2 = a(str, str2, str3, activity);
            if (!TextUtils.isEmpty(str3)) {
                a2.setNegativeButton(str3, new a(this, sfbVar));
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = Localization.q(R.string.order_biz_sure);
            }
            a2.setPositiveButton(str4, new c(this, sfbVar)).setCancelable(!TextUtils.isEmpty(str3)).setOnCancelListener(new b(this, sfbVar));
            this.f32338a = a2.create();
        }
    }

    public void c() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (this.f32338a != null && (activity = this.b) != null && !activity.isFinishing()) {
            this.f32338a.show();
            this.f32338a.getButton(-2).setAllCaps(false);
            this.f32338a.getButton(-1).setAllCaps(false);
        }
    }

    public static AlertDialog.Builder a(String str, String str2, String str3, Context context) {
        int i = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog.Builder) ipChange.ipc$dispatch("aefb0ff4", new Object[]{str, str2, str3, context});
        }
        if (uel.l("useDefaultLightThemeForAlert", true)) {
            i = 5;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, i);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        return builder;
    }
}
