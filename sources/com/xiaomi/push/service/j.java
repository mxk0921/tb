package com.xiaomi.push.service;

import com.xiaomi.push.jb;
import com.xiaomi.push.r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static a f15116a;

    /* renamed from: a  reason: collision with other field name */
    private static b f1633a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a {
        boolean a(jb jbVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface b {
    }

    public static void a(b bVar) {
        f1633a = bVar;
    }

    public static boolean a(jb jbVar) {
        String str;
        if (f15116a == null || jbVar == null) {
            str = "rc params is null, not cpra";
        } else if (com.xiaomi.push.j.m869a(r.m963a())) {
            return f15116a.a(jbVar);
        } else {
            str = "rc app not permission to cpra";
        }
        com.xiaomi.channel.commonutils.logger.b.m410a(str);
        return false;
    }
}
