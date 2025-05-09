package com.taobao.tao.recommend4.manager;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import java.util.List;
import tb.d11;
import tb.mhd;
import tb.rjj;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface a {

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.recommend4.manager.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0720a {
    }

    DinamicXEngine f();

    int g();

    String getContainerId();

    z4a getContainerType();

    Context getContext();

    JSONObject getExt();

    AwesomeGetPageData getPageParams();

    RecyclerView getRecyclerView();

    void h(JSONObject jSONObject);

    void i();

    boolean isAdaptHudScreen();

    boolean isLastPage();

    void j(JSONObject jSONObject);

    int k();

    void l(rjj rjjVar, JSONObject jSONObject);

    d11 m();

    void n();

    List<SectionModel> o();

    mhd p();
}
