package com.taobao.android.ultronx.engine;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import tb.dng;
import tb.fr2;
import tb.jwt;
import tb.m5e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UltronEngine extends fr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UltronContext mContext;
    private InnerUltronEngineCallback mInnerCallback;

    static {
        t2o.a(939524105);
    }

    public UltronEngine(CPointer cPointer) {
        super(cPointer);
    }

    public static native long _generateUltronEngine(long j);

    public static UltronEngine generateUltronEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronEngine) ipChange.ipc$dispatch("7ddea38e", new Object[0]);
        }
        if (!dng.i()) {
            dng.h();
        } else if (System.currentTimeMillis() - dng.d() > 3000) {
            dng.a();
        }
        long _generateUltronEngine = _generateUltronEngine(0L);
        UltronEngine ultronEngine = new UltronEngine(new CPointer(_generateUltronEngine));
        InnerUltronEngineCallback innerUltronEngineCallback = new InnerUltronEngineCallback(ultronEngine);
        ultronEngine.mInnerCallback = innerUltronEngineCallback;
        long _registerCallback = ultronEngine._registerCallback(_generateUltronEngine, innerUltronEngineCallback);
        ultronEngine.mInnerCallback.mPointer = new CPointer(_registerCallback);
        return ultronEngine;
    }

    public static /* synthetic */ Object ipc$super(UltronEngine ultronEngine, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/engine/UltronEngine");
    }

    public native long _getUltronContext(long j);

    public native void _parse(long j, String str);

    public native void _parseDelta(long j, String str);

    public native void _parseDeltaSync(long j, String str);

    public native void _parseSync(long j, String str);

    public native long _registerCallback(long j, InnerUltronEngineCallback innerUltronEngineCallback);

    public UltronContext getUltronContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronContext) ipChange.ipc$dispatch("77b65ab1", new Object[]{this});
        }
        UltronContext ultronContext = this.mContext;
        if (ultronContext != null) {
            return ultronContext;
        }
        UltronContext ultronContext2 = new UltronContext(new CPointer(_getUltronContext(this.mPointer.f9875a)));
        this.mContext = ultronContext2;
        return ultronContext2;
    }

    public void parse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
            return;
        }
        jwt.a();
        _parse(this.mPointer.f9875a, str);
    }

    public void parseDelta(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c919196", new Object[]{this, str});
            return;
        }
        jwt.a();
        _parseDelta(this.mPointer.f9875a, str);
    }

    public void parseDeltaSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f88791", new Object[]{this, str});
            return;
        }
        jwt.a();
        _parseDeltaSync(this.mPointer.f9875a, str);
    }

    public void parseSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb98bff", new Object[]{this, str});
            return;
        }
        jwt.a();
        _parseSync(this.mPointer.f9875a, str);
    }

    public void registerCallback(m5e m5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c5f2dd", new Object[]{this, m5eVar});
        } else {
            this.mInnerCallback.getClass();
        }
    }
}
