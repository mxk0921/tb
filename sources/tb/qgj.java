package tb;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qgj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26739a;
        public final /* synthetic */ String b;

        public a(boolean z, String str) {
            this.f26739a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
                if (this.f26739a) {
                    str = "MyTaobaoOrderNumberCacheV2";
                } else {
                    str = "MyTaobaoOrderNumberCache";
                }
                edit.putString(str, this.b);
                edit.putString("OrderNumUserId", Login.getUserId());
                edit.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
                String string = defaultSharedPreferences.getString("OrderNumUserId", "null");
                if (!TextUtils.isEmpty(string) && !TextUtils.equals(string, Login.getUserId())) {
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.remove("MyTaobaoOrderNumberCache");
                    edit.remove("MyTaobaoOrderNumberCacheV2");
                    edit.remove("OrderNumUserId");
                    edit.commit();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(745538203);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6278f02", new Object[0]);
        } else {
            Coordinator.execute(new b());
        }
    }

    public static void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa2fe682", new Object[]{str, new Boolean(z)});
        } else {
            Coordinator.execute(new a(z, str));
        }
    }
}
