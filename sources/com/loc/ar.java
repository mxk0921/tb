package com.loc;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.security.realidentity.m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ar {

    /* renamed from: a  reason: collision with root package name */
    private static volatile aq f5570a;
    private static Properties b = b();

    private ar() {
    }

    public static aq a() {
        if (f5570a == null) {
            synchronized (ar.class) {
                try {
                    if (f5570a == null) {
                        try {
                            aq a2 = a(Build.MANUFACTURER);
                            if ("".equals(a2.a())) {
                                Iterator it = Arrays.asList(aq.MIUI.a(), aq.Flyme.a(), aq.EMUI.a(), aq.ColorOS.a(), aq.FuntouchOS.a(), aq.SmartisanOS.a(), aq.AmigoOS.a(), aq.Sense.a(), aq.LG.a(), aq.Google.a(), aq.NubiaUI.a()).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        a2 = aq.Other;
                                        break;
                                    }
                                    aq a3 = a((String) it.next());
                                    if (!"".equals(a3.a())) {
                                        a2 = a3;
                                        break;
                                    }
                                }
                            }
                            f5570a = a2;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5570a;
    }

    private static String b(String str) {
        Properties properties = b;
        String property = properties.getProperty("[" + str + "]", null);
        return TextUtils.isEmpty(property) ? c(str) : property.replace("[", "").replace("]", "");
    }

    private static String c(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str))).getInputStream()), 1024);
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            return readLine;
        } catch (IOException unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    private static boolean d(aq aqVar) {
        String b2 = b(m.y);
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static boolean e(aq aqVar) {
        String b2 = b(m.w);
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static boolean f(aq aqVar) {
        String b2 = b("ro.smartisan.version");
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static boolean g(aq aqVar) {
        String b2 = b("ro.build.display.id");
        if (TextUtils.isEmpty(b2) || !b2.matches("amigo([\\d.]+)[a-zA-Z]*")) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static boolean h(aq aqVar) {
        String b2 = b(m.z);
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static boolean i(aq aqVar) {
        String b2 = b("ro.build.sense.version");
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static boolean j(aq aqVar) {
        String b2 = b("sys.lge.lgmdm_version");
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static boolean k(aq aqVar) {
        if (!"android-google".equals(b("ro.com.google.clientidbase"))) {
            return false;
        }
        String b2 = b("ro.build.version.release");
        aqVar.a(Build.VERSION.SDK_INT);
        aqVar.b(b2);
        return true;
    }

    private static boolean l(aq aqVar) {
        String b2 = b("ro.build.nubia.rom.code");
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static aq a(String str) {
        if (str == null || str.length() <= 0) {
            return aq.Other;
        }
        aq aqVar = aq.MIUI;
        if (!str.equals(aqVar.a())) {
            aq aqVar2 = aq.Flyme;
            if (!str.equals(aqVar2.a())) {
                aq aqVar3 = aq.EMUI;
                if (!str.equals(aqVar3.a())) {
                    aq aqVar4 = aq.ColorOS;
                    if (!str.equals(aqVar4.a())) {
                        aq aqVar5 = aq.FuntouchOS;
                        if (!str.equals(aqVar5.a())) {
                            aq aqVar6 = aq.SmartisanOS;
                            if (!str.equals(aqVar6.a())) {
                                aq aqVar7 = aq.AmigoOS;
                                if (!str.equals(aqVar7.a())) {
                                    aq aqVar8 = aq.EUI;
                                    if (!str.equals(aqVar8.a())) {
                                        aq aqVar9 = aq.Sense;
                                        if (!str.equals(aqVar9.a())) {
                                            aq aqVar10 = aq.LG;
                                            if (!str.equals(aqVar10.a())) {
                                                aq aqVar11 = aq.Google;
                                                if (!str.equals(aqVar11.a())) {
                                                    aq aqVar12 = aq.NubiaUI;
                                                    if (str.equals(aqVar12.a()) && l(aqVar12)) {
                                                        return aqVar12;
                                                    }
                                                } else if (k(aqVar11)) {
                                                    return aqVar11;
                                                }
                                            } else if (j(aqVar10)) {
                                                return aqVar10;
                                            }
                                        } else if (i(aqVar9)) {
                                            return aqVar9;
                                        }
                                    } else if (h(aqVar8)) {
                                        return aqVar8;
                                    }
                                } else if (g(aqVar7)) {
                                    return aqVar7;
                                }
                            } else if (f(aqVar6)) {
                                return aqVar6;
                            }
                        } else if (e(aqVar5)) {
                            return aqVar5;
                        }
                    } else if (d(aqVar4)) {
                        return aqVar4;
                    }
                } else if (c(aqVar3)) {
                    return aqVar3;
                }
            } else if (b(aqVar2)) {
                return aqVar2;
            }
        } else if (a(aqVar)) {
            return aqVar;
        }
        return aq.Other;
    }

    private static Properties b() {
        Properties properties = new Properties();
        try {
            properties.load(Runtime.getRuntime().exec("getprop").getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    private static boolean c(aq aqVar) {
        String b2 = b(m.v);
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }

    private static void a(aq aqVar, String str) {
        Matcher matcher = Pattern.compile("([\\d.]+)[^\\d]*").matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                aqVar.a(group);
                aqVar.a(Integer.parseInt(group.split("\\.")[0]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean b(aq aqVar) {
        String b2 = b("ro.flyme.published");
        String b3 = b("ro.meizu.setupwizard.flyme");
        if (TextUtils.isEmpty(b2) && TextUtils.isEmpty(b3)) {
            return false;
        }
        String b4 = b("ro.build.display.id");
        a(aqVar, b4);
        aqVar.b(b4);
        return true;
    }

    private static boolean a(aq aqVar) {
        if (TextUtils.isEmpty(b("ro.miui.ui.version.name"))) {
            return false;
        }
        String b2 = b(m.x);
        a(aqVar, b2);
        aqVar.b(b2);
        return true;
    }
}
