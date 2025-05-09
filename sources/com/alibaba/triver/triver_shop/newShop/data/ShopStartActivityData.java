package com.alibaba.triver.triver_shop.newShop.data;

import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.ckf;
import tb.npp;
import tb.r54;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopStartActivityData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopStartActivityData INSTANCE = new ShopStartActivityData();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<Long, Bundle> f3087a = new HashMap<>();
    public static final HashMap<Long, Intent> b = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3088a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f3088a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            throw new Exception(ckf.p(this.f3088a, this.b));
        }
    }

    static {
        t2o.a(766509464);
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f9f63bfa", new Object[0]);
        }
        return f3087a;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796b07c1", new Object[]{this});
        } else if (r54.h()) {
            npp.Companion.b("you should call ShopStartActivityData setBundleData in MainThread !!! \n");
            new Thread(new a("you should call ShopStartActivityData setBundleData in MainThread !!! \n", new Exception().getStackTrace().toString())).start();
        }
    }

    public final HashMap<Long, Intent> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("bc87083d", new Object[]{this});
        }
        return b;
    }

    public final Bundle d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("a5a38bd0", new Object[]{this, new Long(j)});
        }
        b();
        return f3087a.get(Long.valueOf(j));
    }

    public final void e(long j, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1149e5", new Object[]{this, new Long(j), bundle});
            return;
        }
        ckf.g(bundle, "bundle");
        b();
        f3087a.put(Long.valueOf(j), bundle);
        r54.E(new ShopStartActivityData$setBundleData$1(j, bundle), 10000L);
    }
}
