package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.utils.nav.NavForResultActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class jnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jnj INSTANCE = new jnj();

    /* renamed from: a  reason: collision with root package name */
    public static a f22092a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(int i, int i2, Intent intent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Bundle f22093a;
        public int b = -1;
        public String c;

        static {
            t2o.a(843055410);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e6c70505", new Object[]{this});
            }
            return null;
        }

        public final Bundle b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("f1a60865", new Object[]{this});
            }
            return this.f22093a;
        }

        public final Bundle c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("d234f1f3", new Object[]{this});
            }
            return null;
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c6a001a", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.c;
        }

        public final b f(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("15490ddd", new Object[]{this, bundle});
            }
            this.f22093a = bundle;
            return this;
        }

        public final b g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b4b5dae6", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public final b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("11b9f834", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }
    }

    static {
        t2o.a(843055408);
    }

    public final void a(Context context, b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c67acc1", new Object[]{this, context, bVar, aVar});
            return;
        }
        ckf.g(context, "mContext");
        ckf.g(bVar, "task");
        Intent intent = new Intent();
        if (bVar.b() != null) {
            intent.putExtra("navExtras", bVar.b());
        }
        if (bVar.c() != null) {
            intent.putExtra("navOptions", bVar.c());
        }
        if (!TextUtils.isEmpty(bVar.e())) {
            intent.putExtra("navUri", bVar.e());
        }
        if (!TextUtils.isEmpty(bVar.a())) {
            intent.putExtra("navCategory", bVar.a());
        }
        if (bVar.d() != -1) {
            intent.putExtra("navResultCode", bVar.d());
        }
        intent.setClass(context, NavForResultActivity.class);
        f22092a = aVar;
        context.startActivity(intent);
    }

    public final void b(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        a aVar = f22092a;
        if (aVar != null) {
            aVar.a(i, i2, intent);
        }
    }
}
