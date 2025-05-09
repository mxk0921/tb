package com.taobao.ask;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.view.AskImageView;
import com.taobao.message.uikit.media.expression.ExpressionTable;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import tb.t2o;
import tb.vyv;
import tb.zc1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AskToast extends Toast {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AskToast toast;

    static {
        t2o.a(817889289);
    }

    public AskToast(Context context) {
        super(context);
    }

    public static void cancelToast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2249d4", new Object[0]);
            return;
        }
        AskToast askToast = toast;
        if (askToast != null) {
            askToast.cancel();
        }
    }

    private static boolean initToast(Context context, String str, String str2, CharSequence charSequence, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23d56709", new Object[]{context, str, str2, charSequence, new Float(f), new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            str = "1";
        }
        if (f < 0.0f) {
            f = 70.0f;
        }
        str.hashCode();
        if (str.equals("1")) {
            try {
                cancelToast();
                toast = new AskToast(context);
                View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.toast_ask_type1, (ViewGroup) null);
                inflate.findViewById(R.id.contaier).getLayoutParams().width = vyv.a() - zc1.i(36.0f);
                TextView textView = (TextView) inflate.findViewById(R.id.title);
                textView.setText(ExpressionTable.getExpressionString(Globals.getApplication(), charSequence.toString(), true, (int) (textView.getLineHeight() / context.getResources().getDisplayMetrics().density)));
                View findViewById = inflate.findViewById(R.id.iconContainer);
                AskImageView askImageView = (AskImageView) inflate.findViewById(R.id.icon);
                if (TextUtils.isEmpty(str2)) {
                    findViewById.setVisibility(8);
                } else {
                    findViewById.setVisibility(0);
                    askImageView.setCircle(true);
                    askImageView.setImageUrl(str2, 0);
                }
                toast.setView(inflate);
                toast.setGravity(80, 0, zc1.i(f));
                toast.setDuration(i);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (str.equals("2")) {
            try {
                cancelToast();
                toast = new AskToast(context);
                View inflate2 = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.toast_ask_type2, (ViewGroup) null);
                inflate2.findViewById(R.id.contaier).getLayoutParams().width = vyv.a() - zc1.i(36.0f);
                TextView textView2 = (TextView) inflate2.findViewById(R.id.title);
                textView2.setText(ExpressionTable.getExpressionString(Globals.getApplication(), charSequence.toString(), true, (int) (textView2.getLineHeight() / context.getResources().getDisplayMetrics().density)));
                AskImageView askImageView2 = (AskImageView) inflate2.findViewById(R.id.icon);
                if (TextUtils.isEmpty(str2)) {
                    askImageView2.setVisibility(8);
                } else {
                    askImageView2.setVisibility(0);
                    askImageView2.setCircle(true);
                    askImageView2.setImageUrl(str2, 0);
                }
                toast.setView(inflate2);
                toast.setGravity(80, 0, zc1.i(f));
                toast.setDuration(i);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(AskToast askToast, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -340027132) {
            super.show();
            return null;
        } else if (hashCode == 1887430145) {
            super.cancel();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/ask/AskToast");
        }
    }

    public static boolean showToast(Context context, String str, String str2, CharSequence charSequence, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db3900f6", new Object[]{context, str, str2, charSequence, new Float(f), new Integer(i)})).booleanValue();
        }
        boolean initToast = initToast(context, str, str2, charSequence, f, i);
        if (initToast) {
            toast.show();
        }
        return initToast;
    }

    @Override // android.widget.Toast
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        try {
            super.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.Toast
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            super.show();
        } catch (Exception unused) {
        }
    }
}
