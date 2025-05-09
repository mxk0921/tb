package com.taobao.tao.infoflow.multitab;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.d9j;
import tb.fuq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SubWrapFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MultiSubWrapFrameLayout";
    private final Context mContext;
    private final int mPosition;
    private View mTargetView;

    static {
        t2o.a(729809460);
    }

    public SubWrapFrameLayout(Context context, int i) {
        super(context);
        this.mContext = context;
        this.mPosition = i;
    }

    public static /* synthetic */ Object ipc$super(SubWrapFrameLayout subWrapFrameLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/SubWrapFrameLayout");
    }

    public void addTabView(fuq fuqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e6f53a", new Object[]{this, fuqVar, str});
        } else if (this.mTargetView == null) {
            d9j.c(TAG, "SubWrapFrameLayout ->  开始创建视图 调用createView :" + this.mPosition);
            View d = fuqVar.d(this.mPosition, this.mContext, str);
            this.mTargetView = d;
            if (d.getParent() != null && (this.mTargetView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.mTargetView.getParent()).removeView(this.mTargetView);
            }
            addView(this.mTargetView, -1, -1);
            fuqVar.c(this.mPosition, this);
        }
    }

    public boolean isRealView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65b716b8", new Object[]{this})).booleanValue();
        }
        if (getChildCount() > 0) {
            return true;
        }
        return false;
    }
}
