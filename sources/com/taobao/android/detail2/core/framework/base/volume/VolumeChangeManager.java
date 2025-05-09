package com.taobao.android.detail2.core.framework.base.volume;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.alibaba.ability.impl.device.VolumeChangeListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.cxj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class VolumeChangeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cxj f7090a;
    public final VolumeChangedBroadcastReceiver b;
    public List<b> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class VolumeChangedBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321722);
        }

        public VolumeChangedBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(VolumeChangedBroadcastReceiver volumeChangedBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/volume/VolumeChangeManager$VolumeChangedBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TextUtils.equals(intent.getAction(), VolumeChangeListener.VOLUME_CHANGED_ACTION) && intent.getIntExtra(VolumeChangeListener.EXTRA_VOLUME_STREAM_TYPE, -1) == 3) {
                int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", -1);
                if (VolumeChangeManager.a(VolumeChangeManager.this) != null) {
                    for (b bVar : VolumeChangeManager.a(VolumeChangeManager.this)) {
                        if (bVar != null) {
                            bVar.a(intExtra, intExtra2);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(int i, int i2);
    }

    static {
        t2o.a(352321719);
    }

    public VolumeChangeManager(cxj cxjVar) {
        this.f7090a = cxjVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(VolumeChangeListener.VOLUME_CHANGED_ACTION);
        VolumeChangedBroadcastReceiver volumeChangedBroadcastReceiver = new VolumeChangedBroadcastReceiver();
        this.b = volumeChangedBroadcastReceiver;
        if (cxjVar != null && cxjVar.i() != null) {
            cxjVar.i().registerReceiver(volumeChangedBroadcastReceiver, intentFilter);
        }
    }

    public static /* synthetic */ List a(VolumeChangeManager volumeChangeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6738a", new Object[]{volumeChangeManager});
        }
        return volumeChangeManager.c;
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd8fdaf", new Object[]{this, bVar});
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (bVar != null && !this.c.contains(bVar)) {
            this.c.add(bVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        cxj cxjVar = this.f7090a;
        if (!(cxjVar == null || cxjVar.i() == null || this.b == null)) {
            this.f7090a.i().unregisterReceiver(this.b);
        }
        this.c = null;
    }
}
