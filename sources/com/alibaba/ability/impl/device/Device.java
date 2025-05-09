package com.alibaba.ability.impl.device;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.Map;
import kotlin.collections.a;
import tb.a07;
import tb.cjf;
import tb.ckf;
import tb.jpu;
import tb.jzb;
import tb.kdb;
import tb.t2o;
import tb.v3i;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class Device extends DeviceAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VolumeChangeListener f1934a;

    static {
        t2o.a(103809026);
    }

    public static /* synthetic */ Object ipc$super(Device device, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/device/Device");
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd5916b", new Object[]{this, context})).booleanValue();
        }
        jzb e = cjf.INSTANCE.e();
        if (e != null) {
            return e.e(context);
        }
        return false;
    }

    @Override // tb.cu
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        VolumeChangeListener volumeChangeListener = this.f1934a;
        if (volumeChangeListener != null) {
            volumeChangeListener.c();
            this.f1934a = null;
        }
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult requestMediaVolume(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("24dc7c3b", new Object[]{this, kdbVar, map, vqVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(vqVar, "callback");
        return getMediaVolume(kdbVar, map, vqVar);
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult setMediaVolumeListener(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b0f89d7a", new Object[]{this, kdbVar, map, vqVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        Context context = kdbVar.l().getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext == null) {
            return ErrorResult.a.Companion.g("Context 为空");
        }
        VolumeChangeListener volumeChangeListener = this.f1934a;
        if (volumeChangeListener != null) {
            volumeChangeListener.c();
            this.f1934a = null;
        }
        this.f1934a = new VolumeChangeListener(applicationContext).b(vqVar).a();
        return null;
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult getMediaVolume(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("3a5a52c2", new Object[]{this, kdbVar, map, vqVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(vqVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null);
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        if (systemService != null) {
            AudioManager audioManager = (AudioManager) systemService;
            int streamVolume = (audioManager.getStreamVolume(3) * 100) / audioManager.getStreamMaxVolume(3);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) Constant.PROP_TTS_VOLUME, (String) Integer.valueOf(streamVolume));
            vqVar.a(new FinishResult(jSONObject, "onData"));
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult getScreenType(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("97c0036e", new Object[]{this, kdbVar, map, vqVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null);
        }
        jzb e = cjf.INSTANCE.e();
        if (e == null || (str = e.d(context)) == null) {
            str = "NORMAL";
        }
        return new FinishResult(new JSONObject(v3i.f(jpu.a("result", str))), null, 2, null);
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult getType(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("d78264fa", new Object[]{this, kdbVar, map, vqVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null);
        }
        jzb e = cjf.INSTANCE.e();
        if (e == null || (str = e.a(context)) == null) {
            str = "PHONE";
        }
        return new FinishResult(new JSONObject(v3i.f(jpu.a("result", str))), null, 2, null);
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult unsetMediaVolumeListener(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("c6fd9f01", new Object[]{this, kdbVar, map, vqVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        VolumeChangeListener volumeChangeListener = this.f1934a;
        if (volumeChangeListener != null) {
            volumeChangeListener.c();
            this.f1934a = null;
        }
        return new FinishResult(null, null, 3, null);
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult getInfo(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("ea0dd306", new Object[]{this, kdbVar, map, vqVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(vqVar, "callback");
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.HARDWARE;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        cjf cjfVar = cjf.INSTANCE;
        jzb e = cjfVar.e();
        float f = -1.0f;
        float b = e != null ? e.b() : -1.0f;
        jzb e2 = cjfVar.e();
        if (e2 != null) {
            f = e2.c();
        }
        Context context = kdbVar.l().getContext();
        return new FinishResult(new JSONObject(a.j(jpu.a("brand", str), jpu.a("model", str2), jpu.a("system", str3), jpu.a("platform", TimeCalculator.PLATFORM_ANDROID), jpu.a("cpuType", str4), jpu.a(MainRequestParams.CPU_CORE, Integer.valueOf(availableProcessors)), jpu.a("ram", Float.valueOf(b)), jpu.a("rom", Float.valueOf(f)), jpu.a("isEmulator", context != null ? Boolean.valueOf(a(context)) : null), jpu.a("isArm64", Boolean.valueOf(Build.VERSION.SDK_INT >= 23 ? Process.is64Bit() : true)))), null, 2, null);
    }
}
