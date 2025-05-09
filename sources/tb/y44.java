package tb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y44 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f31838a;
    public final View b;
    public final View c;
    public final View d;
    public final TextView e;
    public final View f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public c j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (y44.a(y44.this) != null) {
                y44.a(y44.this).b(y44.b(y44.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (y44.a(y44.this) != null) {
                y44.a(y44.this).a(y44.b(y44.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void a(DialogInterface dialogInterface);

        void b(DialogInterface dialogInterface);
    }

    static {
        t2o.a(156237896);
    }

    public y44(Context context) {
        Dialog dialog = new Dialog(context, R.style.CommonAlertDialog);
        this.f31838a = dialog;
        View inflate = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.common_dialog_comfirm, (ViewGroup) null);
        this.b = inflate;
        this.c = inflate.findViewById(R.id.ack_dialog_confirm_container);
        this.d = inflate.findViewById(R.id.ack_dialog_confirm_title_container);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ack_dialog_confirm_title_icon);
        this.e = (TextView) inflate.findViewById(R.id.ack_dialog_confirm_title);
        this.f = inflate.findViewById(R.id.ack_dialog_confirm_title_split_line);
        this.g = (TextView) inflate.findViewById(R.id.ack_dialog_confirm_message);
        this.h = (TextView) inflate.findViewById(R.id.ack_dialog_confirm_bnt_cancel);
        this.i = (TextView) inflate.findViewById(R.id.ack_dialog_confirm_bnt_sure);
        dialog.setContentView(inflate);
    }

    public static /* synthetic */ c a(y44 y44Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("12ac6558", new Object[]{y44Var});
        }
        return y44Var.j;
    }

    public static /* synthetic */ Dialog b(y44 y44Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("505791f1", new Object[]{y44Var});
        }
        return y44Var.f31838a;
    }

    public y44 c(CharSequence charSequence) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y44) ipChange.ipc$dispatch("dd469676", new Object[]{this, charSequence});
        }
        if (!(this.f31838a == null || (textView = this.g) == null)) {
            textView.setText(charSequence);
        }
        return this;
    }

    public y44 d(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y44) ipChange.ipc$dispatch("410450d3", new Object[]{this, charSequence});
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.h.setText(charSequence);
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        return this;
    }

    public y44 e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y44) ipChange.ipc$dispatch("71539259", new Object[]{this, cVar});
        }
        if (this.f31838a != null) {
            this.j = cVar;
            this.h.setOnClickListener(new a());
            this.i.setOnClickListener(new b());
        }
        return this;
    }

    public y44 f(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y44) ipChange.ipc$dispatch("e89c4f97", new Object[]{this, charSequence});
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.i.setText(charSequence);
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        return this;
    }

    public y44 g(String str) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y44) ipChange.ipc$dispatch("2d46a56d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.f31838a == null || (textView = this.e) == null) {
            this.e.setVisibility(8);
        } else {
            textView.setText(str);
            this.e.setVisibility(0);
        }
        return this;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        Dialog dialog = this.f31838a;
        if (dialog != null) {
            try {
                dialog.show();
            } catch (Exception unused) {
            }
        }
    }
}
