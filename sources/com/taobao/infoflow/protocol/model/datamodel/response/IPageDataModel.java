package com.taobao.infoflow.protocol.model.datamodel.response;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IPageDataModel extends Serializable {
    String getItemLastCount();

    int getPageNum();

    int getRequestInAdvance();

    boolean isLastPage();

    void setPageNum(int i);
}
