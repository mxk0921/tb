package tb;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wdv extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f30646a;
    public TextView b;
    public TextView c;
    public TUrlImageView d;
    public FrameLayout e;
    public String f;
    public String g;
    public String h;
    public String i;
    public e j;
    public d k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (wdv.a(wdv.this) != null) {
                wdv.a(wdv.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (wdv.b(wdv.this) != null) {
                wdv.b(wdv.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (wdv.b(wdv.this) != null) {
                wdv.b(wdv.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
        void a();
    }

    static {
        t2o.a(944767263);
    }

    public wdv(Context context) {
        super(context);
    }

    public static /* synthetic */ e a(wdv wdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("7ee2061f", new Object[]{wdvVar});
        }
        return wdvVar.j;
    }

    public static /* synthetic */ d b(wdv wdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("edd87e7a", new Object[]{wdvVar});
        }
        return wdvVar.k;
    }

    public static /* synthetic */ Object ipc$super(wdv wdvVar, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/widget/UmiCustomDialog");
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.f)) {
            this.f30646a.setText(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            this.c.setText(this.g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            this.b.setText(this.h);
        }
        if (TextUtils.isEmpty(this.i)) {
            this.d.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        this.d.setImageUrl(this.i);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6686f1", new Object[]{this});
            return;
        }
        this.c.setOnClickListener(new a());
        this.b.setOnClickListener(new b());
        this.e.setOnClickListener(new c());
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.f30646a = (TextView) findViewById(R.id.umi_custom_dialog_content);
        this.b = (TextView) findViewById(R.id.umi_custom_dialog_negative_btn);
        this.c = (TextView) findViewById(R.id.umi_custom_dialog_positive_btn);
        this.d = (TUrlImageView) findViewById(R.id.umi_custom_dialog_cover);
        this.e = (FrameLayout) findViewById(R.id.umi_custom_dialog_close_btn);
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2125946", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void h(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa733ba5", new Object[]{this, str, dVar});
            return;
        }
        this.h = str;
        this.k = dVar;
    }

    public void i(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e592a025", new Object[]{this, str, eVar});
            return;
        }
        this.g = str;
        this.j = eVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.lay_lc_custom_dialog);
        setCanceledOnTouchOutside(false);
        e();
        c();
        d();
    }

    public wdv(Context context, int i) {
        super(context, i);
    }
}
