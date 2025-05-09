package com.alibaba.fastjson.parser;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ThrowableDeserializer extends JavaBeanDeserializer {
    public ThrowableDeserializer(ParserConfig parserConfig, Class<?> cls) {
        super(parserConfig, cls, cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018d, code lost:
        if (r8 == null) goto L_0x01b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018f, code lost:
        r0 = r10.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019b, code lost:
        if (r0.hasNext() == false) goto L_0x01b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019d, code lost:
        r2 = (java.util.Map.Entry) r0.next();
        r2 = r2.getValue();
        r4 = r8.getFieldDeserializer((java.lang.String) r2.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b1, code lost:
        if (r4 == null) goto L_0x0197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b3, code lost:
        r4.setValue(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b7, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
        throw new com.alibaba.fastjson.JSONException("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (java.lang.Throwable.class.isAssignableFrom(r2) != false) goto L_0x0035;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
        if (r2 != null) goto L_0x00e2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
        r3 = (T) new java.lang.Exception(r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
        r3 = r2.getConstructors();
        r5 = r3.length;
        r11 = r9;
        r15 = r11;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00eb, code lost:
        if (r6 >= r5) goto L_0x013a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ed, code lost:
        r16 = r3[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f4, code lost:
        if (r16.getParameterTypes().length != 0) goto L_0x00fc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f6, code lost:
        r17 = r3;
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0101, code lost:
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
        if (r16.getParameterTypes().length != 1) goto L_0x0117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010f, code lost:
        if (r16.getParameterTypes()[0] != java.lang.String.class) goto L_0x0117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0111, code lost:
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011d, code lost:
        if (r16.getParameterTypes().length != 2) goto L_0x00fa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0126, code lost:
        if (r16.getParameterTypes()[0] != java.lang.String.class) goto L_0x00fa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012f, code lost:
        if (r16.getParameterTypes()[1] != java.lang.Throwable.class) goto L_0x00fa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0131, code lost:
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0134, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013a, code lost:
        if (r9 == null) goto L_0x014c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013c, code lost:
        r3 = (T) ((java.lang.Throwable) r9.newInstance(r13, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014c, code lost:
        if (r11 == null) goto L_0x015b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014e, code lost:
        r3 = (T) ((java.lang.Throwable) r11.newInstance(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015b, code lost:
        if (r15 == null) goto L_0x0167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015d, code lost:
        r3 = (T) ((java.lang.Throwable) r15.newInstance(new java.lang.Object[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0167, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0168, code lost:
        if (r3 != null) goto L_0x016f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016a, code lost:
        r3 = (T) new java.lang.Exception(r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016f, code lost:
        if (r14 == null) goto L_0x0174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0171, code lost:
        ((java.lang.Throwable) r3).setStackTrace(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0174, code lost:
        if (r10 == null) goto L_0x01b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0176, code lost:
        if (r2 == null) goto L_0x018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017a, code lost:
        if (r2 != r18.clazz) goto L_0x017e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017e, code lost:
        r0 = r19.config.getDeserializer(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
        if ((r0 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer) == false) goto L_0x018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
        r8 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018c, code lost:
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d6 A[SYNTHETIC] */
    @Override // com.alibaba.fastjson.parser.JavaBeanDeserializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r19, java.lang.reflect.Type r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.ThrowableDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}
