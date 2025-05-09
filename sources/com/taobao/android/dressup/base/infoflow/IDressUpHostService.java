package com.taobao.android.dressup.base.infoflow;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;
import tb.cfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IDressUpHostService extends ISubService {
    public static final String SERVICE_NAME = "IDressUpHostService";

    void bindData(View view, BaseSectionModel<?> baseSectionModel);

    double calculateCardExposeRatio(int i);

    View createHostView(ViewGroup viewGroup, int i);

    List<BaseSectionModel> getHostDataSet();

    cfc getInfoFlowContext();

    int getViewType(BaseSectionModel<?> baseSectionModel);

    void notifyDataSetChanged(boolean z);

    void onDressUpInfoFlowCardClicked(JSONObject jSONObject, View view);

    void onScrollStateChanged(ViewGroup viewGroup, int i);

    void onScrolled(ViewGroup viewGroup, int i, int i2);

    void removeSkeletonImage();
}
