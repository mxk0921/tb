package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vu5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static jvb f30262a;
    public static wu5 b;

    static {
        t2o.a(444596481);
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c95d4496", new Object[]{new Float(f)})).floatValue();
        }
        if (f()) {
            return c(f);
        }
        return f;
    }

    public static float b(DXRuntimeContext dXRuntimeContext, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7868b0c5", new Object[]{dXRuntimeContext, new Float(f)})).floatValue();
        }
        if (f()) {
            return d(dXRuntimeContext, f);
        }
        return f;
    }

    public static float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48b6a432", new Object[]{new Float(f)})).floatValue();
        }
        wu5 wu5Var = b;
        if (wu5Var == null) {
            return f;
        }
        return wu5Var.b(Float.valueOf(f)).floatValue();
    }

    public static float d(DXRuntimeContext dXRuntimeContext, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eea31f61", new Object[]{dXRuntimeContext, new Float(f)})).floatValue();
        }
        wu5 e = e(dXRuntimeContext.f());
        if (e == null) {
            return f;
        }
        return e.a(dXRuntimeContext, Float.valueOf(f)).floatValue();
    }

    public static wu5 e(DXEngineConfig dXEngineConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wu5) ipChange.ipc$dispatch("f66f61e7", new Object[]{dXEngineConfig});
        }
        if (dXEngineConfig == null) {
            return null;
        }
        return dXEngineConfig.f();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4e0938b", new Object[0])).booleanValue();
        }
        jvb jvbVar = f30262a;
        if (jvbVar == null) {
            return false;
        }
        return jvbVar.a();
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ce2265", new Object[]{str})).booleanValue();
        }
        return zg5.t4(str);
    }
}
