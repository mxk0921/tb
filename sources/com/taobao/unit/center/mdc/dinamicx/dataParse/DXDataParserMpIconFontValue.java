package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import kotlin.Metadata;
import tb.evb;
import tb.ic1;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpIconFontValue;", "Ltb/evb;", "<init>", "()V", "", "", "operationList", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "runtimeParam", "evalWithArgs", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "mProxy", "Ltb/evb;", "getMProxy", "()Ltb/evb;", "setMProxy", "(Ltb/evb;)V", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DXDataParserMpIconFontValue implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DXDataParserMpIconFontValue INSTANCE = new DXDataParserMpIconFontValue();
    private static evb mProxy;

    static {
        t2o.a(529531116);
        t2o.a(444596865);
    }

    private DXDataParserMpIconFontValue() {
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        Object evalWithArgs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        evb evbVar = mProxy;
        if (evbVar != null && (evalWithArgs = evbVar.evalWithArgs(objArr, dXRuntimeContext)) != null) {
            return evalWithArgs;
        }
        Object obj2 = null;
        if (objArr != null) {
            obj = ic1.L(objArr, 0);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    public final evb getMProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (evb) ipChange.ipc$dispatch("f9a46995", new Object[]{this});
        }
        return mProxy;
    }

    public final void setMProxy(evb evbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa07e05d", new Object[]{this, evbVar});
        } else {
            mProxy = evbVar;
        }
    }
}
