package com.taobao.tao.flexbox.layoutmanager.component.bouncy;

import android.content.Context;
import android.view.View;
import android.widget.EdgeEffect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MyEdgeEffect extends EdgeEffect {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View targetView;
    private boolean transmitFling;

    static {
        t2o.a(503316894);
    }

    public MyEdgeEffect(View view, Context context, boolean z) {
        super(context);
        this.targetView = view;
        this.transmitFling = z;
    }

    public static /* synthetic */ Object ipc$super(MyEdgeEffect myEdgeEffect, String str, Object... objArr) {
        if (str.hashCode() == -384781584) {
            super.onAbsorb(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/bouncy/MyEdgeEffect");
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i) {
        TNodeRecyclerView findTargetRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e910b2f0", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.transmitFling) {
            View view = this.targetView;
            if ((view instanceof AbsTNodeScrollView) && (findTargetRecyclerView = ((AbsTNodeScrollView) view).findTargetRecyclerView(view)) != null) {
                findTargetRecyclerView.fling(0, i);
                return;
            }
        }
        super.onAbsorb(i);
    }
}
