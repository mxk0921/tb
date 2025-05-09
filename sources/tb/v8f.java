package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v8f extends b02<p5c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final b02.b e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends b02.a<v8f, b, p5c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public b02.b d;

        static {
            t2o.a(676331656);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/request/InitialRequest$Builder");
        }

        @Override // tb.b02.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4060229d", new Object[]{this});
            }
        }

        public b f(b02.b<p5c> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d252fd7a", new Object[]{this, bVar});
            }
            this.d = bVar;
            return c();
        }

        /* renamed from: g */
        public v8f b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (v8f) ipChange.ipc$dispatch("4e3c6c4a", new Object[]{this});
            }
            return new v8f(this.f16107a, this.b, this.c, this.d);
        }

        /* renamed from: h */
        public b c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("906a69a", new Object[]{this});
            }
            return this;
        }

        public b(Context context, String str) {
            super(context, str);
        }
    }

    static {
        t2o.a(676331654);
    }

    public v8f(Context context, String str, Bundle bundle, b02.b bVar) {
        super(context, str, bundle);
        this.e = bVar;
    }

    public static b h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("978919d", new Object[]{context, str});
        }
        return new b(context, str);
    }

    public static /* synthetic */ Object ipc$super(v8f v8fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/request/InitialRequest");
    }

    @Override // tb.b02
    public b02.b<p5c> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("1ecda33e", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.b02
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return bdf.INITIAL;
    }
}
