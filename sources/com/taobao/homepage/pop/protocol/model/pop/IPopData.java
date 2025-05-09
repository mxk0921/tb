package com.taobao.homepage.pop.protocol.model.pop;

import com.alibaba.fastjson.JSONObject;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import java.io.Serializable;
import java.util.List;
import tb.j3e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IPopData<M extends BasePopSectionModel> extends Serializable {
    M fetchPopSection();

    String getBusinessID();

    JSONObject getClientParams();

    JSONObject getExt();

    JSONObject getPassParam();

    IPopConfig getPopConfig();

    List<M> getSections();

    j3e getUCPConfig();

    JSONObject getUploadData();

    boolean isAllowShow();

    boolean isDeltaRefreshWhiteList(String str);

    boolean isFirstShow();

    boolean isResetShowCount();

    void recordShow();

    void resetShowCount();

    boolean valid();
}
