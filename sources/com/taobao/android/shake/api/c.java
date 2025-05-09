package com.taobao.android.shake.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rgp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final c f9372a = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9373a = 3;
        public final boolean b = true;
        public final int c = 2;
        public int d = 500;
        public float e = 0.5f;
        public boolean f = false;

        static {
            t2o.a(763363335);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a();
    }

    static {
        t2o.a(763363334);
    }

    public static c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f8e2c95b", new Object[0]);
        }
        return f9372a;
    }

    public void a(Context context, b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb18ea3", new Object[]{this, context, bVar, aVar});
        } else {
            rgp.f().k(context, bVar, aVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe7a23d", new Object[]{this});
        } else {
            rgp.f().l();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93503ee0", new Object[]{this});
        } else {
            rgp.f().m();
        }
    }
}
