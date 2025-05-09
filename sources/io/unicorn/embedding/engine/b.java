package io.unicorn.embedding.engine;

import android.content.Context;
import io.unicorn.embedding.engine.a;
import java.util.ArrayList;
import java.util.List;
import tb.es9;
import tb.fs9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<io.unicorn.embedding.engine.a> f15195a;
    public final String[] b;
    public final String[] c;

    static {
        t2o.a(945815683);
    }

    public b(Context context) {
        this(context, null);
    }

    public io.unicorn.embedding.engine.a a(Context context, String[] strArr) {
        io.unicorn.embedding.engine.a aVar;
        ArrayList arrayList = (ArrayList) this.f15195a;
        if (arrayList.size() == 0) {
            aVar = b(context);
        } else {
            aVar = ((io.unicorn.embedding.engine.a) arrayList.get(0)).B(context, strArr);
        }
        arrayList.add(aVar);
        aVar.g(new a(aVar));
        return aVar;
    }

    public io.unicorn.embedding.engine.a b(Context context) {
        return new io.unicorn.embedding.engine.a(context, this.c, this.b);
    }

    public b(Context context, String[] strArr, String[] strArr2) {
        this.f15195a = new ArrayList();
        this.b = null;
        this.c = null;
        fs9 a2 = es9.b().a();
        if (!a2.c()) {
            a2.b(context, strArr);
        }
        this.c = strArr;
        this.b = strArr2;
    }

    public b(Context context, String[] strArr) {
        this(context, strArr, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ io.unicorn.embedding.engine.a f15196a;

        public a(io.unicorn.embedding.engine.a aVar) {
            this.f15196a = aVar;
        }

        @Override // io.unicorn.embedding.engine.a.b
        public void a() {
            ((ArrayList) b.this.f15195a).remove(this.f15196a);
        }

        @Override // io.unicorn.embedding.engine.a.b
        public void b() {
        }
    }
}
