package tb;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.android.weex_framework.MUSDKInstance;
import io.unicorn.adapter.UnicornAdapterJNI;
import io.unicorn.embedding.engine.a;
import io.unicorn.embedding.engine.b;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class g5x implements c6x {
    public static final AtomicInteger f = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public b f19744a;
    public final Context b;
    public final String c;
    public String[] d;
    public String[] e;

    static {
        t2o.a(945815617);
        t2o.a(982516038);
    }

    public g5x(Context context) {
        this(context, null);
    }

    @Override // tb.c6x
    public String a(MUSDKInstance mUSDKInstance, String[] strArr) {
        String f2 = f(String.valueOf(mUSDKInstance.getInstanceId()));
        if (e(f2, strArr) != null) {
            return f2;
        }
        return null;
    }

    @Override // tb.c6x
    public void b() {
        a e;
        String str = this.c;
        if (!TextUtils.isEmpty(str) && (e = e(str, null)) != null) {
            e.n();
        }
    }

    public final a c(String str, String[] strArr) {
        Context context;
        if (!UnicornAdapterJNI.instance().libraryLoaded() || (context = this.b) == null) {
            return null;
        }
        d(this.d, this.e);
        b bVar = this.f19744a;
        if (bVar == null) {
            return null;
        }
        a a2 = bVar.a(context, strArr);
        bs9.b().d(str, a2);
        return a2;
    }

    public final void d(String[] strArr, String[] strArr2) {
        if (this.f19744a == null) {
            if (!UnicornAdapterJNI.instance().libraryLoaded()) {
                if (strArr != null) {
                    this.d = strArr;
                }
                if (strArr2 != null) {
                    this.e = strArr2;
                    return;
                }
                return;
            }
            this.f19744a = new b(this.b, strArr, strArr2);
        }
    }

    public final a e(String str, String[] strArr) {
        a a2 = bs9.b().a(str);
        if (a2 == null) {
            return c(str, strArr);
        }
        return a2;
    }

    public final String f(String str) {
        return "dom_uni_engine_" + str;
    }

    public g5x(Context context, String[] strArr) {
        this(context, strArr, null);
    }

    public g5x(Context context, String[] strArr, String[] strArr2) {
        this.b = context;
        d(strArr, strArr2);
        String str = "dom_uni_engine_main" + f.incrementAndGet();
        this.c = str;
        c(str, null);
    }
}
