package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IExposeItemFilterService extends ISubService {
    public static final String SERVICE_NAME = "IRedundantItemFilterService";

    void addExposeItem(BaseSectionModel baseSectionModel);
}
