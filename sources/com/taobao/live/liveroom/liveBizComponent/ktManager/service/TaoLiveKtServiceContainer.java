package com.taobao.live.liveroom.liveBizComponent.ktManager.service;

import androidx.core.graphics.drawable.IconCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtServiceContainer;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.tvr;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/ktManager/service/TaoLiveKtServiceContainer;", "Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtServiceContainer;", "<init>", "()V", "Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;", IconCompat.EXTRA_OBJ, "", "service", "Ltb/xhv;", "registerImpl", "(Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;Ljava/lang/String;)V", "name", "implForService", "(Ljava/lang/String;)Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;", MiPushClient.COMMAND_UNREGISTER, "(Ljava/lang/String;)V", "clearAll", "", "mapper", "Ljava/util/Map;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtServiceContainer implements ITaoLiveKtServiceContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, ITaoLiveKtComponent> mapper = new LinkedHashMap();

    static {
        t2o.a(1010827304);
        t2o.a(1003487274);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtServiceContainer
    public void clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
        } else {
            this.mapper.clear();
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtServiceContainer
    public ITaoLiveKtComponent implForService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtComponent) ipChange.ipc$dispatch("f13d8795", new Object[]{this, str});
        }
        ckf.g(str, "name");
        if (str.length() == 0) {
            return null;
        }
        return this.mapper.get(str);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtServiceContainer
    public void registerImpl(ITaoLiveKtComponent iTaoLiveKtComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a88f50", new Object[]{this, iTaoLiveKtComponent, str});
            return;
        }
        ckf.g(iTaoLiveKtComponent, IconCompat.EXTRA_OBJ);
        ckf.g(str, "service");
        if (!tvr.c(str)) {
            this.mapper.put(str, iTaoLiveKtComponent);
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtServiceContainer
    public void unregister(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e8b9cd", new Object[]{this, str});
            return;
        }
        ckf.g(str, "name");
        if (!tvr.c(str)) {
            this.mapper.remove(str);
        }
    }
}
