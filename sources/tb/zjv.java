package tb;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zjv extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32811a;
    public TextView b;
    public final qob c;
    public ImageView d;
    public ImageView e;
    public ObjectAnimator f;

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
            } else if (zjv.a(zjv.this) != null) {
                zjv.a(zjv.this).d();
            }
        }
    }

    static {
        t2o.a(511705509);
    }

    public zjv(Context context, qob qobVar) {
        super(context);
        this.f32811a = context;
        this.c = qobVar;
        requestWindowFeature(1);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.8f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setColor(0);
        getWindow().setBackgroundDrawable(colorDrawable);
        getWindow().setGravity(17);
        d();
        setCanceledOnTouchOutside(false);
    }

    public static /* synthetic */ qob a(zjv zjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qob) ipChange.ipc$dispatch("acc0b8ea", new Object[]{zjvVar});
        }
        return zjvVar.c;
    }

    public static /* synthetic */ Object ipc$super(zjv zjvVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/loading/UpdateLoadingDialog");
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e32917d", new Object[]{this})).booleanValue();
        }
        Context context = this.f32811a;
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity) || (!((Activity) context).isFinishing() && !((Activity) this.f32811a).isDestroyed())) {
            return false;
        }
        return true;
    }

    public LinearLayout.LayoutParams c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("d4a98138", new Object[]{this});
        }
        return new LinearLayout.LayoutParams(a65.a(186.0f), a65.a(120.0f));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (!b()) {
            super.cancel();
            qob qobVar = this.c;
            if (qobVar != null) {
                qobVar.d();
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.f32811a);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundDrawable(this.f32811a.getDrawable(R.drawable.drawable_update_loading_bg));
        linearLayout.setPadding(0, 0, 0, a65.a(12.0f));
        ImageView imageView = new ImageView(this.f32811a);
        this.e = imageView;
        imageView.setImageDrawable(this.f32811a.getDrawable(R.drawable.icon_common_panel_close));
        int a2 = a65.a(10.0f);
        this.e.setPadding(a2, a2, a2, a2 / 2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a65.a(32.0f), a65.a(32.0f));
        layoutParams.gravity = 5;
        this.e.setLayoutParams(layoutParams);
        this.e.setOnClickListener(new a());
        linearLayout.addView(this.e);
        ImageView imageView2 = new ImageView(this.f32811a);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.lc_icon_loading);
        this.d.setLayoutParams(new FrameLayout.LayoutParams(a65.a(33.0f), a65.a(33.0f)));
        linearLayout.addView(this.d);
        TextView textView = new TextView(this.f32811a);
        this.b = textView;
        textView.setText(Localization.q(R.string.gg_pub_processing));
        this.b.setTextColor(-1);
        this.b.setTextSize(1, 14.0f);
        this.b.setLineSpacing(a65.a(5.0f), 1.0f);
        this.b.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.b.setPadding(0, a65.a(16.0f), 0, 0);
        this.b.setGravity(17);
        linearLayout.addView(this.b);
        setContentView(linearLayout, c());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (!b()) {
            super.dismiss();
            qob qobVar = this.c;
            if (qobVar != null) {
                qobVar.a();
            }
            ObjectAnimator objectAnimator = this.f;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a257a58", new Object[]{this, str});
        } else {
            this.b.setText(str);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8157c9a", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d, Key.ROTATION, 0.0f, 360.0f);
        this.f = ofFloat;
        ofFloat.setDuration(1000L);
        this.f.setInterpolator(new LinearInterpolator());
        this.f.setRepeatCount(-1);
        this.f.start();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        qob qobVar = this.c;
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
            qob qobVar = this.c;
            if (qobVar != null) {
                qobVar.b();
            }
            f();
        }
    }
}
