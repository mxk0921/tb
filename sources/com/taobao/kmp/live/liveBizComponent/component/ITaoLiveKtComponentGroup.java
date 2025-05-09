package com.taobao.kmp.live.liveBizComponent.component;

import androidx.core.graphics.drawable.IconCompat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponentGroup;", "Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;", IconCompat.EXTRA_OBJ, "Ltb/xhv;", "addComponent", "(Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;)V", "addLazyComponent", "removeComponent", "clearAll", "()V", "", "getComponents", "()Ljava/util/List;", "components", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtComponentGroup extends ITaoLiveKtComponent {
    void addComponent(ITaoLiveKtComponent iTaoLiveKtComponent);

    void addLazyComponent(ITaoLiveKtComponent iTaoLiveKtComponent);

    void clearAll();

    List<ITaoLiveKtComponent> getComponents();

    void removeComponent(ITaoLiveKtComponent iTaoLiveKtComponent);
}
