package com.alipay.mobile.common.logging.util.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class RigorousNetworkConnReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context d;
    public Boolean c = null;

    /* renamed from: a  reason: collision with root package name */
    public int f4004a = -1;
    public int b = -1;

    public RigorousNetworkConnReceiver(Context context) {
        this.d = context;
    }

    public static /* synthetic */ Object ipc$super(RigorousNetworkConnReceiver rigorousNetworkConnReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/util/network/RigorousNetworkConnReceiver");
    }

    public final int a(Context context) {
        NetworkInfo networkInfo;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue();
        }
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            th.toString();
            networkInfo = null;
        }
        if (networkInfo == null) {
            this.c = Boolean.FALSE;
            return 0;
        }
        networkInfo.isAvailable();
        boolean isConnected = networkInfo.isConnected();
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        networkInfo.getExtraInfo();
        if (this.f4004a != -1 && this.b != -1 && (bool = this.c) != null && bool.booleanValue() == isConnected && this.f4004a == type && this.b == subtype) {
            return 2;
        }
        this.c = Boolean.valueOf(isConnected);
        this.f4004a = type;
        this.b = subtype;
        Objects.toString(networkInfo.getDetailedState());
        networkInfo.hashCode();
        networkInfo.toString();
        if (!this.c.booleanValue()) {
            return 0;
        }
        return 1;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            try {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    int a2 = a(context);
                    if (a2 == 0) {
                        onReceivee(context, intent);
                    } else if (a2 == 1) {
                        onReceivee(context, intent);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public abstract void onReceivee(Context context, Intent intent);

    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        try {
            this.d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception unused) {
        }
    }

    public void unregister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            return;
        }
        try {
            this.d.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }
}
