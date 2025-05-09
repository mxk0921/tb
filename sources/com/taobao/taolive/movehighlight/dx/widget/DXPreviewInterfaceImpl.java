package com.taobao.taolive.movehighlight.dx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import com.taobao.taolive.dinamicext.dinamicx.DXTBLFllowContentWidgetNode;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import tb.d9m;
import tb.mh6;
import tb.n06;
import tb.nh6;
import tb.p06;
import tb.pm5;
import tb.q06;
import tb.qm5;
import tb.r06;
import tb.rm5;
import tb.s06;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092639);
        t2o.a(444598042);
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe99d8e", new Object[]{this, sVar});
            return;
        }
        sVar.s(p06.DX_EVENT_HIGHLIGHTSCROLLABLEONLOADMORE, new p06());
        sVar.u(DXHighlightScrollableLayoutWidgetNode.DXHIGHLIGHTSCROLLABLELAYOUT_HIGHLIGHTSCROLLABLELAYOUT, new DXHighlightScrollableLayoutWidgetNode.e());
        sVar.u(q06.DXHIGHLIGHTSTRUCTLISTVIEW_HIGHLIGHTSTRUCTLISTVIEW, new q06.a());
        sVar.u(s06.DXHIGLIGHTPLAYERCONTROLLERNEW_HIGLIGHTPLAYERCONTROLLERNEW, new s06.a());
        sVar.u(DXTBLFllowContentWidgetNode.DXTBLFLLOWCONTENT_TBLFLLOWCONTENT, new DXTBLFllowContentWidgetNode.c());
        sVar.r(rm5.DX_PARSER_HIGHLIGHT_STRUCT_JSON_STR, new rm5());
        sVar.s(mh6.DX_EVENT_TBLIVE_TIMESHIFT_CUSTOM, new mh6());
        sVar.s(r06.DX_EVENT_HIGHLIGHTTRACKUTILS, new r06());
        sVar.s(nh6.DX_EVENT_TBLIVE_TIMEMOVE_SECKILL_ITEM_ADD, new nh6());
        sVar.u(n06.DXHIGHLIGHTCONTENTVIEW_HIGHLIGHTCONTENTVIEW, new n06.a());
        sVar.r(qm5.DX_PARSER_HIGHLIGHTSTRTOMAP, new qm5());
        sVar.r(pm5.DX_PARSER_HIGHLIGHTABCONFIG, new pm5());
        d9m.n().getGoodHandlerProxy().d(sVar.k());
        d9m.n().getGoodHandlerProxy().i(sVar.k());
        d9m.n().getGoodHandlerProxy().a(sVar.k());
        d9m.n().getGoodHandlerProxy().b(sVar.k());
    }
}
