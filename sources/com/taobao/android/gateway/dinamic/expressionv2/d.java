package com.taobao.android.gateway.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode;
import java.util.ArrayList;
import java.util.LinkedList;
import tb.dm7;
import tb.f5a;
import tb.g5a;
import tb.h5a;
import tb.jm7;
import tb.s3a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004966);
    }

    public d() {
        this.f7917a = DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod;
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/DinamicMethodNode");
    }

    @Override // com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode
    public Object c() {
        h5a h5aVar;
        g5a g5aVar;
        f5a b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("28b3ae92", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        int size = ((LinkedList) this.b).size();
        for (int i = 0; i < size; i++) {
            Object c = ((DinamicASTNode) ((LinkedList) this.b).get(i)).c();
            if (c != null) {
                arrayList.add(c);
            } else {
                arrayList.add(dm7.NL);
            }
        }
        String str = this.d;
        if (str != null) {
            h5aVar = jm7.a(str);
            if (h5aVar == null && (b = (g5aVar = (g5a) this.c).b()) != null) {
                try {
                    return b.b(this.d, g5aVar).a(arrayList);
                } catch (Throwable th) {
                    s3a.a("DinamicExpresstion", th.getMessage(), "dataProviderParser parse express failed, parser=", h5aVar.getClass().getName());
                    return null;
                }
            }
        } else {
            h5aVar = null;
        }
        s3a.a("MethodName:" + this.d);
        if (h5aVar == null) {
            return this.d;
        }
        try {
            s3a.a("args:" + arrayList.toString());
            return h5aVar.a(arrayList, (g5a) this.c);
        } catch (Throwable th2) {
            s3a.a("DinamicExpresstion", th2.getMessage(), "parse express failed, parser=", h5aVar.getClass().getName());
            return null;
        }
    }
}
