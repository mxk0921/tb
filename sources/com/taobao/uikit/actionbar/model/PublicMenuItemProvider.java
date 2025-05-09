package com.taobao.uikit.actionbar.model;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import tb.dbv;
import tb.ff3;
import tb.mop;
import tb.t2o;
import tb.tn1;
import tb.to8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PublicMenuItemProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(927989840);
    }

    public static TBPublicMenuItem provide(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("4a3e7071", new Object[]{new Integer(i)});
        }
        TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
        int i2 = R.id.uik_menu_wangxin;
        if (i == i2) {
            builder.setTitle("ꂊ:" + Localization.q(R.string.app_message)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName(tn1.KEY_SHARE_CONFIG_WANGXIN).setOrder(2).setNavUrl("http://m.taobao.com/go/msgcentercategory").setNeedLogin(true).setName(tn1.KEY_SHARE_CONFIG_WANGXIN).setOldControlName(mop.KEY_WANG_WANG).setSource(1).setType(4).setId(i2);
        } else {
            int i3 = R.id.uik_menu_home;
            if (i == i3) {
                builder.setTitle("ꀚ:" + Localization.q(R.string.taobao_app_1012_1_16470)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("Home").setName("Home").setOrder(3).setNavUrl("http://m.taobao.com/index.htm").setNeedLogin(false).setOldControlName("Home").setSource(1).setType(4).setId(i3);
            } else {
                int i4 = R.id.uik_menu_mytaobao;
                if (i == i4) {
                    builder.setTitle("ꁚ:" + Localization.q(R.string.taobao_app_1012_1_16463)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("Mytaobao").setOrder(4).setName("Mytaobao").setNavUrl("https://h5.m.taobao.com/awp/mtb/mtb.htm").setNeedLogin(true).setOldControlName("mytaobao").setSource(1).setType(4).setId(i4);
                } else {
                    int i5 = R.id.uit_menu_shopping_cart;
                    if (i == i5) {
                        builder.setTitle("ꁊ:" + Localization.q(R.string.app_cart)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("ShoppingCart").setName("ShoppingCart").setOrder(5).setNavUrl("https://main.m.taobao.com/cart/index.html?hasback=true").setNeedLogin(true).setOldControlName("mycart").setSource(1).setType(4).setId(i5);
                    } else {
                        int i6 = R.id.uik_menu_orderList;
                        if (i == i6) {
                            builder.setTitle("錄:" + Localization.q(R.string.taobao_app_1012_1_16464)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName(dbv.BIZ_ORDER_LIST).setName(dbv.BIZ_ORDER_LIST).setOrder(6).setNavUrl(ff3.ORDER_LIST_ALL).setNeedLogin(true).setOldControlName(dbv.BIZ_ORDER_LIST).setSource(1).setType(4).setId(i6);
                        } else {
                            int i7 = R.id.uik_menu_footpoint;
                            if (i == i7) {
                                builder.setTitle("녊:" + Localization.q(R.string.taobao_app_1012_1_16465)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("FootPoint").setName("FootPoint").setOrder(7).setNavUrl("https://web.m.taobao.com/app/message-social-front/footprint/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_statusbar_hidden=true").setNeedLogin(true).setOldControlName("footPoint").setSource(1).setType(4).setId(i7);
                            } else {
                                int i8 = R.id.uik_menu_service;
                                if (i == i8) {
                                    builder.setTitle("떊:" + Localization.q(R.string.taobao_app_1012_1_16461)).setMessageMode(TBPublicMenuItem.MessageMode.TEXT).setUTControlName("help").setName("help").setOrder(1).setNavUrl("https://ai.alimebot.taobao.com/intl/index.htm?from=ggxyKH67aq&amp;sourceType=SUPERME").setNeedLogin(true).setOldControlName("handService").setSource(1).setType(8).setId(i8);
                                } else {
                                    int i9 = R.id.uik_menu_feedback;
                                    if (i == i9) {
                                        builder.setTitle("\uf87a:" + Localization.q(R.string.taobao_app_1012_1_16467)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("feedback").setName("feedback").setOrder(2).setNavUrl("https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html#/?x=1").setNeedLogin(true).setOldControlName("Feedback").setSource(1).setType(8).setId(i9);
                                    } else {
                                        int i10 = R.id.uik_menu_report;
                                        if (i == i10) {
                                            builder.setTitle("킊:" + Localization.q(R.string.taobao_app_1012_1_16460)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("report").setName("report").setOrder(3).setNavUrl("https://market.m.taobao.com/app/msd/buyer-aqcenter/index.html?source=271#/report-center/").setNeedLogin(true).setSource(1).setType(8).setOldControlName("report").setId(i10);
                                        } else {
                                            int i11 = R.id.uik_menu_favor;
                                            if (i == i11) {
                                                builder.setTitle("뀚:" + Localization.q(R.string.taobao_app_1012_1_16471)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName(to8.FAVOR).setName(to8.FAVOR).setOrder(2).setNavUrl("https://web.m.taobao.com/app/message-social-front/itao-favor-weex2/index?wh_weex=true&weex_mode=dom&wx_statusbar_hidden=true&wx_navbar_hidden=true&collection_source=global_navigation").setNeedLogin(true).setSource(1).setType(8).setId(i11);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return builder.build();
    }
}
