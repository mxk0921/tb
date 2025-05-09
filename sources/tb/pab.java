package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface pab extends sod {
    public static final String CODE_CHANGE_TAB = "changeTab";
    public static final String CODE_STOP = "onStop";
    public static final a Companion = a.$$INSTANCE;
    public static final String METRIC_FIRST_SCREEN = "firstScreen";
    public static final String STAGE_NAV = "biz_nav";
    public static final String STAGE_NAV_PRE = "biz_nav_pre";
    public static final String STAGE_PAGE_CREATE = "page_on_create";
    public static final String STAGE_PAGE_FIRST_FRAME = "first_frame";
    public static final String STAGE_PAGE_RESUME = "page_on_appear";
    public static final String STAGE_PAGE_START = "page_on_start";
    public static final String TAG_END_TYPE = "tab2EndType";
    public static final String TAG_ENGINE_PRELOAD = "enginePreload";
    public static final String TAG_INIT_TAB = "initTab";
    public static final String TAG_TARGET_TAB = "targetTab";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String CODE_CHANGE_TAB = "changeTab";
        public static final String CODE_STOP = "onStop";
        public static final String METRIC_FIRST_SCREEN = "firstScreen";
        public static final String STAGE_NAV = "biz_nav";
        public static final String STAGE_NAV_PRE = "biz_nav_pre";
        public static final String STAGE_PAGE_CREATE = "page_on_create";
        public static final String STAGE_PAGE_FIRST_FRAME = "first_frame";
        public static final String STAGE_PAGE_RESUME = "page_on_appear";
        public static final String STAGE_PAGE_START = "page_on_start";
        public static final String TAG_END_TYPE = "tab2EndType";
        public static final String TAG_ENGINE_PRELOAD = "enginePreload";
        public static final String TAG_INIT_TAB = "initTab";
        public static final String TAG_TARGET_TAB = "targetTab";

        static {
            t2o.a(919601256);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601257);
        }

        public static /* synthetic */ void a(pab pabVar, String str, String str2, String str3, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adb4c903", new Object[]{pabVar, str, str2, str3, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                pabVar.g0(str, str2, str3);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginMetricsSubStageForTask");
            }
        }

        public static /* synthetic */ String b(pab pabVar, String str, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a1ab21ca", new Object[]{pabVar, str, str2, new Integer(i), obj});
            }
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return pabVar.c(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginMetricsTask");
        }

        public static /* synthetic */ void c(pab pabVar, String str, String str2, boolean z, String str3, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95eb3521", new Object[]{pabVar, str, str2, new Boolean(z), str3, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                pabVar.k0(str, str2, z, str3);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endMetricsSubStageForTask");
            }
        }

        public static /* synthetic */ void d(pab pabVar, String str, boolean z, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c1c0f12", new Object[]{pabVar, str, new Boolean(z), str2, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                pabVar.h(str, z, str2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endMetricsTask");
            }
        }

        public static /* synthetic */ String e(pab pabVar, String str, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("78dfbcd7", new Object[]{pabVar, str, new Integer(i), obj});
            }
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return pabVar.I1(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMetricsId");
        }

        public static /* synthetic */ void f(pab pabVar, String str, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1046c560", new Object[]{pabVar, str, str2, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                pabVar.C0(str, str2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordEvent");
            }
        }

        public static /* synthetic */ void g(pab pabVar, String str, Object obj, String str2, int i, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0af888a", new Object[]{pabVar, str, obj, str2, new Integer(i), obj2});
            } else if (obj2 == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                pabVar.n(str, obj, str2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMetricsTagForKey");
            }
        }

        public static /* synthetic */ void h(pab pabVar, boolean z, String str, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3084006a", new Object[]{pabVar, new Boolean(z), str, str2, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                pabVar.j(z, str, str2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopMetrics");
            }
        }
    }

    void C0(String str, String str2);

    void G0(long j);

    String I1(String str);

    void a(String str, boolean z, long j, String str2);

    String c(String str, String str2);

    void g(String str, long j, String str2);

    void g0(String str, String str2, String str3);

    void h(String str, boolean z, String str2);

    void j(boolean z, String str, String str2);

    void k0(String str, String str2, boolean z, String str3);

    void l(String str, boolean z, String str2);

    void m(boolean z, String str, long j, String str2);

    void n(String str, Object obj, String str2);

    IPage o(String str);
}
