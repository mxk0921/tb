package com.taobao.tao.topmultitab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import tb.bqa;
import tb.c4b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WrapFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WrapFrameLayout";
    public View targetView;
    public String type;

    static {
        t2o.a(729810411);
    }

    public WrapFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(WrapFrameLayout wrapFrameLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/view/WrapFrameLayout");
    }

    public void addTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bcd400", new Object[]{this});
        } else if (this.targetView == null) {
            bqa.d(TAG, "开始创建视图");
            IHomeSubTabController homeSubTabController = getHomeSubTabController(this.type);
            if (homeSubTabController != null) {
                bqa.d(TAG, "type：" + this.type + ",createView 开始创建");
                this.targetView = homeSubTabController.createView(getContext());
            }
            View view = this.targetView;
            if (view != null && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.targetView.getParent()).removeView(this.targetView);
            }
            addView(this.targetView, -1, -1);
        }
    }

    public IHomeSubTabController getHomeSubTabController(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("f6ed7b88", new Object[]{this, str});
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.getHomeSubTabController(str);
        }
        return null;
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }

    public WrapFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrapFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WrapFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
