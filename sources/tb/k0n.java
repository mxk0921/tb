package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.RoundProgressView;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k0n extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22328a;
    public TextView b;
    public TextView c;
    public qob d;
    public RoundProgressView e;
    public ImageView f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (k0n.a(k0n.this) != null) {
                k0n.a(k0n.this).d();
            }
        }
    }

    static {
        t2o.a(511705505);
    }

    public k0n(Context context, qob qobVar) {
        super(context);
        this.f22328a = context;
        this.d = qobVar;
        requestWindowFeature(1);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.8f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setColor(0);
        getWindow().setBackgroundDrawable(colorDrawable);
        getWindow().setGravity(17);
        e();
        setCanceledOnTouchOutside(false);
    }

    public static /* synthetic */ qob a(k0n k0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qob) ipChange.ipc$dispatch("96e7ac46", new Object[]{k0nVar});
        }
        return k0nVar.d;
    }

    public static /* synthetic */ Object ipc$super(k0n k0nVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1373052399:
                super.dismiss();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 1887430145:
                super.cancel();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/loading/ProgressLoadingDialog");
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e32917d", new Object[]{this})).booleanValue();
        }
        Context context = this.f22328a;
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity) || (!((Activity) context).isFinishing() && !((Activity) this.f22328a).isDestroyed())) {
            return false;
        }
        return true;
    }

    public void c(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f41fba6", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = this.f;
        if (!z) {
            i = 4;
        }
        imageView.setVisibility(i);
        this.f.setEnabled(z);
        setCancelable(z);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (!b()) {
            super.cancel();
            qob qobVar = this.d;
            if (qobVar != null) {
                qobVar.d();
            }
        }
    }

    public LinearLayout.LayoutParams d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("d4a98138", new Object[]{this});
        }
        return new LinearLayout.LayoutParams(a65.a(250.0f), -2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (!b()) {
            super.dismiss();
            qob qobVar = this.d;
            if (qobVar != null) {
                qobVar.a();
            }
        }
    }

    public final void e() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.f22328a);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundDrawable(this.f22328a.getDrawable(R.drawable.drawable_progress_dialog_bg));
        linearLayout.setPadding(0, 0, 0, a65.a(16.0f));
        ImageView imageView = new ImageView(this.f22328a);
        this.f = imageView;
        imageView.setImageDrawable(this.f22328a.getDrawable(R.drawable.icon_common_panel_close));
        int a2 = a65.a(10.0f);
        this.f.setPadding(a2, a2, a2, a2 / 2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a65.a(32.0f), a65.a(32.0f));
        layoutParams.gravity = 5;
        this.f.setLayoutParams(layoutParams);
        this.f.setOnClickListener(new a());
        linearLayout.addView(this.f);
        RoundProgressView roundProgressView = new RoundProgressView(this.f22328a);
        this.e = roundProgressView;
        roundProgressView.setMax(100);
        this.e.setLoadingRoundColor(-1);
        this.e.setInnerBgColor(Color.parseColor("#26FFFFFF"));
        this.e.setProgress(0);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(a65.a(50.0f), a65.a(50.0f)));
        linearLayout.addView(this.e);
        TextView textView = new TextView(this.f22328a);
        this.b = textView;
        textView.setText(Localization.q(R.string.gg_pub_downloading_file));
        this.b.setTextColor(-1);
        this.b.setTextSize(1, 15.0f);
        this.b.setLineSpacing(a65.a(5.0f), 1.0f);
        this.b.setTypeface(Typeface.DEFAULT_BOLD);
        this.b.setPadding(0, a65.a(16.0f), 0, 0);
        this.b.setGravity(17);
        linearLayout.addView(this.b);
        TextView textView2 = new TextView(this.f22328a);
        this.c = textView2;
        textView2.setText(Localization.q(R.string.gg_pub_video_preparing_do_not_exit_taobao));
        this.c.setTextColor(-1);
        this.c.setTextSize(1, 14.0f);
        this.c.setLineSpacing(a65.a(5.0f), 1.0f);
        this.c.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.c.setPadding(0, a65.a(16.0f), 0, 0);
        this.c.setGravity(17);
        TextView textView3 = this.b;
        if (!this.g) {
            i = 8;
        }
        textView3.setVisibility(i);
        linearLayout.addView(this.c);
        setContentView(linearLayout, d());
    }

    public void f(qob qobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9073ec7", new Object[]{this, qobVar});
        } else {
            this.d = qobVar;
        }
    }

    public k0n g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k0n) ipChange.ipc$dispatch("356d048c", new Object[]{this, new Integer(i)});
        }
        this.e.setInnerBgColor(Color.parseColor("#26FFFFFF"));
        this.e.setIsNeedTextShow(true);
        this.e.setProgress(i);
        return this;
    }

    public k0n h(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k0n) ipChange.ipc$dispatch("60ce0321", new Object[]{this, str});
        }
        TextView textView = this.c;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        }
        textView.setVisibility(i);
        this.c.setText(str);
        return this;
    }

    public k0n i(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k0n) ipChange.ipc$dispatch("104b13b2", new Object[]{this, str});
        }
        TextView textView = this.b;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        }
        textView.setVisibility(i);
        this.b.setText(str);
        return this;
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27b32b2", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        qob qobVar = this.d;
        if (qobVar != null) {
            qobVar.c();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (!b()) {
            super.show();
            qob qobVar = this.d;
            if (qobVar != null) {
                qobVar.b();
            }
        }
    }
}
