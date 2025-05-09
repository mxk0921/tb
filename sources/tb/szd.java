package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface szd {
    void changeGoldUI(Object obj);

    View getView();

    void hideEntryInnerText();

    boolean isNew();

    void onPause();

    void onResume();

    void reset(String str);

    void setAtmosphere(JSONObject jSONObject);

    void setEntryImage(String str, String str2, boolean z);

    void setEntryText(String str);

    void setProgress(float f);
}
