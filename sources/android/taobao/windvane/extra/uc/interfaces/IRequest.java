package android.taobao.windvane.extra.uc.interfaces;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IRequest {
    void cancel();

    EventHandler getEventHandler();

    Map<String, String> getHeaders();

    String getMethod();

    Map<String, byte[]> getUploadDataMap();

    Map<String, String> getUploadFileMap();

    long getUploadFileTotalLen();

    String getUrl();

    void setEventHandler(EventHandler eventHandler);
}
