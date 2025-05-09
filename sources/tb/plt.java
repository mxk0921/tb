package tb;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class plt extends x4g<DocumentData> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends fmh<DocumentData> {
        public final /* synthetic */ nlh c;
        public final /* synthetic */ fmh d;
        public final /* synthetic */ DocumentData e;

        public a(plt pltVar, nlh nlhVar, fmh fmhVar, DocumentData documentData) {
            this.c = nlhVar;
            this.d = fmhVar;
            this.e = documentData;
        }

        /* renamed from: d */
        public DocumentData a(nlh<DocumentData> nlhVar) {
            DocumentData g;
            this.c.h(nlhVar.f(), nlhVar.a(), nlhVar.g().f1846a, nlhVar.b().f1846a, nlhVar.d(), nlhVar.c(), nlhVar.e());
            String str = (String) this.d.a(this.c);
            if (nlhVar.c() == 1.0f) {
                g = nlhVar.b();
            } else {
                g = nlhVar.g();
            }
            DocumentData documentData = g;
            this.e.a(str, documentData.b, documentData.c, documentData.d, documentData.e, documentData.f, documentData.g, documentData.h, documentData.i, documentData.j, documentData.k);
            return this.e;
        }
    }

    public plt(List<w4g<DocumentData>> list) {
        super(list);
    }

    /* renamed from: p */
    public DocumentData i(w4g<DocumentData> w4gVar, float f) {
        DocumentData documentData;
        float f2;
        DocumentData documentData2;
        fmh<A> fmhVar = this.e;
        if (fmhVar != 0) {
            float f3 = w4gVar.g;
            Float f4 = w4gVar.h;
            if (f4 == null) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = f4.floatValue();
            }
            DocumentData documentData3 = w4gVar.c;
            DocumentData documentData4 = w4gVar.b;
            if (documentData3 == null) {
                documentData2 = documentData4;
            } else {
                documentData2 = documentData3;
            }
            return (DocumentData) fmhVar.b(f3, f2, documentData4, documentData2, f, d(), f());
        } else if (f != 1.0f || (documentData = w4gVar.c) == null) {
            return w4gVar.b;
        } else {
            return documentData;
        }
    }

    public void q(fmh<String> fmhVar) {
        n(new a(this, new nlh(), fmhVar, new DocumentData()));
    }
}
