package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.qa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fl7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f19377a = new AtomicBoolean(false);
    public final List<e> b = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f19378a;

        public a(Dialog dialog) {
            this.f19378a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            vp9.a("linkx", "DialogController.showConfirmDialog.onClick.允许跳出");
            for (e eVar : fl7.a(fl7.this)) {
                if (eVar != null) {
                    ah0.d("flow_out_success", e.a(eVar), String.valueOf(e.b(eVar)), e.c(eVar));
                    ah0.d("flow_out_alert_ok", e.a(eVar), String.valueOf(e.b(eVar)), e.c(eVar));
                    e.d(eVar).a(true);
                }
            }
            this.f19378a.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f19379a;

        public b(fl7 fl7Var, Dialog dialog) {
            this.f19379a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f19379a.cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f19380a;

        public c(Map map) {
            this.f19380a = map;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            vp9.a("linkx", "DialogController.showConfirmDialog.onClick.拒绝跳出");
            for (e eVar : fl7.a(fl7.this)) {
                if (eVar != null) {
                    ah0.d("flow_out_alert_cancel", e.a(eVar), String.valueOf(e.b(eVar)), e.c(eVar));
                    this.f19380a.put("type", "cancel");
                    ah0.d("flow_out_fail", e.a(eVar), String.valueOf(e.b(eVar)), e.c(eVar));
                    e.d(eVar).a(false);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            vp9.a("linkx", "DialogController.showConfirmDialog.onDismiss");
            fl7.b(fl7.this).set(false);
            fl7.a(fl7.this).clear();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19382a;
        public final int b;
        public final qa.b c;
        public final Map<String, String> d;

        static {
            t2o.a(744489092);
        }

        public e(String str, int i, Map<String, String> map, qa.b bVar) {
            this.f19382a = str;
            this.b = i;
            this.d = map;
            this.c = bVar;
        }

        public static /* synthetic */ String a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f9056311", new Object[]{eVar});
            }
            return eVar.f19382a;
        }

        public static /* synthetic */ int b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("212aa341", new Object[]{eVar})).intValue();
            }
            return eVar.b;
        }

        public static /* synthetic */ Map c(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2a9e08a2", new Object[]{eVar});
            }
            return eVar.d;
        }

        public static /* synthetic */ qa.b d(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qa.b) ipChange.ipc$dispatch("47dcfb00", new Object[]{eVar});
            }
            return eVar.c;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final fl7 f19383a = new fl7();

        static {
            t2o.a(744489093);
        }

        public static /* synthetic */ fl7 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fl7) ipChange.ipc$dispatch("9c019cf5", new Object[0]);
            }
            return f19383a;
        }
    }

    static {
        t2o.a(744489087);
    }

    public static /* synthetic */ List a(fl7 fl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("689bf919", new Object[]{fl7Var});
        }
        return fl7Var.b;
    }

    public static /* synthetic */ AtomicBoolean b(fl7 fl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("802ebfb3", new Object[]{fl7Var});
        }
        return fl7Var.f19377a;
    }

    public static fl7 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fl7) ipChange.ipc$dispatch("78cae2b0", new Object[0]);
        }
        return f.a();
    }

    public synchronized boolean d(Uri uri, String str, String str2, int i, qa.b bVar) {
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e6f9a54", new Object[]{this, uri, str, str2, new Integer(i), bVar})).booleanValue();
        }
        vp9.a("linkx", "DialogController.showConfirmDialog.");
        HashMap hashMap = new HashMap();
        if (uri != null) {
            str3 = String.valueOf(uri.getScheme());
        } else {
            str3 = "";
        }
        hashMap.put("scheme", str3);
        if (uri != null) {
            str4 = String.valueOf(uri.getHost());
        } else {
            str4 = "";
        }
        hashMap.put("host", str4);
        if (uri != null) {
            str5 = uri.toString();
        } else {
            str5 = "";
        }
        hashMap.put("url", str5);
        Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
        if (currentActivity == null) {
            vp9.a("linkx", "DialogController.showConfirmDialog.topActivity=null.pass.");
            ah0.d("flow_out_success", str, String.valueOf(i), hashMap);
            return true;
        }
        vp9.a("linkx", "DialogController.showConfirmDialog.topActivity=" + currentActivity.getComponentName());
        Dialog dialog = new Dialog(currentActivity);
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        if (window == null) {
            vp9.a("linkx", "DialogController.showConfirmDialog.window=null.pass.");
            ah0.d("flow_out_success", str, String.valueOf(i), hashMap);
            return true;
        }
        ((CopyOnWriteArrayList) this.b).add(new e(str, i, hashMap, bVar));
        if (this.f19377a.compareAndSet(false, true)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            View inflate = View.inflate(currentActivity, R.layout.flout_confirm_dialog, null);
            dialog.setContentView(inflate);
            dialog.setCanceledOnTouchOutside(false);
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.confirm_yes), new a(dialog));
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.confirm_no), new b(this, dialog));
            if (!TextUtils.isEmpty(str2)) {
                String string = Globals.getApplication().getResources().getString(R.string.afc_flout_toast);
                if (!TextUtils.isEmpty(string)) {
                    ((TextView) inflate.findViewById(R.id.confirm_title)).setText(string + str2);
                }
            }
            dialog.setOnCancelListener(new c(hashMap));
            dialog.setOnDismissListener(new d());
            dialog.show();
            window.setLayout((int) TFCCommonUtils.h(290.0f), -2);
            ah0.d("flow_out_show_alert", str, String.valueOf(i), hashMap);
        }
        return false;
    }
}
