package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class uv implements fo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JarvisUnifiedCallback";
    public otf mJarvisWidget;
    private dtf mRegistry;

    static {
        t2o.a(995098625);
        t2o.a(1034944535);
    }

    public uv(otf otfVar) {
        this.mJarvisWidget = otfVar;
        this.mRegistry = ((etf) otfVar.getCore().f().f()).h();
    }

    @Override // tb.fo6
    public void errorReport(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
        } else {
            c4p.D("[XSearchJarvis]", "Jarvis返回出错，type:%s, errorMsg:%s", str2, str3);
        }
    }

    public abstract void handleResult(JSONObject jSONObject);

    @Override // tb.fo6
    public void notify(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            return;
        }
        if (c4p.i().j()) {
            c4p.B("[XSearchJarvis]", "page:" + this.mJarvisWidget.y2() + ", event:" + str + ", 返回:", JSON.parseObject(str2));
        }
        if (TextUtils.isEmpty(str2)) {
            c4p.n(TAG, "callback result is empty");
            return;
        }
        try {
            handleResult(JSON.parseObject(str2));
        } catch (Throwable th) {
            c4p.o(TAG, "parse callback result failed", th);
        }
    }
}
