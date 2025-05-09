package tb;

import com.taobao.android.abilityidl.ability.AliUploadServiceCompleteResult;
import com.taobao.android.abilityidl.ability.AliUploadServiceProgressResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface jfb extends jdb {
    void X(AliUploadServiceProgressResult aliUploadServiceProgressResult);

    void g0(AliUploadServiceCompleteResult aliUploadServiceCompleteResult);

    void onCancel();
}
