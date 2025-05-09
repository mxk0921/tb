package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.DesktopTaskServiceReceiver;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hp9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c5d f20798a;
    public final Handler b;

    static {
        t2o.a(435159123);
    }

    public hp9(Context context, Handler handler) {
        this.f20798a = new c5d(context, DesktopTaskServiceReceiver.class);
        this.b = handler;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9419ce8d", new Object[]{this, str})).booleanValue();
        }
        if (this.f20798a == null || this.b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("triggerEventId", "default");
        bundle.putString("bizCode", str);
        bundle.putString("action", "close");
        this.f20798a.h(3, bundle, this.b);
        return true;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d280d5d", new Object[]{this, str})).booleanValue();
        }
        if (this.f20798a == null || this.b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("triggerEventId", "default");
        bundle.putString("bizCode", str);
        bundle.putString("action", "query");
        this.f20798a.h(3, bundle, this.b);
        return true;
    }

    public boolean c(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6684181", new Object[]{this, str, str2, jSONObject})).booleanValue();
        }
        if (this.f20798a == null || this.b == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("triggerEventId", str);
        bundle.putString("bizCode", str2);
        bundle.putString("action", "trigger");
        bundle.putBoolean("needToast", (jSONObject == null || !jSONObject.containsKey("needToast")) ? true : jSONObject.getBoolean("needToast").booleanValue());
        this.f20798a.h(3, bundle, this.b);
        return true;
    }
}
