package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ajr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVCallBackContext f15780a;

    static {
        t2o.a(1027604497);
    }

    public ajr(String str, String str2, WVCallBackContext wVCallBackContext) {
        this.f15780a = wVCallBackContext;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1392128f", new Object[]{this});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f15780a;
        if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
        } else if (this.f15780a == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                nsw nswVar = new nsw();
                try {
                    nswVar.h(new JSONObject(str));
                    this.f15780a.error(nswVar);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                this.f15780a.error();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f15780a;
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
        } else if (this.f15780a == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                nsw nswVar = new nsw();
                try {
                    nswVar.h(new JSONObject(str));
                    this.f15780a.success(nswVar);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                this.f15780a.success();
            }
        }
    }
}
