package com.meizu.cloud.pushsdk.e.d;

import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.meizu.cloud.pushsdk.e.h.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b extends j {

    /* renamed from: a  reason: collision with root package name */
    private static final g f5815a = g.a(HeaderConstant.HEADER_VALUE_OLD_TYPE);
    private final List<String> b;
    private final List<String> c;

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.e.d.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class C0281b {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f5816a = new ArrayList();
        private final List<String> b = new ArrayList();

        public C0281b a(String str, String str2) {
            this.f5816a.add(f.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.b.add(f.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }

        public C0281b b(String str, String str2) {
            this.f5816a.add(f.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            this.b.add(f.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            return this;
        }

        public b a() {
            return new b(this.f5816a, this.b);
        }
    }

    private b(List<String> list, List<String> list2) {
        this.b = m.a(list);
        this.c = m.a(list2);
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public long a() {
        return a((c) null, true);
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public g b() {
        return f5815a;
    }

    private long a(c cVar, boolean z) {
        com.meizu.cloud.pushsdk.e.h.b bVar = z ? new com.meizu.cloud.pushsdk.e.h.b() : cVar.c();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                bVar.b(38);
            }
            bVar.a(this.b.get(i));
            bVar.b(61);
            bVar.a(this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long k = bVar.k();
        bVar.e();
        return k;
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public void a(c cVar) {
        a(cVar, false);
    }
}
