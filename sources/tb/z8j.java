package tb;

import java.util.List;
import mtopsdk.mtop.upload.domain.UploadFileInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface z8j {
    void onError(String str, String str2, List<String> list);

    void onFinish(List<UploadFileInfo> list, List<String> list2);

    void onProgress(long j, long j2);

    void onStart();
}
