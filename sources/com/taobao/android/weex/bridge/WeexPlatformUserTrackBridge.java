package com.taobao.android.weex.bridge;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.util.WeexAppMonitor$Avail$Point;
import com.taobao.android.weex.util.WeexAppMonitor$Performance$Point;
import java.io.Serializable;
import tb.dwh;
import tb.hxh;
import tb.t2o;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexPlatformUserTrackBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;
        public final /* synthetic */ WeexValue e;
        public final /* synthetic */ WeexValue f;

        public a(int i, WeexValue weexValue, WeexValue weexValue2) {
            this.d = i;
            this.e = weexValue;
            this.f = weexValue2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/bridge/WeexPlatformUserTrackBridge$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WeexAppMonitor$Performance$Point fromInt = WeexAppMonitor$Performance$Point.fromInt(this.d);
            if (fromInt != null) {
                fromInt.commit(this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;
        public final /* synthetic */ WeexValue e;

        public b(int i, WeexValue weexValue) {
            this.d = i;
            this.e = weexValue;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/bridge/WeexPlatformUserTrackBridge$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WeexAppMonitor$Avail$Point fromInt = WeexAppMonitor$Avail$Point.fromInt(this.d);
            if (fromInt != null) {
                fromInt.commitSuccess(this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;
        public final /* synthetic */ WeexValue e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        public c(int i, WeexValue weexValue, String str, String str2) {
            this.d = i;
            this.e = weexValue;
            this.f = str;
            this.g = str2;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/bridge/WeexPlatformUserTrackBridge$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WeexAppMonitor$Avail$Point fromInt = WeexAppMonitor$Avail$Point.fromInt(this.d);
            if (fromInt != null) {
                fromInt.commitFail(this.e, this.f, this.g);
            }
        }
    }

    static {
        t2o.a(982515852);
    }

    public static void AppMonitorCommitAvailableFail(int i, WeexValue weexValue, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eec6cfb", new Object[]{new Integer(i), weexValue, str, str2});
            return;
        }
        try {
            hxh.b(new c(i, weexValue, str, str2));
        } catch (Throwable th) {
            dwh.i(th);
        }
    }

    public static void AppMonitorCommitAvailableSuccess(int i, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c482637a", new Object[]{new Integer(i), weexValue});
            return;
        }
        try {
            hxh.b(new b(i, weexValue));
        } catch (Throwable th) {
            dwh.i(th);
        }
    }

    public static void AppMonitorCommitPerformance(int i, WeexValue weexValue, WeexValue weexValue2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c1577c", new Object[]{new Integer(i), weexValue, weexValue2});
            return;
        }
        try {
            hxh.b(new a(i, weexValue, weexValue2));
        } catch (Throwable th) {
            dwh.i(th);
        }
    }
}
