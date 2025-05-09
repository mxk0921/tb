package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import java.util.Map;
import tb.eti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MemoryDispatcher extends com.taobao.monitor.impl.trace.a<b> implements eti.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void y(long j, long j2, long j3, long j4);
    }

    public MemoryDispatcher() {
        eti.a(15, this);
    }

    public static /* synthetic */ Object ipc$super(MemoryDispatcher memoryDispatcher, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/trace/MemoryDispatcher");
    }

    @Override // tb.eti.a
    public void onEvent(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
        } else if (i == 15) {
            d(new a(this, map));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements a.d<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f11089a;

        public a(MemoryDispatcher memoryDispatcher, Map map) {
            this.f11089a = map;
        }

        /* renamed from: b */
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("655d90c4", new Object[]{this, bVar});
                return;
            }
            Object obj = this.f11089a.get("javaUsed");
            Object obj2 = this.f11089a.get("nativeHeapSize");
            Object obj3 = this.f11089a.get("nativeHeapAllocatedSize");
            Object obj4 = this.f11089a.get("pss");
            if ((obj instanceof Long) && (obj2 instanceof Long) && (obj3 instanceof Long)) {
                bVar.y(((Long) obj).longValue() >> 20, ((Long) obj2).longValue() >> 20, ((Long) obj3).longValue() >> 20, (obj4 instanceof Long ? ((Long) obj4).longValue() : 0L) >> 20);
            }
        }
    }
}
