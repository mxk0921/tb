package com.flybird;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBRootFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public OnSizeChangedListener f4956a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnSizeChangedListener {
        void onSizeChanged(int i, int i2, int i3, int i4);
    }

    public FBRootFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(FBRootFrameLayout fBRootFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/flybird/FBRootFrameLayout");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f4956a != null) {
            if (getChildCount() > 0 && getWidth() <= 0 && (i < FBTools.getScreenWidth(getContext()) || i2 < FBTools.getScreenHeight(getContext()))) {
                getChildAt(0).setVisibility(4);
            }
            this.f4956a.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void setOnSizeChangedListener(OnSizeChangedListener onSizeChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae4bb9e8", new Object[]{this, onSizeChangedListener});
        } else {
            this.f4956a = onSizeChangedListener;
        }
    }
}
