package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o6m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f25167a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f25168a;
        public final View b;
        public final float c;
        public final float d;
        public final String e;

        static {
            t2o.a(912262303);
        }

        public a(o6m o6mVar, int i, String str, String str2, View view, float f, float f2) {
            this.f25168a = str;
            this.e = str2;
            this.b = view;
            this.c = f;
            this.d = f2;
        }
    }

    static {
        t2o.a(912262302);
    }

    public o6m(int i, String str, String str2, View view, float f, float f2) {
        this.f25167a = new a(this, i, str, str2, view, f, f2);
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return this.f25167a;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa68f07", new Object[]{this, new Boolean(z)});
        } else {
            this.f25167a.getClass();
        }
    }
}
