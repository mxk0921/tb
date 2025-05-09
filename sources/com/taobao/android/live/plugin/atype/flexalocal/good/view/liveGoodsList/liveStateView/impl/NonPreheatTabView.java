package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.GoodsLiveStateListAdapter2;
import java.util.ArrayList;
import java.util.List;
import tb.a4s;
import tb.hha;
import tb.ibc;
import tb.ktg;
import tb.pfa;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.tmm;
import tb.uf3;
import tb.v0d;
import tb.wga;
import tb.x4h;
import tb.xea;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NonPreheatTabView extends SingleTabBaseView<ibc> implements v0d, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NonPreheatTabView";

    static {
        t2o.a(295699352);
        t2o.a(295699336);
        t2o.a(806355016);
    }

    public NonPreheatTabView(xea xeaVar, ItemCategory itemCategory, GoodsLiveStateMutitabView.c cVar, boolean z) {
        super(xeaVar, itemCategory, cVar, z);
        Context context;
        xea xeaVar2 = this.mGoodLiveContext;
        if (xeaVar2 == null) {
            context = null;
        } else {
            context = xeaVar2.i();
        }
        a4s.b(context, sjr.g(), this);
    }

    public static /* synthetic */ Object ipc$super(NonPreheatTabView nonPreheatTabView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -558272972) {
            super.resume();
            return null;
        } else if (hashCode == 986833476) {
            super.showPackage(((Boolean) objArr[0]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/NonPreheatTabView");
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView
    public void checkNeedCompensate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6645987", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            ((ibc) this.mPresenter).c(i, i2, i3);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView
    public AbstractGoodsRecyclerAdapter constructAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractGoodsRecyclerAdapter) ipChange.ipc$dispatch("50e0e495", new Object[]{this});
        }
        return new GoodsLiveStateListAdapter2(this.mGoodLiveContext, this.mItemCategory, new ArrayList(), this.mListView);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        sjr.g().b(this);
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.goodlist.timepoint.asked.inner", "com.taobao.taolive.hide.member.identification.inner", "com.taobao.taolive.room.goodlist.all.refresh.item.inner", "com.taobao.taolive.live.state.refresh.current.tab.inner", "com.taobao.taolive.goods.add.top.interact.banner", "com.taobao.taolive.room.gl.refresh.topright", "com.taobao.taolive.room.gl.refresh.showinglist"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return xea.E(this.mGoodLiveContext);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r7.equals("com.taobao.taolive.room.goodlist.timepoint.asked.inner") == false) goto L_0x0023;
     */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.NonPreheatTabView.onEvent(java.lang.String, java.lang.Object):void");
    }

    public void recoverFromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52b4c7f", new Object[]{this});
        } else {
            ((ibc) this.mPresenter).i();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        super.resume();
        if (yga.T()) {
            ((ibc) this.mPresenter).r();
        }
        if (yga.S()) {
            ibc ibcVar = (ibc) this.mPresenter;
            ibcVar.e(this.mListView.getCurrentShowItemList(ibcVar.o()));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView
    public void showPackage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad1e244", new Object[]{this, new Boolean(z)});
            return;
        }
        super.showPackage(z);
        ((ibc) this.mPresenter).B();
        ((ibc) this.mPresenter).r();
        ((ibc) this.mPresenter).d();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public ibc initInjector() {
        wga wgaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ibc) ipChange.ipc$dispatch("7066c71a", new Object[]{this});
        }
        hha.c(TAG, "initInjector | tabName=" + this.tabName + " categoryId=" + this.categoryId);
        if (pfa.B(this.tabName, this.categoryId)) {
            wgaVar = new ktg(this.mGoodLiveContext, this.mItemCategory);
        } else if (this.mItemCategory.isPreheatTab()) {
            wgaVar = new tmm(this.mGoodLiveContext, this.mItemCategory);
        } else {
            wgaVar = new uf3(this.mGoodLiveContext, this.mItemCategory);
        }
        wgaVar.Z(this.tabName, this.categoryId, this.categoryType);
        return wgaVar;
    }

    @Override // tb.v0d
    public void moveToTargetItem(String str) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88480a21", new Object[]{this, str});
            return;
        }
        List<x4h> N = this.mGoodsLiveStateListAdapter.N();
        if (!(TextUtils.isEmpty(str) || N == null || N.isEmpty())) {
            for (x4h x4hVar : N) {
                if (x4hVar == null || !TextUtils.equals(str, x4hVar.e)) {
                    i2++;
                } else {
                    if (i2 > 2) {
                        i = i2 + 1;
                        if (N.size() <= i) {
                            i = i2;
                        }
                        if (N.size() > 2 + i2) {
                            i++;
                        }
                    } else {
                        i = i2;
                    }
                    hha.c(TAG, "moveToTargetItem | itemId=" + str + "   pos=" + i2);
                    this.mListView.scrollToPosition(i);
                    return;
                }
            }
        }
    }
}
