package com.taobao.taolive.sdk.jsbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cwd;
import tb.fxf;
import tb.kpw;
import tb.l6t;
import tb.m6t;
import tb.ncc;
import tb.t2o;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveGlobalWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ncc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f13288a;

        public a(TBLiveGlobalWVPlugin tBLiveGlobalWVPlugin, Map map) {
            this.f13288a = map;
        }

        @Override // tb.ncc
        public Map<String, String> getHeartParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
            }
            return this.f13288a;
        }
    }

    static {
        t2o.a(779093460);
    }

    public static /* synthetic */ Object ipc$super(TBLiveGlobalWVPlugin tBLiveGlobalWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/jsbridge/TBLiveGlobalWVPlugin");
    }

    private String startSubscribePM(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("979c05bc", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("channel");
            boolean equals = "1".equals(jSONObject.getString("roomStatus"));
            if (jSONObject.getString("roomStatus") != null && !equals) {
                return null;
            }
            String string2 = jSONObject.getString("topic");
            String string3 = jSONObject.getString("liveId");
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                m6t m6tVar = new m6t(string, equals, string2, string3, new a(this, fxf.a(jSONObject)));
                String string4 = jSONObject.getString("subscriberDelay");
                if (string4 != null) {
                    try {
                        m6tVar.g = Integer.parseInt(string4);
                    } catch (NumberFormatException e) {
                        tlog("startSubscribePM", e.getMessage());
                    }
                }
                return l6t.f(m6tVar);
            }
        }
        return null;
    }

    private void tlog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6495106b", new Object[]{this, str, str2});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("TBLiveGlobalWVPlugin" + str, str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r10.equals("stopSubscribePM") == false) goto L_0x003b;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r10, java.lang.String r11, android.taobao.windvane.jsbridge.WVCallBackContext r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.jsbridge.TBLiveGlobalWVPlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
