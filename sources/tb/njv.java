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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.update.framework.UpdateRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class njv extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24780a;
    public View b;
    public View c;
    public boolean clickBackViewToExit;
    public String d;
    public TextView e;
    public String f;
    public TextView g;
    public ImageView h;
    public Button i;
    public Button j;
    public String k;
    public String l;
    public View.OnClickListener m;
    public View.OnClickListener n;
    public boolean o = true;
    public int p = R.drawable.update_notify;

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
            if ((motionEvent.getX() < njv.access$000(njv.this).getLeft() || motionEvent.getX() > njv.access$000(njv.this).getRight() || motionEvent.getY() > njv.access$000(njv.this).getBottom() || motionEvent.getY() < njv.access$000(njv.this).getTop()) && njv.access$100(njv.this)) {
                njv njvVar = njv.this;
                if (njvVar.clickBackViewToExit) {
                    if (njv.access$200(njvVar) != null) {
                        njv.access$200(njv.this).onClick(njv.access$300(njv.this));
                    }
                    njv.this.dismiss();
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
            } else if (njv.access$100(njv.this)) {
                njv.this.dismiss();
                if (njv.access$200(njv.this) != null) {
                    njv.access$200(njv.this).onClick(view);
                }
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
            } else if (njv.access$100(njv.this)) {
                njv.this.dismiss();
                if (njv.access$200(njv.this) != null) {
                    njv.access$200(njv.this).onClick(view);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (njv.access$100(njv.this)) {
                if (!njv.access$400(njv.this).equals("立即安装")) {
                    njv.this.dismiss();
                }
                if (njv.access$500(njv.this) != null) {
                    njv.access$500(njv.this).onClick(view);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Animation.AnimationListener {
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
                    return;
                }
                if (njv.this.isShowing() && !njv.access$600(njv.this)) {
                    njv.access$701(njv.this);
                }
                njv.access$102(njv.this, true);
            }
        }

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                njv.access$000(njv.this).post(new a());
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
        t2o.a(947912745);
    }

    public njv(Context context, String str, String str2, boolean z) {
        super(context, 16973839);
        this.f24780a = context;
        this.d = str2;
        this.f = str;
        this.clickBackViewToExit = z;
    }

    public static /* synthetic */ View access$000(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a5b64d0b", new Object[]{njvVar});
        }
        return njvVar.b;
    }

    public static /* synthetic */ boolean access$100(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17c26ec", new Object[]{njvVar})).booleanValue();
        }
        return njvVar.o;
    }

    public static /* synthetic */ boolean access$102(njv njvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fdb572", new Object[]{njvVar, new Boolean(z)})).booleanValue();
        }
        njvVar.o = z;
        return z;
    }

    public static /* synthetic */ View.OnClickListener access$200(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("21548a70", new Object[]{njvVar});
        }
        return njvVar.n;
    }

    public static /* synthetic */ Button access$300(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("71d9779a", new Object[]{njvVar});
        }
        return njvVar.j;
    }

    public static /* synthetic */ String access$400(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("441e2bb", new Object[]{njvVar});
        }
        return njvVar.l;
    }

    public static /* synthetic */ View.OnClickListener access$500(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("ad68c8cd", new Object[]{njvVar});
        }
        return njvVar.m;
    }

    public static /* synthetic */ boolean access$600(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2715047", new Object[]{njvVar})).booleanValue();
        }
        return njvVar.a();
    }

    public static /* synthetic */ void access$701(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b37fc1", new Object[]{njvVar});
        } else {
            super.dismiss();
        }
    }

    public static /* synthetic */ Object ipc$super(njv njvVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/dialog/UpdateDialogV2");
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18afaad7", new Object[]{this})).booleanValue();
        }
        if (((Activity) this.f24780a).isDestroyed() || ((Activity) this.f24780a).isFinishing()) {
            return true;
        }
        return false;
    }

    public void addAcceptButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d540ecd", new Object[]{this, str, onClickListener});
            return;
        }
        this.l = str;
        this.m = onClickListener;
    }

    public void addCancelButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ca2f1b", new Object[]{this, str, onClickListener});
            return;
        }
        this.k = str;
        this.n = onClickListener;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        try {
            this.o = false;
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f24780a.getApplicationContext(), R.anim.dialog_main_hide_amination);
            loadAnimation.setAnimationListener(new e());
            Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f24780a.getApplicationContext(), R.anim.dialog_root_hide_amin);
            this.b.startAnimation(loadAnimation);
            this.c.startAnimation(loadAnimation2);
        } catch (Throwable th) {
            this.o = true;
            th.printStackTrace();
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
        View.OnClickListener onClickListener = this.n;
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
        super.setContentView(LayoutInflater.from(UpdateRuntime.getContext()).inflate(R.layout.update_dialog_v2, (ViewGroup) null));
        this.b = findViewById(R.id.update_contentDialog_v2);
        View findViewById = findViewById(R.id.update_dialog_rootView_v2);
        this.c = findViewById;
        ViewProxy.setOnTouchListener(findViewById, new a());
        ImageView imageView = (ImageView) findViewById(R.id.update_header_img_v2);
        this.h = imageView;
        imageView.setImageResource(this.p);
        this.g = (TextView) findViewById(R.id.update_title_v2);
        setTitle(this.f);
        this.e = (TextView) findViewById(R.id.update_message_v2);
        setMessage(this.d);
        if (this.k != null) {
            Button button = (Button) findViewById(R.id.update_button_cancel_v2);
            this.j = button;
            button.setVisibility(0);
            this.j.setText(this.k);
            this.j.setOnClickListener(new b());
        }
        ((ImageView) findViewById(R.id.update_imageview_cancel_v2)).setOnClickListener(new c());
        if (this.l != null) {
            Button button2 = (Button) findViewById(R.id.update_button_accept_v2);
            this.i = button2;
            button2.setVisibility(0);
            this.i.setText(this.l);
            if (this.j != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
                layoutParams.setMargins(5, 0, 0, 0);
                this.i.setLayoutParams(layoutParams);
            }
            this.i.setOnClickListener(new d());
        }
    }

    public void setHeaderImg(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50de828", new Object[]{this, new Integer(i)});
            return;
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
        this.p = i;
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
            return;
        }
        this.d = str;
        this.e.setText(str);
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.f = str;
        if (str == null) {
            this.g.setVisibility(8);
            return;
        }
        this.g.setVisibility(0);
        this.g.setText(str);
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            Log.e("UIConfirmImpl", "dialog show");
            super.show();
            this.b.startAnimation(AnimationUtils.loadAnimation(this.f24780a.getApplicationContext(), R.anim.dialog_main_show_amination));
            this.c.startAnimation(AnimationUtils.loadAnimation(this.f24780a.getApplicationContext(), R.anim.dialog_root_show_amin));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
