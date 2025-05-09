package com.taobao.tab2interact.tabadapter.shortvideo.redpackage;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;
import tb.yfm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RedpackageAdapter$openFakeGuide$1 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Map $entranceStagePop;
    public final /* synthetic */ String $stage;
    public final /* synthetic */ RedpackageAdapter this$0;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tab2interact.tabadapter.shortvideo.redpackage.RedpackageAdapter$openFakeGuide$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tab2interact.tabadapter.shortvideo.redpackage.RedpackageAdapter$openFakeGuide$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class C06691 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C06691() {
                super(1);
            }

            public static /* synthetic */ Object ipc$super(C06691 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/redpackage/RedpackageAdapter$openFakeGuide$1$1$1");
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
                RedpackageAdapter$openFakeGuide$1 redpackageAdapter$openFakeGuide$1 = RedpackageAdapter$openFakeGuide$1.this;
                RedpackageAdapter.P(RedpackageAdapter$openFakeGuide$1.this.this$0, RedpackageAdapter.M(redpackageAdapter$openFakeGuide$1.this$0, redpackageAdapter$openFakeGuide$1.$entranceStagePop, map));
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/redpackage/RedpackageAdapter$openFakeGuide$1$1");
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
            RedpackageAdapter.O(RedpackageAdapter$openFakeGuide$1.this.this$0, false);
            RedpackageAdapter.e0(RedpackageAdapter$openFakeGuide$1.this.this$0);
            RedpackageAdapter.Q(RedpackageAdapter$openFakeGuide$1.this.this$0, new C06691());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpackageAdapter$openFakeGuide$1(RedpackageAdapter redpackageAdapter, String str, Map map) {
        super(1);
        this.this$0 = redpackageAdapter;
        this.$stage = str;
        this.$entranceStagePop = map;
    }

    public static /* synthetic */ Object ipc$super(RedpackageAdapter$openFakeGuide$1 redpackageAdapter$openFakeGuide$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/redpackage/RedpackageAdapter$openFakeGuide$1");
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
        boolean b = ckf.b(map.get("status"), 1);
        RedpackageAdapter.a0(this.this$0, b, this.$stage);
        if (!b) {
            RedpackageAdapter.O(this.this$0, false);
            return;
        }
        RedpackageAdapter.f0(this.this$0);
        RedpackageAdapter.V(this.this$0, yfm.POP_FAKE_GUIDE, this.$entranceStagePop, new AnonymousClass1());
    }
}
