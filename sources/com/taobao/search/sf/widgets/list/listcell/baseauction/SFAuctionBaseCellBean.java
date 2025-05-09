package com.taobao.search.sf.widgets.list.listcell.baseauction;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import java.util.Map;
import tb.dhc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SFAuctionBaseCellBean extends BaseCellBean implements dhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AuctionBaseBean auctionBaseBean;
    public boolean canPlay;
    public DynamicCardBean dynamicCardBean;
    public MuiseBean feedbackBean;
    public boolean hasPreRequestDetail = false;
    public JSONObject pageInfo;
    public JSONObject wsData;

    static {
        t2o.a(815793626);
        t2o.a(995098640);
    }

    public static /* synthetic */ Object ipc$super(SFAuctionBaseCellBean sFAuctionBaseCellBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/baseauction/SFAuctionBaseCellBean");
    }

    @Override // tb.dhc
    public Map<String, Object> getCellBehavXData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("69a29f5c", new Object[]{this});
        }
        return null;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.auctionBaseBean.itemId;
    }
}
