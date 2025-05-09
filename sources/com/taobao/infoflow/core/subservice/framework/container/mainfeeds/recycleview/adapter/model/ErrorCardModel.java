package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ErrorCardModel extends BaseCardModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539678);
    }

    public static /* synthetic */ Object ipc$super(ErrorCardModel errorCardModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/adapter/model/ErrorCardModel");
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.BaseCardModel, com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public String getSectionBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("275317a8", new Object[]{this});
        }
        return "error";
    }
}
