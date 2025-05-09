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
public final class RedpackageAdapter$openResultPackageOnFakeGuides$1 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Map $data;
    public final /* synthetic */ String $stage;
    public final /* synthetic */ RedpackageAdapter this$0;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tab2interact.tabadapter.shortvideo.redpackage.RedpackageAdapter$openResultPackageOnFakeGuides$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
            super(1);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/redpackage/RedpackageAdapter$openResultPackageOnFakeGuides$1$1");
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
            RedpackageAdapter.O(RedpackageAdapter$openResultPackageOnFakeGuides$1.this.this$0, false);
            boolean b = ckf.b(map.get("status"), 1);
            RedpackageAdapter$openResultPackageOnFakeGuides$1 redpackageAdapter$openResultPackageOnFakeGuides$1 = RedpackageAdapter$openResultPackageOnFakeGuides$1.this;
            RedpackageAdapter.b0(redpackageAdapter$openResultPackageOnFakeGuides$1.this$0, redpackageAdapter$openResultPackageOnFakeGuides$1.$stage, b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpackageAdapter$openResultPackageOnFakeGuides$1(RedpackageAdapter redpackageAdapter, String str, Map map) {
        super(1);
        this.this$0 = redpackageAdapter;
        this.$stage = str;
        this.$data = map;
    }

    public static /* synthetic */ Object ipc$super(RedpackageAdapter$openResultPackageOnFakeGuides$1 redpackageAdapter$openResultPackageOnFakeGuides$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/redpackage/RedpackageAdapter$openResultPackageOnFakeGuides$1");
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
        RedpackageAdapter.d0(this.this$0, this.$stage, ckf.b(map.get("status"), 1));
        RedpackageAdapter.c0(this.this$0, this.$stage);
        RedpackageAdapter.V(this.this$0, "guide", this.$data, new AnonymousClass1());
    }
}
