package com.alibaba.ability.impl.device;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import java.util.Map;
import kotlin.Deprecated;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class DeviceAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(103809027);
    }

    public static /* synthetic */ Object ipc$super(DeviceAbility deviceAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/device/DeviceAbility");
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        ExecuteResult executeResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        try {
            switch (str.hashCode()) {
                case -896332056:
                    if (str.equals("getMediaVolume")) {
                        executeResult = getMediaVolume(kdbVar, map, vqVar);
                        break;
                    }
                    ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
                    executeResult = aVar.a("api " + str + " not found");
                    break;
                case -715102788:
                    if (str.equals("getScreenType")) {
                        executeResult = getScreenType(kdbVar, map, vqVar);
                        break;
                    }
                    ErrorResult.a.C0055a aVar2 = ErrorResult.a.Companion;
                    executeResult = aVar2.a("api " + str + " not found");
                    break;
                case -75444956:
                    if (str.equals("getInfo")) {
                        executeResult = getInfo(kdbVar, map, vqVar);
                        break;
                    }
                    ErrorResult.a.C0055a aVar22 = ErrorResult.a.Companion;
                    executeResult = aVar22.a("api " + str + " not found");
                    break;
                case -75106384:
                    if (str.equals(NetworkAbility.API_GET_TYPE)) {
                        executeResult = getType(kdbVar, map, vqVar);
                        break;
                    }
                    ErrorResult.a.C0055a aVar222 = ErrorResult.a.Companion;
                    executeResult = aVar222.a("api " + str + " not found");
                    break;
                case 279420431:
                    if (str.equals("requestMediaVolume")) {
                        executeResult = requestMediaVolume(kdbVar, map, vqVar);
                        break;
                    }
                    ErrorResult.a.C0055a aVar2222 = ErrorResult.a.Companion;
                    executeResult = aVar2222.a("api " + str + " not found");
                    break;
                case 1174769456:
                    if (str.equals("setMediaVolumeListener")) {
                        executeResult = setMediaVolumeListener(kdbVar, map, vqVar);
                        break;
                    }
                    ErrorResult.a.C0055a aVar22222 = ErrorResult.a.Companion;
                    executeResult = aVar22222.a("api " + str + " not found");
                    break;
                case 1410053385:
                    if (str.equals("unsetMediaVolumeListener")) {
                        executeResult = unsetMediaVolumeListener(kdbVar, map, vqVar);
                        break;
                    }
                    ErrorResult.a.C0055a aVar222222 = ErrorResult.a.Companion;
                    executeResult = aVar222222.a("api " + str + " not found");
                    break;
                default:
                    ErrorResult.a.C0055a aVar2222222 = ErrorResult.a.Companion;
                    executeResult = aVar2222222.a("api " + str + " not found");
                    break;
            }
            return executeResult;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            return new ErrorResult("500", message, (Map) null, 4, (a07) null);
        }
    }

    public abstract ExecuteResult getInfo(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar);

    @Deprecated(message = "请使用requestMediaVolume")
    public abstract ExecuteResult getMediaVolume(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar);

    public abstract ExecuteResult getScreenType(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar);

    public abstract ExecuteResult getType(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar);

    public abstract ExecuteResult requestMediaVolume(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar);

    public abstract ExecuteResult setMediaVolumeListener(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar);

    public abstract ExecuteResult unsetMediaVolumeListener(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar);
}
