package com.taobao.themis.open.packages.parser;

import android.taobao.windvane.jsbridge.api.WVFile;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alipay.android.msp.framework.okio.SegmentPool;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import tb.c7o;
import tb.hcs;
import tb.ias;
import tb.ict;
import tb.kct;
import tb.oct;
import tb.t2o;
import tb.vas;
import tb.znk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PackageParseUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LEGACY_TAR_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC2y61svV7Q0gmvxprTt6YX76rps8R+q+C+Qtkkk2+njIABsf10sHnl/5aQBh2s+kdo6YGlJrnKdxVso2JRzy+QbRBUgTdJmKfm5uGPdcqYuO0ur4b/QCyHTMoKJjBT8iI3hYIGhn0hACDao4xIsgzJ39grRKUa6120WbInlOLWSQIDAQAB";
    private static final String NEW_SIGN_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl96KRuzoQDgt3q3478MYKwTGDV0Fz5w+sKOfz+Ar+/XkwqLjVW7bAk+/nOD9Z4mnwM+BsgU/G5KGQ9WMjcXAow/eRBSf93iqcBX5+DdlkbneNyQP7Mvcy8EwOAa3y7AetEpTeYrv5cppFUjq4TVu9w+DwV1qegfvJEAA+6gFJEcJPxD9fxJggCF02tL3k9/WDnaNYVN3dCq8fN4jWZLr6KWlAX5UW5ZVtXP9IWObFnvRNjgXQhW/LzJLdbcDlQ5U6ImFyIFf//vn3vEhzlpU6EkxdGr+FWwsRiMTY9aZ1fJiFlgAZQpInV6cbDM8LgNGPtDsYUibIi3rVFtYtHAxQwIDAQAB";
    public static final String TAG = ":PackageParseUtils";

    static {
        t2o.a(843055299);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long fastReadTarIntoMemory(Map<String, c7o> map, String str, ParseContext parseContext) throws IOException {
        Throwable th;
        Throwable th2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7321e188", new Object[]{map, str, parseContext})).longValue();
        }
        long b = ias.b(str);
        oct octVar = null;
        if (!vas.e() || b > WVFile.FILE_MAX_SIZE || b < SegmentPool.MAX_SIZE) {
            try {
                oct octVar2 = new oct(new BufferedInputStream(new FileInputStream(str)));
                try {
                    readTarStreamIntoMemory(map, octVar2, parseContext);
                    vas.a(octVar2);
                } catch (Throwable th3) {
                    th = th3;
                    octVar = octVar2;
                    vas.a(octVar);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            byte[] c = vas.c(2048);
            try {
                kct kctVar = new kct(str);
                while (true) {
                    try {
                        ict w = kctVar.w();
                        if (w == null) {
                            break;
                        }
                        String a2 = w.a();
                        if (!w.c() && !TextUtils.isEmpty(a2) && !inBlackList(parseContext, a2)) {
                            hcs hcsVar = new hcs();
                            while (true) {
                                int read = kctVar.read(c);
                                if (read == -1) {
                                    break;
                                }
                                hcsVar.write(c, 0, read);
                            }
                            byte[] byteArray = hcsVar.toByteArray();
                            vas.a(hcsVar);
                            if (byteArray != null) {
                                putData(map, parseContext, a2, byteArray);
                            }
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        octVar = kctVar;
                        vas.h(c);
                        vas.a(octVar);
                        throw th2;
                    }
                }
                vas.h(c);
                vas.a(kctVar);
            } catch (Throwable th6) {
                th2 = th6;
            }
        }
        return b;
    }

    public static Map<String, c7o> getPreParsedPackage(ParseContext parseContext) throws ParseFailedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("58cb0eae", new Object[]{parseContext});
        }
        return null;
    }

    private static boolean inBlackList(ParseContext parseContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2205eb7", new Object[]{parseContext, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        List<Pattern> list = parseContext.ignorePatterns;
        if (list != null) {
            for (Pattern pattern : list) {
                if (pattern.matcher(str).matches()) {
                    return true;
                }
            }
        }
        if (TextUtils.equals(str, "CERT.json") || TextUtils.equals(str, "SIGN.json") || str.startsWith(RVConstants.PKG_EXT_PREFIX) || str.startsWith(RVConstants.SUB_PACKAGE_DIR_PREFIX) || str.contains("ios") || str.contains("hpmfile.json")) {
            return true;
        }
        return false;
    }

    public static Map<String, c7o> parsePackage(ParseContext parseContext) throws ParseFailedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b9eae2c3", new Object[]{parseContext}) : parsePackage(parseContext, false);
    }

    private static void putData(Map<String, c7o> map, ParseContext parseContext, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21472374", new Object[]{map, parseContext, str, bArr});
        } else {
            map.put(str, new znk(str, bArr));
        }
    }

    public static void readTarStreamIntoMemory(Map<String, c7o> map, oct octVar, ParseContext parseContext) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be334ae1", new Object[]{map, octVar, parseContext});
            return;
        }
        byte[] c = vas.c(2048);
        while (true) {
            try {
                ict g = octVar.g();
                if (g != null) {
                    String a2 = g.a();
                    if (!g.c() && !TextUtils.isEmpty(a2) && !inBlackList(parseContext, a2)) {
                        hcs hcsVar = new hcs();
                        while (true) {
                            int read = octVar.read(c);
                            if (read == -1) {
                                break;
                            }
                            hcsVar.write(c, 0, read);
                        }
                        byte[] byteArray = hcsVar.toByteArray();
                        vas.a(hcsVar);
                        if (byteArray != null) {
                            putData(map, parseContext, a2, byteArray);
                        }
                    }
                } else {
                    vas.h(c);
                    vas.a(octVar);
                    return;
                }
            } catch (Throwable th) {
                vas.h(c);
                vas.a(octVar);
                throw th;
            }
        }
    }

    public static Map<String, c7o> parsePackage(ParseContext parseContext, boolean z) throws ParseFailedException {
        Map<String, c7o> preParsedPackage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b228833b", new Object[]{parseContext, new Boolean(z)});
        }
        if (parseContext.packagePath == null) {
            throw new ParseFailedException(2, "PACKAGE_PATH_NULL");
        } else if (z || (preParsedPackage = getPreParsedPackage(parseContext)) == null) {
            System.currentTimeMillis();
            String str = parseContext.packagePath;
            if (str != null) {
                File file = new File(str);
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    throw new ParseFailedException(2, "OFFLINE_PATH_NOT_EXIST");
                }
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    file.lastModified();
                    file.setLastModified(currentTimeMillis);
                } catch (Throwable unused) {
                }
                String str2 = parseContext.mainFileName;
                if (str2 == null) {
                    str2 = parseContext.appId + ".tar";
                }
                String c = ias.c(parseContext.packagePath, str2);
                HashMap hashMap = new HashMap();
                try {
                    parseContext.mainTarSize = fastReadTarIntoMemory(hashMap, c, parseContext);
                    return hashMap;
                } catch (Throwable th) {
                    throw new ParseFailedException(7, "readIntoPackageException:" + th.getMessage());
                }
            } else {
                throw new ParseFailedException(1, "INVALID_PARAM packagePath is null, appId" + parseContext.appId);
            }
        } else {
            parseContext.fromCache = true;
            return preParsedPackage;
        }
    }
}
