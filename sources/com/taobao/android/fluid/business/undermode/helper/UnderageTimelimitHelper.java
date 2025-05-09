package com.taobao.android.fluid.business.undermode.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.undermode.IUnderageModeService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.CommonResponseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a07;
import tb.ckf;
import tb.f7l;
import tb.ir9;
import tb.kgv;
import tb.lgv;
import tb.mgv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class UnderageTimelimitHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UnderageModeHelper";
    public static final UnderageTimelimitHelper INSTANCE = new UnderageTimelimitHelper();

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f7683a = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class UnderageModeRequestInfo implements IMTOPDataObject {
        private final String API_NAME;
        private final String VERSION;

        static {
            t2o.a(468713549);
            t2o.a(589299906);
        }

        public UnderageModeRequestInfo() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ UnderageModeRequestInfo copy$default(UnderageModeRequestInfo underageModeRequestInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = underageModeRequestInfo.API_NAME;
            }
            if ((i & 2) != 0) {
                str2 = underageModeRequestInfo.VERSION;
            }
            return underageModeRequestInfo.copy(str, str2);
        }

        public final String component1() {
            return this.API_NAME;
        }

        public final String component2() {
            return this.VERSION;
        }

        public final UnderageModeRequestInfo copy(String str, String str2) {
            ckf.g(str, "API_NAME");
            ckf.g(str2, "VERSION");
            return new UnderageModeRequestInfo(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnderageModeRequestInfo)) {
                return false;
            }
            UnderageModeRequestInfo underageModeRequestInfo = (UnderageModeRequestInfo) obj;
            if (!ckf.b(this.API_NAME, underageModeRequestInfo.API_NAME) || !ckf.b(this.VERSION, underageModeRequestInfo.VERSION)) {
                return false;
            }
            return true;
        }

        public final String getAPI_NAME() {
            return this.API_NAME;
        }

        public final String getVERSION() {
            return this.VERSION;
        }

        public int hashCode() {
            int i;
            String str = this.API_NAME;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str2 = this.VERSION;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i3 + i2;
        }

        public String toString() {
            return "UnderageModeRequestInfo(API_NAME=" + this.API_NAME + ", VERSION=" + this.VERSION + f7l.BRACKET_END_STR;
        }

        public UnderageModeRequestInfo(String str, String str2) {
            ckf.g(str, "API_NAME");
            ckf.g(str2, "VERSION");
            this.API_NAME = str;
            this.VERSION = str2;
        }

        public /* synthetic */ UnderageModeRequestInfo(String str, String str2, int i, a07 a07Var) {
            this((i & 1) != 0 ? "mtop.taobao.content.detail.underage.timelimit" : str, (i & 2) != 0 ? "1.0" : str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class UnderageModeResponse extends CommonResponseOutDo<UnderageModeResponseInfo> {
        static {
            t2o.a(468713550);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class UnderageModeResponseInfo implements IMTOPDataObject {
        private boolean limit;
        private String limitReasonType;
        private int remainSeconds;
        private int timeRangeFrom;
        private int timeRangeTo;
        private int viewLimitMinutes;

        static {
            t2o.a(468713551);
            t2o.a(589299906);
        }

        public UnderageModeResponseInfo(boolean z, int i, int i2, int i3, int i4, String str) {
            ckf.g(str, "limitReasonType");
            this.limit = z;
            this.remainSeconds = i;
            this.timeRangeFrom = i2;
            this.timeRangeTo = i3;
            this.viewLimitMinutes = i4;
            this.limitReasonType = str;
        }

        public static /* synthetic */ UnderageModeResponseInfo copy$default(UnderageModeResponseInfo underageModeResponseInfo, boolean z, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z = underageModeResponseInfo.limit;
            }
            if ((i5 & 2) != 0) {
                i = underageModeResponseInfo.remainSeconds;
            }
            if ((i5 & 4) != 0) {
                i2 = underageModeResponseInfo.timeRangeFrom;
            }
            if ((i5 & 8) != 0) {
                i3 = underageModeResponseInfo.timeRangeTo;
            }
            if ((i5 & 16) != 0) {
                i4 = underageModeResponseInfo.viewLimitMinutes;
            }
            if ((i5 & 32) != 0) {
                str = underageModeResponseInfo.limitReasonType;
            }
            return underageModeResponseInfo.copy(z, i, i2, i3, i4, str);
        }

        public final boolean component1() {
            return this.limit;
        }

        public final int component2() {
            return this.remainSeconds;
        }

        public final int component3() {
            return this.timeRangeFrom;
        }

        public final int component4() {
            return this.timeRangeTo;
        }

        public final int component5() {
            return this.viewLimitMinutes;
        }

        public final String component6() {
            return this.limitReasonType;
        }

        public final UnderageModeResponseInfo copy(boolean z, int i, int i2, int i3, int i4, String str) {
            ckf.g(str, "limitReasonType");
            return new UnderageModeResponseInfo(z, i, i2, i3, i4, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnderageModeResponseInfo)) {
                return false;
            }
            UnderageModeResponseInfo underageModeResponseInfo = (UnderageModeResponseInfo) obj;
            if (this.limit == underageModeResponseInfo.limit && this.remainSeconds == underageModeResponseInfo.remainSeconds && this.timeRangeFrom == underageModeResponseInfo.timeRangeFrom && this.timeRangeTo == underageModeResponseInfo.timeRangeTo && this.viewLimitMinutes == underageModeResponseInfo.viewLimitMinutes && ckf.b(this.limitReasonType, underageModeResponseInfo.limitReasonType)) {
                return true;
            }
            return false;
        }

        public final boolean getLimit() {
            return this.limit;
        }

        public final String getLimitReasonType() {
            return this.limitReasonType;
        }

        public final int getRemainSeconds() {
            return this.remainSeconds;
        }

        public final int getTimeRangeFrom() {
            return this.timeRangeFrom;
        }

        public final int getTimeRangeTo() {
            return this.timeRangeTo;
        }

        public final int getViewLimitMinutes() {
            return this.viewLimitMinutes;
        }

        public int hashCode() {
            int i;
            boolean z = this.limit;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = ((((((((i2 * 31) + this.remainSeconds) * 31) + this.timeRangeFrom) * 31) + this.timeRangeTo) * 31) + this.viewLimitMinutes) * 31;
            String str = this.limitReasonType;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            return i4 + i;
        }

        public final void setLimit(boolean z) {
            this.limit = z;
        }

        public final void setLimitReasonType(String str) {
            ckf.g(str, "<set-?>");
            this.limitReasonType = str;
        }

        public final void setRemainSeconds(int i) {
            this.remainSeconds = i;
        }

        public final void setTimeRangeFrom(int i) {
            this.timeRangeFrom = i;
        }

        public final void setTimeRangeTo(int i) {
            this.timeRangeTo = i;
        }

        public final void setViewLimitMinutes(int i) {
            this.viewLimitMinutes = i;
        }

        public String toString() {
            return "UnderageModeResponseInfo(limit=" + this.limit + ", remainSeconds=" + this.remainSeconds + ", timeRangeFrom=" + this.timeRangeFrom + ", timeRangeTo=" + this.timeRangeTo + ", viewLimitMinutes=" + this.viewLimitMinutes + ", limitReasonType=" + this.limitReasonType + f7l.BRACKET_END_STR;
        }

        public /* synthetic */ UnderageModeResponseInfo(boolean z, int i, int i2, int i3, int i4, String str, int i5, a07 a07Var) {
            this((i5 & 1) != 0 ? false : z, (i5 & 2) == 0 ? i : 0, (i5 & 4) != 0 ? 22 : i2, (i5 & 8) != 0 ? 6 : i3, (i5 & 16) != 0 ? 40 : i4, (i5 & 32) != 0 ? "" : str);
        }

        public UnderageModeResponseInfo() {
            this(false, 0, 0, 0, 0, null, 62, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements IMTopAdapter.b<UnderageModeResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f7684a;
        public final /* synthetic */ Activity b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.fluid.business.undermode.helper.UnderageTimelimitHelper$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class RunnableC0412a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0412a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    UnderageTimelimitHelper.INSTANCE.a(a.this.f7684a);
                }
            }
        }

        public a(FluidContext fluidContext, Activity activity) {
            this.f7684a = fluidContext;
            this.b = activity;
        }

        /* renamed from: b */
        public void a(MtopResponse mtopResponse, UnderageModeResponse underageModeResponse) {
            UnderageModeResponseInfo underageModeResponseInfo;
            lgv config;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("607ab0a1", new Object[]{this, mtopResponse, underageModeResponse});
                return;
            }
            if (underageModeResponse != null) {
                underageModeResponseInfo = (UnderageModeResponseInfo) underageModeResponse.data;
            } else {
                underageModeResponseInfo = null;
            }
            if (underageModeResponseInfo != null) {
                UnderageModeResponseInfo underageModeResponseInfo2 = (UnderageModeResponseInfo) underageModeResponse.data;
                ir9.b("UnderageModeHelper", "checkLimitAndPending - onSuccess " + underageModeResponseInfo2);
                if (underageModeResponseInfo2 != null) {
                    if (underageModeResponseInfo2.getLimit()) {
                        kgv.INSTANCE.d(this.f7684a, this.b, underageModeResponseInfo2.getLimitReasonType());
                        return;
                    }
                    IUnderageModeService iUnderageModeService = (IUnderageModeService) this.f7684a.getService(IUnderageModeService.class);
                    if (!(iUnderageModeService == null || (config = iUnderageModeService.getConfig()) == null)) {
                        config.d(false);
                    }
                    UnderageTimelimitHelper.INSTANCE.b().postDelayed(new RunnableC0412a(), Math.max(underageModeResponseInfo2.getRemainSeconds() * 1000, 60000L));
                }
            }
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void onError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                return;
            }
            ckf.g(mtopResponse, "response");
            ir9.b("UnderageModeHelper", "checkLimitAndPending - onError  response=" + mtopResponse.getRetMsg());
        }
    }

    static {
        t2o.a(468713548);
    }

    public final void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b8aeec", new Object[]{this, fluidContext});
            return;
        }
        ckf.g(fluidContext, "fluidContext");
        kgv kgvVar = kgv.INSTANCE;
        Context context = fluidContext.getContext();
        ckf.f(context, "fluidContext.context");
        if (!kgvVar.h(context)) {
            ir9.b("UnderageModeHelper", "checkLimitAndPending -- 非青少年模式 ");
            return;
        }
        Context context2 = fluidContext.getContext();
        if (context2 != null) {
            Activity activity = (Activity) context2;
            if (mgv.INSTANCE.a(activity)) {
                ir9.b("UnderageModeHelper", "checkLimitAndPending -- 时间锁关闭，无需check，当天不限制 ");
                return;
            }
            UnderageModeRequestInfo underageModeRequestInfo = new UnderageModeRequestInfo(null, null, 3, null);
            ir9.b("UnderageModeHelper", "checkLimitAndPending - start request");
            FluidSDK.getMTopAdapter().send(underageModeRequestInfo, new a(fluidContext, activity), UnderageModeResponse.class);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    public final Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4e0699ec", new Object[]{this});
        }
        return f7683a;
    }

    public final void c(FluidContext fluidContext) {
        lgv config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605b1392", new Object[]{this, fluidContext});
            return;
        }
        ckf.g(fluidContext, "fluidContext");
        ir9.b("UnderageModeHelper", "resetUnderageMode - 后台停止下次检查青少年模式");
        f7683a.removeCallbacksAndMessages(null);
        IUnderageModeService iUnderageModeService = (IUnderageModeService) fluidContext.getService(IUnderageModeService.class);
        if (iUnderageModeService != null && (config = iUnderageModeService.getConfig()) != null) {
            config.d(false);
        }
    }
}
