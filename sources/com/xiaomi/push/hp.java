package com.xiaomi.push;

import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hf;
import com.xiaomi.push.hj;
import com.xiaomi.push.hl;
import com.xiaomi.push.service.bf;
import com.xiaomi.push.service.bo;
import com.xiaomi.push.service.l;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hp {

    /* renamed from: a  reason: collision with root package name */
    private static XmlPullParser f14934a;

    public static he a(String str, String str2, XmlPullParser xmlPullParser) {
        Object a2 = ho.a().m765a("all", "xm:chat");
        if (a2 == null || !(a2 instanceof l)) {
            return null;
        }
        return ((l) a2).b(xmlPullParser);
    }

    public static hf a(XmlPullParser xmlPullParser, gq gqVar) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        hf.a a2 = hf.a.a(xmlPullParser.getAttributeValue("", "type"));
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            hashMap.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        hf hfVar = null;
        hl hlVar = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    hlVar = m769a(xmlPullParser);
                } else {
                    hfVar = new hf();
                    hfVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (hfVar == null) {
            if (hf.a.f14924a == a2 || hf.a.b == a2) {
                hq hqVar = new hq();
                hqVar.k(attributeValue);
                hqVar.m(attributeValue3);
                hqVar.n(attributeValue2);
                hqVar.a(hf.a.d);
                hqVar.l(attributeValue4);
                hqVar.a(new hl(hl.a.e));
                gqVar.a(hqVar);
                b.d("iq usage error. send packet in packet parser.");
                return null;
            }
            hfVar = new hr();
        }
        hfVar.k(attributeValue);
        hfVar.m(attributeValue2);
        hfVar.l(attributeValue4);
        hfVar.n(attributeValue3);
        hfVar.a(a2);
        hfVar.a(hlVar);
        hfVar.a(hashMap);
        return hfVar;
    }

    private static String b(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || (MspGlobalDefine.LANG.equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static hh a(XmlPullParser xmlPullParser) {
        String str;
        boolean z = false;
        String str2 = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", "s"))) {
            String attributeValue = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "type");
            bf.b a2 = bf.a().a(attributeValue, attributeValue4);
            if (a2 == null) {
                a2 = bf.a().a(attributeValue, attributeValue3);
            }
            if (a2 != null) {
                hh hhVar = null;
                while (!z) {
                    int next = xmlPullParser.next();
                    if (next == 2) {
                        if (!"s".equals(xmlPullParser.getName())) {
                            throw new hb("error while receiving a encrypted message with wrong format");
                        } else if (xmlPullParser.next() == 4) {
                            String text = xmlPullParser.getText();
                            if ("5".equals(attributeValue) || "6".equals(attributeValue)) {
                                hg hgVar = new hg();
                                hgVar.l(attributeValue);
                                hgVar.b(true);
                                hgVar.n(attributeValue3);
                                hgVar.m(attributeValue4);
                                hgVar.k(attributeValue2);
                                hgVar.f(attributeValue5);
                                he heVar = new he("s", null, null, null);
                                heVar.m755a(text);
                                hgVar.a(heVar);
                                return hgVar;
                            }
                            a(bo.a(bo.a(a2.h, attributeValue2), text));
                            f14934a.next();
                            hhVar = a(f14934a);
                        } else {
                            throw new hb("error while receiving a encrypted message with wrong format");
                        }
                    } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                        z = true;
                    }
                }
                if (hhVar != null) {
                    return hhVar;
                }
                throw new hb("error while receiving a encrypted message with wrong format");
            }
            throw new hb("the channel id is wrong while receiving a encrypted message");
        }
        hg hgVar2 = new hg();
        String attributeValue6 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue6 == null) {
            attributeValue6 = "ID_NOT_AVAILABLE";
        }
        hgVar2.k(attributeValue6);
        hgVar2.m(xmlPullParser.getAttributeValue("", "to"));
        hgVar2.n(xmlPullParser.getAttributeValue("", "from"));
        hgVar2.l(xmlPullParser.getAttributeValue("", "chid"));
        hgVar2.a(xmlPullParser.getAttributeValue("", HiAnalyticsConstant.HaKey.BI_KEY_APPID));
        try {
            str = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            str = null;
        }
        try {
            String attributeValue7 = xmlPullParser.getAttributeValue("", y1r.COL_SEQ);
            if (!TextUtils.isEmpty(attributeValue7)) {
                hgVar2.b(attributeValue7);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                hgVar2.c(attributeValue8);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                hgVar2.d(attributeValue9);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue10)) {
                hgVar2.e(attributeValue10);
            }
        } catch (Exception unused5) {
        }
        hgVar2.a(!TextUtils.isEmpty(str) && str.equalsIgnoreCase("true"));
        hgVar2.f(xmlPullParser.getAttributeValue("", "type"));
        String b = b(xmlPullParser);
        if (b == null || "".equals(b.trim())) {
            hh.q();
        } else {
            hgVar2.j(b);
        }
        while (!z) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    b(xmlPullParser);
                    hgVar2.g(m770a(xmlPullParser));
                } else if (name.equals(AgooConstants.MESSAGE_BODY)) {
                    String attributeValue11 = xmlPullParser.getAttributeValue("", "encode");
                    String a3 = m770a(xmlPullParser);
                    if (!TextUtils.isEmpty(attributeValue11)) {
                        hgVar2.a(a3, attributeValue11);
                    } else {
                        hgVar2.h(a3);
                    }
                } else if (name.equals("thread")) {
                    if (str2 == null) {
                        str2 = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    hgVar2.a(m769a(xmlPullParser));
                } else {
                    hgVar2.a(a(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z = true;
            }
        }
        hgVar2.i(str2);
        return hgVar2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static hj m767a(XmlPullParser xmlPullParser) {
        hj.b bVar = hj.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVar = hj.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                System.err.println("Found invalid presence type ".concat(attributeValue));
            }
        }
        hj hjVar = new hj(bVar);
        hjVar.m(xmlPullParser.getAttributeValue("", "to"));
        hjVar.n(xmlPullParser.getAttributeValue("", "from"));
        hjVar.l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        hjVar.k(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    hjVar.a(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        hjVar.a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        hjVar.a(0);
                    }
                } else if (name.equals("show")) {
                    String nextText = xmlPullParser.nextText();
                    try {
                        hjVar.a(hj.a.valueOf(nextText));
                    } catch (IllegalArgumentException unused4) {
                        PrintStream printStream = System.err;
                        printStream.println("Found invalid presence mode " + nextText);
                    }
                } else if (name.equals("error")) {
                    hjVar.a(m769a(xmlPullParser));
                } else {
                    hjVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return hjVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static hk m768a(XmlPullParser xmlPullParser) {
        hk hkVar = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                hkVar = new hk(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z = true;
            }
        }
        return hkVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static hl m769a(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        String str = "-1";
        boolean z = false;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("code")) {
                str = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i).equals("type")) {
                str3 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i).equals("reason")) {
                str2 = xmlPullParser.getAttributeValue("", "reason");
            }
        }
        String str4 = null;
        String str5 = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    str5 = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str4 = name;
                    } else {
                        arrayList.add(a(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z = true;
                }
            } else if (next == 4) {
                str5 = xmlPullParser.getText();
            }
        }
        return new hl(Integer.parseInt(str), str3 == null ? "cancel" : str3, str2, str4, str5, arrayList);
    }

    /* renamed from: a  reason: collision with other method in class */
    private static String m770a(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    private static void a(byte[] bArr) {
        if (f14934a == null) {
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f14934a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
        f14934a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }
}
