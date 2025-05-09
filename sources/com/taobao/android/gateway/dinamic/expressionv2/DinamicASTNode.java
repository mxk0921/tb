package com.taobao.android.gateway.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DinamicASTNodeType f7917a;
    public List<DinamicASTNode> b;
    public Object c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum DinamicASTNodeType {
        DinamicASTNodeTypeNone,
        DinamicASTNodeTypeRoot,
        DinamicASTNodeTypeMethod,
        DinamicASTNodeTypeVar,
        DinamicASTNodeTypeConst,
        DinamicASTNodeTypeBranchBlock,
        DinamicASTNodeTypeSerialBlock;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DinamicASTNodeType dinamicASTNodeType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/DinamicASTNode$DinamicASTNodeType");
        }

        public static DinamicASTNodeType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DinamicASTNodeType) ipChange.ipc$dispatch("dca2cd29", new Object[]{str});
            }
            return (DinamicASTNodeType) Enum.valueOf(DinamicASTNodeType.class, str);
        }
    }

    static {
        t2o.a(475004962);
    }

    public void a(DinamicASTNode dinamicASTNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43964101", new Object[]{this, dinamicASTNode});
        } else if (dinamicASTNode != null) {
            if (this.b == null) {
                this.b = new LinkedList();
            }
            this.b.add(dinamicASTNode);
        }
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3b32ea", new Object[]{this, obj});
        } else if (this.c != obj) {
            this.c = obj;
            List<DinamicASTNode> list = this.b;
            if (list != null) {
                int size = ((LinkedList) list).size();
                for (int i = 0; i < size; i++) {
                    ((DinamicASTNode) ((LinkedList) this.b).get(i)).b(obj);
                }
            }
        }
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("28b3ae92", new Object[]{this});
        }
        return this.d;
    }
}
