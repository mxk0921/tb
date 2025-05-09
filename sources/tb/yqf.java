package tb;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final /* synthetic */ class yqf {
    public static byte[] a(String str) {
        if (str == null) {
            return new byte[]{-81};
        }
        k kVar = new k(new JSONWriter.a(JSONFactory.defaultObjectWriterProvider), null);
        try {
            kVar.k2(str);
            byte[] w = kVar.w();
            kVar.close();
            return w;
        } catch (Throwable th) {
            try {
                kVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String b(byte b) {
        if (b == 72) {
            return "INT32 " + Integer.toString(b);
        } else if (b != Byte.MAX_VALUE) {
            switch (b) {
                case -111:
                    return "BINARY " + Integer.toString(b);
                case -110:
                    return "TYPED_ANY " + Integer.toString(b);
                case -109:
                    return "REFERENCE " + Integer.toString(b);
                default:
                    switch (b) {
                        case -91:
                            return "OBJECT_END " + Integer.toString(b);
                        case -90:
                            return "OBJECT " + Integer.toString(b);
                        case -89:
                            return "LOCAL_TIME " + Integer.toString(b);
                        case -88:
                            return "LOCAL_DATETIME " + Integer.toString(b);
                        case -87:
                            return "LOCAL_DATE " + Integer.toString(b);
                        case -86:
                            return "TIMESTAMP_WITH_TIMEZONE " + Integer.toString(b);
                        case -85:
                            return "TIMESTAMP_MILLIS " + Integer.toString(b);
                        case -84:
                            return "TIMESTAMP_SECONDS " + Integer.toString(b);
                        case -83:
                            return "TIMESTAMP_MINUTES " + Integer.toString(b);
                        case -82:
                            return "TIMESTAMP " + Integer.toString(b);
                        case -81:
                            return "NULL " + Integer.toString(b);
                        case -80:
                            return "FALSE " + Integer.toString(b);
                        case -79:
                            return "TRUE " + Integer.toString(b);
                        case -78:
                        case -77:
                        case -76:
                        case -75:
                            return "DOUBLE " + Integer.toString(b);
                        case -74:
                        case -73:
                            return "FLOAT " + Integer.toString(b);
                        case -72:
                        case -71:
                            return "DECIMAL " + Integer.toString(b);
                        case -70:
                        case -69:
                            return "BIGINT " + Integer.toString(b);
                        case -68:
                            return "INT16 " + Integer.toString(b);
                        case -67:
                            return "INT8 " + Integer.toString(b);
                        case -66:
                        case -65:
                            return "INT64 " + Integer.toString(b);
                        default:
                            switch (b) {
                                case 122:
                                    return "STR_UTF8 " + Integer.toString(b);
                                case 123:
                                    return "STR_UTF16 " + Integer.toString(b);
                                case 124:
                                    return "STR_UTF16LE " + Integer.toString(b);
                                case 125:
                                    return "STR_UTF16BE " + Integer.toString(b);
                                default:
                                    if (b >= -108 && b <= -92) {
                                        return "ARRAY " + Integer.toString(b);
                                    } else if (b >= 73 && b <= 121) {
                                        return "STR_ASCII " + Integer.toString(b);
                                    } else if (b >= -16 && b <= 47) {
                                        return "INT32 " + Integer.toString(b);
                                    } else if (b >= 48 && b <= 63) {
                                        return "INT32 " + Integer.toString(b);
                                    } else if (b >= 64 && b <= 71) {
                                        return "INT32 " + Integer.toString(b);
                                    } else if (b >= -40 && b <= -17) {
                                        return "INT64 " + Integer.toString(b);
                                    } else if (b >= -56 && b <= -41) {
                                        return "INT64 " + Integer.toString(b);
                                    } else if (b < -64 || b > -57) {
                                        return Integer.toString(b);
                                    } else {
                                        return "INT64 " + Integer.toString(b);
                                    }
                            }
                    }
            }
        } else {
            return "SYMBOL " + Integer.toString(b);
        }
    }
}
