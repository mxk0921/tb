package com.ali.user.open.core.webview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliUccCustomToolbar extends Toolbar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;

    static {
        t2o.a(71303259);
    }

    public AliUccCustomToolbar(Context context) {
        super(context);
        resolveAttribute(context, null, R.attr.toolbarStyle);
    }

    public static /* synthetic */ void access$000(AliUccCustomToolbar aliUccCustomToolbar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd7bd03", new Object[]{aliUccCustomToolbar, str});
        } else {
            aliUccCustomToolbar.setCenter(str);
        }
    }

    private void addCenterView(View view) {
        Toolbar.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef6ca70", new Object[]{this, view});
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (Toolbar.LayoutParams) layoutParams2;
        }
        addView(view, layoutParams);
    }

    public static /* synthetic */ Object ipc$super(AliUccCustomToolbar aliUccCustomToolbar, String str, Object... objArr) {
        if (str.hashCode() == 547576538) {
            super.setNavigationIcon((Drawable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/webview/AliUccCustomToolbar");
    }

    private void resolveAttribute(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4665f646", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.Toolbar, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
        if (resourceId != 0) {
            setTitleTextAppearance(context2, resourceId);
        }
        int i2 = this.mTitleTextColor;
        if (i2 != 0) {
            setTitleTextColor(i2);
        }
        obtainStyledAttributes.recycle();
        post(new Runnable() { // from class: com.ali.user.open.core.webview.AliUccCustomToolbar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AliUccCustomToolbar.this.getLayoutParams() instanceof Toolbar.LayoutParams) {
                    ((Toolbar.LayoutParams) AliUccCustomToolbar.this.getLayoutParams()).gravity = 17;
                }
            }
        });
    }

    private void setCenter(String str) {
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj != null && (obj instanceof View)) {
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ActionBar.LayoutParams) {
                    ((ActionBar.LayoutParams) layoutParams).gravity = 17;
                    view.setLayoutParams(layoutParams);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        return this.mTitleText;
    }

    public void setGravityCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaccf708", new Object[]{this});
        } else {
            post(new Runnable() { // from class: com.ali.user.open.core.webview.AliUccCustomToolbar.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AliUccCustomToolbar.access$000(AliUccCustomToolbar.this, "mNavButtonView");
                    AliUccCustomToolbar.access$000(AliUccCustomToolbar.this, "mMenuView");
                }
            });
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20a35ada", new Object[]{this, drawable});
            return;
        }
        super.setNavigationIcon(drawable);
        setGravityCenter();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                TextView textView = new TextView(context);
                this.mTitleTextView = textView;
                textView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                int i2 = this.mTitleTextColor;
                if (i2 != 0) {
                    this.mTitleTextView.setTextColor(i2);
                }
            }
            if (this.mTitleTextView.getParent() != this) {
                addCenterView(this.mTitleTextView);
            }
        } else {
            TextView textView2 = this.mTitleTextView;
            if (textView2 != null && textView2.getParent() == this) {
                removeView(this.mTitleTextView);
            }
        }
        TextView textView3 = this.mTitleTextView;
        if (textView3 != null) {
            textView3.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextAppearance(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6255e9", new Object[]{this, context, new Integer(i)});
            return;
        }
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abcb539c", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTitleTextColor = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    public Toolbar.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar.LayoutParams) ipChange.ipc$dispatch("80f9a630", new Object[]{this});
        }
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public AliUccCustomToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        resolveAttribute(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    public Toolbar.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar.LayoutParams) ipChange.ipc$dispatch("49725631", new Object[]{this, attributeSet});
        }
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(getContext(), attributeSet);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public AliUccCustomToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        resolveAttribute(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    public Toolbar.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Toolbar.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar.LayoutParams) ipChange.ipc$dispatch("224d78c2", new Object[]{this, layoutParams});
        }
        if (layoutParams instanceof Toolbar.LayoutParams) {
            layoutParams2 = new Toolbar.LayoutParams((Toolbar.LayoutParams) layoutParams);
        } else if (layoutParams instanceof ActionBar.LayoutParams) {
            layoutParams2 = new Toolbar.LayoutParams((ActionBar.LayoutParams) layoutParams);
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            layoutParams2 = new Toolbar.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            layoutParams2 = new Toolbar.LayoutParams(layoutParams);
        }
        layoutParams2.gravity = 17;
        return layoutParams2;
    }
}
