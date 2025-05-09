package com.taobao.homepage.dinamic3.preview;

import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.widgetnode.DXMarqueeLayoutWidgetNode;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.am5;
import tb.b06;
import tb.b9b;
import tb.c06;
import tb.d96;
import tb.dg5;
import tb.dra;
import tb.e96;
import tb.em5;
import tb.ez5;
import tb.fqa;
import tb.fz5;
import tb.gan;
import tb.gn5;
import tb.h16;
import tb.h28;
import tb.h96;
import tb.hk5;
import tb.i16;
import tb.iht;
import tb.im5;
import tb.iz5;
import tb.jan;
import tb.km5;
import tb.lc5;
import tb.lp5;
import tb.lq5;
import tb.mm5;
import tb.nj5;
import tb.np5;
import tb.nr5;
import tb.nz5;
import tb.or5;
import tb.po5;
import tb.rcm;
import tb.sm5;
import tb.sy5;
import tb.t2o;
import tb.tl5;
import tb.tz5;
import tb.u9n;
import tb.ub6;
import tb.uqa;
import tb.vl5;
import tb.vy5;
import tb.w18;
import tb.wk5;
import tb.wo5;
import tb.wz5;
import tb.xj5;
import tb.xm5;
import tb.xu5;
import tb.yc0;
import tb.yz5;
import tb.z36;
import tb.z86;
import tb.zp5;
import tb.zpa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HomeDinamicXPreview implements DXTemplatePreviewActivity.DXPreviewInterface, IMTOPDataObject {
    private static s engineRouter = null;

    static {
        t2o.a(729809058);
        t2o.a(444598042);
        t2o.a(589299906);
    }

    public static DinamicXEngine getEngine() {
        try {
            return engineRouter.k();
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private void initPopDxPreview() {
        DinamicXEngine engine = getEngine();
        if (engine != null) {
            rcm.a(engine);
        }
    }

    private void initRecommendDxPreview() {
        DinamicXEngine engine = getEngine();
        if (engine != null) {
            iht.a(engine);
            engine.V0(8281326256809424134L, new tl5());
            engine.V0(-8936854687533104177L, new xm5());
            engine.V0(w18.DX_PARSER_HGETFROMCURRENTMODEL, new w18());
            engine.W0(h28.DX_EVENT_HSETTOCURRENTMODEL, new h28());
        }
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(s sVar) {
        engineRouter = sVar;
        sVar.u(1202423593942681808L, new zpa.a());
        sVar.u(-7577370574697348630L, new gan.a());
        sVar.u(-7752096208734590680L, new u9n.b());
        sVar.u(-8690577844899785500L, new dra.a());
        sVar.u(-6240570111658900479L, new vy5.a());
        sVar.u(ez5.DXHMULTISELECTVIEW_HMULTISELECTVIEW, new ez5.a());
        sVar.u(-3771791355023224372L, new wz5.a());
        sVar.u(jan.d, new jan.b());
        sVar.u(-5996311416603680075L, new yz5.d());
        sVar.u(DXMarqueeLayoutWidgetNode.DXMARQUEELAYOUT_MARQUEELAYOUT, new DXMarqueeLayoutWidgetNode.c());
        sVar.s(34696035233L, new c06());
        sVar.s(37581716043L, new e96());
        sVar.s(d96.DX_EVENT_RTABITEMTAP, new d96());
        sVar.s(5560765727008152586L, new h96());
        sVar.s(6136827152325085276L, new z86());
        sVar.s(-1980042490983877383L, new lc5());
        sVar.s(-4629410644348754929L, new ub6());
        sVar.s(sy5.DX_EVENT_HEDITIONSWITCH, new sy5());
        sVar.s(fz5.DX_EVENT_HOPENPOP, new fz5());
        sVar.s(8520638904096683930L, new tz5());
        sVar.s(-5738105571919564880L, new iz5());
        sVar.s(-279868442483546412L, new dg5());
        sVar.s(b06.DX_EVENT_HTABCLICK, new b06());
        sVar.s(fqa.DX_EVENT_HSAVEDATA, new fqa());
        sVar.s(nz5.DX_EVENT_HSETDATATOMODEL, new nz5());
        sVar.s(i16.DX_EVENT_INSERTCARDS, new i16());
        sVar.s(xu5.DX_EVENT_ELDERTABCLICK, new xu5());
        sVar.r(9422011105736515L, new h16());
        sVar.r(z36.DX_PARSER_MAPTOARRAY, new z36());
        sVar.r(po5.DX_PARSER_NAVEXTHEIGHT, new po5());
        sVar.r(hk5.DX_PARSER_FESTIVAL, new hk5());
        sVar.r(-5348504102650243981L, new xj5());
        sVar.r(9860385864900610L, new wo5());
        sVar.r(1466861815985736590L, new em5());
        sVar.r(5284242828433939926L, new lp5());
        sVar.r(1293712961081187802L, new np5());
        sVar.r(-2517623531547489759L, new lq5());
        sVar.r(zp5.DX_PARSER_REVISIONSWITCH, new zp5());
        sVar.r(-6150397287027100920L, new mm5());
        sVar.r(7444296532363656600L, new wk5());
        sVar.r(nr5.DX_PARSER_TAOBAO_THEME_GET_CURRENT, new nr5());
        sVar.r(or5.DX_PARSER_TAOBAO_THEME_VALID, new or5());
        sVar.r(vl5.DX_PARSER_HGETDATA, new vl5());
        sVar.r(6584495743641924598L, new am5());
        sVar.r(im5.DX_PARSER_HISCLIENTCACHE, new im5());
        sVar.r(6875012019473020234L, new nj5());
        sVar.r(km5.DX_PARSER_HSEARCHBARDATA, new km5());
        sVar.r(sm5.DX_PARSER_HTABCONTENTDISPLAYLAYOUTTYPE, new sm5());
        sVar.r(gn5.DX_PARSER_ISNEWPULL, new gn5());
        if (b9b.h() || b9b.e()) {
            sVar.k().d().b(true, b9b.f());
            sVar.k().l1(TBAutoSizeConfig.x().y());
        }
        try {
            yc0.a(sVar.k());
        } catch (Throwable th) {
            uqa.b("dxInit", "initFowAdDX error", th.getMessage());
        }
        initPopDxPreview();
        initRecommendDxPreview();
    }
}
