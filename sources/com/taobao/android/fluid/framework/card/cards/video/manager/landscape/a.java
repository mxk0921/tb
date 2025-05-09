package com.taobao.android.fluid.framework.card.cards.video.manager.landscape;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f7795a;
    public AbstractC0418a b;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface AbstractC0418a {
        boolean onBackPressed();
    }

    static {
        t2o.a(468714061);
    }

    public a(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 921927566:
                super.setContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/manager/landscape/LandscapeDialog");
        }
    }

    public void a(AbstractC0418a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769e3acd", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        AbstractC0418a aVar = this.b;
        if (aVar == null || !aVar.onBackPressed()) {
            super.onBackPressed();
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
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.FluidLandDialogWindowAnim);
            window.setLayout(-1, -1);
            window.getDecorView().setSystemUiVisibility(1284);
        }
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.f7795a = view;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            super.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
            return;
        }
        this.f7795a = view;
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        super.setContentView(view, layoutParams);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
    }
}
