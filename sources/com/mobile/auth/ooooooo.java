package com.mobile.auth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ooooooo {
    private int O000000o;
    private Map<String, List<String>> O00000Oo;
    private String O00000o0;

    public ooooooo(int i, Map<String, List<String>> map, String str) {
        this.O000000o = i;
        this.O00000Oo = map;
        this.O00000o0 = str;
    }

    public int O000000o() {
        return this.O000000o;
    }

    public Map<String, List<String>> O00000Oo() {
        Map<String, List<String>> map = this.O00000Oo;
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    public boolean O00000o() {
        int i = this.O000000o;
        if (i == 302 || i == 301) {
            return true;
        }
        return false;
    }

    public String O00000o0() {
        String str = this.O00000o0;
        if (str == null) {
            return "";
        }
        return str;
    }
}
