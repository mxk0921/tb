package com.taobao.android.pissarro;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.external.Config;
import com.taobao.android.pissarro.external.ServiceImpl;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.acq;
import tb.nxv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImageChoiceActivity extends FragmentActivity implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f9163a;
    public boolean b = true;
    public Config c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                ImageChoiceActivity.l3(ImageChoiceActivity.this);
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
        t2o.a(623902722);
    }

    public static /* synthetic */ Object ipc$super(ImageChoiceActivity imageChoiceActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 1150324634) {
            super.finish();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/pissarro/ImageChoiceActivity");
        }
    }

    public static /* synthetic */ void l3(ImageChoiceActivity imageChoiceActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4fb613", new Object[]{imageChoiceActivity});
        } else {
            super.finish();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (this.b) {
            nxv.c(this);
        }
        Animation n3 = n3();
        n3.setAnimationListener(new a());
        View view = this.f9163a;
        if (view != null) {
            view.startAnimation(n3);
        } else {
            super.finish();
        }
    }

    public final Animation m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("3d687b25", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public final Animation n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7ca7afc4", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        translateAnimation.setFillAfter(true);
        return translateAnimation;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.button_cancel) {
            setResult(0, null);
            this.b = true;
            finish();
        } else if (id == R.id.button_camera) {
            Log.e("TaopaiRecord", " onClick camera");
            ServiceImpl.i(this, this.c);
            setResult(-1, null);
            this.b = false;
            Log.e("TaopaiRecord", " onClick camera end");
            super.finish();
        } else if (id == R.id.button_gallery) {
            ServiceImpl.h(this, this.c);
            setResult(-1, null);
            this.b = false;
            Log.e("TaopaiRecord", " onClick button_gallery end");
            super.finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Pissarro_Float_Activity);
        super.onCreate(bundle);
        setContentView(R.layout.pissarro_choice_dialog);
        this.c = (Config) getIntent().getSerializableExtra("config");
        View findViewById = findViewById(R.id.content);
        this.f9163a = findViewById;
        findViewById.startAnimation(m3());
        ViewProxy.setOnClickListener(findViewById(R.id.button_camera), this);
        ViewProxy.setOnClickListener(findViewById(R.id.button_gallery), this);
        ViewProxy.setOnClickListener(findViewById(R.id.button_cancel), this);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
    }
}
