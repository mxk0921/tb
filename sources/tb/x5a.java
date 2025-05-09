package tb;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import zoloz.ap.com.toolkit.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class x5a extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31151a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final DialogInterface.OnClickListener f;
    public final DialogInterface.OnClickListener g;
    public final boolean h;
    public final boolean i;
    public final x5a j = this;
    public final boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(x5a x5aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            x5a.a(x5a.this).dismiss();
            if (x5a.b(x5a.this) != null) {
                x5a.b(x5a.this).onClick(x5a.a(x5a.this), -1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            x5a.a(x5a.this).dismiss();
            if (x5a.c(x5a.this) != null) {
                x5a.c(x5a.this).onClick(x5a.a(x5a.this), -2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            x5a.a(x5a.this).dismiss();
            if (x5a.c(x5a.this) != null) {
                x5a.c(x5a.this).onClick(x5a.a(x5a.this), -2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DialogInterface.OnClickListener f31155a;
        public DialogInterface.OnClickListener b;
        public final Context c;
        public String d;
        public String e;
        public String f;
        public String g;
        public boolean h;
        public boolean i;
        public boolean j;

        static {
            t2o.a(245367021);
        }

        public e(Context context) {
            this.c = context;
        }

        public e a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("567d006d", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public e b(String str, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("4e37520a", new Object[]{this, str, onClickListener});
            }
            this.g = str;
            this.b = onClickListener;
            return this;
        }

        public e c(String str, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("187b79c6", new Object[]{this, str, onClickListener});
            }
            this.f = str;
            this.f31155a = onClickListener;
            return this;
        }

        public e d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("b38d01be", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public e e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("2c64a1cf", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public x5a f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x5a) ipChange.ipc$dispatch("fc2ed9d2", new Object[]{this});
            }
            x5a x5aVar = new x5a(this.c, this.d, this.e, this.f, this.f31155a, this.g, this.b, this.h, this.i, this.j);
            try {
                x5aVar.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return x5aVar;
        }

        public e g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("23dfe017", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public e h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("9fc7c26f", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }
    }

    static {
        t2o.a(245367014);
    }

    public x5a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, boolean z3) {
        super(context, R.style.dialog_style);
        this.f31151a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.h = z;
        this.i = z2;
        this.g = onClickListener2;
        this.f = onClickListener;
        this.k = z3;
        new Handler();
    }

    public static /* synthetic */ x5a a(x5a x5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x5a) ipChange.ipc$dispatch("54372915", new Object[]{x5aVar});
        }
        return x5aVar.j;
    }

    public static /* synthetic */ DialogInterface.OnClickListener b(x5a x5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("1c0c2b63", new Object[]{x5aVar});
        }
        return x5aVar.f;
    }

    public static /* synthetic */ DialogInterface.OnClickListener c(x5a x5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("ebcc5f02", new Object[]{x5aVar});
        }
        return x5aVar.g;
    }

    public static /* synthetic */ Object ipc$super(x5a x5aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in zoloz/ap/com/toolkit/ui/GenenalDialog");
        }
    }

    public final void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a22e04", new Object[]{this, view});
        } else if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void e() {
        View view;
        View view2;
        TextView textView;
        LinearLayout linearLayout;
        ImageButton imageButton;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.f31151a);
        if (!this.k) {
            view = from.inflate(R.layout.general_dialog, (ViewGroup) null);
        } else {
            view = null;
        }
        setContentView(view);
        if (this.f31151a != null) {
            TextView textView2 = (TextView) findViewById(R.id.dialog_content_title);
            textView2.setTextColor(this.f31151a.getResources().getColor(R.color.dialog_title));
            textView2.setText(this.b);
            TextView textView3 = (TextView) findViewById(R.id.dialog_content_sub_title);
            textView3.setTextColor(this.f31151a.getResources().getColor(R.color.dialog_message));
            textView3.setText(this.c);
            Button button = (Button) findViewById(R.id.dialog_btn_confirm);
            button.setTextColor(this.f31151a.getResources().getColor(R.color.dialog_ok));
            button.setText(this.d);
            Button button2 = (Button) findViewById(R.id.dialog_btn_cancel);
            button2.setTextColor(this.f31151a.getResources().getColor(R.color.dialog_cancel));
            button2.setText(this.e);
            if (!this.k) {
                imageButton = (ImageButton) findViewById(R.id.btn_x);
                linearLayout = (LinearLayout) findViewById(R.id.dialog_protocol);
                textView = (TextView) findViewById(R.id.protocol);
                view2 = findViewById(R.id.dialog_btn_cancel_center);
            } else {
                imageButton = null;
                linearLayout = null;
                textView = null;
                view2 = null;
            }
            if (textView != null) {
                textView.setOnClickListener(new a(this));
            }
            if (TextUtils.isEmpty(this.d)) {
                button.setVisibility(8);
                d(view2);
                d(null);
            } else {
                button.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.e)) {
                button2.setVisibility(8);
                d(view2);
                d(null);
            } else {
                button2.setVisibility(0);
            }
            if (!this.i && linearLayout != null) {
                linearLayout.setVisibility(4);
            }
            if (!this.h) {
                d(imageButton);
            }
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (this.f31151a.getResources().getDisplayMetrics().widthPixels * 0.9d);
            window.setAttributes(attributes);
            button.setOnClickListener(new b());
            button2.setOnClickListener(new c());
            if (imageButton != null) {
                imageButton.setOnClickListener(new d());
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c96810f", new Object[]{this});
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        f();
    }
}
