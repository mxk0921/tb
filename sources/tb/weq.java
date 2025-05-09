package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.net.ResultException;
import tb.bsj;
import tb.nsj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface weq<REQUEST extends bsj<?, ?, ?>, RESULT extends nsj> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a<RESULT extends nsj> {
        void a(RESULT result);

        void b(RESULT result);

        void c();

        boolean isCancelled();

        void onFinish();
    }

    JSONObject a(JSONObject jSONObject) throws ResultException;

    void b(REQUEST request, a<RESULT> aVar);
}
