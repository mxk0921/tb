package tb;

import android.content.Context;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface w9z {
    void addImageTask(Context context, boolean z, String str, int i, String str2, t1e t1eVar);

    void addVideoTask(Context context, boolean z, String str, String str2, String str3, int i, String str4, String str5, String str6, Map<String, Object> map, t1e t1eVar);

    void cancelTask(String str);

    void destroy();

    void setImageCompressMinSide(int i);

    void setImageCompressQuality(int i);
}
