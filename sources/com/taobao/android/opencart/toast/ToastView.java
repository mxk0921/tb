package com.taobao.android.opencart.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.view.IconFontView;
import com.taobao.taobao.R;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ToastView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IconFontView mIcon;
    private TextView mText;

    public ToastView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        float f = context.getResources().getDisplayMetrics().density;
        int i = (int) (15.0f * f);
        setBackgroundResource(R.drawable.addbag_xsku_toast_bg);
        setPadding(i, (int) (6.0f * f), i, (int) (f * 9.0f));
        View inflate = View.inflate(context, R.layout.addbag_view_toast, this);
        this.mIcon = (IconFontView) inflate.findViewById(R.id.toast_icon);
        this.mText = (TextView) inflate.findViewById(R.id.toast_tip);
    }

    public static /* synthetic */ Object ipc$super(ToastView toastView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/opencart/toast/ToastView");
    }

    public void showDefault(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21bec15", new Object[]{this, str});
            return;
        }
        this.mText.setText(str);
        this.mIcon.setText("텪");
    }

    public void showFailed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817b14ab", new Object[]{this, str});
            return;
        }
        this.mText.setText(str);
        this.mIcon.setText("큊");
    }

    public void showSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196eb857", new Object[]{this, str});
            return;
        }
        this.mText.setText(str);
        this.mIcon.setText("퀚");
    }

    public void showWithIcon(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bc9697", new Object[]{this, str, str2});
            return;
        }
        this.mText.setText(str);
        this.mIcon.setText(str2);
    }

    public ToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ToastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
