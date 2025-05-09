package com.alipay.android.msp.ui.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspProgressDialogWithAction extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ProgressBar f3739a;
    public FrameLayout b;
    public TextView c;
    public CharSequence d;
    public boolean e;
    public boolean f = true;
    public ImageView g;
    public int h;
    public View.OnClickListener i;

    public MspProgressDialogWithAction(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(MspProgressDialogWithAction mspProgressDialogWithAction, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/MspProgressDialogWithAction");
    }

    public TextView getMessageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ff6a0511", new Object[]{this});
        }
        return this.c;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setContentView(R.layout.au_progress_dialog_with_action);
        this.f3739a = (ProgressBar) findViewById(R.id.progress);
        this.c = (TextView) findViewById(R.id.progress_message);
        this.b = (FrameLayout) findViewById(R.id.layout_bg);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.body);
        this.g = (ImageView) findViewById(R.id.progress_action);
        this.b.setAlpha(0.9f);
        this.g.setImageResource(this.h);
        this.g.setOnClickListener(this.i);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        init();
        this.c.setText(this.d);
        CharSequence charSequence = this.d;
        int i = 8;
        if (charSequence == null || "".equals(charSequence)) {
            this.c.setVisibility(8);
        }
        ProgressBar progressBar = this.f3739a;
        if (this.f) {
            i = 0;
        }
        progressBar.setVisibility(i);
        setIndeterminate(this.e);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void setActionIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d0d02b", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void setActionListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b977bac6", new Object[]{this, onClickListener});
        } else {
            this.i = onClickListener;
        }
    }

    public void setIndeterminate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b47354", new Object[]{this, new Boolean(z)});
            return;
        }
        ProgressBar progressBar = this.f3739a;
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
        } else {
            this.e = z;
        }
    }

    @Override // android.app.AlertDialog
    public void setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
        } else {
            this.d = charSequence;
        }
    }

    public void setProgressVisiable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a59b7b", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public MspProgressDialogWithAction(Context context, int i) {
        super(context, i);
    }
}
