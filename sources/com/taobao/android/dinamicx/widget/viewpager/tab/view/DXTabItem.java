package com.taobao.android.dinamicx.widget.viewpager.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXTabItem extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View selectView;
    private boolean selected;
    private View tabView;
    private View unSelectView;

    static {
        t2o.a(444597705);
    }

    public DXTabItem(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(DXTabItem dXTabItem, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/viewpager/tab/view/DXTabItem");
    }

    public View getSelectView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("57fb3380", new Object[]{this});
        }
        return this.selectView;
    }

    public View getUnSelectView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("91699cb9", new Object[]{this});
        }
        return this.unSelectView;
    }

    @Override // android.view.View
    public boolean isSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue();
        }
        return this.selected;
    }

    public void setSelectView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccc29c8", new Object[]{this, view});
        } else if (this.selectView != view) {
            this.selectView = view;
            addView(view);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
            return;
        }
        this.selected = z;
        if (z) {
            View view = this.selectView;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            View view2 = this.unSelectView;
            if (view2 != null) {
                view2.setAlpha(0.0f);
                return;
            }
            return;
        }
        View view3 = this.selectView;
        if (view3 != null) {
            view3.setAlpha(0.0f);
        }
        View view4 = this.unSelectView;
        if (view4 != null) {
            view4.setAlpha(1.0f);
        }
    }

    public void setUnSelectView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae139aaf", new Object[]{this, view});
        } else if (this.unSelectView != view) {
            this.unSelectView = view;
            addView(view);
        }
    }

    public DXTabItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXTabItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    }
}
