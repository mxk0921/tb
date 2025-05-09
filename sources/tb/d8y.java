package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.unionpay.utils.UPUtils;
import com.unionpay.utils.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executors;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d8y implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f17656a;
    public final k6e b;
    public final WeakReference c;
    public final String d;
    public final String e;
    public volatile boolean f = false;

    public d8y(k6e k6eVar, Context context, String str, String str2) {
        this.c = null;
        if (context != null) {
            this.c = new WeakReference(context);
        }
        this.b = k6eVar;
        this.f17656a = new Handler(Looper.getMainLooper(), this);
        this.d = str;
        this.e = str2;
    }

    public static synchronized String b(Context context) {
        String d;
        synchronized (d8y.class) {
            d = a.d(UPUtils.c(context, "direct_configs"), UPUtils.c(context, "direct_mode"));
        }
        return d;
    }

    public static synchronized void d(Context context, String str, String str2) {
        synchronized (d8y.class) {
            UPUtils.g(context, str2, "direct_configs");
            UPUtils.g(context, str, "direct_mode");
        }
    }

    public static /* synthetic */ void g(d8y d8yVar, String str) {
        ArrayList arrayList;
        try {
            String d = a.d(str, d8yVar.d);
            if (!TextUtils.isEmpty(d)) {
                arrayList = a.n(d8yVar.h(), d);
            } else {
                arrayList = null;
            }
            d8yVar.f(arrayList);
            if (!TextUtils.isEmpty(d)) {
                d(d8yVar.h(), d8yVar.d, str);
            }
        } catch (Exception unused) {
        }
    }

    public final void c() {
        Context h = h();
        Handler handler = this.f17656a;
        if (h != null) {
            String l = UPUtils.l(a.a(this.d));
            String b = b(h());
            if (!TextUtils.isEmpty(b)) {
                f(a.n(h(), b));
            }
            if (!TextUtils.isEmpty(l)) {
                Executors.newSingleThreadExecutor().execute(new u8y(this, l));
            } else if (handler != null) {
                handler.sendEmptyMessage(1010);
            }
        } else if (handler != null) {
            handler.sendEmptyMessage(1011);
        }
    }

    public final void e(String str, String str2) {
        if (this.b != null && !this.f) {
            this.f = true;
            this.b.onError(str, str2);
        }
    }

    public final void f(ArrayList arrayList) {
        Handler handler = this.f17656a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 1007;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("directApps", arrayList);
            obtainMessage.setData(bundle);
            handler.sendMessage(obtainMessage);
        }
    }

    public final Context h() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        String str2;
        switch (message.what) {
            case 1007:
                Bundle data = message.getData();
                if (this.b != null && !this.f) {
                    this.f = true;
                    if (data != null && data.getStringArrayList("directApps") != null) {
                        this.b.onResult(data);
                        break;
                    } else {
                        this.b.onError("03", "unknown error");
                        break;
                    }
                }
                break;
            case 1008:
            case 1009:
                str = "02";
                str2 = "network error";
                e(str, str2);
                break;
            case 1010:
                e("03", "unknown error");
                break;
            case 1011:
                str = "01";
                str2 = "parameter error";
                e(str, str2);
                break;
        }
        return true;
    }
}
