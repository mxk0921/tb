package tb;

import android.util.LruCache;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode;
import com.taobao.android.gateway.dinamic.expressionv2.a;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475005018);
        new LruCache(32);
    }

    public static Object a(DinamicASTNode dinamicASTNode, String str, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cba0b59f", new Object[]{dinamicASTNode, str, g5aVar});
        }
        return dinamicASTNode.c();
    }

    public static Object b(String str, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bb1ec1b1", new Object[]{str, g5aVar});
        }
        char c = dm7.DINAMIC_PREFIX_CHAR;
        Pair<List, List> a2 = new ln7().a(str);
        if (a2 != null) {
            a aVar = new a();
            aVar.b(g5aVar);
            DinamicASTNode a3 = aVar.a(a2);
            if (a3 != null) {
                Object a4 = a(a3, str, g5aVar);
                if (a4 != null) {
                    return a4;
                }
                return null;
            }
            s3a.a("build AST Tree error!");
            return null;
        }
        s3a.a("token error!");
        return str;
    }
}
