package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IWindVaneService extends ISubService {
    public static final String SERVICE_NAME = "WindVaneService";

    long getLastInsertTime();

    List<String> getWindVaneExposedItemKeys();

    boolean hasWindVaneParams();

    boolean isWindVaneCard(BaseSectionModel<?> baseSectionModel);

    void updateWindVaneClick(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel);
}
