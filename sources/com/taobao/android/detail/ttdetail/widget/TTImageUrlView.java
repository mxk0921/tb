package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTImageUrlView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile boolean isViewVisible = true;
    private List<a> mVisibilityChangeListeners = new ArrayList(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(TTImageUrlView tTImageUrlView, int i);
    }

    static {
        t2o.a(912262938);
    }

    public TTImageUrlView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TTImageUrlView tTImageUrlView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/TTImageUrlView");
        }
    }

    private boolean isParentNodeHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7162183", new Object[]{this})).booleanValue();
        }
        if (getVisibility() == 8 || getVisibility() == 4) {
            return true;
        }
        ViewParent parent = getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getVisibility() == 8 || view.getVisibility() == 4) {
                return true;
            }
            parent = view.getParent();
        }
        return false;
    }

    private void notifyVisibilityChangeListeners() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a37a3b", new Object[]{this});
            return;
        }
        for (a aVar : this.mVisibilityChangeListeners) {
            if (this.isViewVisible) {
                i = 0;
            } else {
                i = 8;
            }
            aVar.a(this, i);
        }
    }

    public boolean isViewVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5645218e", new Object[]{this})).booleanValue();
        }
        return this.isViewVisible;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        this.isViewVisible = !isParentNodeHide();
        notifyVisibilityChangeListeners();
    }

    public void registerVisibilityChangeListener(a aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374dad9", new Object[]{this, aVar});
            return;
        }
        if (!this.mVisibilityChangeListeners.contains(aVar)) {
            this.mVisibilityChangeListeners.add(aVar);
        }
        if (aVar != null) {
            if (!this.isViewVisible) {
                i = 8;
            }
            aVar.a(this, i);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setVisibility(i);
        if (i != 0) {
            z = false;
        }
        this.isViewVisible = z;
    }

    public void unregisterVisibilityChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ecba660", new Object[]{this, aVar});
        } else {
            this.mVisibilityChangeListeners.remove(aVar);
        }
    }

    public TTImageUrlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TTImageUrlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
