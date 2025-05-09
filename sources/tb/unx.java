package tb;

import android.util.ArrayMap;
import android.util.Xml;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class unx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        Object a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException;
    }

    static {
        t2o.a(407896108);
    }

    public static final void A(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73be7cae", new Object[]{obj, str, xmlSerializer});
        } else {
            B(obj, str, xmlSerializer, null);
        }
    }

    public static void B(Object obj, String str, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c125b", new Object[]{obj, str, xmlSerializer, bVar});
        } else if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, "null");
        } else if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else if (obj instanceof byte[]) {
                p((byte[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof int[]) {
                r((int[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof long[]) {
                t((long[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof double[]) {
                q((double[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof String[]) {
                z((String[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof boolean[]) {
                o((boolean[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Map) {
                v((Map) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof List) {
                s((List) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Set) {
                y((Set) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof CharSequence) {
                xmlSerializer.startTag(null, "string");
                if (str != null) {
                    xmlSerializer.attribute(null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, "string");
                return;
            } else if (bVar != null) {
                bVar.a(obj, str, xmlSerializer);
                return;
            } else {
                throw new RuntimeException("writeValueXml: unable to write value " + obj);
            }
            xmlSerializer.startTag(null, str2);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, "value", obj.toString());
            xmlSerializer.endTag(null, str2);
        }
    }

    public static final HashMap<String, ?> a(InputStream inputStream) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("551717de", new Object[]{inputStream});
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, StandardCharsets.UTF_8.name());
        return (HashMap) n(newPullParser, new String[1]);
    }

    public static final ArrayMap<String, ?> b(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("b613507f", new Object[]{xmlPullParser, str, strArr, aVar});
        }
        ArrayMap<String, ?> arrayMap = new ArrayMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayMap.put(strArr[0], m(xmlPullParser, strArr, aVar, true));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final byte[] d(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("877b20b3", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            byte[] bArr = new byte[0];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 4) {
                    if (parseInt > 0) {
                        String text = xmlPullParser.getText();
                        if (text == null || text.length() != parseInt * 2) {
                            throw new XmlPullParserException("Invalid value found in byte-array: " + text);
                        }
                        bArr = mva.a(text);
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return bArr;
                    }
                    throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused2) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static ArrayList g(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar, boolean z) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1c5ddc35", new Object[]{xmlPullParser, str, strArr, aVar, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(m(xmlPullParser, strArr, aVar, z));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final HashMap<String, ?> i(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a5a94592", new Object[]{xmlPullParser, str, strArr, aVar});
        }
        HashMap<String, ?> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashMap.put(strArr[0], m(xmlPullParser, strArr, aVar, false));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final Object j(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("56cd313e", new Object[]{xmlPullParser, str});
        }
        try {
            if (str.equals("int")) {
                return Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            }
            if (str.equals("long")) {
                return Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            }
            if (str.equals("float")) {
                return new Float(xmlPullParser.getAttributeValue(null, "value"));
            }
            if (str.equals("double")) {
                return new Double(xmlPullParser.getAttributeValue(null, "value"));
            }
            if (str.equals("boolean")) {
                return Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            }
            return null;
        } catch (NullPointerException unused) {
            throw new XmlPullParserException("Need value attribute in <" + str + ">");
        } catch (NumberFormatException unused2) {
            throw new XmlPullParserException("Not a number in value attribute in <" + str + ">");
        }
    }

    public static HashSet k(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar, boolean z) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("7db4c95c", new Object[]{xmlPullParser, str, strArr, aVar, new Boolean(z)});
        }
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(m(xmlPullParser, strArr, aVar, z));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final Object n(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("db620e80", new Object[]{xmlPullParser, strArr});
        }
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            } else if (eventType != 4) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            } else {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            }
        }
        return m(xmlPullParser, strArr, null, false);
    }

    public static final void p(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb12a359", new Object[]{bArr, str, xmlSerializer});
        } else if (bArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "byte-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(bArr.length));
            xmlSerializer.text(mva.f(bArr).toLowerCase());
            xmlSerializer.endTag(null, "byte-array");
        }
    }

    public static final void s(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e78ec18", new Object[]{list, str, xmlSerializer});
        } else if (list == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "list");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A(list.get(i), null, xmlSerializer);
            }
            xmlSerializer.endTag(null, "list");
        }
    }

    public static final void u(Map map, OutputStream outputStream) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63ea2f6", new Object[]{map, outputStream});
            return;
        }
        u19 u19Var = new u19();
        u19Var.setOutput(outputStream, StandardCharsets.UTF_8.name());
        u19Var.startDocument(null, Boolean.TRUE);
        u19Var.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        v(map, null, u19Var);
        u19Var.endDocument();
    }

    public static final void v(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8df8bea", new Object[]{map, str, xmlSerializer});
        } else {
            w(map, str, xmlSerializer, null);
        }
    }

    public static final void w(Map map, String str, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8278ca9f", new Object[]{map, str, xmlSerializer, bVar});
        } else if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "map");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            x(map, xmlSerializer, bVar);
            xmlSerializer.endTag(null, "map");
        }
    }

    public static final void x(Map map, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705c4a9", new Object[]{map, xmlSerializer, bVar});
        } else if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                B(entry.getValue(), (String) entry.getKey(), xmlSerializer, bVar);
            }
        }
    }

    public static final void y(Set set, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f2bdaa", new Object[]{set, str, xmlSerializer});
        } else if (set == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "set");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            for (Object obj : set) {
                A(obj, null, xmlSerializer);
            }
            xmlSerializer.endTag(null, "set");
        }
    }

    public static final void o(boolean[] zArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d55a3b3", new Object[]{zArr, str, xmlSerializer});
        } else if (zArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "boolean-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(zArr.length));
            for (boolean z : zArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", Boolean.toString(z));
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "boolean-array");
        }
    }

    public static final void q(double[] dArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87383c24", new Object[]{dArr, str, xmlSerializer});
        } else if (dArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "double-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(dArr.length));
            for (double d : dArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", Double.toString(d));
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "double-array");
        }
    }

    public static final void r(int[] iArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa283be9", new Object[]{iArr, str, xmlSerializer});
        } else if (iArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "int-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(iArr.length));
            for (int i : iArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", Integer.toString(i));
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "int-array");
        }
    }

    public static final void t(long[] jArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a523d5", new Object[]{jArr, str, xmlSerializer});
        } else if (jArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "long-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(jArr.length));
            for (long j : jArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", Long.toString(j));
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "long-array");
        }
    }

    public static final void z(String[] strArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3fa7970", new Object[]{strArr, str, xmlSerializer});
        } else if (strArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "string-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(strArr.length));
            for (String str2 : strArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", str2);
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "string-array");
        }
    }

    public static final boolean[] c(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("d5b6c083", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            boolean[] zArr = new boolean[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            zArr[i] = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return zArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in string-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
    }

    public static final double[] e(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("7451b47e", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            double[] dArr = new double[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            dArr[i] = Double.parseDouble(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return dArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in double-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in double-array");
        }
    }

    public static final int[] f(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9b06ac39", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            int[] iArr = new int[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in int-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in int-array");
        }
    }

    public static final long[] h(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("75687e2f", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            long[] jArr = new long[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            jArr[i] = Long.parseLong(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return jArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in long-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in long-array");
        }
    }

    public static final String[] l(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("af7795d0", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            String[] strArr2 = new String[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            strArr2[i] = xmlPullParser.getAttributeValue(null, "value");
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return strArr2;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in string-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
    }

    public static Object m(XmlPullParser xmlPullParser, String[] strArr, a aVar, boolean z) throws XmlPullParserException, IOException {
        int next;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ae89fd6c", new Object[]{xmlPullParser, strArr, aVar, new Boolean(z)});
        }
        Object obj2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    } else if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else {
                obj2 = j(xmlPullParser, name);
                if (obj2 == null) {
                    if (name.equals("byte-array")) {
                        byte[] d = d(xmlPullParser, "byte-array", strArr);
                        strArr[0] = attributeValue;
                        return d;
                    } else if (name.equals("int-array")) {
                        int[] f = f(xmlPullParser, "int-array", strArr);
                        strArr[0] = attributeValue;
                        return f;
                    } else if (name.equals("long-array")) {
                        long[] h = h(xmlPullParser, "long-array", strArr);
                        strArr[0] = attributeValue;
                        return h;
                    } else if (name.equals("double-array")) {
                        double[] e = e(xmlPullParser, "double-array", strArr);
                        strArr[0] = attributeValue;
                        return e;
                    } else if (name.equals("string-array")) {
                        String[] l = l(xmlPullParser, "string-array", strArr);
                        strArr[0] = attributeValue;
                        return l;
                    } else if (name.equals("boolean-array")) {
                        boolean[] c = c(xmlPullParser, "boolean-array", strArr);
                        strArr[0] = attributeValue;
                        return c;
                    } else if (name.equals("map")) {
                        xmlPullParser.next();
                        if (z) {
                            obj = b(xmlPullParser, "map", strArr, aVar);
                        } else {
                            obj = i(xmlPullParser, "map", strArr, aVar);
                        }
                        strArr[0] = attributeValue;
                        return obj;
                    } else if (name.equals("list")) {
                        xmlPullParser.next();
                        ArrayList g = g(xmlPullParser, "list", strArr, aVar, z);
                        strArr[0] = attributeValue;
                        return g;
                    } else if (name.equals("set")) {
                        xmlPullParser.next();
                        HashSet k = k(xmlPullParser, "set", strArr, aVar, z);
                        strArr[0] = attributeValue;
                        return k;
                    } else if (aVar != null) {
                        Object a2 = aVar.a(xmlPullParser, name);
                        strArr[0] = attributeValue;
                        return a2;
                    } else {
                        throw new XmlPullParserException("Unknown tag: ".concat(name));
                    }
                }
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj2;
                }
                throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            } else if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }
}
