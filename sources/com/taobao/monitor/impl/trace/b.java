package com.taobao.monitor.impl.trace;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import tb.w9a;
import tb.zq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b extends com.taobao.monitor.impl.trace.a<AbstractC0625b> implements ComponentCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements a.d<AbstractC0625b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(b bVar) {
        }

        /* renamed from: b */
        public void a(AbstractC0625b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d06dc8e6", new Object[]{this, bVar});
            } else {
                bVar.onLowMemory();
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.monitor.impl.trace.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface AbstractC0625b {
        void onLowMemory();
    }

    public b() {
        w9a.g().a().registerComponentCallbacks(this);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/trace/ApplicationLowMemoryDispatcher");
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9d403", new Object[]{this});
        } else {
            d(new a(this));
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        zq6.a("ApplicationLowMemory", "onLowMemory");
        e();
    }
}
