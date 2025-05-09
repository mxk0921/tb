package com.taobao.search.searchdoor.shop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.shop.ShopSearchHistoryRepo;
import com.taobao.search.searchdoor.shop.ShopSearchHistoryRepo$getAllHistoryData$1;
import java.util.List;
import tb.ckf;
import tb.d1a;
import tb.t0p;
import tb.xhv;
import tb.xpo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ShopSearchHistoryRepo$getAllHistoryData$1 extends xpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopSearchHistoryRepo c;
    public final /* synthetic */ String d;

    public ShopSearchHistoryRepo$getAllHistoryData$1(ShopSearchHistoryRepo shopSearchHistoryRepo, String str) {
        this.c = shopSearchHistoryRepo;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv f(ShopSearchHistoryRepo shopSearchHistoryRepo, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("8ab7e56", new Object[]{shopSearchHistoryRepo, list});
        }
        ckf.g(shopSearchHistoryRepo, "this$0");
        ckf.g(list, "$list");
        if (!ShopSearchHistoryRepo.b(shopSearchHistoryRepo).isEmpty()) {
            ShopSearchHistoryRepo.b(shopSearchHistoryRepo).clear();
        }
        ShopSearchHistoryRepo.b(shopSearchHistoryRepo).addAll(list);
        ShopSearchHistoryRepo.e(shopSearchHistoryRepo);
        return xhv.INSTANCE;
    }

    public static /* synthetic */ Object ipc$super(ShopSearchHistoryRepo$getAllHistoryData$1 shopSearchHistoryRepo$getAllHistoryData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/shop/ShopSearchHistoryRepo$getAllHistoryData$1");
    }

    @Override // tb.xpo
    public void c() {
        final List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        String c = ShopSearchHistoryRepo.c(this.c).c(this.d);
        if (c != null) {
            final ShopSearchHistoryRepo shopSearchHistoryRepo = this.c;
            try {
                list = JSON.parseArray(t0p.a(c), ActivateBean.class);
            } catch (JSONException unused) {
                list = null;
            }
            if (list != null) {
                ShopSearchHistoryRepo.d(shopSearchHistoryRepo, new d1a() { // from class: tb.znz
                    @Override // tb.d1a
                    public final Object invoke() {
                        xhv f;
                        f = ShopSearchHistoryRepo$getAllHistoryData$1.f(ShopSearchHistoryRepo.this, list);
                        return f;
                    }
                });
            }
        }
    }
}
