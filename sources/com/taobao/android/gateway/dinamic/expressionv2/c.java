package com.taobao.android.gateway.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.s3a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004965);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 682864274) {
            return super.c();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/DinamicConstNode");
    }

    @Override // com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode
    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("28b3ae92", new Object[]{this});
        }
        s3a.a("ConstName:" + this.d);
        return super.c();
    }
}
