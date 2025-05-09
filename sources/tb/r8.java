package tb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Dialog> f27176a;
    public bee b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements qde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f27177a;
        public final /* synthetic */ JSONObject b;

        public a(Context context, JSONObject jSONObject) {
            this.f27177a = context;
            this.b = jSONObject;
        }

        @Override // tb.qde
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            FrameLayout frameLayout = new FrameLayout(this.f27177a);
            if (view.getLayoutParams() != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
                layoutParams.gravity = 17;
                view.setLayoutParams(layoutParams);
            } else {
                view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            }
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            r8.this.h(frameLayout, this.f27177a);
        }

        @Override // tb.qde
        public void onEvent(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9589844c", new Object[]{this, str});
            }
        }

        @Override // tb.qde
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            View inflate = View.inflate(this.f27177a, R.layout.ability_kit_loading, null);
            String string = this.b.getString("message");
            if (!TextUtils.isEmpty(string)) {
                ((TextView) inflate.findViewById(R.id.mega_loading_text)).setText(string);
            }
            r8.this.h(inflate, this.f27177a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(r8 r8Var) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            } else if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f27178a;

        public c(Dialog dialog) {
            this.f27178a = dialog;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            Dialog dialog;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else if (r8.a(r8.this) != null && !abl.d() && (dialog = this.f27178a) != null) {
                try {
                    Context context = dialog.getContext();
                    if (context instanceof ContextThemeWrapper) {
                        r8.a(r8.this).a(((ContextThemeWrapper) context).getBaseContext());
                    } else {
                        r8.a(r8.this).a(context);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    static {
        t2o.a(336592923);
    }

    public static /* synthetic */ bee a(r8 r8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bee) ipChange.ipc$dispatch("c17e57ae", new Object[]{r8Var});
        }
        return r8Var.b;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public Dialog b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f928d0aa", new Object[]{this});
        }
        WeakReference<Dialog> weakReference = this.f27176a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        Dialog b2 = b();
        if (b2 != null) {
            try {
                if (b2.isShowing()) {
                    b2.dismiss();
                }
            } catch (Throwable th) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("AbilityKit", "hideLoading error = " + th);
            }
        }
    }

    public void e(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b735e5", new Object[]{this, dialog});
        } else {
            this.f27176a = new WeakReference<>(dialog);
        }
    }

    public void f(JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554b0fde", new Object[]{this, jSONObject, context});
            return;
        }
        bee a2 = g8.a();
        this.b = a2;
        if (a2 == null || abl.d()) {
            g(jSONObject.getString("message"), context);
        } else {
            this.b.d("loading", jSONObject, context, new a(context, jSONObject));
        }
    }

    public void g(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca5cf8", new Object[]{this, str, context});
            return;
        }
        View inflate = View.inflate(context, R.layout.ability_kit_loading, null);
        if (!TextUtils.isEmpty(str)) {
            ((TextView) inflate.findViewById(R.id.mega_loading_text)).setText(str);
        }
        h(inflate, context);
    }

    public void h(View view, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0811667", new Object[]{this, view, context});
            return;
        }
        try {
            boolean C = abl.C();
            Dialog dialog = new Dialog(context, R.style.Dialog_Status_Container);
            dialog.setContentView(view);
            Window window = dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = -1;
            attributes.height = -1;
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
            if (!C) {
                d();
                dialog.setCancelable(false);
            }
            int c2 = c(context);
            int g = gxv.g(context);
            int i = c2 - g;
            if (c2 > 0 && g > 0 && i > 0) {
                dialog.getWindow().setLayout(-1, i);
            }
            dialog.setOnCancelListener(new b(this));
            dialog.setOnDismissListener(new c(dialog));
            dialog.show();
            e(dialog);
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("AbilityKit", "showLoading error = " + th);
        }
    }
}
