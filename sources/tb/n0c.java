package tb;

import com.taobao.android.abilityidl.ability.DownloaderCompleteResult;
import com.taobao.android.abilityidl.ability.DownloaderProgressResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface n0c extends jdb {
    void N0(DownloaderCompleteResult downloaderCompleteResult);

    void onCancel();

    void w0(DownloaderProgressResult downloaderProgressResult);
}
