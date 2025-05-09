package com.taobao.calendar.sdk.db.schedule;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class KeyValue {
    private Object key;
    private String value;

    static {
        t2o.a(414187589);
    }

    public KeyValue(Object obj, String str) {
        this.key = obj;
        this.value = str;
    }

    public Object getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(Object obj) {
        this.key = obj;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
