package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ax extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782474);
    }

    public static /* synthetic */ Object ipc$super(ax axVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/event/AbsOverlayEventHandler");
    }

    public final boolean a(BaseSectionModel baseSectionModel, View view, fl6 fl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b414b408", new Object[]{this, baseSectionModel, view, fl6Var})).booleanValue();
        }
        if (baseSectionModel == null || view == null || !(fl6Var instanceof InfoFlowDxUserContext) || ((InfoFlowDxUserContext) fl6Var).getInfoFlowContext() == null) {
            return false;
        }
        return true;
    }

    public abstract void b(cfc cfcVar, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, View view2);

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r12, java.lang.Object[] r13, com.taobao.android.dinamicx.DXRuntimeContext r14) {
        /*
            r11 = this;
            r0 = 2
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ax.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "f9db7b67"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r11
            r1 = 1
            r4[r1] = r12
            r4[r0] = r13
            r12 = 3
            r4[r12] = r14
            r2.ipc$dispatch(r3, r4)
            return
        L_0x001b:
            if (r13 != 0) goto L_0x001e
            return
        L_0x001e:
            com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel r12 = tb.j18.e(r14)
            com.taobao.android.dinamicx.DXRootView r7 = r14.L()
            tb.fl6 r2 = r14.S()
            boolean r2 = r11.a(r12, r7, r2)
            if (r2 != 0) goto L_0x0031
            return
        L_0x0031:
            int r2 = r13.length
            r3 = 0
            if (r2 <= 0) goto L_0x0046
            r2 = r13[r1]
            boolean r2 = r2 instanceof com.alibaba.fastjson.JSONObject
            if (r2 == 0) goto L_0x0046
            com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel r2 = new com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel
            r1 = r13[r1]
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            r2.<init>(r1)
            r9 = r2
            goto L_0x0047
        L_0x0046:
            r9 = r3
        L_0x0047:
            int r1 = r13.length
            if (r1 <= r0) goto L_0x006c
            r13 = r13[r0]
            boolean r0 = r13 instanceof java.lang.String
            if (r0 == 0) goto L_0x006c
            java.lang.String r13 = (java.lang.String) r13
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x006c
            com.taobao.android.dinamicx.widget.DXWidgetNode r0 = r7.getExpandWidgetNode()
            com.taobao.android.dinamicx.widget.DXWidgetNode r13 = r0.queryWidgetNodeByUserId(r13)
            if (r13 == 0) goto L_0x006c
            com.taobao.android.dinamicx.DXRuntimeContext r13 = r13.getDXRuntimeContext()
            android.view.View r13 = r13.D()
            r10 = r13
            goto L_0x006d
        L_0x006c:
            r10 = r3
        L_0x006d:
            tb.cfc r6 = tb.j18.c(r14)
            if (r6 != 0) goto L_0x0074
            return
        L_0x0074:
            int r13 = com.taobao.taobao.R.id.overlay_dx_engine_tag
            com.taobao.android.dinamicx.DinamicXEngine r14 = r14.r()
            r7.setTag(r13, r14)
            r5 = r11
            r8 = r12
            r5.b(r6, r7, r8, r9, r10)
            tb.hue.c(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ax.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
