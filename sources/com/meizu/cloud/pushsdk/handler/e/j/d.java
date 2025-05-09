package com.meizu.cloud.pushsdk.handler.e.j;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.f.b.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f5895a;
    private String b;
    private String c;
    private String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f5896a;
        private String b;
        private String c;
        private String d;

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public a c(String str) {
            this.b = str;
            return this;
        }

        public a d(String str) {
            this.f5896a = str;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public d() {
    }

    public static a a() {
        return new a();
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.f5895a;
    }

    public String f() {
        c cVar = new c();
        cVar.a("task_id", this.f5895a);
        cVar.a(PushConstants.SEQ_ID, this.b);
        cVar.a(PushConstants.PUSH_TIMESTAMP, this.c);
        cVar.a(PushConstants.DEVICE_ID, this.d);
        return cVar.toString();
    }

    public d(a aVar) {
        String str = "";
        this.f5895a = !TextUtils.isEmpty(aVar.f5896a) ? aVar.f5896a : str;
        this.b = !TextUtils.isEmpty(aVar.b) ? aVar.b : str;
        this.c = !TextUtils.isEmpty(aVar.c) ? aVar.c : str;
        this.d = !TextUtils.isEmpty(aVar.d) ? aVar.d : str;
    }
}
