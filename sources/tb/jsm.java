package tb;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.OpenContainerLoadAppInfoResult;
import tb.kr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jsm implements sud {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int ERROR_CODE = 10002;
    public static final String TAG = "PreloadMiniAppAbility";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(804257810);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements ysc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lr f22187a;

        public b(lr lrVar) {
            this.f22187a = lrVar;
        }

        @Override // tb.p3d
        public void M0(OpenContainerLoadAppInfoResult openContainerLoadAppInfoResult) {
            kr krVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bcb5676", new Object[]{this, openContainerLoadAppInfoResult});
                return;
            }
            ckf.g(openContainerLoadAppInfoResult, "result");
            if (ckf.b(openContainerLoadAppInfoResult.result, Boolean.TRUE)) {
                krVar = kr.b.INSTANCE;
            } else {
                krVar = new kr.a(10002, "mega preload failed");
            }
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.d(jsm.TAG, "preload app info onData: " + openContainerLoadAppInfoResult.result);
            lr lrVar = this.f22187a;
            if (lrVar != null) {
                lrVar.a(krVar);
            }
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.b(jsm.TAG, "execute preload mini app error: " + errorResult.getCode() + "  " + errorResult.getMsg());
            try {
                String code = errorResult.getCode();
                ckf.f(code, "result.code");
                i = Integer.parseInt(code);
            } catch (Exception unused) {
                wfr wfrVar2 = wfr.INSTANCE;
                wfrVar2.b(jsm.TAG, "parse error code error: " + errorResult.getCode());
                i = 10002;
            }
            lr lrVar = this.f22187a;
            if (lrVar != null) {
                String msg = errorResult.getMsg();
                ckf.f(msg, "result.msg");
                lrVar.a(new kr.a(i, msg));
            }
        }
    }

    static {
        t2o.a(804257809);
        t2o.a(803209236);
    }

    @Override // tb.sud
    public void a(String str, JSONObject jSONObject, lr lrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c347dc", new Object[]{this, str, jSONObject, lrVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(jSONObject, "data");
        wfr wfrVar = wfr.INSTANCE;
        wfrVar.d(TAG, "execute preload mini app");
        String string = jSONObject.getString(LogContext.STORAGE_APPID);
        ckf.f(string, "data.getString(\"appID\")");
        if (TextUtils.isEmpty(string)) {
            wfrVar.b(TAG, "appId is null");
            if (lrVar != null) {
                lrVar.a(new kr.a(10002, "invalid params, no app id"));
                return;
            }
            return;
        }
        zii b2 = zii.Companion.b();
        h3l a2 = h3l.Companion.a();
        if (a2 == null) {
            wfrVar.b(TAG, "app info model is null");
            if (lrVar != null) {
                lrVar.a(new kr.a(10002, "app info model create error"));
                return;
            }
            return;
        }
        a2.f20392a = string;
        b2.b(a2, new b(lrVar));
    }
}
