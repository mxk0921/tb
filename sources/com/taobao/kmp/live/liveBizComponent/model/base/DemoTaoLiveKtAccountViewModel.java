package com.taobao.kmp.live.liveBizComponent.model.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R2\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/base/DemoTaoLiveKtAccountViewModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/IDemoTaoLiveKtAccountViewModel;", "<init>", "()V", "Ltb/xhv;", "makeData", "", "", "", "originData", "Ljava/util/Map;", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "accountName", "Ljava/lang/String;", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "accountUrl", "getAccountUrl", "setAccountUrl", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DemoTaoLiveKtAccountViewModel implements IDemoTaoLiveKtAccountViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String accountName;
    private String accountUrl;
    private Map<String, ? extends Object> originData;

    static {
        t2o.a(1003487281);
        t2o.a(1003487282);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.IDemoTaoLiveKtAccountViewModel
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        return this.accountName;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.IDemoTaoLiveKtAccountViewModel
    public String getAccountUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbccaa01", new Object[]{this});
        }
        return this.accountUrl;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    public final void makeData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9682b3f", new Object[]{this});
            return;
        }
        setOriginData(a.h());
        setAccountName("主播昵称");
        setAccountUrl("主播头像");
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.IDemoTaoLiveKtAccountViewModel
    public void setAccountName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14d5aa7", new Object[]{this, str});
        } else {
            this.accountName = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.IDemoTaoLiveKtAccountViewModel
    public void setAccountUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b21d95", new Object[]{this, str});
        } else {
            this.accountUrl = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public void setOriginData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371348ec", new Object[]{this, map});
        } else {
            this.originData = map;
        }
    }
}
