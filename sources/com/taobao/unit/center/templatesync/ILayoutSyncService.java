package com.taobao.unit.center.templatesync;

import com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ILayoutSyncService {
    void checkSync();

    UnitCenterLayoutInfoModel getLayoutInfoModel(String str, String str2);

    void setUnitCenterLayoutInfoModel(UnitCenterLayoutInfoModel unitCenterLayoutInfoModel);
}
