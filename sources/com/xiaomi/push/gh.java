package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.em;
import com.xiaomi.push.service.bf;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gh {

    /* renamed from: a  reason: collision with other field name */
    private gm f1038a;

    /* renamed from: a  reason: collision with other field name */
    private InputStream f1039a;

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f1042a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f1043a;

    /* renamed from: a  reason: collision with other field name */
    private ByteBuffer f1040a = ByteBuffer.allocate(2048);
    private ByteBuffer b = ByteBuffer.allocate(4);

    /* renamed from: a  reason: collision with other field name */
    private Adler32 f1041a = new Adler32();

    /* renamed from: a  reason: collision with root package name */
    private gk f14902a = new gk();

    public gh(InputStream inputStream, gm gmVar) {
        this.f1039a = new BufferedInputStream(inputStream);
        this.f1038a = gmVar;
    }

    private void c() {
        String str;
        StringBuilder sb;
        boolean z = false;
        this.f1042a = false;
        gf a2 = m729a();
        if ("CONN".equals(a2.m718a())) {
            em.f a3 = em.f.a(a2.m722a());
            if (a3.mo666a()) {
                this.f1038a.a(a3.mo666a());
                z = true;
            }
            if (a3.c()) {
                em.b a4 = a3.mo666a();
                gf gfVar = new gf();
                gfVar.a("SYNC", "CONF");
                gfVar.a(a4.m601a(), (String) null);
                this.f1038a.a(gfVar);
            }
            b.m410a("[Slim] CONN: host = " + a3.mo668b());
        }
        if (z) {
            this.f1043a = this.f1038a.mo750a();
            while (!this.f1042a) {
                gf a5 = m729a();
                long currentTimeMillis = System.currentTimeMillis();
                this.f1038a.c();
                short a6 = a5.m720a();
                if (a6 != 1) {
                    if (a6 != 2) {
                        if (a6 != 3) {
                            str = "[Slim] unknow blob type " + ((int) a5.m720a());
                            b.m410a(str);
                        } else {
                            try {
                                this.f1038a.b(this.f14902a.a(a5.m722a(), this.f1038a));
                            } catch (Exception e) {
                                e = e;
                                sb = new StringBuilder("[Slim] Parse packet from Blob chid=");
                                sb.append(a5.a());
                                sb.append("; Id=");
                                sb.append(a5.e());
                                sb.append(" failure:");
                                sb.append(e.getMessage());
                                str = sb.toString();
                                b.m410a(str);
                            }
                        }
                    } else if ("SECMSG".equals(a5.m718a()) && ((a5.a() == 2 || a5.a() == 3) && TextUtils.isEmpty(a5.m725b()))) {
                        try {
                            hh a7 = this.f14902a.a(a5.m723a(bf.a().a(Integer.valueOf(a5.a()).toString(), a5.g()).h), this.f1038a);
                            a7.f1099a = currentTimeMillis;
                            this.f1038a.b(a7);
                        } catch (Exception e2) {
                            e = e2;
                            sb = new StringBuilder("[Slim] Parse packet from Blob chid=");
                            sb.append(a5.a());
                            sb.append("; Id=");
                            sb.append(a5.e());
                            sb.append(" failure:");
                            sb.append(e.getMessage());
                            str = sb.toString();
                            b.m410a(str);
                        }
                    }
                }
                this.f1038a.a(a5);
            }
            return;
        }
        b.m410a("[Slim] Invalid CONN");
        throw new IOException("Invalid Connection");
    }

    /* renamed from: a  reason: collision with other method in class */
    public gf m729a() {
        int i;
        IOException e;
        ByteBuffer a2;
        try {
            a2 = a();
            i = a2.position();
        } catch (IOException e2) {
            e = e2;
            i = 0;
        }
        try {
            a2.flip();
            a2.position(8);
            gf glVar = i == 8 ? new gl() : gf.a(a2.slice());
            b.c("[Slim] Read {cmd=" + glVar.m718a() + ";chid=" + glVar.a() + ";len=" + i + "}");
            return glVar;
        } catch (IOException e3) {
            e = e3;
            if (i == 0) {
                i = this.f1040a.position();
            }
            StringBuilder sb = new StringBuilder("[Slim] read Blob [");
            byte[] array = this.f1040a.array();
            if (i > 128) {
                i = 128;
            }
            sb.append(ae.a(array, 0, i));
            sb.append("] Err:");
            sb.append(e.getMessage());
            b.m410a(sb.toString());
            throw e;
        }
    }

    public void b() {
        this.f1042a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.nio.ByteBuffer a() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gh.a():java.nio.ByteBuffer");
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m730a() {
        try {
            c();
        } catch (IOException e) {
            if (!this.f1042a) {
                throw e;
            }
        }
    }

    private void a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        do {
            int read = this.f1039a.read(byteBuffer.array(), position, i);
            if (read != -1) {
                i -= read;
                position += read;
            } else {
                throw new EOFException();
            }
        } while (i > 0);
        byteBuffer.position(position);
    }
}
