package com.taobao.tbpoplayer.watermask;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.a;
import com.alibaba.poplayer.trigger.adapter.TriggerControllerInfoManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.watermask.WaterMaskInfo;
import com.taobao.tbpoplayer.watermask.a;
import tb.a9l;
import tb.q71;
import tb.sv6;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopWaterMaskView extends PopLayerBaseView<View, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_TYPE = "waterMask";
    private a.c mCurMatchSceneResult;

    static {
        t2o.a(790626555);
    }

    public PopWaterMaskView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(PopWaterMaskView popWaterMaskView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 358419887) {
            super.onViewUIAdded();
            return null;
        } else if (hashCode == 571929693) {
            super.init((Context) objArr[0], (Context) ((PopRequest) objArr[1]));
            return null;
        } else if (hashCode == 1890078406) {
            super.destroyView();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tbpoplayer/watermask/PopWaterMaskView");
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        InnerView innerview = this.mInnerView;
        if (innerview != 0 && (innerview instanceof WaterMaskView)) {
            ((WaterMaskView) innerview).destroy();
        }
        q71.c();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public SpannableStringBuilder getInfo() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("e6e304e", new Object[]{this});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (a.m().i() != null) {
            if (a.m().i().useBlackListMode()) {
                str = "黑名单";
            } else {
                str = "白名单";
            }
            sv6.a(spannableStringBuilder, "模式", str, null, null);
        }
        a.c cVar = this.mCurMatchSceneResult;
        if (cVar != null) {
            sv6.a(spannableStringBuilder, "透明度", String.valueOf(cVar.c), null, null);
            WaterMaskInfo.Scene scene = this.mCurMatchSceneResult.b;
            if (scene != null) {
                sv6.a(spannableStringBuilder, "命中业务ID", String.valueOf(scene.matchId), null, null);
            }
        }
        return spannableStringBuilder;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onViewUIAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155d0daf", new Object[]{this});
            return;
        }
        super.onViewUIAdded();
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopWaterMaskView.onViewUIAdded");
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [InnerView, com.taobao.tbpoplayer.watermask.WaterMaskView, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(android.content.Context r6, com.alibaba.poplayer.trigger.a r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tbpoplayer.watermask.PopWaterMaskView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "4406111c"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            super.init(r6, r7)
            tb.a9l r6 = tb.a9l.w()
            boolean r6 = r6.R()
            java.lang.String r2 = ""
            if (r6 != 0) goto L_0x0035
            java.lang.String r6 = "notEnable"
            tb.q71.j(r1, r6)
            com.alibaba.poplayer.track.module.OnePopModule$OnePopLoseReasonCode r6 = com.alibaba.poplayer.track.module.OnePopModule.OnePopLoseReasonCode.OnViewJSClose
            java.lang.String r7 = "initCancel"
            r5.close(r6, r7, r2, r2)
            return
        L_0x0035:
            com.taobao.tbpoplayer.watermask.WaterMaskView r6 = new com.taobao.tbpoplayer.watermask.WaterMaskView
            android.content.Context r3 = r5.getContext()
            r6.<init>(r3)
            java.lang.String r3 = r6.init()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0062
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "initFail-"
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            tb.q71.j(r1, r6)
            com.alibaba.poplayer.track.module.OnePopModule$OnePopLoseReasonCode r6 = com.alibaba.poplayer.track.module.OnePopModule.OnePopLoseReasonCode.OnViewJSClose
            java.lang.String r7 = "waterMaskViewInitError"
            r5.close(r6, r7, r2, r2)
            return
        L_0x0062:
            r5.mInnerView = r6
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r1.<init>(r3, r3)
            r6.setLayoutParams(r1)
            r5.addInnerView()
            r5.setPopRequest(r7)
            r5.displayMe()
            tb.q71.j(r0, r2)
            java.lang.String r6 = "sdkLifeCycle"
            java.lang.String r7 = "PopWaterMaskView.init"
            tb.wdm.g(r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.watermask.PopWaterMaskView.init(android.content.Context, com.alibaba.poplayer.trigger.a):void");
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public boolean shouldViewUIAdd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("312780", new Object[]{this})).booleanValue();
        }
        if (!a9l.w().R()) {
            q71.b(false, "notEnable");
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "isWaterMaskEnable=false", "", "");
            return false;
        }
        a.c q = a.m().q(a.m().i(), TriggerControllerInfoManager.instance().getCurUri(), TriggerControllerInfoManager.instance().getCurActivityInfo());
        this.mCurMatchSceneResult = q;
        boolean z = q.f13431a;
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "PopWaterMaskView.shouldViewUIAdd=" + z);
        ((View) this.mInnerView).setAlpha(((float) q.c) / 100.0f);
        q71.b(z, "");
        if (z) {
            q71.d(q.b, (int) (((View) this.mInnerView).getAlpha() * 100.0f));
        }
        return z;
    }
}
