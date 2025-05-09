package com.taobao.android.detail.alittdetail.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.transfer.widget.AliDetailScrollerLayoutWidgetNode;
import com.taobao.android.detail.ttdetail.transfer.widget.DXDetailProfitAnimLayoutWidgetNode;
import com.taobao.android.dinamicx.s;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.oversea.baobao.view.DXProgress;
import tb.eu5;
import tb.gu5;
import tb.ln5;
import tb.mn5;
import tb.q3z;
import tb.sn5;
import tb.t2o;
import tb.tj5;
import tb.xg7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailDXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = TTDetailDXPreviewInterfaceImpl.class.getSimpleName();

    static {
        t2o.a(354418742);
        t2o.a(444598042);
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe99d8e", new Object[]{this, sVar});
            return;
        }
        LogUtils.f(TAG, "反射调用previewEngineDidInitialized", new Object[0]);
        sVar.r(mn5.DX_PARSER_ITEMSUPPORT, new mn5());
        sVar.r(tj5.Companion.a(), new tj5());
        sVar.r(sn5.DX_PARSER_KVSTORAGEGETITEM, new sn5());
        sVar.u(xg7.VIEW_IDENTITY, new xg7.c());
        sVar.u(gu5.DETAIL_WIDGET_ID, new gu5.a());
        sVar.u(q3z.DXDETAILPRICEANIMVIEW_DETAILPRICEANIMVIEW, new q3z.a());
        sVar.u(DXDetailProfitAnimLayoutWidgetNode.DXDETAILPROFITANIMLAYOUT_DETAILPROFITANIMLAYOUT, new DXDetailProfitAnimLayoutWidgetNode.e());
        sVar.u(AliDetailScrollerLayoutWidgetNode.DX_WIDGET_ID, new AliDetailScrollerLayoutWidgetNode.b());
        sVar.u(eu5.VIEW_IDENTITY, new eu5.a());
        sVar.u(DXProgress.DXTMGBAOBAOPROGRESS_TMGBAOBAOPROGRESS, new DXProgress());
        sVar.r(ln5.DX_PARSER_ITEMINFO, new ln5());
    }
}
