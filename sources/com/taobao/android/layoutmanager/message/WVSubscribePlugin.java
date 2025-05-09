package com.taobao.android.layoutmanager.message;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WVSubscribePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CANCEL_SUBSCRIBE = "cancelSubscribe";
    public static final String ACTION_DO_SUBSCRIBE = "doSubscribe";
    public static final String ACTION_QUERY_SUBSCRIBE = "querySubscribe";
    public static final String CLASS_NAME = "WVSubscribe";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f8201a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f8201a = wVCallBackContext;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
            } else if (subScribeCenterResultDTO == null) {
            } else {
                if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                    WVSubscribePlugin.access$000(WVSubscribePlugin.this, "isSubscribed", "true", this.f8201a);
                } else {
                    WVSubscribePlugin.access$100(WVSubscribePlugin.this, "mtop is success,but ret is fail", this.f8201a);
                }
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                WVSubscribePlugin.access$100(WVSubscribePlugin.this, th.getMessage(), this.f8201a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f8202a;

        public b(WVCallBackContext wVCallBackContext) {
            this.f8202a = wVCallBackContext;
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
            } else if (subScribeCenterResultDTO == null) {
            } else {
                if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                    WVSubscribePlugin.access$000(WVSubscribePlugin.this, "isSubscribed", "false", this.f8202a);
                } else {
                    WVSubscribePlugin.access$100(WVSubscribePlugin.this, "mtop is success,but ret is fail", this.f8202a);
                }
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                WVSubscribePlugin.access$100(WVSubscribePlugin.this, th.getMessage(), this.f8202a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f8203a;

        public c(WVCallBackContext wVCallBackContext) {
            this.f8203a = wVCallBackContext;
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                WVSubscribePlugin.access$100(WVSubscribePlugin.this, th.getMessage(), this.f8203a);
            }
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
            } else if (subScribeCenterResultDTO == null) {
            } else {
                if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                    try {
                        if ("1".equals(subScribeCenterResultDTO.getSubScribeTopicList().get(0).getStatus())) {
                            WVSubscribePlugin.access$000(WVSubscribePlugin.this, "isSubscribed", "true", this.f8203a);
                        } else {
                            WVSubscribePlugin.access$000(WVSubscribePlugin.this, "isSubscribed", "false", this.f8203a);
                        }
                    } catch (Exception unused) {
                        WVSubscribePlugin.access$100(WVSubscribePlugin.this, "mtop is success,but data parser running fail", this.f8203a);
                    }
                } else {
                    WVSubscribePlugin.access$100(WVSubscribePlugin.this, "mtop is success,but ret is fail", this.f8203a);
                }
            }
        }
    }

    static {
        t2o.a(502268092);
    }

    public static /* synthetic */ void access$000(WVSubscribePlugin wVSubscribePlugin, String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951deff2", new Object[]{wVSubscribePlugin, str, obj, wVCallBackContext});
        } else {
            wVSubscribePlugin.callBackSuccess(str, obj, wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$100(WVSubscribePlugin wVSubscribePlugin, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbad8957", new Object[]{wVSubscribePlugin, str, wVCallBackContext});
        } else {
            wVSubscribePlugin.callBackFail(str, wVCallBackContext);
        }
    }

    private void callBackFail(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d831e8b1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_FAILED");
        nswVar.b("errorMsg", str);
        wVCallBackContext.error(nswVar);
    }

    private void callBackSuccess(String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d4d1c8", new Object[]{this, str, obj, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.k();
        nswVar.a(str, obj);
        wVCallBackContext.success(nswVar);
    }

    public static /* synthetic */ Object ipc$super(WVSubscribePlugin wVSubscribePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/message/WVSubscribePlugin");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r11.equals(com.taobao.android.layoutmanager.message.WVSubscribePlugin.ACTION_CANCEL_SUBSCRIBE) == false) goto L_0x0058;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r11, java.lang.String r12, android.taobao.windvane.jsbridge.WVCallBackContext r13) {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.layoutmanager.message.WVSubscribePlugin.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0022
            java.lang.String r4 = "bcd41fd1"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r10
            r5[r1] = r11
            r5[r0] = r12
            r11 = 3
            r5[r11] = r13
            java.lang.Object r11 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x0022:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: JSONException -> 0x00a8
            r3.<init>(r12)     // Catch: JSONException -> 0x00a8
            java.lang.String r12 = "activityType"
            java.lang.String r6 = r3.optString(r12)
            java.lang.String r12 = "subFrom"
            java.lang.String r8 = r3.optString(r12)
            java.lang.String r12 = "contentId"
            java.lang.String r5 = r3.optString(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 != 0) goto L_0x00a4
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x00a4
            boolean r12 = android.text.TextUtils.isEmpty(r5)
            if (r12 == 0) goto L_0x004d
            goto L_0x00a4
        L_0x004d:
            r11.hashCode()
            r12 = -1
            int r3 = r11.hashCode()
            switch(r3) {
                case -1420829441: goto L_0x006f;
                case 411977058: goto L_0x0063;
                case 775649264: goto L_0x005a;
                default: goto L_0x0058;
            }
        L_0x0058:
            r0 = -1
            goto L_0x0079
        L_0x005a:
            java.lang.String r2 = "cancelSubscribe"
            boolean r11 = r11.equals(r2)
            if (r11 != 0) goto L_0x0079
            goto L_0x0058
        L_0x0063:
            java.lang.String r0 = "querySubscribe"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x006d
            goto L_0x0058
        L_0x006d:
            r0 = 1
            goto L_0x0079
        L_0x006f:
            java.lang.String r0 = "doSubscribe"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0078
            goto L_0x0058
        L_0x0078:
            r0 = 0
        L_0x0079:
            switch(r0) {
                case 0: goto L_0x0097;
                case 1: goto L_0x008a;
                case 2: goto L_0x007d;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x00a3
        L_0x007d:
            com.taobao.message.subscribe.SubscribeUtils r4 = com.taobao.message.subscribe.SubscribeUtils.INSTANCE
            com.taobao.android.layoutmanager.message.WVSubscribePlugin$b r9 = new com.taobao.android.layoutmanager.message.WVSubscribePlugin$b
            r9.<init>(r13)
            java.lang.String r7 = "1"
            r4.cancelSubscribe(r5, r6, r7, r8, r9)
            goto L_0x00a3
        L_0x008a:
            com.taobao.message.subscribe.SubscribeUtils r4 = com.taobao.message.subscribe.SubscribeUtils.INSTANCE
            com.taobao.android.layoutmanager.message.WVSubscribePlugin$c r9 = new com.taobao.android.layoutmanager.message.WVSubscribePlugin$c
            r9.<init>(r13)
            java.lang.String r7 = "1"
            r4.querySubscribe(r5, r6, r7, r8, r9)
            goto L_0x00a3
        L_0x0097:
            com.taobao.message.subscribe.SubscribeUtils r4 = com.taobao.message.subscribe.SubscribeUtils.INSTANCE
            com.taobao.android.layoutmanager.message.WVSubscribePlugin$a r9 = new com.taobao.android.layoutmanager.message.WVSubscribePlugin$a
            r9.<init>(r13)
            java.lang.String r7 = "1"
            r4.doSubscribe(r5, r6, r7, r8, r9)
        L_0x00a3:
            return r1
        L_0x00a4:
            r13.error()
            return r2
        L_0x00a8:
            r13.error()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.layoutmanager.message.WVSubscribePlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
