package com.taobao.search.infoflow;

import android.view.View;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface a {

    /* compiled from: Taobao */
    /* renamed from: com.taobao.search.infoflow.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0651a {
        void a(String str);

        void b(SearchChildRecyclerView searchChildRecyclerView);

        void onSuccess();
    }

    View a(JSONObject jSONObject, AbstractC0651a aVar);

    void c(JSONObject jSONObject, boolean z);

    void destroy();
}
