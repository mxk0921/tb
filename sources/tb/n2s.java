package tb;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n2s extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f24473a;
    public TextView b;
    public TextView c;
    public TextView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f24474a;

        public a(View.OnClickListener onClickListener) {
            this.f24474a = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            View.OnClickListener onClickListener = this.f24474a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            n2s.this.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f24475a;

        public b(View.OnClickListener onClickListener) {
            this.f24475a = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            View.OnClickListener onClickListener = this.f24475a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            n2s.this.dismiss();
        }
    }

    static {
        t2o.a(806356428);
    }

    public n2s(Context context) {
        super(context);
        a(context);
    }

    public static /* synthetic */ Object ipc$super(n2s n2sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/ui/TLBaseDialog");
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_layout_common_dialog, (ViewGroup) null);
        setContentView(inflate);
        this.f24473a = (TextView) inflate.findViewById(R.id.title);
        this.b = (TextView) inflate.findViewById(R.id.content);
        this.c = (TextView) inflate.findViewById(R.id.positive);
        this.d = (TextView) inflate.findViewById(R.id.negative);
    }

    public n2s b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n2s) ipChange.ipc$dispatch("b0befc1a", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.b.setVisibility(0);
            this.b.setText(str);
        } else {
            this.b.setVisibility(8);
        }
        return this;
    }

    public n2s c(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n2s) ipChange.ipc$dispatch("b73f19e3", new Object[]{this, str, onClickListener});
        }
        this.d.setVisibility(0);
        this.d.setText(str);
        this.d.setOnClickListener(new b(onClickListener));
        return this;
    }

    public n2s d(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n2s) ipChange.ipc$dispatch("425e14a7", new Object[]{this, str, onClickListener});
        }
        this.c.setVisibility(0);
        this.c.setText(str);
        this.c.setOnClickListener(new a(onClickListener));
        return this;
    }

    public n2s e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n2s) ipChange.ipc$dispatch("482631b", new Object[]{this, str});
        }
        this.f24473a.setText(str);
        return this;
    }

    public n2s(Context context, int i) {
        super(context, i);
        a(context);
    }
}
