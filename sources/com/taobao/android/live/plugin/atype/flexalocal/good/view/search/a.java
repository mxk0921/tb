package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.TaoLiveSearchHistoryView;
import java.util.ArrayList;
import tb.hha;
import tb.ogc;
import tb.p3p;
import tb.pfa;
import tb.q4g;
import tb.t2o;
import tb.th5;
import tb.vac;
import tb.vc;
import tb.xac;
import tb.xea;
import tb.xha;
import tb.yga;
import tb.zda;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends zda<vac> implements TaoLiveSearchHistoryView.b, xac {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public p3p j;
    public final boolean i = yga.K();
    public final String k = yga.c0();

    static {
        t2o.a(295699382);
        t2o.a(295699403);
        t2o.a(295699406);
    }

    public a(xea xeaVar) {
        super(xeaVar);
        this.j = new p3p(xeaVar.i());
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -152613461) {
            super.D((String) objArr[0], (String) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 985537887) {
            super.p();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/search/GoodListSearchPresenter");
        }
    }

    @Override // tb.zda, tb.qac
    public void D(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e74dab", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        super.D(str, str2, i);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str.trim())) {
            q4g.a(((vac) this.f29980a).getContentView(), null);
            this.j.a(str);
            ((vac) this.f29980a).updateHistoryView();
        }
    }

    @Override // tb.zda
    public void O(ArrayList<th5> arrayList, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bd5c19", new Object[]{this, arrayList, new Boolean(z), str});
        } else if (TextUtils.isEmpty(str)) {
            hha.b(GoodListSearchView.TAG, "addBottomSearchEntry | searchKey is empty.");
        } else if (vc.i(this.d.i())) {
            hha.b(GoodListSearchView.TAG, "addBottomSearchEntry | Devices is tablet.");
        } else {
            boolean z2 = this.i;
            if (!z2) {
                hha.b(GoodListSearchView.TAG, "addBottomSearchEntry | enableShowGoodsSearchItem is false.");
            } else if (!z && arrayList != null && z2) {
                JSONObject d = pfa.d(false, str, this.k, l());
                arrayList.add(new th5("10bottomSearchEntry", 10, d, 1000001, 0L));
                hha.b(GoodListSearchView.TAG, "addBottomSearchEntry is success.");
                xha.g(this.d.u(), this.d.g(), d);
            }
        }
    }

    public p3p U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p3p) ipChange.ipc$dispatch("fb463e75", new Object[]{this});
        }
        return this.j;
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ffb5c4", new Object[]{this});
            return;
        }
        p3p p3pVar = this.j;
        if (p3pVar != null) {
            p3pVar.d();
            this.j.e();
        }
        xha.c(this.d.u(), this.d.g());
    }

    @Override // tb.xac
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36586e40", new Object[]{this});
        }
        if (((ogc) this.b).a() == null) {
            return "";
        }
        return ((ogc) this.b).a().pvId;
    }

    @Override // tb.vfa, tb.bdd
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe1d5f", new Object[]{this});
            return;
        }
        super.p();
        p3p p3pVar = this.j;
        if (p3pVar != null) {
            p3pVar.e();
            this.j = null;
        }
    }

    @Override // tb.xac
    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("584b2d0f", new Object[]{this})).intValue();
        }
        return this.e;
    }
}
