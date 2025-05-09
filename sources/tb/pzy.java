package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class pzy {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737426);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final OriginNode a(byte[] bArr, RenderContext renderContext) throws RuntimeException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OriginNode) ipChange.ipc$dispatch("5930e1d2", new Object[]{this, bArr, renderContext});
            }
            ckf.g(bArr, "data");
            ckf.g(renderContext, "context");
            if (bArr.length != 0) {
                onz<g8z, String> a2 = new f8z().a(bArr, 0, bArr.length);
                if (!a2.c()) {
                    g8z a3 = a2.a();
                    if (!a3.a().isEmpty()) {
                        OriginNode originNode = null;
                        t2z t2zVar = null;
                        i6z i6zVar = null;
                        q7z q7zVar = null;
                        for (pnz pnzVar : a3.a()) {
                            int c = pnzVar.c();
                            if (c == 1) {
                                onz<t2z, String> a4 = new s2z().a(bArr, pnzVar.b(), pnzVar.a());
                                if (!a4.c()) {
                                    t2zVar = a4.a();
                                } else {
                                    throw new RuntimeException(ckf.p("[BinaryLoader] load constant section failed: ", a4.b()));
                                }
                            } else if (c == 2) {
                                onz<i6z, String> a5 = new h6z().a(bArr, pnzVar.b(), pnzVar.a());
                                if (!a5.c()) {
                                    i6zVar = a5.a();
                                } else {
                                    throw new RuntimeException(ckf.p("[BinaryLoader] load expr section failed: ", a5.b()));
                                }
                            } else if (c != 3) {
                                if (c != 4) {
                                    if (c != 5) {
                                        continue;
                                    } else if (t2zVar != null) {
                                        onz<caz, String> a6 = new baz().a(bArr, pnzVar.b(), pnzVar.a());
                                        if (!a6.c()) {
                                            a6.a();
                                        } else {
                                            throw new RuntimeException(ckf.p("[BinaryLoader] load index to name section failed: ", a6.b()));
                                        }
                                    } else {
                                        throw new RuntimeException("[BinaryLoader] Constant section not loaded before IndexToName section");
                                    }
                                } else if (t2zVar == null || i6zVar == null || q7zVar == null) {
                                    throw new RuntimeException("[BinaryLoader] Constant, Expr, or Func section not loaded before Node section");
                                } else {
                                    onz<OriginNode, String> a7 = new xiz(t2zVar, i6zVar, q7zVar, new WeakReference(renderContext)).a(bArr, pnzVar.b(), pnzVar.a());
                                    if (!a7.c()) {
                                        originNode = a7.a();
                                    } else {
                                        throw new RuntimeException(ckf.p("[BinaryLoader] load node section failed: ", a7.b()));
                                    }
                                }
                            } else if (t2zVar == null || i6zVar == null) {
                                throw new RuntimeException("[BinaryLoader] Constant or Expr section not loaded before Func section");
                            } else {
                                onz<q7z, String> a8 = new p7z(t2zVar, i6zVar).a(bArr, pnzVar.b(), pnzVar.a());
                                if (!a8.c()) {
                                    q7zVar = a8.a();
                                } else {
                                    throw new RuntimeException(ckf.p("[BinaryLoader] load function section failed: ", a8.b()));
                                }
                            }
                        }
                        if (originNode != null) {
                            return originNode;
                        }
                        throw new RuntimeException("[BinaryLoader] Root node is null");
                    }
                    throw new RuntimeException("[BinaryLoader] section infos is empty");
                }
                throw new RuntimeException(ckf.p("[BinaryLoader] load header section failed: ", a2.b()));
            }
            throw new RuntimeException("[BinaryLoader] data is empty");
        }

        public a() {
        }
    }

    static {
        t2o.a(598737425);
    }
}
