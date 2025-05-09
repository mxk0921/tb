package com.alibaba.ability.impl.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class VolumeChangeListener extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";

    /* renamed from: a  reason: collision with root package name */
    public vq f1935a;
    public final AudioManager b;
    public final Context c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(103809029);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(103809028);
    }

    public VolumeChangeListener(Context context) {
        ckf.g(context, "context");
        this.c = context;
        Object systemService = context.getSystemService("audio");
        ckf.d(systemService);
        this.b = (AudioManager) systemService;
    }

    public static /* synthetic */ Object ipc$super(VolumeChangeListener volumeChangeListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/device/VolumeChangeListener");
    }

    public final VolumeChangeListener a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VolumeChangeListener) ipChange.ipc$dispatch("66f482ed", new Object[]{this});
        }
        this.c.registerReceiver(this, new IntentFilter(VOLUME_CHANGED_ACTION));
        return this;
    }

    public final VolumeChangeListener b(vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VolumeChangeListener) ipChange.ipc$dispatch("ae9528ff", new Object[]{this, vqVar});
        }
        this.f1935a = vqVar;
        return this;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            return;
        }
        try {
            this.c.unregisterReceiver(this);
        } catch (Throwable unused) {
        }
        this.f1935a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && ckf.b(VOLUME_CHANGED_ACTION, intent.getAction()) && intent.getIntExtra(EXTRA_VOLUME_STREAM_TYPE, -1) == 3) {
            int streamVolume = (this.b.getStreamVolume(3) * 100) / this.b.getStreamMaxVolume(3);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) Constant.PROP_TTS_VOLUME, (String) Integer.valueOf(streamVolume));
            vq vqVar = this.f1935a;
            if (vqVar != null) {
                vqVar.a(new FinishResult(jSONObject, "onVolumeChanged"));
            }
        }
    }
}
