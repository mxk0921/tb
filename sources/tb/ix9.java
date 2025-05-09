package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ix9 extends b02<Fragment> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final b02.b<Fragment> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends b02.a<ix9, b, Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public b02.b d;

        static {
            t2o.a(676331653);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/request/FragmentRequest$Builder");
        }

        @Override // tb.b02.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4060229d", new Object[]{this});
                return;
            }
            Context context = this.f16107a;
            if (context == null || !(context instanceof Activity)) {
                throw new IllegalArgumentException("context can not be null and must be activity context!");
            }
            String str = this.b;
            if (str == null || TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("className can not be null");
            }
        }

        public b f(b02.b<Fragment> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("10f011a4", new Object[]{this, bVar});
            }
            this.d = bVar;
            return c();
        }

        /* renamed from: g */
        public ix9 b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ix9) ipChange.ipc$dispatch("e5fd2be2", new Object[]{this});
            }
            return new ix9(this.f16107a, this.b, null, this.d);
        }

        /* renamed from: h */
        public b c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b0b18c84", new Object[]{this});
            }
            return this;
        }

        public b(Context context, String str) {
            super(context, str);
        }
    }

    static {
        t2o.a(676331651);
    }

    public static b h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("be7d01e1", new Object[]{context, str});
        }
        return new b(context, str);
    }

    public static /* synthetic */ Object ipc$super(ix9 ix9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/request/FragmentRequest");
    }

    @Override // tb.b02
    public b02.b<Fragment> e() {
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
        return "fragment";
    }

    public ix9(Context context, String str, Bundle bundle, b02.b<Fragment> bVar) {
        super(context, str, bundle);
        this.e = bVar;
    }
}
