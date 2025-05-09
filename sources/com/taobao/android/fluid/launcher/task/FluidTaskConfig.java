package com.taobao.android.fluid.launcher.task;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FluidTaskConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String THREAD_MODE_BACKGROUND = "background";
    public static final String THREAD_MODE_MAIN = "main";

    /* renamed from: a  reason: collision with root package name */
    public final String f7913a;
    public final long b;
    public final String c;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface ThreadMode {
    }

    static {
        t2o.a(806355089);
    }

    public FluidTaskConfig() {
        this.b = 0L;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return 0;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f7913a + "_" + this.b + "_" + this.c;
    }

    public FluidTaskConfig(String str, long j, String str2) {
        this.f7913a = str;
        this.b = j;
        this.c = str2;
    }
}
