package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class knr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVCallBackContext f22788a;

    static {
        t2o.a(779091984);
    }

    public knr(String str, String str2, WVCallBackContext wVCallBackContext) {
        this.f22788a = wVCallBackContext;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
        } else if (this.f22788a == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                nsw nswVar = new nsw();
                try {
                    nswVar.h(new JSONObject(str));
                    this.f22788a.success(nswVar);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                this.f22788a.success();
            }
        }
    }
}
