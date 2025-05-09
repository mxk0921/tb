package com.meizu.cloud.pushsdk.e.f;

import com.meizu.cloud.pushsdk.e.b.b;
import com.meizu.cloud.pushsdk.e.b.e;
import com.meizu.cloud.pushsdk.e.c.a;
import com.meizu.cloud.pushsdk.e.d.k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class c {
    public static <T> com.meizu.cloud.pushsdk.e.b.c<T> a(b bVar) {
        int l = bVar.l();
        if (l == 0) {
            return c(bVar);
        }
        if (l == 1) {
            return b(bVar);
        }
        if (l != 2) {
            return new com.meizu.cloud.pushsdk.e.b.c<>(new a());
        }
        return d(bVar);
    }

    private static <T> com.meizu.cloud.pushsdk.e.b.c<T> b(b bVar) {
        try {
            k a2 = a.a(bVar);
            if (a2 == null) {
                return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new a()));
            }
            if (a2.b() >= 400) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new a(a2), bVar, a2.b()));
                cVar.a(a2);
                return cVar;
            }
            com.meizu.cloud.pushsdk.e.b.c<T> cVar2 = new com.meizu.cloud.pushsdk.e.b.c<>("success");
            cVar2.a(a2);
            return cVar2;
        } catch (a e) {
            return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new a(e)));
        } catch (Exception e2) {
            return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(e2));
        }
    }

    private static <T> com.meizu.cloud.pushsdk.e.b.c<T> c(b bVar) {
        k kVar = null;
        try {
            kVar = a.b(bVar);
            if (kVar == null) {
                return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new a()));
            }
            if (bVar.m() == e.OK_HTTP_RESPONSE) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar = new com.meizu.cloud.pushsdk.e.b.c<>(kVar);
                cVar.a(kVar);
                return cVar;
            } else if (kVar.b() >= 400) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar2 = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new a(kVar), bVar, kVar.b()));
                cVar2.a(kVar);
                return cVar2;
            } else {
                com.meizu.cloud.pushsdk.e.b.c<T> a2 = bVar.a(kVar);
                a2.a(kVar);
                return a2;
            }
        } catch (a e) {
            return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new a(e)));
        } catch (Exception e2) {
            return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(e2));
        } finally {
            com.meizu.cloud.pushsdk.e.i.a.a(kVar, bVar);
        }
    }

    private static <T> com.meizu.cloud.pushsdk.e.b.c<T> d(b bVar) {
        k kVar = null;
        try {
            kVar = a.c(bVar);
            if (kVar == null) {
                return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new a()));
            }
            if (bVar.m() == e.OK_HTTP_RESPONSE) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar = new com.meizu.cloud.pushsdk.e.b.c<>(kVar);
                cVar.a(kVar);
                return cVar;
            } else if (kVar.b() >= 400) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar2 = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new a(kVar), bVar, kVar.b()));
                cVar2.a(kVar);
                return cVar2;
            } else {
                com.meizu.cloud.pushsdk.e.b.c<T> a2 = bVar.a(kVar);
                a2.a(kVar);
                return a2;
            }
        } catch (a e) {
            return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(e));
        } catch (Exception e2) {
            return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(e2));
        } finally {
            com.meizu.cloud.pushsdk.e.i.a.a(kVar, bVar);
        }
    }
}
