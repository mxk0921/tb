package com.ali.user.mobile.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WindowInsetsLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254892);
    }

    public WindowInsetsLinearLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(WindowInsetsLinearLayout windowInsetsLinearLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ui/widget/WindowInsetsLinearLayout");
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsets) ipChange.ipc$dispatch("3481cc96", new Object[]{this, windowInsets});
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }

    public WindowInsetsLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WindowInsetsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.ali.user.mobile.ui.widget.WindowInsetsLinearLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c61913e5", new Object[]{this, view, view2});
                } else {
                    WindowInsetsLinearLayout.this.requestApplyInsets();
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b61353c5", new Object[]{this, view, view2});
                }
            }
        });
    }
}
