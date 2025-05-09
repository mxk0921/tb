package tb;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.share.aidl.ISharePassword;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ujp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SharePassword";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f29420a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(Context context, String str, String str2) {
            this.f29420a = context;
            this.b = str;
            this.c = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/wvapi/servicebrige/SharePassword$1");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                ISharePassword iSharePassword = (ISharePassword) Services.get(this.f29420a, ISharePassword.class);
                if (iSharePassword == null) {
                    return null;
                }
                iSharePassword.putPassworToHistory(this.b, this.c);
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    static {
        t2o.a(663748638);
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a311fba", new Object[]{context, str, str2})).booleanValue();
        }
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        new a(context, str, str2).execute(new Void[0]);
        return true;
    }
}
