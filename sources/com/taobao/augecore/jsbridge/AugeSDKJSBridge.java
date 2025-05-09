package com.taobao.augecore.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kpw;
import tb.nsw;
import tb.yf4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AugeSDKJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GROUP = "getAllCrowdIdList";
    public static final String ACTION_GROUP_SYN = "getAllCrowdIdListSyn";
    public static final String ACTION_IN = "isInGroup";
    public static final String ACTION_IN_SYN = "isInGroupSyn";
    public static final String NAME = "AugeAndroidJs";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements yf4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f10083a;
        public final /* synthetic */ WVCallBackContext b;

        public a(AugeSDKJSBridge augeSDKJSBridge, nsw nswVar, WVCallBackContext wVCallBackContext) {
            this.f10083a = nswVar;
            this.b = wVCallBackContext;
        }

        @Override // tb.yf4
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7ae9c1b", new Object[]{this, new Boolean(z)});
                return;
            }
            this.f10083a.a("data", Boolean.valueOf(z));
            this.b.success(this.f10083a);
        }

        @Override // tb.yf4
        public void b(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c7072d", new Object[]{this, list});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements yf4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f10084a;
        public final /* synthetic */ WVCallBackContext b;

        public b(AugeSDKJSBridge augeSDKJSBridge, nsw nswVar, WVCallBackContext wVCallBackContext) {
            this.f10084a = nswVar;
            this.b = wVCallBackContext;
        }

        @Override // tb.yf4
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7ae9c1b", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.yf4
        public void b(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c7072d", new Object[]{this, list});
                return;
            }
            this.f10084a.a("data", list);
            this.b.success(this.f10084a);
        }
    }

    public static /* synthetic */ Object ipc$super(AugeSDKJSBridge augeSDKJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/augecore/jsbridge/AugeSDKJSBridge");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r12.equals(com.taobao.augecore.jsbridge.AugeSDKJSBridge.ACTION_IN) == false) goto L_0x0085;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r12, java.lang.String r13, android.taobao.windvane.jsbridge.WVCallBackContext r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.augecore.jsbridge.AugeSDKJSBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
