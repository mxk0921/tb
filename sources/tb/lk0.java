package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lk0 INSTANCE = new lk0();

    static {
        t2o.a(481296461);
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22d9e845", new Object[0]);
        }
        return eno.d(caa.c(), "PltLastAlbumPicTime", "");
    }

    @JvmStatic
    public static final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b4aa5f8", new Object[]{str});
        } else if (str != null && !TextUtils.isEmpty(str)) {
            eno.f(caa.c(), "PltLastAlbumPicTime", str);
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1b869f7", new Object[]{this});
        }
        String a2 = a();
        if (a2 == null || TextUtils.isEmpty(a2)) {
            return "InvalidValue";
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - trl.d(a2, -1L);
        if (currentTimeMillis <= 0) {
            return "InvalidValue";
        }
        long j = currentTimeMillis / 60;
        if (j <= 5) {
            return "5m";
        }
        if (j <= 10) {
            return "10m";
        }
        if (j <= 30) {
            return "30m";
        }
        if (j <= 60) {
            return "1h";
        }
        if (j <= 1440) {
            return "1d";
        }
        return "over1d";
    }
}
