package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.icart.weex.dialog.ReorderInputDialog;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class pjv extends mw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f26132a = new Handler(Looper.getMainLooper());
    public ReorderInputDialog b;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ String d;

        public a(JSONObject jSONObject, Activity activity, String str) {
            this.b = jSONObject;
            this.c = activity;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                pjv.c(pjv.this, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26134a;

        public b(String str) {
            this.f26134a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (view != null) {
                jSONObject.put((JSONObject) "text", ((EditText) view).getText().toString());
                g1a<Map<String, ? extends Object>, xhv> f = CartMegaManager.INSTANCE.f(this.f26134a);
                if (f != null) {
                    f.invoke(jSONObject);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26135a;

        public c(String str) {
            this.f26135a = str;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else {
                CartMegaManager.INSTANCE.l(this.f26135a);
            }
        }
    }

    static {
        t2o.a(478150972);
    }

    public static final /* synthetic */ void c(pjv pjvVar, JSONObject jSONObject, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9875edb", new Object[]{pjvVar, jSONObject, activity, str});
        } else {
            pjvVar.d(jSONObject, activity, str);
        }
    }

    public static /* synthetic */ Object ipc$super(pjv pjvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/UpdateGroupNameNativeHandler");
    }

    @Override // tb.mw
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3046a606", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void d(JSONObject jSONObject, Activity activity, String str) {
        ReorderInputDialog reorderInputDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12aa741", new Object[]{this, jSONObject, activity, str});
            return;
        }
        String string = jSONObject.getString("text");
        if (this.b == null) {
            ReorderInputDialog reorderInputDialog2 = new ReorderInputDialog(activity);
            this.b = reorderInputDialog2;
            reorderInputDialog2.e(new b(str));
        }
        ReorderInputDialog reorderInputDialog3 = this.b;
        if (reorderInputDialog3 != null) {
            reorderInputDialog3.setOnDismissListener(new c(str));
        }
        ReorderInputDialog reorderInputDialog4 = this.b;
        ckf.d(reorderInputDialog4);
        if (!reorderInputDialog4.isShowing() && (reorderInputDialog = this.b) != null) {
            ckf.f(string, "text");
            reorderInputDialog.f(string);
        }
    }

    @Override // tb.mw
    public boolean a(String str, String str2, JSONObject jSONObject, String str3) {
        sv b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18e260f", new Object[]{this, str, str2, jSONObject, str3})).booleanValue();
        }
        ckf.g(str, "instanceID");
        ckf.g(str2, "method");
        ckf.g(jSONObject, "params");
        ckf.g(str3, "callbackID");
        rv i = CartMegaManager.INSTANCE.i(str);
        Activity f = (i == null || (b2 = i.b()) == null) ? null : b2.f();
        if (f == null) {
            return false;
        }
        this.f26132a.post(new a(jSONObject, f, str3));
        return true;
    }
}
