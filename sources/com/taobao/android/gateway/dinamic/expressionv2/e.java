package com.taobao.android.gateway.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tb.s3a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004967);
    }

    public e() {
        this.f7917a = DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeSerialBlock;
        this.d = "branch";
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/DinamicSerialBlockNode");
    }

    @Override // com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode
    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("28b3ae92", new Object[]{this});
        }
        s3a.a("DXSerialBlockNode:" + this.d);
        List<DinamicASTNode> list = this.b;
        if (list == null) {
            return null;
        }
        int size = ((LinkedList) list).size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object c = ((DinamicASTNode) ((LinkedList) this.b).get(i)).c();
            if (c != null) {
                arrayList.add(c.toString());
            }
        }
        return arrayList;
    }
}
