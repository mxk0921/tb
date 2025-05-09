package com.alipay.mobile.verifyidentity.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VIDialogButtonListView extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<Button> f4465a = new ArrayList();
    private OnItemClickListener b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnItemClickListener {
        void onClick(View view, int i);
    }

    public VIDialogButtonListView(Context context) {
        super(context);
        setOrientation(1);
    }

    public static /* synthetic */ Object ipc$super(VIDialogButtonListView vIDialogButtonListView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/VIDialogButtonListView");
    }

    public Button getButton(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("c1511ca8", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.f4465a.size()) {
            return null;
        }
        return this.f4465a.get(i);
    }

    public int getButtonsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54105efe", new Object[]{this})).intValue();
        }
        return this.f4465a.size();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        OnItemClickListener onItemClickListener = this.b;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(view, this.f4465a.indexOf(view));
        }
    }

    public void setButtonList(List<? extends CharSequence> list, OnItemClickListener onItemClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8e9eca", new Object[]{this, list, onItemClickListener, new Boolean(z)});
            return;
        }
        this.b = onItemClickListener;
        Context context = getContext();
        Resources resources = context.getResources();
        this.f4465a.clear();
        removeAllViews();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = new View(context);
            view.setBackgroundColor(resources.getColor(R.color.vi_color_fill_grey_light));
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
            addView(view);
            Button button = new Button(context);
            button.setText((CharSequence) list.get(i));
            button.setTextSize(1, 18.0f);
            if (size <= 1 || i != size - 1) {
                button.setTextColor(resources.getColorStateList(R.color.vi_dialog_button_text_color));
            } else {
                button.setTextColor(Color.parseColor("#333333"));
            }
            if (i < size - 1) {
                button.setBackgroundResource(R.drawable.vi_dialog_normal_button_bg);
            } else {
                button.setBackgroundResource(R.drawable.vi_dialog_bottom_bg);
            }
            button.setMinHeight(DensityUtil.dip2px(context, 49.0f));
            button.setGravity(17);
            button.setPadding(0, 0, 0, 0);
            button.setOnClickListener(this);
            addView(button);
            this.f4465a.add(button);
        }
    }

    public VIDialogButtonListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
    }
}
