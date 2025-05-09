package com.meizu.cloud.pushsdk.f.d;

import com.meizu.cloud.pushsdk.f.b.b;
import com.meizu.cloud.pushsdk.f.b.c;
import com.meizu.cloud.pushsdk.f.g.d;
import com.meizu.cloud.pushsdk.f.g.e;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f5868a;
    private final long b;
    private final String c;

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.f.d.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class AbstractC0285a<T extends AbstractC0285a<T>> {

        /* renamed from: a  reason: collision with root package name */
        private List<b> f5869a = new LinkedList();
        private long b = System.currentTimeMillis();
        private String c = e.a();

        public abstract T a();

        public T a(long j) {
            this.b = j;
            return a();
        }
    }

    public a(AbstractC0285a<?> aVar) {
        d.a(((AbstractC0285a) aVar).f5869a);
        d.a(((AbstractC0285a) aVar).c);
        d.a(!((AbstractC0285a) aVar).c.isEmpty(), "eventId cannot be empty");
        this.f5868a = ((AbstractC0285a) aVar).f5869a;
        this.b = ((AbstractC0285a) aVar).b;
        this.c = ((AbstractC0285a) aVar).c;
    }

    public c a(c cVar) {
        cVar.a(NotificationStyle.EXPANDABLE_IMAGE_URL, a());
        cVar.a("ts", Long.toString(c()));
        return cVar;
    }

    public List<b> b() {
        return new ArrayList(this.f5868a);
    }

    public long c() {
        return this.b;
    }

    public String a() {
        return this.c;
    }
}
