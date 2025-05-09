package com.loc;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class bp extends r {

    /* renamed from: a  reason: collision with root package name */
    protected Context f5598a;
    protected w b;
    protected byte[] c;

    public bp(Context context, w wVar) {
        if (context != null) {
            this.f5598a = context.getApplicationContext();
        }
        this.b = wVar;
        r();
    }

    private static byte[] A() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(x.a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                as.a(th, "bre", "gbh");
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Throwable th2) {
                    as.a(th2, "bre", "gbh");
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    as.a(th3, "bre", "gbh");
                }
            }
        }
    }

    private byte[] B() {
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (i()) {
                Context context = this.f5598a;
                boolean k = k();
                w wVar = this.b;
                if (wVar == null || !"navi".equals(wVar.a())) {
                    z = false;
                } else {
                    z = true;
                }
                byte[] a2 = n.a(context, k, z);
                byteArrayOutputStream.write(a(a2));
                byteArrayOutputStream.write(a2);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] a3 = x.a(f());
            if (a3 == null || a3.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(a3));
                byteArrayOutputStream.write(a3);
            }
            byte[] a4 = x.a(j());
            if (a4 == null || a4.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(a4));
                byteArrayOutputStream.write(a4);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                as.a(th, "bre", "gpd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    as.a(th2, "bre", "gred");
                }
                return new byte[]{0};
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    as.a(th3, "bre", "gred");
                }
            }
        }
    }

    private byte[] C() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] a_ = a_();
            if (!(a_ == null || a_.length == 0)) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(a(a_));
                byteArrayOutputStream.write(a_);
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                as.a(th, "bre", "grrd");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                as.a(th2, "bre", "grrd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    as.a(th3, "bre", "grrd");
                }
                return new byte[]{0};
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    as.a(th4, "bre", "grrd");
                }
            }
        }
    }

    private byte[] D() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] b_ = b_();
            if (!(b_ == null || b_.length == 0)) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] a2 = n.a(b_);
                byteArrayOutputStream.write(a(a2));
                byteArrayOutputStream.write(a2);
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                as.a(th, "bre", "gred");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                as.a(th2, "bre", "gred");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    as.a(th3, "bre", "gred");
                }
                return new byte[]{0};
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    as.a(th4, "bre", "gred");
                }
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        return x.a(bArr.length);
    }

    public abstract byte[] a_();

    public abstract byte[] b_();

    @Override // com.loc.bt
    public final byte[] d() {
        byte[] bArr = this.c;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(A());
            byteArrayOutputStream.write(B());
            byteArrayOutputStream.write(C());
            byteArrayOutputStream.write(D());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.c = byteArray;
            return byteArray;
        } catch (Throwable th) {
            try {
                as.a(th, "bre", "geb");
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Throwable th2) {
                    as.a(th2, "bre", "geb");
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    as.a(th3, "bre", "geb");
                }
            }
        }
    }

    @Override // com.loc.bt
    public Map<String, String> e() {
        String f = l.f(this.f5598a);
        String a2 = n.a();
        String a3 = n.a(this.f5598a, a2, "key=".concat(String.valueOf(f)));
        HashMap hashMap = new HashMap();
        hashMap.put("ts", a2);
        hashMap.put("key", f);
        hashMap.put("scode", a3);
        return hashMap;
    }

    public String f() {
        return "2.1";
    }

    public boolean i() {
        return true;
    }

    public String j() {
        String c = this.b.c();
        String a2 = this.b.a();
        return "platform=Android&sdkversion=" + c + "&product=" + a2;
    }

    public boolean k() {
        return false;
    }
}
