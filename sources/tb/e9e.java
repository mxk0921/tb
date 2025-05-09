package tb;

import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface e9e extends ybc, oib {
    void canPlay(boolean z);

    void registerVideoStatusListener(gbw gbwVar);

    void seekTo(int i);

    void setVideoID(String str);

    void setVideoPlayInfo(String str);

    void setVideoUrl(String str);

    void updateData(JSONObject jSONObject);
}
