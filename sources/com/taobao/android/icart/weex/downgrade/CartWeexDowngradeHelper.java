package com.taobao.android.icart.weex.downgrade;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.TradeHybridInstanceManager;
import com.taobao.android.icart.weex.impl.WeexFragmentProxyImpl;
import com.taobao.tao.Globals;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartWeexDowngradeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public WeexDowngradeReceiver f8056a;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/android/icart/weex/downgrade/CartWeexDowngradeHelper$WeexDowngradeReceiver;", "Landroid/content/BroadcastReceiver;", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class WeexDowngradeReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeexFragmentProxyImpl f8057a;

        static {
            t2o.a(478150992);
        }

        public WeexDowngradeReceiver(WeexFragmentProxyImpl weexFragmentProxyImpl) {
            ckf.g(weexFragmentProxyImpl, pg1.ATOM_proxy);
            this.f8057a = weexFragmentProxyImpl;
        }

        public static /* synthetic */ Object ipc$super(WeexDowngradeReceiver weexDowngradeReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/downgrade/CartWeexDowngradeHelper$WeexDowngradeReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            if (ckf.b("weexDowngradeToNative", intent != null ? intent.getAction() : null)) {
                WeexFragmentProxyImpl weexFragmentProxyImpl = this.f8057a;
                String stringExtra = intent.getStringExtra("reason");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                weexFragmentProxyImpl.a(stringExtra);
                TradeHybridInstanceManager.INSTANCE.destroyPreInstance();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478150991);
        }

        public a() {
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154a7d58", new Object[]{this, str});
                return;
            }
            ckf.g(str, "reason");
            Intent intent = new Intent("weexDowngradeToNative");
            intent.putExtra("reason", str);
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478150990);
    }

    public final void a(WeexFragmentProxyImpl weexFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faad2d22", new Object[]{this, weexFragmentProxyImpl});
            return;
        }
        ckf.g(weexFragmentProxyImpl, pg1.ATOM_proxy);
        if (this.f8056a == null) {
            this.f8056a = new WeexDowngradeReceiver(weexFragmentProxyImpl);
            IntentFilter intentFilter = new IntentFilter("weexDowngradeToNative");
            LocalBroadcastManager instance = LocalBroadcastManager.getInstance(Globals.getApplication());
            WeexDowngradeReceiver weexDowngradeReceiver = this.f8056a;
            ckf.d(weexDowngradeReceiver);
            instance.registerReceiver(weexDowngradeReceiver, intentFilter);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fca75af", new Object[]{this});
            return;
        }
        WeexDowngradeReceiver weexDowngradeReceiver = this.f8056a;
        if (weexDowngradeReceiver != null) {
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(weexDowngradeReceiver);
        }
    }
}
