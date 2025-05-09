package com.vivo.push.f;

import com.vivo.push.b.t;
import com.vivo.push.m;
import com.vivo.push.util.u;
import com.vivo.push.v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class ab extends aa {
    public ab(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        t tVar = (t) vVar;
        ArrayList<String> d = tVar.d();
        List<String> e = tVar.e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i = tVar.i();
        u.c("OnSetTagsTask", "doTask,删除成功的标签 = " + d + " 删除失败的= " + e + " 错误码= " + i);
        String h = tVar.h();
        if (d != null) {
            for (String str : d) {
                if (str.startsWith("ali/")) {
                    arrayList2.add(str.replace("ali/", ""));
                } else if (str.startsWith("tag/")) {
                    arrayList.add(str.replace("tag/", ""));
                }
            }
        }
        if (e != null) {
            for (String str2 : e) {
                if (str2.startsWith("ali/")) {
                    arrayList4.add(str2.replace("ali/", ""));
                } else if (str2.startsWith("tag/")) {
                    arrayList3.add(str2.replace("tag/", ""));
                }
            }
        }
        if (arrayList.size() > 0 || arrayList3.size() > 0) {
            u.c("OnSetTagsTask", "doTask1,订阅成功的标签 = " + arrayList + " 订阅失败的标签= " + arrayList3 + " 错误码= " + i);
            if (arrayList.size() > 0) {
                m.a();
                m.a(arrayList);
            }
            m.a().a(tVar.h(), i);
            com.vivo.push.t.b(new ac(this, i, arrayList, arrayList3, h));
        }
        if (arrayList2.size() > 0 || arrayList4.size() > 0) {
            u.c("OnSetTagsTask", "doTask1,订阅成功的别名 = " + arrayList + " 订阅失败的别名= " + arrayList3 + " 错误码= " + i);
            if (arrayList2.size() > 0) {
                m.a().a((String) arrayList2.get(0));
            }
            m.a().a(tVar.h(), i);
            com.vivo.push.t.b(new ad(this, i, arrayList2, arrayList4, h));
        }
    }
}
