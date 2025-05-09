package com.taobao.live.home.widget.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TabItem extends View {
    public final int mCustomLayout;
    public final Drawable mIcon;
    public final CharSequence mText;

    static {
        t2o.a(806355519);
    }

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TabItem);
        this.mText = obtainStyledAttributes.getText(R.styleable.TabItem_android_text);
        this.mIcon = obtainStyledAttributes.getDrawable(R.styleable.TabItem_android_icon);
        this.mCustomLayout = obtainStyledAttributes.getResourceId(R.styleable.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
