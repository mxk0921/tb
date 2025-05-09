package com.taobao.android.appdevtools.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.qqt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ExecutorService;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DevToolsCoreImpl$executor$2 extends Lambda implements d1a<ExecutorService> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DevToolsCoreImpl$executor$2 INSTANCE = new DevToolsCoreImpl$executor$2();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // tb.qqt
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "DevToolsCore";
        }
    }

    public DevToolsCoreImpl$executor$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(DevToolsCoreImpl$executor$2 devToolsCoreImpl$executor$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/internal/DevToolsCoreImpl$executor$2");
    }

    @Override // tb.d1a
    public final ExecutorService invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("ae15217c", new Object[]{this}) : VExecutors.newSingleThreadExecutor(a.INSTANCE);
    }
}
