package com.taobao.kmp.live.liveBizComponent.component;

import androidx.core.graphics.drawable.IconCompat;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtServiceContainer;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;", IconCompat.EXTRA_OBJ, "", "service", "Ltb/xhv;", "registerImpl", "(Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;Ljava/lang/String;)V", "name", "implForService", "(Ljava/lang/String;)Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;", MiPushClient.COMMAND_UNREGISTER, "(Ljava/lang/String;)V", "clearAll", "()V", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtServiceContainer extends Serializable {
    void clearAll();

    ITaoLiveKtComponent implForService(String str);

    void registerImpl(ITaoLiveKtComponent iTaoLiveKtComponent, String str);

    void unregister(String str);
}
