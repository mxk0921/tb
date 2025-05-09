package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface z3d {
    VideoInfo a();

    void b(String str, String str2, String str3);

    void c(String str, String str2, String str3);

    void d(q4q q4qVar);

    void e();

    Object f();

    void mute(boolean z);

    void needPresentAvatarPage(Map<String, String> map);

    void setContainerOffset(JSONObject jSONObject);

    void updateUserTrackData(Map<String, String> map);
}
