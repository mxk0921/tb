package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.cll;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PageLeaveDispatcher extends com.taobao.monitor.impl.trace.a<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BACK = -4;
    public static final int TYPE_F2B = -3;
    public static final int TYPE_JUMP_NEXT_PAGE = -5;

    /* compiled from: Taobao */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface PageLeaveType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements a.d<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cll f11090a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;

        public a(PageLeaveDispatcher pageLeaveDispatcher, cll cllVar, int i, long j) {
            this.f11090a = cllVar;
            this.b = i;
            this.c = j;
        }

        /* renamed from: b */
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6238cd12", new Object[]{this, bVar});
            } else {
                bVar.z(this.f11090a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void z(cll cllVar, int i, long j);
    }

    public static /* synthetic */ Object ipc$super(PageLeaveDispatcher pageLeaveDispatcher, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/trace/PageLeaveDispatcher");
    }

    public void e(cll cllVar, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f3019a", new Object[]{this, cllVar, new Integer(i), new Long(j)});
        } else {
            d(new a(this, cllVar, i, j));
        }
    }
}
