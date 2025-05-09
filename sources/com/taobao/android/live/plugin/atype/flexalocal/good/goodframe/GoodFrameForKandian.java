package com.taobao.android.live.plugin.atype.flexalocal.good.goodframe;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.huk;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.vc;
import tb.wda;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodFrameForKandian extends AbstractGoodFrame implements huk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GoodFrameForKandian";

    static {
        t2o.a(295699011);
        t2o.a(806356110);
        t2o.a(806355016);
        t2o.a(806355884);
    }

    public GoodFrameForKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        super(activity, str, z, tBLiveDataModel, view, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(GoodFrameForKandian goodFrameForKandian, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -1014400728) {
            super.onEvent((String) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodframe/GoodFrameForKandian");
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        sjr.g().a(this);
        if (vc.a() && wda.o().booleanValue()) {
            if (vc.i(this.mContext) || vc.d(this.mContext)) {
                vc.k(this);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame
    public boolean isKandian() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ed4694b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.hide_goods_list.out", "com.taobao.taolive.goods.force_goods_timeout", uyg.EVENT_SHOW_GOODSPACKAGE, "com.taobao.taolive.goods.open.shop_vip"};
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return xea.E(this.mGoodLiveContext);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        goodRelatedInit();
        init();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        sjr.g().b(this);
        vc.l(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.s3c
    public void onEvent(String str, Object obj) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        super.onEvent(str, obj);
        if (str.equals("com.taobao.taolive.room.hide_goods_list.out")) {
            hide();
        } else if ("com.taobao.taolive.goods.open.shop_vip".equals(str) && (obj instanceof LiveItem) && (ext = ((LiveItem) obj).extendVal) != null) {
            showMemberPoplayer(ext.anchorId);
        }
    }

    @Override // tb.huk
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
            return;
        }
        hide();
        this.mGoodsView = null;
    }
}
