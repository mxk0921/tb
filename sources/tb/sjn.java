package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sjn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_UNEXPOSE_IDS = "InfoFlowUnExposedIds";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28092a;

        public a(String str) {
            this.f28092a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SharedPreferences e = ulp.c(Globals.getApplication()).e();
            if (e == null) {
                fve.e("RealExposedFileManager", "SharedPreferences is null");
                return;
            }
            SharedPreferences.Editor edit = e.edit();
            edit.putString(sjn.KEY_UNEXPOSE_IDS, this.f28092a);
            edit.apply();
        }
    }

    static {
        t2o.a(491782628);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4c48e20", new Object[0]);
        }
        SharedPreferences e = ulp.c(Globals.getApplication()).e();
        if (e != null) {
            return e.getString(KEY_UNEXPOSE_IDS, "");
        }
        fve.e("RealExposedFileManager", "SharedPreferences is null");
        return null;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc07d61", new Object[]{str});
        } else {
            get.a().g(new a(str), 200L);
        }
    }
}
