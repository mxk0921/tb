package com.alibaba.fastjson2;

import com.alibaba.fastjson2.e;
import java.util.ArrayList;
import tb.ls9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f2463a;
    public final JSONReader b;
    public final boolean c;

    public d(String str) {
        this.f2463a = str;
        JSONReader L1 = JSONReader.L1(str, c.h);
        this.b = L1;
        char c = L1.d;
        if (c == '-') {
            throw new JSONException("not support '-'");
        } else if (c == '$') {
            L1.t1();
            this.c = true;
        } else {
            this.c = false;
        }
    }

    public c a() {
        e eVar;
        JSONReader jSONReader = this.b;
        if (this.c && jSONReader.d == 26) {
            return c.f;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            char c = jSONReader.d;
            if (c == 26) {
                return new c(this.f2463a, arrayList, false, false);
            }
            if (c == '.') {
                jSONReader.t1();
                eVar = c();
            } else if (c == '[') {
                eVar = b();
            } else if ((c >= 'a' && c <= 'z') || ((c >= 'A' && c <= 'Z') || c == '_')) {
                eVar = c();
            } else if (c == '@') {
                jSONReader.t1();
                eVar = e.a.f2464a;
            } else {
                throw new JSONException("not support " + c);
            }
            arrayList.add(eVar);
        }
    }

    public final e b() {
        e eVar;
        JSONReader jSONReader = this.b;
        jSONReader.t1();
        char c = jSONReader.d;
        if (c == '\"' || c == '\'') {
            String Q2 = jSONReader.Q2();
            if (jSONReader.f0() == ']') {
                eVar = new g(Q2, ls9.a(Q2));
            } else if (jSONReader.l1()) {
                throw new JSONException("not support multi name");
            } else {
                throw new JSONException("TODO : " + jSONReader.f0());
            }
        } else if (c != '*') {
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    int p2 = jSONReader.p2();
                    if (jSONReader.d == ':') {
                        throw new JSONException("not support range index ':'");
                    } else if (!jSONReader.i1()) {
                        eVar = f.c(p2);
                        break;
                    } else {
                        throw new JSONException("not support");
                    }
                case ':':
                    throw new JSONException("not support range index ':'");
                default:
                    throw new JSONException("TODO : " + jSONReader.f0());
            }
        } else {
            throw new JSONException("not support *");
        }
        if (jSONReader.u1()) {
            return eVar;
        }
        throw new JSONException(jSONReader.a1("jsonpath syntax error"));
    }

    public final e c() {
        JSONReader jSONReader = this.b;
        char c = jSONReader.d;
        if (c == '*') {
            throw new JSONException("not support *");
        } else if (c != '.') {
            long i2 = jSONReader.i2();
            String L0 = jSONReader.L0();
            if (jSONReader.d != '(') {
                return new g(L0, i2);
            }
            throw new JSONException("not support jsonpath function");
        } else {
            throw new JSONException("not support jsonpath ..");
        }
    }
}
