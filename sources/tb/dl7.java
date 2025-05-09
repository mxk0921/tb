package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.update.dialog.ButtonFlat;
import com.taobao.update.framework.UpdateRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dl7 extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f17893a;
    public View backView;
    public ButtonFlat buttonAccept;
    public String buttonAcceptText;
    public ButtonFlat buttonCancel;
    public String buttonCancelText;
    public boolean clickBackViewToExit;
    public Context context;
    public String message;
    public TextView messageTextView;
    public View.OnClickListener onAcceptButtonClickListener;
    public View.OnClickListener onCancelButtonClickListener;
    public String title;
    public TextView titleTextView;
    public View view;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getX() < dl7.this.view.getLeft() || motionEvent.getX() > dl7.this.view.getRight() || motionEvent.getY() > dl7.this.view.getBottom() || motionEvent.getY() < dl7.this.view.getTop()) {
                dl7 dl7Var = dl7.this;
                if (dl7Var.clickBackViewToExit) {
                    View.OnClickListener onClickListener = dl7Var.onCancelButtonClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(dl7Var.buttonCancel);
                    }
                    dl7.this.dismiss();
                }
            }
            return false;
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
                return;
            }
            dl7.this.dismiss();
            View.OnClickListener onClickListener = dl7.this.onCancelButtonClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
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
                return;
            }
            if (!dl7.this.buttonAcceptText.equals("立即安装")) {
                dl7.this.dismiss();
            }
            View.OnClickListener onClickListener = dl7.this.onAcceptButtonClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (dl7.this.isShowing() && !dl7.access$000(dl7.this)) {
                    dl7.access$101(dl7.this);
                }
            }
        }

        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                dl7.this.view.post(new a());
            }
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
            }
        }
    }

    static {
        t2o.a(947912739);
    }

    public dl7(Context context) {
        super(context);
        this.clickBackViewToExit = true;
    }

    public static /* synthetic */ boolean access$000(dl7 dl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("323b39b2", new Object[]{dl7Var})).booleanValue();
        }
        return dl7Var.a();
    }

    public static /* synthetic */ void access$101(dl7 dl7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaabc72c", new Object[]{dl7Var});
        } else {
            super.dismiss();
        }
    }

    public static /* synthetic */ Object ipc$super(dl7 dl7Var, String str, Object... objArr) {
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
            case 1683598447:
                super.setContentView((View) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/dialog/Dialog");
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18afaad7", new Object[]{this})).booleanValue();
        }
        if (((Activity) this.context).isDestroyed() || ((Activity) this.context).isFinishing()) {
            return true;
        }
        return false;
    }

    public void addAcceptButton(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d609ec", new Object[]{this, str});
            return;
        }
        this.buttonAcceptText = str;
        ButtonFlat buttonFlat = this.buttonAccept;
        if (buttonFlat != null) {
            buttonFlat.setText(str);
        }
    }

    public void addCancelButton(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcc45e", new Object[]{this, str});
            return;
        }
        this.buttonCancelText = str;
        ButtonFlat buttonFlat = this.buttonCancel;
        if (buttonFlat != null) {
            buttonFlat.setText(str);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.context.getApplicationContext(), R.anim.dialog_main_hide_amination);
        loadAnimation.setAnimationListener(new d());
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.context.getApplicationContext(), R.anim.dialog_root_hide_amin);
        this.view.startAnimation(loadAnimation);
        this.backView.startAnimation(loadAnimation2);
    }

    public ButtonFlat getButtonAccept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ButtonFlat) ipChange.ipc$dispatch("7649cce9", new Object[]{this});
        }
        return this.buttonAccept;
    }

    public ButtonFlat getButtonCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ButtonFlat) ipChange.ipc$dispatch("93426c5b", new Object[]{this});
        }
        return this.buttonCancel;
    }

    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.f17893a;
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.message;
    }

    public TextView getMessageTextView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("8c9ef9de", new Object[]{this});
        }
        return this.messageTextView;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public TextView getTitleTextView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("5646322f", new Object[]{this});
        }
        return this.titleTextView;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        View.OnClickListener onClickListener = this.onCancelButtonClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        super.setContentView(LayoutInflater.from(UpdateRuntime.getContext()).inflate(R.layout.update_dialog, (ViewGroup) null));
        this.view = (RelativeLayout) findViewById(R.id.update_contentDialog);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.update_dialog_rootView);
        this.backView = frameLayout;
        ViewProxy.setOnTouchListener(frameLayout, new a());
        this.titleTextView = (TextView) findViewById(R.id.update_title);
        setTitle(this.title);
        if (this.f17893a != null) {
            ((FrameLayout) findViewById(R.id.update_dialog_content)).addView(this.f17893a);
            findViewById(R.id.message_scrollView).setVisibility(8);
        } else {
            this.messageTextView = (TextView) findViewById(R.id.update_message);
            setMessage(this.message);
        }
        if (this.buttonCancelText != null) {
            ButtonFlat buttonFlat = (ButtonFlat) findViewById(R.id.update_button_cancel);
            this.buttonCancel = buttonFlat;
            buttonFlat.setVisibility(0);
            this.buttonCancel.setText(this.buttonCancelText);
            this.buttonCancel.setOnClickListener(new b());
        }
        if (this.buttonAcceptText != null) {
            ButtonFlat buttonFlat2 = (ButtonFlat) findViewById(R.id.update_button_accept);
            this.buttonAccept = buttonFlat2;
            buttonFlat2.setVisibility(0);
            this.buttonAccept.setText(this.buttonAcceptText);
            this.buttonAccept.setOnClickListener(new c());
        }
    }

    public void setButtonAccept(ButtonFlat buttonFlat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27275f", new Object[]{this, buttonFlat});
        } else {
            this.buttonAccept = buttonFlat;
        }
    }

    public void setButtonCancel(ButtonFlat buttonFlat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e42762d", new Object[]{this, buttonFlat});
        } else {
            this.buttonCancel = buttonFlat;
        }
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.f17893a = view;
        }
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
            return;
        }
        this.message = str;
        this.messageTextView.setText(str);
    }

    public void setMessageTextView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eac0d26", new Object[]{this, textView});
        } else {
            this.messageTextView = textView;
        }
    }

    public void setOnAcceptButtonClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94d8ff1", new Object[]{this, onClickListener});
            return;
        }
        this.onAcceptButtonClickListener = onClickListener;
        ButtonFlat buttonFlat = this.buttonAccept;
        if (buttonFlat != null) {
            buttonFlat.setOnClickListener(onClickListener);
        }
    }

    public void setOnCancelButtonClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0dbf6e3", new Object[]{this, onClickListener});
            return;
        }
        this.onCancelButtonClickListener = onClickListener;
        ButtonFlat buttonFlat = this.buttonCancel;
        if (buttonFlat != null) {
            buttonFlat.setOnClickListener(onClickListener);
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.title = str;
        if (str == null) {
            this.titleTextView.setVisibility(8);
            return;
        }
        this.titleTextView.setVisibility(0);
        this.titleTextView.setText(str);
    }

    public void setTitleTextView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bb31f5", new Object[]{this, textView});
        } else {
            this.titleTextView = textView;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        Log.e("UIConfirmImpl", "dialog show");
        super.show();
        this.view.startAnimation(AnimationUtils.loadAnimation(this.context.getApplicationContext(), R.anim.dialog_main_show_amination));
        this.backView.startAnimation(AnimationUtils.loadAnimation(this.context.getApplicationContext(), R.anim.dialog_root_show_amin));
    }

    public dl7(Context context, String str, String str2) {
        super(context, 16973839);
        this.clickBackViewToExit = true;
        this.context = context;
        this.message = str2;
        this.title = str;
    }

    public void addAcceptButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d540ecd", new Object[]{this, str, onClickListener});
            return;
        }
        this.buttonAcceptText = str;
        this.onAcceptButtonClickListener = onClickListener;
    }

    public void addCancelButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ca2f1b", new Object[]{this, str, onClickListener});
            return;
        }
        this.buttonCancelText = str;
        this.onCancelButtonClickListener = onClickListener;
    }

    public dl7(Context context, String str, String str2, boolean z) {
        super(context, 16973839);
        this.context = context;
        this.message = str2;
        this.title = str;
        this.clickBackViewToExit = z;
    }
}
