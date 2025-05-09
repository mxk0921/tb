package com.tmall.android.dai.internal.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.axw;
import tb.kgh;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.zww;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WVDaiApiPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SERVER_NAME = "WVDAIHandler";
    public static final int STATUS_CODE_FAILURE = 0;
    public static final int STATUS_CODE_SUCCESS = 1;
    private static final String TAG = "WVDaiApiPlugin";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements zww {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f14215a;

        public a(WVDaiApiPlugin wVDaiApiPlugin, WVCallBackContext wVCallBackContext) {
            this.f14215a = wVCallBackContext;
        }

        public void a(boolean z, HashMap<String, Object> hashMap, Map<String, Object> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76165861", new Object[]{this, new Boolean(z), hashMap, map, str});
                return;
            }
            WVCallBackContext wVCallBackContext = this.f14215a;
            if (wVCallBackContext != null) {
                wVCallBackContext.error(WVDaiApiPlugin.newWVResult(z, hashMap, map, str));
            }
        }

        public void b(boolean z, HashMap<String, Object> hashMap, Map<String, Object> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f87436c6", new Object[]{this, new Boolean(z), hashMap, map, str});
                return;
            }
            WVCallBackContext wVCallBackContext = this.f14215a;
            if (wVCallBackContext != null) {
                wVCallBackContext.success(WVDaiApiPlugin.newWVResult(z, hashMap, map, str));
            }
        }
    }

    static {
        t2o.a(1034944691);
    }

    public static /* synthetic */ Object ipc$super(WVDaiApiPlugin wVDaiApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/internal/windvane/WVDaiApiPlugin");
    }

    public static nsw newWVResult(boolean z, HashMap<String, Object> hashMap, Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("ab9c3e89", new Object[]{new Boolean(z), hashMap, map, str});
        }
        nsw nswVar = new nsw();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", z ? 1 : 0);
            if (hashMap != null) {
                jSONObject.put("model", new JSONObject(hashMap));
            }
            if (map != null) {
                jSONObject.put("result", new JSONObject(map));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("msg", str);
            }
        } catch (Exception e) {
            kgh.d(TAG, e.getMessage(), e);
        }
        nswVar.h(jSONObject);
        return nswVar;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return axw.b(str, str2, new a(this, wVCallBackContext));
    }
}
