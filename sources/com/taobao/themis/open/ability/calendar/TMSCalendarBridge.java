package com.taobao.themis.open.ability.calendar;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.ckf;
import tb.j8s;
import tb.msq;
import tb.t2o;
import tb.uu2;
import tb.wu6;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003JW\u0010\u0012\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0014\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0016\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/open/ability/calendar/TMSCalendarBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "onFinalized", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "", "startDate", "endDate", "title", "description", "", "remind", "addCalendarPlan", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "cancelCalendarPlan", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "checkCalendarPlanIsExist", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSCalendarBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int ERROR_DATA_ERROR = 111;
    public static final int ERROR_DATA_FORMAT = 109;
    public static final int ERROR_REMOVE_CALENDAR_ERROR = 110;
    public static final int ERROR_USER_CANCEL = 107;
    public static final int ERROR_USER_REFUSE_SYSTEM_PERMISSION = 108;
    public static final String TAG = "TMSCalendarBridge";
    public static final String module = "calendarService";
    public static final String namespace = "themis";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055197);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ApiContext f13631a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Ref$ObjectRef<Date> e;
        public final /* synthetic */ Ref$ObjectRef<Date> f;
        public final /* synthetic */ int g;
        public final /* synthetic */ BridgeCallback h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements uu2.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f13632a;
            public final /* synthetic */ ApiContext b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ Ref$ObjectRef<Date> e;
            public final /* synthetic */ Ref$ObjectRef<Date> f;
            public final /* synthetic */ int g;
            public final /* synthetic */ BridgeCallback h;

            public a(boolean z, ApiContext apiContext, String str, String str2, Ref$ObjectRef<Date> ref$ObjectRef, Ref$ObjectRef<Date> ref$ObjectRef2, int i, BridgeCallback bridgeCallback) {
                this.f13632a = z;
                this.b = apiContext;
                this.c = str;
                this.d = str2;
                this.e = ref$ObjectRef;
                this.f = ref$ObjectRef2;
                this.g = i;
                this.h = bridgeCallback;
            }

            @Override // tb.uu2.a
            public void onError() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                } else {
                    this.h.sendBridgeResponse(new BridgeResponse.Error(108, "用户拒绝使用日历权限"));
                }
            }

            @Override // tb.uu2.a
            public void onSuccess() {
                boolean z;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                try {
                    if (this.f13632a) {
                        Context applicationContext = this.b.a().getApplicationContext();
                        String str = this.c;
                        String str2 = this.d;
                        Date date = this.e.element;
                        ckf.d(date);
                        long time = date.getTime();
                        Date date2 = this.f.element;
                        ckf.d(date2);
                        z = uu2.a(applicationContext, str, str2, time, date2.getTime(), this.g);
                    } else {
                        Context applicationContext2 = this.b.a().getApplicationContext();
                        String str3 = this.c;
                        Date date3 = this.e.element;
                        ckf.d(date3);
                        long time2 = date3.getTime();
                        Date date4 = this.f.element;
                        ckf.d(date4);
                        z = uu2.c(applicationContext2, str3, time2, date4.getTime());
                    }
                    if (z) {
                        this.h.sendBridgeResponse(BridgeResponse.SUCCESS);
                    } else if (this.f13632a) {
                        this.h.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    } else {
                        this.h.sendBridgeResponse(new BridgeResponse.Error(110, "未查到对应的日历事件"));
                    }
                } catch (Throwable th) {
                    TMSLogger.c(TMSCalendarBridge.TAG, "", th);
                    this.h.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                }
            }
        }

        public b(ApiContext apiContext, boolean z, String str, String str2, Ref$ObjectRef<Date> ref$ObjectRef, Ref$ObjectRef<Date> ref$ObjectRef2, int i, BridgeCallback bridgeCallback) {
            this.f13631a = apiContext;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = ref$ObjectRef;
            this.f = ref$ObjectRef2;
            this.g = i;
            this.h = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                uu2.d(this.f13631a.a().getApplicationContext(), new a(this.b, this.f13631a, this.c, this.d, this.e, this.f, this.g, this.h));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13633a;

        public c(BridgeCallback bridgeCallback) {
            this.f13633a = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                this.f13633a.sendBridgeResponse(new BridgeResponse.Error(107, "用户拒绝设置提醒"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements uu2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13634a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ApiContext c;
        public final /* synthetic */ String d;
        public final /* synthetic */ BridgeCallback e;

        public d(String str, String str2, ApiContext apiContext, String str3, BridgeCallback bridgeCallback) {
            this.f13634a = str;
            this.b = str2;
            this.c = apiContext;
            this.d = str3;
            this.e = bridgeCallback;
        }

        @Override // tb.uu2.a
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                this.e.sendBridgeResponse(new BridgeResponse.Error(108, "用户拒绝使用日历权限"));
            }
        }

        @Override // tb.uu2.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            try {
                wu6 wu6Var = wu6.INSTANCE;
                Date b = wu6Var.b(this.f13634a);
                ckf.d(b);
                long time = b.getTime();
                Date b2 = wu6Var.b(this.b);
                ckf.d(b2);
                boolean b3 = uu2.b(this.c.a().getApplicationContext(), this.d, time, b2.getTime());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "isExist", (String) Boolean.valueOf(b3));
                this.e.sendBridgeResponse(new BridgeResponse(jSONObject));
            } catch (Throwable th) {
                TMSLogger.c(TMSCalendarBridge.TAG, "", th);
                this.e.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            }
        }
    }

    static {
        t2o.a(843055196);
        t2o.a(839909427);
    }

    public static /* synthetic */ void addOrDelCalender$default(TMSCalendarBridge tMSCalendarBridge, boolean z, ApiContext apiContext, String str, String str2, String str3, String str4, int i, BridgeCallback bridgeCallback, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55759e5", new Object[]{tMSCalendarBridge, new Boolean(z), apiContext, str, str2, str3, str4, new Integer(i), bridgeCallback, new Integer(i2), obj});
        } else {
            tMSCalendarBridge.a(z, apiContext, str, str2, str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? 0 : i, bridgeCallback);
        }
    }

    public final void b(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb517c", new Object[]{this, context, str, str2, str3, onClickListener, onClickListener2});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!TextUtils.isEmpty(str2)) {
            str3 = msq.i("\n            " + str3 + "\n            " + str2 + "\n            ");
        }
        AlertDialog create = builder.setTitle(str).setMessage(str3).setPositiveButton("同意", onClickListener).setNegativeButton("拒绝", onClickListener2).create();
        ckf.d(create);
        create.show();
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void checkCalendarPlanIsExist(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"startDate"}) String str, @BindingParam(name = {"endDate"}) String str2, @BindingParam(name = {"title"}) String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0edb358", new Object[]{this, apiContext, bridgeCallback, str, str2, str3});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        ckf.g(str, "startDate");
        ckf.g(str2, "endDate");
        ckf.g(str3, "title");
        if ((apiContext == null ? null : apiContext.a()) == null || apiContext.b() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            uu2.d(apiContext.a().getApplicationContext(), new d(str, str2, apiContext, str3, bridgeCallback));
        }
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void addCalendarPlan(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"startDate"}) String str, @BindingParam(name = {"endDate"}) String str2, @BindingParam(name = {"title"}) String str3, @BindingParam(name = {"description"}) String str4, @BindingParam(name = {"remind"}) int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3255952b", new Object[]{this, apiContext, bridgeCallback, str, str2, str3, str4, new Integer(i)});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        ckf.g(str, "startDate");
        ckf.g(str2, "endDate");
        ckf.g(str3, "title");
        ckf.g(str4, "description");
        a(true, apiContext, str, str2, str3, str4, i, bridgeCallback);
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void cancelCalendarPlan(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"startDate"}) String str, @BindingParam(name = {"endDate"}) String str2, @BindingParam(name = {"title"}) String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72009095", new Object[]{this, apiContext, bridgeCallback, str, str2, str3});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        ckf.g(str, "startDate");
        ckf.g(str2, "endDate");
        ckf.g(str3, "title");
        addOrDelCalender$default(this, false, apiContext, str, str2, str3, null, 0, bridgeCallback, 96, null);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.util.Date] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.util.Date] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r16, com.taobao.themis.kernel.ability.base.ApiContext r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r23) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.calendar.TMSCalendarBridge.a(boolean, com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }
}
