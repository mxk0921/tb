package com.taobao.infoflow.protocol.subservice.base;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;
import tb.rgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IDxItemRenderService extends ISubService, rgc {
    public static final String SERVICE_NAME = "DXService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(DinamicXEngine dinamicXEngine);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void onSuccess();
    }

    /* synthetic */ void bindData(View view, BaseSectionModel baseSectionModel);

    /* synthetic */ View createView(ViewGroup viewGroup, int i);

    void downloadTemplate(List<BaseSectionModel> list, b bVar);

    void downloadTemplateWithoutPrefetch(List<BaseSectionModel> list, b bVar);

    /* synthetic */ int getViewType(BaseSectionModel baseSectionModel);

    void initDx();

    /* synthetic */ void preRender(Context context, BaseSectionModel baseSectionModel, boolean z, int i);

    void reset();

    void setDxCurrentActivity(Activity activity);

    void setDxEngineConfigBuilder(DXEngineConfig.b bVar);

    void setDxEngineDesignScaleEnable(boolean z, boolean z2);

    void setOnDxRegisterListener(a aVar);
}
