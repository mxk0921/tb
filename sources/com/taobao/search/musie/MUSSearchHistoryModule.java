package com.taobao.search.musie;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.a;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import java.util.ArrayList;
import java.util.List;
import tb.ckf;
import tb.q5c;
import tb.t2o;
import tb.zz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MUSSearchHistoryModule extends MUSModule implements a.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a historyManager = new a(this);

    static {
        t2o.a(815792635);
        t2o.a(815793172);
    }

    public MUSSearchHistoryModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSSearchHistoryModule mUSSearchHistoryModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSSearchHistoryModule");
    }

    @MUSMethod
    public final void clearHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dee8e", new Object[]{this});
        } else {
            this.historyManager.j();
        }
    }

    @MUSMethod
    public final void deleteSingleHistory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f247312", new Object[]{this, str});
            return;
        }
        ckf.g(str, q5c.HISTORY);
        this.historyManager.m(str);
    }

    @MUSMethod(uiThread = false)
    public final JSON getHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("42dceb44", new Object[]{this});
        }
        List<ActivateBean> t = this.historyManager.t();
        ckf.d(t);
        List<ActivateBean> list = t;
        ArrayList arrayList = new ArrayList(zz3.q(list, 10));
        for (ActivateBean activateBean : list) {
            arrayList.add(activateBean.keyword);
        }
        Object json = JSON.toJSON(arrayList);
        ckf.e(json, "null cannot be cast to non-null type com.alibaba.fastjson.JSON");
        return (JSON) json;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.a.g
    public void onHistoryDeleted(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89c853", new Object[]{this, historyCellBean});
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.a.g
    public void onHistoryUpdated(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800ee4f5", new Object[]{this, historyCellBean});
        }
    }
}
