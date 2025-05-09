package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ao6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15894a;
    public String b;
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ao6 f15895a = new ao6();

        static {
            t2o.a(444597066);
        }

        public static /* synthetic */ ao6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ao6) ipChange.ipc$dispatch("9f7892e0", new Object[0]);
            }
            return f15895a;
        }
    }

    static {
        t2o.a(444597064);
    }

    public static ao6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ao6) ipChange.ipc$dispatch("7aa5c73a", new Object[0]);
        }
        return b.a();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        if (!this.c) {
            c();
        }
        return this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de2fe6be", new Object[]{this})).booleanValue();
        }
        if (!this.c) {
            c();
        }
        return this.f15894a;
    }

    public ao6() {
        this.f15894a = false;
        this.b = "-1";
        this.c = false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Context x = DinamicXEngine.x();
        if (x != null) {
            int identifier = x.getResources().getIdentifier("ttid", "string", x.getPackageName());
            if (identifier <= 0) {
                this.b = "-1";
                this.f15894a = false;
                this.c = true;
                return;
            }
            String string = x.getString(identifier);
            this.b = string;
            this.f15894a = "212200".equals(string);
            this.c = true;
        }
    }
}
