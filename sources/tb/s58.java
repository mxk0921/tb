package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s58 implements c2i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b f27805a = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f27806a;
        public String b;

        static {
            t2o.a(85983261);
        }

        public b(s58 s58Var) {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            } else {
                this.b = null;
            }
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
            }
            if (TextUtils.isEmpty(null)) {
                return this.f27806a;
            }
            return null;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fe311996", new Object[]{this});
            }
            if (TextUtils.isEmpty(null)) {
                return this.b;
            }
            return null;
        }
    }

    static {
        t2o.a(85983259);
        t2o.a(85983264);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("992695c7", new Object[]{this});
        }
        return this.f27805a.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd9dbb51", new Object[]{this});
        }
        return this.f27805a.f27806a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe311996", new Object[]{this});
        }
        return this.f27805a.c();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f27805a.b();
    }

    public void e(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda540c", new Object[]{this, wXSDKInstance, str, str2});
        }
    }

    public final void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb17c81", new Object[]{this, str, str2});
            return;
        }
        this.f27805a.a();
        b bVar = this.f27805a;
        bVar.f27806a = str;
        bVar.b = str2;
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902dfd7e", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            f(str, str2);
        }
    }
}
