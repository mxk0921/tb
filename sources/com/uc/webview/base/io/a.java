package com.uc.webview.base.io;

import android.text.TextUtils;
import com.uc.webview.base.Log;
import com.uc.webview.base.a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {
    private static final String d = "a";

    /* renamed from: a  reason: collision with root package name */
    public final File f14270a;
    public final AbstractC0831a b;
    private final long e;
    private final com.uc.webview.base.io.b f;
    private c g = null;
    public d c = null;

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.base.io.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface AbstractC0831a {
        String a(String str);

        String b(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements AbstractC0831a {
        @Override // com.uc.webview.base.io.a.AbstractC0831a
        public final String a(String str) {
            return a.c.a(str);
        }

        @Override // com.uc.webview.base.io.a.AbstractC0831a
        public final String b(String str) {
            return a.c.b(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        final InputStream f14271a;
        final BufferedReader b;

        public c(File file) throws Exception {
            FileInputStream fileInputStream = new FileInputStream(file);
            this.f14271a = fileInputStream;
            this.b = new BufferedReader(new InputStreamReader(fileInputStream), 1024);
        }

        public final String a() {
            try {
                return this.b.readLine();
            } catch (Throwable th) {
                Log.w(a.d, "readLine failed", th);
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        final OutputStream f14272a;
        final BufferedWriter b;
        private long d;

        public d(File file, boolean z) throws Exception {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            this.f14272a = fileOutputStream;
            this.b = new BufferedWriter(new OutputStreamWriter(fileOutputStream), 1024);
            try {
                this.d = file.length();
            } catch (Throwable unused) {
            }
        }

        public final boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                this.b.write(str);
                this.b.newLine();
                long length = this.d + str.length();
                this.d = length;
                if (length < a.this.e) {
                    return true;
                }
                String str2 = a.d;
                Log.w(str2, "write file reach max limit, length:" + this.d);
                return false;
            } catch (Throwable th) {
                Log.w(a.d, "writeLine failed", th);
                return false;
            }
        }
    }

    public a(File file, long j, AbstractC0831a aVar) {
        this.f14270a = file;
        this.e = j;
        com.uc.webview.base.io.b bVar = new com.uc.webview.base.io.b(file, true);
        this.f = bVar;
        this.b = aVar;
        bVar.a();
    }

    public final String b() {
        try {
            StringBuilder sb = new StringBuilder("path=");
            sb.append(this.f14270a.getAbsolutePath());
            sb.append(", exists=");
            sb.append(this.f14270a.exists());
            if (this.f14270a.exists()) {
                sb.append(", length=");
                sb.append(this.f14270a.length());
            }
            if (this.e != Long.MAX_VALUE) {
                sb.append(", maxSize=");
                sb.append(this.e);
            }
            return sb.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    public final String c() throws Exception {
        if (this.g == null) {
            this.g = new c(this.f14270a);
        }
        String a2 = this.g.a();
        AbstractC0831a aVar = this.b;
        if (aVar == null || a2 == null) {
            return a2;
        }
        return aVar.b(a2);
    }

    public final void d() {
        c cVar = this.g;
        if (cVar != null) {
            com.uc.webview.base.io.d.a(cVar.b);
            com.uc.webview.base.io.d.a(cVar.f14271a);
            this.g = null;
        }
        d dVar = this.c;
        if (dVar != null) {
            com.uc.webview.base.io.d.a(dVar.b);
            com.uc.webview.base.io.d.a(dVar.f14272a);
            this.c = null;
        }
        com.uc.webview.base.io.b bVar = this.f;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final boolean a() {
        try {
            if (!this.f14270a.exists()) {
                return false;
            }
            long length = this.f14270a.length();
            if (length > 0) {
                return length <= this.e;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
