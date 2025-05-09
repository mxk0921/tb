package com.taobao.detail.rate.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.dx1;
import tb.why;
import tb.zhn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateTagView extends LinearLayout implements Checkable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int[] CHECK_STATE = {16842912};
    public final int RATE_TYPE_POSITIVE;
    private int disableTextColor;
    private boolean disabled;
    private boolean isChecked;
    private LinearLayout layout;
    private int mType;
    private int selectTextColor;
    private TextView tagTitle;
    private int textColor;

    public RateTagView(Context context) {
        super(context);
        this.RATE_TYPE_POSITIVE = 0;
        this.disabled = false;
        this.textColor = Color.parseColor("#5f646e");
        this.selectTextColor = Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
        this.disableTextColor = Color.parseColor("#4c333333");
        initView();
    }

    private GradientDrawable createBackgroundDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("207bb425", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-32768, -110592});
            gradientDrawable.setGradientType(0);
            gradientDrawable.setCornerRadius(zhn.j(50.0f));
            gradientDrawable.setShape(0);
            return gradientDrawable;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(zhn.j(50.0f));
        if (this.mType == 0) {
            gradientDrawable2.setColor(Color.parseColor("#ffecea"));
        } else {
            gradientDrawable2.setColor(Color.parseColor("#f8f7f7"));
        }
        gradientDrawable2.setShape(0);
        return gradientDrawable2;
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.rate_tag_item, this);
        this.layout = (LinearLayout) findViewById(R.id.rate_tag_layout);
        this.tagTitle = (TextView) findViewById(R.id.rate_tag_text);
    }

    public static /* synthetic */ Object ipc$super(RateTagView rateTagView, String str, Object... objArr) {
        if (str.hashCode() == -182681184) {
            return super.onCreateDrawableState(((Number) objArr[0]).intValue());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/widget/RateTagView");
    }

    private void refreshDrawableState(boolean z) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb264ab5", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.layout;
        if (linearLayout != null) {
            linearLayout.setBackground(createBackgroundDrawable(z));
            if (this.disabled) {
                TextView textView = this.tagTitle;
                if (z) {
                    i3 = this.selectTextColor;
                } else {
                    i3 = this.disableTextColor;
                }
                textView.setTextColor(i3);
                setContentDescription(((Object) this.tagTitle.getText()) + "," + dx1.b(R.string.rate_accessibility_not_optional_close));
                return;
            }
            TextView textView2 = this.tagTitle;
            if (z) {
                i = this.selectTextColor;
            } else {
                i = this.textColor;
            }
            textView2.setTextColor(i);
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.tagTitle.getText());
            sb.append(",");
            if (z) {
                i2 = R.string.rate_accessibility_selected_close;
            } else {
                i2 = R.string.rate_accessibility_optional_close;
            }
            sb.append(dx1.b(i2));
            setContentDescription(sb.toString());
        }
    }

    public View getTagView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f398c172", new Object[]{this});
        }
        return this.layout;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue();
        }
        return this.isChecked;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f51c81a0", new Object[]{this, new Integer(i)});
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECK_STATE);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7b2d68", new Object[]{this, new Boolean(z)});
        } else if (this.isChecked != z) {
            this.isChecked = z;
            refreshDrawableState(z);
        }
    }

    public void setDisabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3718d4ef", new Object[]{this, new Boolean(z)});
        } else {
            this.disabled = z;
        }
    }

    public void setSelectTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a94684", new Object[]{this, new Integer(i)});
        } else {
            this.selectTextColor = i;
        }
    }

    public void setText(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0a4103", new Object[]{this, str, new Integer(i)});
            return;
        }
        TextView textView = this.tagTitle;
        if (textView != null) {
            textView.setText(str);
            this.mType = i;
            refreshDrawableState(this.isChecked);
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.textColor = i;
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd1e75db", new Object[]{this});
        } else {
            setChecked(true ^ this.isChecked);
        }
    }

    public RateTagView(Context context, boolean z) {
        super(context);
        this.RATE_TYPE_POSITIVE = 0;
        this.disabled = false;
        this.textColor = Color.parseColor("#5f646e");
        this.selectTextColor = Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
        this.disableTextColor = Color.parseColor("#4c333333");
        initView();
        this.disabled = z;
    }
}
