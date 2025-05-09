package com.taobao.relationship.view;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.bu9;
import tb.gt9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FollowButton extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bu9 mConfig;
    private TIconFontTextView mFollowIcon;
    private TextView mFollowText;
    private boolean mIsFollow;

    static {
        t2o.a(759169071);
    }

    public FollowButton(Context context) {
        super(context);
        init();
    }

    private void addFavIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3750b15a", new Object[]{this});
            return;
        }
        this.mFollowIcon = new TIconFontTextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        addView(this.mFollowIcon, layoutParams);
    }

    private void addFavText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277a400e", new Object[]{this});
            return;
        }
        this.mFollowText = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        addView(this.mFollowText, layoutParams);
    }

    private int getBackgroundColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1b181e1", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        if (z) {
            return this.mConfig.m;
        }
        return this.mConfig.n;
    }

    private Drawable getBackgroundDrawble(boolean z) {
        GradientDrawable gradientDrawable;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("adcab840", new Object[]{this, new Boolean(z)});
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        bu9 bu9Var = this.mConfig;
        if (!bu9Var.t || z) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(getBackgroundColor(z));
        } else {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{bu9Var.u, bu9Var.v});
        }
        gradientDrawable.setCornerRadius(getCornerRadius(z));
        int backgroundStrokeSize = getBackgroundStrokeSize(z);
        if (backgroundStrokeSize > 0) {
            if (z) {
                i = this.mConfig.i;
            } else {
                i = this.mConfig.j;
            }
            gradientDrawable.setStroke(backgroundStrokeSize, i);
        }
        return gradientDrawable;
    }

    private int getBackgroundStrokeSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9a1ea3", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        if (z) {
            return this.mConfig.o;
        }
        return this.mConfig.p;
    }

    private float getCornerRadius(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a631c380", new Object[]{this, new Boolean(z)})).floatValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        if (z) {
            return this.mConfig.q;
        }
        return this.mConfig.r;
    }

    private String getFollowIcon(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3978e8d3", new Object[]{this, new Boolean(z)});
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        if (this.mConfig.s) {
            Application application = Globals.getApplication();
            if (z) {
                i = R.string.uik_icon_check;
            } else {
                i = R.string.uik_icon_we;
            }
            return application.getString(i);
        } else if (z) {
            return "";
        } else {
            return Globals.getApplication().getString(R.string.uik_icon_we);
        }
    }

    private String getFollowText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef67b287", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return gt9.TEXT_FOLLOW_DEFAULT;
        }
        return gt9.TEXT_UNFOLLOW_DEFAULT;
    }

    private int getIconPadding(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a3c703e", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        if (z) {
            return this.mConfig.k;
        }
        return this.mConfig.l;
    }

    private int getIconSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3c14f90", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        if (z) {
            return this.mConfig.g;
        }
        return this.mConfig.h;
    }

    private int getLayoutWidth(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b5e0f5a", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        if (z) {
            return this.mConfig.c;
        }
        return this.mConfig.f16638a;
    }

    private int getTextColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("348acfa0", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        if (z) {
            return this.mConfig.i;
        }
        return this.mConfig.j;
    }

    private int getTextSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e888d15c", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        if (z) {
            return this.mConfig.e;
        }
        return this.mConfig.f;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(0);
        setGravity(17);
        addFavIcon();
        addFavText();
        refreshView();
    }

    public static /* synthetic */ Object ipc$super(FollowButton followButton, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/relationship/view/FollowButton");
    }

    private void refreshIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a1f9b9", new Object[]{this, new Boolean(z)});
            return;
        }
        TIconFontTextView tIconFontTextView = this.mFollowIcon;
        if (tIconFontTextView != null) {
            tIconFontTextView.setTextColor(getTextColor(this.mIsFollow));
            this.mFollowIcon.setTextSize(0, getIconSize(this.mIsFollow));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mFollowIcon.getLayoutParams();
            layoutParams.rightMargin = getIconPadding(z);
            this.mFollowIcon.setLayoutParams(layoutParams);
            String followIcon = getFollowIcon(this.mIsFollow);
            if (TextUtils.isEmpty(followIcon)) {
                this.mFollowIcon.setVisibility(8);
                return;
            }
            this.mFollowIcon.setVisibility(0);
            this.mFollowIcon.setText(followIcon);
        }
    }

    private void refreshLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d17c68", new Object[]{this, new Boolean(z)});
            return;
        }
        bu9 bu9Var = this.mConfig;
        refreshLayout(z ? bu9Var.c : bu9Var.f16638a, z ? this.mConfig.d : this.mConfig.b);
        setBackgroundDrawable(getBackgroundDrawble(this.mIsFollow));
    }

    private void refreshText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7baa4185", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.mFollowText;
        if (textView != null) {
            textView.setTextColor(getTextColor(z));
            this.mFollowText.setTextSize(0, getTextSize(z));
            this.mFollowText.setText(getFollowText(z));
        }
    }

    public void initWithConfig(bu9 bu9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2321d428", new Object[]{this, bu9Var});
            return;
        }
        this.mConfig = bu9Var;
        refreshView();
    }

    public void refreshView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbff70d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsFollow = z;
        refreshView();
    }

    public FollowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void refreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979ad0a7", new Object[]{this});
            return;
        }
        if (this.mConfig == null) {
            this.mConfig = new bu9();
        }
        refreshLayout(this.mIsFollow);
        refreshText(this.mIsFollow);
        refreshIcon(this.mIsFollow);
    }

    public FollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void refreshLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c056c94c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams() != null ? getLayoutParams() : new ViewGroup.LayoutParams(i, i2);
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }
}
