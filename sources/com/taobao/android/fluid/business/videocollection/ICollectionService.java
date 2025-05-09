package com.taobao.android.fluid.business.videocollection;

import android.view.View;
import com.taobao.android.fluid.business.videocollection.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.ArrayList;
import tb.iim;
import tb.jz3;
import tb.kon;
import tb.prp;
import tb.sv2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ICollectionService extends FluidService, b {
    public static final String SERVICE_NAME = "ICollectionService";

    /* synthetic */ void cancelPlayCollectionNextVideo();

    boolean checkDialogPopup();

    boolean checkPopupFisrtTime();

    boolean checkResizeVideo();

    boolean checkUseNativePopupCollection();

    /* synthetic */ void clearCollectionNextVideo();

    /* synthetic */ ArrayList getCollectionDataCache(int i);

    /* synthetic */ kon.h getCollectionNextVideo();

    /* synthetic */ int getCollectionTotal();

    jz3 getConfig();

    /* synthetic */ void insertToCollectionDataCacheAndDetailList(kon.h hVar);

    void invalidCollectionCache();

    /* synthetic */ boolean isActiveCardLastCollection();

    boolean isCollectionPage();

    boolean isCollectionScene();

    void openForClick();

    void openForPageEnter();

    /* synthetic */ void playCollectionNextVideo();

    /* synthetic */ void putCollectionDataCache(a aVar);

    /* synthetic */ void requestCollectionNextVideo(String str, a.b bVar);

    /* synthetic */ void setCollectionTotal(int i);

    void setVideoResizeForCollectionPopLayer(FluidContext fluidContext, iim iimVar, View view, prp prpVar);

    /* synthetic */ boolean tryReuseCollectionDataCacheForDetailList(int i, sv2 sv2Var, boolean z);

    void updateCollectionDialog(kon.h hVar);

    /* synthetic */ void updateDetailListAndScrollTo(String str, int i);
}
