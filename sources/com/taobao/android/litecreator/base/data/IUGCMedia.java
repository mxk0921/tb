package com.taobao.android.litecreator.base.data;

import android.net.Uri;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import java.io.Serializable;
import java.util.List;
import tb.ptc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IUGCMedia extends IWorkflowData, ptc, Serializable {
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_VIDEO = 2;

    @Override // tb.ptc
    /* synthetic */ void addExtraInfoMeta(String str, Serializable serializable);

    void appendImage(UGCImage uGCImage);

    void appendVideo(UGCVideo uGCVideo);

    UGCBiz getBiz();

    List<UGCImage> getImages();

    @Override // tb.ptc
    /* synthetic */ Object getMeta(String str);

    String getPublishSessionId();

    int getType();

    List<UGCVideo> getVideos();

    void initPublishSessionId(Uri uri);

    /* synthetic */ Object makeCopy();

    @Override // tb.ptc
    /* synthetic */ void removeExtraInfoMeta(String str);

    void removeImage(UGCImage uGCImage);

    void resetMedia();

    void setBiz(UGCBiz uGCBiz);

    @Override // tb.ptc
    /* synthetic */ void setMeta(String str, Serializable serializable);

    void setPublishSessionId(String str);

    void setType(int i);

    /* synthetic */ MediaStatInfo statInfo();

    /* synthetic */ MediaStatInfo statInfo(String str);

    void swapImage(int i, int i2);
}
