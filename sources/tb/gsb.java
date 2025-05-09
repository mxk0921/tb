package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface gsb {
    List<IDMComponent> getComponents();

    JSONObject getFields();

    String getType();

    void record();

    void rollBack();

    void writeFields(String str, Object obj);
}
