package tb;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.android.artry.MetaServerAccsService;
import com.taobao.android.artry.tblife.WVARCameraView;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w4f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f30446a = w4f.class.getSimpleName();
    public static final String b = "metaserver";
    public static Context c;

    static {
        t2o.a(396361815);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            Context applicationContext = application.getApplicationContext();
            c = applicationContext;
            GlobalClientInfo.getInstance(applicationContext).registerService(b, MetaServerAccsService.class.getName());
            MetaServerAccsService.f6353a = true;
            MetaServerAccsService.b();
            fqw.g(WVARCameraView.AR_CAMERA_WV_VIEW_TYPE, WVARCameraView.class, true);
        } catch (Throwable th) {
            Log.e(f30446a, "init artry error", th);
        }
    }
}
