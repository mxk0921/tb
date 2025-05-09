package com.xiaomi.push;

import android.os.Build;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.em;
import com.xiaomi.push.service.bo;
import com.xiaomi.push.service.bw;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gi {

    /* renamed from: a  reason: collision with root package name */
    private int f14903a;

    /* renamed from: a  reason: collision with other field name */
    private gm f1044a;

    /* renamed from: a  reason: collision with other field name */
    private OutputStream f1045a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f1048a;
    private int b;

    /* renamed from: a  reason: collision with other field name */
    ByteBuffer f1046a = ByteBuffer.allocate(2048);

    /* renamed from: b  reason: collision with other field name */
    private ByteBuffer f1049b = ByteBuffer.allocate(4);

    /* renamed from: a  reason: collision with other field name */
    private Adler32 f1047a = new Adler32();

    public gi(OutputStream outputStream, gm gmVar) {
        this.f1045a = new BufferedOutputStream(outputStream);
        this.f1044a = gmVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f14903a = timeZone.getRawOffset() / 3600000;
        this.b = timeZone.useDaylightTime() ? 1 : 0;
    }

    public int a(gf gfVar) {
        int c = gfVar.c();
        if (c > 32768) {
            b.m410a("Blob size=" + c + " should be less than 32768 Drop blob chid=" + gfVar.a() + " id=" + gfVar.e());
            return 0;
        }
        this.f1046a.clear();
        int i = c + 12;
        if (i > this.f1046a.capacity() || this.f1046a.capacity() > 4096) {
            this.f1046a = ByteBuffer.allocate(i);
        }
        this.f1046a.putShort((short) -15618);
        this.f1046a.putShort((short) 5);
        this.f1046a.putInt(c);
        int position = this.f1046a.position();
        this.f1046a = gfVar.mo719a(this.f1046a);
        if (!"CONN".equals(gfVar.m718a())) {
            if (this.f1048a == null) {
                this.f1048a = this.f1044a.mo750a();
            }
            bo.a(this.f1048a, this.f1046a.array(), true, position, c);
        }
        this.f1047a.reset();
        this.f1047a.update(this.f1046a.array(), 0, this.f1046a.position());
        this.f1049b.putInt(0, (int) this.f1047a.getValue());
        this.f1045a.write(this.f1046a.array(), 0, this.f1046a.position());
        this.f1045a.write(this.f1049b.array(), 0, 4);
        this.f1045a.flush();
        int position2 = this.f1046a.position() + 4;
        b.c("[Slim] Wrote {cmd=" + gfVar.m718a() + ";chid=" + gfVar.a() + ";len=" + position2 + "}");
        return position2;
    }

    public void b() {
        gf gfVar = new gf();
        gfVar.a("CLOSE", (String) null);
        a(gfVar);
        this.f1045a.close();
    }

    public void a() {
        em.e eVar = new em.e();
        eVar.a(106);
        String str = Build.MODEL;
        eVar.a(str);
        eVar.b(r.m964a());
        eVar.c(bw.m1062a());
        eVar.b(48);
        eVar.d(this.f1044a.m740b());
        eVar.e(this.f1044a.mo750a());
        eVar.f(Locale.getDefault().toString());
        int i = Build.VERSION.SDK_INT;
        eVar.c(i);
        eVar.d(g.a(this.f1044a.mo750a(), "com.xiaomi.xmsf"));
        byte[] a2 = this.f1044a.m736a().m746a();
        if (a2 != null) {
            eVar.a(em.b.a(a2));
        }
        gf gfVar = new gf();
        gfVar.a(0);
        gfVar.a("CONN", (String) null);
        gfVar.a(0L, "xiaomi.com", null);
        gfVar.a(eVar.m601a(), (String) null);
        a(gfVar);
        b.m410a("[slim] open conn: andver=" + i + " sdk=48 tz=" + this.f14903a + ":" + this.b + " Model=" + str + " os=" + Build.VERSION.INCREMENTAL);
    }
}
