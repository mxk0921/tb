package com.vivo.push.c;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.u;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f14579a;
    private HashMap<String, String> b = new HashMap<>();

    public a(Context context) {
        this.f14579a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.ContentProviderClient, android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.e():int");
    }

    public final int a() {
        int a2 = a(1);
        u.d("CoreConfigManager", "isSupportNewControlStrategies : ".concat(String.valueOf(a2)));
        return a2;
    }

    public final int b() {
        int a2 = a(4);
        u.d("CoreConfigManager", "isSupportSyncProfileInfo : ".concat(String.valueOf(a2)));
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r3v3 java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:174)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
    	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:280)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:637)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:174)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:107)
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0060: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:23:0x0060 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9 A[Catch: Exception -> 0x009c, TRY_ENTER, TryCatch #2 {Exception -> 0x009c, blocks: (B:40:0x0091, B:43:0x0098, B:48:0x00a9, B:50:0x00ae, B:52:0x00b2), top: B:66:0x0008 }] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public final boolean c() {
        int a2 = a(8);
        u.d("CoreConfigManager", "isSupportdeleteRegid : ".concat(String.valueOf(a2)));
        return a2 == 0;
    }

    public final boolean d() {
        int a2 = a(16);
        u.d("CoreConfigManager", "isSupportQueryCurrentAppState : ".concat(String.valueOf(a2)));
        return a2 == 0;
    }

    private int a(int i) {
        int e = e();
        if (e != 0) {
            return e;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap == null || hashMap.size() == 0) {
            return 8006;
        }
        String str = this.b.get("pushSupport");
        if (TextUtils.isEmpty(str)) {
            return 2;
        }
        try {
            return (i & Integer.parseInt(str)) > 0 ? 0 : 1;
        } catch (Exception unused) {
            return 8007;
        }
    }
}
