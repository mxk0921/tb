package com.taobao.android.litecreator.widgets;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LCMaterialDialog extends AlertDialog {
    static {
        t2o.a(511705698);
    }

    public LCMaterialDialog(Context context) {
        super(context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class Builder extends AlertDialog.Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final View f8340a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TUrlImageView e;
        public final TextView f;
        public final TextView g;
        public DialogInterface.OnClickListener h;
        public DialogInterface.OnClickListener i;
        public DialogInterface.OnClickListener j;
        public final FrameLayout k;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AlertDialog f8341a;

            public a(AlertDialog alertDialog) {
                this.f8341a = alertDialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                this.f8341a.dismiss();
                if (Builder.a(Builder.this) != null) {
                    Builder.a(Builder.this).onClick(this.f8341a, -2);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AlertDialog f8342a;

            public b(AlertDialog alertDialog) {
                this.f8342a = alertDialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                this.f8342a.dismiss();
                if (Builder.b(Builder.this) != null) {
                    Builder.b(Builder.this).onClick(this.f8342a, -2);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class c implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AlertDialog f8343a;

            public c(AlertDialog alertDialog) {
                this.f8343a = alertDialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                this.f8343a.dismiss();
                if (Builder.c(Builder.this) != null) {
                    Builder.c(Builder.this).onClick(this.f8343a, -1);
                }
            }
        }

        static {
            t2o.a(511705699);
        }

        public Builder(Context context) {
            super(context, R.style.LCCustomDialog);
            View inflate = LayoutInflater.from(context).inflate(R.layout.lay_lc_custom_dialog, (ViewGroup) null);
            this.f8340a = inflate;
            setView(inflate);
            this.b = (TextView) inflate.findViewById(R.id.umi_custom_dialog_content);
            this.c = (TextView) inflate.findViewById(R.id.umi_custom_dialog_sub_content);
            this.d = (TextView) inflate.findViewById(R.id.umi_custom_dialog_sub_url_content);
            this.e = (TUrlImageView) inflate.findViewById(R.id.umi_custom_dialog_cover);
            this.f = (TextView) inflate.findViewById(R.id.umi_custom_dialog_negative_btn);
            this.g = (TextView) inflate.findViewById(R.id.umi_custom_dialog_positive_btn);
            this.k = (FrameLayout) inflate.findViewById(R.id.umi_custom_dialog_close_btn);
        }

        public static /* synthetic */ DialogInterface.OnClickListener a(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("c4dcd366", new Object[]{builder});
            }
            return builder.j;
        }

        public static /* synthetic */ DialogInterface.OnClickListener b(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("244cae45", new Object[]{builder});
            }
            return builder.i;
        }

        public static /* synthetic */ DialogInterface.OnClickListener c(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("83bc8924", new Object[]{builder});
            }
            return builder.h;
        }

        public static /* synthetic */ Object ipc$super(Builder builder, String str, Object... objArr) {
            if (str.hashCode() == -1854191682) {
                return super.create();
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/widgets/LCMaterialDialog$Builder");
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public AlertDialog create() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AlertDialog) ipChange.ipc$dispatch("917b47be", new Object[]{this});
            }
            AlertDialog create = super.create();
            if (TextUtils.isEmpty(null)) {
                this.e.setVisibility(8);
            } else {
                this.e.setVisibility(0);
                this.e.setImageUrl(null);
            }
            if (this.j == null) {
                this.k.setVisibility(8);
            } else {
                this.k.setVisibility(0);
                this.k.setOnClickListener(new a(create));
            }
            this.f.setOnClickListener(new b(create));
            this.g.setOnClickListener(new c(create));
            return create;
        }

        public AlertDialog.Builder d(DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AlertDialog.Builder) ipChange.ipc$dispatch("cb434ea0", new Object[]{this, onClickListener});
            }
            this.j = onClickListener;
            return this;
        }

        public Builder e(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fa436f44", new Object[]{this, charSequence});
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.c.setText(charSequence);
                this.c.setVisibility(0);
            }
            return this;
        }

        public Builder f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ae7b028d", new Object[]{this, new Integer(i)});
            }
            this.c.setGravity(i);
            return this;
        }

        public Builder g(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b55d59b5", new Object[]{this, charSequence});
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.d.setText(charSequence);
                this.d.setVisibility(0);
                this.d.setMovementMethod(LinkMovementMethod.getInstance());
            }
            return this;
        }

        public Builder h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cc09f1cd", new Object[]{this, new Integer(i)});
            }
            LinearLayout linearLayout = (LinearLayout) this.f8340a.findViewById(R.id.dialogContentView);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = i;
            linearLayout.setLayoutParams(layoutParams);
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public AlertDialog.Builder setMessage(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AlertDialog.Builder) ipChange.ipc$dispatch("ab8a1a3a", new Object[]{this, charSequence});
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.b.setText(charSequence);
                this.b.setVisibility(0);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public AlertDialog.Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AlertDialog.Builder) ipChange.ipc$dispatch("a9084fb1", new Object[]{this, charSequence, onClickListener});
            }
            TextView textView = this.f;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            }
            textView.setVisibility(i);
            this.f.setText(charSequence);
            this.i = onClickListener;
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public AlertDialog.Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AlertDialog.Builder) ipChange.ipc$dispatch("9a543e75", new Object[]{this, charSequence, onClickListener});
            }
            TextView textView = this.g;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            }
            textView.setVisibility(i);
            this.g.setText(charSequence);
            this.h = onClickListener;
            return this;
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public AlertDialog.Builder setMessage(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AlertDialog.Builder) ipChange.ipc$dispatch("137ede93", new Object[]{this, new Integer(i)}) : setMessage(getContext().getText(i));
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public AlertDialog.Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AlertDialog.Builder) ipChange.ipc$dispatch("311249f0", new Object[]{this, new Integer(i), onClickListener}) : setNegativeButton(getContext().getText(i), onClickListener);
        }

        @Override // androidx.appcompat.app.AlertDialog.Builder
        public AlertDialog.Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AlertDialog.Builder) ipChange.ipc$dispatch("9d2a7ac", new Object[]{this, new Integer(i), onClickListener}) : setPositiveButton(getContext().getText(i), onClickListener);
        }
    }
}
