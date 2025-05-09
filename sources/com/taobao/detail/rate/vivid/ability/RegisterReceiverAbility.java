package com.taobao.detail.rate.vivid.ability;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.LinkedHashSet;
import java.util.Set;
import tb.a07;
import tb.a8;
import tb.b8;
import tb.c8;
import tb.ckf;
import tb.f8;
import tb.hr;
import tb.m8;
import tb.n8;
import tb.tk6;
import tb.u8;
import tb.w8;
import tb.wsq;
import tb.y7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RegisterReceiverAbility extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public final Set<BroadcastReceiver> b = new LinkedHashSet();
    public Context c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements w8<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final RegisterReceiverAbility f10370a = new RegisterReceiverAbility();

        /* renamed from: a */
        public RegisterReceiverAbility build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RegisterReceiverAbility) ipChange.ipc$dispatch("b9b48896", new Object[]{this, obj});
            }
            return this.f10370a;
        }

        public final RegisterReceiverAbility b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RegisterReceiverAbility) ipChange.ipc$dispatch("ac4b95be", new Object[]{this});
            }
            return this.f10370a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d39963", new Object[]{this})).longValue();
            }
            return RegisterReceiverAbility.i();
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    public static final /* synthetic */ long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e4f30e4", new Object[0])).longValue();
        }
        return -855788324222098774L;
    }

    public static /* synthetic */ Object ipc$super(RegisterReceiverAbility registerReceiverAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/RegisterReceiverAbility");
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e209ac10", new Object[]{this});
            return;
        }
        Context context = this.c;
        if (context != null) {
            for (BroadcastReceiver broadcastReceiver : this.b) {
                LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
            }
        }
        this.c = null;
    }

    /* renamed from: k */
    public c8<?> f(n8 n8Var, final tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        ckf.g(tk6Var, "runtimeContext");
        ckf.g(u8Var, "akiAbilityCallback");
        this.c = tk6Var.d();
        String str = null;
        if (TextUtils.isEmpty(n8Var != null ? n8Var.i("action") : null)) {
            return new b8(new a8(-10001, "error info = action is null"), true);
        }
        BroadcastReceiver registerReceiverAbility$onExecuteWithData$mLoginReceiver$1 = new BroadcastReceiver() { // from class: com.taobao.detail.rate.vivid.ability.RegisterReceiverAbility$onExecuteWithData$mLoginReceiver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(RegisterReceiverAbility$onExecuteWithData$mLoginReceiver$1 registerReceiverAbility$onExecuteWithData$mLoginReceiver$12, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/RegisterReceiverAbility$onExecuteWithData$mLoginReceiver$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                hr d;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                ckf.g(context, "context");
                ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                if (!TextUtils.isEmpty(intent.getAction())) {
                    Bundle extras = intent.getExtras();
                    JSONObject jSONObject = new JSONObject();
                    if (extras != null) {
                        for (String str2 : extras.keySet()) {
                            jSONObject.put(str2, extras.get(str2));
                        }
                    }
                    y7 a2 = tk6.this.a();
                    if (!(a2 == null || (d = a2.d()) == null)) {
                        d.b(intent.getAction(), jSONObject);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        if (n8Var != null) {
            str = n8Var.i("action");
        }
        if (str != null) {
            for (String str2 : wsq.z0(str, new String[]{";"}, false, 0, 6, null)) {
                intentFilter.addAction(str2);
            }
        }
        LocalBroadcastManager.getInstance(tk6Var.d()).registerReceiver(registerReceiverAbility$onExecuteWithData$mLoginReceiver$1, intentFilter);
        this.b.add(registerReceiverAbility$onExecuteWithData$mLoginReceiver$1);
        return new f8();
    }
}
