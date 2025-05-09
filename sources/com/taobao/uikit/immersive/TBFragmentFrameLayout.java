package com.taobao.uikit.immersive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBFragmentFrameLayout extends FrameLayout {
    public TBFragmentFrameLayout(Context context) {
        this(context, null);
    }

    public TBFragmentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBFragmentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.taobao.uikit.immersive.TBFragmentFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c61913e5", new Object[]{this, view, view2});
                } else {
                    TBFragmentFrameLayout.this.requestApplyInsets();
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
