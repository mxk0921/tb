package com.taobao.android.dinamicx.elder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.TBElder;
import tb.h36;
import tb.jvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXElderImpl implements jvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7308a;
    public boolean b;

    public DXElderImpl(Context context) {
        try {
            LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.elder.DXElderImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/elder/DXElderImpl$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    DXElderImpl.c(DXElderImpl.this, TBElder.b());
                    h36.b("DXElderImpl", "收到适老化的广播 isElder: " + DXElderImpl.b(DXElderImpl.this));
                }
            }, new IntentFilter(TBElder.ACTION_TBELDER_VALUE_CHANGED));
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ boolean b(DXElderImpl dXElderImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5a10dd0", new Object[]{dXElderImpl})).booleanValue();
        }
        return dXElderImpl.f7308a;
    }

    public static /* synthetic */ boolean c(DXElderImpl dXElderImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8f6c18e", new Object[]{dXElderImpl, new Boolean(z)})).booleanValue();
        }
        dXElderImpl.f7308a = z;
        return z;
    }

    @Override // tb.jvb
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4e0938b", new Object[]{this})).booleanValue();
        }
        if (this.b) {
            return this.f7308a;
        }
        boolean b = TBElder.b();
        this.f7308a = b;
        this.b = true;
        return b;
    }
}
