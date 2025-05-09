package tb;

import android.icu.text.DateFormat;
import android.icu.text.NumberFormat;
import android.os.Build;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.common.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sq2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String b(Long l, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c135762d", new Object[]{l, str});
        }
        try {
            return new SimpleDateFormat(str, new Locale(Localization.h().getLanguage())).format(new Date(l.longValue()));
        } catch (Exception unused) {
            return "时间戳" + l + "或格式串" + str + "不正确";
        }
    }

    public static String c(Long l, String str) {
        DateFormat dateInstance;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fef31ab", new Object[]{l, str});
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return java.text.DateFormat.getDateInstance(h(str), new Locale(Localization.h().getLanguage(), Localization.h().getCountry())).format(new Date(l.longValue()));
            }
            dateInstance = DateFormat.getDateInstance(h(str), new Locale(Localization.h().getLanguage(), Localization.h().getCountry()));
            format = dateInstance.format(new Date(l.longValue()));
            return format;
        } catch (Exception unused) {
            return "时间戳" + l + "或类型" + str + "不正确";
        }
    }

    public static String d(Long l, String str) {
        DateFormat dateTimeInstance;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8130de9e", new Object[]{l, str});
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return java.text.DateFormat.getDateTimeInstance(h(str), h(str), new Locale(Localization.h().getLanguage(), Localization.h().getCountry())).format(new Date(l.longValue()));
            }
            dateTimeInstance = DateFormat.getDateTimeInstance(h(str), h(str), new Locale(Localization.h().getLanguage(), Localization.h().getCountry()));
            format = dateTimeInstance.format(new Date(l.longValue()));
            return format;
        } catch (Exception unused) {
            return "时间戳" + l + "或类型" + str + "不正确";
        }
    }

    public static String e(double d) {
        NumberFormat numberInstance;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb53bb09", new Object[]{new Double(d)});
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return java.text.NumberFormat.getNumberInstance(new Locale(Localization.h().getLanguage(), Localization.h().getCountry())).format(d);
            }
            numberInstance = NumberFormat.getNumberInstance(new Locale(Localization.h().getLanguage(), Localization.h().getCountry()));
            format = numberInstance.format(d);
            return format;
        } catch (Exception unused) {
            return "数字" + d + "解析错误";
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98c2400f", new Object[]{str});
        }
        try {
            return e(Double.parseDouble(str));
        } catch (Exception unused) {
            return "数字" + str + "解析错误";
        }
    }

    public static String g(Long l, String str) {
        DateFormat timeInstance;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bba877ac", new Object[]{l, str});
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return java.text.DateFormat.getTimeInstance(h(str), new Locale(Localization.h().getLanguage(), Localization.h().getCountry())).format(new Date(l.longValue()));
            }
            timeInstance = DateFormat.getTimeInstance(h(str), new Locale(Localization.h().getLanguage(), Localization.h().getCountry()));
            format = timeInstance.format(new Date(l.longValue()));
            return format;
        } catch (Exception unused) {
            return "时间戳" + l + "或类型" + str + "不正确";
        }
    }

    public static int h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38a54e99", new Object[]{str})).intValue();
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 2169487:
                if (str.equals("FULL")) {
                    c = 0;
                    break;
                }
                break;
            case 2342524:
                if (str.equals("LONG")) {
                    c = 1;
                    break;
                }
                break;
            case 78875740:
                if (str.equals("SHORT")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 3;
            default:
                return 2;
        }
    }

    public static String a(Object[] objArr) {
        StringBuilder sb;
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be3a138d", new Object[]{objArr});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    try {
                        String obj = objArr[0].toString();
                        switch (obj.hashCode()) {
                            case -1349088399:
                                if (obj.equals("custom")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1034364087:
                                if (obj.equals("number")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3076014:
                                if (obj.equals("date")) {
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3560141:
                                if (obj.equals("time")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1793702779:
                                if (obj.equals(Constants.Value.DATETIME)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 0) {
                            if (c != 1) {
                                if (c != 2) {
                                    if (c != 3) {
                                        if (c != 4) {
                                            String str = "类型" + obj + "不支持";
                                            TLog.logi("CLDRFormat", "format cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                                            return str;
                                        } else if (objArr.length < 3) {
                                            sb = new StringBuilder("format cost ");
                                        } else {
                                            String b = b(Long.valueOf(Long.parseLong(objArr[1].toString())), objArr[2].toString());
                                            TLog.logi("CLDRFormat", "format cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                                            return b;
                                        }
                                    } else if (objArr.length < 2) {
                                        sb = new StringBuilder("format cost ");
                                    } else {
                                        String e = e(Double.parseDouble(objArr[1].toString()));
                                        TLog.logi("CLDRFormat", "format cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                                        return e;
                                    }
                                } else if (objArr.length < 3) {
                                    sb = new StringBuilder("format cost ");
                                } else {
                                    String d = d(Long.valueOf(Long.parseLong(objArr[1].toString())), objArr[2].toString());
                                    TLog.logi("CLDRFormat", "format cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                                    return d;
                                }
                            } else if (objArr.length < 3) {
                                sb = new StringBuilder("format cost ");
                            } else {
                                String g = g(Long.valueOf(Long.parseLong(objArr[1].toString())), objArr[2].toString());
                                TLog.logi("CLDRFormat", "format cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return g;
                            }
                        } else if (objArr.length < 3) {
                            sb = new StringBuilder("format cost ");
                        } else {
                            String c2 = c(Long.valueOf(Long.parseLong(objArr[1].toString())), objArr[2].toString());
                            TLog.logi("CLDRFormat", "format cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return c2;
                        }
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        sb.append("ms");
                        TLog.logi("CLDRFormat", sb.toString());
                        return "参数非法/必传参数缺失";
                    } catch (Exception e2) {
                        String obj2 = e2.toString();
                        TLog.logi("CLDRFormat", "format cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                        return obj2;
                    }
                }
            } catch (Throwable th) {
                TLog.logi("CLDRFormat", "format cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                throw th;
            }
        }
        return "参数非法/必传参数缺失";
    }
}
