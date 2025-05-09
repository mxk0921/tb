package com.xiaomi.push;

import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bi {

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<a> f14780a = new LinkedList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final bi f14781a = new bi();

        /* renamed from: a  reason: collision with other field name */
        public int f767a;

        /* renamed from: a  reason: collision with other field name */
        public Object f768a;

        /* renamed from: a  reason: collision with other field name */
        public String f769a;

        public a(int i, Object obj) {
            this.f767a = i;
            this.f768a = obj;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized int m514a() {
        return this.f14780a.size();
    }

    public static bi a() {
        return a.f14781a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized LinkedList<a> m515a() {
        LinkedList<a> linkedList;
        linkedList = this.f14780a;
        this.f14780a = new LinkedList<>();
        return linkedList;
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m513a() {
        if (this.f14780a.size() > 100) {
            this.f14780a.removeFirst();
        }
    }

    public synchronized void a(Object obj) {
        this.f14780a.add(new a(0, obj));
        m513a();
    }
}
