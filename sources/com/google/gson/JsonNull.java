package com.google.gson;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class JsonNull extends JsonElement {
    public static final JsonNull INSTANCE = new JsonNull();

    public boolean equals(Object obj) {
        if (this == obj || (obj instanceof JsonNull)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return JsonNull.class.hashCode();
    }

    @Override // com.google.gson.JsonElement
    public JsonNull deepCopy() {
        return INSTANCE;
    }
}
