package com.taobao.tbpoplayer.view;

import android.content.Context;
import android.view.View;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class PopCustomNativeBaseView extends PopLayerBaseView<View, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626512);
    }

    public PopCustomNativeBaseView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(PopCustomNativeBaseView popCustomNativeBaseView, String str, Object... objArr) {
        if (str.hashCode() == 571929693) {
            super.init((Context) objArr[0], (Context) ((PopRequest) objArr[1]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/PopCustomNativeBaseView");
    }

    public abstract View initView(Context context);

    /* JADX WARN: Type inference failed for: r5v3, types: [InnerView, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void init(android.content.Context r5, com.alibaba.poplayer.trigger.a r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = ""
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tbpoplayer.view.PopCustomNativeBaseView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.String r1 = "4406111c"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            r2.ipc$dispatch(r1, r3)
            return
        L_0x001a:
            super.init(r5, r6)
            r4.setPopRequest(r6)
            r4.setClickable(r0)
            r4.setUseTouchIntercept(r0)
            r0 = 4
            r4.setVisibility(r0)
            android.view.View r5 = r4.initView(r5)     // Catch: all -> 0x004d
            r4.mInnerView = r5     // Catch: all -> 0x004d
            if (r5 != 0) goto L_0x0049
            com.alibaba.poplayer.track.module.OnePopModule r5 = r6.k()
            java.lang.String r0 = "false"
            r5.B = r0
            com.alibaba.poplayer.track.module.OnePopModule r5 = r6.k()
            r5.C = r0
            com.alibaba.poplayer.track.module.OnePopModule$OnePopLoseReasonCode r5 = com.alibaba.poplayer.track.module.OnePopModule.OnePopLoseReasonCode.OnViewCustomFilter
            java.lang.String r6 = "CustomViewInitNull"
            r4.close(r5, r6, r1, r1)
            return
        L_0x0049:
            r4.addInnerView()
            return
        L_0x004d:
            r5 = move-exception
            com.alibaba.poplayer.track.module.OnePopModule$OnePopLoseReasonCode r6 = com.alibaba.poplayer.track.module.OnePopModule.OnePopLoseReasonCode.OnViewErrorClose
            java.lang.String r0 = "CustomViewInitError"
            java.lang.String r5 = r5.getMessage()
            r4.close(r6, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.view.PopCustomNativeBaseView.init(android.content.Context, com.alibaba.poplayer.trigger.a):void");
    }
}
