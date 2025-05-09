package com.taobao.android.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.DinamicASTNode;
import java.util.LinkedList;
import tb.t2o;
import tb.ym7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596303);
    }

    public b() {
        this.f7260a = DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeBranchBlock;
        this.d = "branch";
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/DinamicBranchBlockNode");
    }

    @Override // com.taobao.android.dinamic.expressionv2.DinamicASTNode
    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("28b3ae92", new Object[]{this});
        }
        ym7.h("DXBranchBlockNode:" + this.d);
        int size = ((LinkedList) this.b).size();
        ym7.h("children.size():" + size);
        if (size <= 1) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            Object c = ((DinamicASTNode) ((LinkedList) this.b).get(i)).c();
            if (c != null) {
                return c;
            }
        }
        return null;
    }
}
