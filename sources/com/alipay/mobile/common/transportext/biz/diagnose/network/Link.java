package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.alipay.mobile.common.transport.ssl.ZSSLContextFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.net.Socket;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocketFactory;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Link {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DIAGNOSE-LINK";

    /* renamed from: a  reason: collision with root package name */
    public Configuration.DetectInf f4182a;
    public Configuration.Address b;
    public final Configuration.Address c;
    public final DiagnoseStateManager d;
    public String e;
    public int errCode;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class DftNetTest implements DiagnoseStateManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f4183a = null;

        public String getReport() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9733550f", new Object[]{this});
            }
            return this.f4183a;
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseStateManager
        public void notify(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b32c451a", new Object[]{this, str});
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseStateManager
        public void report(boolean z, boolean z2, boolean z3, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10057843", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
            } else if (this.f4183a == null) {
                this.f4183a = str;
            } else {
                this.f4183a += "|" + str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class MyHandshakeListener implements HandshakeCompletedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public MyHandshakeListener() {
        }

        @Override // javax.net.ssl.HandshakeCompletedListener
        public void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("771e882e", new Object[]{this, handshakeCompletedEvent});
                return;
            }
            Link.access$102(Link.this, System.nanoTime() - Link.access$200(Link.this));
            LogCatUtil.info(Link.TAG, "[sslSocket]Handshake sucessfull. " + handshakeCompletedEvent.toString());
        }
    }

    public Link(Configuration.DetectInf detectInf, DiagnoseStateManager diagnoseStateManager, Configuration.Address address) {
        this.errCode = -1;
        this.b = null;
        this.e = null;
        this.f = "";
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.f4182a = detectInf;
        this.d = diagnoseStateManager;
        this.c = address;
        this.i = c();
    }

    public static /* synthetic */ long access$102(Link link, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e735b2f8", new Object[]{link, new Long(j)})).longValue();
        }
        link.m = j;
        return j;
    }

    public static /* synthetic */ long access$200(Link link) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b9c2f55", new Object[]{link})).longValue();
        }
        return link.k;
    }

    public static String diagnoseByLink(String str, boolean z, Configuration.Address address) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f295c2f6", new Object[]{str, new Boolean(z), address});
        }
        DftNetTest dftNetTest = new DftNetTest();
        if (str == null) {
            return null;
        }
        new Link(str, z, dftNetTest, address).start();
        return dftNetTest.getReport();
    }

    public final String a(Socket socket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9019afef", new Object[]{this, socket, str});
        }
        if (socket == null || !NetworkDiagnoseUtil.isSafety(str)) {
            LogCatUtil.warn(TAG, "[sendAndReceive] input is not available.");
            return null;
        }
        try {
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            LogCatUtil.info(TAG, "[sendAndReceive] send:" + str);
            printStream.print(str);
            printStream.flush();
            byte[] bArr = new byte[512];
            int read = socket.getInputStream().read(bArr);
            if (read > 0) {
                return new String(bArr, 0, read);
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[sendAndReceive]" + th.toString());
            return null;
        }
    }

    public final boolean c() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Configuration.DetectInf detectInf = this.f4182a;
        if (detectInf == null) {
            LogCatUtil.warn(TAG, "[initialize] input detectInf is null.");
            this.errCode = 1;
            return false;
        }
        this.i = true;
        int i = detectInf.protocol;
        if (1 == i) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        this.j = i;
        String str = detectInf.ip;
        if (str == null) {
            str = detectInf.domain;
        }
        Configuration.Address parse = NetworkDiagnoseUtil.parse(str, z);
        this.b = parse;
        if (parse == null) {
            LogCatUtil.warn(TAG, "[initialize] server is null.");
            this.errCode = 1;
            return false;
        }
        int i2 = this.f4182a.port;
        if (i2 != -1) {
            parse.port = i2;
        }
        this.e = this.b.ip + ":" + this.b.port;
        if (this.c != null) {
            this.e += " through proxy-";
            this.e += this.c.ip + ":" + this.c.port;
            LogCatUtil.info(TAG, "[initialize] proxy. " + this.e);
        }
        this.h = true;
        return true;
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            LogCatUtil.warn(TAG, "[initialize] domain is null.");
            this.errCode = 1;
            return false;
        }
        Configuration.Address parse = NetworkDiagnoseUtil.parse(str, this.g);
        this.b = parse;
        if (parse == null || parse.ip == null) {
            LogCatUtil.warn(TAG, "[initialize] server is null.");
            this.errCode = 1;
            return false;
        }
        this.e = this.b.ip + ":" + this.b.port;
        this.j = this.g ? 1 : 0;
        this.f4182a = new Configuration.DetectInf();
        if (this.c != null) {
            this.e += " through proxy-";
            this.e += this.c.ip + ":" + this.c.port;
            LogCatUtil.info(TAG, "[initialize] proxy. " + this.e);
        }
        return true;
    }

    public final boolean f(String str, String str2, boolean z) {
        int i;
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        if (!NetworkDiagnoseUtil.isSafety(str) || !NetworkDiagnoseUtil.isSafety(str2)) {
            LogCatUtil.warn(TAG, "[checkData] input is not safety.");
            return false;
        }
        if (z) {
            str = str.trim();
            str2 = str2.trim();
        }
        if (str.length() < str2.length()) {
            i = str.length();
        } else {
            i = str2.length();
        }
        if (str.substring(0, i).equals(str2.substring(0, i)) || str2.startsWith(str)) {
            return true;
        }
        try {
            if (!str2.startsWith("HTTP/") || (substring = str2.substring(5)) == null) {
                return false;
            }
            String trim = substring.substring(substring.indexOf(" ")).trim();
            int parseInt = Integer.parseInt(trim.substring(0, trim.indexOf(" ")));
            if (parseInt < 200 || parseInt >= 300) {
                if (302 == parseInt || 301 == parseInt) {
                    LogCatUtil.info(TAG, "[checkData] the http rsp state is 302.");
                    return h(trim);
                }
                return false;
            }
            LogCatUtil.info(TAG, "[checkData] the http rsp state is 200-300.");
            return true;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[checkData] " + th.toString());
            return false;
        }
    }

    public final SSLSocketFactory k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLSocketFactory) ipChange.ipc$dispatch("e8570a1", new Object[]{this});
        }
        try {
            return ZSSLContextFactory.createZSSLContext().getSocketFactory();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getSSLSocketFactory ex= " + th.toString());
            return null;
        }
    }

    public boolean start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
        }
        if (!this.i) {
            this.errCode = 1;
            b(false, false);
            return false;
        } else if (!this.g) {
            Configuration.Address address = this.c;
            if (address != null) {
                return i(address.ip, address.port);
            }
            Configuration.Address address2 = this.b;
            return e(address2.ip, address2.port);
        } else if (this.c == null) {
            return g();
        } else {
            return j();
        }
    }

    public final void b(boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        DiagnoseStateManager diagnoseStateManager = this.d;
        if (diagnoseStateManager != null) {
            if (!z) {
                diagnoseStateManager.report(false, false, false, null);
                return;
            }
            if (!DftNetTest.class.isInstance(diagnoseStateManager)) {
                str = "out_diago:";
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str6 = "-;";
            if (this.b.ip == null) {
                str2 = str6;
            } else {
                str2 = this.b.ip + ";";
            }
            sb.append(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sb.toString() + this.b.port + ";");
            if (z2) {
                str3 = "y;";
            } else {
                str3 = "n;";
            }
            sb2.append(str3);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2.toString() + "[" + this.e + "] ");
            String str7 = this.f;
            String str8 = "-";
            if (str7 == null) {
                str7 = str8;
            }
            sb3.append(str7);
            sb3.append(";");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            if (this.j == 1) {
                str4 = "ssl;";
            } else {
                str4 = "tcp;";
            }
            sb5.append(str4);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            if (this.l < 0) {
                str5 = str6;
            } else {
                str5 = NetworkDiagnoseUtil.nsToMs(this.l) + ";";
            }
            sb7.append(str5);
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            if (this.m >= 0) {
                str6 = NetworkDiagnoseUtil.nsToMs(this.m) + ";";
            }
            sb9.append(str6);
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            if (this.n >= 0) {
                str8 = String.valueOf(NetworkDiagnoseUtil.nsToMs(this.n) + ";");
            }
            sb11.append(str8);
            String str9 = sb11.toString() + String.valueOf(this.errCode);
            this.d.report(true, z2, false, str9);
            LogCatUtil.info(TAG, "[finish]" + str9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.Link.g():boolean");
    }

    public final boolean h(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        this.f = "302 redirect";
        if (str == null) {
            LogCatUtil.warn(TAG, "[checkRedirect] input is not null.");
            return false;
        }
        try {
            String trim = str.substring(str.indexOf("Location:") + 9).trim();
            if (trim.startsWith(h1p.HTTP_PREFIX)) {
                str2 = trim.substring(7);
            } else if (!trim.startsWith(h1p.HTTPS_PREFIX)) {
                return false;
            } else {
                str2 = trim.substring(8);
            }
            String substring = str2.substring(0, str2.indexOf("/"));
            StringBuilder sb = new StringBuilder("[checkData]redirect host:");
            sb.append(substring == null ? "host is null!" : substring);
            LogCatUtil.info(TAG, sb.toString());
            this.f += ", host: " + substring;
            if (substring.equals(this.b.ip)) {
                LogCatUtil.info(TAG, "[checkRedirect] redirect sucess.");
                return true;
            }
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[checkRedirect]" + th.toString());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.Link.j():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0170 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.lang.String r16, int r17) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.Link.i(java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.String r16, int r17) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.Link.e(java.lang.String, int):boolean");
    }

    public Link(String str, boolean z, DiagnoseStateManager diagnoseStateManager, Configuration.Address address) {
        this.errCode = -1;
        this.f4182a = null;
        this.b = null;
        this.e = null;
        this.f = "";
        this.i = false;
        this.j = 0;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.h = false;
        this.g = z;
        this.d = diagnoseStateManager;
        this.c = address;
        this.i = d(str);
    }
}
