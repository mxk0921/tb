package com.taobao.tab2interact.tabadapter.shortvideo.redpackage;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RedpackageAdapter$showRedpackagePop$2 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ RedpackageAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpackageAdapter$showRedpackagePop$2(RedpackageAdapter redpackageAdapter) {
        super(1);
        this.this$0 = redpackageAdapter;
    }

    public static /* synthetic */ Object ipc$super(RedpackageAdapter$showRedpackagePop$2 redpackageAdapter$showRedpackagePop$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/redpackage/RedpackageAdapter$showRedpackagePop$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map) {
        invoke2(map);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
            return;
        }
        ckf.g(map, AdvanceSetting.NETWORK_TYPE);
        RedpackageAdapter.h0(this.this$0, ckf.b(map.get("status"), 1));
        RedpackageAdapter.O(this.this$0, false);
    }
}
