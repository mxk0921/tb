package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ycm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31989a;

    static {
        t2o.a(625999915);
    }

    public ycm(String str) {
        this.f31989a = str;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bd31caee", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject(new ConcurrentHashMap());
        try {
            String h = lyv.h(d());
            if (!TextUtils.isEmpty(h)) {
                jSONObject.putAll(JSON.parseObject(h));
            }
            return jSONObject;
        } catch (Throwable th) {
            wdm.h("PopFileHelper.doReadAndSetup.error.", th);
            return jSONObject;
        }
    }

    public final synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f5eeb0", new Object[]{this, str});
        } else {
            lyv.l(d(), str);
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(PopLayer.getReference().getApp().getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("pop");
        sb.append(str);
        sb.append(this.f31989a);
        return sb.toString();
    }

    public final /* synthetic */ void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2d54bf", new Object[]{this, str});
        } else {
            c(str);
        }
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c3975c43", new Object[]{this});
        }
        return b();
    }

    public void g(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0aca05", new Object[]{this, str});
        } else {
            hst.b(new Runnable() { // from class: tb.xcm
                @Override // java.lang.Runnable
                public final void run() {
                    ycm.this.e(str);
                }
            });
        }
    }
}
