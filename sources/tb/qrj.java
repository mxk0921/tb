package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.net.ResultException;
import tb.bsj;
import tb.nsj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface qrj<REQUEST extends bsj<?, ?, ?>, RESULT extends nsj> {
    JSONObject a(JSONObject jSONObject) throws ResultException;

    RESULT b(REQUEST request);

    RESULT c(REQUEST request, fsj fsjVar);
}
