package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.voe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVImage extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements voe.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1804a;

        public a(WVImage wVImage, WVCallBackContext wVCallBackContext) {
            this.f1804a = wVCallBackContext;
        }

        @Override // tb.voe.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
            } else {
                this.f1804a.success();
            }
        }

        @Override // tb.voe.c
        public void error(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("msg", str);
            this.f1804a.error(nswVar);
        }
    }

    static {
        t2o.a(989856279);
    }

    public static /* synthetic */ Object ipc$super(WVImage wVImage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVImage");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.equals(str, "saveImage")) {
            return false;
        }
        try {
            String optString = new JSONObject(str2).optString("url", "");
            if (!TextUtils.isEmpty(optString)) {
                voe.h(this.mContext, optString, new a(this, wVCallBackContext));
            }
        } catch (JSONException e) {
            nsw nswVar = new nsw();
            nswVar.b("msg", e.getMessage());
            wVCallBackContext.error(nswVar);
        }
        return true;
    }
}
