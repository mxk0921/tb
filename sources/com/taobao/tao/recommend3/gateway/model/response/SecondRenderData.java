package com.taobao.tao.recommend3.gateway.model.response;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SecondRenderData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public SecondContainerInnerData newface_home_sub;

    static {
        t2o.a(729809707);
    }

    public List<SectionModel> getSections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2802a8bc", new Object[]{this});
        }
        SecondContainerInnerData secondContainerInnerData = this.newface_home_sub;
        if (secondContainerInnerData != null) {
            return secondContainerInnerData.sections;
        }
        return null;
    }
}
