package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p6m extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f25911a;
        public final View b;
        public String c;
        public final String d;

        static {
            t2o.a(912262423);
        }

        public a(p6m p6mVar, int i, String str, String str2, View view, float f, float f2) {
            this.f25911a = str;
            this.d = str2;
            this.b = view;
        }
    }

    static {
        t2o.a(912262422);
    }

    public p6m(int i, String str, String str2, View view, float f, float f2) {
        this.b = new a(this, i, str, str2, view, f, f2);
    }

    public static /* synthetic */ Object ipc$super(p6m p6mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/message/PlayVideoMessage");
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d7df6bdb", new Object[]{this});
        }
        return this.b;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa68f07", new Object[]{this, new Boolean(z)});
        } else {
            this.b.getClass();
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
        } else {
            this.b.getClass();
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac89ff", new Object[]{this, str});
        } else {
            this.b.getClass();
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
        } else {
            this.b.c = str;
        }
    }
}
