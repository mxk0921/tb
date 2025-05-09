package com.taobao.android.meta.srp.ui.list;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SrpStateCell extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001510);
    }

    public static /* synthetic */ Object ipc$super(SrpStateCell srpStateCell, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/srp/ui/list/SrpStateCell");
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    public SrpStateCell copyCellBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SrpStateCell) ipChange.ipc$dispatch("f07ffc8a", new Object[]{this}) : new SrpStateCell();
    }
}
