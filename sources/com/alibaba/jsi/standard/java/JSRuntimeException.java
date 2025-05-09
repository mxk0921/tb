package com.alibaba.jsi.standard.java;

import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JSRuntimeException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f2484a = Pattern.compile("^\\s*at ([^\\s]+) \\((.*):(\\d+):(\\d+)\\)$");
    private static final Pattern b = Pattern.compile("^\\s*at (.*):(\\d+):(\\d+)$");

    static {
        t2o.a(921698326);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public JSRuntimeException(tb.dqf r11, tb.kqf r12) {
        /*
            r10 = this;
            if (r12 != 0) goto L_0x0005
            java.lang.String r0 = ""
            goto L_0x0009
        L_0x0005:
            java.lang.String r0 = r12.b(r11)
        L_0x0009:
            r10.<init>(r0)
            if (r12 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r11 = r12.d(r11)
            r12.delete()
            if (r11 != 0) goto L_0x0019
            return
        L_0x0019:
            java.util.regex.Pattern r12 = com.alibaba.jsi.standard.java.JSRuntimeException.f2484a
            java.lang.String r0 = "jsc"
            java.lang.String r1 = tb.hqf.getEngineType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002e
            java.lang.String r12 = "^\\s*([^\\s]+)@(.*):(\\d+):(\\d+).*$"
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)
        L_0x002e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "\n"
            java.lang.String[] r11 = r11.split(r1)
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L_0x003c:
            if (r3 >= r1) goto L_0x008d
            r4 = r11[r3]
            java.util.regex.Matcher r5 = r12.matcher(r4)
            boolean r6 = r5.matches()
            r7 = 2
            java.lang.String r8 = "JS"
            r9 = 1
            if (r6 == 0) goto L_0x0068
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement
            java.lang.String r6 = r5.group(r9)
            java.lang.String r7 = r5.group(r7)
            r9 = 3
            java.lang.String r5 = r5.group(r9)
            int r5 = java.lang.Integer.parseInt(r5)
            r4.<init>(r8, r6, r7, r5)
            r0.add(r4)
            goto L_0x008a
        L_0x0068:
            java.util.regex.Pattern r5 = com.alibaba.jsi.standard.java.JSRuntimeException.b
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.matches()
            if (r5 == 0) goto L_0x008a
            java.lang.StackTraceElement r5 = new java.lang.StackTraceElement
            java.lang.String r6 = r4.group(r9)
            java.lang.String r4 = r4.group(r7)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r7 = "<anonymous>"
            r5.<init>(r8, r7, r6, r4)
            r0.add(r5)
        L_0x008a:
            int r3 = r3 + 1
            goto L_0x003c
        L_0x008d:
            java.lang.StackTraceElement[] r11 = r10.getStackTrace()
            java.util.List r11 = java.util.Arrays.asList(r11)
            r0.addAll(r11)
            java.lang.StackTraceElement[] r11 = new java.lang.StackTraceElement[r2]
            java.lang.Object[] r11 = r0.toArray(r11)
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            r10.setStackTrace(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.jsi.standard.java.JSRuntimeException.<init>(tb.dqf, tb.kqf):void");
    }
}
