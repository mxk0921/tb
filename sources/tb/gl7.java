package tb;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class gl7 extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View b;
    public FrameLayout d;
    public TextView e;
    public ImageView f;
    public ApiContext j;

    /* renamed from: a  reason: collision with root package name */
    public int f20067a = 200;
    public boolean c = false;
    public String g = null;
    public WXSDKInstance h = null;
    public int i = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                gl7.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    gl7.b(gl7.this);
                } catch (Exception unused) {
                }
                try {
                    if (gl7.c(gl7.this) != null) {
                        View containerView = gl7.c(gl7.this).getContainerView();
                        ViewParent parent = containerView.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(containerView);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            gl7.a(gl7.this, false);
            gl7.d(gl7.this).post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            } else {
                gl7.a(gl7.this, true);
            }
        }
    }

    static {
        t2o.a(766510485);
    }

    public gl7(Context context) {
        super(context, R.style.TbBottomDialog);
    }

    public static /* synthetic */ boolean a(gl7 gl7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1cc008e", new Object[]{gl7Var, new Boolean(z)})).booleanValue();
        }
        gl7Var.c = z;
        return z;
    }

    public static /* synthetic */ void b(gl7 gl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b389174a", new Object[]{gl7Var});
        } else {
            super.dismiss();
        }
    }

    public static /* synthetic */ WXSDKInstance c(gl7 gl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("d9e84a68", new Object[]{gl7Var});
        }
        return gl7Var.h;
    }

    public static /* synthetic */ View d(gl7 gl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1c4e8e8d", new Object[]{gl7Var});
        }
        return gl7Var.b;
    }

    public static /* synthetic */ Object ipc$super(gl7 gl7Var, String str, Object... objArr) {
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
            case 921927566:
                super.setContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case 1683598447:
                super.setContentView((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/weexview/DialogFromBottom");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (!this.c) {
            e();
            ApiContext apiContext = this.j;
            if (apiContext != null) {
                apiContext.sendEvent("weexFloatLayerHideEvent", null, null);
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2797ae2a", new Object[]{this});
        } else if (this.b != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(translateAnimation);
            animationSet.setInterpolator(new DecelerateInterpolator());
            animationSet.setDuration(this.f20067a);
            animationSet.setFillAfter(true);
            animationSet.setAnimationListener(new b());
            this.b.startAnimation(animationSet);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79247fe3", new Object[]{this});
        } else if (this.b != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(translateAnimation);
            animationSet.setInterpolator(new DecelerateInterpolator());
            animationSet.setDuration(this.f20067a);
            animationSet.setFillAfter(true);
            this.b.startAnimation(animationSet);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59975ed3", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view != null) {
            this.e = (TextView) view.findViewById(R.id.weex_float_window_title);
            this.d = (FrameLayout) this.b.findViewById(R.id.weex_float_window_container);
            this.f = (ImageView) this.b.findViewById(R.id.weex_floating_window_close_button);
        }
        if (this.e != null && !TextUtils.isEmpty(this.g)) {
            this.e.setText(this.g);
        }
        if (!(this.d == null || this.h == null)) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.h.getContainerView());
            frameLayout.setBackgroundColor(-1);
            this.d.addView(frameLayout);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57128c26", new Object[]{this, new Integer(i)});
        } else {
            this.f20067a = i;
        }
    }

    public void i(ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3874e301", new Object[]{this, apiContext});
        } else {
            this.j = apiContext;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3edfb4", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void l(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b7b89", new Object[]{this, wXSDKInstance});
        } else {
            this.h = wXSDKInstance;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        int i = r54.m(this.j.getActivity()).heightPixels;
        int i2 = this.i;
        if (i2 <= 0) {
            i2 = i - 185;
        }
        attributes.height = i2;
        attributes.gravity = 81;
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCanceledOnTouchOutside(true);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
        g();
        super.setContentView(this.b);
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        f();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        this.b = view;
        g();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
            return;
        }
        this.b = view;
        g();
        super.setContentView(view, layoutParams);
    }
}
