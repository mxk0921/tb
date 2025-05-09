package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class b02<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16106a;
    public final Bundle b;
    public final WeakReference<Context> c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class a<R extends b02, B extends a<R, B, T>, T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f16107a;
        public final String b;
        public Bundle c;

        static {
            t2o.a(676331649);
        }

        public a(Context context, String str) {
            this.f16107a = context;
            this.b = str;
        }

        public final R a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (R) ((b02) ipChange.ipc$dispatch("1a841e1e", new Object[]{this}));
            }
            e();
            return b();
        }

        public abstract R b();

        public abstract B c();

        public B d(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (B) ((a) ipChange.ipc$dispatch("84b0218c", new Object[]{this, bundle}));
            }
            this.c = bundle;
            return c();
        }

        public abstract void e();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b<F> {
        void a(String str, Bundle bundle);

        void b(F f, Bundle bundle);
    }

    static {
        t2o.a(676331648);
    }

    public b02(Context context, String str, Bundle bundle) {
        this.c = new WeakReference<>(context);
        this.f16106a = str;
        this.b = bundle;
    }

    public Bundle a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("673e5703", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
        }
        return this.f16106a;
    }

    public WeakReference<Context> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("558be4e", new Object[]{this});
        }
        return this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return this.d;
    }

    public abstract b<T> e();

    public abstract String f();

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f67230", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
