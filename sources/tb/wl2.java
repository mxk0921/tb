package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.festival.FestivalConfigLoader;
import com.taobao.tao.Globals;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "festival.broadcast";

    /* renamed from: a  reason: collision with root package name */
    public static Runnable f30758a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f30759a;

        public a(Context context) {
            this.f30759a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FestivalConfigLoader.m().B();
            Intent intent = new Intent(FestivalMgr.ACTION_FESTIVAL_CHANGE);
            intent.putExtra(FestivalMgr.EXTRA_FESTIVAL_CHANGE_REASON, FestivalMgr.FESTIVAL_CHANGE_REASON_CONFIG_CHANGE);
            LocalBroadcastManager.getInstance(this.f30759a).sendBroadcast(intent);
        }
    }

    static {
        t2o.a(464519183);
    }

    public static void a(Context context, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1435b29b", new Object[]{context, hashMap});
            return;
        }
        Intent intent = new Intent(FestivalMgr.ACTION_TABBAR_CHANGE_DONE);
        intent.putExtra(FestivalMgr.COMMON_EXTRA_REASON, hashMap);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc3b65b", new Object[]{new Long(j)});
            return;
        }
        Application application = Globals.getApplication();
        if (application != null) {
            n1q.c(f30758a);
            a aVar = new a(application);
            f30758a = aVar;
            n1q.e(aVar, j);
        }
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cce87e8", new Object[]{context, str});
            return;
        }
        x9q.a();
        FestivalConfigLoader.m().A();
        Intent intent = new Intent(FestivalMgr.ACTION_FESTIVAL_CHANGE);
        intent.putExtra(FestivalMgr.EXTRA_FESTIVAL_CHANGE_REASON, str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
