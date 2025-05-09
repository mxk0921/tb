package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wpg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "LinkBack";

    /* renamed from: a  reason: collision with root package name */
    public static final List<vpg> f30839a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30840a;

        public a(String str) {
            this.f30840a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (vpg vpgVar : wpg.a()) {
                try {
                    vpgVar.a(this.f30840a);
                } catch (Throwable th) {
                    TLog.loge(wpg.MODULE_NAME, "notifyUrlUpdateEvent error for some reason : ", th);
                }
            }
        }
    }

    public static /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("54cf0df0", new Object[0]);
        }
        return f30839a;
    }

    public static void b(vpg vpgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5835bbde", new Object[]{vpgVar});
        } else if (vpgVar != null) {
            ((CopyOnWriteArrayList) f30839a).add(vpgVar);
        }
    }

    public static boolean d(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("675c63da", new Object[]{uri, context})).booleanValue();
        }
        if (uri == null || context == null) {
            return false;
        }
        return new upg(uri, context).f();
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5965c", new Object[]{str});
        } else {
            nsg.b.a(new a(str));
        }
    }

    public static void f(vpg vpgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14996db", new Object[]{vpgVar});
        } else if (vpgVar != null) {
            ((CopyOnWriteArrayList) f30839a).remove(vpgVar);
        }
    }

    public static boolean c(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1594259a", new Object[]{intent, context})).booleanValue();
        }
        if (intent == null || context == null) {
            return false;
        }
        if (intent.getData() != null) {
            return d(intent.getData(), context);
        }
        TLog.loge(MODULE_NAME, (String) null, "uri or context is null");
        return false;
    }
}
