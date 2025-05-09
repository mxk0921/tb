package com.taobao.cameralink.miniapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mae;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MiniAppContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isVisible = true;
    private mae visibleListener;

    static {
        t2o.a(394264600);
    }

    public MiniAppContainerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(MiniAppContainerView miniAppContainerView, String str, Object... objArr) {
        if (str.hashCode() == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/cameralink/miniapp/MiniAppContainerView");
    }

    public void addVisibleListener(mae maeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfa0d9c", new Object[]{this, maeVar});
        } else {
            this.visibleListener = maeVar;
        }
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        return this.isVisible;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        try {
            mae maeVar = this.visibleListener;
            if (maeVar != null) {
                if (i == 0) {
                    this.isVisible = true;
                    maeVar.onShow();
                } else {
                    this.isVisible = false;
                    maeVar.onHidden();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public MiniAppContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MiniAppContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
