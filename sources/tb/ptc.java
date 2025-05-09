package tb;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ptc {
    void addExtraInfoMeta(String str, Serializable serializable);

    <T> T getMeta(String str);

    void removeExtraInfoMeta(String str);

    void setMeta(String str, Serializable serializable);
}
