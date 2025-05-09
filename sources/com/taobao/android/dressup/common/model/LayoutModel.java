package com.taobao.android.dressup.common.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/taobao/android/dressup/common/model/LayoutModel;", "", "<init>", "()V", "", "root", "Ljava/lang/String;", "getRoot", "()Ljava/lang/String;", "setRoot", "(Ljava/lang/String;)V", "", "", "structure", "Ljava/util/Map;", "getStructure", "()Ljava/util/Map;", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LayoutModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String root;
    private final Map<String, List<String>> structure = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552667);
        }

        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
        /* JADX WARN: Unknown variable types count: 1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.taobao.android.dressup.common.model.LayoutModel a(java.util.Map<java.lang.String, ? extends java.lang.Object> r8) {
            /*
                r7 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dressup.common.model.LayoutModel.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = "95d91dd4"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r7
                r3 = 1
                r2[r3] = r8
                java.lang.Object r8 = r0.ipc$dispatch(r1, r2)
                com.taobao.android.dressup.common.model.LayoutModel r8 = (com.taobao.android.dressup.common.model.LayoutModel) r8
                return r8
            L_0x0018:
                java.lang.String r0 = "data"
                tb.ckf.g(r8, r0)
                com.taobao.android.dressup.common.model.LayoutModel r0 = new com.taobao.android.dressup.common.model.LayoutModel
                r0.<init>()
                java.lang.String r1 = "root"
                java.lang.Object r1 = r8.get(r1)
                boolean r2 = r1 instanceof java.lang.String
                r3 = 0
                if (r2 != 0) goto L_0x002f
                r1 = r3
            L_0x002f:
                java.lang.String r1 = (java.lang.String) r1
                r0.setRoot(r1)
                java.lang.String r1 = "structure"
                java.lang.Object r8 = r8.get(r1)
                boolean r1 = r8 instanceof java.util.Map
                if (r1 != 0) goto L_0x0040
                r8 = r3
            L_0x0040:
                java.util.Map r8 = (java.util.Map) r8
                if (r8 == 0) goto L_0x0096
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L_0x004c:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L_0x0096
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                boolean r4 = r1 instanceof java.util.List
                if (r4 != 0) goto L_0x0065
                r1 = r3
            L_0x0065:
                java.util.List r1 = (java.util.List) r1
                if (r1 == 0) goto L_0x0086
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0074:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x008a
                java.lang.Object r5 = r1.next()
                boolean r6 = r5 instanceof java.lang.String
                if (r6 == 0) goto L_0x0074
                r4.add(r5)
                goto L_0x0074
            L_0x0086:
                java.util.List r4 = tb.yz3.i()
            L_0x008a:
                java.util.Map r1 = r0.getStructure()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.put(r2, r4)
                goto L_0x004c
            L_0x0096:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dressup.common.model.LayoutModel.a.a(java.util.Map):com.taobao.android.dressup.common.model.LayoutModel");
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552666);
    }

    public final String getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb1a0ca1", new Object[]{this});
        }
        return this.root;
    }

    public final Map<String, List<String>> getStructure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b2ee7f9", new Object[]{this});
        }
        return this.structure;
    }

    public final void setRoot(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca6c7f5", new Object[]{this, str});
        } else {
            this.root = str;
        }
    }
}
