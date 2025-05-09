package com.taobao.kmp.live.liveBizComponent.service.biz.topGroup;

import java.io.Serializable;
import kotlin.Metadata;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002JD\u0010\r\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032)\u0010\f\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011RA\u0010\u0019\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountManager;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "", "actionTypeName", "Lkotlin/Function1;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtAccountActionType;", "Lkotlin/ParameterName;", "name", "actionType", "Ltb/xhv;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveAccountActionCallback;", "callback", "buttonClicked", "(Ljava/lang/String;Ltb/g1a;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountViewModel;", "getAccountViewModel", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountViewModel;", "accountViewModel", "viewModel", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveAccountUpdateCallback;", "getAccountViewModelUpdated", "()Ltb/g1a;", "setAccountViewModelUpdated", "(Ltb/g1a;)V", "accountViewModelUpdated", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtAccountManager extends Serializable {
    void buttonClicked(String str, g1a<? super TaoLiveKtAccountActionType, xhv> g1aVar);

    ITaoLiveKtAccountViewModel getAccountViewModel();

    g1a<ITaoLiveKtAccountViewModel, xhv> getAccountViewModelUpdated();

    void setAccountViewModelUpdated(g1a<? super ITaoLiveKtAccountViewModel, xhv> g1aVar);
}
