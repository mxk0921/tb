package com.taobao.android.dinamic.expressionv2;

import android.util.LruCache;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.DinamicASTNode;
import java.util.LinkedList;
import java.util.List;
import tb.bn7;
import tb.em7;
import tb.en7;
import tb.mm7;
import tb.mn7;
import tb.nm7;
import tb.t2o;
import tb.tl7;
import tb.ym7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596335);
        t2o.a(444596306);
        new LruCache(32);
    }

    public static Object a(DinamicASTNode dinamicASTNode, String str, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("71bc3d82", new Object[]{dinamicASTNode, str, bn7Var});
        }
        return dinamicASTNode.c();
    }

    public static DinamicASTNode[] b(View view, String str, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicASTNode[]) ipChange.ipc$dispatch("7ba2a9ea", new Object[]{view, str, bn7Var});
        }
        char c = em7.DINAMIC_PREFIX_CHAR;
        Pair<List, List> a2 = new mn7().a(str);
        if (a2 == null) {
            return null;
        }
        a aVar = new a();
        aVar.b(bn7Var);
        DinamicASTNode a3 = aVar.a(a2);
        if (a3 != null) {
            return c(view, a3);
        }
        return null;
    }

    public static void d(View view, String str, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd72a456", new Object[]{view, str, bn7Var});
            return;
        }
        char c = em7.DINAMIC_PREFIX_CHAR;
        Pair<List, List> a2 = new mn7().a(str);
        if (a2 != null) {
            a aVar = new a();
            aVar.b(bn7Var);
            DinamicASTNode a3 = aVar.a(a2);
            if (a3 != null) {
                e(view, a3);
            }
        }
    }

    public static void f(View view, String str, bn7 bn7Var, en7 en7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6e41fb", new Object[]{view, str, bn7Var, en7Var});
            return;
        }
        try {
            DinamicASTNode[] b = b(view, str, bn7Var);
            if (b != null && b.length > 0) {
                for (int i = 0; i < b.length; i++) {
                    nm7 b2 = tl7.b(b[i].d);
                    if (b2 != null) {
                        DinamicASTNode dinamicASTNode = b[i];
                        if (dinamicASTNode instanceof d) {
                            b2.c(view, ((d) dinamicASTNode).e(), bn7Var.d());
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            bn7Var.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_EXCEPTION, en7Var.f18692a);
        }
    }

    public static Object g(String str, String str2, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("56c24dd5", new Object[]{str, str2, bn7Var});
        }
        char c = em7.DINAMIC_PREFIX_CHAR;
        Pair<List, List> a2 = new mn7().a(str);
        if (a2 != null) {
            a aVar = new a();
            aVar.b(bn7Var);
            DinamicASTNode a3 = aVar.a(a2);
            if (a3 != null) {
                Object a4 = a(a3, str, bn7Var);
                if (a4 != null) {
                    return a4;
                }
                return null;
            }
            ym7.h("build AST Tree error!");
            return null;
        }
        ym7.h("token error!");
        return null;
    }

    public static DinamicASTNode[] c(View view, DinamicASTNode dinamicASTNode) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicASTNode[]) ipChange.ipc$dispatch("686c436a", new Object[]{view, dinamicASTNode});
        }
        if (dinamicASTNode == null) {
            return null;
        }
        DinamicASTNode.DinamicASTNodeType dinamicASTNodeType = dinamicASTNode.f7260a;
        if (dinamicASTNodeType == DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod) {
            try {
                ((d) dinamicASTNode).d();
                return new DinamicASTNode[]{dinamicASTNode};
            } catch (ClassCastException unused) {
                ym7.d(tl7.TAG, "root node class cast error!");
                return null;
            }
        } else if (dinamicASTNodeType != DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeSerialBlock || (size = ((LinkedList) dinamicASTNode.b).size()) <= 0) {
            return null;
        } else {
            for (int i = 0; i < size; i++) {
                DinamicASTNode dinamicASTNode2 = (DinamicASTNode) ((LinkedList) dinamicASTNode.b).get(i);
                if (dinamicASTNode2 instanceof d) {
                    ((d) dinamicASTNode2).d();
                }
            }
            return (DinamicASTNode[]) ((LinkedList) dinamicASTNode.b).toArray(new DinamicASTNode[size]);
        }
    }

    public static void e(View view, DinamicASTNode dinamicASTNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2bc830", new Object[]{view, dinamicASTNode});
        } else if (dinamicASTNode != null) {
            DinamicASTNode.DinamicASTNodeType dinamicASTNodeType = dinamicASTNode.f7260a;
            if (dinamicASTNodeType == DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod) {
                try {
                    ((d) dinamicASTNode).f(view);
                } catch (ClassCastException unused) {
                    ym7.d(tl7.TAG, "root node class cast error!");
                }
            } else if (dinamicASTNodeType == DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeSerialBlock) {
                int size = ((LinkedList) dinamicASTNode.b).size();
                for (int i = 0; i < size; i++) {
                    DinamicASTNode dinamicASTNode2 = (DinamicASTNode) ((LinkedList) dinamicASTNode.b).get(i);
                    if (dinamicASTNode2.f7260a == DinamicASTNode.DinamicASTNodeType.DinamicASTNodeTypeMethod) {
                        try {
                            ((d) dinamicASTNode2).f(view);
                        } catch (ClassCastException unused2) {
                            ym7.d(tl7.TAG, "child node class cast error!");
                            return;
                        }
                    }
                }
            }
        }
    }
}
