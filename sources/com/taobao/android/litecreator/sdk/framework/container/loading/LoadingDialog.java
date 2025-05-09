package com.taobao.android.litecreator.sdk.framework.container.loading;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.a;
import com.taobao.taobao.R;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LoadingDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f8313a;
    public TextView c;
    public ImageView d;
    public ProgressBar e;
    public LottieAnimationView f;
    public com.taobao.android.litecreator.sdk.framework.container.loading.a g = com.taobao.android.litecreator.sdk.framework.container.loading.a.g;
    public a.c h = null;

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
                return;
            }
            LoadingDialog.this.dismissAllowingStateLoss();
            if (LoadingDialog.p2(LoadingDialog.this) != null) {
                LoadingDialog.p2(LoadingDialog.this).onDismiss();
            }
        }
    }

    static {
        t2o.a(511705503);
    }

    public static /* synthetic */ Object ipc$super(LoadingDialog loadingDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -596517775) {
            super.show((FragmentManager) objArr[0], (String) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/litecreator/sdk/framework/container/loading/LoadingDialog");
        }
    }

    public static /* synthetic */ a.c p2(LoadingDialog loadingDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("60075548", new Object[]{loadingDialog});
        }
        return loadingDialog.h;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.CommonProgress);
        setCancelable(this.g.d());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (getDialog() != null && getContext() != null) {
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setLayout(-2, -2);
            }
            Window window = getDialog().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = this.g.b();
            window.setAttributes(attributes);
            window.setNavigationBarColor(-16777216);
            getDialog().setCancelable(this.g.d());
            getDialog().setCanceledOnTouchOutside(this.g.d());
        }
    }

    public void r2(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4323d5ad", new Object[]{this, cVar});
        } else {
            this.h = cVar;
        }
    }

    public void s2(com.taobao.android.litecreator.sdk.framework.container.loading.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9545e5e7", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc71dc71", new Object[]{this, fragmentManager, str});
            return;
        }
        try {
            if (!isAdded()) {
                super.show(fragmentManager, str);
            }
        } catch (Exception e) {
            odg.c("LoadingDialog", e.getMessage());
        }
    }

    public void u2(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().getWindow().requestFeature(1);
        getDialog().setCanceledOnTouchOutside(false);
        View inflate = layoutInflater.inflate(R.layout.layout_common_loading_dialog, viewGroup, false);
        this.f8313a = (FrameLayout) inflate.findViewById(R.id.loadingView);
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        this.c = textView;
        textView.setText(this.g.c());
        this.d = (ImageView) inflate.findViewById(R.id.right_close);
        this.e = (ProgressBar) inflate.findViewById(R.id.pb_loading);
        this.f = (LottieAnimationView) inflate.findViewById(R.id.lottie_loading);
        this.d.setVisibility(this.g.e() ? 0 : 8);
        this.d.setOnClickListener(new a());
        if (this.g.a() != 0) {
            this.f8313a.setBackgroundResource(this.g.a());
        }
        if (this.g.f()) {
            this.e.setVisibility(0);
            this.f.setVisibility(8);
        } else {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
            try {
                this.f.setAnimation("xgc_lottie_point_loading.json");
                this.f.loop(true);
                this.f.playAnimation();
            } catch (OutOfMemoryError e) {
                odg.c("LoadingDialog", e.getMessage());
            }
        }
        return inflate;
    }
}
