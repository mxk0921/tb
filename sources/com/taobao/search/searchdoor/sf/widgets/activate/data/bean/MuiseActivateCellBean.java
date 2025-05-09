package com.taobao.search.searchdoor.sf.widgets.activate.data.bean;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MuiseActivateCellBean extends ActivateCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MuiseBean muiseBean;

    static {
        t2o.a(815793196);
    }

    public static /* synthetic */ Object ipc$super(MuiseActivateCellBean muiseActivateCellBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/bean/MuiseActivateCellBean");
    }

    public final MuiseBean getMuiseBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("f9f9182d", new Object[]{this});
        }
        MuiseBean muiseBean = this.muiseBean;
        if (muiseBean != null) {
            return muiseBean;
        }
        ckf.y("muiseBean");
        throw null;
    }

    public final void setMuiseBean(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11d3621", new Object[]{this, muiseBean});
            return;
        }
        ckf.g(muiseBean, "<set-?>");
        this.muiseBean = muiseBean;
    }
}
