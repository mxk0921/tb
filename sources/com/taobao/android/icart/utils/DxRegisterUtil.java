package com.taobao.android.icart.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.event.CartAddOnItemSubscriber;
import com.taobao.android.icart.event.TBSwitchQuantitySubscriber;
import com.taobao.android.icart.widget.DXCartTextInputWidgetNode;
import com.taobao.android.icart.widget.touch.DXCartWrapperFrameLayoutWidgetNode;
import java.util.HashMap;
import tb.ad3;
import tb.ag5;
import tb.aj5;
import tb.bc3;
import tb.ee3;
import tb.fj5;
import tb.hi5;
import tb.ie5;
import tb.ij5;
import tb.j06;
import tb.k06;
import tb.kf5;
import tb.kt5;
import tb.lf5;
import tb.m18;
import tb.mcu;
import tb.mf5;
import tb.mr5;
import tb.nb5;
import tb.nf5;
import tb.nf6;
import tb.ob5;
import tb.of5;
import tb.p38;
import tb.pf5;
import tb.qd3;
import tb.qf5;
import tb.qtd;
import tb.r1s;
import tb.rd3;
import tb.rda;
import tb.rf5;
import tb.s93;
import tb.sc3;
import tb.sf5;
import tb.t2o;
import tb.tf5;
import tb.to8;
import tb.ub3;
import tb.uf5;
import tb.vd5;
import tb.vf5;
import tb.vi5;
import tb.vor;
import tb.w1s;
import tb.w93;
import tb.w9r;
import tb.wf5;
import tb.x93;
import tb.xf5;
import tb.xi5;
import tb.xk6;
import tb.yf5;
import tb.yi5;
import tb.za3;
import tb.zf5;
import tb.zm5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DxRegisterUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150894);
    }

    public static void a(Context context, s sVar, mcu mcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c6aecb", new Object[]{context, sVar, mcuVar});
        } else if (context != null && sVar != null) {
            HashMap<Long, ob5> hashMap = new HashMap<Long, ob5>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil.1
                {
                    put(Long.valueOf(k06.a("goBack")), new rda());
                    put(Long.valueOf((long) xk6.DX_EVENT_ULTRONEVENTDISPATCH), new xk6());
                    put(Long.valueOf((long) kf5.DX_EVENT_CARTBUBBLEAPPEAR), new kf5());
                    put(Long.valueOf((long) xf5.DX_EVENT_CARTSEARCHFOCUS), new xf5());
                    put(Long.valueOf((long) nf6.DX_EVENT_TABSHORIZONTALSCROLL), new nf6());
                    put(Long.valueOf((long) mf5.DX_EVENT_CARTCOUDANANIMATIONFINISH), new mf5());
                    put(Long.valueOf((long) lf5.DX_EVENT_CARTBUBBLEFADEANIMATION), new lf5());
                    put(Long.valueOf((long) nf5.DX_EVENT_CARTELEVATORAPPEAR), new nf5());
                    put(Long.valueOf((long) ag5.DX_EVENT_CARTWRITEBACK), new ag5());
                    put(Long.valueOf((long) j06.DX_EVENT_HANDLEWIDGETEXPOSURE), new j06());
                    put(Long.valueOf((long) uf5.DX_EVENT_CARTPREFETCHZCACHE), new uf5());
                }
            };
            HashMap<Long, nb5> hashMap2 = new HashMap<Long, nb5>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil.2
                {
                    put(Long.valueOf(k06.a(w1s.PARSER_TAG)), new w1s());
                    put(Long.valueOf(k06.a(r1s.PARSER_TAG)), new r1s());
                    put(Long.valueOf((long) aj5.DX_PARSER_CARTISNEWCART2021), new aj5());
                    put(Long.valueOf((long) kt5.DX_PARSER_ULTRONDATAREFERENCE), new kt5());
                    put(Long.valueOf((long) fj5.DX_PARSER_CARTSELECTEDITEMCOUNT), new fj5());
                    put(Long.valueOf((long) xi5.DX_PARSER_CARTFILTERSTATE), new xi5());
                    put(Long.valueOf((long) mr5.DX_PARSER_TABSHORIZONTALOFFSET), new mr5());
                    put(Long.valueOf((long) hi5.DX_PARSER_ARRAY_CREATE), new hi5());
                    put(Long.valueOf((long) yi5.DX_PARSER_CARTGETBUNDLEHEADER), new yi5());
                    put(Long.valueOf((long) vi5.DX_PARSER_CARTEXISTCOMPONENTSBYTAG), new vi5());
                    put(Long.valueOf((long) zm5.DX_PARSER_ISCARTPOPLAYEROPEN), new zm5());
                    put(Long.valueOf((long) ij5.DX_PARSER_CARTCURCATEGORYNAME), new ij5());
                }
            };
            try {
                b(context, sVar);
            } catch (Exception e) {
                ub3.g("DXRegisterWidget", e.getMessage());
            }
            HashMap<String, qtd> hashMap3 = new HashMap<String, qtd>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil.3
                {
                    put("cartShowSku", new rd3());
                    put("downgrade", new za3());
                    put("undowngrade", new ee3());
                    put("manageSwitch", new vor());
                    put(TBSwitchQuantitySubscriber.EVENT_TYPE_SWITCH_QUANTITY, new TBSwitchQuantitySubscriber());
                    put("reQuery", new ad3());
                    put("cartAddonFetch", new CartAddOnItemSubscriber());
                    put("cartAddonAddBag", new CartAddOnItemSubscriber());
                    put("cartAddonOpenUrl", new CartAddOnItemSubscriber());
                    put("cartScrollToFeedflow", new CartAddOnItemSubscriber());
                    put("cartAddonRefresh", new CartAddOnItemSubscriber());
                    put("popupQuery", new sc3());
                    put("addressClick", new x93());
                    put("listToTop", new bc3());
                    put("cartShowIndustrySku", new qd3());
                    put("addOnTabClick", new w93());
                    put(to8.ADD_CART, new s93());
                }
            };
            for (Long l : hashMap.keySet()) {
                sVar.s(l.longValue(), hashMap.get(l));
            }
            for (Long l2 : hashMap2.keySet()) {
                sVar.r(l2.longValue(), hashMap2.get(l2));
            }
            if (mcuVar != null) {
                for (String str : hashMap3.keySet()) {
                    mcuVar.n(str, hashMap3.get(str));
                }
            }
        }
    }

    public static void b(Context context, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9a284e", new Object[]{context, sVar});
        } else if (context != null && sVar != null && sVar.k() != null) {
            DinamicXEngine k = sVar.k();
            k.P0(p38.DXTEXTVIEW_TEXTVIEW, new ie5(context));
            vd5 vd5Var = new vd5();
            k.P0(7700670404894374791L, vd5Var);
            k.P0(w9r.ID, vd5Var);
            HashMap<Long, DXWidgetNode> hashMap = new HashMap<Long, DXWidgetNode>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil.4
                {
                    put(Long.valueOf((long) p38.DXTEXTVIEW_TEXTVIEW), new p38());
                    m18 m18Var = new m18();
                    put(7700670404894374791L, m18Var);
                    put(Long.valueOf((long) w9r.ID), m18Var);
                }
            };
            HashMap<Long, DXWidgetNode> hashMap2 = new HashMap<Long, DXWidgetNode>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil.5
                {
                    put(Long.valueOf((long) of5.DXALIFLOWLAYOUT_ALIFLOWLAYOUT), new of5());
                    put(Long.valueOf((long) tf5.DXCARTNEWTAGFLOWLAYOUT_CARTNEWTAGFLOWLAYOUT), new tf5());
                    put(Long.valueOf((long) vf5.DXCARTPRICEFLOWLAYOUT_CARTPRICEFLOWLAYOUT), new vf5());
                    put(Long.valueOf((long) DXCartTextInputWidgetNode.DXCARTTEXTINPUT_CARTTEXTINPUT), new DXCartTextInputWidgetNode());
                    put(Long.valueOf((long) wf5.DXCARTRICHVIEW_CARTRICHVIEW), new wf5());
                    put(Long.valueOf((long) yf5.DXCARTTEXTSPAN_CARTTEXTSPAN), new yf5());
                    put(Long.valueOf((long) rf5.DXCARTIMAGESPAN_CARTIMAGESPAN), new rf5());
                    put(Long.valueOf((long) qf5.DXCARTFRAMELAYOUT_CARTFRAMELAYOUT), new qf5());
                    put(Long.valueOf((long) DXCartWrapperFrameLayoutWidgetNode.DXCARTWRAPPERFRAMELAYOUT_CARTWRAPPERFRAMELAYOUT), new DXCartWrapperFrameLayoutWidgetNode());
                    put(Long.valueOf((long) zf5.DXCARTTRANSLATABLEFRAMELAYOUT_CARTTRANSLATABLEFRAMELAYOUT), new zf5());
                    put(Long.valueOf((long) sf5.DXCARTLOTTIEVIEW_CARTLOTTIEVIEW), new sf5());
                    put(Long.valueOf((long) pf5.DXCARTFLOWSEPARATORLAYOUT_CARTFLOWSEPARATORLAYOUT), new pf5());
                }
            };
            for (Long l : hashMap2.keySet()) {
                k.e1(l.longValue(), hashMap2.get(l));
            }
            for (Long l2 : hashMap.keySet()) {
                k.Q0(l2.longValue(), hashMap.get(l2));
            }
        }
    }
}
