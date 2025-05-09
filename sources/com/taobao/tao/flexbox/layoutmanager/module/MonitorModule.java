package com.taobao.tao.flexbox.layoutmanager.module;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MonitorModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317301);
        t2o.a(503316559);
    }

    public static void report(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74733dd8", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            o oVar = jVar.f11976a;
            l.e(oVar, (Map) json, oVar.d0());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r4.equals("success") == false) goto L_0x0036;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void apmTrace(com.taobao.tao.flexbox.layoutmanager.ac.d.j r8) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.flexbox.layoutmanager.module.MonitorModule.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "2022bca5"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            com.alibaba.fastjson.JSON r2 = r8.b
            boolean r3 = r2 instanceof com.alibaba.fastjson.JSONObject
            if (r3 == 0) goto L_0x007c
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            java.lang.String r3 = "taskName"
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r4 = "type"
            java.lang.String r4 = r2.getString(r4)
            r4.hashCode()
            java.lang.String r5 = "properties"
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case -1867169789: goto L_0x004f;
                case 3135262: goto L_0x0043;
                case 93616297: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r0 = -1
            goto L_0x0059
        L_0x0038:
            java.lang.String r0 = "begin"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x0036
        L_0x0041:
            r0 = 2
            goto L_0x0059
        L_0x0043:
            java.lang.String r0 = "fail"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0036
        L_0x004d:
            r0 = 1
            goto L_0x0059
        L_0x004f:
            java.lang.String r1 = "success"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0059
            goto L_0x0036
        L_0x0059:
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0063;
                case 2: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x007c
        L_0x005d:
            com.taobao.tao.flexbox.layoutmanager.core.o r8 = r8.f11976a
            tb.f21.h(r8, r3)
            goto L_0x007c
        L_0x0063:
            java.lang.String r0 = "errorType"
            java.lang.String r0 = r2.getString(r0)
            com.taobao.tao.flexbox.layoutmanager.core.o r8 = r8.f11976a
            com.alibaba.fastjson.JSONObject r1 = r2.getJSONObject(r5)
            tb.f21.k(r8, r3, r0, r1)
            goto L_0x007c
        L_0x0073:
            com.taobao.tao.flexbox.layoutmanager.core.o r8 = r8.f11976a
            com.alibaba.fastjson.JSONObject r0 = r2.getJSONObject(r5)
            tb.f21.n(r8, r3, r0)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.MonitorModule.apmTrace(com.taobao.tao.flexbox.layoutmanager.ac.d$j):void");
    }
}
