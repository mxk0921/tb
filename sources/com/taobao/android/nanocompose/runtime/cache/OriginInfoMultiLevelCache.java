package com.taobao.android.nanocompose.runtime.cache;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.a2a;
import tb.ckf;
import tb.fjz;
import tb.jpu;
import tb.t2o;
import tb.ufz;
import tb.v3i;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class OriginInfoMultiLevelCache extends ufz<String, fjz> {
    public static final OriginInfoMultiLevelCache INSTANCE = new OriginInfoMultiLevelCache();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.nanocompose.runtime.cache.OriginInfoMultiLevelCache$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements a2a<Boolean, String, fjz, fjz, String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(5);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/cache/OriginInfoMultiLevelCache$1");
        }

        @Override // tb.a2a
        public /* bridge */ /* synthetic */ xhv invoke(Boolean bool, String str, fjz fjzVar, fjz fjzVar2, String str2) {
            invoke(bool.booleanValue(), str, fjzVar, fjzVar2, str2);
            return xhv.INSTANCE;
        }

        public final void invoke(boolean z, String str, fjz fjzVar, fjz fjzVar2, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f58c227", new Object[]{this, new Boolean(z), str, fjzVar, fjzVar2, str2});
                return;
            }
            ckf.g(str, "key");
            ckf.g(fjzVar, "oldValue");
            System.out.println((Object) ("evicted: " + z + ", key: " + str + ", oldValue: " + fjzVar + ", newValue: " + fjzVar2 + ", businessId: " + ((Object) str2)));
        }
    }

    static {
        t2o.a(598737238);
    }

    public OriginInfoMultiLevelCache() {
        super(100, v3i.f(jpu.a("test", 100)), AnonymousClass1.INSTANCE);
    }
}
