package com.alibaba.ability.impl.memkvstorage;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class MemStorage$lruMap$2 extends Lambda implements d1a<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MemStorage this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a extends LruCache<String, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(MemStorage$lruMap$2 memStorage$lruMap$2, int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/memkvstorage/MemStorage$lruMap$2$1");
        }

        /* renamed from: a */
        public int sizeOf(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a731ddd8", new Object[]{this, str, obj})).intValue();
            }
            return MemStorage.INSTANCE.d(String.valueOf(obj));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemStorage$lruMap$2(MemStorage memStorage) {
        super(0);
        this.this$0 = memStorage;
    }

    public static /* synthetic */ Object ipc$super(MemStorage$lruMap$2 memStorage$lruMap$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/memkvstorage/MemStorage$lruMap$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final a invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b5c93bd5", new Object[]{this}) : new a(this, 1048576);
    }
}
