package tb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.PopDialogSource;
import com.taobao.avplayer.DWInstance;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bh7 extends Dialog implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_SOURCE_TYPE = "sourcetype";
    public static final String V_SOURCE_TYPE = "Product";

    /* renamed from: a  reason: collision with root package name */
    public final Context f16384a;
    public RelativeLayout b;
    public ImageView c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DWInstance f16385a;

        public a(DWInstance dWInstance) {
            this.f16385a = dWInstance;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            DWInstance dWInstance = this.f16385a;
            if (dWInstance != null) {
                dWInstance.mute(bh7.a(bh7.this));
                this.f16385a.unbindWindow();
            }
            if (bh7.c(this.f16385a)) {
                this.f16385a.orientationDisable();
            }
            q84.f(bh7.b(bh7.this), new i7w());
        }
    }

    static {
        t2o.a(912262291);
    }

    public bh7(Context context) {
        super(context);
        this.f16384a = context;
    }

    public static /* synthetic */ boolean a(bh7 bh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2886623a", new Object[]{bh7Var})).booleanValue();
        }
        return bh7Var.d;
    }

    public static /* synthetic */ Context b(bh7 bh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f667e5ef", new Object[]{bh7Var});
        }
        return bh7Var.f16384a;
    }

    public static boolean c(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fee40b9", new Object[]{dWInstance})).booleanValue();
        }
        if (dWInstance == null || dWInstance.getVideoState() == 0 || dWInstance.getVideoState() == 3) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(bh7 bh7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/DetailVideoDialog");
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f481876", new Object[]{this});
        } else {
            bew.c(this.f16384a);
        }
    }

    public void e(DWInstance dWInstance, PopDialogSource popDialogSource, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acf6f3e", new Object[]{this, dWInstance, popDialogSource, view, new Integer(i), new Integer(i2)});
        } else if (dWInstance != null && view != null) {
            this.d = dWInstance.isMute();
            if (this.b == null) {
                RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f16384a).inflate(R.layout.tt_detail_video_dialog, (ViewGroup) null);
                this.b = relativeLayout;
                ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.iv_close);
                this.c = imageView;
                imageView.setOnClickListener(this);
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.b.addView(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(13);
            layoutParams.addRule(15);
            layoutParams.addRule(14);
            view.setLayoutParams(layoutParams);
            setContentView(this.b);
            dWInstance.setFrame(i, i2);
            dWInstance.mute(false);
            dWInstance.showController();
            setOnDismissListener(new a(dWInstance));
            if (!isShowing()) {
                show();
                if (c(dWInstance)) {
                    dWInstance.orientationEnable();
                }
                d();
                dWInstance.bindWindow(getWindow());
                q84.f(this.f16384a, new c8w());
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == this.c && this.f16384a != null) {
            dismiss();
        }
    }

    public bh7(Context context, int i, DWInstance dWInstance) {
        super(context, i);
        this.f16384a = context;
    }
}
