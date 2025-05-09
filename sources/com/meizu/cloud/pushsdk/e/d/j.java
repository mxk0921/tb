package com.meizu.cloud.pushsdk.e.d;

import com.meizu.cloud.pushsdk.e.h.c;
import com.meizu.cloud.pushsdk.e.h.g;
import com.meizu.cloud.pushsdk.e.h.m;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class j {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f5829a;
        final /* synthetic */ int b;
        final /* synthetic */ byte[] c;
        final /* synthetic */ int d;

        public a(g gVar, int i, byte[] bArr, int i2) {
            this.f5829a = gVar;
            this.b = i;
            this.c = bArr;
            this.d = i2;
        }

        @Override // com.meizu.cloud.pushsdk.e.d.j
        public long a() {
            return this.b;
        }

        @Override // com.meizu.cloud.pushsdk.e.d.j
        public g b() {
            return this.f5829a;
        }

        @Override // com.meizu.cloud.pushsdk.e.d.j
        public void a(c cVar) throws IOException {
            cVar.a(this.c, this.d, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f5830a;
        final /* synthetic */ File b;

        public b(g gVar, File file) {
            this.f5830a = gVar;
            this.b = file;
        }

        @Override // com.meizu.cloud.pushsdk.e.d.j
        public long a() {
            return this.b.length();
        }

        @Override // com.meizu.cloud.pushsdk.e.d.j
        public g b() {
            return this.f5830a;
        }

        @Override // com.meizu.cloud.pushsdk.e.d.j
        public void a(c cVar) throws IOException {
            m mVar = null;
            try {
                mVar = g.a(this.b);
                cVar.a(mVar);
            } finally {
                m.a(mVar);
            }
        }
    }

    public static j a(g gVar, File file) {
        if (file != null) {
            return new b(gVar, file);
        }
        throw new NullPointerException("content == null");
    }

    public abstract long a() throws IOException;

    public abstract void a(c cVar) throws IOException;

    public abstract g b();

    public static j a(g gVar, String str) {
        Charset charset = m.c;
        if (gVar != null) {
            Charset a2 = gVar.a();
            if (a2 == null) {
                gVar = g.a(gVar + "; charset=utf-8");
            } else {
                charset = a2;
            }
        }
        return a(gVar, str.getBytes(charset));
    }

    public static j a(g gVar, byte[] bArr) {
        return a(gVar, bArr, 0, bArr.length);
    }

    public static j a(g gVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            m.a(bArr.length, i, i2);
            return new a(gVar, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }
}
