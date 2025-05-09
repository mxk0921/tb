package com.alipay.mobile.verifyidentity.ui.helper;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APGenericProgressDialog extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ProgressBar f4469a;
    public TextView b;
    public CharSequence c;
    public boolean d;
    public boolean e;

    public APGenericProgressDialog(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(APGenericProgressDialog aPGenericProgressDialog, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/helper/APGenericProgressDialog");
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.generic_progress_dialog);
        this.f4469a = (ProgressBar) findViewById(16908301);
        TextView textView = (TextView) findViewById(R.id.message);
        this.b = textView;
        textView.setText(this.c);
        CharSequence charSequence = this.c;
        if (charSequence == null || "".equals(charSequence)) {
            this.b.setVisibility(8);
        }
        ProgressBar progressBar = this.f4469a;
        if (!this.e) {
            i = 8;
        }
        progressBar.setVisibility(i);
        setIndeterminate(this.d);
    }

    public void setIndeterminate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b47354", new Object[]{this, new Boolean(z)});
            return;
        }
        ProgressBar progressBar = this.f4469a;
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
        } else {
            this.d = z;
        }
    }

    @Override // android.app.AlertDialog
    public void setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
        } else {
            this.c = charSequence;
        }
    }

    public void setProgressVisiable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a59b7b", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public APGenericProgressDialog(Context context, int i) {
        super(context, i);
    }
}
