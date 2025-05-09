package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ApplicationBackgroundChangedDispatcher extends com.taobao.monitor.impl.trace.a<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int B2F = 0;
    public static final int F2B = 1;

    /* compiled from: Taobao */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface Status {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements a.d<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11088a;
        public final /* synthetic */ long b;

        public a(ApplicationBackgroundChangedDispatcher applicationBackgroundChangedDispatcher, int i, long j) {
            this.f11088a = i;
            this.b = j;
        }

        /* renamed from: b */
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b59bb4c4", new Object[]{this, bVar});
            } else {
                bVar.r(this.f11088a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void r(int i, long j);
    }

    public static /* synthetic */ Object ipc$super(ApplicationBackgroundChangedDispatcher applicationBackgroundChangedDispatcher, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/trace/ApplicationBackgroundChangedDispatcher");
    }

    public void e(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd03a40e", new Object[]{this, new Integer(i), new Long(j)});
        } else {
            d(new a(this, i, j));
        }
    }
}
