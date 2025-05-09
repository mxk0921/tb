package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.uc.webview.internal.setup.component.e;
import com.uc.webview.stat.a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r {
    private static final long c = System.currentTimeMillis() / 1000;
    private static final boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    String f14438a;
    int b;
    private final int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        final String[] d = new String[6];

        public final void a(long j) {
            this.d[0] = Long.toString(j);
        }

        public final void b(long j) {
            this.d[1] = Long.toString(j);
        }

        public final void c(long j) {
            this.d[2] = Long.toString(j);
        }

        public final void d(long j) {
            this.d[3] = Long.toString(j);
        }

        public final void e(long j) {
            this.d[4] = Long.toString(j);
        }

        public final void b() {
            this.d[5] = Long.toString(1L);
        }
    }

    public r(String str, int i, int i2) {
        this.f14438a = str;
        this.b = i;
        this.d = i2;
    }

    public void a(int i, a aVar) {
        if (e.b.a(i)) {
            StringBuilder sb = new StringBuilder("id~");
            sb.append(this.b);
            sb.append("^sid~");
            sb.append(c);
            sb.append("^ev~");
            sb.append(i);
            sb.append("^et~");
            sb.append(((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 1000) % 86400);
            sb.append("^tc~");
            sb.append(this.d);
            if (aVar != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = aVar.d;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    String str = strArr[i2];
                    if (!TextUtils.isEmpty(str)) {
                        sb.append("^");
                        sb.append((char) (i2 + 97));
                        sb.append(Constants.WAVE_SEPARATOR);
                        sb.append(str);
                    }
                    i2++;
                }
            }
            a.bj bjVar = new a.bj();
            String sb2 = sb.toString();
            bjVar.b = sb2;
            if (e) {
                h.a(this.f14438a, "Stats: %s", sb2);
            }
            bjVar.l();
        }
    }
}
