package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f29244a;
        public final /* synthetic */ BridgeCallback b;

        public a(Activity activity, BridgeCallback bridgeCallback) {
            this.f29244a = activity;
            this.b = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface != null && !this.f29244a.isFinishing()) {
                dialogInterface.dismiss();
            }
            this.b.sendBridgeResponse(null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f29245a;
        public final /* synthetic */ BridgeCallback b;

        public b(Activity activity, BridgeCallback bridgeCallback) {
            this.f29245a = activity;
            this.b = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface != null && !this.f29245a.isFinishing()) {
                dialogInterface.dismiss();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ok", (Object) Boolean.TRUE);
            this.b.sendJSONResponse(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f29246a;
        public final /* synthetic */ BridgeCallback b;

        public c(Activity activity, BridgeCallback bridgeCallback) {
            this.f29246a = activity;
            this.b = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface != null && !this.f29246a.isFinishing()) {
                dialogInterface.dismiss();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ok", (Object) Boolean.FALSE);
            this.b.sendJSONResponse(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f29247a;
        public final /* synthetic */ EditText b;
        public final /* synthetic */ BridgeCallback c;

        public d(Activity activity, EditText editText, BridgeCallback bridgeCallback) {
            this.f29247a = activity;
            this.b = editText;
            this.c = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            Activity activity = this.f29247a;
            u9s.a(activity, activity.getWindow().getDecorView());
            String obj = this.b.getText().toString();
            if (dialogInterface != null && !this.f29247a.isFinishing()) {
                dialogInterface.dismiss();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("inputValue", (Object) obj);
            jSONObject.put("ok", (Object) Boolean.TRUE);
            this.c.sendJSONResponse(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f29248a;
        public final /* synthetic */ BridgeCallback b;

        public e(Activity activity, BridgeCallback bridgeCallback) {
            this.f29248a = activity;
            this.b = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            Activity activity = this.f29248a;
            u9s.a(activity, activity.getWindow().getDecorView());
            if (dialogInterface != null && !this.f29248a.isFinishing()) {
                dialogInterface.dismiss();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("inputValue", (Object) "");
            jSONObject.put("ok", (Object) Boolean.FALSE);
            this.b.sendJSONResponse(jSONObject);
        }
    }

    public static /* synthetic */ void a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5516a9", new Object[]{activity, view});
        } else {
            e(activity, view);
        }
    }

    public static int d(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536bb04", new Object[]{context, new Integer(i)})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    public static void e(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad527af0", new Object[]{activity, view});
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Throwable th) {
            TMSLogger.c("DialogAbility", "hideKeyboard exception!", th);
        }
    }

    public static void b(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3b846b", new Object[]{activity, str, str2, str3, str4, str5, str6, bridgeCallback});
        } else if (activity == null || activity.isFinishing()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = wmc.CONFIRM;
            }
            a aVar = new a(activity, bridgeCallback);
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                TMSLogger.g("DialogAbility", "empty title and message");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            if (!TextUtils.isEmpty(str)) {
                builder.setTitle(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.setMessage(str2);
            }
            builder.setPositiveButton(str3, aVar);
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            if (create != null) {
                create.show();
            }
        }
    }

    public static void c(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9a2dbd", new Object[]{activity, str, str2, str3, str4, str5, str6, str7, bridgeCallback});
        } else if (activity == null || activity.isFinishing()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = wmc.CONFIRM;
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = wmc.CANCEL;
            }
            b bVar = new b(activity, bridgeCallback);
            c cVar = new c(activity, bridgeCallback);
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                TMSLogger.g("DialogAbility", "empty title and message");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            if (!TextUtils.isEmpty(str)) {
                builder.setTitle(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.setMessage(str2);
            }
            builder.setPositiveButton(str3, bVar);
            builder.setNegativeButton(str4, cVar);
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            if (create != null) {
                create.show();
            }
        }
    }

    public static void f(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0126299", new Object[]{activity, str, str2, str3, str4, str5, str6, str7, bridgeCallback});
        } else if (activity == null || activity.isFinishing()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = wmc.CONFIRM;
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = wmc.CANCEL;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                TMSLogger.g("DialogAbility", "empty title and message");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            EditText editText = new EditText(activity);
            if (!TextUtils.isEmpty(str)) {
                builder.setTitle(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.setMessage(str2);
            }
            builder.setPositiveButton(str3, new d(activity, editText, bridgeCallback));
            builder.setNegativeButton(str4, new e(activity, bridgeCallback));
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            create.setView(editText, d(activity, 15), 0, d(activity, 15), 0);
            create.show();
        }
    }
}
