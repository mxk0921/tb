package com.alibaba.security.realidentity;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "ABAlertDialog";

    /* renamed from: a  reason: collision with root package name */
    public Dialog f2905a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f2906a;

        public a(c cVar) {
            this.f2906a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                c.i(this.f2906a).a(y4.a(y4.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f2907a;

        public b(c cVar) {
            this.f2907a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                c.k(this.f2907a).a(y4.a(y4.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f2908a;
        public String b;
        public int c;
        public int g;
        public int j;
        public boolean d = true;
        public boolean e = false;
        public String f = "";
        public e h = new a();
        public String i = "";
        public d k = new b();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.security.realidentity.y4.e
            public void a(Dialog dialog) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // com.alibaba.security.realidentity.y4.d
            public void a(Dialog dialog) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
                }
            }
        }

        public c(Context context) {
            this.f2908a = context;
            this.c = ContextCompat.getColor(context, R.color.rpsdk_color_333333);
            this.g = ContextCompat.getColor(context, R.color.rpsdk_ab_face_dialog_positive);
            this.j = ContextCompat.getColor(context, R.color.rpsdk_ab_face_dialog_negative);
        }

        public static /* synthetic */ Context a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("78110330", new Object[]{cVar}) : cVar.f2908a;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dfb88eac", new Object[]{cVar})).intValue();
            }
            return cVar.c;
        }

        public static /* synthetic */ boolean c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a59513e", new Object[]{cVar})).booleanValue();
            }
            return cVar.d;
        }

        public static /* synthetic */ boolean d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("14fa13bf", new Object[]{cVar})).booleanValue();
            }
            return cVar.e;
        }

        public static /* synthetic */ int e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("af9ad62f", new Object[]{cVar})).intValue();
            }
            return cVar.g;
        }

        public static /* synthetic */ int f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a3b98b0", new Object[]{cVar})).intValue();
            }
            return cVar.j;
        }

        public static /* synthetic */ String g(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ae93bd22", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ String h(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("42d22cc1", new Object[]{cVar});
            }
            return cVar.f;
        }

        public static /* synthetic */ e i(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("1e14b7e4", new Object[]{cVar});
            }
            return cVar.h;
        }

        public static /* synthetic */ String j(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6b4f0bff", new Object[]{cVar});
            }
            return cVar.i;
        }

        public static /* synthetic */ d k(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("ae137483", new Object[]{cVar});
            }
            return cVar.k;
        }

        public y4 a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (y4) ipChange.ipc$dispatch("3c861bdd", new Object[]{this}) : new y4(this);
        }

        public c a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f9879f74", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public c a(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b4fdddfe", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            this.d = z;
            this.e = z2;
            return this;
        }

        public c a(String str, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("d10f4526", new Object[]{this, str, eVar});
            }
            this.f = str;
            this.h = eVar;
            return this;
        }

        public c a(String str, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("ebcdd665", new Object[]{this, str, dVar});
            }
            this.i = str;
            this.k = dVar;
            return this;
        }

        public c a(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f194a4b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
            this.c = i;
            this.g = i2;
            this.j = i3;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
        void a(Dialog dialog);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface e {
        void a(Dialog dialog);
    }

    public y4(c cVar) {
        Dialog dialog = new Dialog(c.a(cVar), R.style.RP_Dialog);
        this.f2905a = dialog;
        dialog.requestWindowFeature(1);
        View inflate = LayoutInflater.from(c.a(cVar)).inflate(R.layout.rp_face_dialog, (ViewGroup) null);
        this.f2905a.setContentView(inflate);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f2905a.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        this.f2905a.getWindow().setAttributes(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.abfl_dialog_content_text);
        TextView textView2 = (TextView) inflate.findViewById(R.id.abfl_dialog_positive_btn);
        TextView textView3 = (TextView) inflate.findViewById(R.id.abfl_dialog_negative_btn);
        textView.setTextColor(c.b(cVar));
        textView2.setTextColor(c.e(cVar));
        textView3.setTextColor(c.f(cVar));
        if (TextUtils.isEmpty(c.g(cVar))) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(c.g(cVar));
        }
        if (TextUtils.isEmpty(c.h(cVar))) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(c.h(cVar));
            textView2.setOnClickListener(new a(cVar));
        }
        if (TextUtils.isEmpty(c.j(cVar))) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(c.j(cVar));
            textView3.setOnClickListener(new b(cVar));
        }
        this.f2905a.setCancelable(c.c(cVar));
        this.f2905a.setCanceledOnTouchOutside(c.d(cVar));
    }

    public static /* synthetic */ Dialog a(y4 y4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("19169c18", new Object[]{y4Var}) : y4Var.f2905a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.f2905a;
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Dialog dialog = this.f2905a;
        if (dialog != null && !dialog.isShowing()) {
            this.f2905a.show();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Dialog dialog = this.f2905a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
