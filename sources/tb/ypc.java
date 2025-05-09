package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.litecreator.service.ServiceImpl;
import com.taobao.taopai.material.bean.MaterialDetail;

/* compiled from: Taobao */
@ServiceImpl("com.taobao.android.litecreator.service.impl.MaterialVersionChecker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ypc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(MaterialDetail materialDetail, String str, String str2);

        void b(MaterialDetail materialDetail);
    }

    void check(Context context, int i, JSONObject jSONObject, a aVar);

    void check(Context context, int i, a aVar);
}
