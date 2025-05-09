package com.taobao.infoflow.protocol.subservice.biz;

import android.os.Bundle;
import android.view.View;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IDxItemClickService extends ISubService {
    public static final String SERVICE_NAME = "DxItemClickService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface OnDxClickNavListener {
        void onNav(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str);

        void onNavFinished(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void click(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        Map<String, String> a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel);
    }

    void addDxClickNavListener(OnDxClickNavListener onDxClickNavListener);

    void addDxItemClickListener(a aVar);

    void addTargetUrlParamsCreator(b bVar);

    String assembleBizParamsToTargetUrl(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, String str);

    void click(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view);

    void onNav(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str);

    void onNavFinished(boolean z);

    void removeDxClickNavListener(OnDxClickNavListener onDxClickNavListener);

    void removeDxItemClickListener(a aVar);

    void removeTargetUrlParamsCreator(b bVar);
}
