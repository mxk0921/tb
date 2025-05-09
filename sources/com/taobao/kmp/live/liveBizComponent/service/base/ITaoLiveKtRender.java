package com.taobao.kmp.live.liveBizComponent.service.base;

import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J/\u0010\t\u001a\u00020\b2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtRender;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "", "", "", "data", "template", "Ltb/xhv;", "renderDX", "(Ljava/util/Map;Ljava/lang/String;)V", "M", "renderView", "(Ljava/lang/Object;)V", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtRender extends Serializable {
    void renderDX(Map<String, ? extends Object> map, String str);

    <M> void renderView(M m);
}
