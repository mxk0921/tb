package com.taobao.search.common.voicesearch.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iu2;
import tb.kpw;
import tb.oyl;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SpeechPermissionPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "SearchSpeechPermissionBridge";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11532a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f11532a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f11532a.error(SpeechPermissionPlugin.this.generateRetStr(oyl.PERMISSION_DENY));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11533a;

        public b(WVCallBackContext wVCallBackContext) {
            this.f11533a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f11533a.success(SpeechPermissionPlugin.this.generateRetStr(oyl.PERMISSION_ALLOW));
            }
        }
    }

    static {
        t2o.a(815792259);
    }

    public static /* synthetic */ Object ipc$super(SpeechPermissionPlugin speechPermissionPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/voicesearch/jsbridge/SpeechPermissionPlugin");
    }

    public String generateRetStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a117daea", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        return jSONObject.toJSONString();
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!iu2.CALENDAR_EVENT_PERMISSION_CHECK.equals(str)) {
            return false;
        }
        com.taobao.runtimepermission.a.c(this.mContext, new String[]{"android.permission.RECORD_AUDIO"}).t(r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME).x(true).A(new b(wVCallBackContext)).z(new a(wVCallBackContext)).m();
        return true;
    }
}
